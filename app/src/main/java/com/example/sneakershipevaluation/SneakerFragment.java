package com.example.sneakershipevaluation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SneakerFragment extends Fragment {

private ArrayList<SizesDTO> sizesDTOArrayList;
private ArrayList<ColoursDTO> coloursDTOArrayList;
private  ArrayList<ResponseDTO> responseDTOList;
private RecyclerView recyclerView;
private ArrayList<MediaDTO>mediaDTOArrayList;
private SneakerAdapter sneakerAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sneaker, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);

        setRecyclerView();
        callApi();

    }

    private void callApi() {
        ApiService apiService = Network.getInstance().create(ApiService.class);
        apiService.getSneakers().enqueue(new Callback<ResponseDTO>() {
            @Override
            public void onResponse(Call<ResponseDTO> call, Response<ResponseDTO> response) {

                    sizesDTOArrayList.addAll(response.body().getSizes());
                    coloursDTOArrayList.addAll(response.body().getColours());

            }
            @Override
            public void onFailure(Call<ResponseDTO> call, Throwable t) {

            }
        });
    }
    private void setRecyclerView(){
        sneakerAdapter = new SneakerAdapter(responseDTOList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(sneakerAdapter);

    }
}