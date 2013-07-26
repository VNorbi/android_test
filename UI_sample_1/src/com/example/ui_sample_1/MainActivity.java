package com.example.ui_sample_1;


import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
	static final String[] station_type = new String[] { "Vehicle station", "Emergency vehicle station",
		"Public transport vehicle station","Roadside station"};

	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);   
		ListView listView = getListView();
		listView.setTextFilterEnabled(true);   
		setListAdapter(new ArrayAdapter<String>(getApplicationContext(),
				R.layout.splash_item, R.id.station_type, station_type));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
