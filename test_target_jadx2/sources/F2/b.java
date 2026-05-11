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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;
import xc.y;

/* loaded from: classes.dex */
public final class b implements N {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2240g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f2241a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f2242b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2243c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2244d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f2245e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC0915w0 f2246f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f2254a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2255b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0053b f2257d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C0053b c0053b, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f2257d = c0053b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            c cVar = b.this.new c(this.f2257d, dVar);
            cVar.f2255b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CropImageView cropImageView;
            AbstractC3868b.e();
            if (this.f2254a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            N n10 = (N) this.f2255b;
            y yVar = new y();
            if (O.f(n10) && (cropImageView = (CropImageView) b.this.f2245e.get()) != null) {
                C0053b c0053b = this.f2257d;
                yVar.f44999a = true;
                cropImageView.k(c0053b);
            }
            if (!yVar.f44999a && this.f2257d.a() != null) {
                this.f2257d.a().recycle();
            }
            return Unit.f36324a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f2258a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2259b;

        d(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            d dVar2 = b.this.new d(dVar);
            dVar2.f2259b = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((d) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f2258a;
            try {
            } catch (Exception e11) {
                b bVar = b.this;
                C0053b c0053b = new C0053b(bVar.g(), e11);
                this.f2258a = 2;
                if (bVar.h(c0053b, this) == e10) {
                    return e10;
                }
            }
            if (i10 == 0) {
                lc.p.b(obj);
                N n10 = (N) this.f2259b;
                if (O.f(n10)) {
                    F2.c cVar = F2.c.f2261a;
                    c.a m10 = cVar.m(b.this.f2241a, b.this.g(), b.this.f2243c, b.this.f2244d);
                    if (O.f(n10)) {
                        c.b F10 = cVar.F(m10.a(), b.this.f2241a, b.this.g());
                        b bVar2 = b.this;
                        C0053b c0053b2 = new C0053b(bVar2.g(), F10.a(), m10.b(), F10.b(), F10.c(), F10.d());
                        this.f2258a = 1;
                        if (bVar2.h(c0053b2, this) == e10) {
                            return e10;
                        }
                    }
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                    return Unit.f36324a;
                }
                lc.p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    public b(Context context, CropImageView cropImageView, Uri uri) {
        InterfaceC0919z b10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cropImageView, "cropImageView");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f2241a = context;
        this.f2242b = uri;
        this.f2245e = new WeakReference(cropImageView);
        b10 = A0.b(null, 1, null);
        this.f2246f = b10;
        float f10 = cropImageView.getResources().getDisplayMetrics().density;
        double d10 = f10 > 1.0f ? 1.0d / f10 : 1.0d;
        this.f2243c = (int) (r3.widthPixels * d10);
        this.f2244d = (int) (r3.heightPixels * d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(C0053b c0053b, kotlin.coroutines.d dVar) {
        Object g10 = AbstractC0887i.g(C0874b0.c(), new c(c0053b, null), dVar);
        return g10 == AbstractC3868b.e() ? g10 : Unit.f36324a;
    }

    public final void f() {
        InterfaceC0915w0.a.a(this.f2246f, null, 1, null);
    }

    public final Uri g() {
        return this.f2242b;
    }

    public final void i() {
        InterfaceC0915w0 d10;
        d10 = AbstractC0891k.d(this, C0874b0.a(), null, new d(null), 2, null);
        this.f2246f = d10;
    }

    @Override // Jd.N
    public CoroutineContext y() {
        return C0874b0.c().l(this.f2246f);
    }

    /* renamed from: F2.b$b, reason: collision with other inner class name */
    public static final class C0053b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f2247a;

        /* renamed from: b, reason: collision with root package name */
        private final Bitmap f2248b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2249c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2250d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2251e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2252f;

        /* renamed from: g, reason: collision with root package name */
        private final Exception f2253g;

        public C0053b(Uri uri, Bitmap bitmap, int i10, int i11, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f2247a = uri;
            this.f2248b = bitmap;
            this.f2249c = i10;
            this.f2250d = i11;
            this.f2251e = z10;
            this.f2252f = z11;
            this.f2253g = null;
        }

        public final Bitmap a() {
            return this.f2248b;
        }

        public final int b() {
            return this.f2250d;
        }

        public final Exception c() {
            return this.f2253g;
        }

        public final boolean d() {
            return this.f2251e;
        }

        public final boolean e() {
            return this.f2252f;
        }

        public final int f() {
            return this.f2249c;
        }

        public final Uri g() {
            return this.f2247a;
        }

        public C0053b(Uri uri, Exception exc) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f2247a = uri;
            this.f2248b = null;
            this.f2249c = 0;
            this.f2250d = 0;
            this.f2253g = exc;
        }
    }
}
