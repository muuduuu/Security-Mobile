package Ld;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public interface x {

    public static final class a {
        public static /* synthetic */ boolean a(x xVar, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return xVar.v(th);
        }
    }

    Object B(Object obj);

    Object D(Object obj, kotlin.coroutines.d dVar);

    boolean E();

    boolean v(Throwable th);

    void w(Function1 function1);
}
