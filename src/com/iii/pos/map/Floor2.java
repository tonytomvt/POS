package com.iii.pos.map;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.iii.pos.R;


//--------------this class use to display the map for restaurant---------//
public class Floor2 extends Fragment {
	
	//--------------------Fields ---------------------------------//
	private WebView webView;
	private String URLWebview = "";

	//---------------------initialize method---------------------------//
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// TODO Auto-generated method stub
		View mapFloorLayout = inflater.inflate(R.layout.floor1, container,
				false);
		if (mapFloorLayout != null) {
			// URLWebview = getResources().getString(R.string.poswebview);
			webView = (WebView) mapFloorLayout.findViewById(R.id.webView1);
			webView.loadUrl("http://192.168.1.68/pos/map/main/floor2.php?android_id=1"
			/* + getAndroid_Id() */);
			webView.getSettings().setJavaScriptEnabled(true);
		}

		return mapFloorLayout;
	}

	// private String getAndroid_Id() {
	// TelephonyManager tManager = (TelephonyManager) getView().getContext()
	// .getSystemService(Context.TELEPHONY_SERVICE);
	// String uid = tManager.getDeviceId();
	// return uid;
	// }
}
