package com.example.uberclone.Common;

import com.example.uberclone.Remote.IGoogleApi;
import com.example.uberclone.Remote.RetrofitClient;

public class Common {

    public static final String courier_tbl = "Drivers";
    public static final String client_tbl = "ClientsInformation";
    public static final String user_courier_tbl = "CouriersInformation";
    public static final String package_request_tbl = "Pickup Request";


    public static final String baseUrl = "https://maps.google.com";
    public static IGoogleApi getGoogleAPI()
    {
        return RetrofitClient.getClient(baseUrl).create(IGoogleApi.class);
    }
}
