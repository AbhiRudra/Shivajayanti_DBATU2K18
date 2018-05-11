package com.shivajayanti.abhishek.shivajayanti_dbatu_2k18;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                Intent myMail = new Intent(Intent.ACTION_SEND);

                myMail.setData(Uri.parse("mail to:"));
                myMail.setType("message/rfc822");
            String to="abhishekrudrawar502@gmail.com";
            String sub="Regarding Shivjayanti-2K18:";
                myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
                myMail.putExtra(Intent.EXTRA_TEXT,"Heyy..");
            startActivity(Intent.createChooser(myMail,"send email"));
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.developers) {
             Intent toy= new Intent(MainActivity.this, developers.class);
             startActivity(toy);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_shivjayanti) {
            // Handle the camera action
            Intent event=new Intent(MainActivity.this, MainActivity.class);
            startActivity(event);
            return true;

        } else if (id == R.id.nav_jyot) {
            Intent event=new Intent(MainActivity.this, jyot.class);
            startActivity(event);
            return true;


        } else if (id == R.id.nav_quiz) {
            Intent toy= new Intent( MainActivity.this, quizhome.class);
            startActivity(toy);
            return true;


        } else if (id == R.id.nav_pradarshan) {
            Intent event=new Intent(MainActivity.this, pradarshan.class);
            startActivity(event);
            return true;

        } else if (id == R.id.nav_mardanikhel) {
            Intent event=new Intent(MainActivity.this, mardanikhel.class);
            startActivity(event);
            return true;

        } else if (id == R.id.nav_jallosh) {
            Intent event=new Intent(MainActivity.this, jallosh.class);
            startActivity(event);
            return true;

        } else if (id == R.id.nav_share) {
            Intent share=new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            String shareBody="Here it is..! Shivjayanti Utsav-2018, Dr. Babasaheb Ambedkar Technological University, Lonere: https://play.google.com/store/search?q=Abhishek%20A.%20Rudrawar&hl=en ";
            String shareSub="TRy This App";
            share.putExtra(Intent.EXTRA_SUBJECT,shareSub);
            share.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(Intent.createChooser(share,"Share Using"));
            return true;
        } else if (id == R.id.nav_about) {
            Intent event=new Intent(MainActivity.this, about.class);
            startActivity(event);
            return true;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
