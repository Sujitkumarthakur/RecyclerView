package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Viewholder>{

    ArrayList arr;
    Context context;
    public RecyclerViewAdapter(Context context, ArrayList arr) {
        this.context = context;
        this.arr = arr;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflate the item Layout
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_view, parent,false);
        Viewholder vh= new Viewholder(v); //pass the view to view holder
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        holder.txt1.setText((Integer) arr.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This is RecyclerView\n"+arr.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return arr.size();
    }

    public class Viewholder  extends RecyclerView.ViewHolder {
        TextView txt1;
        RelativeLayout parentlayout;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            txt1= itemView.findViewById(R.id.txt1);
            parentlayout=itemView.findViewById(R.id.RLayout);
        }
    }
}
