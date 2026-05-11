package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2156q implements C0 {
    @Override // com.google.android.gms.internal.clearcut.C0
    public final /* synthetic */ C0 a1(B0 b02) {
        if (a().getClass().isInstance(b02)) {
            return b((AbstractC2153p) b02);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract AbstractC2156q b(AbstractC2153p abstractC2153p);
}
