package br.com.powell.splashscreen;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashScreen extends Activity {

    protected static final String TAG = "SplashScreen";
	private static final long TEMPO_ENTRADA = 2000;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        new Handler().postDelayed(new Runnable() {
			
			public void run() {
				try{
					startActivity(new Intent(SplashScreen.this, SegundaTela.class));
					Log.d(TAG, "Tela 1");
				}catch(ActivityNotFoundException e){
					Log.e(TAG, e.getMessage());
				}
			}
		}, TEMPO_ENTRADA);
    }
}
