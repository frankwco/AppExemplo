package com.example.frank.appexemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listViewTimes;
    AdapterTimes adapterTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Times> listaTimes = new ArrayList<>();
        listaTimes.add(new Times(1L, "Palmeiras", "São Paulo", R.drawable.palmeiras));
        listaTimes.add(new Times(1L, "Gremio", "Porto Alegre", R.drawable.gremio));

        listViewTimes = (ListView) findViewById(R.id.listaTimes);

        adapterTimes = new AdapterTimes(this, listaTimes);
        String times[] = {"Palmeiras", "Flamengo"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , times);

        listViewTimes.setAdapter(adapterTimes);
        listViewTimes.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(this, ""+adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, ""+adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MostrarTime.class);
        intent.putExtra("time",((Times) adapterView.getItemAtPosition(i)).getNome());
        startActivity(intent);
    }
}
