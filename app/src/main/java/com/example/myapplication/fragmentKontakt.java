package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class fragmentKontakt extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_fragment_kontakt, container, false);
        TextView numbertext = view.findViewById(R.id.textnumbercall);
        Button buttonCall = (Button) view.findViewById(R.id.callbutton);
        Button buttonMap = (Button) view.findViewById(R.id.mapbutton);

        //Performing action on button click
        buttonCall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //String number = ((TextView) (arg0.findViewById(R.id.textnumbercall))).getText().toString();
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+48 530 255 555"));

//                if (ActivityCompat.checkSelfPermission(arg0.getContext(),
//                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    startActivity(callIntent);
//                }
                startActivity(callIntent);

            }
            // Inflate the layout for this fragment
        });

        buttonMap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Uri gmmIntentUri = Uri.parse("geo:51.777321, 19.454375");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
            // Inflate the layout for this fragment
        });

        return view;
    }
}
