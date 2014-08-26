package com.panzerkampf.khronosandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText campoIdentificacao;
	private Button logar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		campoIdentificacao = (EditText)findViewById(R.id.identificacao);
		logar = (Button)findViewById(R.id.logar);

		clicks();

	}

	private void clicks() {
		logar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, TelaDeControle.class);
				startActivity(i);
			}
		});
	}
}
