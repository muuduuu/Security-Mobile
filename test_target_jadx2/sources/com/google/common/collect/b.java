package com.google.common.collect;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class b extends z {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0409b f27876a = EnumC0409b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private Object f27877b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27878a;

        static {
            int[] iArr = new int[EnumC0409b.values().length];
            f27878a = iArr;
            try {
                iArr[EnumC0409b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27878a[EnumC0409b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.google.common.collect.b$b, reason: collision with other inner class name */
    private enum EnumC0409b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f27876a = EnumC0409b.FAILED;
        this.f27877b = a();
        if (this.f27876a == EnumC0409b.DONE) {
            return false;
        }
        this.f27876a = EnumC0409b.READY;
        return true;
    }

    protected abstract Object a();

    protected final Object b() {
        this.f27876a = EnumC0409b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        g8.h.m(this.f27876a != EnumC0409b.FAILED);
        int i10 = a.f27878a[this.f27876a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f27876a = EnumC0409b.NOT_READY;
        Object a10 = p.a(this.f27877b);
        this.f27877b = null;
        return a10;
    }
}
