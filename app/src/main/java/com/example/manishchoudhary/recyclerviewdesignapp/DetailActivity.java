package com.example.manishchoudhary.recyclerviewdesignapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.net.Uri;

public class DetailActivity extends AppCompatActivity {

    TextView txtName,txtCount;
    ImageView imgAlbum;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        txtName = (TextView)findViewById(R.id.txtName);
        txtCount = (TextView)findViewById(R.id.txtNoOfSongs);
        imgAlbum = (ImageView)findViewById(R.id.imgAlbum);

        Intent intent = getIntent();
        String albumName = intent.getStringExtra("Album Name");
        int songsCount = intent.getIntExtra("Number of Songs",0);
        int resID =  intent.getIntExtra("ThumbnailURL",0);

        imgAlbum.setImageResource(resID);
        txtName.setText(albumName);
        txtCount.setText("" + songsCount);
    }
}
