package br.com.conecta.lugares;

import android.provider.BaseColumns;

public class TableData {
	
	public TableData(){
		
	}
	
	public static abstract class TableInfo implements BaseColumns{
		
		public static final String USER_NAME = "user_name";
		public static final String USER_NUMBER = "user_number";
		public static final String DS_VIAGEM = "ds_viagem";
		public static final String DT_VIAGEM = "dt_viagem";
		public static final String DS_HASHTAG = "ds_hashtag";
		public static final String DATABASE_NAME = "user_info";
		public static final String TABLE_NAME = "tab_user";
		
		
		
		
	}

}
