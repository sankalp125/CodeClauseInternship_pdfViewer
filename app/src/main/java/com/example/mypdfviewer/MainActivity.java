package com.example.mypdfviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <pdfRecyclerModel> pdfItem = new ArrayList<>();
    RecyclerView pdfRecycler;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdfRecycler = findViewById(R.id.pdfRecycler);
        pdfRecycler.setLayoutManager(new LinearLayoutManager(this));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "a_thoughtless_yes.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "nightmare-planet.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "operation-outer-space.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "pariah-planet.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "scally-the-story-of-a-perfect-gentleman.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "the-aliens.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "the-forgotten-planet.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "the-last-place-on-earth.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "the-monkey-s-paw.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "the-mutant-weapon.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "the-planet-with-no-nightmare.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "the-red-dust.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "the-story-of-doctor-dolittle.pdf"));
        pdfItem.add(new pdfRecyclerModel(R.drawable.pdf_icon2, "third-planet.pdf"));

        pdfRecyclerAdapter adapter= new pdfRecyclerAdapter(this,pdfItem);
        pdfRecycler.setAdapter(adapter);
    }
}