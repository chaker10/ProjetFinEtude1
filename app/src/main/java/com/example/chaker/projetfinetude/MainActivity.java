package com.example.chaker.projetfinetude;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button login;
    float x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_login(View v)
    {

        Intent aller = new Intent(MainActivity.this,Interface.class);
        aller.putExtra("cle",x);
        startActivity(aller);
    }
}
