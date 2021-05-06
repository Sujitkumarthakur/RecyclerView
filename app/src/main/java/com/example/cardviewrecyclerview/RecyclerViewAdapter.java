package com.example.cardviewrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Viewholder> {
   public ArrayList<Customword> arrlist;
    Context context;
    public RecyclerViewAdapter(Context context, ArrayList arrlist) {
        this.arrlist=arrlist;
        this.context=context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_item, parent,false);
        Viewholder vh= new Viewholder(v); //pass the view to view holder
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Customword custom=arrlist.get(position);
        holder.txtques.setText(arrlist.get(position).getTxt());
        holder.imageid.setImageResource(arrlist.get(position).getMimageid());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This is what we wanted\n"+ arrlist.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrlist.size();
    }


    public static class Viewholder extends RecyclerView.ViewHolder{
       public TextView txtques;
       public ImageView imageid;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            txtques=itemView.findViewById(R.id.textques);
            imageid=itemView.findViewById(R.id.imageid);
            t

        }
    }

}
