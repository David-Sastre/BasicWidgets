package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verLabelDemo(View view) {
        Intent intent = new Intent(this, LabelDemo.class);
        startActivity(intent);
    }
    public void verFleetingImage(View view) {
        Intent i = new Intent(this, FleetingImages.class);
        startActivity(i);
    }
    public void verFieldDemo(View view){
        Intent i = new Intent(this, FieldDemo.class);
        startActivity(i);
    }
    public void verCheckBoxDemo (View view){
        Intent i = new Intent(this, CheckBoxDemo.class);
        startActivity(i);
    }
    public void verRadioDemo (View view) {
        Intent i = new Intent(this, RadioDemo.class);
        startActivity(i);
    }
    public void verLinearLayoutDemo (View view) {
        Intent i = new Intent(this, LinearLayoutDemo.class);
        startActivity(i);
    }
    public void verBoxModel (View view) {
        Intent i = new Intent(this, BoxModel.class);
        startActivity(i);
    }
    public void verRelativeLayoutDemo (View view) {
        Intent i = new Intent(this, RelativeLayoutDemo.class);
        startActivity(i);
    }
    public void verOverlapDemo (View view) {
        Intent i = new Intent(this, OverlapDemo.class);
        startActivity(i);
    }
    public void verTabulaRasa (View view) {
        Intent i = new Intent(this, TabulaRasa.class);
        startActivity(i);
    }
    public void verScrollViewDemo(View view) {
        Intent i = new Intent(this, ScrollViewDemo.class);
        startActivity(i);
    }
}
