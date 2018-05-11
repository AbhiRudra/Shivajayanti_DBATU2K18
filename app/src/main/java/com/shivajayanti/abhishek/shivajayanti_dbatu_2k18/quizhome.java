package com.shivajayanti.abhishek.shivajayanti_dbatu_2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class quizhome extends AppCompatActivity {


    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizhome);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

      b1= findViewById(R.id.button);

      b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent toy= new Intent(quizhome.this, question.class);
              startActivity(toy);
          }
      });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id= item.getItemId();
        if(id== android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
