package com.example.buletinnaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuSatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_satu);
    }

    public void pasarkerja (View view){
        Intent intent = new Intent(MenuSatu.this, SubLatpenPasarKerja.class);
        startActivity(intent);
    }
}
