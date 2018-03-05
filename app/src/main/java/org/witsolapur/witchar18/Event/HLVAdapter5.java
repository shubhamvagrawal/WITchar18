package org.witsolapur.witchar18.Event;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.witsolapur.witchar18.R;

import java.util.ArrayList;


public class HLVAdapter5 extends RecyclerView.Adapter<HLVAdapter5.ViewHolder> {

    ArrayList<String> alName5;
    ArrayList<Integer> alImage5;
    Context context;

    public HLVAdapter5(Context context, ArrayList<String> alName5, ArrayList<Integer> alImage5) {
        super();
        this.context = context;
        this.alName5 = alName5;
        this.alImage5 = alImage5;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.quiz_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.tvSpecies.setText(alName5.get(i));
        viewHolder.imgThumbnail.setImageResource(alImage5.get(i));

        viewHolder.setClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                if (position == 0) {
                    Intent intent=new Intent(context, EventActivity.class);
                    intent.putExtra("graphname",alName5.get(position));
                    context.startActivity(intent);
                    }
                if (position == 1) {
                    Intent intent=new Intent(context, EventActivity.class);
                    intent.putExtra("graphname",alName5.get(position));
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return alName5.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        public ImageView imgThumbnail;
        public TextView tvSpecies;
        private ItemClickListener clickListener;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView) itemView.findViewById(R.id.img_thumbnail);
            tvSpecies = (TextView) itemView.findViewById(R.id.tv_species);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        public void setClickListener(ItemClickListener itemClickListener) {
            this.clickListener = itemClickListener;
        }

        @Override
        public void onClick(View view) {
            clickListener.onClick(view, getPosition(), false);
        }

        @Override
        public boolean onLongClick(View view) {
            clickListener.onClick(view, getPosition(), true);
            return true;
        }


    }

}

