package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class Y5 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f24428a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24429b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f24430c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC2192a6 f24431d;

    /* synthetic */ Y5(AbstractC2192a6 abstractC2192a6, byte[] bArr) {
        Objects.requireNonNull(abstractC2192a6);
        this.f24431d = abstractC2192a6;
        this.f24428a = -1;
    }

    private final Iterator a() {
        if (this.f24430c == null) {
            this.f24430c = this.f24431d.l().entrySet().iterator();
        }
        return this.f24430c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f24428a + 1;
        AbstractC2192a6 abstractC2192a6 = this.f24431d;
        if (i10 >= abstractC2192a6.j()) {
            return !abstractC2192a6.l().isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f24429b = true;
        int i10 = this.f24428a + 1;
        this.f24428a = i10;
        AbstractC2192a6 abstractC2192a6 = this.f24431d;
        return i10 < abstractC2192a6.j() ? (X5) abstractC2192a6.i()[i10] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f24429b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f24429b = false;
        AbstractC2192a6 abstractC2192a6 = this.f24431d;
        abstractC2192a6.h();
        int i10 = this.f24428a;
        if (i10 >= abstractC2192a6.j()) {
            a().remove();
        } else {
            this.f24428a = i10 - 1;
            abstractC2192a6.g(i10);
        }
    }
}
