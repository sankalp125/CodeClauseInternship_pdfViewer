package com.example.mypdfviewer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class pdfRecyclerAdapter extends RecyclerView.Adapter<pdfRecyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<pdfRecyclerModel> pdfItem;
    pdfRecyclerAdapter(Context context, ArrayList<pdfRecyclerModel> pdfItem){
        this.context=context;
        this.pdfItem=pdfItem;
    }
    @NonNull
    @Override
    public pdfRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.pdfrecycler_card, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull pdfRecyclerAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.pdfIcon.setImageResource(pdfItem.get(position).img);
        holder.pdfname.setText(pdfItem.get(position).name);

        holder.llpdfView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, pdf_viewer.class);
                intent.putExtra("name",(pdfItem.get(position)).name);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return pdfItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView pdfname;
        ImageView pdfIcon;
        LinearLayout llpdfView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pdfname= itemView.findViewById(R.id.pdfname);
            pdfIcon=itemView.findViewById(R.id.pdfIcon);
            llpdfView=itemView.findViewById(R.id.llpdfView);
        }
    }
}
