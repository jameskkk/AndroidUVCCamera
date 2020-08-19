package com.k2jstudio.uvccam;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CameraActivity extends Activity {
	UVCcamPreview mWebcamPreview;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mWebcamPreview = (UVCcamPreview) findViewById(R.id.uvccamPreview);
        
        final Button btnExit = (Button) findViewById(R.id.button_exit);
		btnExit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
    }
}