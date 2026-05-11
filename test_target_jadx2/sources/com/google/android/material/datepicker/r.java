package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
abstract class r {

    /* renamed from: a, reason: collision with root package name */
    static AtomicReference f27015a = new AtomicReference();

    static long a(long j10) {
        Calendar i10 = i();
        i10.setTimeInMillis(j10);
        return d(i10).getTimeInMillis();
    }

    static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    private static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(h());
        return instanceForSkeleton;
    }

    static Calendar d(Calendar calendar) {
        Calendar j10 = j(calendar);
        Calendar i10 = i();
        i10.set(j10.get(1), j10.get(2), j10.get(5));
        return i10;
    }

    static q e() {
        q qVar = (q) f27015a.get();
        return qVar == null ? q.c() : qVar;
    }

    private static TimeZone f() {
        return TimeZone.getTimeZone("UTC");
    }

    static Calendar g() {
        Calendar a10 = e().a();
        a10.set(11, 0);
        a10.set(12, 0);
        a10.set(13, 0);
        a10.set(14, 0);
        a10.setTimeZone(f());
        return a10;
    }

    private static android.icu.util.TimeZone h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar i() {
        return j(null);
    }

    static Calendar j(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(f());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    static DateFormat k(Locale locale) {
        return c("yMMMEd", locale);
    }
}
