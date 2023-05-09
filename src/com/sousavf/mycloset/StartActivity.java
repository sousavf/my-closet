package com.sousavf.mycloset;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RelativeLayout;

public class StartActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		RelativeLayout mainLayout = new RelativeLayout(getBaseContext());
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}

//	@Override
//	public void onDestroy() {
//		if (AdMobHelper.getInstance().getAdView() != null) {
//			AdMobHelper.getInstance().getAdView().destroy();
//		}
//		super.onDestroy();
//	}
}
