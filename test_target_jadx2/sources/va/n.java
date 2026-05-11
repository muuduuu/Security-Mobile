package va;

import A.A;
import A.AbstractC0715s;
import A.D;
import A.I0;
import A.InterfaceC0703j;
import A.InterfaceC0705k;
import A.InterfaceC0713p;
import A.K0;
import A.M0;
import A.W;
import A.X;
import A.r;
import A.r0;
import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.InterfaceC0915w0;
import Jd.N;
import P.c;
import V.A0;
import V.AbstractC1253p;
import V.AbstractC1258v;
import V.C1254q;
import V.C1257u;
import V.C1261y;
import V.O;
import V.Y;
import V.o0;
import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.AudioManager;
import android.media.MediaActionSound;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.camera.core.f;
import androidx.camera.core.n;
import androidx.camera.view.m;
import androidx.lifecycle.AbstractC1604v;
import expo.modules.camera.PictureOptions;
import expo.modules.camera.RecordingOptions;
import expo.modules.camera.common.BarcodeScannedEvent;
import expo.modules.camera.common.CameraMountErrorEvent;
import expo.modules.camera.common.PictureSavedEvent;
import expo.modules.camera.records.BarcodeSettings;
import expo.modules.camera.records.BarcodeType;
import expo.modules.camera.records.CameraMode;
import expo.modules.camera.records.CameraRatio;
import expo.modules.camera.records.CameraType;
import expo.modules.camera.records.FlashMode;
import expo.modules.camera.records.FocusMode;
import expo.modules.camera.records.VideoQuality;
import ib.C3362a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import lc.t;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import pb.C3862a;
import pc.AbstractC3868b;
import rc.AbstractC4299c;
import va.n;
import xa.InterfaceC5138a;
import xc.C5142C;
import xc.u;
import y0.InterfaceC5159a;
import zc.AbstractC5272a;

/* loaded from: classes2.dex */
public final class n extends expo.modules.kotlin.views.h {

    /* renamed from: E, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f44150E = {C5142C.e(new xc.o(n.class, "enableTorch", "getEnableTorch()Z", 0)), C5142C.k(new u(n.class, "onCameraReady", "getOnCameraReady()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), C5142C.k(new u(n.class, "onMountError", "getOnMountError()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), C5142C.k(new u(n.class, "onBarcodeScanned", "getOnBarcodeScanned()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), C5142C.k(new u(n.class, "onPictureSaved", "getOnPictureSaved()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0))};

    /* renamed from: A, reason: collision with root package name */
    private boolean f44151A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f44152B;

    /* renamed from: C, reason: collision with root package name */
    private final Ac.d f44153C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f44154D;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f44155c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0703j f44156d;

    /* renamed from: e, reason: collision with root package name */
    private Y f44157e;

    /* renamed from: f, reason: collision with root package name */
    private U.g f44158f;

    /* renamed from: g, reason: collision with root package name */
    private final h8.d f44159g;

    /* renamed from: h, reason: collision with root package name */
    private W f44160h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.camera.core.f f44161i;

    /* renamed from: j, reason: collision with root package name */
    private O f44162j;

    /* renamed from: k, reason: collision with root package name */
    private List f44163k;

    /* renamed from: l, reason: collision with root package name */
    private SurfaceTexture f44164l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.camera.view.m f44165m;

    /* renamed from: n, reason: collision with root package name */
    private final N f44166n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f44167o;
    private final Ib.c onBarcodeScanned$delegate;
    private final Ib.c onCameraReady$delegate;
    private final Ib.c onMountError$delegate;
    private final Ib.c onPictureSaved$delegate;

    /* renamed from: p, reason: collision with root package name */
    private boolean f44168p;

    /* renamed from: q, reason: collision with root package name */
    private CameraType f44169q;

    /* renamed from: r, reason: collision with root package name */
    private FlashMode f44170r;

    /* renamed from: s, reason: collision with root package name */
    private CameraMode f44171s;

    /* renamed from: t, reason: collision with root package name */
    private float f44172t;

    /* renamed from: u, reason: collision with root package name */
    private FocusMode f44173u;

    /* renamed from: v, reason: collision with root package name */
    private VideoQuality f44174v;

    /* renamed from: w, reason: collision with root package name */
    private Integer f44175w;

    /* renamed from: x, reason: collision with root package name */
    private CameraRatio f44176x;

    /* renamed from: y, reason: collision with root package name */
    private String f44177y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f44178z;

