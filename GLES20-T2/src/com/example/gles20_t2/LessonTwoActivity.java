package com.example.gles20_t2;

import android.app.Activity;
import android.os.Bundle;

public class LessonTwoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lesson_two);
	}

	//Resume GLSurface when parent activity focus is regained
		@Override
		protected void onResume()
		{
			super.onResume();
//			mGLSurfaceView.onResume();
		}
		
		//Pause GLSurface when parent activity focus is lost
		@Override
		protected void onPause()
		{
			super.onPause();
//			mGLSurfaceView.onPause();
		}
}
