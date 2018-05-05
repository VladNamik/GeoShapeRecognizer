package com.example.namik.geoshaperecognizer;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.namik.geoshaperecognizer.views.DrawingView;

public class MainActivity extends AppCompatActivity {
    DrawingView mDrawingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawingView = findViewById(R.id.main_screen_drawer);
        mDrawingView.setOnShapeDrawingLister(new DrawingView.OnShapeDrawingListener() {
            @Override
            public void OnShapeDrawingStarted(Bitmap shape) {
                shape.eraseColor(Color.TRANSPARENT);
            }

            @Override
            public void OnShapeDrawn(Bitmap shape) {
                Toast.makeText(MainActivity.this, "End drawing", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
