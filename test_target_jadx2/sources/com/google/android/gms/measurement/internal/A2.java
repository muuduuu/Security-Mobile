package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class A2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f25289a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25290b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25291c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2 f25292d;

    A2(C2 c22, int i10, boolean z10, boolean z11) {
        Objects.requireNonNull(c22);
        this.f25292d = c22;
        this.f25289a = i10;
        this.f25290b = z10;
        this.f25291c = z11;
    }

    public final void a(String str) {
        this.f25292d.y(this.f25289a, this.f25290b, this.f25291c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f25292d.y(this.f25289a, this.f25290b, this.f25291c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f25292d.y(this.f25289a, this.f25290b, this.f25291c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f25292d.y(this.f25289a, this.f25290b, this.f25291c, str, obj, obj2, obj3);
    }
}
