package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class fragmentMenu extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_menu, container, false);
        GridLayout mainGrid;
        mainGrid = (GridLayout) view.findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
        // Inflate the layout for this fragment
        return view;
    }

   // GridLayout mainGrid;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
//
//        //Set Event
//        setSingleEvent(mainGrid);
//        //setToggleEvent(mainGrid);
//    }

//    private void setToggleEvent(GridLayout mainGrid) {
//        //Loop all child item of Main Grid
//        for (int i = 0; i < mainGrid.getChildCount(); i++) {
//            //You can see , all child item is CardView , so we just cast object to CardView
//            final CardView cardView = (CardView) mainGrid.getChildAt(i);
//            cardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
//                        //Change background color
//                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
//                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();
//
//                    } else {
//                        //Change background color
//                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
//                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//        }
//    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnHoverListener(new View.OnHoverListener(){
                @Override
                public boolean onHover(View v, MotionEvent event) {
                    v.setBackgroundColor(2);
                    return false;
                }});
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    switch (view.getId()) {
                        case R.id.przystawkiCard:
                            ((MainActivity) view.getContext()).getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container, new fragmentStartery()).commit();
                            break;
                        case R.id.salatkiCard:
                            ((MainActivity) view.getContext()).getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container, new fragmentSalatki()).commit();
                            break;
                        case R.id.zupyCard:
                            ((MainActivity) view.getContext()).getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container, new fragmentZupy()).commit();
                            break;
                        case R.id.rybyCard:
                            ((MainActivity) view.getContext()).getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container, new fragmentRyby()).commit();
                            break;
                        case R.id.daniaglowneCard:
                            ((MainActivity) view.getContext()).getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container, new fragmentDaniaglowne()).commit();
                            break;
                        case R.id.deseryCard:
                            ((MainActivity) view.getContext()).getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container, new fragmentDesery()).commit();
                            break;
                    }
                }
            });
        }
    }

}
