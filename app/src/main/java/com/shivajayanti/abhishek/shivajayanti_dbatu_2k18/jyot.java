package com.shivajayanti.abhishek.shivajayanti_dbatu_2k18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class jyot extends AppCompatActivity {

     RelativeLayout r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jyot);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        r2= (RelativeLayout) findViewById(R.id.mylayout1);
        Timer t= new Timer();
        mytimer mt= new mytimer();

        t.schedule(mt,0000,2000);

    }


class mytimer extends TimerTask{

    public void run(){
        runOnUiThread(new Runnable() {
            Random rand = new Random();
            public void run() {
                int images[] = {R.drawable.jimagea, R.drawable.ja, R.drawable.jyot, R.drawable.jal,
                        R.drawable.jimagee};

                r2.setBackgroundResource(images[getrandomnumber()]);
            }

            private int getrandomnumber(){
                return new Random().nextInt(5);
            }



        });
        }
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
