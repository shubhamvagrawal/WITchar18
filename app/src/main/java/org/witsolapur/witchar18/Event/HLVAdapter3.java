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

public class HLVAdapter3 extends RecyclerView.Adapter<HLVAdapter3.ViewHolder> {

    ArrayList<String> alName3;
    ArrayList<Integer> alImage3;
    Context context;

    public HLVAdapter3(Context context, ArrayList<String> alName3, ArrayList<Integer> alImage3) {
        super();
        this.context = context;
        this.alName3 = alName3;
        this.alImage3 = alImage3;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.tvSpecies.setText(alName3.get(i));
        viewHolder.imgThumbnail.setImageResource(alImage3.get(i));

        viewHolder.setClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                if (position == 0) {
                    Intent intent=new Intent(context, EventActivity.class);
                    intent.putExtra("graphname",alName3.get(position));
                    context.startActivity(intent);
                }
                if (position == 1) {
                    Intent intent=new Intent(context, EventActivity.class);
                    intent.putExtra("graphname",alName3.get(position));
                    context.startActivity(intent);
                }
                if (position == 2) {
                    Intent intent=new Intent(context, EventActivity.class);
                    intent.putExtra("graphname",alName3.get(position));
                    context.startActivity(intent);
                }
                if (position == 3) {
                    Intent intent=new Intent(context, EventActivity.class);
                    intent.putExtra("graphname",alName3.get(position));
                    context.startActivity(intent);
                }
                if (position == 4) {
                    Intent intent=new Intent(context, EventActivity.class);
                    intent.putExtra("graphname",alName3.get(position));
                    context.startActivity(intent);
                }
                if (position == 5) {
                    Intent intent=new Intent(context, EventActivity.class);
                    intent.putExtra("graphname",alName3.get(position));
                    context.startActivity(intent);
                }
                if (position == 6) {
                    Intent intent=new Intent(context, EventActivity.class);
                    intent.putExtra("graphname",alName3.get(position));
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return alName3.size();
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

