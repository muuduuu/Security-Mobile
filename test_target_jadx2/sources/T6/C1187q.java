package T6;

import T6.C1181k;
import V6.AbstractC1287s;
import com.google.android.gms.common.C2012d;

/* renamed from: T6.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1187q {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1186p f9461a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1193x f9462b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f9463c;

    /* renamed from: T6.q$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private r f9464a;

        /* renamed from: b, reason: collision with root package name */
        private r f9465b;

        /* renamed from: d, reason: collision with root package name */
        private C1181k f9467d;

        /* renamed from: e, reason: collision with root package name */
        private C2012d[] f9468e;

        /* renamed from: g, reason: collision with root package name */
        private int f9470g;

        /* renamed from: c, reason: collision with root package name */
        private Runnable f9466c = new Runnable() { // from class: T6.f0
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f, reason: collision with root package name */
        private boolean f9469f = true;

        /* synthetic */ a(AbstractC1178i0 abstractC1178i0) {
        }

        public C1187q a() {
            AbstractC1287s.b(this.f9464a != null, "Must set register function");
            AbstractC1287s.b(this.f9465b != null, "Must set unregister function");
            AbstractC1287s.b(this.f9467d != null, "Must set holder");
            return new C1187q(new C1174g0(this, this.f9467d, this.f9468e, this.f9469f, this.f9470g), new C1176h0(this, (C1181k.a) AbstractC1287s.n(this.f9467d.b(), "Key must not be null")), this.f9466c, null);
        }

        public a b(r rVar) {
            this.f9464a = rVar;
            return this;
        }

        public a c(int i10) {
            this.f9470g = i10;
            return this;
        }

        public a d(r rVar) {
            this.f9465b = rVar;
            return this;
        }

        public a e(C1181k c1181k) {
            this.f9467d = c1181k;
            return this;
        }
    }

    /* synthetic */ C1187q(AbstractC1186p abstractC1186p, AbstractC1193x abstractC1193x, Runnable runnable, AbstractC1180j0 abstractC1180j0) {
        this.f9461a = abstractC1186p;
        this.f9462b = abstractC1193x;
        this.f9463c = runnable;
    }

    public static a a() {
        return new a(null);
    }
}
