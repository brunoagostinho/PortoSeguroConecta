package br.com.conecta.lugares;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class LugaresActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);
        
        
    }

    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
     MenuInflater inflater = getMenuInflater();
     inflater.inflate(R.menu.lugares, menu);
     return super.onCreateOptionsMenu(menu);
    }

    public void mudaPagina (){
    	// Cria o Intent
    	Intent meuIntent = new Intent(this, InfoActivity.class);
    	// Inicia a Activity enviando o meuIntent
    	startActivity(meuIntent);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_info:
                mudaPagina();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.lugares, menu);
        return true;
    }
    */
}
