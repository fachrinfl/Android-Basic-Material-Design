package com.fachrinfl.android_basic_material_design;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSeekBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.appyvet.rangebar.RangeBar;

public class MainActivity extends AppCompatActivity {

    AppCompatSeekBar appCompatSeekBar;
    RangeBar rangeBar, rangeBar_two_pin;
    TextView valueSeekbar, valueRangebar, valueRangebar_two_pin_left, valueRangebar_two_pin_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Seekbar

        appCompatSeekBar = (AppCompatSeekBar) findViewById(R.id.seekBar_id);
        valueSeekbar = (TextView) findViewById(R.id.valueSeekbar_id);

        // Default Value
        appCompatSeekBar.setProgress(0);

        // Step Value
        appCompatSeekBar.setKeyProgressIncrement(1);

        appCompatSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String str_value = String.valueOf(progress);
                valueSeekbar.setText(str_value);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        // Rangebar

        rangeBar = (RangeBar) findViewById(R.id.rangeBar_id);
        valueRangebar = (TextView) findViewById(R.id.valueRangebar_id);

        rangeBar.setSeekPinByIndex(0);
        rangeBar.setPinTextColor(Color.parseColor("#FFFFFF"));
        rangeBar.setSelectorColor(getResources().getColor(R.color.colorAccent));
        rangeBar.setTickColor(getResources().getColor(R.color.colorAccent));
        rangeBar.setConnectingLineColor(getResources().getColor(R.color.colorAccent));
        rangeBar.setBarColor(getResources().getColor(R.color.colorAccent));
        rangeBar.setPinColor(getResources().getColor(R.color.colorAccent));
        rangeBar.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {
                valueRangebar.setText(rightPinValue);
            }
        });

        // Rangebar With Two Pin

        rangeBar_two_pin = (RangeBar) findViewById(R.id.rangeBar_two_pin_id);
        valueRangebar_two_pin_left = (TextView) findViewById(R.id.valueRangebar_two_pin_left_id);
        valueRangebar_two_pin_right = (TextView) findViewById(R.id.valueRangebar_two_pin_right_id);

        rangeBar_two_pin.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {
                valueRangebar_two_pin_left.setText(leftPinValue);
                valueRangebar_two_pin_right.setText(rightPinValue);
            }
        });

    }
}
