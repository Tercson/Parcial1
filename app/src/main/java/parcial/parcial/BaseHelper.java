package parcial.parcial;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by JUAN ANDRES on 22/09/2016.
 */
public class BaseHelper extends SQLiteOpenHelper{

    String tabla="CREATE TABLE PERSONAS(ID INTEGER PRIMARY KEY, NOMBRE TEXT, APELLIDO TEXT)";

    public BaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table PERSONAS");
        db.execSQL(tabla);

    }
}
