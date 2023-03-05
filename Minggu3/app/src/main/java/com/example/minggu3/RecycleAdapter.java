package com.example.minggu3;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecycleViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;

    public RecycleAdapter(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    };

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycle_row, parent, false);
        return new RecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
        holder.title_txt.setText(data1[position]);
        holder.deskripsi_txt.setText(data2[position]);
        holder.recycle_img.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder  {

        TextView title_txt, deskripsi_txt;
        ImageView recycle_img;

        public RecycleViewHolder(@NonNull View itemView) {
            super(itemView);
            title_txt = itemView.findViewById(R.id.title_txt);
            deskripsi_txt = itemView.findViewById(R.id.deskripsi_title);
            recycle_img = itemView.findViewById(R.id.recycle_img);
        }
    }
}
