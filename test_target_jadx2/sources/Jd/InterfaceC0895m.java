package Jd;

import kotlin.jvm.functions.Function1;
import wc.InterfaceC5068n;

/* renamed from: Jd.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0895m extends kotlin.coroutines.d {

    /* renamed from: Jd.m$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC0895m interfaceC0895m, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC0895m.A(th);
        }
    }

    boolean A(Throwable th);

    void G(Object obj);

    boolean b();

    boolean c();

    void h(Object obj, InterfaceC5068n interfaceC5068n);

    boolean isCancelled();

    Object o(Object obj, Object obj2, InterfaceC5068n interfaceC5068n);

    void s(Function1 function1);

    Object u(Throwable th);
}
