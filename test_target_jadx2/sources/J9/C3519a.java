package j9;

import Td.B;
import Td.C1231g;
import Td.m;
import Td.o;
import Td.q;
import Td.r;
import Td.s;
import Td.x;
import android.content.Context;
import com.groww.skynet.internal.interceptor.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import k9.InterfaceC3555a;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l9.AbstractC3613a;
import m9.C3661a;
import o9.AbstractC3769a;
import p9.C3854a;

/* renamed from: j9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3519a {

    /* renamed from: m, reason: collision with root package name */
    public static final b f35925m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    private static Context f35926n;

    /* renamed from: a, reason: collision with root package name */
    private final B f35927a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35928b;

    /* renamed from: c, reason: collision with root package name */
    private final o f35929c;

    /* renamed from: d, reason: collision with root package name */
    private final List f35930d;

    /* renamed from: e, reason: collision with root package name */
    private final List f35931e;

    /* renamed from: f, reason: collision with root package name */
    private final s f35932f;

    /* renamed from: g, reason: collision with root package name */
    private final s.c f35933g;

    /* renamed from: h, reason: collision with root package name */
    private final r f35934h;

    /* renamed from: i, reason: collision with root package name */
    private final long f35935i;

    /* renamed from: j, reason: collision with root package name */
    private final long f35936j;

    /* renamed from: k, reason: collision with root package name */
    private final q f35937k;

    /* renamed from: l, reason: collision with root package name */
    private final C1231g f35938l;

    /* renamed from: j9.a$a, reason: collision with other inner class name */
    public static final class C0516a {

        /* renamed from: d, reason: collision with root package name */
        private s f35942d;

        /* renamed from: e, reason: collision with root package name */
        private s.c f35943e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f35944f;

        /* renamed from: g, reason: collision with root package name */
        private r f35945g;

        /* renamed from: h, reason: collision with root package name */
        private B f35946h;

        /* renamed from: i, reason: collision with root package name */
        private C1231g f35947i;

        /* renamed from: l, reason: collision with root package name */
        private q f35950l;

        /* renamed from: a, reason: collision with root package name */
        private List f35939a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private List f35940b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private o f35941c = o.f10187b;

        /* renamed from: j, reason: collision with root package name */
        private long f35948j = 20;

        /* renamed from: k, reason: collision with root package name */
        private long f35949k = 15;

        public final C3519a a() {
            B.a i10;
            B b10 = this.f35946h;
            if (b10 != null) {
                Intrinsics.d(b10);
                i10 = b10.A();
                i10.Z().clear();
                i10.a0().clear();
            } else {
                B.a o10 = new B.a().o(true);
                long j10 = this.f35949k;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                i10 = o10.g(j10, timeUnit).d0(this.f35948j, timeUnit).i(CollectionsKt.e(m.f10150i));
                Pair a10 = C3854a.f38488a.a();
                if (a10 != null) {
                    i10.h0((SSLSocketFactory) a10.c(), (X509TrustManager) a10.d());
                }
            }
            B.a j11 = i10.j(this.f35941c);
            if (this.f35944f) {
                com.groww.skynet.internal.interceptor.b bVar = com.groww.skynet.internal.interceptor.b.f28827a;
                Context context = C3519a.f35926n;
                if (context == null) {
                    Intrinsics.v("appContext");
                    context = null;
                }
                Iterator it = bVar.a(context).iterator();
                while (it.hasNext()) {
                    j11.a((x) it.next());
                }
            } else {
                j11.a(Ud.a.f10427a);
            }
            Iterator it2 = this.f35939a.iterator();
            while (it2.hasNext()) {
                i10.a((x) it2.next());
            }
            i10.b(new c());
            Iterator it3 = this.f35940b.iterator();
            while (it3.hasNext()) {
                i10.b((x) it3.next());
            }
            C1231g c1231g = this.f35947i;
            if (c1231g != null) {
                i10.f(c1231g);
            }
            s sVar = this.f35942d;
            if (sVar != null) {
                i10.m(sVar);
            }
            s.c cVar = this.f35943e;
            if (cVar != null) {
                i10.n(cVar);
            }
            r rVar = this.f35945g;
            if (rVar != null) {
                i10.l(rVar);
            }
            q qVar = this.f35950l;
            if (qVar != null) {
                i10.k(qVar);
            }
            return new C3519a(i10.c(), this);
        }

        public final C0516a b(boolean z10) {
            this.f35944f = z10;
            return this;
        }

        public final C1231g c() {
            return this.f35947i;
        }

        public final long d() {
            return this.f35949k;
        }

        public final o e() {
            return this.f35941c;
        }

        public final AbstractC3613a f() {
            return null;
        }

        public final com.groww.skynet.internal.interceptor.a g() {
            return null;
        }

        public final q h() {
            return this.f35950l;
        }

        public final r i() {
            return this.f35945g;
        }

        public final s j() {
            return this.f35942d;
        }

        public final s.c k() {
            return this.f35943e;
        }

        public final List l() {
            return this.f35939a;
        }

        public final InterfaceC3555a m() {
            return null;
        }

        public final List n() {
            return this.f35940b;
        }

        public final boolean o() {
            return this.f35944f;
        }

        public final AbstractC3769a p() {
            return null;
        }

        public final long q() {
            return this.f35948j;
        }
    }

    /* renamed from: j9.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            C3519a.f35926n = applicationContext;
            C3661a c3661a = C3661a.f37422a;
            Context context2 = C3519a.f35926n;
            if (context2 == null) {
                Intrinsics.v("appContext");
                context2 = null;
            }
            c3661a.a(context2);
        }

        private b() {
        }
    }

    public C3519a(B okHttpClient, C0516a builder) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f35927a = okHttpClient;
        this.f35928b = builder.o();
        this.f35929c = builder.e();
        C3854a c3854a = C3854a.f38488a;
        this.f35930d = c3854a.b(builder.l());
        this.f35931e = c3854a.b(builder.n());
        builder.m();
        this.f35932f = builder.j();
        this.f35933g = builder.k();
        this.f35934h = builder.i();
        this.f35935i = builder.q();
        this.f35936j = builder.d();
        this.f35937k = builder.h();
        builder.g();
        builder.f();
        this.f35938l = builder.c();
        builder.p();
    }

    public final B c() {
        return this.f35927a;
    }
}
