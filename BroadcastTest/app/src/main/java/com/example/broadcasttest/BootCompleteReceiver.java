package com.example.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootCompleteReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        Log.i("test", "bootComplete");
        Toast.makeText(context, "Boot Complete", Toast.LENGTH_LONG).show();
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");
    }
}
