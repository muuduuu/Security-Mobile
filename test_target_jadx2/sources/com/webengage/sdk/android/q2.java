package com.webengage.sdk.android;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class q2 {

    /* renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f30776c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f30777d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private AtomicBoolean f30778a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    private AtomicInteger f30779b = new AtomicInteger(0);

    public static void c(boolean z10) {
        f30776c.set(z10);
    }

    static boolean d() {
        return f30776c.get();
    }

    void a(boolean z10) {
        this.f30778a.set(z10);
    }

    int b() {
        return this.f30779b.get();
    }

    void e() {
        this.f30779b.incrementAndGet();
    }

    void f() {
        this.f30779b.set(0);
    }

    public static void b(boolean z10) {
        f30777d.set(z10);
    }

    public static boolean c() {
        return f30777d.get();
    }

    boolean a() {
        return this.f30778a.get();
    }
}
