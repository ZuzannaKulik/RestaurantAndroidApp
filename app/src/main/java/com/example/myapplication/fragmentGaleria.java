package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;


public class fragmentGaleria extends Fragment implements View.OnClickListener {

    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_galeria, container, false);

        LinearLayout linearLayout = view.findViewById(R.id.LineryLout);
        imageView = view.findViewById(R.id.imageView);
        for(int i=0;i<6;i++){
            ImageView locaView = new ImageView(view.getContext());
            locaView.setLayoutParams(new ViewGroup.LayoutParams(200,200));
            locaView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int resID = getResources().getIdentifier("kuchnia"+i,"drawable",view.getContext().getPackageName());
            locaView.setImageResource(resID);
            locaView.setOnClickListener(this);
            linearLayout.addView(locaView);
        }
        this.imageView.setImageDrawable(getResources().getDrawable(R.drawable.kuchnia0));

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View v) {
        ImageView localView =(ImageView) v;
        this.imageView.setImageDrawable(localView.getDrawable());
    }
}
