package Od;

import kotlin.jvm.functions.Function2;

/* renamed from: Od.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1073a {

    /* renamed from: a, reason: collision with root package name */
    private static final D f7314a = new D("CLOSED");

    public static final AbstractC1074b b(AbstractC1074b abstractC1074b) {
        while (true) {
            Object g10 = abstractC1074b.g();
            if (g10 == f7314a) {
                return abstractC1074b;
            }
            AbstractC1074b abstractC1074b2 = (AbstractC1074b) g10;
            if (abstractC1074b2 != null) {
                abstractC1074b = abstractC1074b2;
            } else if (abstractC1074b.m()) {
                return abstractC1074b;
            }
        }
    }

    public static final Object c(A a10, long j10, Function2 function2) {
        while (true) {
            if (a10.f7300c >= j10 && !a10.k()) {
                return B.a(a10);
            }
            Object g10 = a10.g();
            if (g10 == f7314a) {
                return B.a(f7314a);
            }
            A a11 = (A) ((AbstractC1074b) g10);
            if (a11 == null) {
                a11 = (A) function2.invoke(Long.valueOf(a10.f7300c + 1), a10);
                if (a10.o(a11)) {
                    if (a10.k()) {
                        a10.n();
                    }
                }
            }
            a10 = a11;
        }
    }
}
