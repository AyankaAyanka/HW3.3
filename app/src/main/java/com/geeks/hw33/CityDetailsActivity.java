package com.geeks.hw33;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class CityDetailsActivity extends AppCompatActivity {

    private Map<String, String> cityDetails = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_details);

        String cityName = getIntent().getStringExtra("city_name");
        int cityImage = getIntent().getIntExtra("city_image", 0);
        String cityInfo = getIntent().getStringExtra("city_info");

    }
}