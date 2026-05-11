package Jd;

import kotlin.jvm.functions.Function1;

/* renamed from: Jd.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0893l extends J0 {

    /* renamed from: Jd.l$a */
    public static final class a implements InterfaceC0893l {

        /* renamed from: a, reason: collision with root package name */
        private final Function1 f5048a;

        public a(Function1 function1) {
            this.f5048a = function1;
        }

        @Override // Jd.InterfaceC0893l
        public void a(Throwable th) {
            this.f5048a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + S.a(this.f5048a) + '@' + S.b(this) + ']';
        }
    }

    void a(Throwable th);
}
