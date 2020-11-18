package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    public static final String EXTRA_MESSAGE = "com.example.Hellotoast.extra.MESSAGE";
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

    }


    public void countUp(View view) {
        mCount++;
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }

    }
    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this , SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE,mShowCount.getText().toString());
        startActivity(intent);
    }

}