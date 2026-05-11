package Pc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends f implements Zc.h {

    /* renamed from: c, reason: collision with root package name */
    private final Class f7762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(id.f fVar, Class klass) {
        super(fVar, null);
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f7762c = klass;
    }

    @Override // Zc.h
    public Zc.x c() {
        return z.f7775a.a(this.f7762c);
    }
}
