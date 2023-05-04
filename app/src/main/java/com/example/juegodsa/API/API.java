package com.example.juegodsa.API;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface API {
    public static final String BASE_URL = "http://localhost:8080/dsaApp/";

    @GET("tracks")
    Call<List<Track>> getTracks();

    @POST("tracks")
    Call<Track> addTrack(@Body Track track);

    @PUT("tracks")
    Call<Void> editTrack(@Body Track track);

    @DELETE("tracks/{id}")
    Call<Void> deleteTrack(@Path("id") String trackid);
}