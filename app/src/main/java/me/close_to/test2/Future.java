package me.close_to.test2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Random;



public class Future extends AppCompatActivity {

    Random rand = new Random();
    int n = rand.nextInt(7);

    String output = String.valueOf(n);
    // globally
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //in your OnCreate() method
        textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setText(output + " bikes");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void future(View v) {
        android.content.Intent i = new android.content.Intent(Future.this, Future.class);
        startActivity(i);
    }
}
