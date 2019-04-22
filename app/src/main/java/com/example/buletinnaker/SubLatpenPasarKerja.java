package com.example.buletinnaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubLatpenPasarKerja extends AppCompatActivity {
    Button book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_latpen_pasar_kerja);

        book=(Button) findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SubLatpenPasarKerja.this,Book.class);
                startActivity(intent);
            }
        });
    }
}
