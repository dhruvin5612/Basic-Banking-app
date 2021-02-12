import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME ="Demo.db";
    public static final String TABLE_NAME ="student";
    public static final String Col_1 ="ID";
    public static final String Col_2 ="NAME";
    public static final String Col_3 ="Phone";
    public static final String Col_4 ="Address";


    public DatabaseHelper(@Nullable Context context ) {

        super(context, DATABASE_NAME, null,  1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
           db.execSQL("create table "+ TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT , NAME TEXT , PHONE INTEGER , ADDRESS TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
}
