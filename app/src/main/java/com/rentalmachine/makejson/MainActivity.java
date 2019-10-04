package com.rentalmachine.makejson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tHello).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JSONObject jsonObjectMain = new JSONObject();
                JSONArray jsonArray = new JSONArray();
                JSONObject jsonObject = new JSONObject();
                try {

                    for (int i = 0; i < 5; i++) {
                        jsonObject.put("Data", "Rahul");
                        jsonObject.put("Phone", "8002008332");
                        jsonObject.put("Company", "Clamour Technologies");
                        jsonArray.put(jsonObject);
                    }
                    jsonObjectMain.put("data", jsonArray);

                    Log.e("jsonFormat", jsonObjectMain.toString());

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
