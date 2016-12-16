package net.kibotu.unity.bluetooth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import net.kibotu.urlshortener.UrlShortener;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(net.kibotu.urlshortener.app.R.layout.activity_main);
    }
}