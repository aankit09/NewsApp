package com.test.newsapp.models;

import java.util.List;

public class NewsApiResponse {
    String status;
    int totalResults;
    List<NewsHeadlines> articals;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewsHeadlines> getArticals() {
        return articals;
    }

    public void setArticals(List<NewsHeadlines> articals) {
        this.articals = articals;
    }
}
