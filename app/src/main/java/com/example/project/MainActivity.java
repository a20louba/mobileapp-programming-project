package com.example.project;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
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

   @Override
    protected void onCreate(Bundle savedInstanceState) {

    }

    @Override


    public void onPostExecute(String json) {

    }

}
