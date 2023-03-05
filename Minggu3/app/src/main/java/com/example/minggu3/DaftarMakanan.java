package com.example.minggu3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class DaftarMakanan extends AppCompatActivity {

    RecyclerView rMakanan;
    RecyclerView.Adapter rAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Makanan> listMakanan;

    void dataDummy(){
        listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("instagram", "ini adalah deskripsi", 10, R.drawable.instagram));
        listMakanan.add(new Makanan("telegram", "ini adalah deskripsi", 10, R.drawable.telegram));
        listMakanan.add(new Makanan("twitter", "ini adalah deskripsi", 10, R.drawable.twitter));
        listMakanan.add(new Makanan("whatsapp", "ini adalah deskripsi", 10, R.drawable.whatsapp));
        listMakanan.add(new Makanan("facebook", "ini adalah deskripsi", 10, R.drawable.facebook));
    }
    void data(){
        rMakanan = findViewById(R.id.tutorialMakanan);
        rAdapter = new AdapterMakanan(this, listMakanan);
        layoutManager = new LinearLayoutManager(this);

        rMakanan.setLayoutManager(layoutManager);
        rMakanan.setAdapter(rAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_makanan);

        dataDummy();
        data();
    }
}