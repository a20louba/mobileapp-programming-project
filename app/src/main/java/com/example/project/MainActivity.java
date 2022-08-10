package com.example.project;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("FieldCanBeLocal")

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

   private final String URL = "https://mobprog.webug.se/json-api?login=a20louba";
   RecyclerView recyclerView;
   private List<Blomma> blommaList;
   private BlommorAdapter adapter;
   private final String TAG = "===>";


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       adapter = new BlommorAdapter();
       blommaList = new ArrayList<Blomma>();

       recyclerView = findViewById(R.id.blommor_recycler);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(adapter);

   }

   @Override
   public void onPostExecute(String json) {
       Gson gson = new Gson();
       Type type = new TypeToken<ArrayList<Blomma>>() {}.getType();
       blommaList = gson.fromJson(json, type);
       adapter.setBlommor(blommaList);
       adapter.notifyDataSetChanged();
       Log.d(TAG, json);
   }

}
