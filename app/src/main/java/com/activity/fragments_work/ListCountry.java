package com.activity.fragments_work;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class ListCountry extends Fragment {
    RecyclerView recyclerView;
    private final ArrayList<Country> countries = new ArrayList<Country>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycler);
        CountryAdapter.OnCountryClickListener onClick = new CountryAdapter.OnCountryClickListener() {
            @Override
            public void onCountryClick(Country country, int position) {
                Intent intent = new Intent(view.getContext(), Detail.class);
                intent.putExtra(Country.class.getSimpleName(), country);
                startActivity(intent);
            }
        };
        CountryAdapter adapter = new CountryAdapter(countries, onClick);
        recyclerView.setAdapter(adapter);

        countries.add(new Country("Бразилия", "Бразилия", R.drawable.brasil));
        countries.add(new Country("Аргентина", "Буэнос-Айрес", R.drawable.argentin));
        countries.add(new Country("Чехия", "Прага", R.drawable.czech));
        countries.add(new Country("Китай", "Пекин", R.drawable.china));
        countries.add(new Country("Россия", "Москва", R.drawable.russia));
        countries.add(new Country("Казахстан", "Астана", R.drawable.kazah));
        countries.add(new Country("Марокко", "Рабат", R.drawable.marocco));
        countries.add(new Country("Египет", "Каир", R.drawable.egypt));
        countries.add(new Country("ОАЭ", "Абу-Даби", R.drawable.oae));
        countries.add(new Country("Канада", "Оттава", R.drawable.canada));
        countries.add(new Country("США", "Вашингтон", R.drawable.usa));
        countries.add(new Country("Турция", "Анкара", R.drawable.turkey));
        countries.add(new Country("Япония", "Токио", R.drawable.japan));
        countries.add(new Country("Китай", "Пекин", R.drawable.china));
        countries.add(new Country("Швеция", "Стокгольм", R.drawable.sweden));
        countries.add(new Country("Норвегия", "Осло", R.drawable.norway));
        countries.add(new Country("Швейцария", "", R.drawable.swizer));
        countries.add(new Country("Австралия", "Канбера", R.drawable.australia));
        countries.add(new Country("Автрия", "Вена", R.drawable.austria));
    }
}