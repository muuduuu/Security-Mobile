package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final long f28039b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f28040c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    private static i f28041d;

    /* renamed from: a, reason: collision with root package name */
    private final E8.a f28042a;

    private i(E8.a aVar) {
        this.f28042a = aVar;
    }

    public static i c() {
        return d(E8.b.b());
    }

    public static i d(E8.a aVar) {
        if (f28041d == null) {
            f28041d = new i(aVar);
        }
        return f28041d;
    }

    static boolean g(String str) {
        return f28040c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f28042a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(C8.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f28039b;
    }
}
