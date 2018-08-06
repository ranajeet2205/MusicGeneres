package com.example.android.musicgeneres;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {


    public SongAdapter(Activity context, ArrayList<Song>popSongArrayList) {
        super(context, 0, popSongArrayList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list, parent, false);
        }

        // object located at this position in the list
        Song currentSong = getItem(position);

        // TextView of songName
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.sName);
        songNameTextView.setText(currentSong.getSongName());

        // TextView of artistName
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.aName);
        artistTextView.setText(currentSong.getArtistName());

        // ImageView of song
        ImageView songIconView = (ImageView) listItemView.findViewById(R.id.song_logo);
        songIconView.setImageResource(currentSong.getSongImage());

        return listItemView;
    }
}
