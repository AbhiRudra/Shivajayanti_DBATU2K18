package com.shivajayanti.abhishek.shivajayanti_dbatu_2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultactivity extends AppCompatActivity {

    TextView resultlabel,textView;
    Button r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultactivity);

        TextView resultlabel = (TextView)findViewById(R.id.resultlabel);
        r2=(Button)findViewById(R.id.button226);

        Bundle bundle=getIntent().getExtras();

        final String score1= bundle.getString("post");

        resultlabel.setText(score1);


        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go= new Intent(resultactivity.this,MainActivity.class);
                startActivity(go);
            }
        });
    }
}
