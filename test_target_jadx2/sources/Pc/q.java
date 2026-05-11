package Pc;

import id.C3367b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends f implements Zc.m {

    /* renamed from: c, reason: collision with root package name */
    private final Enum f7766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(id.f fVar, Enum value) {
        super(fVar, null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7766c = value;
    }

    @Override // Zc.m
    public C3367b b() {
        Class<?> cls = this.f7766c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        Intrinsics.d(cls);
        return d.a(cls);
    }

    @Override // Zc.m
    public id.f d() {
        return id.f.o(this.f7766c.name());
    }
}
