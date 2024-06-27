package com.activity.fragments_work;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Detail extends AppCompatActivity {

    ImageView flag;
    TextView capital, country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        capital = findViewById(R.id.capital);
        country = findViewById(R.id.country);
        flag = findViewById(R.id.flag);

        Bundle arguments = getIntent().getExtras();

        Country c;
        if(arguments!=null){
            c = (Country) arguments.getSerializable(Country.class.getSimpleName());

            capital.setText(c.getCapital());
            country.setText(c.getTitle());
            flag.setImageResource(c.getFlag());
        }
    }
}