package com.example.bolkar_task;

import android.os.Bundle;
import android.view.View;

import com.example.bolkar_task.adapters.MainAdapter;
import com.example.bolkar_task.dataHolder.AllDataClass;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.mainRV)
    RecyclerView mainRV;
    List<AllDataClass> classList;
    MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ApiServiceProvider apiServiceProvider = ApiClientProvider.getApiClientService();
        Call<List<AllDataClass>> call = apiServiceProvider.getAllData();
        call.enqueue(new Callback<List<AllDataClass>>() {
            @Override
            public void onResponse(Call<List<AllDataClass>> call, Response<List<AllDataClass>> response) {
                if (response.body() != null) {
                    classList = response.body();
                    mainAdapter.update(classList);
                }
            }

            @Override
            public void onFailure(Call<List<AllDataClass>> call, Throwable t) {

            }
        });

        mainAdapter = new MainAdapter(classList,this);
        //(new LinearSnapHelper()).attachToRecyclerView(mainRV);


        mainRV.setAdapter(mainAdapter);
        mainRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));



    }

    static
    class ViewHolder {
        @BindView(R.id.mainRV)
        RecyclerView mainRV;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
