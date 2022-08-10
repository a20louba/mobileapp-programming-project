package com.example.project;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@SuppressWarnings("FieldCanBeLocal")

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

   private final String URL = "https://mobprog.webug.se/json-api?login=a18chrkr";
   RecyclerView recyclerView;
   private List<Blommor> blommorList;
   private BlommorAdapter adapter;


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       adapter = new BlommorAdapter();
       blommorList = new ArrayList<Blommor>();

       recyclerView = findViewById(R.id.blommor_recycler);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(adapter);

   }

   @Override
   public void onPostExecute(String json) {
       Gson gson = new Gson();
       Type type = new TypeToken<ArrayList<Blommor>>() {}.getType();
       blommorList = gson.fromJson(json, type);
       adapter.setBlommor(blommorList);
       adapter.notifyDataSetChanged();
       Log.d(TAG, json);
   }

}
