package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NovelActivity extends AppCompatActivity {
    private  int state;
    private TextView mEnd;
    private TextView mNovel_name;
    private TextView mAuthor_name;
    private TextView mNovel_content;
    private ImageView mImage;


    String mName[], mAuthor[], mContent[], mChapter[];
    int mImages[] = {R.drawable.novel0,R.drawable.novel1, R.drawable.novel2, R.drawable.novel3,
            R.drawable.novel4, R.drawable.novel5, R.drawable.novel6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel);

        mName = getResources().getStringArray(R.array.novel_name);
        mAuthor = getResources().getStringArray(R.array.novel_author);
        mContent = getResources().getStringArray(R.array.novel_content);

        mEnd = findViewById(R.id.text2);
        mNovel_name = findViewById(R.id.name);
        mAuthor_name = findViewById(R.id.author_name);
        mNovel_content = findViewById(R.id.content0);
        mImage = findViewById(R.id.cover_image);

        Intent intent = getIntent();
        int message = intent.getIntExtra("Num", 0);

        state = message + 1;
        if(state == 1) {
            mEnd.setText(R.string.end);
            mNovel_name.setText("<<" + mName[state - 1] + ">>");
            mAuthor_name.setText(mAuthor[state - 1]);
            mNovel_content.setText(mContent[state - 1]);
            mChapter = getResources().getStringArray(R.array.novel0);
            mImage.setImageResource(mImages[state - 1]);
        }else if(state == 2) {
            mEnd.setText(R.string.not_end);
            mNovel_name.setText("<<" + mName[state - 1] + ">>");
            mAuthor_name.setText(mAuthor[state - 1]);
            mNovel_content.setText(mContent[state - 1]);
            mChapter = getResources().getStringArray(R.array.novel1);
            mImage.setImageResource(mImages[state - 1]);
        }else if(state == 3) {
            mEnd.setText(R.string.end);
            mNovel_name.setText("<<" + mName[state - 1] + ">>");
            mAuthor_name.setText(mAuthor[state - 1]);
            mNovel_content.setText(mContent[state - 1]);
            mChapter = getResources().getStringArray(R.array.novel2);
            mImage.setImageResource(mImages[state - 1]);
        }else if(state == 4) {
            mEnd.setText(R.string.end);
            mNovel_name.setText("<<" + mName[state - 1] + ">>");
            mAuthor_name.setText(mAuthor[state - 1]);
            mNovel_content.setText(mContent[state - 1]);
            mChapter = getResources().getStringArray(R.array.novel3);
            mImage.setImageResource(mImages[state - 1]);
        }else if(state == 5) {
            mEnd.setText(R.string.not_end);
            mNovel_name.setText("<<" + mName[state - 1] + ">>");
            mAuthor_name.setText(mAuthor[state - 1]);
            mNovel_content.setText(mContent[state - 1]);
            mChapter = getResources().getStringArray(R.array.novel4);
            mImage.setImageResource(mImages[state - 1]);
        }else if(state == 6) {
            mEnd.setText(R.string.not_end);
            mNovel_name.setText("<<" + mName[state - 1] + ">>");
            mAuthor_name.setText(mAuthor[state - 1]);
            mNovel_content.setText(mContent[state - 1]);
            mChapter = getResources().getStringArray(R.array.novel5);
            mImage.setImageResource(mImages[state - 1]);
        }else if(state == 7) {
            mEnd.setText(R.string.not_end);
            mNovel_name.setText("<<" + mName[state - 1] + ">>");
            mAuthor_name.setText(mAuthor[state - 1]);
            mNovel_content.setText(mContent[state - 1]);
            mChapter = getResources().getStringArray(R.array.novel6);
            mImage.setImageResource(mImages[state - 1]);
        }
    }

    public void StartRead(View view) {
        if(mChapter.length >= 1) {
            Intent intent = new Intent(NovelActivity.this, ContentActivity.class);
            intent.putExtra("Novel", state);
            startActivity(intent);
        }else{
            displayToast("目前沒有章節!");
        }

    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
}