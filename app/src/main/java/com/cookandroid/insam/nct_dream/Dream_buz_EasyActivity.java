package com.cookandroid.insam.nct_dream;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.insam.R;

public class Dream_buz_EasyActivity extends AppCompatActivity {

    private EditText answerInputEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buz_easy_dream);

        answerInputEditText = findViewById(R.id.editText_answer_input);
        submitButton = findViewById(R.id.button_submit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 사용자가 입력한 답
                String userAnswer = getUserAnswer();

                // 정답
                String correctAnswer = "요드림 쩔어주자 화이팅"; // 원하는 정답을 입력하세요.

                // 정답 확인
                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                    // 정답인 경우
                    // 원하는 처리를 여기에 추가하세요.
                    // 예를 들어, 메시지를 표시할 수 있습니다.
                    Toast.makeText(Dream_buz_EasyActivity.this, "정답입니다!", Toast.LENGTH_SHORT).show();
                } else {
                    // 오답인 경우
                    // 원하는 처리를 여기에 추가하세요.
                    // 예를 들어, 메시지를 표시할 수 있습니다.
                    Toast.makeText(Dream_buz_EasyActivity.this, "틀렸습니다. 다시 시도하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // 다른 곳에서 정답을 확인할 때 사용할 수 있습니다.
    public String getUserAnswer() {
        EditText answerInputEditText = findViewById(R.id.editText_answer_input);
        return answerInputEditText.getText().toString();
    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        if (mediaPlayer != null) {
//            mediaPlayer.release();
//            mediaPlayer = null;
//        }
//    }
}
