package com.example.android.musicgeneres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        //ArrayList of jazzsongs

        ArrayList<Song> jazzSongArrayList = new ArrayList<Song>();

        jazzSongArrayList.add(new Song("In The Mood","Glen Miller",R.drawable.song_logo));
        jazzSongArrayList.add(new Song("What A Wonderful World","Louis Daniel Armstrong",R.drawable.song_logo));
        jazzSongArrayList.add(new Song("All Blues","Miles Davis",R.drawable.song_logo));
        jazzSongArrayList.add(new Song("The Look Of Love","Diana Krall",R.drawable.song_logo));
        jazzSongArrayList.add(new Song("Song For My Father","Horace Silver",R.drawable.song_logo));
        jazzSongArrayList.add(new Song("Champagne Life","Norman Brown",R.drawable.song_logo));
        jazzSongArrayList.add(new Song("Sweet Summer Nights","Najee",R.drawable.song_logo));
        jazzSongArrayList.add(new Song("Fly Me To The Moon","Frank Sinatra",R.drawable.song_logo));
        jazzSongArrayList.add(new Song("Little Sunflower","Freddi Hubbard",R.drawable.song_logo));
        jazzSongArrayList.add(new Song("At Last","Etta James",R.drawable.song_logo));


        SongAdapter songAdapter = new SongAdapter(this,jazzSongArrayList);

        ListView popSongListView = (ListView) findViewById(R.id.pop_song_list);
        popSongListView.setAdapter(songAdapter);
    }
}
