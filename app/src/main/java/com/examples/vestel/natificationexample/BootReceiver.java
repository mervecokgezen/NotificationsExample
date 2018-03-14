package com.examples.vestel.natificationexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by vestel on 14.03.2018.
 */

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Service","Stop");
        context.startService(new Intent(context,NatificationServices.class));
    }
}
