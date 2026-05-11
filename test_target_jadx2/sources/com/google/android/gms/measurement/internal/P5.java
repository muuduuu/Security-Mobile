package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class P5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f25618a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25619b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f25620c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ n7 f25621d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f25622e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25623f;

    P5(C2667e6 c2667e6, AtomicReference atomicReference, String str, String str2, String str3, n7 n7Var, boolean z10) {
        this.f25618a = atomicReference;
        this.f25619b = str2;
        this.f25620c = str3;
        this.f25621d = n7Var;
        this.f25622e = z10;
        Objects.requireNonNull(c2667e6);
        this.f25623f = c2667e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C2667e6 c2667e6;
        InterfaceC2703j2 N10;
        AtomicReference atomicReference2 = this.f25618a;
        synchronized (atomicReference2) {
            try {
                try {
                    c2667e6 = this.f25623f;
                    N10 = c2667e6.N();
                } catch (RemoteException e10) {
                    this.f25623f.f25694a.a().o().d("(legacy) Failed to get user properties; remote exception", null, this.f25619b, e10);
                    this.f25618a.set(Collections.emptyList());
                    atomicReference = this.f25618a;
                }
                if (N10 == null) {
                    c2667e6.f25694a.a().o().d("(legacy) Failed to get user properties; not connected to service", null, this.f25619b, this.f25620c);
                    atomicReference2.set(Collections.emptyList());
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    n7 n7Var = this.f25621d;
                    AbstractC1287s.m(n7Var);
                    atomicReference2.set(N10.Q0(this.f25619b, this.f25620c, this.f25622e, n7Var));
                } else {
                    atomicReference2.set(N10.e(null, this.f25619b, this.f25620c, this.f25622e));
                }
                c2667e6.J();
                atomicReference = this.f25618a;
                atomicReference.notify();
            } catch (Throwable th) {
                this.f25618a.notify();
                throw th;
            }
        }
    }
}
