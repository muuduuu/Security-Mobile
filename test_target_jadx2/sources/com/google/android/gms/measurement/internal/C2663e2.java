package com.google.android.gms.measurement.internal;

import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2663e2 {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f25904g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f25905a;

    /* renamed from: b, reason: collision with root package name */
    private final P f25906b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f25907c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f25908d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f25909e = null;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f25910f = null;

    /* synthetic */ C2663e2(String str, Object obj, Object obj2, P p10, byte[] bArr) {
        this.f25905a = str;
        this.f25907c = obj;
        this.f25906b = p10;
    }

    public final String a() {
        return this.f25905a;
    }

    public final Object b(Object obj) {
        List<C2663e2> list;
        synchronized (this.f25908d) {
        }
        if (obj != null) {
            return obj;
        }
        if (Y1.f25741a == null) {
            return this.f25907c;
        }
        synchronized (f25904g) {
            try {
                if (C2668f.a()) {
                    return this.f25910f == null ? this.f25907c : this.f25910f;
                }
                try {
                    list = AbstractC2671f2.f25987a;
                    for (C2663e2 c2663e2 : list) {
                        if (C2668f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            P p10 = c2663e2.f25906b;
                            if (p10 != null) {
                                obj2 = p10.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f25904g) {
                            c2663e2.f25910f = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                P p11 = this.f25906b;
                if (p11 != null) {
                    try {
                        return p11.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f25907c;
            } finally {
            }
        }
    }
}
