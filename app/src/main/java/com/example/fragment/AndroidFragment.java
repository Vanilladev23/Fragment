package com.example.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class AndroidFragment extends Fragment implements OnListenParams {
	RelativeLayout relativeLayout;
	View view;
	TextView tvTitle;
	Random random;
	OnListenParams onListenParams;

	public void setOnListenParams(String data) {
		onListenParams = this;
		onListenParams.onDataChanges(data);
	}

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_android, container, false);
		relativeLayout = view.findViewById(R.id.relative_android);
		tvTitle = view.findViewById(R.id.text_view_android_fragment);
		random = new Random();
		relativeLayout.setBackgroundColor(Color.rgb(random.nextInt() + 1, random.nextInt() + 1, random.nextInt() + 1));
		return view;
	}

	@Override
	public void onDataChanges(String data) {
		if (!data.isEmpty()) {
			tvTitle.setText(data);
		}
	}
}