package com.example.bolkar_task.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bolkar_task.R;
import com.example.bolkar_task.dataHolder.AllDataClass;
import com.example.bolkar_task.viewHolder.MainViewHolder;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {
    @NonNull

    List<AllDataClass> allDataClass;
    Context context;
    LayoutInflater inflater;

    public MainAdapter(@NonNull List<AllDataClass> allDataClass,Context context) {
        this.allDataClass = allDataClass;
        this.context=context;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.head_and_rv, parent, false);
        MainViewHolder mainViewHolder= new MainViewHolder(view);


        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MainViewHolder mainViewHolder, int position) {
        AllDataClass aData= allDataClass.get(position) ;
        mainViewHolder.textView.setText(aData.getTitle());

        ScrollAdapter adapter = new ScrollAdapter(allDataClass.get(position).getData(),context);
        //(new LinearSnapHelper()).attachToRecyclerView(mainViewHolder.recyclerView);


        mainViewHolder.recyclerView.setAdapter(adapter);
        mainViewHolder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));

        //mainViewHolder.recyclerView

    }
    public void update(List<AllDataClass> allDataClass){
        this.allDataClass=allDataClass;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if(allDataClass==null){
            return 0;
        }
        return allDataClass.size();
    }
}
