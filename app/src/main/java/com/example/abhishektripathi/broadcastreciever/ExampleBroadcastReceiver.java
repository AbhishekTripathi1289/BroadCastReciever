package com.example.abhishektripathi.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class ExampleBroadcastReceiver extends BroadcastReceiver
{
//    @Override
//    public void onReceive(Context context, Intent intent)
//   {
//        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction()))
//         {
//            Toast.makeText(context, "Boot completed", Toast.LENGTH_SHORT).show();
//        }
//
//        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction()))
//         {
//            Toast.makeText(context, "Connectivity changed", Toast.LENGTH_SHORT).show();
//        }
//    }

/*Second Vedio mehthod*/
    @Override
    public void onReceive(Context context, Intent intent)
    {
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction()))
        {
            boolean noConnectivity = intent.getBooleanExtra(
                    ConnectivityManager.EXTRA_NO_CONNECTIVITY, false
            );
            if (noConnectivity)
            {
                Toast.makeText(context, "Disconnected", Toast.LENGTH_SHORT).show();
            } else
            {
                Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
            }
        }
    }


}
