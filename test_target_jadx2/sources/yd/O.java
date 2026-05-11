package yd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class O extends r {

    /* renamed from: c, reason: collision with root package name */
    private final a0 f45458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(M delegate, a0 attributes) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f45458c = attributes;
    }

    @Override // yd.AbstractC5215q, yd.AbstractC5197E
    public a0 V0() {
        return this.f45458c;
    }

    @Override // yd.AbstractC5215q
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public O h1(M delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new O(delegate, V0());
    }
}
