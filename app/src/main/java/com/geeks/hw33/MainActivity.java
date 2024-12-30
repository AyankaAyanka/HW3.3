package com.geeks.hw33;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewContinents);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> continents = Arrays.asList("Азия", "Европа");

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(continents, continent -> {
            Intent intent = new Intent(MainActivity.this, CountryActivity.class);
            intent.putExtra("continent", continent);
            startActivity(intent);
        });

        recyclerView.setAdapter(adapter);
    }
}
