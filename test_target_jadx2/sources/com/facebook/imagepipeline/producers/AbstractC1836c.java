package com.facebook.imagepipeline.producers;

import c3.AbstractC1721a;

/* renamed from: com.facebook.imagepipeline.producers.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1836c implements InterfaceC1847n {

    /* renamed from: a, reason: collision with root package name */
    private boolean f20895a = false;

    public static boolean d(int i10) {
        return (i10 & 1) == 1;
    }

    public static boolean e(int i10) {
        return !d(i10);
    }

    public static int k(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static boolean l(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static boolean m(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static int n(int i10, int i11) {
        return i10 & (~i11);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1847n
    public synchronized void a() {
        if (this.f20895a) {
            return;
        }
        this.f20895a = true;
        try {
            f();
        } catch (Exception e10) {
            j(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1847n
    public synchronized void b(float f10) {
        if (this.f20895a) {
            return;
        }
        try {
            i(f10);
        } catch (Exception e10) {
            j(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1847n
    public synchronized void c(Object obj, int i10) {
        if (this.f20895a) {
            return;
        }
        this.f20895a = d(i10);
        try {
            h(obj, i10);
        } catch (Exception e10) {
            j(e10);
        }
    }

    protected abstract void f();

    protected abstract void g(Throwable th);

    protected abstract void h(Object obj, int i10);

    protected abstract void i(float f10);

    protected void j(Exception exc) {
        AbstractC1721a.N(getClass(), "unhandled exception", exc);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1847n
    public synchronized void onFailure(Throwable th) {
        if (this.f20895a) {
            return;
        }
        this.f20895a = true;
        try {
            g(th);
        } catch (Exception e10) {
            j(e10);
        }
    }
}
