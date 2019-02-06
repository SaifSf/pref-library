package com.example.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.securepreferences.SecurePreferences;

public class pref {
    private static final String PREF_FILENAME = "sfs_prefs";
    private final String TAG = "waaa temchii ";


    public static SharedPreferences getSharedPreferences(Context context) {
        return new SecurePreferences(context, "null", PREF_FILENAME);
    }


    public static SharedPreferences.Editor getEditor(Context context) {
        return getSharedPreferences(context).edit();
    }

    public static void postPass(Context context, String s) {
        getEditor(context).putString("pwd", s).apply();
        Log.i("waaaa temchihih", "postPass: " + s);
    }

    public static String getPass(Context context) {
        Log.i("ranii fi getttPass", "getPass: ");
        return getSharedPreferences(context).getString("pwd", null);
    }

}
