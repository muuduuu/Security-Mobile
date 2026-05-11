package Jd;

/* renamed from: Jd.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0918y {
    public static final InterfaceC0914w a(InterfaceC0915w0 interfaceC0915w0) {
        return new C0916x(interfaceC0915w0);
    }

    public static /* synthetic */ InterfaceC0914w b(InterfaceC0915w0 interfaceC0915w0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0915w0 = null;
        }
        return a(interfaceC0915w0);
    }

    public static final boolean c(InterfaceC0914w interfaceC0914w, Object obj) {
        Throwable d10 = lc.o.d(obj);
        return d10 == null ? interfaceC0914w.H(obj) : interfaceC0914w.F(d10);
    }
}
