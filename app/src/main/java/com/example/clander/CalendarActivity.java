package com.example.clander;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.clander.view.CalendarView;
import com.example.clander.view.ClickDataListener;

/**
 * 日历显示activity
 */
public class CalendarActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		CalendarView calendarview = (CalendarView) findViewById(R.id.calendarview);
		//设置点击日期的事件监听
		calendarview.setClickDataListener(new ClickDataListener() {

			@Override
			public void clickData(String year, String month, String day) {
				Toast.makeText(getApplicationContext(),
						year + "-" + month + "-" + day, 0).show();

			}
		});
	}

}