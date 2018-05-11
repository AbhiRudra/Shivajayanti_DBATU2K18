package com.shivajayanti.abhishek.shivajayanti_dbatu_2k18;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(1000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent open=new Intent("com.shivajayanti.abhishek.shivajayanti_dbatu_2k18.MAINACTIVITY");
                    startActivity(open);
                }
            }
        };

        timer.start();

    }

    @Override
    public void onBackPressed(){
        final AlertDialog.Builder builder=new AlertDialog.Builder(splash.this);
        builder.setMessage("Are you sure to quit the app ?");
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                Intent toy=new Intent(splash.this,MainActivity.class);
                startActivity(toy);
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();

            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}
