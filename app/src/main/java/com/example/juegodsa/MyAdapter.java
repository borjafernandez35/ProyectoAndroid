package com.example.juegodsa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.juegodsa.API.Track;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<Track> trackList;

    public MyAdapter(ArrayList<Track> trackList) {
        this.trackList = trackList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTxt;

        public MyViewHolder(final View view) {
            super(view);
            titleTxt = view.findViewById(R.id.editTextTitle);
        }
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View addTrackView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_update_track, parent, false);
        return new MyViewHolder(addTrackView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        String title = trackList.get(position).getTitle();
        holder.titleTxt.setText(title);
    }

    @Override
    public int getItemCount() {
        return trackList.size();
    }
}

