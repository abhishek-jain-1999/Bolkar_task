package com.example.bolkar_task.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bolkar_task.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ScrollViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public ImageView i1,i2;
    public ScrollViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.t_view);
        i1=itemView.findViewById(R.id.i_view);
        i2=itemView.findViewById(R.id.o_view);
    }
}
