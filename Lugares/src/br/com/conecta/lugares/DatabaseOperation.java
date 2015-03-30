package br.com.conecta.lugares;

import java.sql.Date;

import br.com.conecta.lugares.TableData.TableInfo;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.Contacts.Intents.Insert;

public class DatabaseOperation extends SQLiteOpenHelper {
	public DatabaseOperation(Context context) {
		super(context, "MeuDb", null, 1);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		final String sql = "CREATE TABLE TAB_CLIENTE (CD_CLIENTE INTEGER PRIMARY KEY AUTOINCREMENT, NM_CLIENTE TEXT, DS_TELEFONE TEXT, DS_VIAGEM TEXT,DT_VIAGEM TEXT, DS_HASHTAG TEXT)";
				db.execSQL(sql);
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int vAntiga, int vNova) {
		db.execSQL("DROP TABLE IF EXISTS TAB_CLIENTE");
		onCreate(db);
	}
	
	
}