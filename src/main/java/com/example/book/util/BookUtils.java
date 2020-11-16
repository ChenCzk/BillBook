package com.example.book.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BookUtils {
    public static String getCurrentDateAndTime() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }
}
