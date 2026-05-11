package u6;

import org.conscrypt.BuildConfig;
import s6.AbstractC4318d;
import s6.C4317c;
import s6.InterfaceC4321g;
import u6.n;

/* loaded from: classes2.dex */
final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    private final o f43530a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43531b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4318d f43532c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4321g f43533d;

    /* renamed from: e, reason: collision with root package name */
    private final C4317c f43534e;

    static final class b extends n.a {

        /* renamed from: a, reason: collision with root package name */
        private o f43535a;

        /* renamed from: b, reason: collision with root package name */
        private String f43536b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC4318d f43537c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC4321g f43538d;

        /* renamed from: e, reason: collision with root package name */
        private C4317c f43539e;

        b() {
        }

        @Override // u6.n.a
        public n a() {
            o oVar = this.f43535a;
            String str = BuildConfig.FLAVOR;
            if (oVar == null) {
                str = BuildConfig.FLAVOR + " transportContext";
            }
            if (this.f43536b == null) {
                str = str + " transportName";
            }
            if (this.f43537c == null) {
                str = str + " event";
            }
            if (this.f43538d == null) {
                str = str + " transformer";
            }
            if (this.f43539e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f43535a, this.f43536b, this.f43537c, this.f43538d, this.f43539e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u6.n.a
        n.a b(C4317c c4317c) {
            if (c4317c == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f43539e = c4317c;
            return this;
        }

        @Override // u6.n.a
        n.a c(AbstractC4318d abstractC4318d) {
            if (abstractC4318d == null) {
                throw new NullPointerException("Null event");
            }
            this.f43537c = abstractC4318d;
            return this;
        }

        @Override // u6.n.a
        n.a d(InterfaceC4321g interfaceC4321g) {
            if (interfaceC4321g == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f43538d = interfaceC4321g;
            return this;
        }

        @Override // u6.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f43535a = oVar;
            return this;
        }

        @Override // u6.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f43536b = str;
            return this;
        }
    }

    @Override // u6.n
    public C4317c b() {
        return this.f43534e;
    }

    @Override // u6.n
    AbstractC4318d c() {
        return this.f43532c;
    }

    @Override // u6.n
    InterfaceC4321g e() {
        return this.f43533d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f43530a.equals(nVar.f()) && this.f43531b.equals(nVar.g()) && this.f43532c.equals(nVar.c()) && this.f43533d.equals(nVar.e()) && this.f43534e.equals(nVar.b());
    }

    @Override // u6.n
    public o f() {
        return this.f43530a;
    }

    @Override // u6.n
    public String g() {
        return this.f43531b;
    }

    public int hashCode() {
        return ((((((((this.f43530a.hashCode() ^ 1000003) * 1000003) ^ this.f43531b.hashCode()) * 1000003) ^ this.f43532c.hashCode()) * 1000003) ^ this.f43533d.hashCode()) * 1000003) ^ this.f43534e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f43530a + ", transportName=" + this.f43531b + ", event=" + this.f43532c + ", transformer=" + this.f43533d + ", encoding=" + this.f43534e + "}";
    }

    private c(o oVar, String str, AbstractC4318d abstractC4318d, InterfaceC4321g interfaceC4321g, C4317c c4317c) {
        this.f43530a = oVar;
        this.f43531b = str;
        this.f43532c = abstractC4318d;
        this.f43533d = interfaceC4321g;
        this.f43534e = c4317c;
    }
}
