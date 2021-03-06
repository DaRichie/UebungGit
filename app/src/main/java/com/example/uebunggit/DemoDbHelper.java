package com.example.uebunggit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.location.LocationManager;

public class DemoDbHelper extends SQLiteOpenHelper {

    private final static String DB_NAME="tracking.db";
    private final static int DB_VERSION=1;

    public DemoDbHelper(Context context) {
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create TABLE Tracking (Longitude DOUBLE,Latitude DOUBLE,Date STRING,Time STRING)");
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop Table IF EXISTS Tracking");
        onCreate(db);
    }

}
