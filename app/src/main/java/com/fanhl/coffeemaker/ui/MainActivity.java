package com.fanhl.coffeemaker.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.fanhl.coffeemaker.App;
import com.fanhl.coffeemaker.R;
import com.fanhl.coffeemaker.machine.CoffeeMaker;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.result)
    TextView mResult;

    //2.2.3.3.1
    @Inject
    CoffeeMaker coffeeMaker;//2.1.2.1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ((App) getApplication()).component().inject(this);//2.2.2.2.1
    }

    @OnClick(R.id.brew)
    void brew() {
        mResult.setText(coffeeMaker.brew());//2.1.2.2
    }
}
