package com.example.android.bookstore;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.android.bookstore.data.BookContract.BookEntry;
import com.example.android.bookstore.data.BookDbHelper;

/**
 * Displays list of books that were entered and stored in the app.
 */
public class CatalogActivity extends AppCompatActivity {

    // Database helper that will provide us access to the database.
    private BookDbHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        // To access our database, we instantiate our subclass of SQLiteOpenHelper
        // and pass the context, which is the current activity.
        mDbHelper = new BookDbHelper(this);
        insertData();
    }

    /**
     * Insert new books into database.
     */
    private void insertData() {
        // Create database helper.
        BookDbHelper mDbHelper = new BookDbHelper(this);

        // Gets the database in write mode.
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        // Create a ContentValues object where column names are the keys,
        // and book attributes are the values.
        ContentValues values = new ContentValues();
        values.put(BookEntry.COLUMN_BOOK_AUTHOR, "Azimov");
        values.put(BookEntry.COLUMN_BOOK_NAME, "Foundation");
        values.put(BookEntry.COLUMN_BOOK_PRICE, 2000);
        values.put(BookEntry.COLUMN_BOOK_QUANTITY, 7);
        values.put(BookEntry.COLUMN_BOOK_SUPPLIER_NAME, "Piter");
        values.put(BookEntry.COLUMN_BOOK_SUPPLIER_PHONE_NUMBER, "81335548833");

        // Insert a new row for book in the database, returning the ID of that new row.
        long newRowId = db.insert(BookEntry.TABLE_NAME, null, values);

        Log.v("Insertion of book", "New ID of row is " + newRowId);
    }
}
