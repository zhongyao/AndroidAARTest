package phone.hongri.com.myjar;

import android.util.Log;

public class Logger {

    private static final String TAG = "yao";

    public static void d(String msg){
        if (msg !=null && !msg.equals("")){
            Log.d(TAG,msg);
        }
    }

    public static void e(String msg){
        if (msg !=null && !msg.equals("")){
            Log.e(TAG,msg);
        }
    }
}