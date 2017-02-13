package com.example.sridevi.customgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.sridevi.customgridview.Adapters.GridAdapter;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int images[] = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);
        GridAdapter adapter = new GridAdapter(MainActivity.this,images);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Clicked image"+ images,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
