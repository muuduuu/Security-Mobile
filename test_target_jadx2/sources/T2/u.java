package T2;

import androidx.lifecycle.AbstractC1604v;
import androidx.lifecycle.C1607y;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.InterfaceC3735a;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class u extends S {

    /* renamed from: b, reason: collision with root package name */
    private final C1607y f9232b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1604v f9233c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC1604v f9234d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC1604v f9235e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC1604v f9236f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC1604v f9237g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC1604v f9238h;

    static final class a extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9239a = new a();

        a() {
            super(2);
        }

        public final boolean a(boolean z10, boolean z11) {
            return (z10 && z11) ? false : true;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue()));
        }
    }

    public static final class b implements InterfaceC3735a {
        @Override // o.InterfaceC3735a
        public final Object apply(Object obj) {
            HttpTransaction httpTransaction = (HttpTransaction) obj;
            boolean z10 = false;
            if (httpTransaction != null && !Intrinsics.b(httpTransaction.getFormattedPath(true), httpTransaction.getFormattedPath(false))) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class c implements InterfaceC3735a {
        @Override // o.InterfaceC3735a
        public final Object apply(Object obj) {
            String requestContentType;
            HttpTransaction httpTransaction = (HttpTransaction) obj;
            boolean z10 = false;
            if (httpTransaction != null && (requestContentType = httpTransaction.getRequestContentType()) != null) {
                z10 = StringsKt.I(requestContentType, "x-www-form-urlencoded", true);
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class d extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9240a = new d();

        d() {
            super(2);
        }

        public final String a(HttpTransaction httpTransaction, boolean z10) {
            if (httpTransaction == null) {
                return BuildConfig.FLAVOR;
            }
            return ((Object) httpTransaction.getMethod()) + ' ' + httpTransaction.getFormattedPath(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((HttpTransaction) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public u(long j10) {
        C1607y c1607y = new C1607y(Boolean.FALSE);
        this.f9232b = c1607y;
        this.f9233c = c1607y;
        O2.e eVar = O2.e.f7006a;
        this.f9234d = Q2.r.f(eVar.c().e(j10), c1607y, d.f9240a);
        AbstractC1604v a10 = Q.a(eVar.c().e(j10), new b());
        Intrinsics.checkNotNullExpressionValue(a10, "Transformations.map(this) { transform(it) }");
        this.f9235e = a10;
        AbstractC1604v a11 = Q.a(eVar.c().e(j10), new c());
        Intrinsics.checkNotNullExpressionValue(a11, "Transformations.map(this) { transform(it) }");
        this.f9236f = a11;
        this.f9237g = eVar.c().e(j10);
        this.f9238h = Q2.r.f(a11, c1607y, a.f9239a);
    }

    public final void e(boolean z10) {
        this.f9232b.o(Boolean.valueOf(z10));
    }

    public final AbstractC1604v f() {
        return this.f9236f;
    }

    public final AbstractC1604v g() {
        return this.f9235e;
    }

    public final AbstractC1604v h() {
        return this.f9233c;
    }

    public final AbstractC1604v i() {
        return this.f9238h;
    }

    public final AbstractC1604v j() {
        return this.f9237g;
    }

    public final AbstractC1604v k() {
        return this.f9234d;
    }

    public final void l() {
        Intrinsics.d(this.f9233c.f());
        e(!((Boolean) r0).booleanValue());
    }
}
