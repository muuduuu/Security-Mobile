package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* renamed from: v.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4900k {

    /* renamed from: a, reason: collision with root package name */
    private final a f43791a;

    /* renamed from: v.k$a */
    interface a {
        Surface a();

        void b(long j10);

        void c(Surface surface);

        void d(long j10);

        String e();

        void f();

        void g(String str);

        void h(int i10);

        Object i();
    }

    public C4900k(int i10, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.f43791a = new C4904o(i10, surface);
            return;
        }
        if (i11 >= 28) {
            this.f43791a = new C4903n(i10, surface);
        } else if (i11 >= 26) {
            this.f43791a = new C4902m(i10, surface);
        } else {
            this.f43791a = new C4901l(i10, surface);
        }
    }

    public static C4900k j(Object obj) {
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        a n10 = i10 >= 33 ? C4904o.n((OutputConfiguration) obj) : i10 >= 28 ? C4903n.m((OutputConfiguration) obj) : i10 >= 26 ? C4902m.l((OutputConfiguration) obj) : C4901l.k((OutputConfiguration) obj);
        if (n10 == null) {
            return null;
        }
        return new C4900k(n10);
    }

    public void a(Surface surface) {
        this.f43791a.c(surface);
    }

    public void b() {
        this.f43791a.f();
    }

    public String c() {
        return this.f43791a.e();
    }

    public Surface d() {
        return this.f43791a.a();
    }

    public void e(long j10) {
        this.f43791a.d(j10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4900k) {
            return this.f43791a.equals(((C4900k) obj).f43791a);
        }
        return false;
    }

    public void f(int i10) {
        this.f43791a.h(i10);
    }

    public void g(String str) {
        this.f43791a.g(str);
    }

    public void h(long j10) {
        this.f43791a.b(j10);
    }

    public int hashCode() {
        return this.f43791a.hashCode();
    }

    public Object i() {
        return this.f43791a.i();
    }

    public C4900k(OutputConfiguration outputConfiguration) {
        this.f43791a = C4904o.n(outputConfiguration);
    }

    private C4900k(a aVar) {
        this.f43791a = aVar;
    }
}
