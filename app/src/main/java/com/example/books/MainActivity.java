package com.example.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.books.models.Book;
import com.example.books.utils.Item;
import com.example.books.utils.Items;
import com.example.books.utils.VolumeInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public  static final  String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadResponse();
    }


    public  void loadResponse(){


        ApiService apiService = ApiClient.getClient().create(ApiService.class);
        Call<Items> call = apiService.getBooks("book");

        call.enqueue(new Callback<Items>() {
            @Override
            public void onResponse(Call<Items> call, Response<Items> response) {
                Items items = response.body();

                System.out.println(items);
                System.out.println("hello");

                Log.d(TAG, "onResponse: Response Fetched");

            }
            @Override
            public void onFailure(Call<Items> call, Throwable t) {

                System.out.println("hello  " + t);

            }
        });


    }
}