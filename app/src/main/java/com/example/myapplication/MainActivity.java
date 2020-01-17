package com.example.myapplication;

import android.os.Bundle;
import android.view.MenuItem;


import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {

    private DrawerLayout mlayaut;
   // private ActionBarDrawerToggle mtoggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mlayaut = (DrawerLayout) findViewById(R.id.main_activity);
        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle mtoggle = new ActionBarDrawerToggle(this, mlayaut, toolbar, R.string.open, R.string.close);
        mlayaut.addDrawerListener(mtoggle);
        mtoggle.syncState();


        if (savedInstanceState == null){
                getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container, new fragment_informacje()).commit();
                navigationView.setCheckedItem(R.id.informacje);
            }

    }


    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.glowna:
                getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container,new fragmentGlowna()).commit();
            break;
            case R.id.menu:
                getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container,new fragmentMenu()).commit();
                break;
            case R.id.galeria:
                getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container,new fragmentGaleria()).commit();
                break;
            case R.id.kontakt:
                getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container,new fragmentKontakt()).commit();
                break;
            case R.id.informacje:
                getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container,new fragment_informacje()).commit();
                break;
        }
        mlayaut.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed(){
        if(mlayaut.isDrawerOpen(GravityCompat.START)){
            mlayaut.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

}


