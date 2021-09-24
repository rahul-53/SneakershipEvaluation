package com.example.sneakershipevaluation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SneakerAdapter extends RecyclerView.Adapter<SneakerViewHolder> {

    private ArrayList<ResponseDTO> responseList;

    public SneakerAdapter(ArrayList<ResponseDTO> responseList){
        this.responseList= responseList;
    }

    @NonNull
    @Override
    public SneakerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new SneakerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SneakerViewHolder holder, int position) {
        holder.setData(responseList.get(position));

    }

    @Override
    public int getItemCount() {
        return responseList.size();
    }
}
