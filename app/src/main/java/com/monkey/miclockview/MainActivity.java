package com.monkey.miclockview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wingsofts.threedlayout.ThreeDLayout;

public class MainActivity extends AppCompatActivity {
    ThreeDLayout threedView;
//    android:background="#237EAD"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        threedView = (ThreeDLayout) findViewById(R.id.threed_view);
        //开启触摸模式
        threedView.setTouchable(true);
        // 改变触摸模式
        threedView.setTouchMode(ThreeDLayout.MODE_BOTH_X_Y);
    }
}
