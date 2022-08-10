package com.example.project;

import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

public class BlommorViewHolder extends RecyclerView.ViewHolder{

    public TextView name;
    public TextView colour;
    public TextView area;
    public TextView auxdata;

    public BlommorViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name);
        colour = itemView.findViewById(R.id.colour);
        area = itemView.findViewById(R.id.area);
        auxdata = itemView.findViewById(R.id.auxdata);
    }
}
