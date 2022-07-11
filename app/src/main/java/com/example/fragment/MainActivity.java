package com.example.fragment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

	Button btnSendData;
	EditText edtInput;
	FragmentManager fragmentManager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnSendData = findViewById(R.id.button_send_data);
		edtInput = findViewById(R.id.edittext_main);
		fragmentManager = getSupportFragmentManager();

		btnSendData.setOnClickListener(v -> {
			String input = edtInput.getText().toString();
			AndroidFragment androidFragment = (AndroidFragment) fragmentManager.findFragmentById(R.id.fragment_android);
			if (androidFragment != null) {
				androidFragment.setOnListenParams(input);
			}
		});

	}
}