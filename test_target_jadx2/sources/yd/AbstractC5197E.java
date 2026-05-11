package yd;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: yd.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5197E implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.a, Ad.i {

    /* renamed from: a, reason: collision with root package name */
    private int f45433a;

    public /* synthetic */ AbstractC5197E(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int T0() {
        return G.a(this) ? super.hashCode() : (((W0().hashCode() * 31) + U0().hashCode()) * 31) + (X0() ? 1 : 0);
    }

    public abstract List U0();

    public abstract a0 V0();

    public abstract e0 W0();

    public abstract boolean X0();

    public abstract AbstractC5197E Y0(kotlin.reflect.jvm.internal.impl.types.checker.g gVar);

    public abstract t0 Z0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5197E)) {
            return false;
        }
        AbstractC5197E abstractC5197E = (AbstractC5197E) obj;
        return X0() == abstractC5197E.X0() && kotlin.reflect.jvm.internal.impl.types.checker.p.f36700a.a(Z0(), abstractC5197E.Z0());
    }

    public final int hashCode() {
        int i10 = this.f45433a;
        if (i10 != 0) {
            return i10;
        }
        int T02 = T0();
        this.f45433a = T02;
        return T02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i() {
        return AbstractC5208j.a(V0());
    }

    public abstract rd.h w();

    private AbstractC5197E() {
    }
}
