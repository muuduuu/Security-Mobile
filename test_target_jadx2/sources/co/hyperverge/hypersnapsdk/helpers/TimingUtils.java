package co.hyperverge.hypersnapsdk.helpers;

import java.io.Serializable;

/* loaded from: classes.dex */
public class TimingUtils implements Serializable {
    public static final int DIM_MICROS = 2;
    public static final int DIM_MILLIS = 1;
    public static final int DIM_NANOS = 3;
    private String dim;
    long oldTime;
    private int timeDimension;

    public TimingUtils() {
        this.timeDimension = 1;
        this.dim = "ms";
        this.oldTime = 0L;
        this.oldTime = getNowTime();
    }

    public long getNowTime() {
        int i10 = this.timeDimension;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? System.currentTimeMillis() : System.nanoTime() : System.nanoTime() / 1000 : System.currentTimeMillis();
    }

    public String getTimeDifference() {
        return (getNowTime() - this.oldTime) + " " + this.dim;
    }

    public String getTimeDifferenceAndUpdate() {
        long longValue = getTimeDifferenceLong().longValue();
        this.oldTime = getNowTime();
        return longValue + " " + this.dim;
    }

    public long getTimeDifferenceAndUpdateLong() {
        long longValue = getTimeDifferenceLong().longValue();
        this.oldTime = getNowTime();
        return longValue;
    }

    public Long getTimeDifferenceLong() {
        return Long.valueOf(getNowTime() - this.oldTime);
    }

    public void init() {
        this.oldTime = getNowTime();
    }

    public void pitch(String str, String str2) {
        this.oldTime = getNowTime();
    }

    public TimingUtils(int i10) {
        this.dim = "ms";
        this.oldTime = 0L;
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
