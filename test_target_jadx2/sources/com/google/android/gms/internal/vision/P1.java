package com.google.android.gms.internal.vision;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class P1 extends V1 {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ O1 f25072b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private P1(O1 o12) {
        super(o12, null);
        this.f25072b = o12;
    }

    @Override // com.google.android.gms.internal.vision.V1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new Q1(this.f25072b, null);
    }

    /* synthetic */ P1(O1 o12, N1 n12) {
        this(o12);
    }
}
