package com.coolweather.app.util;

import android.app.PendingIntent.OnFinished;

public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
