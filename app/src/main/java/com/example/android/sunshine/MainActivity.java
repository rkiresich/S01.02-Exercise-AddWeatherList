/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    //COMPLETE
    private TextView weatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        //COMPLETE
        weatherTextView = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data
        //COMPLETE
        String [] fakeWeaterData = {
                "Wednesday, January 17, 2018; hi: 48; lo: 23; Sunny",
                "Thursday, January 18, 2018; hi: 64; lo: 43; Sunny",
                "Friday, January 19, 2018; hi: 60; lo: 40; Cloudy",
                "Saturday, January 20, 2018; hi: 55; lo: 35; Flurry",
                "Sunday, January 21, 2018; hi: 43; lo: 15; Snow",
                "Monday, January 22, 2018; hi: 48; lo: 30; Cloudy",
                "Tuesday, January 23, 2018; hi: 46; lo: 26; Cloudy",
                "Wednesday, January 24, 2018; hi: 59; lo: 39; Sunny",
                "Thursday, January 25, 2018; hi: 68; lo: 50; Sunny",
                "Friday, January 26, 2018; hi: 59; lo: 40; Cloudy",
                "Saturday, January 27, 2018; hi: 55; lo: 35; Flurry",
                "Sunday, January 28, 2018; hi: 63; lo: 45; Sunny",
                "Monday, January 29, 2018; hi: 58; lo: 40; Sunny",
                "Tuesday, January 30, 2018; hi: 46; lo: 26; Cloudy"
        };

        // TODO (4) Append each String from the fake weather data array to the TextView
        //COMPLETE
        for (String fakeDay: fakeWeaterData
             ) {
            weatherTextView.append(fakeDay + "\n\n\n");
        }
    }
}