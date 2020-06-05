package com.example.bolkar_task.viewHolder;

import android.view.View;
import android.widget.TextView;

import com.example.bolkar_task.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public RecyclerView recyclerView;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.t_view);
        recyclerView = itemView.findViewById(R.id.r_view);



    }
}
