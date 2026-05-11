package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
class q {

    /* renamed from: c, reason: collision with root package name */
    private static final q f27012c = new q(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final Long f27013a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeZone f27014b;

    private q(Long l10, TimeZone timeZone) {
        this.f27013a = l10;
        this.f27014b = timeZone;
    }

    static q c() {
        return f27012c;
    }

    Calendar a() {
        return b(this.f27014b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f27013a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