    static final class b extends xc.m implements Function1 {
        b() {
            super(1);
        }

        public final void a(C3362a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            n.this.B(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3362a) obj);
            return Unit.f36324a;
        }
    }

    static final class c extends xc.m implements Function1 {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44182a;

            static {
                int[] iArr = new int[AbstractC0715s.b.values().length];
                try {
                    iArr[AbstractC0715s.b.OPEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f44182a = iArr;
            }
        }

        c() {
            super(1);
        }

        public final void a(AbstractC0715s abstractC0715s) {
            if (a.f44182a[abstractC0715s.d().ordinal()] == 1) {
                n.this.getOnCameraReady().invoke(Unit.f36324a);
                n nVar = n.this;
                nVar.setTorchEnabled(nVar.getEnableTorch());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0715s) obj);
            return Unit.f36324a;
        }
    }

    static final class d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f44183a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Short invoke(BarcodeScannedEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return Short.valueOf((short) (event.getData().hashCode() % 32767));
        }
    }

    static final class e extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f44184a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Short invoke(PictureSavedEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            String string = event.getData().getString("uri");
            return Short.valueOf((short) ((string != null ? string.hashCode() : -1) % 32767));
        }
    }

    static final class f extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3862a f44185a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f44186b;

        public static final class a extends OrientationEventListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f44187a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, Activity activity) {
                super(activity);
                this.f44187a = nVar;
            }

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i10) {
                if (i10 == -1) {
                    return;
                }
                int i11 = (45 > i10 || i10 >= 135) ? (135 > i10 || i10 >= 225) ? (225 > i10 || i10 >= 315) ? 0 : 1 : 2 : 3;
                androidx.camera.core.f fVar = this.f44187a.f44161i;
                if (fVar != null) {
                    fVar.r0(i11);
                }
                W w10 = this.f44187a.f44160h;
                if (w10 == null) {
                    return;
                }
                w10.I0(i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3862a c3862a, n nVar) {
            super(0);
            this.f44185a = c3862a;
            this.f44186b = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(this.f44186b, this.f44185a.x());
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f44188a;

        g(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return n.this.new g(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((g) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f44188a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            n.this.f44167o = true;
            U.g gVar = n.this.f44158f;
            if (gVar != null) {
                gVar.A();
            }
            return Unit.f36324a;
        }
    }

    public static final class h extends Ac.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f44190b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, n nVar) {
            super(obj);
            this.f44190b = nVar;
        }

        @Override // Ac.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            this.f44190b.setTorchEnabled(booleanValue);
        }
    }

    public static final class i extends W.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f44191a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44192b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f44193c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PictureOptions f44194d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ pb.m f44195e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ File f44196f;

        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f44197a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f44198b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ byte[] f44199c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ pb.m f44200d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ PictureOptions f44201e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ File f44202f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, byte[] bArr, pb.m mVar, PictureOptions pictureOptions, File file, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f44198b = nVar;
                this.f44199c = bArr;
                this.f44200d = mVar;
                this.f44201e = pictureOptions;
                this.f44202f = file;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void i(n nVar, Bundle bundle) {
                nVar.C(bundle);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return new a(this.f44198b, this.f44199c, this.f44200d, this.f44201e, this.f44202f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f44197a;
                if (i10 == 0) {
                    lc.p.b(obj);
                    boolean z10 = this.f44198b.getMirror() && this.f44198b.getLensFacing() == CameraType.FRONT;
                    byte[] bArr = this.f44199c;
                    pb.m mVar = this.f44200d;
                    PictureOptions pictureOptions = this.f44201e;
                    File file = this.f44202f;
                    final n nVar = this.f44198b;
                    xa.b bVar = new xa.b(bArr, mVar, pictureOptions, z10, file, new InterfaceC5138a() { // from class: va.q
                        @Override // xa.InterfaceC5138a
                        public final void a(Bundle bundle) {
                            n.i.a.i(n.this, bundle);
                        }
                    });
                    this.f44197a = 1;
                    if (bVar.i(this) == e10) {
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

        i(boolean z10, int i10, n nVar, PictureOptions pictureOptions, pb.m mVar, File file) {
            this.f44191a = z10;
            this.f44192b = i10;
            this.f44193c = nVar;
            this.f44194d = pictureOptions;
            this.f44195e = mVar;
            this.f44196f = file;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(final n this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.getRootView().setForeground(new ColorDrawable(-1));
            this$0.getRootView().postDelayed(new Runnable() { // from class: va.p
                @Override // java.lang.Runnable
                public final void run() {
                    n.i.i(n.this);
                }
            }, 50L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(n this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.getRootView().setForeground(null);
        }

        @Override // A.W.e
        public void b() {
            if (this.f44191a && this.f44192b != 0) {
                new MediaActionSound().play(0);
            }
            if (this.f44193c.getAnimateShutter()) {
                View rootView = this.f44193c.getRootView();
                final n nVar = this.f44193c;
                rootView.postDelayed(new Runnable() { // from class: va.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.i.h(n.this);
                    }
                }, 100L);
            }
        }

        @Override // A.W.e
        public void c(androidx.camera.core.n image) {
            Intrinsics.checkNotNullParameter(image, "image");
            n.a[] S10 = image.S();
            Intrinsics.checkNotNullExpressionValue(S10, "getPlanes(...)");
            byte[] b10 = wa.f.b(S10);
            if (this.f44194d.getFastMode()) {
                this.f44195e.resolve(null);
            }
            File file = this.f44196f;
            n nVar = this.f44193c;
            AbstractC0891k.d(nVar.f44166n, null, null, new a(nVar, b10, this.f44195e, this.f44194d, file, null), 3, null);
            image.close();
        }

        @Override // A.W.e
        public void d(X exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f44195e.h(new C4978a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, C3862a appContext) {
        super(context, appContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f44155c = lc.i.a(new f(appContext, this));
        this.f44159g = U.g.f10263i.b(context);
        this.f44163k = CollectionsKt.j();
        androidx.camera.view.m mVar = new androidx.camera.view.m(context);
        mVar.setElevation(0.0f);
        this.f44165m = mVar;
        this.f44166n = Jd.O.a(C0874b0.c());
        this.f44169q = CameraType.BACK;
        this.f44170r = FlashMode.OFF;
        this.f44171s = CameraMode.PICTURE;
        this.f44173u = FocusMode.OFF;
        this.f44174v = VideoQuality.VIDEO1080P;
        this.f44177y = BuildConfig.FLAVOR;
        this.f44152B = true;
        Ac.a aVar = Ac.a.f412a;
        this.f44153C = new h(Boolean.FALSE, this);
        this.onCameraReady$delegate = new Ib.c(this, null);
        this.onMountError$delegate = new Ib.c(this, null);
        this.onBarcodeScanned$delegate = new Ib.c(this, d.f44183a);
        this.onPictureSaved$delegate = new Ib.c(this, e.f44184a);
        getOrientationEventListener().enable();
        this.f44165m.setOnHierarchyChangeListener(new a());
        addView(this.f44165m, new ViewGroup.LayoutParams(-1, -1));
    }

    private final void A(InterfaceC0713p interfaceC0713p) {
        interfaceC0713p.b().i(getCurrentActivity(), new r(new c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(C3362a c3362a) {
        if (this.f44154D) {
            L(c3362a);
            List b10 = c3362a.b();
            Intrinsics.checkNotNullExpressionValue(b10, "getCornerPoints(...)");
            C3362a.C0506a a10 = c3362a.a();
            Intrinsics.checkNotNullExpressionValue(a10, "getBoundingBox(...)");
            Pair z10 = z(b10, a10);
            ArrayList arrayList = (ArrayList) z10.getFirst();
            Bundle bundle = (Bundle) z10.getSecond();
            Ib.b onBarcodeScanned = getOnBarcodeScanned();
            int id2 = getId();
            String g10 = c3362a.g();
            Intrinsics.checkNotNullExpressionValue(g10, "getValue(...)");
            String c10 = c3362a.c();
            Intrinsics.checkNotNullExpressionValue(c10, "getRaw(...)");
            onBarcodeScanned.invoke(new BarcodeScannedEvent(id2, g10, c10, BarcodeType.INSTANCE.a(c3362a.f()), arrayList, bundle));
        }
    }

    private final Size D(String str) {
        if (!new Regex("\\d+x\\d+").d(str)) {
            return null;
        }
        try {
            return Size.parseSize(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(pb.m promise, A0 a02) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(promise, "$promise");
        if (a02 instanceof A0.a) {
            A0.a aVar = (A0.a) a02;
            int j10 = aVar.j();
            if (j10 == 0 || j10 == 2 || j10 == 9) {
                Bundle bundle = new Bundle();
                bundle.putString("uri", aVar.k().a().toString());
                promise.resolve(bundle);
                return;
            }
            Throwable i10 = aVar.i();
            if (i10 == null || (str2 = i10.getMessage()) == null) {
                Throwable i11 = aVar.i();
                if (i11 == null || (str = i11.getMessage()) == null) {
                    str = "Unknown error";
                }
                str2 = "Video recording Failed: " + str;
            }
            promise.h(new va.d(str2));
        }
    }

    private final void J() {
        InterfaceC0703j interfaceC0703j = this.f44156d;
        if (interfaceC0703j != null) {
            D b10 = new D.a(new A(this.f44165m.getDisplay(), interfaceC0703j.c(), this.f44165m.getWidth(), this.f44165m.getHeight()).b(1.0f, 1.0f), 1).b();
            Intrinsics.checkNotNullExpressionValue(b10, "build(...)");
            interfaceC0703j.a().l(b10);
        }
    }

    private final void L(C3362a c3362a) {
        List b10 = c3362a.b();
        int width = this.f44165m.getWidth();
        int height = this.f44165m.getHeight();
        boolean z10 = this.f44169q == CameraType.FRONT;
        boolean z11 = getDeviceOrientation() % 2 == 0;
        boolean z12 = getDeviceOrientation() % 2 != 0;
        if (z10 && z11) {
            Intrinsics.d(b10);
            kotlin.ranges.a n10 = kotlin.ranges.d.n(kotlin.ranges.d.p(0, b10.size()), 2);
            int c10 = n10.c();
            int e10 = n10.e();
            int h10 = n10.h();
            if ((h10 > 0 && c10 <= e10) || (h10 < 0 && e10 <= c10)) {
                while (true) {
                    int d10 = c3362a.d();
                    Object obj = b10.get(c10);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    b10.set(c10, Integer.valueOf(d10 - ((Number) obj).intValue()));
                    if (c10 == e10) {
                        break;
                    } else {
                        c10 += h10;
                    }
                }
            }
        }
        if (z10 && z12) {
            Intrinsics.d(b10);
            kotlin.ranges.a n11 = kotlin.ranges.d.n(kotlin.ranges.d.p(1, b10.size()), 2);
            int c11 = n11.c();
            int e11 = n11.e();
            int h11 = n11.h();
            if ((h11 > 0 && c11 <= e11) || (h11 < 0 && e11 <= c11)) {
                while (true) {
                    int e12 = c3362a.e();
                    Object obj2 = b10.get(c11);
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    b10.set(c11, Integer.valueOf(e12 - ((Number) obj2).intValue()));
                    if (c11 == e11) {
                        break;
                    } else {
                        c11 += h11;
                    }
                }
            }
        }
        Intrinsics.d(b10);
        kotlin.ranges.a n12 = kotlin.ranges.d.n(kotlin.ranges.d.p(1, b10.size()), 2);
        int c12 = n12.c();
        int e13 = n12.e();
        int h12 = n12.h();
        if ((h12 > 0 && c12 <= e13) || (h12 < 0 && e13 <= c12)) {
            while (true) {
                b10.set(c12, Integer.valueOf(AbstractC5272a.c((((Number) b10.get(c12)).intValue() * width) / c3362a.e())));
                if (c12 == e13) {
                    break;
                } else {
                    c12 += h12;
                }
            }
        }
        kotlin.ranges.a n13 = kotlin.ranges.d.n(kotlin.ranges.d.p(0, b10.size()), 2);
        int c13 = n13.c();
        int e14 = n13.e();
        int h13 = n13.h();
        if ((h13 > 0 && c13 <= e14) || (h13 < 0 && e14 <= c13)) {
            while (true) {
                b10.set(c13, Integer.valueOf(AbstractC5272a.c((((Number) b10.get(c13)).intValue() * height) / c3362a.d())));
                if (c13 == e14) {
                    break;
                } else {
                    c13 += h13;
                }
            }
        }
        c3362a.h(b10);
        c3362a.i(getHeight());
        c3362a.j(getWidth());
    }

    private final androidx.appcompat.app.d getCurrentActivity() {
        Activity x10 = getAppContext().x();
        Intrinsics.e(x10, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return (androidx.appcompat.app.d) x10;
    }

    private final int getDeviceOrientation() {
        Display display;
        if (Build.VERSION.SDK_INT < 30) {
            Object systemService = getContext().getSystemService("window");
            Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            return ((WindowManager) systemService).getDefaultDisplay().getRotation();
        }
        display = getAppContext().x().getDisplay();
        if (display != null) {
            return display.getRotation();
        }
        return 0;
    }

    private final Ib.b getOnBarcodeScanned() {
        return this.onBarcodeScanned$delegate.a(this, f44150E[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ib.b getOnCameraReady() {
        return this.onCameraReady$delegate.a(this, f44150E[1]);
    }

    private final Ib.b getOnMountError() {
        return this.onMountError$delegate.a(this, f44150E[2]);
    }

    private final Ib.b getOnPictureSaved() {
        return this.onPictureSaved$delegate.a(this, f44150E[4]);
    }

    private final P.c q() {
        P.d HIGHEST_AVAILABLE_STRATEGY;
        if (this.f44177y.length() > 0) {
            Size D10 = D(this.f44177y);
            if (D10 != null) {
                HIGHEST_AVAILABLE_STRATEGY = new P.d(D10, 3);
            } else {
                HIGHEST_AVAILABLE_STRATEGY = P.d.f7369c;
                Intrinsics.checkNotNullExpressionValue(HIGHEST_AVAILABLE_STRATEGY, "HIGHEST_AVAILABLE_STRATEGY");
            }
        } else {
            HIGHEST_AVAILABLE_STRATEGY = P.d.f7369c;
            Intrinsics.d(HIGHEST_AVAILABLE_STRATEGY);
        }
        if (this.f44176x == CameraRatio.ONE_ONE) {
            P.c a10 = new c.a().e(new P.b() { // from class: va.l
                @Override // P.b
                public final List a(List list, int i10) {
                    List r10;
                    r10 = n.r(list, i10);
                    return r10;
                }
            }).f(HIGHEST_AVAILABLE_STRATEGY).a();
            Intrinsics.d(a10);
            return a10;
        }
        c.a aVar = new c.a();
        CameraRatio cameraRatio = this.f44176x;
        if (cameraRatio != null) {
            aVar.d(cameraRatio.mapToStrategy());
        }
        aVar.f(HIGHEST_AVAILABLE_STRATEGY);
        P.c a11 = aVar.a();
        Intrinsics.d(a11);
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(List supportedSizes, int i10) {
        Intrinsics.checkNotNullParameter(supportedSizes, "supportedSizes");
        ArrayList arrayList = new ArrayList();
        for (Object obj : supportedSizes) {
            Size size = (Size) obj;
            if (size.getWidth() == size.getHeight()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void setCameraZoom(float f10) {
        InterfaceC0705k a10;
        InterfaceC0713p c10;
        AbstractC1604v r10;
        M0 m02;
        InterfaceC0703j interfaceC0703j = this.f44156d;
        float a11 = (interfaceC0703j == null || (c10 = interfaceC0703j.c()) == null || (r10 = c10.r()) == null || (m02 = (M0) r10.f()) == null) ? 1.0f : m02.a();
        float max = Float.max(1.0f, Float.min(a11, kotlin.ranges.d.j(f10, 0.0f, 1.0f) * a11));
        InterfaceC0703j interfaceC0703j2 = this.f44156d;
        if (interfaceC0703j2 == null || (a10 = interfaceC0703j2.a()) == null) {
            return;
        }
        a10.f(max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTorchEnabled(boolean z10) {
        InterfaceC0713p c10;
        InterfaceC0703j interfaceC0703j;
        InterfaceC0705k a10;
        InterfaceC0703j interfaceC0703j2 = this.f44156d;
        if (interfaceC0703j2 == null || (c10 = interfaceC0703j2.c()) == null || !c10.n() || (interfaceC0703j = this.f44156d) == null || (a10 = interfaceC0703j.a()) == null) {
            return;
        }
        a10.i(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final n this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = this$0.f44159g.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        U.g gVar = (U.g) obj;
        androidx.camera.view.m mVar = this$0.f44165m;
        CameraRatio cameraRatio = this$0.f44176x;
        mVar.setScaleType((cameraRatio == CameraRatio.FOUR_THREE || cameraRatio == CameraRatio.SIXTEEN_NINE) ? m.d.FIT_CENTER : m.d.FILL_CENTER);
        P.c q10 = this$0.q();
        r0 e10 = new r0.a().j(q10).e();
        e10.k0(this$0.f44165m.getSurfaceProvider());
        Intrinsics.checkNotNullExpressionValue(e10, "also(...)");
        final SurfaceTexture surfaceTexture = this$0.f44164l;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this$0.f44165m.getWidth(), this$0.f44165m.getHeight());
            e10.k0(new r0.c() { // from class: va.k
                @Override // A.r0.c
                public final void a(I0 i02) {
                    n.v(surfaceTexture, this$0, i02);
                }
            });
        }
        A.r a10 = new r.a().b(this$0.f44169q.mapToCharacteristic()).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        this$0.f44160h = new W.b().m(q10).k(this$0.f44170r.mapToLens()).e();
        o0 y10 = this$0.y();
        this$0.f44161i = this$0.x();
        K0.a aVar = new K0.a();
        aVar.a(e10);
        if (this$0.f44171s == CameraMode.PICTURE) {
            W w10 = this$0.f44160h;
            if (w10 != null) {
                aVar.a(w10);
            }
            androidx.camera.core.f fVar = this$0.f44161i;
            if (fVar != null) {
                aVar.a(fVar);
            }
        } else {
            aVar.a(y10);
        }
        K0 b10 = aVar.b();
        Intrinsics.checkNotNullExpressionValue(b10, "build(...)");
        try {
            gVar.A();
            InterfaceC0703j n10 = gVar.n(this$0.getCurrentActivity(), a10, b10);
            this$0.f44156d = n10;
            if (n10 != null) {
                InterfaceC0713p c10 = n10.c();
                Intrinsics.checkNotNullExpressionValue(c10, "getCameraInfo(...)");
                this$0.A(c10);
            }
            this$0.setCameraZoom(this$0.f44172t);
            this$0.f44158f = gVar;
        } catch (Exception unused) {
            this$0.getOnMountError().invoke(new CameraMountErrorEvent("Camera component could not be rendered - is there any other instance running?"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SurfaceTexture it, n this$0, I0 request) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "request");
        final Surface surface = new Surface(it);
        request.D(surface, androidx.core.content.a.h(this$0.getContext()), new InterfaceC5159a() { // from class: va.m
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                n.w(surface, (I0.g) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Surface surface, I0.g gVar) {
        Intrinsics.checkNotNullParameter(surface, "$surface");
        surface.release();
    }

    private final androidx.camera.core.f x() {
        androidx.camera.core.f e10 = new f.c().l(new c.a().f(P.d.f7369c).a()).h(0).e();
        Intrinsics.checkNotNullExpressionValue(e10, "build(...)");
        if (this.f44154D) {
            e10.q0(androidx.core.content.a.h(getContext()), new wa.e(this.f44169q, this.f44163k, new b()));
        }
        return e10;
    }

    private final o0 y() {
        AbstractC1258v mapToQuality = this.f44174v.mapToQuality();
        AbstractC1253p a10 = AbstractC1253p.a(mapToQuality);
        Intrinsics.checkNotNullExpressionValue(a10, "higherQualityOrLowerThan(...)");
        C1261y d10 = C1261y.d(mapToQuality, a10);
        Intrinsics.checkNotNullExpressionValue(d10, "from(...)");
        O.i iVar = new O.i();
        Integer num = this.f44175w;
        if (num != null) {
            iVar.h(num.intValue());
        }
        O c10 = iVar.f(androidx.core.content.a.h(getContext())).g(d10).c();
        this.f44162j = c10;
        Intrinsics.checkNotNullExpressionValue(c10, "also(...)");
        o0.d dVar = new o0.d(c10);
        if (this.f44178z) {
            dVar.k(2);
        }
        dVar.r(true);
        o0 e10 = dVar.e();
        Intrinsics.checkNotNullExpressionValue(e10, "build(...)");
        return e10;
    }

    private final Pair z(List list, C3362a.C0506a c0506a) {
        float f10 = this.f44165m.getResources().getDisplayMetrics().density;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int c10 = AbstractC4299c.c(0, list.size() - 1, 2);
        if (c10 >= 0) {
            while (true) {
                Bundle bundle = new Bundle();
                bundle.putFloat("x", ((Number) list.get(i10 + 1)).intValue() / f10);
                bundle.putFloat("y", ((Number) list.get(i10)).intValue() / f10);
                arrayList.add(bundle);
                if (i10 == c10) {
                    break;
                }
                i10 += 2;
            }
        }
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        bundle3.putFloat("x", c0506a.c() / f10);
        bundle3.putFloat("y", c0506a.d() / f10);
        Unit unit = Unit.f36324a;
        bundle2.putParcelable("origin", bundle3);
        Bundle bundle4 = new Bundle();
        bundle4.putFloat("width", c0506a.b() / f10);
        bundle4.putFloat("height", c0506a.a() / f10);
        bundle2.putParcelable("size", bundle4);
        return t.a(arrayList, bundle2);
    }

    public final void C(Bundle response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Ib.b onPictureSaved = getOnPictureSaved();
        int i10 = response.getInt("id");
        Bundle bundle = response.getBundle("data");
        Intrinsics.d(bundle);
        onPictureSaved.invoke(new PictureSavedEvent(i10, bundle));
    }

    public final void E() {
        this.f44168p = true;
        U.g gVar = this.f44158f;
        if (gVar != null) {
            gVar.A();
        }
    }

    public final void F(RecordingOptions options, final pb.m promise, File cacheDirectory) {
        Unit unit;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        C1254q c10 = ((C1254q.a) ((C1254q.a) new C1254q.a(ya.c.f45384a.b(cacheDirectory, "Camera", ".mp4")).b(options.getMaxFileSize())).a(options.getMaxDuration() * 1000)).c();
        Intrinsics.checkNotNullExpressionValue(c10, "build(...)");
        O o10 = this.f44162j;
        if (o10 == null) {
            unit = null;
        } else {
            if (!this.f44151A && androidx.core.content.a.a(getContext(), "android.permission.RECORD_AUDIO") != 0) {
                promise.h(new expo.modules.kotlin.exception.h("android.permission.RECORD_AUDIO"));
                return;
            }
            C1257u m02 = o10.m0(getContext(), c10);
            if (!this.f44151A) {
                m02.i();
            }
            this.f44157e = m02.h(androidx.core.content.a.h(getContext()), new InterfaceC5159a() { // from class: va.j
                @Override // y0.InterfaceC5159a
                public final void accept(Object obj) {
                    n.G(pb.m.this, (A0) obj);
                }
            });
            unit = Unit.f36324a;
        }
        if (unit == null) {
            promise.reject("E_RECORDING_FAILED", "Starting video recording failed - could not create video file.", null);
        }
    }

    public final InterfaceC0915w0 H() {
        InterfaceC0915w0 d10;
        d10 = AbstractC0891k.d(getAppContext().t(), null, null, new g(null), 3, null);
        return d10;
    }

    public final void I() {
        this.f44167o = true;
        this.f44168p = false;
        t();
    }

    public final void K(PictureOptions options, pb.m promise, File cacheDirectory) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        Object systemService = getContext().getSystemService("audio");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        int streamVolume = ((AudioManager) systemService).getStreamVolume(3);
        boolean shutterSound = options.getShutterSound();
        W w10 = this.f44160h;
        if (w10 != null) {
            w10.A0(androidx.core.content.a.h(getContext()), new i(shutterSound, streamVolume, this, options, promise, cacheDirectory));
        }
    }

    public final Y getActiveRecording() {
        return this.f44157e;
    }

    public final boolean getAnimateShutter() {
        return this.f44152B;
    }

    public final FocusMode getAutoFocus() {
        return this.f44173u;
    }

    public final List<String> getAvailablePictureSizes() {
        InterfaceC0713p c10;
        ArrayList arrayList;
        Size[] outputSizes;
        InterfaceC0703j interfaceC0703j = this.f44156d;
        if (interfaceC0703j != null && (c10 = interfaceC0703j.c()) != null) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) z.h.a(c10).b(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(PSKKeyManager.MAX_KEY_LENGTH_BYTES)) == null) {
                arrayList = null;
            } else {
                Intrinsics.d(outputSizes);
                arrayList = new ArrayList(outputSizes.length);
                for (Size size : outputSizes) {
                    String size2 = size.toString();
                    Intrinsics.checkNotNullExpressionValue(size2, "toString(...)");
                    arrayList.add(size2);
                }
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return CollectionsKt.j();
    }

    public final InterfaceC0703j getCamera() {
        return this.f44156d;
    }

    public final CameraMode getCameraMode() {
        return this.f44171s;
    }

    public final boolean getEnableTorch() {
        return ((Boolean) this.f44153C.a(this, f44150E[0])).booleanValue();
    }

    public final FlashMode getFlashMode() {
        return this.f44170r;
    }

    public final CameraType getLensFacing() {
        return this.f44169q;
    }

    public final boolean getMirror() {
        return this.f44178z;
    }

    public final boolean getMute() {
        return this.f44151A;
    }

    public final OrientationEventListener getOrientationEventListener() {
        return (OrientationEventListener) this.f44155c.getValue();
    }

    public final String getPictureSize() {
        return this.f44177y;
    }

    public int[] getPreviewSizeAsArray() {
        return new int[]{this.f44165m.getWidth(), this.f44165m.getHeight()};
    }

    public final CameraRatio getRatio() {
        return this.f44176x;
    }

    public final Integer getVideoEncodingBitrate() {
        return this.f44175w;
    }

    public final VideoQuality getVideoQuality() {
        return this.f44174v;
    }

    public final float getZoom() {
        return this.f44172t;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.f44165m.layout(0, 0, i14, i15);
        SurfaceTexture surfaceTexture = this.f44164l;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i14, i15);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChild(this.f44165m, i10, i11);
        setMeasuredDimension(View.resolveSize(this.f44165m.getMeasuredWidth(), i10), View.resolveSize(this.f44165m.getMeasuredHeight(), i11));
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (Intrinsics.b(view, this.f44165m)) {
            return;
        }
        if (view != null) {
            view.bringToFront();
        }
        removeView(this.f44165m);
        addView(this.f44165m, 0);
    }

    public final Object s() {
        try {
            Jd.O.c(this.f44166n, new Da.d(null, 1, null));
            return Unit.f36324a;
        } catch (Exception unused) {
            return Integer.valueOf(Log.e(va.f.INSTANCE.a(), "The scope does not have a job in it"));
        }
    }

    public final void setAnimateShutter(boolean z10) {
        this.f44152B = z10;
    }

    public final void setAutoFocus(FocusMode value) {
        InterfaceC0705k a10;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44173u = value;
        InterfaceC0703j interfaceC0703j = this.f44156d;
        if (interfaceC0703j == null || (a10 = interfaceC0703j.a()) == null) {
            return;
        }
        if (this.f44173u == FocusMode.OFF) {
            Intrinsics.d(a10.d());
        } else {
            J();
        }
    }

    public final void setBarcodeScannerSettings(BarcodeSettings barcodeSettings) {
        List<BarcodeType> j10;
        if (barcodeSettings == null || (j10 = barcodeSettings.getBarcodeTypes()) == null) {
            j10 = CollectionsKt.j();
        }
        this.f44163k = j10;
    }

    public final void setCamera(InterfaceC0703j interfaceC0703j) {
        this.f44156d = interfaceC0703j;
    }

    public final void setCameraFlashMode(FlashMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        W w10 = this.f44160h;
        if (w10 == null) {
            return;
        }
        w10.F0(mode.mapToLens());
    }

    public final void setCameraMode(CameraMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44171s = value;
        this.f44167o = true;
    }

    public final void setEnableTorch(boolean z10) {
        this.f44153C.b(this, f44150E[0], Boolean.valueOf(z10));
    }

    public final void setFlashMode(FlashMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44170r = value;
        setCameraFlashMode(value);
    }

    public final void setLensFacing(CameraType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44169q = value;
        this.f44167o = true;
    }

    public final void setMirror(boolean z10) {
        this.f44178z = z10;
        this.f44167o = true;
    }

    public final void setMute(boolean z10) {
        this.f44151A = z10;
    }

    public final void setPictureSize(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44177y = value;
        this.f44167o = true;
    }

    public void setPreviewTexture(SurfaceTexture surfaceTexture) {
        this.f44164l = surfaceTexture;
        this.f44167o = true;
        t();
    }

    public final void setRatio(CameraRatio cameraRatio) {
        this.f44176x = cameraRatio;
        this.f44167o = true;
    }

    public final void setShouldScanBarcodes(boolean z10) {
        this.f44154D = z10;
        this.f44167o = true;
    }

    public final void setVideoEncodingBitrate(Integer num) {
        this.f44175w = num;
        this.f44167o = true;
    }

    public final void setVideoQuality(VideoQuality value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44174v = value;
        this.f44167o = true;
    }

    public final void setZoom(float f10) {
        this.f44172t = f10;
        setCameraZoom(f10);
    }

    public final void t() {
        if (!this.f44167o || this.f44168p) {
            return;
        }
        this.f44167o = false;
        this.f44159g.e(new Runnable() { // from class: va.i
            @Override // java.lang.Runnable
            public final void run() {
                n.u(n.this);
            }
        }, androidx.core.content.a.h(getContext()));
    }

    public static final class a implements ViewGroup.OnHierarchyChangeListener {
        a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(n.this.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(n.this.getMeasuredHeight(), 1073741824));
            }
            if (view != null) {
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }
    }
}
