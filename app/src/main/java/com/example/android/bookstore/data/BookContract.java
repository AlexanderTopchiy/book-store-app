package com.example.android.bookstore.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

import java.net.URI;

/**
 * API Contract for the Book Store app.
 */
public final class BookContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private BookContract() {}

    public static final String CONTENT_AUTHORITY = "com.example.android.bookstore";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_BOOKS = "books";

    /**
     * Inner class that defines constant values for the books database table.
     * Each entry in the table represents a single book.
     */
    public static final class BookEntry implements BaseColumns {

        //The MIME type of the {@link #CONTENT_URI} for a list of books.
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_BOOKS;

        //The MIME type of the {@link #CONTENT_URI} for a single book.
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_BOOKS;

        // The content URI to access the pet data in the provider
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_BOOKS);

        // Name of database table for books.
        public static final String TABLE_NAME = "books";

        // Unique ID number for the book (only for use in the database table).
        // Type: INTEGER
        public static final String _ID = BaseColumns._ID;

        // Author of the book.
        // Type: TEXT
        public static final String COLUMN_BOOK_AUTHOR = "author";

        // Name of the book.
        // Type: TEXT
        public static final String COLUMN_BOOK_NAME = "book_name";

        // Price of the book (in cents).
        // Type: INTEGER
        public static final String COLUMN_BOOK_PRICE = "price";

        // Quantity of the book.
        // Type: INTEGER
        public static final String COLUMN_BOOK_QUANTITY = "quantity";

        // Name of the book supplier
        // Type: TEXT
        public static final String COLUMN_BOOK_SUPPLIER_NAME = "supplier_name";

        // Phone number of the book supplier
        // Type: TEXT
        public static final String COLUMN_BOOK_SUPPLIER_PHONE_NUMBER = "supplier_phone_number";
    }
}