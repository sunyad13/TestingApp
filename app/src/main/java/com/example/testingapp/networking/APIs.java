package com.example.testingapp.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIs {
    String BASE_URL = "https://verify.infraveo.com/";

    @GET("api/userlist.php")
    Call<List<ProductResult>> getProducts();
}
