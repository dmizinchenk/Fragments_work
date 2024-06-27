package com.activity.fragments_work;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
    private final List<Country> countries;


    interface OnCountryClickListener {
        void onCountryClick(Country country, int position);
    }

    private final OnCountryClickListener onClickListener;

    public CountryAdapter(List<Country> countries, OnCountryClickListener onClickListener) {
        this.countries = countries;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Country country = countries.get(position);
        holder.flag.setImageResource(country.getFlag());
        holder.capital.setText(country.getCapital());
        holder.title.setText(country.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                onClickListener.onCountryClick(country, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView flag;
        final TextView title, capital;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.flag);
            title = itemView.findViewById(R.id.country);
            capital = itemView.findViewById(R.id.capital);
        }
    }
}
