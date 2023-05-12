package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        String[] coutries = getResources().getStringArray(R.array.countries);
        CountryAdapter countryAdapter = new ArrayAdapter<>(this,R.layout.layout_custom, coutries);
        autoCompleteTextView.setAdapter(arrayAdapter);
    }


    private List<Country> getListCountry(){
        List<Country> list = new ArrayList<>();
        list.add(new Country("Afghanistan"));
        list.add(new Country("Albania"));
        list.add(new Country("Andorra"));
        list.add(new Country("Angola"));
        list.add(new Country("Algeria"));
        list.add(new Country("Argentina"));
        list.add(new Country("Antigua"));
        list.add(new Country("Barbuda"));


        return  list;
    }
}