package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
abstract class e {
    static String a(long j10) {
        return b(j10, Locale.getDefault());
    }

    static String b(long j10, Locale locale) {
        return r.b(locale).format(new Date(j10));
    }

    static String c(long j10) {
        return DateUtils.formatDateTime(null, j10, 8228);
    }

    static String d(long j10) {
        return e(j10, Locale.getDefault());
    }

    static String e(long j10, Locale locale) {
        return r.k(locale).format(new Date(j10));
    }
}
