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
        final EditText editName = findViewById(R.id.editName);
        final EditText editMail = findViewById(R.id.editMail);
        final TextView editRes = findViewById(R.id.textResult);

        Button butOk = findViewById(R.id.buttonOk);
        butOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editName.getText().toString();
                String mail = editMail.getText().toString();

                String text = getString(R.string.text_view_res, name, mail);
                editRes.setText(text);
            }
        });

        Button butClean = findViewById(R.id.buttonClean);
        butClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editName.setText("");
                editMail.setText("");
                editRes.setText("");
            }
        });
    }
}