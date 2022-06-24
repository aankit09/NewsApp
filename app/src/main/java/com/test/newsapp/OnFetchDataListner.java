package com.test.newsapp;

import com.test.newsapp.models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListner<NewApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String message);
    void Error(String message);

}
