package b4;

import Z3.x;
import android.net.Uri;
import c4.C1726c;
import c4.C1727d;
import com.facebook.imagepipeline.producers.F;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.p0;
import f3.AbstractC3142a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC3607d;
import l3.InterfaceC3606c;
import m4.b;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: o, reason: collision with root package name */
    public static final a f18564o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    private static final CancellationException f18565p = new CancellationException("Prefetching is not enabled");

    /* renamed from: q, reason: collision with root package name */
    private static final CancellationException f18566q = new CancellationException("ImageRequest is null");

    /* renamed from: a, reason: collision with root package name */
    private final t f18567a;

    /* renamed from: b, reason: collision with root package name */
    private final b3.o f18568b;

    /* renamed from: c, reason: collision with root package name */
    private final i4.e f18569c;

    /* renamed from: d, reason: collision with root package name */
    private final i4.d f18570d;

    /* renamed from: e, reason: collision with root package name */
    private final x f18571e;

    /* renamed from: f, reason: collision with root package name */
    private final x f18572f;

    /* renamed from: g, reason: collision with root package name */
    private final Z3.j f18573g;

    /* renamed from: h, reason: collision with root package name */
    private final Z3.j f18574h;

    /* renamed from: i, reason: collision with root package name */
    private final Z3.k f18575i;

    /* renamed from: j, reason: collision with root package name */
    private final p0 f18576j;

    /* renamed from: k, reason: collision with root package name */
    private final b3.o f18577k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicLong f18578l;

    /* renamed from: m, reason: collision with root package name */
    private final b3.o f18579m;

    /* renamed from: n, reason: collision with root package name */
    private final m f18580n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18581a;

        static {
            int[] iArr = new int[b.EnumC0557b.values().length];
            try {
                iArr[b.EnumC0557b.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.EnumC0557b.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18581a = iArr;
        }
    }

    public k(t producerSequenceFactory, Set requestListeners, Set requestListener2s, b3.o isPrefetchEnabledSupplier, x bitmapMemoryCache, x encodedMemoryCache, Z3.j mainBufferedDiskCache, Z3.j smallImageBufferedDiskCache, Z3.k cacheKeyFactory, p0 threadHandoffProducerQueue, b3.o suppressBitmapPrefetchingSupplier, b3.o lazyDataSource, X2.a aVar, m config) {
        Intrinsics.checkNotNullParameter(producerSequenceFactory, "producerSequenceFactory");
        Intrinsics.checkNotNullParameter(requestListeners, "requestListeners");
        Intrinsics.checkNotNullParameter(requestListener2s, "requestListener2s");
        Intrinsics.checkNotNullParameter(isPrefetchEnabledSupplier, "isPrefetchEnabledSupplier");
        Intrinsics.checkNotNullParameter(bitmapMemoryCache, "bitmapMemoryCache");
        Intrinsics.checkNotNullParameter(encodedMemoryCache, "encodedMemoryCache");
        Intrinsics.checkNotNullParameter(mainBufferedDiskCache, "mainBufferedDiskCache");
        Intrinsics.checkNotNullParameter(smallImageBufferedDiskCache, "smallImageBufferedDiskCache");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
        Intrinsics.checkNotNullParameter(lazyDataSource, "lazyDataSource");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f18567a = producerSequenceFactory;
        this.f18568b = isPrefetchEnabledSupplier;
        this.f18569c = new i4.c(requestListeners);
        this.f18570d = new i4.b(requestListener2s);
        this.f18578l = new AtomicLong();
        this.f18571e = bitmapMemoryCache;
        this.f18572f = encodedMemoryCache;
        this.f18573g = mainBufferedDiskCache;
        this.f18574h = smallImageBufferedDiskCache;
        this.f18575i = cacheKeyFactory;
        this.f18576j = threadHandoffProducerQueue;
        this.f18577k = suppressBitmapPrefetchingSupplier;
        this.f18579m = lazyDataSource;
        this.f18580n = config;
    }

    private final InterfaceC3606c A(d0 d0Var, m4.b bVar, b.c cVar, Object obj, a4.e eVar, i4.e eVar2) {
        F f10 = new F(o(bVar, eVar2), this.f18570d);
        try {
            b.c max = b.c.getMax(bVar.j(), cVar);
            Intrinsics.checkNotNullExpressionValue(max, "getMax(\n              im…ttedRequestLevelOnSubmit)");
            String l10 = l();
            n F10 = this.f18580n.F();
            return C1727d.f19370j.a(d0Var, new l0(bVar, l10, f10, obj, max, true, F10 != null && F10.b() && bVar.o(), eVar, this.f18580n), f10);
        } catch (Exception e10) {
            InterfaceC3606c b10 = AbstractC3607d.b(e10);
            Intrinsics.checkNotNullExpressionValue(b10, "{\n      DataSources.imme…taSource(exception)\n    }");
            return b10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(V2.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public static /* synthetic */ InterfaceC3606c j(k kVar, m4.b bVar, Object obj, b.c cVar, i4.e eVar, String str, int i10, Object obj2) {
        return kVar.i(bVar, obj, (i10 & 4) != 0 ? null : cVar, (i10 & 8) != 0 ? null : eVar, (i10 & 16) != 0 ? null : str);
    }

    private final b3.m u(final Uri uri) {
        return new b3.m() { // from class: b4.i
            @Override // b3.m
            public final boolean apply(Object obj) {
                boolean v10;
                v10 = k.v(uri, (V2.d) obj);
                return v10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(Uri uri, V2.d key) {
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(key, "key");
        return key.a(uri);
    }

    private final InterfaceC3606c y(d0 d0Var, m4.b bVar, b.c cVar, Object obj, i4.e eVar, String str) {
        return z(d0Var, bVar, cVar, obj, eVar, str, null);
    }

    private final InterfaceC3606c z(d0 d0Var, m4.b bVar, b.c cVar, Object obj, i4.e eVar, String str, Map map) {
        InterfaceC3606c b10;
        b.c max;
        String l10;
        boolean z10;
        boolean z11;
        if (!n4.b.d()) {
            F f10 = new F(o(bVar, eVar), this.f18570d);
            try {
                b.c max2 = b.c.getMax(bVar.j(), cVar);
                Intrinsics.checkNotNullExpressionValue(max2, "getMax(\n                …ttedRequestLevelOnSubmit)");
                String l11 = l();
                if (!bVar.o() && j3.f.n(bVar.u())) {
                    z11 = false;
                    l0 l0Var = new l0(bVar, l11, str, f10, obj, max2, false, z11, bVar.n(), this.f18580n);
                    l0Var.g(map);
                    InterfaceC3606c H10 = C1726c.H(d0Var, l0Var, f10);
                    Intrinsics.checkNotNullExpressionValue(H10, "{\n          val lowestPe…questListener2)\n        }");
                    return H10;
                }
                z11 = true;
                l0 l0Var2 = new l0(bVar, l11, str, f10, obj, max2, false, z11, bVar.n(), this.f18580n);
                l0Var2.g(map);
                InterfaceC3606c H102 = C1726c.H(d0Var, l0Var2, f10);
                Intrinsics.checkNotNullExpressionValue(H102, "{\n          val lowestPe…questListener2)\n        }");
                return H102;
            } catch (Exception e10) {
                InterfaceC3606c b11 = AbstractC3607d.b(e10);
                Intrinsics.checkNotNullExpressionValue(b11, "{\n          DataSources.…urce(exception)\n        }");
                return b11;
            }
        }
        n4.b.a("ImagePipeline#submitFetchRequest");
        try {
            F f11 = new F(o(bVar, eVar), this.f18570d);
            try {
                max = b.c.getMax(bVar.j(), cVar);
                Intrinsics.checkNotNullExpressionValue(max, "getMax(\n                …ttedRequestLevelOnSubmit)");
                l10 = l();
            } catch (Exception e11) {
                b10 = AbstractC3607d.b(e11);
                Intrinsics.checkNotNullExpressionValue(b10, "{\n          DataSources.…urce(exception)\n        }");
            }
            if (!bVar.o() && j3.f.n(bVar.u())) {
                z10 = false;
                l0 l0Var3 = new l0(bVar, l10, str, f11, obj, max, false, z10, bVar.n(), this.f18580n);
                l0Var3.g(map);
                b10 = C1726c.H(d0Var, l0Var3, f11);
                Intrinsics.checkNotNullExpressionValue(b10, "{\n          val lowestPe…questListener2)\n        }");
                n4.b.b();
                return b10;
            }
            z10 = true;
            l0 l0Var32 = new l0(bVar, l10, str, f11, obj, max, false, z10, bVar.n(), this.f18580n);
            l0Var32.g(map);
            b10 = C1726c.H(d0Var, l0Var32, f11);
            Intrinsics.checkNotNullExpressionValue(b10, "{\n          val lowestPe…questListener2)\n        }");
            n4.b.b();
            return b10;
        } catch (Throwable th) {
            n4.b.b();
            throw th;
        }
    }

    public final void c() {
        e();
        d();
    }

    public final void d() {
        this.f18573g.h();
        this.f18574h.h();
    }

    public final void e() {
        b3.m mVar = new b3.m() { // from class: b4.j
            @Override // b3.m
            public final boolean apply(Object obj) {
                boolean f10;
                f10 = k.f((V2.d) obj);
                return f10;
            }
        };
        this.f18571e.f(mVar);
        this.f18572f.f(mVar);
    }

    public final InterfaceC3606c g(m4.b bVar, Object obj) {
        return j(this, bVar, obj, null, null, null, 24, null);
    }

    public final InterfaceC3606c h(m4.b bVar, Object obj, b.c lowestPermittedRequestLevelOnSubmit) {
        Intrinsics.checkNotNullParameter(lowestPermittedRequestLevelOnSubmit, "lowestPermittedRequestLevelOnSubmit");
        return j(this, bVar, obj, lowestPermittedRequestLevelOnSubmit, null, null, 16, null);
    }

    public final InterfaceC3606c i(m4.b bVar, Object obj, b.c cVar, i4.e eVar, String str) {
        if (bVar == null) {
            InterfaceC3606c b10 = AbstractC3607d.b(new NullPointerException());
            Intrinsics.checkNotNullExpressionValue(b10, "immediateFailedDataSource(NullPointerException())");
            return b10;
        }
        try {
            d0 p10 = this.f18567a.p(bVar);
            if (cVar == null) {
                cVar = b.c.FULL_FETCH;
            }
            return y(p10, bVar, cVar, obj, eVar, str);
        } catch (Exception e10) {
            InterfaceC3606c b11 = AbstractC3607d.b(e10);
            Intrinsics.checkNotNullExpressionValue(b11, "{\n      DataSources.imme…taSource(exception)\n    }");
            return b11;
        }
    }

    public final InterfaceC3606c k(m4.b imageRequest, Object obj) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return h(imageRequest, obj, b.c.BITMAP_MEMORY_CACHE);
    }

    public final String l() {
        return String.valueOf(this.f18578l.getAndIncrement());
    }

    public final x m() {
        return this.f18571e;
    }

    public final Z3.k n() {
        return this.f18575i;
    }

    public final i4.e o(m4.b bVar, i4.e eVar) {
        if (bVar != null) {
            return eVar == null ? bVar.p() == null ? this.f18569c : new i4.c(this.f18569c, bVar.p()) : bVar.p() == null ? new i4.c(this.f18569c, eVar) : new i4.c(this.f18569c, eVar, bVar.p());
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean p(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f18571e.g(u(uri));
    }

    public final boolean q(m4.b bVar) {
        if (bVar == null) {
            return false;
        }
        V2.d cacheKey = this.f18575i.d(bVar, null);
        x xVar = this.f18571e;
        Intrinsics.checkNotNullExpressionValue(cacheKey, "cacheKey");
        AbstractC3142a abstractC3142a = xVar.get(cacheKey);
        try {
            return AbstractC3142a.x(abstractC3142a);
        } finally {
            AbstractC3142a.n(abstractC3142a);
        }
    }

    public final boolean r(Uri uri) {
        return s(uri, b.EnumC0557b.SMALL) || s(uri, b.EnumC0557b.DEFAULT);
    }

    public final boolean s(Uri uri, b.EnumC0557b enumC0557b) {
        m4.b imageRequest = m4.c.w(uri).z(enumC0557b).a();
        Intrinsics.checkNotNullExpressionValue(imageRequest, "imageRequest");
        return t(imageRequest);
    }

    public final boolean t(m4.b imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        V2.d cacheKey = this.f18575i.c(imageRequest, null);
        b.EnumC0557b c10 = imageRequest.c();
        Intrinsics.checkNotNullExpressionValue(c10, "imageRequest.cacheChoice");
        int i10 = b.f18581a[c10.ordinal()];
        if (i10 == 1) {
            Z3.j jVar = this.f18573g;
            Intrinsics.checkNotNullExpressionValue(cacheKey, "cacheKey");
            return jVar.k(cacheKey);
        }
        if (i10 != 2) {
            return false;
        }
        Z3.j jVar2 = this.f18574h;
        Intrinsics.checkNotNullExpressionValue(cacheKey, "cacheKey");
        return jVar2.k(cacheKey);
    }

    public final InterfaceC3606c w(m4.b bVar, Object obj) {
        return x(bVar, obj, a4.e.MEDIUM, null);
    }

    public final InterfaceC3606c x(m4.b bVar, Object obj, a4.e priority, i4.e eVar) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (!((Boolean) this.f18568b.get()).booleanValue()) {
            InterfaceC3606c b10 = AbstractC3607d.b(f18565p);
            Intrinsics.checkNotNullExpressionValue(b10, "immediateFailedDataSource(PREFETCH_EXCEPTION)");
            return b10;
        }
        if (bVar == null) {
            InterfaceC3606c b11 = AbstractC3607d.b(new NullPointerException("imageRequest is null"));
            Intrinsics.checkNotNullExpressionValue(b11, "{\n      DataSources.imme…eRequest is null\"))\n    }");
            return b11;
        }
        try {
            return A(this.f18567a.r(bVar), bVar, b.c.FULL_FETCH, obj, priority, eVar);
        } catch (Exception e10) {
            InterfaceC3606c b12 = AbstractC3607d.b(e10);
            Intrinsics.checkNotNullExpressionValue(b12, "{\n        DataSources.im…Source(exception)\n      }");
            return b12;
        }
    }
}
