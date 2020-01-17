package com.example.exo1_tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SecondeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);

        Bundle bdl = this.getIntent().getExtras();
        Toast t = Toast.makeText(this,bdl.getString("pseudo"), Toast.LENGTH_LONG);
        t.show();
    }
}
