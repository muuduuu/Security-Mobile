package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2445f2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f24863a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC2542z0 f24864b;

    /* synthetic */ C2445f2(E0 e02, AbstractC2440e2 abstractC2440e2) {
        if (!(e02 instanceof C2455h2)) {
            this.f24863a = null;
            this.f24864b = (AbstractC2542z0) e02;
            return;
        }
        C2455h2 c2455h2 = (C2455h2) e02;
        ArrayDeque arrayDeque = new ArrayDeque(c2455h2.m());
        this.f24863a = arrayDeque;
        arrayDeque.push(c2455h2);
        this.f24864b = b(c2455h2.f24871f);
    }

    private final AbstractC2542z0 b(E0 e02) {
        while (e02 instanceof C2455h2) {
            C2455h2 c2455h2 = (C2455h2) e02;
            this.f24863a.push(c2455h2);
            e02 = c2455h2.f24871f;
        }
        return (AbstractC2542z0) e02;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC2542z0 next() {
        AbstractC2542z0 abstractC2542z0;
        AbstractC2542z0 abstractC2542z02 = this.f24864b;
        if (abstractC2542z02 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f24863a;
            abstractC2542z0 = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            abstractC2542z0 = b(((C2455h2) this.f24863a.pop()).f24872g);
        } while (abstractC2542z0.j() == 0);
        this.f24864b = abstractC2542z0;
        return abstractC2542z02;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24864b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
