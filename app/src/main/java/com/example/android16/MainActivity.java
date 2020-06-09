package com.example.android16;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.gesture.Gesture;
import android.widget.TextView;

import static android.view.GestureDetector.*;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener{
    TextView t1;
    private GestureDetectorCompat GestureDetect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.textview);
        GestureDetect=new GestureDetectorCompat(this,this);
        GestureDetect.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        GestureDetect.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        t1.setText("onSingleTapConfirmed"+e.toString());
        return false;

    }


    @Override
    public boolean onDoubleTap(MotionEvent e) {
        t1.setText("MotionEvent e"+e.toString());
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        t1.setText("onDoubleTapEvent"+e.toString());
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        t1.setText("onDown"+e.toString());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        t1.setText("onShowPress"+e.toString());

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        t1.setText("onSingleTapUp"+e.toString());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        t1.setText("onScroll"+e1.toString()+e2.toString());
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        t1.setText("onLongPress"+e.toString());

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        t1.setText("onFling"+e1.toString()+e2.toString());
        return false;
    }
}
