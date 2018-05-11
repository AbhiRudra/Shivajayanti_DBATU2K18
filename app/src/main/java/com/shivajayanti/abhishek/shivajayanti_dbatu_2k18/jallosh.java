package com.shivajayanti.abhishek.shivajayanti_dbatu_2k18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class jallosh extends AppCompatActivity {

    RelativeLayout r1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jallosh);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        r1= (RelativeLayout)findViewById(R.id.mylayout);

        Timer t= new Timer();
        mytimer mt= new mytimer();

        t.schedule(mt,0000,2000);

    }


    class mytimer extends TimerTask {

        public void run(){
            runOnUiThread(new Runnable() {
                Random rand = new Random();
                public void run() {
                    int images[] = {R.drawable.jimagea, R.drawable.ja, R.drawable.jimagec, R.drawable.jal,
                            R.drawable.mc};

                    r1.setBackgroundResource(images[getrandomnumber()]);
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
