package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class V implements Serializable, U {

    /* renamed from: a, reason: collision with root package name */
    final U f23661a;

    /* renamed from: b, reason: collision with root package name */
    volatile transient boolean f23662b;

    /* renamed from: c, reason: collision with root package name */
    transient Object f23663c;

    V(U u10) {
        this.f23661a = u10;
    }

    public final String toString() {
        Object obj;
        if (this.f23662b) {
            obj = "<supplier that returned " + String.valueOf(this.f23663c) + ">";
        } else {
            obj = this.f23661a;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object zza() {
        if (!this.f23662b) {
            synchronized (this) {
                try {
                    if (!this.f23662b) {
                        Object zza = this.f23661a.zza();
                        this.f23663c = zza;
                        this.f23662b = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f23663c;
    }
}
