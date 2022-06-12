package com.example.myapplication;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder>{

    String mNovel_name[], mNovel_author[];
    int mImages[];
    Context mContext;

    private final LayoutInflater mInflater;

    private Intent intent;



    public WordListAdapter(Context context, String novel_name[], String novel_author[], int images[]) {
        mInflater = LayoutInflater.from(context);
        mNovel_name = novel_name;
        mNovel_author = novel_author;
        mImages = images;
        mContext = context;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        holder.mName.setText("<<" + mNovel_name[position] + ">>");
        holder.mAuthor.setText("作者 : " + mNovel_author[position]);
        holder.mImage.setImageResource(mImages[position]);
    }

    @Override
    public int getItemCount() {
        return mNovel_name.length;
    }

    public void getIntent(Intent t){
        intent = t;
    }

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mName, mAuthor;
        ImageView mImage;

        final WordListAdapter mAdapter;


        public WordViewHolder(@NonNull View itemView,  WordListAdapter adapter) {
            super(itemView);
            mName = itemView.findViewById(R.id.novel_name);
            mAuthor = itemView.findViewById(R.id.novel_author);
            mImage = itemView.findViewById(R.id.image1);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
            intent.putExtra("Num", mPosition);
            view.getContext() .startActivity(intent);
        }
    }
}
