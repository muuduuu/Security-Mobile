package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class N5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f25578a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25579b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f25580c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ n7 f25581d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25582e;

    N5(C2667e6 c2667e6, AtomicReference atomicReference, String str, String str2, String str3, n7 n7Var) {
        this.f25578a = atomicReference;
        this.f25579b = str2;
        this.f25580c = str3;
        this.f25581d = n7Var;
        Objects.requireNonNull(c2667e6);
        this.f25582e = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C2667e6 c2667e6;
        InterfaceC2703j2 N10;
        AtomicReference atomicReference2 = this.f25578a;
        synchronized (atomicReference2) {
            try {
                try {
                    c2667e6 = this.f25582e;
                    N10 = c2667e6.N();
                } catch (RemoteException e10) {
                    this.f25582e.f25694a.a().o().d("(legacy) Failed to get conditional properties; remote exception", null, this.f25579b, e10);
                    this.f25578a.set(Collections.emptyList());
                    atomicReference = this.f25578a;
                }
                if (N10 == null) {
                    c2667e6.f25694a.a().o().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f25579b, this.f25580c);
                    atomicReference2.set(Collections.emptyList());
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    n7 n7Var = this.f25581d;
                    AbstractC1287s.m(n7Var);
                    atomicReference2.set(N10.W0(this.f25579b, this.f25580c, n7Var));
                } else {
                    atomicReference2.set(N10.G(null, this.f25579b, this.f25580c));
                }
                c2667e6.J();
                atomicReference = this.f25578a;
                atomicReference.notify();
            } catch (Throwable th) {
                this.f25578a.notify();
                throw th;
            }
        }
    }
}
