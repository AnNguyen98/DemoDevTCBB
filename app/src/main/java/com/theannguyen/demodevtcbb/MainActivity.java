package com.theannguyen.demodevtcbb;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSnackBarShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_cycle);
        Log.d("Android","onCreate");

        init();
        btnSnackBarShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snackbar = Snackbar.make(v,"This is SnackBar",Snackbar.LENGTH_LONG);
                snackbar.show();
                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar snackbar1 = Snackbar.make(v,"OK SnackBar!",Snackbar.LENGTH_LONG);
                        snackbar1.setActionTextColor(Color.BLUE);
                        snackbar1.show();
                    }
                });
            }
        });

    }


    void init(){
        btnSnackBarShow = (Button) findViewById(R.id.snackbar1);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Android","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Android","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Android","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Android","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Android","onReStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Android","onDestroy");
    }

}
