package com.example.retrofit_3_unit_3;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {
    /**** All the Api call will be write in this  class********/
    @Headers("Authorization: Client-ID 5200df071b612eb")
    @Multipart
    @POST("3/image")
    Call<ResponseModel> uploadImage(
        @Part MultipartBody.Part image
    );
}
