package co.hyperverge.hvcamera;

/* loaded from: classes.dex */
public class TimingUtil {
    public static final int DIM_MICROS = 2;
    public static final int DIM_MILLIS = 1;
    public static final int DIM_NANOS = 3;
    private static final String TAG = "TimingUtil";
    private String dim;
    long oldTime;
    private int timeDimension;

    public TimingUtil() {
        this.oldTime = 0L;
        this.timeDimension = 1;
        this.dim = "ms";
        this.oldTime = getNowTime();
    }

    public long getNowTime() {
        HVLog.d(TAG, "getNowTime() called");
        int i10 = this.timeDimension;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? System.currentTimeMillis() : System.nanoTime() : System.nanoTime() / 1000 : System.currentTimeMillis();
    }

    public String getTimeDifference() {
        HVLog.d(TAG, "getTimeDifference() called");
        return (getNowTime() - this.oldTime) + " " + this.dim;
    }

    public Long getTimeDifferenceLong() {
        HVLog.d(TAG, "getTimeDifferenceLong() called");
        return Long.valueOf(getNowTime() - this.oldTime);
    }

    public void init() {
        HVLog.d(TAG, "init() called");
        this.oldTime = getNowTime();
    }

    public void pitch(String str, String str2) {
        HVLog.e(str + "TIM", str2 + " ***** Time taken: " + getTimeDifference());
        this.oldTime = getNowTime();
    }

    public TimingUtil(int i10) {
        this.oldTime = 0L;
        this.dim = "ms";
        this.timeDimension = i10;
        if (i10 == 1) {
            this.dim = "ms";
        } else if (i10 == 2) {
            this.dim = "us";
        } else if (i10 == 3) {
            this.dim = "ns";
        }
        this.oldTime = getNowTime();
    }
}
