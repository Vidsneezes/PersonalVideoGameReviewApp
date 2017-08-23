package com.moraleszez.videogamerr.videogamereviewer;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.JsonReader;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import com.moraleszez.videogamerr.backendcore.VideoGame;

import org.json.JSONObject;

public class VideoGamesViewActivity extends AppCompatActivity {

    AppBarLayout appBarLayoutRoot;
    TextView gamesListView;

    List<VideoGame> videoGames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_games_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        appBarLayoutRoot = (AppBarLayout) findViewById(R.id.app_bar);
        gamesListView = (TextView) findViewById(R.id.videogameslist);
        toolbar.setTitle("Games Title");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void LoadGamesToList()
    {
        JsonReader jsonReader = new JsonReader(new InputStreamReader( getAssets().open("videogames.json"));
        jsonReader.beginObject();

        while(jsonReader.hasNext())
        {
            String name = jsonReader.nextName();
        }
        jsonReader.endObject();

    }
}
