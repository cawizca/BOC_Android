package com.futuregen.bocandroid.Database;

import android.provider.BaseColumns;

public class DBMaster {

    private DBMaster() {

    }

    public static class Transaction implements BaseColumns {
        public static final String TABLE_NAME = "transaction_table";
        public static final String COLUMN_ACC_NAME = "ac_name";
        public static final String COLUMN_ACC_NO = "ac_no";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_AMOUNT = "amount";
        public static final String COLUMN_DESC = "description";
    }

    public static class Register implements BaseColumns {
        public static final String TABLE_NAME = "user_table";
        public static final String COLUMN_USER_NAME = "user_name";
        public static final String COLUMN_PASSWORD = "user_password";
    }

}
