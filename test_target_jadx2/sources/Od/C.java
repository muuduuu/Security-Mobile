package Od;

import a.C1332a;
import lc.o;

/* loaded from: classes3.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f7301a = new C1332a().a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f7302b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f7303c;

    static {
        Object b10;
        Object b11;
        try {
            o.a aVar = lc.o.f37128b;
            b10 = lc.o.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        if (lc.o.d(b10) != null) {
            b10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f7302b = (String) b10;
        try {
            b11 = lc.o.b(C.class.getCanonicalName());
        } catch (Throwable th2) {
            o.a aVar3 = lc.o.f37128b;
            b11 = lc.o.b(lc.p.a(th2));
        }
        if (lc.o.d(b11) != null) {
            b11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f7303c = (String) b11;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
