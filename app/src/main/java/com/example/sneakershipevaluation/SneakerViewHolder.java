package com.example.sneakershipevaluation;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class SneakerViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvSneakerImg;
    private TextView mTvName;
    private TextView mTvPrice;

    public SneakerViewHolder(@NonNull View itemView) {
        super(itemView);
        mIvSneakerImg = itemView.findViewById(R.id.ivSneaker);
        mTvName = itemView.findViewById(R.id.tvSneakerName);
        mTvPrice = itemView.findViewById(R.id.tvPrice);
    }

    public void setData(ResponseDTO responseDTO){
        if (responseDTO.getName()!=null){
            mTvName.setText(responseDTO.getId());
            mTvPrice.setText(responseDTO.getRetailPrice());

    }




    }
}
