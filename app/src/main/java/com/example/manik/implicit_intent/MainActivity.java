package com.example.manik.implicit_intent;

import android.app.Activity;
import android.content.ContentProvider;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.manik.implicit_intent.R;

import java.util.Locale;

/**
 * Created by hp on 19-02-2018.
 */

public class MainActivity extends Activity

{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri mapUri = Uri.parse("geo:0,0?q=lat,lng(label)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
        //String uri = String.format(Locale.ENGLISH, "geo:%f,%f", latitude, longitude);
        //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        //startActivity(intent);
        //Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
        //Uri.parse("http://maps.google.com/maps?q=" + serviceActivity.Latitude.toString() + "," + serviceActivity.Longitude.toString()));
        //startActivity(intent);
    }}