package com.facebook.react.runtime;

import java.util.Objects;
import org.conscrypt.BuildConfig;
import r4.AbstractC4012a;

/* renamed from: com.facebook.react.runtime.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1903a {

    /* renamed from: a, reason: collision with root package name */
    volatile Object f22059a;

    /* renamed from: b, reason: collision with root package name */
    Object f22060b;

    /* renamed from: c, reason: collision with root package name */
    private volatile b f22061c;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f22062d;

    /* renamed from: com.facebook.react.runtime.a$a, reason: collision with other inner class name */
    interface InterfaceC0381a {
        Object get();
    }

    /* renamed from: com.facebook.react.runtime.a$b */
    enum b {
        Init,
        Creating,
        Success,
        Failure
    }

    public C1903a(Object obj) {
        this.f22059a = obj;
        this.f22060b = obj;
        this.f22061c = b.Init;
        this.f22062d = BuildConfig.FLAVOR;
    }

    public synchronized Object a() {
        return AbstractC4012a.c(this.f22059a);
    }

    public synchronized Object b() {
        return this.f22059a;
    }

    public Object c(InterfaceC0381a interfaceC0381a) {
        boolean z10;
        Object a10;
        Object a11;
        synchronized (this) {
            try {
                b bVar = this.f22061c;
                b bVar2 = b.Success;
                if (bVar == bVar2) {
                    return a();
                }
                if (this.f22061c == b.Failure) {
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f22062d);
                }
                b bVar3 = this.f22061c;
                b bVar4 = b.Creating;
                boolean z11 = false;
                if (bVar3 != bVar4) {
                    this.f22061c = bVar4;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    try {
                        this.f22059a = interfaceC0381a.get();
                        synchronized (this) {
                            this.f22061c = bVar2;
                            notifyAll();
                            a10 = a();
                        }
                        return a10;
                    } catch (RuntimeException e10) {
                        synchronized (this) {
                            this.f22061c = b.Failure;
                            this.f22062d = Objects.toString(e10.getMessage(), "null");
                            notifyAll();
                            throw new RuntimeException("BridgelessAtomicRef: Failed to create object.", e10);
                        }
                    }
                }
                synchronized (this) {
                    while (this.f22061c == b.Creating) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    if (this.f22061c == b.Failure) {
                        throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f22062d);
                    }
                    a11 = a();
                }
                return a11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void d() {
        this.f22059a = this.f22060b;
        this.f22061c = b.Init;
        this.f22062d = BuildConfig.FLAVOR;
    }

    public C1903a() {
        this(null);
    }
}
