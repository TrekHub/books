package com.example.books;

import com.example.books.models.Book;
import com.example.books.models.Books;
import com.example.books.utils.Items;
import com.example.books.utils.VolumeInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("volumes")
    Call<Items> getBooks(@Query("q") String bookParam);
}
