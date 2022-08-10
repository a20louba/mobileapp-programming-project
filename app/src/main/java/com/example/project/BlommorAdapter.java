package com.example.project;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class BlommorAdapter extends RecyclerView.Adapter<BlommorViewHolder>{

    private List<Blomma> blomma = new ArrayList();

    @NonNull
    @Override
    public BlommorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new BlommorViewHolder((LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_holder, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull BlommorViewHolder holder, int position) {
        Blomma blomma = this.blomma.get(position);

        holder.name.setText(blomma.getName());
        holder.colour.setText(blomma.getColour());
        holder.area.setText("Typ: " + blomma.getArea());
        holder.auxdata.setText(blomma.getAuxdata());
    }

    @Override
    public int getItemCount() {
        return blomma.size();
    }

    public void setBlommor(List<Blomma> blomma) {
        this.blomma = blomma;
    }

}
