package com.cookandroid.insam;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.Task;
        import com.google.firebase.auth.AuthResult;
        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;

public class LoginActivity extends AppCompatActivity {
    private FirebaseAuth mFirebaseAuth;         // 파이어 베이스 인증
    private DatabaseReference mDatabaseRef;     // 실시간 데이터 베이스
    private EditText mEtEmail, mEtPwd;
    private Button mBtnLogin;
    private TextView mBtnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference();

        mEtEmail = findViewById(R.id.usernameEditText);
        mEtPwd = findViewById(R.id.passwordEditText);
        TextView mBtnRegister = (TextView) findViewById(R.id.registerButton);
        mBtnLogin = findViewById(R.id.loginButton);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strEmail = mEtEmail.getText().toString();
                String strPwd = mEtPwd.getText().toString();

                mFirebaseAuth.signInWithEmailAndPassword(strEmail, strPwd).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // 로그인 성공
                            Intent intent = new Intent(LoginActivity.this, SelectActivity.class);
                            startActivity(intent);
                            finish();
                        }
                        else {
                            Toast.makeText(LoginActivity.this, "로그인 실패", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        mBtnRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }
}
/*
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 아이디와 비밀번호를 가져오기
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // 아이디와 비밀번호 확인
                if (username.equals("insam") && password.equals("123")) {
                    // 로그인이 성공한 경우, SelectActivity로 이동
                    Intent intent = new Intent(LoginActivity.this, SelectActivity.class);
                    startActivity(intent);

                    // LoginActivity를 종료
                    finish();
                } else {
                    // 로그인 실패 메시지를 표시 또는 작업 수행
                    // 예를 들어, Toast 메시지를 표시할 수 있습니다.
                }
            }
        });
    }
}
*/