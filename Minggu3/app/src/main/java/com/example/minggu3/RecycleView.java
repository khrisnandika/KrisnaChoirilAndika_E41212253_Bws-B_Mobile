package com.example.minggu3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecycleView extends AppCompatActivity {

    RecyclerView recyclerView;

     String s1[], s2[];
     int images[] = {R.drawable.bootstrap, R.drawable.cplus, R.drawable.facebook, R.drawable.html, R.drawable.instagram,
             R.drawable.java, R.drawable.javascript, R.drawable.massanger, R.drawable.php, R.drawable.python,
             R.drawable.telegram, R.drawable.twitter, R.drawable.whatsapp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        s1 = getResources().getStringArray(R.array.list_gambar);
        s2 = getResources().getStringArray(R.array.deskripsi);

        recyclerView = findViewById(R.id.tutorialrecycle);

        RecycleAdapter recycleAdapter = new RecycleAdapter(this, s1, s2, images);
        recyclerView.setAdapter(recycleAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}