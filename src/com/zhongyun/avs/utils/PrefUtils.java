package com.zhongyun.avs.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class PrefUtils {
	
	public static final String HAVE_SHOW_GUIDE = "have_show_guide";

	public static void putBoolean(Context context, String key, boolean value){
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
		Editor editor = sp.edit();
		editor.putBoolean(key, value);
		editor.commit();
	}
	
	public static boolean getBoolean(Context context, String key){
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
		return sp.getBoolean(key, false);
	}
}
