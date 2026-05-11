package com.google.android.gms.measurement.internal;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class C extends U3 {

    /* renamed from: c, reason: collision with root package name */
    private long f25325c;

    /* renamed from: d, reason: collision with root package name */
    private String f25326d;

    C(C2760q3 c2760q3) {
        super(c2760q3);
    }

    @Override // com.google.android.gms.measurement.internal.U3
    protected final boolean i() {
        Calendar calendar = Calendar.getInstance();
        this.f25325c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f25326d = sb2.toString();
        return false;
    }

    public final long o() {
        l();
        return this.f25325c;
    }

    public final String p() {
        l();
        return this.f25326d;
    }
}
