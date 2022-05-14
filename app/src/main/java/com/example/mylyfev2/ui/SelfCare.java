package com.example.mylyfev2.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mylyfev2.R;



public class SelfCare extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfcare);

    }

    public void open(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.betterdaysahead.club/"));
        startActivity(browserIntent);
    }
    public void open2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://huhclothing.com/"));
        startActivity(browserIntent);
    }
    public void open3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }
    public void open4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }
}
