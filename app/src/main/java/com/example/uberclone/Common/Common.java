package com.example.uberclone.Common;

import com.example.uberclone.Remote.IGoogleApi;
import com.example.uberclone.Remote.RetrofitClient;

public class Common {
    public static final String baseUrl = "https://maps.google.com";
    public static IGoogleApi getGoogleAPI()
    {
        return RetrofitClient.getClient(baseUrl).create(IGoogleApi.class);
    }
}
