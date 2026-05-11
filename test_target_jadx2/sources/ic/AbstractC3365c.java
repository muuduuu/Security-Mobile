package ic;

import android.util.Log;

/* renamed from: ic.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3365c {

    /* renamed from: ic.c$b */
    private static class b implements InterfaceC3364b {
        private b() {
        }

        private String f(String str, Object... objArr) {
            return objArr.length == 0 ? str : String.format(str, objArr);
        }

        private String g() {
            return new Exception().getStackTrace()[3].getMethodName();
        }

        @Override // ic.InterfaceC3364b
        public void a(String str, Object... objArr) {
            Log.d(g(), f(str, objArr));
        }

        @Override // ic.InterfaceC3364b
        public void b(String str, Object... objArr) {
            Log.e(g(), f(str, objArr));
        }

        @Override // ic.InterfaceC3364b
        public void c(String str, Object... objArr) {
            Log.w(g(), f(str, objArr));
        }

        @Override // ic.InterfaceC3364b
        public void d(String str, Object... objArr) {
            Log.i(g(), f(str, objArr));
        }

        @Override // ic.InterfaceC3364b
        public void e(Throwable th, String str, Object... objArr) {
            Log.e(g(), f(str, objArr), th);
        }
    }

    public static InterfaceC3364b a(boolean z10) {
        return z10 ? new b() : new C0507c();
    }

    /* renamed from: ic.c$c, reason: collision with other inner class name */
    private static class C0507c implements InterfaceC3364b {
        private C0507c() {
        }

        @Override // ic.InterfaceC3364b
        public void a(String str, Object... objArr) {
        }

        @Override // ic.InterfaceC3364b
        public void b(String str, Object... objArr) {
        }

        @Override // ic.InterfaceC3364b
        public void c(String str, Object... objArr) {
        }

        @Override // ic.InterfaceC3364b
        public void d(String str, Object... objArr) {
        }

        @Override // ic.InterfaceC3364b
        public void e(Throwable th, String str, Object... objArr) {
        }
    }
}
