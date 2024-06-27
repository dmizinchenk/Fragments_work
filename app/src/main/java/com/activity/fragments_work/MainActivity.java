package com.activity.fragments_work;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentContainerView;

public class MainActivity extends AppCompatActivity {

    Button btn_frame_list;
    Button btn_card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn_frame_list = findViewById(R.id.fragment1);
        btn_card = findViewById(R.id.fragment2);



        FragmentContainerView container = new FragmentContainerView(getApplicationContext());

        btn_frame_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container, Profile.class, null)
                        .replace(R.id.container, ListCountry.class, null)
                        .commit();
            }
        });

        btn_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container, ListCountry.class, null)
                        .replace(R.id.container, Profile.class, null)
                        .commit();
            }
        });

        container = findViewById(R.id.container);
    }
}