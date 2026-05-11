package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2181y1 {

    /* renamed from: a, reason: collision with root package name */
    protected volatile int f24113a = -1;

    public static final void b(AbstractC2181y1 abstractC2181y1, byte[] bArr, int i10, int i11) {
        try {
            C2169u1 q10 = C2169u1.q(bArr, 0, i11);
            abstractC2181y1.a(q10);
            q10.n();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public abstract void a(C2169u1 c2169u1);

    public final int d() {
        int h10 = h();
        this.f24113a = h10;
        return h10;
    }

    protected abstract int h();

    public AbstractC2181y1 i() {
        return (AbstractC2181y1) super.clone();
    }

    public String toString() {
        return A1.a(this);
    }
}
