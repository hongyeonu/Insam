package com.cookandroid.insam.nct_dream;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.insam.R;

public class SongGuessingActivity_dream extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_guessing_dream);

        Button easyButton = findViewById(R.id.button_easy);
        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongGuessingActivity_dream.this, Dream_Song_EasyActivity.class);
                startActivity(intent);
            }
        });


        Button normalButton = findViewById(R.id.button_normal);
        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongGuessingActivity_dream.this, Dream_Song_NormalActivity.class);
                startActivity(intent);
            }
        });

        Button hardButton = findViewById(R.id.button_hard);
        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hard 난이도 선택 시 이동할 Activity를 설정해주세요.
                Intent intent = new Intent(SongGuessingActivity_dream.this, Dream_Song_HardActivity.class);
                startActivity(intent);
            }
        });
    }
}
