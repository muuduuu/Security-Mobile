package x1;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f44705a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile n f44706b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final int f44707c = 20;

    public static class a extends n {

        /* renamed from: d, reason: collision with root package name */
        private final int f44708d;

        public a(int i10) {
            super(i10);
            this.f44708d = i10;
        }

        @Override // x1.n
        public void a(String str, String str2) {
            if (this.f44708d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // x1.n
        public void b(String str, String str2, Throwable th) {
            if (this.f44708d <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // x1.n
        public void c(String str, String str2) {
            if (this.f44708d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // x1.n
        public void d(String str, String str2, Throwable th) {
            if (this.f44708d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // x1.n
        public void f(String str, String str2) {
            if (this.f44708d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // x1.n
        public void g(String str, String str2, Throwable th) {
            if (this.f44708d <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // x1.n
        public void j(String str, String str2) {
            if (this.f44708d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // x1.n
        public void k(String str, String str2) {
            if (this.f44708d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // x1.n
        public void l(String str, String str2, Throwable th) {
            if (this.f44708d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public n(int i10) {
    }

    public static n e() {
        n nVar;
        synchronized (f44705a) {
            try {
                if (f44706b == null) {
                    f44706b = new a(3);
                }
                nVar = f44706b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    public static void h(n nVar) {
        synchronized (f44705a) {
            f44706b = nVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f44707c;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}
