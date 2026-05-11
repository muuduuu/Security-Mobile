package Pc;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y extends t implements Zc.w {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7774a;

    public y(Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        this.f7774a = recordComponent;
    }

    @Override // Pc.t
    public Member Y() {
        Method c10 = C1119a.f7724a.c(this.f7774a);
        if (c10 != null) {
            return c10;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // Zc.w
    public boolean b() {
        return false;
    }

    @Override // Zc.w
    public Zc.x getType() {
        Class d10 = C1119a.f7724a.d(this.f7774a);
        if (d10 != null) {
            return new n(d10);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
