package T6;

import D7.C0787k;
import S6.a;
import V6.AbstractC1287s;
import com.google.android.gms.common.C2012d;

/* renamed from: T6.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1191v {

    /* renamed from: a, reason: collision with root package name */
    private final C2012d[] f9478a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9479b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9480c;

    /* renamed from: T6.v$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private r f9481a;

        /* renamed from: c, reason: collision with root package name */
        private C2012d[] f9483c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f9482b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f9484d = 0;

        /* synthetic */ a(p0 p0Var) {
        }

        public AbstractC1191v a() {
            AbstractC1287s.b(this.f9481a != null, "execute parameter required");
            return new o0(this, this.f9483c, this.f9482b, this.f9484d);
        }

        public a b(r rVar) {
            this.f9481a = rVar;
            return this;
        }

        public a c(boolean z10) {
            this.f9482b = z10;
            return this;
        }

        public a d(C2012d... c2012dArr) {
            this.f9483c = c2012dArr;
            return this;
        }

        public a e(int i10) {
            this.f9484d = i10;
            return this;
        }
    }

    protected AbstractC1191v(C2012d[] c2012dArr, boolean z10, int i10) {
        this.f9478a = c2012dArr;
        boolean z11 = false;
        if (c2012dArr != null && z10) {
            z11 = true;
        }
        this.f9479b = z11;
        this.f9480c = i10;
    }

    public static a a() {
        return new a(null);
    }

    protected abstract void b(a.b bVar, C0787k c0787k);

    public boolean c() {
        return this.f9479b;
    }

    public final int d() {
        return this.f9480c;
    }

    public final C2012d[] e() {
        return this.f9478a;
    }
}
