package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class ContentActivity extends AppCompatActivity {

    private int state;
    private int page;
    private int sum_page;
    private TextView mTitle;
    private TextView mContent;
    private TextView mPageNum1;
    private TextView mPageNum2;
    private ScrollView mScrollView;

    String mChapter[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);


        mTitle = findViewById(R.id.titile);
        mContent = findViewById(R.id.content);
        mPageNum1 = findViewById(R.id.page_num1);
        mPageNum2 = findViewById(R.id.page_num2);
        mScrollView = findViewById(R.id.scrollview);

        Intent intent = getIntent();
        int message = intent.getIntExtra("Novel", 0);
        state = message;

        page = 1;
        if(state == 1) {
            mChapter = getResources().getStringArray(R.array.novel0);
            sum_page = mChapter.length;
            setPage(page);
            setNovel(page);
        }else if (state == 2) {
            mChapter = getResources().getStringArray(R.array.novel1);
            sum_page = mChapter.length;
            setPage(page);
            setNovel(page);
        }else if(state == 3) {
            mChapter = getResources().getStringArray(R.array.novel2);
            sum_page = mChapter.length;
            setPage(page);
            setNovel(page);
        }else if(state == 4) {
            mChapter = getResources().getStringArray(R.array.novel3);
            sum_page = mChapter.length;
            setPage(page);
            setNovel(page);
        }else if(state == 5) {
            mChapter = getResources().getStringArray(R.array.novel4);
            sum_page = mChapter.length;
            setPage(page);
            setNovel(page);
        }else if(state == 6) {
            mChapter = getResources().getStringArray(R.array.novel5);
            sum_page = mChapter.length;
            setPage(page);
            setNovel(page);
        }else if(state == 7) {
            mChapter = getResources().getStringArray(R.array.novel6);
            sum_page = mChapter.length;
            setPage(page);
            setNovel(page);
        }

    }

    public void Forward_page(View view) {
        if(page > 1) {
            page -= 1;
            setPage(page);
            setNovel(page);
            mScrollView.scrollTo(0,0);
        }else{
            displayToast("已經是第一章!");
        }
    }

    public void Next_page(View view) {
        if(page < mChapter.length) {
            page += 1;
            setPage(page);
            setNovel(page);
            mScrollView.scrollTo(0,0);
            //mScrollView.fullScroll(View.FOCUS_UP);
        }else{
            displayToast("已經是最後一章!");
        }
    }

    public void setPage(int p) {
        mTitle.setText("第" + page + "章");
        mPageNum1.setText( page + "/" + sum_page);
        mPageNum2.setText( page + "/" + sum_page);
    }

    public void setNovel(int p) {
        mContent.setText(mChapter[p - 1]);
        mPageNum1.setText( page + "/" + sum_page);
        mPageNum2.setText( page + "/" + sum_page);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
}