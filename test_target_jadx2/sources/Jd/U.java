package Jd;

/* loaded from: classes3.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f5015a = Od.E.f("kotlinx.coroutines.main.delay", false);

    /* renamed from: b, reason: collision with root package name */
    private static final X f5016b = b();

    public static final X a() {
        return f5016b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final X b() {
        if (!f5015a) {
            return T.f5012i;
        }
        G0 c10 = C0874b0.c();
        return (Od.t.c(c10) || !(c10 instanceof X)) ? T.f5012i : (X) c10;
    }
}
