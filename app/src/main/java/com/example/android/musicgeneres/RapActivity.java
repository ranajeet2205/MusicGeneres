package com.example.android.musicgeneres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        //ArrayList of rapsongs

        ArrayList<Song> rapSongArrayList = new ArrayList<Song>();

        rapSongArrayList.add(new Song("I'M Upset","Drake",R.drawable.song_logo));
        rapSongArrayList.add(new Song("Slow Down","Brand Nubian",R.drawable.song_logo));
        rapSongArrayList.add(new Song("First Day Out","Tee Grizzley",R.drawable.song_logo));
        rapSongArrayList.add(new Song("I Get The Bag","Gucci Mane",R.drawable.song_logo));
        rapSongArrayList.add(new Song("Stan","Eminem",R.drawable.song_logo));
        rapSongArrayList.add(new Song("Jump","Kris Kross",R.drawable.song_logo));
        rapSongArrayList.add(new Song("God's Plan","Drake",R.drawable.song_logo));
        rapSongArrayList.add(new Song("Bodak Yellow","Cardi B.",R.drawable.song_logo));
        rapSongArrayList.add(new Song("Paul Revere","Beastie Boys",R.drawable.song_logo));
        rapSongArrayList.add(new Song("No Type","Rae Sremmurd",R.drawable.song_logo));


        SongAdapter songAdapter = new SongAdapter(this,rapSongArrayList);

        ListView popSongListView = (ListView) findViewById(R.id.pop_song_list);
        popSongListView.setAdapter(songAdapter);


    }
}
