package com.cadi.hnadler_test;

import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity
{

    Button btn_home;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_home = (Button)findViewById(R.id.btn_home);

        btn_home.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Handler hand = new Handler();
                hand.postDelayed(new Runnable() {
                    @Override
                    public void run()
                    {
                        Toast.makeText(MainActivity.this, "핸들러수업", Toast.LENGTH_SHORT).show();
                    }
                },2000);
            }
        });

    }
}
