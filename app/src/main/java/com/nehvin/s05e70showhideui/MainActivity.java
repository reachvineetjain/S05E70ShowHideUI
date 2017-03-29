package com.nehvin.s05e70showhideui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button show;
    Button hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize()
    {
        textView = (TextView) findViewById(R.id.vkj);
        show = (Button) findViewById(R.id.show);
        hide = (Button) findViewById(R.id.hide);
    }
    public void showUI(View view)
    {
        textView.setVisibility(View.VISIBLE);
    }

    public void hideUI(View view)
    {
        textView.setVisibility(View.INVISIBLE);
    }
}