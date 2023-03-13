package com.example.minggu3;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AutoCompleteTextView extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        addData();

        recyclerView = findViewById(R.id.recyle_view);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(AutoCompleteTextView.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }
    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "121212", "0912312"));
        mahasiswaArrayList.add(new Mahasiswa("Fadli Yonk", "121212", "0912312"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "121212", "0912312"));
        mahasiswaArrayList.add(new Mahasiswa("Sandika Maulana", "121212", "0912312"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "121212", "0912312"));
        mahasiswaArrayList.add(new Mahasiswa("Abdul Maulana", "121212", "0912312"));
        mahasiswaArrayList.add(new Mahasiswa("Rudi Maulana", "121212", "0912312"));
        mahasiswaArrayList.add(new Mahasiswa("ALex Maulana", "121212", "0912312"));
        mahasiswaArrayList.add(new Mahasiswa("Jamal Maulana", "121212", "0912312"));
        mahasiswaArrayList.add(new Mahasiswa("Galih Maulana", "121212", "0912312"));
        mahasiswaArrayList.add(new Mahasiswa("Fatan Maulana", "121212", "0912312"));
        mahasiswaArrayList.add(new Mahasiswa("Jamal Maulana", "121212", "0912312"));
    }
}
