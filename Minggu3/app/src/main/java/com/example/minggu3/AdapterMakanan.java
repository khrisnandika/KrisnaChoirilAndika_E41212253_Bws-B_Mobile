package com.example.minggu3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMakanan extends RecyclerView.Adapter<AdapterMakanan.AdapterViewHolder> {
    Context ct;
    ArrayList<Makanan> listMakanan;

    public AdapterMakanan(Context ct, ArrayList<Makanan> listMakanan) {
        this.ct = ct;
        this.listMakanan = listMakanan;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ct);
        View view = inflater.inflate(R.layout.item_makanan, parent, false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        Makanan makanan = listMakanan.get(position);
        holder.txtNama.setText(makanan.getMakanan());
        holder.txtDeskripsi.setText(makanan.getDeskripsi());
        holder.txtHarga.setText(""+makanan.getHarga());
        holder.gambarMakanan.setImageResource(makanan.getGambar());
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }


    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        TextView txtNama, txtDeskripsi, txtHarga;
        ImageView gambarMakanan;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNama = itemView.findViewById(R.id.txtNama);
            txtDeskripsi = itemView.findViewById(R.id.txtDeskripsi);
            txtHarga = itemView.findViewById(R.id.txtHarga);
            gambarMakanan = itemView.findViewById(R.id.gambarMakanan);
        }
    }
}
