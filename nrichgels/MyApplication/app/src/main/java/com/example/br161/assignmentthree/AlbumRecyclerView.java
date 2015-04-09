package com.example.br161.assignmentthree;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rl1065uq on 3/30/2015.
 */
public class AlbumRecyclerView extends Fragment {

    private RecyclerView recyclerAlbums;
    
    public AlbumRecyclerView() {
        
    }// End Constructor

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.album_recycler_view, container, false);
    }// End onCreateView

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerAlbums = (RecyclerView) view.findViewById(R.id.recycler_album);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerAlbums.setLayoutManager(layoutManager);
        List<Album> albums = mockAlbums();

        //I STILL NEED TO SET THE ADAPTER BELOW (SEE INSTRUCTOR'S CODE) !!!!!!!
        recyclerAlbums.setAdapter(new AlbumAdapter(albums));
    }

    private List<Album> mockAlbums() {
        // Creates a list of Contacts and fills them up with data
        List<Album> albums = new ArrayList<>();
        albums.add(new Album("Sam", "Front of the class"));
        albums.add(new Album("Sam", "Front of the class"));
        albums.add(new Album("Susie", "Back of the class"));
        albums.add(new Album("Hal", "Virginia (and sometimes DC)"));
        albums.add(new Album("Bernice", "Not even in this class"));
        albums.add(new Album("Sam", "Front of the class"));
        albums.add(new Album("Sam", "Front of the class"));
        albums.add(new Album("Susie", "Back of the class"));
        albums.add(new Album("Hal", "Virginia (and sometimes DC)"));
        albums.add(new Album("Bernice", "Not even in this class"));
        albums.add(new Album("Sam", "Front of the class"));
        albums.add(new Album("Sam", "Front of the class"));
        albums.add(new Album("Susie", "Back of the class"));

        return albums;
    }
}
