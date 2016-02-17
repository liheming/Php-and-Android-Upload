package com.renegens.phpupload;

import retrofit.Callback;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

/**
 * Created by renegens on 16/02/16.
 */
public interface FileUploadService {

    //String BASE_URL = "http://79.170.40.244/";

    @Multipart
    @POST("/strayanimals.net/upload.php")
    void upload(@Part("myfile") TypedFile file,
                @Part("description") String description,
                Callback<String> cb);
}
