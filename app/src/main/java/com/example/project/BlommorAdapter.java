package com.example.project;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class BlommorAdapter extends RecyclerView.Adapter<BlommorViewHolder>{

    private List<Blommor> blommor = new ArrayList();

    @NonNull
    @Override
    public BlommorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new BlommorViewHolder((LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_holder, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull BlommorViewHolder holder, int position) {
        Blommor blommor = blommor.get(position);

        holder.name.setText(blommor.getName());
        holder.colour.setText(blommor.getColour());
        holder.area.setText("Typ: " + blommor.getArea());
        holder.auxdata.setText(blommor.getAuxdata());
    }

    @Override
    public int getItemCount() {
        return blommor.size();
    }

    public void setBlommor(List<Blommor> wonders) {
        this.blommor = wonders;
    }

}
