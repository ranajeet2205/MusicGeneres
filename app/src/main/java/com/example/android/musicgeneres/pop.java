package com.example.android.musicgeneres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class pop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        //ArrayList of popsongs

        ArrayList<Song> popSongArrayList = new ArrayList<Song>();

        popSongArrayList.add(new Song("No Tears Left To Cry","Ariana Grande",R.drawable.song_logo));
        popSongArrayList.add(new Song("Happy","Pharrell Williams",R.drawable.song_logo));
        popSongArrayList.add(new Song("Since Have You Gone","Kelly Clarkson",R.drawable.song_logo));
        popSongArrayList.add(new Song("Friends","Ann-Marie",R.drawable.song_logo));
        popSongArrayList.add(new Song("Shake It Off","Tylor Swift",R.drawable.song_logo));
        popSongArrayList.add(new Song("Perfect","Ed Sheeran",R.drawable.song_logo));
        popSongArrayList.add(new Song("My My My !","Troy Sivan",R.drawable.song_logo));
        popSongArrayList.add(new Song("Never Be The Same","Camila Cabello ",R.drawable.song_logo));
        popSongArrayList.add(new Song("On The Floor","Jennifer Lopez",R.drawable.song_logo));
        popSongArrayList.add(new Song("Blank Space","Tylor Swift",R.drawable.song_logo));


        SongAdapter songAdapter = new SongAdapter(this,popSongArrayList);

        ListView popSongListView = (ListView) findViewById(R.id.pop_song_list);
        popSongListView.setAdapter(songAdapter);
    }

}
