package com.reactcommunity.rndatetimepicker;

import android.os.Bundle;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private Calendar f29223a = Calendar.getInstance();

    public f(Bundle bundle) {
        if (bundle != null && bundle.containsKey("value")) {
            this.f29223a.setTimeInMillis(bundle.getLong("value"));
        }
        this.f29223a.setTimeZone(b.h(bundle));
    }

    public int a() {
        return this.f29223a.get(5);
    }

    public int b() {
        return this.f29223a.get(11);
    }

    public int c() {
        return this.f29223a.get(12);
    }

    public int d() {
        return this.f29223a.get(2);
    }

    public int e() {
        return this.f29223a.get(1);
    }
}
