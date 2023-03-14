package com.example.th_lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConstraintActivity extends AppCompatActivity {
    EditText edUserNameC, edPasswordC;
    Button btLoginC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
        //ánh xạ
        edUserNameC = findViewById(R.id.Username);
        edPasswordC = findViewById(R.id.Password);
        btLoginC = findViewById(R.id.btLogin);

        btLoginC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lấy dữ liệu
                String username = edUserNameC.getText().toString();
                String password = edPasswordC.getText().toString();
                //kiểm tra dữ liệu
                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password))
                {
                    Toast.makeText(getApplicationContext(),"vui lòng nhập đầy đủ thông tin",Toast.LENGTH_LONG).show();
                    return;
                }
                else
                {
                    //tạo đường dẫn tới activity mới
                    Intent i = new Intent(ConstraintActivity.this,InfoActivity.class);
                    i.putExtra("username",username);
                    i.putExtra("password",password);
                    startActivity(i);
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInf = getMenuInflater();
        menuInf.inflate(R.menu.optionmenu,menu);
        return true;
    }
    //tạo sự kiện click trên menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId())
        {
            case R.id.mnHome:
                showActivity(item.getTitle().toString());
                return true;
            case R.id.mnAccount:
                showActivity(item.getTitle().toString());
                return true;
            case R.id.mnSearch:
                showActivity(item.getTitle().toString());
                return true;
            case R.id.mnExit:
                showActivity(item.getTitle().toString());
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    void showActivity(String nameMn)
    {
        Intent i = new Intent(ConstraintActivity.this, DetailActivity.class);
        i.putExtra("menu",nameMn);
        startActivity(i);
    }

}