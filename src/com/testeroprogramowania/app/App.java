package com.testeroprogramowania.app;

import com.testeroprogramowania.app.database.DatabaseConnection;
import com.testeroprogramowania.app.database.DatabaseUtils;

public class App {

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        DatabaseUtils databaseUtils = new DatabaseUtils();
        Czesc01.DatabaseUtils databaseUtils1 = new Czesc01.DatabaseUtils();
    }
}
