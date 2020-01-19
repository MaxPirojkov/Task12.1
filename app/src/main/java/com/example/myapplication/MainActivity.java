package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butOk = findViewById(R.id.buttonOk);
        butOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editName = findViewById(R.id.editName);
                EditText editMail = findViewById(R.id.editMail);
                TextView editRes = findViewById(R.id.textResult);
                String name = editName.getText().toString();
                String mail = editMail.getText().toString();
                editRes.setText("Подписка на рассылку успешно \n" +
                        "оформлена для пользователя  \n" + name +
                        " на электронный адрес \n" + mail);
            }
        });

        Button butClean = findViewById(R.id.buttonClean);
        butClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editName = findViewById(R.id.editName);
                EditText editMail = findViewById(R.id.editMail);
                TextView editRes = findViewById(R.id.textResult);
//                String name = editName.getText().toString();
//                String mail = editMail.getText().toString();
                editName.setText("");
                editMail.setText("");
                editRes.setText("");
            }
        });
    }
}
