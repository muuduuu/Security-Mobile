package b4;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import com.facebook.imagepipeline.producers.A;
import com.facebook.imagepipeline.producers.C1835b;
import com.facebook.imagepipeline.producers.C1840g;
import com.facebook.imagepipeline.producers.C1841h;
import com.facebook.imagepipeline.producers.C1842i;
import com.facebook.imagepipeline.producers.C1844k;
import com.facebook.imagepipeline.producers.C1846m;
import com.facebook.imagepipeline.producers.C1848o;
import com.facebook.imagepipeline.producers.C1849p;
import com.facebook.imagepipeline.producers.C1851s;
import com.facebook.imagepipeline.producers.C1854v;
import com.facebook.imagepipeline.producers.C1856x;
import com.facebook.imagepipeline.producers.C1857y;
import com.facebook.imagepipeline.producers.H;
import com.facebook.imagepipeline.producers.I;
import com.facebook.imagepipeline.producers.J;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.M;
import com.facebook.imagepipeline.producers.N;
import com.facebook.imagepipeline.producers.S;
import com.facebook.imagepipeline.producers.T;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u0;
import d3.C2976a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m4.b;
import o4.InterfaceC3751d;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: K, reason: collision with root package name */
    public static final a f18792K = new a(null);

    /* renamed from: A, reason: collision with root package name */
    private final Lazy f18793A;

    /* renamed from: B, reason: collision with root package name */
    private final Lazy f18794B;

    /* renamed from: C, reason: collision with root package name */
    private final Lazy f18795C;

    /* renamed from: D, reason: collision with root package name */
    private final Lazy f18796D;

    /* renamed from: E, reason: collision with root package name */
    private final Lazy f18797E;

    /* renamed from: F, reason: collision with root package name */
    private final Lazy f18798F;

    /* renamed from: G, reason: collision with root package name */
    private final Lazy f18799G;

    /* renamed from: H, reason: collision with root package name */
    private final Lazy f18800H;

    /* renamed from: I, reason: collision with root package name */
    private final Lazy f18801I;

    /* renamed from: J, reason: collision with root package name */
    private final Lazy f18802J;

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f18803a;

    /* renamed from: b, reason: collision with root package name */
    private final b4.s f18804b;

    /* renamed from: c, reason: collision with root package name */
    private final X f18805c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18806d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18807e;

    /* renamed from: f, reason: collision with root package name */
    private final p0 f18808f;

    /* renamed from: g, reason: collision with root package name */
    private final b4.e f18809g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f18810h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f18811i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f18812j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3751d f18813k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f18814l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f18815m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f18816n;

    /* renamed from: o, reason: collision with root package name */
    private final Set f18817o;

    /* renamed from: p, reason: collision with root package name */
    private Map f18818p;

    /* renamed from: q, reason: collision with root package name */
    private Map f18819q;

    /* renamed from: r, reason: collision with root package name */
    private Map f18820r;

    /* renamed from: s, reason: collision with root package name */
    private final Lazy f18821s;

    /* renamed from: t, reason: collision with root package name */
    private final Lazy f18822t;

    /* renamed from: u, reason: collision with root package name */
    private final Lazy f18823u;

    /* renamed from: v, reason: collision with root package name */
    private final Lazy f18824v;

    /* renamed from: w, reason: collision with root package name */
    private final Lazy f18825w;

    /* renamed from: x, reason: collision with root package name */
    private final Lazy f18826x;

    /* renamed from: y, reason: collision with root package name */
    private final Lazy f18827y;

    /* renamed from: z, reason: collision with root package name */
    private final Lazy f18828z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(Uri uri) {
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
            if (uri2.length() <= 30) {
                return uri2;
            }
            String substring = uri2.substring(0, 30);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring + "...";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(m4.b bVar) {
            b3.l.b(Boolean.valueOf(bVar.j().getValue() <= b.c.ENCODED_MEMORY_CACHE.getValue()));
        }

        private a() {
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            n4.b bVar = n4.b.f37566a;
            t tVar = t.this;
            if (!n4.b.d()) {
                I r10 = tVar.f18804b.r();
                Intrinsics.checkNotNullExpressionValue(r10, "producerFactory.newLocalContentUriFetchProducer()");
                return tVar.f18804b.b(tVar.J(r10), tVar.f18808f);
            }
            n4.b.a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
            try {
                I r11 = tVar.f18804b.r();
                Intrinsics.checkNotNullExpressionValue(r11, "producerFactory.newLocalContentUriFetchProducer()");
                return tVar.f18804b.b(tVar.J(r11), tVar.f18808f);
            } finally {
                n4.b.b();
            }
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            n4.b bVar = n4.b.f37566a;
            t tVar = t.this;
            if (!n4.b.d()) {
                M u10 = tVar.f18804b.u();
                Intrinsics.checkNotNullExpressionValue(u10, "producerFactory.newLocalFileFetchProducer()");
                return tVar.f18804b.b(tVar.J(u10), tVar.f18808f);
            }
            n4.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
            try {
                M u11 = tVar.f18804b.u();
                Intrinsics.checkNotNullExpressionValue(u11, "producerFactory.newLocalFileFetchProducer()");
                return tVar.f18804b.b(tVar.J(u11), tVar.f18808f);
            } finally {
                n4.b.b();
            }
        }
    }

    static final class d extends xc.m implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            n4.b bVar = n4.b.f37566a;
            t tVar = t.this;
            if (!n4.b.d()) {
                return tVar.f18804b.b(tVar.n(), tVar.f18808f);
            }
            n4.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            try {
                return tVar.f18804b.b(tVar.n(), tVar.f18808f);
            } finally {
                n4.b.b();
            }
        }
    }

    static final class e extends xc.m implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            n4.b bVar = n4.b.f37566a;
            t tVar = t.this;
            if (!n4.b.d()) {
                return tVar.H(tVar.f18805c);
            }
            n4.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
            try {
                return tVar.H(tVar.f18805c);
            } finally {
                n4.b.b();
            }
        }
    }

    static final class f extends xc.m implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            C1848o i10 = t.this.f18804b.i();
            Intrinsics.checkNotNullExpressionValue(i10, "producerFactory.newDataFetchProducer()");
            C1835b a10 = b4.s.a(i10);
            Intrinsics.checkNotNullExpressionValue(a10, "newAddImageTransformMeta…taProducer(inputProducer)");
            k0 D10 = t.this.f18804b.D(a10, true, t.this.f18813k);
            Intrinsics.checkNotNullExpressionValue(D10, "producerFactory.newResiz…, imageTranscoderFactory)");
            return t.this.E(D10);
        }
    }

    static final class g extends xc.m implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            H q10 = t.this.f18804b.q();
            Intrinsics.checkNotNullExpressionValue(q10, "producerFactory.newLocalAssetFetchProducer()");
            return t.this.F(q10);
        }
    }

    static final class h extends xc.m implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            n4.b bVar = n4.b.f37566a;
            t tVar = t.this;
            if (!n4.b.d()) {
                return new j0(tVar.i());
            }
            n4.b.a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
            try {
                return new j0(tVar.i());
            } finally {
                n4.b.b();
            }
        }
    }

    static final class i extends xc.m implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            I r10 = t.this.f18804b.r();
            Intrinsics.checkNotNullExpressionValue(r10, "producerFactory.newLocalContentUriFetchProducer()");
            J s10 = t.this.f18804b.s();
            Intrinsics.checkNotNullExpressionValue(s10, "producerFactory.newLocal…iThumbnailFetchProducer()");
            LocalExifThumbnailProducer t10 = t.this.f18804b.t();
            Intrinsics.checkNotNullExpressionValue(t10, "producerFactory.newLocalExifThumbnailProducer()");
            return t.this.G(r10, new u0[]{s10, t10});
        }
    }

    static final class j extends xc.m implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            n4.b bVar = n4.b.f37566a;
            t tVar = t.this;
            if (!n4.b.d()) {
                return new j0(tVar.j());
            }
            n4.b.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
            try {
                return new j0(tVar.j());
            } finally {
                n4.b.b();
            }
        }
    }

    static final class k extends xc.m implements Function0 {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            n4.b bVar = n4.b.f37566a;
            t tVar = t.this;
            if (!n4.b.d()) {
                return tVar.f18804b.E(tVar.j());
            }
            n4.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            try {
                return tVar.f18804b.E(tVar.j());
            } finally {
                n4.b.b();
            }
        }
    }

    static final class l extends xc.m implements Function0 {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            M u10 = t.this.f18804b.u();
            Intrinsics.checkNotNullExpressionValue(u10, "producerFactory.newLocalFileFetchProducer()");
            return t.this.F(u10);
        }
    }

    static final class m extends xc.m implements Function0 {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            N v10 = t.this.f18804b.v();
            Intrinsics.checkNotNullExpressionValue(v10, "producerFactory.newLocalResourceFetchProducer()");
            return t.this.F(v10);
        }
    }

    static final class n extends xc.m implements Function0 {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            if (Build.VERSION.SDK_INT < 29) {
                throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
            }
            t tVar = t.this;
            S w10 = tVar.f18804b.w();
            Intrinsics.checkNotNullExpressionValue(w10, "producerFactory.newLocal…nailBitmapSdk29Producer()");
            return tVar.D(w10);
        }
    }

    static final class o extends xc.m implements Function0 {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            T x10 = t.this.f18804b.x();
            Intrinsics.checkNotNullExpressionValue(x10, "producerFactory.newLocalVideoThumbnailProducer()");
            return t.this.D(x10);
        }
    }

    static final class p extends xc.m implements Function0 {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            n4.b bVar = n4.b.f37566a;
            t tVar = t.this;
            if (!n4.b.d()) {
                return new j0(tVar.k());
            }
            n4.b.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
            try {
                return new j0(tVar.k());
            } finally {
                n4.b.b();
            }
        }
    }

    static final class q extends xc.m implements Function0 {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            n4.b bVar = n4.b.f37566a;
            t tVar = t.this;
            if (!n4.b.d()) {
                return tVar.E(tVar.n());
            }
            n4.b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            try {
                return tVar.E(tVar.n());
            } finally {
                n4.b.b();
            }
        }
    }

    static final class r extends xc.m implements Function0 {
        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            n4.b bVar = n4.b.f37566a;
            t tVar = t.this;
            if (!n4.b.d()) {
                return tVar.f18804b.E(tVar.k());
            }
            n4.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
            try {
                return tVar.f18804b.E(tVar.k());
            } finally {
                n4.b.b();
            }
        }
    }

    static final class s extends xc.m implements Function0 {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            i0 C10 = t.this.f18804b.C();
            Intrinsics.checkNotNullExpressionValue(C10, "producerFactory.newQuali…edResourceFetchProducer()");
            return t.this.F(C10);
        }
    }

    public t(ContentResolver contentResolver, b4.s producerFactory, X networkFetcher, boolean z10, boolean z11, p0 threadHandoffProducerQueue, b4.e downsampleMode, boolean z12, boolean z13, boolean z14, InterfaceC3751d imageTranscoderFactory, boolean z15, boolean z16, boolean z17, Set set) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(producerFactory, "producerFactory");
        Intrinsics.checkNotNullParameter(networkFetcher, "networkFetcher");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(imageTranscoderFactory, "imageTranscoderFactory");
        this.f18803a = contentResolver;
        this.f18804b = producerFactory;
        this.f18805c = networkFetcher;
        this.f18806d = z10;
        this.f18807e = z11;
        this.f18808f = threadHandoffProducerQueue;
        this.f18809g = downsampleMode;
        this.f18810h = z12;
        this.f18811i = z13;
        this.f18812j = z14;
        this.f18813k = imageTranscoderFactory;
        this.f18814l = z15;
        this.f18815m = z16;
        this.f18816n = z17;
        this.f18817o = set;
        this.f18818p = new LinkedHashMap();
        this.f18819q = new LinkedHashMap();
        this.f18820r = new LinkedHashMap();
        this.f18821s = lc.i.a(new p());
        this.f18822t = lc.i.a(new j());
        this.f18823u = lc.i.a(new h());
        this.f18824v = lc.i.a(new q());
        this.f18825w = lc.i.a(new d());
        this.f18826x = lc.i.a(new r());
        this.f18827y = lc.i.a(new e());
        this.f18828z = lc.i.a(new k());
        this.f18793A = lc.i.a(new c());
        this.f18794B = lc.i.a(new b());
        this.f18795C = lc.i.a(new l());
        this.f18796D = lc.i.a(new o());
        this.f18797E = lc.i.a(new i());
        this.f18798F = lc.i.a(new n());
        this.f18799G = lc.i.a(new s());
        this.f18800H = lc.i.a(new m());
        this.f18801I = lc.i.a(new g());
        this.f18802J = lc.i.a(new f());
    }

    private final synchronized d0 B(d0 d0Var) {
        d0 d0Var2;
        d0Var2 = (d0) this.f18818p.get(d0Var);
        if (d0Var2 == null) {
            b0 B10 = this.f18804b.B(d0Var);
            Intrinsics.checkNotNullExpressionValue(B10, "producerFactory.newPostp…orProducer(inputProducer)");
            d0Var2 = this.f18804b.A(B10);
            this.f18818p.put(d0Var, d0Var2);
        }
        return d0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 D(d0 d0Var) {
        C1842i e10 = this.f18804b.e(d0Var);
        Intrinsics.checkNotNullExpressionValue(e10, "producerFactory.newBitma…heProducer(inputProducer)");
        C1841h d10 = this.f18804b.d(e10);
        Intrinsics.checkNotNullExpressionValue(d10, "producerFactory.newBitma…itmapMemoryCacheProducer)");
        d0 b10 = this.f18804b.b(d10, this.f18808f);
        Intrinsics.checkNotNullExpressionValue(b10, "producerFactory.newBackg…readHandoffProducerQueue)");
        if (!this.f18814l && !this.f18815m) {
            C1840g c10 = this.f18804b.c(b10);
            Intrinsics.checkNotNullExpressionValue(c10, "producerFactory.newBitma…er(threadHandoffProducer)");
            return c10;
        }
        C1840g c11 = this.f18804b.c(b10);
        Intrinsics.checkNotNullExpressionValue(c11, "producerFactory.newBitma…er(threadHandoffProducer)");
        C1844k g10 = this.f18804b.g(c11);
        Intrinsics.checkNotNullExpressionValue(g10, "producerFactory.newBitma…apMemoryCacheGetProducer)");
        return g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 F(d0 d0Var) {
        LocalExifThumbnailProducer t10 = this.f18804b.t();
        Intrinsics.checkNotNullExpressionValue(t10, "producerFactory.newLocalExifThumbnailProducer()");
        return G(d0Var, new u0[]{t10});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 G(d0 d0Var, u0[] u0VarArr) {
        return E(L(J(d0Var), u0VarArr));
    }

    private final d0 I(d0 d0Var) {
        C1856x m10;
        C1856x m11;
        if (!n4.b.d()) {
            if (this.f18811i) {
                Y z10 = this.f18804b.z(d0Var);
                Intrinsics.checkNotNullExpressionValue(z10, "producerFactory.newParti…heProducer(inputProducer)");
                m11 = this.f18804b.m(z10);
            } else {
                m11 = this.f18804b.m(d0Var);
            }
            Intrinsics.checkNotNullExpressionValue(m11, "if (partialImageCachingE…utProducer)\n            }");
            C1854v l10 = this.f18804b.l(m11);
            Intrinsics.checkNotNullExpressionValue(l10, "producerFactory.newDiskC…ducer(cacheWriteProducer)");
            return l10;
        }
        n4.b.a("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            if (this.f18811i) {
                Y z11 = this.f18804b.z(d0Var);
                Intrinsics.checkNotNullExpressionValue(z11, "producerFactory.newParti…heProducer(inputProducer)");
                m10 = this.f18804b.m(z11);
            } else {
                m10 = this.f18804b.m(d0Var);
            }
            Intrinsics.checkNotNullExpressionValue(m10, "if (partialImageCachingE…utProducer)\n            }");
            C1854v l11 = this.f18804b.l(m10);
            Intrinsics.checkNotNullExpressionValue(l11, "producerFactory.newDiskC…ducer(cacheWriteProducer)");
            n4.b.b();
            return l11;
        } catch (Throwable th) {
            n4.b.b();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 J(d0 d0Var) {
        if (this.f18812j) {
            d0Var = I(d0Var);
        }
        d0 o10 = this.f18804b.o(d0Var);
        Intrinsics.checkNotNullExpressionValue(o10, "producerFactory.newEncodedMemoryCacheProducer(ip)");
        if (!this.f18815m) {
            C1857y n10 = this.f18804b.n(o10);
            Intrinsics.checkNotNullExpressionValue(n10, "producerFactory.newEncod…codedMemoryCacheProducer)");
            return n10;
        }
        A p10 = this.f18804b.p(o10);
        Intrinsics.checkNotNullExpressionValue(p10, "producerFactory.newEncod…codedMemoryCacheProducer)");
        C1857y n11 = this.f18804b.n(p10);
        Intrinsics.checkNotNullExpressionValue(n11, "producerFactory.newEncod…exProducer(probeProducer)");
        return n11;
    }

    private final d0 K(u0[] u0VarArr) {
        t0 G10 = this.f18804b.G(u0VarArr);
        Intrinsics.checkNotNullExpressionValue(G10, "producerFactory.newThumb…ducer(thumbnailProducers)");
        k0 D10 = this.f18804b.D(G10, true, this.f18813k);
        Intrinsics.checkNotNullExpressionValue(D10, "producerFactory.newResiz…, imageTranscoderFactory)");
        return D10;
    }

    private final d0 L(d0 d0Var, u0[] u0VarArr) {
        C1835b a10 = b4.s.a(d0Var);
        Intrinsics.checkNotNullExpressionValue(a10, "newAddImageTransformMeta…taProducer(inputProducer)");
        k0 D10 = this.f18804b.D(a10, true, this.f18813k);
        Intrinsics.checkNotNullExpressionValue(D10, "producerFactory.newResiz…, imageTranscoderFactory)");
        r0 F10 = this.f18804b.F(D10);
        Intrinsics.checkNotNullExpressionValue(F10, "producerFactory.newThrot…ducer(localImageProducer)");
        C1846m h10 = b4.s.h(K(u0VarArr), F10);
        Intrinsics.checkNotNullExpressionValue(h10, "newBranchOnSeparateImage…lImageThrottlingProducer)");
        return h10;
    }

    private final d0 l(m4.b bVar) {
        d0 z10;
        if (!n4.b.d()) {
            Uri u10 = bVar.u();
            Intrinsics.checkNotNullExpressionValue(u10, "imageRequest.sourceUri");
            if (u10 == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int v10 = bVar.v();
            if (v10 == 0) {
                return z();
            }
            switch (v10) {
                case 2:
                    return bVar.h() ? x() : y();
                case 3:
                    return bVar.h() ? x() : v();
                case 4:
                    return bVar.h() ? x() : C2976a.c(this.f18803a.getType(u10)) ? y() : t();
                case 5:
                    return s();
                case 6:
                    return w();
                case 7:
                    return o();
                case 8:
                    return C();
                default:
                    Set set = this.f18817o;
                    if (set != null) {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            android.support.v4.media.session.b.a(it.next());
                            throw null;
                        }
                    }
                    throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + f18792K.c(u10));
            }
        }
        n4.b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri u11 = bVar.u();
            Intrinsics.checkNotNullExpressionValue(u11, "imageRequest.sourceUri");
            if (u11 == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int v11 = bVar.v();
            if (v11 != 0) {
                switch (v11) {
                    case 2:
                        if (!bVar.h()) {
                            z10 = y();
                            break;
                        } else {
                            d0 x10 = x();
                            n4.b.b();
                            return x10;
                        }
                    case 3:
                        if (!bVar.h()) {
                            z10 = v();
                            break;
                        } else {
                            d0 x11 = x();
                            n4.b.b();
                            return x11;
                        }
                    case 4:
                        if (!bVar.h()) {
                            if (!C2976a.c(this.f18803a.getType(u11))) {
                                z10 = t();
                                break;
                            } else {
                                d0 y10 = y();
                                n4.b.b();
                                return y10;
                            }
                        } else {
                            d0 x12 = x();
                            n4.b.b();
                            return x12;
                        }
                    case 5:
                        z10 = s();
                        break;
                    case 6:
                        z10 = w();
                        break;
                    case 7:
                        z10 = o();
                        break;
                    case 8:
                        z10 = C();
                        break;
                    default:
                        Set set2 = this.f18817o;
                        if (set2 != null) {
                            Iterator it2 = set2.iterator();
                            if (it2.hasNext()) {
                                android.support.v4.media.session.b.a(it2.next());
                                throw null;
                            }
                        }
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + f18792K.c(u11));
                }
            } else {
                z10 = z();
            }
            n4.b.b();
            return z10;
        } catch (Throwable th) {
            n4.b.b();
            throw th;
        }
    }

    private final synchronized d0 m(d0 d0Var) {
        d0 d0Var2;
        d0Var2 = (d0) this.f18820r.get(d0Var);
        if (d0Var2 == null) {
            d0Var2 = this.f18804b.f(d0Var);
            this.f18820r.put(d0Var, d0Var2);
        }
        return d0Var2;
    }

    private final synchronized d0 q(d0 d0Var) {
        C1851s k10;
        k10 = this.f18804b.k(d0Var);
        Intrinsics.checkNotNullExpressionValue(k10, "producerFactory.newDelayProducer(inputProducer)");
        return k10;
    }

    public final d0 A() {
        Object value = this.f18826x.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-networkFetchToEncod…oryPrefetchSequence>(...)");
        return (d0) value;
    }

    public final d0 C() {
        return (d0) this.f18799G.getValue();
    }

    public final d0 E(d0 inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        if (!n4.b.d()) {
            C1849p j10 = this.f18804b.j(inputProducer);
            Intrinsics.checkNotNullExpressionValue(j10, "producerFactory.newDecodeProducer(inputProducer)");
            return D(j10);
        }
        n4.b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            C1849p j11 = this.f18804b.j(inputProducer);
            Intrinsics.checkNotNullExpressionValue(j11, "producerFactory.newDecodeProducer(inputProducer)");
            return D(j11);
        } finally {
            n4.b.b();
        }
    }

    public final synchronized d0 H(X networkFetcher) {
        try {
            Intrinsics.checkNotNullParameter(networkFetcher, "networkFetcher");
            boolean z10 = false;
            if (!n4.b.d()) {
                d0 y10 = this.f18804b.y(networkFetcher);
                Intrinsics.checkNotNullExpressionValue(y10, "producerFactory.newNetwo…hProducer(networkFetcher)");
                C1835b a10 = b4.s.a(J(y10));
                Intrinsics.checkNotNullExpressionValue(a10, "newAddImageTransformMeta…taProducer(inputProducer)");
                b4.s sVar = this.f18804b;
                if (this.f18806d && this.f18809g != b4.e.NEVER) {
                    z10 = true;
                }
                k0 networkFetchToEncodedMemorySequence = sVar.D(a10, z10, this.f18813k);
                Intrinsics.checkNotNullExpressionValue(networkFetchToEncodedMemorySequence, "producerFactory.newResiz…  imageTranscoderFactory)");
                Intrinsics.checkNotNullExpressionValue(networkFetchToEncodedMemorySequence, "networkFetchToEncodedMemorySequence");
                return networkFetchToEncodedMemorySequence;
            }
            n4.b.a("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                d0 y11 = this.f18804b.y(networkFetcher);
                Intrinsics.checkNotNullExpressionValue(y11, "producerFactory.newNetwo…hProducer(networkFetcher)");
                C1835b a11 = b4.s.a(J(y11));
                Intrinsics.checkNotNullExpressionValue(a11, "newAddImageTransformMeta…taProducer(inputProducer)");
                b4.s sVar2 = this.f18804b;
                if (this.f18806d && this.f18809g != b4.e.NEVER) {
                    z10 = true;
                }
                k0 networkFetchToEncodedMemorySequence2 = sVar2.D(a11, z10, this.f18813k);
                Intrinsics.checkNotNullExpressionValue(networkFetchToEncodedMemorySequence2, "producerFactory.newResiz…  imageTranscoderFactory)");
                Intrinsics.checkNotNullExpressionValue(networkFetchToEncodedMemorySequence2, "networkFetchToEncodedMemorySequence");
                n4.b.b();
                return networkFetchToEncodedMemorySequence2;
            } catch (Throwable th) {
                n4.b.b();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final d0 i() {
        Object value = this.f18794B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-backgroundLocalCont…ncodeMemorySequence>(...)");
        return (d0) value;
    }

    public final d0 j() {
        Object value = this.f18793A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-backgroundLocalFile…ncodeMemorySequence>(...)");
        return (d0) value;
    }

    public final d0 k() {
        Object value = this.f18825w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-backgroundNetworkFe…codedMemorySequence>(...)");
        return (d0) value;
    }

    public final d0 n() {
        return (d0) this.f18827y.getValue();
    }

    public final d0 o() {
        return (d0) this.f18802J.getValue();
    }

    public final d0 p(m4.b imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (!n4.b.d()) {
            d0 l10 = l(imageRequest);
            if (imageRequest.k() != null) {
                l10 = B(l10);
            }
            if (this.f18810h) {
                l10 = m(l10);
            }
            return (!this.f18816n || imageRequest.e() <= 0) ? l10 : q(l10);
        }
        n4.b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            d0 l11 = l(imageRequest);
            if (imageRequest.k() != null) {
                l11 = B(l11);
            }
            if (this.f18810h) {
                l11 = m(l11);
            }
            if (this.f18816n && imageRequest.e() > 0) {
                l11 = q(l11);
            }
            n4.b.b();
            return l11;
        } catch (Throwable th) {
            n4.b.b();
            throw th;
        }
    }

    public final d0 r(m4.b imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        a aVar = f18792K;
        aVar.d(imageRequest);
        int v10 = imageRequest.v();
        if (v10 == 0) {
            return A();
        }
        if (v10 == 2 || v10 == 3) {
            return u();
        }
        Uri u10 = imageRequest.u();
        Intrinsics.checkNotNullExpressionValue(u10, "imageRequest.sourceUri");
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + aVar.c(u10));
    }

    public final d0 s() {
        return (d0) this.f18801I.getValue();
    }

    public final d0 t() {
        return (d0) this.f18797E.getValue();
    }

    public final d0 u() {
        Object value = this.f18828z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-localFileFetchToEnc…oryPrefetchSequence>(...)");
        return (d0) value;
    }

    public final d0 v() {
        return (d0) this.f18795C.getValue();
    }

    public final d0 w() {
        return (d0) this.f18800H.getValue();
    }

    public final d0 x() {
        return (d0) this.f18798F.getValue();
    }

    public final d0 y() {
        return (d0) this.f18796D.getValue();
    }

    public final d0 z() {
        return (d0) this.f18824v.getValue();
    }
}
