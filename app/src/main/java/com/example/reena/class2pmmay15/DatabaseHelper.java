package com.example.reena.class2pmmay15;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper{

    static String name="class2pmmay15";
    static int version=1;

    String SQLCreateTable="CREATE TABLE `user` (\n" +
            "\t`ID`\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "\t`username`\tTEXT,\n" +
            "\t`password`\tTEXT,\n" +
            "\t`email`\tTEXT,\n" +
            "\t`address`\tTEXT,\n" +
            "\t`phone`\tTEXT,\n" +
            "\t`gender`\tTEXT,\n" +
            "\t`image`\tBLOB\n" +
            ")";
     public DatabaseHelper(Context context)
     {
         super(context,name,factory:null,version);
     }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}