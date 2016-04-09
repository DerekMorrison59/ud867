package com.example.derek.androidjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke = "Nothing received from the library and that's no joke!";

        Bundle bun = getIntent().getExtras();

        if (null != bun) {
            joke = bun.getString(JOKE_KEY);
        }

        TextView jokeSpace = (TextView) findViewById(R.id.jokeTextView);
        jokeSpace.setText(joke);
    }
}
