package com.example.frank.appexemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MostrarTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_time);
        DisplayMetrics metrics = new DisplayMetrics();
        int density = metrics.densityDpi;
        Toast.makeText(this, ""+density+"- "+DisplayMetrics.DENSITY_MEDIUM, Toast.LENGTH_SHORT).show();


        Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();
        if(bundle.containsKey("time")){
            TextView nome = (TextView) findViewById(R.id.nomeTime);
            nome.setText(bundle.get("time").toString());
        }
    }
}
