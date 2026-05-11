package X;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class d {
    private static String a(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j10);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j10 - timeUnit2.toMillis(hours));
        long millis = j10 - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j10 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static String b(long j10) {
        return a(j10);
    }

    public static String c(long j10) {
        return b(TimeUnit.MICROSECONDS.toMillis(j10));
    }
}
