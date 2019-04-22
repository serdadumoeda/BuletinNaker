package com.example.buletinnaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "firebase success",Toast.LENGTH_LONG).show();
    }

    public void menu1 (View view){
        Intent intent = new Intent(MainActivity.this, MenuSatu.class);
        startActivity(intent);
    }
    public void menu2 (View view){
        Intent intent = new Intent(MainActivity.this, MenuDua.class);
        startActivity(intent);
    }
}
