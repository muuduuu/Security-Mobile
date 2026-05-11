package yd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class I extends r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(M delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }

    @Override // yd.AbstractC5215q, yd.AbstractC5197E
    public boolean X0() {
        return false;
    }

    @Override // yd.AbstractC5215q
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public I h1(M delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new I(delegate);
    }
}
