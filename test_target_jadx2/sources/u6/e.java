package u6;

import B6.w;
import C6.C0756g;
import C6.C0757h;
import C6.C0758i;
import C6.C0759j;
import C6.InterfaceC0753d;
import C6.N;
import C6.V;
import android.content.Context;
import javax.inject.Provider;
import u6.u;
import v6.C4958j;
import v6.C4960l;
import w6.AbstractC5042d;
import w6.C5039a;
import w6.C5041c;
import w6.InterfaceC5040b;

/* loaded from: classes2.dex */
final class e extends u {

    /* renamed from: a, reason: collision with root package name */
    private Provider f43546a;

    /* renamed from: b, reason: collision with root package name */
    private Provider f43547b;

    /* renamed from: c, reason: collision with root package name */
    private Provider f43548c;

    /* renamed from: d, reason: collision with root package name */
    private Provider f43549d;

    /* renamed from: e, reason: collision with root package name */
    private Provider f43550e;

    /* renamed from: f, reason: collision with root package name */
    private Provider f43551f;

    /* renamed from: g, reason: collision with root package name */
    private Provider f43552g;

    /* renamed from: h, reason: collision with root package name */
    private Provider f43553h;

    /* renamed from: i, reason: collision with root package name */
    private Provider f43554i;

    /* renamed from: j, reason: collision with root package name */
    private Provider f43555j;

    /* renamed from: k, reason: collision with root package name */
    private Provider f43556k;

    /* renamed from: l, reason: collision with root package name */
    private Provider f43557l;

    /* renamed from: m, reason: collision with root package name */
    private Provider f43558m;

    private static final class b implements u.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f43559a;

        private b() {
        }

        @Override // u6.u.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f43559a = (Context) AbstractC5042d.b(context);
            return this;
        }

        @Override // u6.u.a
        public u c() {
            AbstractC5042d.a(this.f43559a, Context.class);
            return new e(this.f43559a);
        }
    }

    public static u.a c() {
        return new b();
    }

    private void d(Context context) {
        this.f43546a = C5039a.a(k.a());
        InterfaceC5040b a10 = C5041c.a(context);
        this.f43547b = a10;
        C4958j a11 = C4958j.a(a10, E6.c.a(), E6.d.a());
        this.f43548c = a11;
        this.f43549d = C5039a.a(C4960l.a(this.f43547b, a11));
        this.f43550e = V.a(this.f43547b, C0756g.a(), C0758i.a());
        this.f43551f = C5039a.a(C0757h.a(this.f43547b));
        this.f43552g = C5039a.a(N.a(E6.c.a(), E6.d.a(), C0759j.a(), this.f43550e, this.f43551f));
        A6.g b10 = A6.g.b(E6.c.a());
        this.f43553h = b10;
        A6.i a12 = A6.i.a(this.f43547b, this.f43552g, b10, E6.d.a());
        this.f43554i = a12;
        Provider provider = this.f43546a;
        Provider provider2 = this.f43549d;
        Provider provider3 = this.f43552g;
        this.f43555j = A6.d.a(provider, provider2, a12, provider3, provider3);
        Provider provider4 = this.f43547b;
        Provider provider5 = this.f43549d;
        Provider provider6 = this.f43552g;
        this.f43556k = B6.s.a(provider4, provider5, provider6, this.f43554i, this.f43546a, provider6, E6.c.a(), E6.d.a(), this.f43552g);
        Provider provider7 = this.f43546a;
        Provider provider8 = this.f43552g;
        this.f43557l = w.a(provider7, provider8, this.f43554i, provider8);
        this.f43558m = C5039a.a(v.a(E6.c.a(), E6.d.a(), this.f43555j, this.f43556k, this.f43557l));
    }

    @Override // u6.u
    InterfaceC0753d a() {
        return (InterfaceC0753d) this.f43552g.get();
    }

    @Override // u6.u
    t b() {
        return (t) this.f43558m.get();
    }

    private e(Context context) {
        d(context);
    }
}
