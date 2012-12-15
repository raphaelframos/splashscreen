package br.com.powell.splashscreen;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SegundaTela extends Activity{
	
	private static final String TAG = "Segunda Tela";

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_tela);
        Log.d(TAG, "Tela 2");
	}

}
