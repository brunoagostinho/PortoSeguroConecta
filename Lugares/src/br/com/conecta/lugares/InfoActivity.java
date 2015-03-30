package br.com.conecta.lugares;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class InfoActivity extends Activity{
	private EditText edtNome;
	private EditText edtTel;
	private EditText edtProxViagem;
	private EditText edtData;
	private EditText edtHashtag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);
		DatabaseOperation meuDb = new DatabaseOperation(this);
		SQLiteDatabase db = meuDb.getWritableDatabase();
		Cursor c = db.query("TAB_CLIENTE", new String[]{"NM_CLIENTE","DS_TELEFONE", "DS_VIAGEM", "DT_VIAGEM","DS_HASHTAG","CD_CLIENTE"},null, null, null, null, "CD_CLIENTE");
		c.moveToLast();
		edtNome = (EditText) findViewById(R.id.dsNome);
		edtTel = (EditText) findViewById(R.id.nmTelefone1);
		edtProxViagem = (EditText) findViewById(R.id.dsViagem);
		edtData = (EditText) findViewById(R.id.dtViagem);
		edtHashtag = (EditText) findViewById(R.id.dsHashtag);
		edtNome.setText(c.getString(0));
		edtTel.setText(c.getString(1));
		edtProxViagem.setText(c.getString(2));
		edtData.setText(c.getString(3));
		edtHashtag.setText(c.getString(4));
		
	}

	
	
	public void atualizaInfo (View v){
		// Cria o Intent
		Intent meuIntent = new Intent(this, AtualizaInfoActivity.class);
		// Inicia a Activity enviando o meuIntent
		startActivity(meuIntent);
	}


}
