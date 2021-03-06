package com.mohamed.mario.worker.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtils {

    /**
     * Searched From Stack-Overflow post
     * PLUS ==> I added .isConnected() as we need to be connected to perform the request
     * @return true if device has online network, false otherwise.
     */
    public static boolean isCurrentlyOnline(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo netInfo = null;
        if (cm != null)
            netInfo = cm.getActiveNetworkInfo();

        return netInfo != null && netInfo.isConnectedOrConnecting() && netInfo.isConnected();
    }
}
