package com.oyelabs.marvel.universe.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.oyelabs.marvel.universe.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView displayImage;
    public TextView displayName,displayDetails;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        displayImage=itemView.findViewById(R.id.characterImage);
        displayName=itemView.findViewById(R.id.charactersName);
        displayDetails=itemView.findViewById(R.id.characterDetails);



    }
}
