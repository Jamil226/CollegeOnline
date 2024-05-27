package com.jamil.college.utils;

import com.jamil.college.models.NewsModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("LoadNews.php")
    Call<NewsModel> fetchNews();

}
