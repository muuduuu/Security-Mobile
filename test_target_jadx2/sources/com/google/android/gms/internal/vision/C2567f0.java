package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.vision.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2567f0 extends AbstractC2573h0 {

    /* renamed from: a, reason: collision with root package name */
    private int f25128a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f25129b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AbstractC2570g0 f25130c;

    C2567f0(AbstractC2570g0 abstractC2570g0) {
        this.f25130c = abstractC2570g0;
        this.f25129b = abstractC2570g0.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25128a < this.f25129b;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2585l0
    public final byte zza() {
        int i10 = this.f25128a;
        if (i10 >= this.f25129b) {
            throw new NoSuchElementException();
        }
        this.f25128a = i10 + 1;
        return this.f25130c.v(i10);
    }
}
