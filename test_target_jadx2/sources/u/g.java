package U;

import A.C0698g0;
import A.C0720x;
import A.C0721y;
import A.InterfaceC0703j;
import A.InterfaceC0712o;
import A.InterfaceC0713p;
import A.InterfaceC0714q;
import A.J0;
import A.K0;
import A.L0;
import A.r;
import E.q;
import G.n;
import H.f;
import U.g;
import android.content.Context;
import androidx.camera.core.impl.AbstractC1443j0;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.InterfaceC1473z;
import androidx.camera.core.impl.T0;
import androidx.concurrent.futures.c;
import androidx.lifecycle.InterfaceC1599p;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC3735a;
import q1.AbstractC3901a;
import xc.C5146G;
import xc.m;

/* loaded from: classes.dex */
public final class g implements InterfaceC0714q {

    /* renamed from: i, reason: collision with root package name */
    public static final a f10263i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final g f10264j = new g();

    /* renamed from: a, reason: collision with root package name */
    private final Object f10265a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private C0721y.b f10266b;

    /* renamed from: c, reason: collision with root package name */
    private h8.d f10267c;

    /* renamed from: d, reason: collision with root package name */
    private h8.d f10268d;

    /* renamed from: e, reason: collision with root package name */
    private final U.c f10269e;

    /* renamed from: f, reason: collision with root package name */
    private C0720x f10270f;

    /* renamed from: g, reason: collision with root package name */
    private Context f10271g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f10272h;

    public static final class a {

        /* renamed from: U.g$a$a, reason: collision with other inner class name */
        static final class C0195a extends m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f10273a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0195a(Context context) {
                super(1);
                this.f10273a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(C0720x cameraX) {
                g gVar = g.f10264j;
                Intrinsics.checkNotNullExpressionValue(cameraX, "cameraX");
                gVar.x(cameraX);
                g gVar2 = g.f10264j;
                Context a10 = E.f.a(this.f10273a);
                Intrinsics.checkNotNullExpressionValue(a10, "getApplicationContext(context)");
                gVar2.y(a10);
                return g.f10264j;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (g) tmp0.invoke(obj);
        }

        public final h8.d b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            y0.f.g(context);
            h8.d t10 = g.f10264j.t(context);
            final C0195a c0195a = new C0195a(context);
            h8.d G10 = n.G(t10, new InterfaceC3735a() { // from class: U.f
                @Override // o.InterfaceC3735a
                public final Object apply(Object obj) {
                    g c10;
                    c10 = g.a.c(Function1.this, obj);
                    return c10;
                }
            }, F.c.b());
            Intrinsics.checkNotNullExpressionValue(G10, "context: Context): Liste…tExecutor()\n            )");
            return G10;
        }

        private a() {
        }
    }

    public static final class b implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f10274a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0720x f10275b;

        b(c.a aVar, C0720x c0720x) {
            this.f10274a = aVar;
            this.f10275b = c0720x;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            this.f10274a.c(this.f10275b);
        }

