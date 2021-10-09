package com.futuregen.bocandroid.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "transaction.db";

    public DBHandler(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_WORKER =
                "CREATE TABLE " + DBMaster.Transaction.TABLE_NAME + "(" +
                        DBMaster.Transaction._ID + " INTEGER PRIMARY KEY," +
                        DBMaster.Transaction.COLUMN_ACC_NAME + " TEXT," +
                        DBMaster.Transaction.COLUMN_ACC_NO + " TEXT," +
                        DBMaster.Transaction.COLUMN_DATE + " TEXT," +
                        DBMaster.Transaction.COLUMN_DESC + " TEXT," +
                        DBMaster.Transaction.COLUMN_AMOUNT + " TEXT )";

        db.execSQL(CREATE_WORKER);


        String CREATE_USER =
                "CREATE TABLE " + DBMaster.Register.TABLE_NAME + "(" +
                        DBMaster.Register._ID + " INTEGER PRIMARY KEY," +
                        DBMaster.Register.COLUMN_USER_NAME + " TEXT," +
                        DBMaster.Register.COLUMN_PASSWORD + " TEXT )";

        db.execSQL(CREATE_USER);


    }


    public long MakeTransactions(String acname, String acno, String date, String desc, String amount) {

        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(DBMaster.Transaction.COLUMN_ACC_NAME, acname);
        cv.put(DBMaster.Transaction.COLUMN_ACC_NO, acno);
        cv.put(DBMaster.Transaction.COLUMN_DATE, date);
        cv.put(DBMaster.Transaction.COLUMN_DESC, desc);
        cv.put(DBMaster.Transaction.COLUMN_AMOUNT, amount);


        return db.insert(DBMaster.Transaction.TABLE_NAME, null, cv);
    }


    public long registerUser(String username, String password) {

        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(DBMaster.Register.COLUMN_USER_NAME, username);
        cv.put(DBMaster.Register.COLUMN_PASSWORD, password);


        return db.insert(DBMaster.Register.TABLE_NAME, null, cv);
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

