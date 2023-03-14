package com.example.th_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {
    TextView tvUserNameC, tvPasswordC;
    Button btBackC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        //ánh xạ
        tvUserNameC = findViewById(R.id.tvUserName);
        tvPasswordC = findViewById(R.id.tvPassword);
        btBackC = findViewById(R.id.btBack);
        //lấy gói dữ liệu
        Bundle goi = getIntent().getExtras();
        //hiển thị
        String username = goi.getString("username");
        String password = goi.getString("password");
        //
        tvUserNameC.setText(username);
        tvPasswordC.setText(password);
        //nhấn nút back
        btBackC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}