        @Override // G.c
        public void onFailure(Throwable t10) {
            Intrinsics.checkNotNullParameter(t10, "t");
            this.f10274a.f(t10);
        }
    }

    static final class c extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0720x f10276a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C0720x c0720x) {
            super(1);
            this.f10276a = c0720x;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h8.d invoke(Void r12) {
            return this.f10276a.i();
        }
    }

    private g() {
        h8.d p10 = n.p(null);
        Intrinsics.checkNotNullExpressionValue(p10, "immediateFuture<Void>(null)");
        this.f10268d = p10;
        this.f10269e = new U.c();
        this.f10272h = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1473z q(r rVar, InterfaceC0713p interfaceC0713p) {
        Iterator it = rVar.c().iterator();
        InterfaceC1473z interfaceC1473z = null;
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "cameraSelector.cameraFilterSet");
            InterfaceC0712o interfaceC0712o = (InterfaceC0712o) next;
            if (!Intrinsics.b(interfaceC0712o.a(), InterfaceC0712o.f204a)) {
                B a10 = AbstractC1443j0.a(interfaceC0712o.a());
                Context context = this.f10271g;
                Intrinsics.d(context);
                InterfaceC1473z a11 = a10.a(interfaceC0713p, context);
                if (a11 == null) {
                    continue;
                } else {
                    if (interfaceC1473z != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    interfaceC1473z = a11;
                }
            }
        }
        return interfaceC1473z == null ? C.a() : interfaceC1473z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int s() {
        C0720x c0720x = this.f10270f;
        if (c0720x == null) {
            return 0;
        }
        Intrinsics.d(c0720x);
        return c0720x.e().d().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h8.d t(Context context) {
        synchronized (this.f10265a) {
            h8.d dVar = this.f10267c;
            if (dVar != null) {
                Intrinsics.e(dVar, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
                return dVar;
            }
            final C0720x c0720x = new C0720x(context, this.f10266b);
            h8.d a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: U.d
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object u10;
                    u10 = g.u(g.this, c0720x, aVar);
                    return u10;
                }
            });
            this.f10267c = a10;
            Intrinsics.e(a10, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
            return a10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object u(g this$0, C0720x cameraX, c.a completer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cameraX, "$cameraX");
        Intrinsics.checkNotNullParameter(completer, "completer");
        synchronized (this$0.f10265a) {
            G.d a10 = G.d.a(this$0.f10268d);
            final c cVar = new c(cameraX);
            G.d f10 = a10.f(new G.a() { // from class: U.e
                @Override // G.a
                public final h8.d apply(Object obj) {
                    h8.d v10;
                    v10 = g.v(Function1.this, obj);
                    return v10;
                }
            }, F.c.b());
            Intrinsics.checkNotNullExpressionValue(f10, "cameraX = CameraX(contex…                        )");
            n.j(f10, new b(completer, cameraX), F.c.b());
            Unit unit = Unit.f36324a;
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h8.d v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (h8.d) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int i10) {
        C0720x c0720x = this.f10270f;
        if (c0720x == null) {
            return;
        }
        Intrinsics.d(c0720x);
        c0720x.e().d().d(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(C0720x c0720x) {
        this.f10270f = c0720x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(Context context) {
        this.f10271g = context;
    }

    public void A() {
        AbstractC3901a.c("CX:unbindAll");
        try {
            q.a();
            w(0);
            this.f10269e.l();
            Unit unit = Unit.f36324a;
        } finally {
            AbstractC3901a.f();
        }
    }

    public final InterfaceC0703j n(InterfaceC1599p lifecycleOwner, r cameraSelector, K0 useCaseGroup) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCaseGroup, "useCaseGroup");
        AbstractC3901a.c("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (s() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            w(1);
            C0698g0 DEFAULT = C0698g0.f172f;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            L0 c10 = useCaseGroup.c();
            List a10 = useCaseGroup.a();
            Intrinsics.checkNotNullExpressionValue(a10, "useCaseGroup.effects");
            List b10 = useCaseGroup.b();
            Intrinsics.checkNotNullExpressionValue(b10, "useCaseGroup.useCases");
            J0[] j0Arr = (J0[]) b10.toArray(new J0[0]);
            return p(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT, c10, a10, (J0[]) Arrays.copyOf(j0Arr, j0Arr.length));
        } finally {
            AbstractC3901a.f();
        }
    }

    public final InterfaceC0703j o(InterfaceC1599p lifecycleOwner, r cameraSelector, J0... useCases) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        AbstractC3901a.c("CX:bindToLifecycle");
        try {
            if (s() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            w(1);
            C0698g0 DEFAULT = C0698g0.f172f;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return p(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT, null, CollectionsKt.j(), (J0[]) Arrays.copyOf(useCases, useCases.length));
        } finally {
            AbstractC3901a.f();
        }
    }

    public final InterfaceC0703j p(InterfaceC1599p lifecycleOwner, r primaryCameraSelector, r rVar, C0698g0 primaryLayoutSettings, C0698g0 secondaryLayoutSettings, L0 l02, List effects, J0... useCases) {
        H h10;
        T0 t02;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(primaryCameraSelector, "primaryCameraSelector");
        Intrinsics.checkNotNullParameter(primaryLayoutSettings, "primaryLayoutSettings");
        Intrinsics.checkNotNullParameter(secondaryLayoutSettings, "secondaryLayoutSettings");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        AbstractC3901a.c("CX:bindToLifecycle-internal");
        try {
            q.a();
            C0720x c0720x = this.f10270f;
            Intrinsics.d(c0720x);
            H e10 = primaryCameraSelector.e(c0720x.f().a());
            Intrinsics.checkNotNullExpressionValue(e10, "primaryCameraSelector.se…cameraRepository.cameras)");
            e10.p(true);
            InterfaceC0713p r10 = r(primaryCameraSelector);
            Intrinsics.e(r10, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
            T0 t03 = (T0) r10;
            if (rVar != null) {
                C0720x c0720x2 = this.f10270f;
                Intrinsics.d(c0720x2);
                H e11 = rVar.e(c0720x2.f().a());
                e11.p(false);
                InterfaceC0713p r11 = r(rVar);
                Intrinsics.e(r11, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
                h10 = e11;
                t02 = (T0) r11;
            } else {
                h10 = null;
                t02 = null;
            }
            U.b c10 = this.f10269e.c(lifecycleOwner, H.f.B(t03, t02));
            Collection e12 = this.f10269e.e();
            for (J0 j02 : AbstractC3574i.x(useCases)) {
                for (Object lifecycleCameras : e12) {
                    Intrinsics.checkNotNullExpressionValue(lifecycleCameras, "lifecycleCameras");
                    U.b bVar = (U.b) lifecycleCameras;
                    if (bVar.t(j02) && !Intrinsics.b(bVar, c10)) {
                        C5146G c5146g = C5146G.f44966a;
                        String format = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{j02}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                        throw new IllegalStateException(format);
                    }
                }
            }
            if (c10 == null) {
                U.c cVar = this.f10269e;
                C0720x c0720x3 = this.f10270f;
                Intrinsics.d(c0720x3);
                B.a d10 = c0720x3.e().d();
                C0720x c0720x4 = this.f10270f;
                Intrinsics.d(c0720x4);
                E d11 = c0720x4.d();
                C0720x c0720x5 = this.f10270f;
                Intrinsics.d(c0720x5);
                c10 = cVar.b(lifecycleOwner, new H.f(e10, h10, t03, t02, primaryLayoutSettings, secondaryLayoutSettings, d10, d11, c0720x5.h()));
            }
            if (useCases.length == 0) {
                Intrinsics.d(c10);
            } else {
                U.c cVar2 = this.f10269e;
                Intrinsics.d(c10);
                List m10 = CollectionsKt.m(Arrays.copyOf(useCases, useCases.length));
                C0720x c0720x6 = this.f10270f;
                Intrinsics.d(c0720x6);
                cVar2.a(c10, l02, effects, m10, c0720x6.e().d());
            }
            AbstractC3901a.f();
            return c10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }

    public InterfaceC0713p r(r cameraSelector) {
        Object obj;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        AbstractC3901a.c("CX:getCameraInfo");
        try {
            C0720x c0720x = this.f10270f;
            Intrinsics.d(c0720x);
            G q10 = cameraSelector.e(c0720x.f().a()).q();
            Intrinsics.checkNotNullExpressionValue(q10, "cameraSelector.select(mC…meras).cameraInfoInternal");
            InterfaceC1473z q11 = q(cameraSelector, q10);
            f.b a10 = f.b.a(q10.f(), q11.P());
            Intrinsics.checkNotNullExpressionValue(a10, "create(\n                …ilityId\n                )");
            synchronized (this.f10265a) {
                try {
                    obj = this.f10272h.get(a10);
                    if (obj == null) {
                        obj = new T0(q10, q11);
                        this.f10272h.put(a10, obj);
                    }
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (T0) obj;
        } finally {
            AbstractC3901a.f();
        }
    }

    public void z(J0... useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        AbstractC3901a.c("CX:unbind");
        try {
            q.a();
            if (s() == 2) {
                throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            this.f10269e.k(CollectionsKt.m(Arrays.copyOf(useCases, useCases.length)));
            Unit unit = Unit.f36324a;
        } finally {
            AbstractC3901a.f();
        }
    }
}
