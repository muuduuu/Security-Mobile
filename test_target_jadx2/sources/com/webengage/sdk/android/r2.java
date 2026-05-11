package com.webengage.sdk.android;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class r2 {

    /* renamed from: c, reason: collision with root package name */
    private static Pattern f30789c = Pattern.compile("P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)S)?)?");

    /* renamed from: a, reason: collision with root package name */
    private String f30790a;

    /* renamed from: b, reason: collision with root package name */
    private long f30791b;

    public r2(long j10, String str) {
        this.f30791b = j10;
        this.f30790a = str;
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            if (str.startsWith("+")) {
                str = str.substring(1);
            }
            return Integer.valueOf(str).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public Date a() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.f30791b);
        String str = this.f30790a;
        if (str != null) {
            Matcher matcher = f30789c.matcher(str);
            if (matcher.matches()) {
                gregorianCalendar.add(1, a(matcher.group(1)));
                gregorianCalendar.add(2, a(matcher.group(2)));
                gregorianCalendar.add(4, a(matcher.group(3)));
                gregorianCalendar.add(5, a(matcher.group(4)));
                gregorianCalendar.add(10, a(matcher.group(6)));
                gregorianCalendar.add(12, a(matcher.group(7)));
                gregorianCalendar.add(13, a(matcher.group(8)));
                return gregorianCalendar.getTime();
            }
        }
        return gregorianCalendar.getTime();
    }
}
