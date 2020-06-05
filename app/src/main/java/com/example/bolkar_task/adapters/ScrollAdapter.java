package com.example.bolkar_task.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bolkar_task.R;
import com.example.bolkar_task.dataHolder.Data;
import com.example.bolkar_task.viewHolder.ScrollViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ScrollAdapter extends RecyclerView.Adapter<ScrollViewHolder> {
    @NonNull
    List<Data> data;
    Context context;
    LayoutInflater inflater;

    public ScrollAdapter(@NonNull List<Data> data, Context context) {
        this.data = data;
        this.context = context;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    public ScrollViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.unique_card, parent, false);
        ScrollViewHolder scrollViewHolder=new ScrollViewHolder(view);
        return scrollViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ScrollViewHolder holder, int position) {
        holder.textView.setText(data.get(position).getT());

        Picasso.get().load(data.get(position).getPF()).resize(350,400).centerCrop().into(holder.i1);
        holder.i2.setMaxWidth(350);
        holder.i2.setMaxWidth(400);
        //Picasso.get().load("https://bolkar.s3.ap-south-1.amazonaws.com/demo/play_new.webp").resize(350,400).centerCrop().into(holder.i2);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
