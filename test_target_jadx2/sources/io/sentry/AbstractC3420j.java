package io.sentry;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

/* renamed from: io.sentry.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3420j {
    public static long a(Date date) {
        return h(date.getTime());
    }

    public static double b(Date date) {
        return i(date.getTime());
    }

    public static Date c() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f35586a).getTime();
    }

    public static Date d(long j10) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f35586a);
        calendar.setTimeInMillis(j10);
        return calendar.getTime();
    }

    public static Date e(String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.f(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    public static Date f(String str) {
        try {
            return d(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    public static String g(Date date) {
        return io.sentry.vendor.gson.internal.bind.util.a.b(date, true);
    }

    public static long h(long j10) {
        return j10 * 1000000;
    }

    public static double i(double d10) {
        return d10 / 1000.0d;
    }

    public static Date j(long j10) {
        return d(Double.valueOf(k(j10)).longValue());
    }

    public static double k(double d10) {
        return d10 / 1000000.0d;
    }

    public static double l(long j10) {
        return j10 / 1.0E9d;
    }

    public static long m(long j10) {
        return j10 * 1000000000;
    }

    public static Date n(AbstractC3410f1 abstractC3410f1) {
        if (abstractC3410f1 == null) {
            return null;
        }
        return o(abstractC3410f1);
    }

    public static Date o(AbstractC3410f1 abstractC3410f1) {
        return j(abstractC3410f1.o());
    }
}
