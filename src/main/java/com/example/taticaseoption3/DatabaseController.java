package com.example.taticaseoption3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DatabaseController extends SQLiteOpenHelper {

    public static final String WEIGHT_TABLE = "WEIGHT_TABLE";
    public static final String COLUMN_USER_DATE = "USER_DATE";
    public static final String COLUMN_USER_WEIGHT = "USER_WEIGHT";
    public static final String COLUMN_ID = "ID";

    public DatabaseController(@Nullable Context context) {
        super(context, "weight_log.db", null, 1);
    }

    // instantiate DB
    @Override
    public void onCreate(SQLiteDatabase db) {

        String createTableStatement = "CREATE TABLE " + WEIGHT_TABLE + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_USER_DATE + " TEXT, " + COLUMN_USER_WEIGHT + " INTEGER)";

        db.execSQL(createTableStatement);
    }


    //do changes
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public boolean Add(ViewModel viewModel) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_USER_DATE, viewModel.getDate());
        cv.put(COLUMN_USER_WEIGHT, viewModel.getWeight());

        long insert = db.insert(WEIGHT_TABLE, null, cv);
        if (insert == -1) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean Remove(ViewModel viewModel) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.remove(COLUMN_USER_DATE);
        cv.remove(COLUMN_USER_WEIGHT);

        long insert = db.insert(WEIGHT_TABLE, null, cv);
        if (insert == -1) {
            return false;
        }
        else {
            return true;
        }
    }


    public List<ViewModel> GetAll() {
        List<ViewModel> returnList = new ArrayList<>();

        String queryString = "SELECT * FROM " + WEIGHT_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()){
            do {

                int idNum = cursor.getInt(0);
                String userDate = cursor.getString(1);
                int userWeight = cursor.getInt(2);

                ViewModel newEntry = new ViewModel(idNum, userDate, userWeight);
                returnList.add(newEntry);

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return returnList;
    }
}

