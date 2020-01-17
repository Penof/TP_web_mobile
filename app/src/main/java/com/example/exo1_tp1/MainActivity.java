package com.example.exo1_tp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtPseudo;
    private Button button_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.edtPseudo = findViewById(R.id.input_text_nom);
        this.edtPseudo.setOnClickListener(this);

        this.button_ok = findViewById(R.id.button_ok);
        this.button_ok.setOnClickListener(this);


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    private void alerter(String s) {
        Toast myToast =
                Toast.makeText(this,s,Toast.LENGTH_LONG);
        myToast.show();
    }

    public void testonclick(View view) {
        this.alerter("test onclick");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_ok :
                String pseudo = this.edtPseudo.getText().toString();
                if (pseudo.isEmpty()) {
                    this.alerter("Saisir un pseudo");
                }
                Bundle myBdl = new Bundle();
                myBdl.putString("pseudo",pseudo);

                Intent versSecondeActivity = new Intent(this, SecondeActivity.class);
                versSecondeActivity.putExtras(myBdl);
                startActivity(versSecondeActivity);

                break;

            default: break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_account :
                alerter("menu account");
                break;
            case R.id.action_settings :
                Intent versPrefAct = new Intent(this, SettingsActivity.class);
                startActivity(versPrefAct);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
