package com.example.zhouy.opensourceapp.log;

import android.util.Log;

/**
 * User: zhy
 * Date: 2016-08-31
 */
public class LogUtil {

    private static boolean logMode = true;


    public void setLogMode(boolean logMode) {
        this.logMode = logMode;
    }

    public static void log(String messge){
        if(logMode){
            Log.v("TAG",messge);
        }
    }
}
