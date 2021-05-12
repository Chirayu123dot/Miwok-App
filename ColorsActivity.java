package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // creating an array of english numbers (words)
        //String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        ArrayList<Word> words = new ArrayList<>();
        // words.add("one")
        words.add(new Word("red","weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("green","chokokki", R.drawable.color_green));
        words.add(new Word("brown","ṭakaakki", R.drawable.color_brown));
        words.add(new Word("gray","ṭopoppi", R.drawable.color_gray));
        words.add(new Word("black","kululli", R.drawable.color_black));
        words.add(new Word("white","kelelli", R.drawable.color_white));
        words.add(new Word("dusty yellow","ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow","chiwiiṭә", R.drawable.color_mustard_yellow));


        //  ArrayList<String> words1 = new ArrayList<>(); // creating an ArrayList

        //  ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item, words);
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
