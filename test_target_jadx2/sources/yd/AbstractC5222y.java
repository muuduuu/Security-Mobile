package yd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5222y extends t0 implements Ad.g {

    /* renamed from: b, reason: collision with root package name */
    private final M f45571b;

    /* renamed from: c, reason: collision with root package name */
    private final M f45572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5222y(M lowerBound, M upperBound) {
        super(null);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        this.f45571b = lowerBound;
        this.f45572c = upperBound;
    }

    @Override // yd.AbstractC5197E
    public List U0() {
        return d1().U0();
    }

    @Override // yd.AbstractC5197E
    public a0 V0() {
        return d1().V0();
    }

    @Override // yd.AbstractC5197E
    public e0 W0() {
        return d1().W0();
    }

    @Override // yd.AbstractC5197E
    public boolean X0() {
        return d1().X0();
    }

    public abstract M d1();

    public final M e1() {
        return this.f45571b;
    }

    public final M f1() {
        return this.f45572c;
    }

    public abstract String g1(kotlin.reflect.jvm.internal.impl.renderer.c cVar, kotlin.reflect.jvm.internal.impl.renderer.f fVar);

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.f36587j.w(this);
    }

    @Override // yd.AbstractC5197E
    public rd.h w() {
        return d1().w();
    }
}
