package com.geeks.hw33;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryActivity extends AppCompatActivity {

    private Map<String, List<String>> countries = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewCountries);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String continent = getIntent().getStringExtra("continent");

        // Континенты и страны
        countries.put("Азия", new ArrayList<>(List.of("Кыргызстан", "Казахстан", "Китай", "Япония")));
        countries.put("Европа", new ArrayList<>(List.of("Германия", "Франция", "Италия")));

        List<String> countryList = countries.get(continent);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(countryList, country -> {
            Intent intent = new Intent(CountryActivity.this, CityActivity.class);
            intent.putExtra("country", country);
            startActivity(intent);
        });

        recyclerView.setAdapter(adapter);
    }
}
