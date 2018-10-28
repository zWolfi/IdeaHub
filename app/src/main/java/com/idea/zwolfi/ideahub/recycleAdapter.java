package com.idea.zwolfi.ideahub;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class recycleAdapter extends RecyclerView.Adapter<recycleAdapter.MyViewHolder>{
    private Context mContext;
    private ArrayList<Recipe> mDataSource;
    private LayoutInflater mInflater;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public Button btnUp, btnDown;
        public TextView txtTitle, txtDetail;
        public LinearLayout llStatus;
        public View view;

        public MyViewHolder(View view) {
            super(view);
            this.view = view;
            txtTitle = (TextView)view.findViewById(R.id.listview_title);
            txtDetail = (TextView)view.findViewById(R.id.listview_detail);
            llStatus = (LinearLayout)view.findViewById(R.id.sidebar_status);
        }
    }

    public recycleAdapter(Context context, ArrayList<Recipe> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void add(Recipe items)
    {
        mDataSource.add(0, items);
        notifyDataSetChanged();
    }

    public void addEnd(Recipe items)
    {
        mDataSource.add(items);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mDataSource.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.listview_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Stuff
                }
                else if(event.getAction() == MotionEvent.ACTION_UP) {
                    //Other stuff
                }
                return true;
            }
        });

        switch(mDataSource.get(position).getMarkbar())
        {
            case 100:
                holder.llStatus.setBackgroundColor(R.color.colorRed);
            default:
                holder.llStatus.setVisibility(View.GONE);
                break;
        }

        holder.txtTitle.setText(mDataSource.get(position).getTitle());
        holder.txtDetail.setText(mDataSource.get(position).getDetail());
    }
}
