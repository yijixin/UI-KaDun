package bkt.zakj.com.butterknifetest.choreographer;

import android.os.Looper;
import android.util.Printer;

/**
 * Created by Administrator on 2017/4/18.
 */

public class BlockDetectByChoreographer {

    public static void start() {

        Looper.getMainLooper().setMessageLogging(new Printer() {

            private static final String START = ">>>>> Dispatching";
            private static final String END = "<<<<< Finished";

            @Override
            public void println(String x) {
                if (x.startsWith(START)) {
                    LogMonitor.getInstance().startMonitor();
                }
                if (x.startsWith(END)) {
                    LogMonitor.getInstance().removeMonitor();
                }
            }
        });

    }
}
