package com.example.android.bookstore.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Book Store app.
 */
public final class BookContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private BookContract() {}

    /**
     * Inner class that defines constant values for the books database table.
     * Each entry in the table represents a single book.
     */
    public static final class BookEntry implements BaseColumns {

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
        public static final String COLUMN_BOOK_NAME = "\"book name\"";

        // Price of the book (in cents).
        // Type: INTEGER
        public static final String COLUMN_BOOK_PRICE = "price";

        // Quantity of the book.
        // Type: INTEGER
        public static final String COLUMN_BOOK_QUANTITY = "quantity";

        // Name of the book supplier
        // Type: TEXT
        public static final String COLUMN_BOOK_SUPPLIER_NAME = "\"supplier name\"";

        // Phone number of the book supplier
        // Type: TEXT
        public static final String COLUMN_BOOK_SUPPLIER_PHONE_NUMBER = "\"supplier phone number\"";
    }
}