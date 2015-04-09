package com.example.br161.assignmentthree;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by rl1065uq on 4/1/2015.
 */
public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.ViewHolder> {

    List<Album> albums;

    public AlbumAdapter(List<Album> albums)
    {
        this.albums = albums;

    }//End Constructor

    public ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        ViewHolder viewHolder = new ViewHolder(view, new ViewHolder.ItemClickListener()
        {
            @Override
            public void onItemClick(View view, int position) {
                //Handle clicks here.
                Log.d("wat", albums.get(position).getArtist());
            }
        });

        return viewHolder;
    }//End method onCreateViewHolder

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        holder.tvAlbum.setText(albums.get(i).getAlbumName());
        holder.tvArtist.setText(albums.get(i).getArtist());
        holder.tvPublisher.setText(albums.get(i).getPublisher());
        holder.tvTracks.setText("Tracks: " + albums.get(i).getTrackCount());
        holder.tvYear.setText("" + albums.get(i).getYear());
    }// End override method onBindVieHolder

    @Override
    public int getItemCount() {
        return albums.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ItemClickListener listener;
        TextView tvAlbum;
        TextView tvArtist;
        TextView tvPublisher;
        TextView tvTracks;
        TextView tvYear;

        RelativeLayout regularLayout;


        public ViewHolder(View itemView, ItemClickListener listener) {
            super(itemView);
            this.listener = listener;

            tvAlbum = (TextView) itemView.findViewById(R.id.tv_album);
            tvArtist = (TextView) itemView.findViewById(R.id.tv_artist);
            tvPublisher = (TextView) itemView.findViewById(R.id.tv_publisher);
            tvTracks = (TextView) itemView.findViewById(R.id.tv_tracks);
            tvYear = (TextView) itemView.findViewById(R.id.tv_year);
            regularLayout = (RelativeLayout) itemView.findViewById(R.id.regLayout);

            regularLayout.setOnClickListener(this);
        }//End constructor

        public void onClick(View view) {listener.onItemClick(view, getPosition());}//End method onClick

        public interface ItemClickListener
        {
            void onItemClick(View view, int position);
        }//End interface itemClickListener

    }//End inner class ViewHolder

}//End class AlbumAdapter
