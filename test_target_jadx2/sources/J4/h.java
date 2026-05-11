package j4;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f35805a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f35806b;

    /* renamed from: c, reason: collision with root package name */
    private static int f35807c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile C3499g f35808d;

    static {
        h hVar = new h();
        f35805a = hVar;
        f35806b = hVar.b();
        f35807c = 384;
    }

    private h() {
    }

    public static final C3499g a() {
        if (f35808d == null) {
            synchronized (h.class) {
                try {
                    if (f35808d == null) {
                        f35808d = new C3499g(f35807c, f35806b);
                    }
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C3499g c3499g = f35808d;
        Intrinsics.d(c3499g);
        return c3499g;
    }

    private final int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) min) > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
