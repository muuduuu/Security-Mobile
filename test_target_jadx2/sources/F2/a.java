package F2;

import F2.c;
import Jd.A0;
import Jd.AbstractC0887i;
import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.InterfaceC0915w0;
import Jd.InterfaceC0919z;
import Jd.N;
import Jd.O;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.CropImageView;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;
import xc.y;

/* loaded from: classes.dex */
public final class a implements N {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2204a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f2205b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f2206c;

    /* renamed from: d, reason: collision with root package name */
    private final Bitmap f2207d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f2208e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2209f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2210g;

    /* renamed from: h, reason: collision with root package name */
    private final int f2211h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f2212i;

    /* renamed from: j, reason: collision with root package name */
    private final int f2213j;

    /* renamed from: k, reason: collision with root package name */
    private final int f2214k;

    /* renamed from: l, reason: collision with root package name */
    private final int f2215l;

    /* renamed from: m, reason: collision with root package name */
    private final int f2216m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f2217n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f2218o;

    /* renamed from: p, reason: collision with root package name */
    private final CropImageView.k f2219p;

    /* renamed from: q, reason: collision with root package name */
    private final Bitmap.CompressFormat f2220q;

    /* renamed from: r, reason: collision with root package name */
    private final int f2221r;

    /* renamed from: s, reason: collision with root package name */
    private final Uri f2222s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC0915w0 f2223t;

    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f2229a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2230b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0051a f2232d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0051a c0051a, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f2232d = c0051a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            b bVar = a.this.new b(this.f2232d, dVar);
            bVar.f2230b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CropImageView cropImageView;
            AbstractC3868b.e();
            if (this.f2229a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            N n10 = (N) this.f2230b;
            y yVar = new y();
            if (O.f(n10) && (cropImageView = (CropImageView) a.this.f2205b.get()) != null) {
                C0051a c0051a = this.f2232d;
                yVar.f44999a = true;
                cropImageView.j(c0051a);
            }
            if (!yVar.f44999a && this.f2232d.a() != null) {
                this.f2232d.a().recycle();
            }
            return Unit.f36324a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f2233a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2234b;

        /* renamed from: F2.a$c$a, reason: collision with other inner class name */
        static final class C0052a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f2236a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f2237b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bitmap f2238c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c.a f2239d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0052a(a aVar, Bitmap bitmap, c.a aVar2, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f2237b = aVar;
                this.f2238c = bitmap;
                this.f2239d = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return new C0052a(this.f2237b, this.f2238c, this.f2239d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((C0052a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f2236a;
                if (i10 == 0) {
                    lc.p.b(obj);
                    Uri K10 = F2.c.f2261a.K(this.f2237b.f2204a, this.f2238c, this.f2237b.f2220q, this.f2237b.f2221r, this.f2237b.f2222s);
                    this.f2238c.recycle();
                    a aVar = this.f2237b;
                    C0051a c0051a = new C0051a(K10, this.f2239d.b());
                    this.f2236a = 1;
                    if (aVar.w(c0051a, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                }
                return Unit.f36324a;
            }
        }

        c(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            c cVar = a.this.new c(dVar);
            cVar.f2234b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c.a h10;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f2233a;
            try {
            } catch (Exception e11) {
                a aVar = a.this;
                C0051a c0051a = new C0051a(e11, false);
                this.f2233a = 2;
                if (aVar.w(c0051a, this) == e10) {
                    return e10;
                }
            }
            if (i10 == 0) {
                lc.p.b(obj);
                N n10 = (N) this.f2234b;
                if (O.f(n10)) {
                    if (a.this.v() != null) {
                        h10 = F2.c.f2261a.e(a.this.f2204a, a.this.v(), a.this.f2208e, a.this.f2209f, a.this.f2210g, a.this.f2211h, a.this.f2212i, a.this.f2213j, a.this.f2214k, a.this.f2215l, a.this.f2216m, a.this.f2217n, a.this.f2218o);
                    } else if (a.this.f2207d != null) {
                        h10 = F2.c.f2261a.h(a.this.f2207d, a.this.f2208e, a.this.f2209f, a.this.f2212i, a.this.f2213j, a.this.f2214k, a.this.f2217n, a.this.f2218o);
                    } else {
                        a aVar2 = a.this;
                        C0051a c0051a2 = new C0051a((Bitmap) null, 1);
                        this.f2233a = 1;
                        if (aVar2.w(c0051a2, this) == e10) {
                            return e10;
                        }
                    }
                    AbstractC0891k.d(n10, C0874b0.b(), null, new C0052a(a.this, F2.c.f2261a.H(h10.a(), a.this.f2215l, a.this.f2216m, a.this.f2219p), h10, null), 2, null);
                }
                return Unit.f36324a;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
                return Unit.f36324a;
            }
            lc.p.b(obj);
            return Unit.f36324a;
        }
    }

    public a(Context context, WeakReference cropImageViewReference, Uri uri, Bitmap bitmap, float[] cropPoints, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12, CropImageView.k options, Bitmap.CompressFormat saveCompressFormat, int i17, Uri uri2) {
        InterfaceC0919z b10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cropImageViewReference, "cropImageViewReference");
        Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(saveCompressFormat, "saveCompressFormat");
        this.f2204a = context;
        this.f2205b = cropImageViewReference;
        this.f2206c = uri;
        this.f2207d = bitmap;
        this.f2208e = cropPoints;
        this.f2209f = i10;
        this.f2210g = i11;
        this.f2211h = i12;
        this.f2212i = z10;
        this.f2213j = i13;
        this.f2214k = i14;
        this.f2215l = i15;
        this.f2216m = i16;
        this.f2217n = z11;
        this.f2218o = z12;
        this.f2219p = options;
        this.f2220q = saveCompressFormat;
        this.f2221r = i17;
        this.f2222s = uri2;
        b10 = A0.b(null, 1, null);
        this.f2223t = b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C0051a c0051a, kotlin.coroutines.d dVar) {
        Object g10 = AbstractC0887i.g(C0874b0.c(), new b(c0051a, null), dVar);
        return g10 == AbstractC3868b.e() ? g10 : Unit.f36324a;
    }

    public final void u() {
        InterfaceC0915w0.a.a(this.f2223t, null, 1, null);
    }

    public final Uri v() {
        return this.f2206c;
    }

    public final void x() {
        InterfaceC0915w0 d10;
        d10 = AbstractC0891k.d(this, C0874b0.a(), null, new c(null), 2, null);
        this.f2223t = d10;
    }

    @Override // Jd.N
    public CoroutineContext y() {
        return C0874b0.c().l(this.f2223t);
    }

    /* renamed from: F2.a$a, reason: collision with other inner class name */
    public static final class C0051a {

        /* renamed from: a, reason: collision with root package name */
        private final Bitmap f2224a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f2225b;

        /* renamed from: c, reason: collision with root package name */
        private final Exception f2226c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f2227d;

        /* renamed from: e, reason: collision with root package name */
        private final int f2228e;

        public C0051a(Bitmap bitmap, int i10) {
            this.f2224a = bitmap;
            this.f2225b = null;
            this.f2226c = null;
            this.f2227d = false;
            this.f2228e = i10;
        }

        public final Bitmap a() {
            return this.f2224a;
        }

        public final Exception b() {
            return this.f2226c;
        }

        public final int c() {
            return this.f2228e;
        }

        public final Uri d() {
            return this.f2225b;
        }

        public C0051a(Uri uri, int i10) {
            this.f2224a = null;
            this.f2225b = uri;
            this.f2226c = null;
            this.f2227d = true;
            this.f2228e = i10;
        }

        public C0051a(Exception exc, boolean z10) {
            this.f2224a = null;
            this.f2225b = null;
            this.f2226c = exc;
            this.f2227d = z10;
            this.f2228e = 1;
        }
    }
}
