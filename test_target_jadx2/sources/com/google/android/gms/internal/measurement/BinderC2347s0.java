package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2347s0 extends AbstractBinderC2392x0 {

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f24649f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    private boolean f24650g;

    public static final Object n1(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e10);
            throw e10;
        }
    }

    public final String k1(long j10) {
        return (String) n1(m1(j10), String.class);
    }

    public final Long l1(long j10) {
        return (Long) n1(m1(j10), Long.class);
    }

    public final Bundle m1(long j10) {
        Bundle bundle;
        AtomicReference atomicReference = this.f24649f;
        synchronized (atomicReference) {
            if (!this.f24650g) {
                try {
                    atomicReference.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f24649f.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2401y0
    public final void r0(Bundle bundle) {
        AtomicReference atomicReference = this.f24649f;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f24650g = true;
                } finally {
                    this.f24649f.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
