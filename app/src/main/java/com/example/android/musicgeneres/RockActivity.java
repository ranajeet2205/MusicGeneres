package com.example.android.musicgeneres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        //Arraylist of rocksongs

        ArrayList<Song> rockSongArrayList = new ArrayList<Song>();

        rockSongArrayList.add(new Song("Free Bird", "Lynyd Skynyd", R.drawable.song_logo));
        rockSongArrayList.add(new Song("Whole Lotta Love", "Led Zeppelin", R.drawable.song_logo));
        rockSongArrayList.add(new Song("Walk This Way", "Aerosmith", R.drawable.song_logo));
        rockSongArrayList.add(new Song("All Along The Watchtower", "Jimmi Hendrix", R.drawable.song_logo));
        rockSongArrayList.add(new Song("Free Fallin", "Tom Petty", R.drawable.song_logo));
        rockSongArrayList.add(new Song("Sweet Emotion", "Aerosmith", R.drawable.song_logo));
        rockSongArrayList.add(new Song("Summer Of '69", "Bryan Adams", R.drawable.song_logo));
        rockSongArrayList.add(new Song("Bulletproof", "Godsmack", R.drawable.song_logo));
        rockSongArrayList.add(new Song("Another Brick In The Wall", "Pink Floyd", R.drawable.song_logo));
        rockSongArrayList.add(new Song("Smells like Teen Spirit", "Nirvana", R.drawable.song_logo));


        SongAdapter songAdapter = new SongAdapter(this, rockSongArrayList);

        ListView popSongListView = (ListView) findViewById(R.id.pop_song_list);
        popSongListView.setAdapter(songAdapter);

    }
}
