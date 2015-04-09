package com.example.br161.assignmentthree;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
                Log.d("wat", "All your base r belong 2 us");
            }
        });

        return viewHolder;
    }//End method onCreateViewHolder

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        holder.tvName.setText(albums.get(i).getAlbumName());
        holder.tvAddress.setText(albums.get(i).getArtist());
    }// End override method onBindVieHolder

    @Override
    public int getItemCount() {
        return albums.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ItemClickListener listener;
        TextView tvName;
        TextView tvAddress;
        public void onClick(View view) {}//End method onClick

        public ViewHolder(View itemView, ItemClickListener listener) {
            super(itemView);
            this.listener = listener;

            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvAddress = (TextView) itemView.findViewById(R.id.tv_address);

        }//End constructor

        public interface ItemClickListener
        {
            void onItemClick(View view, int position);
        }//End interface itemClickListener

    }//End inner class ViewHolder

}//End class AlbumAdapter
