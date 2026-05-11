package Ec;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.o;

/* renamed from: Ec.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0823b {
    static {
        Object b10;
        try {
            o.a aVar = lc.o.f37128b;
            b10 = lc.o.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        if (lc.o.g(b10)) {
            b10 = Boolean.TRUE;
        }
        Object b11 = lc.o.b(b10);
        Boolean bool = Boolean.FALSE;
        if (lc.o.f(b11)) {
            b11 = bool;
        }
        ((Boolean) b11).booleanValue();
    }

    public static final AbstractC0822a a(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        return new C0825d(compute);
    }
}
