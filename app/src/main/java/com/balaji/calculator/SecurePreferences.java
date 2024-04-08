package com.balaji.calculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;


public class SecurePreferences {

	public static void savePreferences(Context context, String key, String value) {
		if(context != null)
		{
			SharedPreferences preferences = context.getSharedPreferences("appdata", Context.MODE_PRIVATE);
			Editor editor = preferences.edit();
			editor.putString(key,value);
			editor.apply();
		}
	}

	public static void savePreferences(Context context, String key, int value) {
		if(context != null) {
			SharedPreferences preferences = context.getSharedPreferences("appdata", Context.MODE_PRIVATE);
			Editor editor = preferences.edit();
			editor.putInt(key, value);
			editor.apply();
		}
	}

	public static void savePreferences(Context context, String key, long value) {
		if(context != null) {
			SharedPreferences preferences = context.getSharedPreferences("appdata", Context.MODE_PRIVATE);
			Editor editor = preferences.edit();
			editor.putLong(key,value);
			editor.apply();
		}
	}

	public static void savePreferences(Context context, String key, Boolean value) {
		if(context != null) {
			SharedPreferences preferences = context.getSharedPreferences("appdata", Context.MODE_PRIVATE);
			Editor editor = preferences.edit();
			editor.putBoolean(key, value);
			editor.apply();
		}
	}

	public static String getStringPreference(Context context, String key) {
		String value = "";
		if (context != null) {
			SharedPreferences preferences = context.getSharedPreferences("appdata", Context.MODE_PRIVATE);
			value = preferences.getString(key,"");
		}
		return value;
	}

	public static int getIntegerPreference(Context context, String key) {
		SharedPreferences preferences = context.getSharedPreferences("appdata", Context.MODE_PRIVATE);
		return preferences.getInt(key, 0);
	}

	public static long getLongPreference(Context context, String key)
	{
		SharedPreferences preferences = context.getSharedPreferences("appdata", Context.MODE_PRIVATE);
		try {
			return preferences.getLong(key, 0);
		}
		catch (Exception e)
		{
			return preferences.getInt(key, 0);
		}

	}

	public static boolean getBooleanPreference(Context context, String key)
	{
		try {
			SharedPreferences preferences = context.getSharedPreferences("appdata", Context.MODE_PRIVATE);
			return preferences.getBoolean(key, false);
		}
		catch (Exception e)
		{
			return false;
		}
	}

	public static void clearSecurepreference(Context context) {
		if(context != null) {
			SharedPreferences preferences = context.getSharedPreferences("appdata", Context.MODE_PRIVATE);
			preferences.edit().clear().apply();
		}
	}

	public static void savePreferencesLocation(Context context, String key, String value) {
		if(context != null)
		{
			SharedPreferences preferences = context.getSharedPreferences("APP_LOCATION_DATA", Context.MODE_PRIVATE);
			Editor editor = preferences.edit();
			editor.putString(key,value);
			editor.apply();
		}
	}

	public static String getStringPreferenceLocation(Context context, String key) {
		String value = "";
		if (context != null) {
			SharedPreferences preferences = context.getSharedPreferences("APP_LOCATION_DATA", Context.MODE_PRIVATE);
			value = preferences.getString(key,"");
		}
		return value;
	}

	public static void clearSecurepreferenceLocation(Context context) {
		if(context != null) {
			SharedPreferences preferences = context.getSharedPreferences("APP_LOCATION_DATA", Context.MODE_PRIVATE);
			preferences.edit().clear().apply();
		}
	}


}