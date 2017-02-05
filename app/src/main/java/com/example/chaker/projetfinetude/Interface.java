package com.example.chaker.projetfinetude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Interface extends AppCompatActivity {
    float a;
    EditText c,m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);
    }


    public  void btn_log(View v)
    {
        Intent aller =new Intent(Interface.this,Menu.class);
      //  aller.putExtra("cle",a);
        startActivity(aller);
    }
    public  void btn_anul(View v)
    {
        c.setText("");
        m.setText("");

    }
}
