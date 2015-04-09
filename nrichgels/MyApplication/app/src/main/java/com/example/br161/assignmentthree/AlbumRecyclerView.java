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
        albums.add(new Album("A Night at the Opera", "Queen", "Elektra", 12, 1975));
        albums.add(new Album("Bo Burnham", "Bo Burnham", "Comedy Central Records", 13, 2009));
        albums.add(new Album("American Idiot", "Green Day", "Reprise", 13, 2004 ));
        albums.add(new Album("The Biz Never Sleeps", "Biz Markie", "Warner Bros. Records", 13, 1989));
        albums.add(new Album("Daler Mehndi", "Tunak Tunak Tun", "MagnaSound", 8, 1998));
        albums.add(new Album("Blink", "Plumb", "Curb", 10, 2007));
        albums.add(new Album("Floored", "Sugar Ray", "Atlantic", 13, 1997));
        /*albums.add(new Album("Susie", "Back of the class"));
        albums.add(new Album("Hal", "Virginia (and sometimes DC)"));
        albums.add(new Album("Bernice", "Not even in this class"));*/

        return albums;
    }
}
