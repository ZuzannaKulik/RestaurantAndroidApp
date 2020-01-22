package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

import androidx.fragment.app.Fragment;



public class fragmentGlowna extends Fragment {

    Animation fade_in, fade_out;
    ViewFlipper viewFlipper;
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_glowna, container, false);
        LinearLayout linearLayout = view.findViewById(R.id.LineryLout);
        imageView = view.findViewById(R.id.imageView);
        viewFlipper = (ViewFlipper) view.findViewById(R.id.bckgrndViewFlipper1);

        fade_in = AnimationUtils.loadAnimation(inflater.getContext(),
                android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(inflater.getContext(),
                android.R.anim.fade_out);

        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);

        //sets auto flipping
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(2500);
        viewFlipper.startFlipping();
        // Inflate the layout for this fragment
        return view;
    }

}



