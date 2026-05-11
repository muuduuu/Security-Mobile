package com.facebook.react.views.image;

import R4.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.C1931a;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.M;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.Y;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.image.b;
import e5.EnumC3081c;
import e5.j;
import f3.AbstractC3142a;
import g5.C3193c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l4.C3608a;
import l5.C3609a;
import l5.b;
import m4.AbstractC3650a;
import v3.AbstractC4922b;
import v3.InterfaceC4924d;
import x4.C5109a;
import y3.RunnableC5168b;
import y3.k;
import y3.p;
import z3.C5249a;
import z3.C5250b;
import z3.C5252d;

/* loaded from: classes2.dex */
public final class h extends C3.d {

    /* renamed from: I, reason: collision with root package name */
    public static final a f22527I = new a(null);

    /* renamed from: J, reason: collision with root package name */
    private static final float[] f22528J = new float[4];

    /* renamed from: K, reason: collision with root package name */
    private static final Matrix f22529K = new Matrix();

    /* renamed from: A, reason: collision with root package name */
    private g f22530A;

    /* renamed from: B, reason: collision with root package name */
    private InterfaceC4924d f22531B;

    /* renamed from: C, reason: collision with root package name */
    private int f22532C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f22533D;

    /* renamed from: E, reason: collision with root package name */
    private ReadableMap f22534E;

    /* renamed from: F, reason: collision with root package name */
    private float f22535F;

    /* renamed from: G, reason: collision with root package name */
    private final com.facebook.react.views.view.g f22536G;

    /* renamed from: H, reason: collision with root package name */
    private com.facebook.react.views.image.c f22537H;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC4922b f22538h;

    /* renamed from: i, reason: collision with root package name */
    private Object f22539i;

    /* renamed from: j, reason: collision with root package name */
    private final List f22540j;

    /* renamed from: k, reason: collision with root package name */
    private C3609a f22541k;

    /* renamed from: l, reason: collision with root package name */
    private C3609a f22542l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f22543m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f22544n;

    /* renamed from: o, reason: collision with root package name */
    private k f22545o;

    /* renamed from: p, reason: collision with root package name */
    private int f22546p;

    /* renamed from: q, reason: collision with root package name */
    private int f22547q;

    /* renamed from: r, reason: collision with root package name */
    private int f22548r;

    /* renamed from: s, reason: collision with root package name */
    private float f22549s;

    /* renamed from: t, reason: collision with root package name */
    private float f22550t;

    /* renamed from: u, reason: collision with root package name */
    private float[] f22551u;

    /* renamed from: v, reason: collision with root package name */
    private p.b f22552v;

    /* renamed from: w, reason: collision with root package name */
    private Shader.TileMode f22553w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f22554x;

    /* renamed from: y, reason: collision with root package name */
    private b f22555y;

    /* renamed from: z, reason: collision with root package name */
    private C3608a f22556z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C5249a b(Context context) {
            C5250b c5250b = new C5250b(context.getResources());
            C5252d a10 = C5252d.a(0.0f);
            a10.q(true);
            C5249a a11 = c5250b.u(a10).a();
            Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
            return a11;
        }

        private a() {
        }
    }

    private final class b extends AbstractC3650a {
        public b() {
        }

        @Override // m4.AbstractC3650a, m4.d
        public AbstractC3142a a(Bitmap source, Y3.d bitmapFactory) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
            Rect rect = new Rect(0, 0, h.this.getWidth(), h.this.getHeight());
            h.this.f22552v.a(h.f22529K, rect, source.getWidth(), source.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(source, h.this.f22553w, h.this.f22553w);
            bitmapShader.setLocalMatrix(h.f22529K);
            paint.setShader(bitmapShader);
            AbstractC3142a a10 = bitmapFactory.a(h.this.getWidth(), h.this.getHeight());
            Intrinsics.checkNotNullExpressionValue(a10, "createBitmap(...)");
            try {
                new Canvas((Bitmap) a10.p()).drawRect(rect, paint);
                AbstractC3142a clone = a10.clone();
                Intrinsics.checkNotNullExpressionValue(clone, "clone(...)");
                return clone;
            } finally {
                AbstractC3142a.n(a10);
            }
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22558a;

        static {
            int[] iArr = new int[com.facebook.react.views.image.c.values().length];
            try {
                iArr[com.facebook.react.views.image.c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.facebook.react.views.image.c.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22558a = iArr;
        }
    }

    public static final class d extends g {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EventDispatcher f22559f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h f22560g;

        d(EventDispatcher eventDispatcher, h hVar) {
            this.f22559f = eventDispatcher;
            this.f22560g = hVar;
        }

        @Override // v3.InterfaceC4924d
        public void i(String id2, Throwable throwable) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            EventDispatcher eventDispatcher = this.f22559f;
            if (eventDispatcher == null) {
                return;
            }
            eventDispatcher.c(com.facebook.react.views.image.b.f22515h.a(L0.f(this.f22560g), this.f22560g.getId(), throwable));
        }

        @Override // v3.InterfaceC4924d
        public void o(String id2, Object obj) {
            Intrinsics.checkNotNullParameter(id2, "id");
            EventDispatcher eventDispatcher = this.f22559f;
            if (eventDispatcher == null) {
                return;
            }
            eventDispatcher.c(com.facebook.react.views.image.b.f22515h.d(L0.f(this.f22560g), this.f22560g.getId()));
        }

        @Override // com.facebook.react.views.image.g
        public void x(int i10, int i11) {
            if (this.f22559f == null || this.f22560g.getImageSource$ReactAndroid_release() == null) {
                return;
            }
            EventDispatcher eventDispatcher = this.f22559f;
            b.a aVar = com.facebook.react.views.image.b.f22515h;
            int f10 = L0.f(this.f22560g);
            int id2 = this.f22560g.getId();
            C3609a imageSource$ReactAndroid_release = this.f22560g.getImageSource$ReactAndroid_release();
            eventDispatcher.c(aVar.e(f10, id2, imageSource$ReactAndroid_release != null ? imageSource$ReactAndroid_release.d() : null, i10, i11));
        }

        @Override // v3.InterfaceC4924d
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void f(String id2, g4.k kVar, Animatable animatable) {
            EventDispatcher eventDispatcher;
            Intrinsics.checkNotNullParameter(id2, "id");
            if (kVar == null || this.f22560g.getImageSource$ReactAndroid_release() == null || (eventDispatcher = this.f22559f) == null) {
                return;
            }
            b.a aVar = com.facebook.react.views.image.b.f22515h;
            int f10 = L0.f(this.f22560g);
            int id3 = this.f22560g.getId();
            C3609a imageSource$ReactAndroid_release = this.f22560g.getImageSource$ReactAndroid_release();
            eventDispatcher.c(aVar.c(f10, id3, imageSource$ReactAndroid_release != null ? imageSource$ReactAndroid_release.d() : null, kVar.getWidth(), kVar.getHeight()));
            this.f22559f.c(aVar.b(L0.f(this.f22560g), this.f22560g.getId()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AbstractC4922b draweeControllerBuilder, com.facebook.react.views.image.a aVar, Object obj) {
        super(context, f22527I.b(context));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(draweeControllerBuilder, "draweeControllerBuilder");
        this.f22538h = draweeControllerBuilder;
        this.f22539i = obj;
        this.f22540j = new ArrayList();
        this.f22550t = Float.NaN;
        this.f22552v = com.facebook.react.views.image.d.b();
        this.f22553w = com.facebook.react.views.image.d.a();
        this.f22532C = -1;
        this.f22535F = 1.0f;
        com.facebook.react.views.view.g gVar = new com.facebook.react.views.view.g(this);
        this.f22536G = gVar;
        this.f22537H = com.facebook.react.views.image.c.AUTO;
        gVar.k("hidden");
        setLegacyVisibilityHandlingEnabled(true);
    }

    private final a4.f getResizeOptions() {
        int round = Math.round(getWidth() * this.f22535F);
        int round2 = Math.round(getHeight() * this.f22535F);
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        return new a4.f(round, round2, 0.0f, 0.0f, 12, null);
    }

    private final void j(float[] fArr) {
        float f10 = !com.facebook.yoga.g.a(this.f22550t) ? this.f22550t : 0.0f;
        float[] fArr2 = this.f22551u;
        if (fArr2 == null) {
            float[] fArr3 = new float[4];
            for (int i10 = 0; i10 < 4; i10++) {
                fArr3[i10] = Float.NaN;
            }
            fArr2 = fArr3;
        }
        fArr[0] = !com.facebook.yoga.g.a(fArr2[0]) ? fArr2[0] : f10;
        fArr[1] = !com.facebook.yoga.g.a(fArr2[1]) ? fArr2[1] : f10;
        fArr[2] = !com.facebook.yoga.g.a(fArr2[2]) ? fArr2[2] : f10;
        if (!com.facebook.yoga.g.a(fArr2[3])) {
            f10 = fArr2[3];
        }
        fArr[3] = f10;
    }

    private final Drawable k(C3609a c3609a) {
        if (!G4.a.m()) {
            return null;
        }
        String d10 = c3609a.d();
        if (!c3609a.f() || d10 == null) {
            return null;
        }
        l5.c a10 = l5.c.f37094b.a();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!a10.i(context, d10)) {
            return null;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return a10.f(context2, d10);
    }

    private final boolean l() {
        return this.f22540j.size() > 1;
    }

    private final boolean m() {
        return this.f22553w != Shader.TileMode.CLAMP;
    }

    private final void o(Drawable drawable) {
        EventDispatcher eventDispatcher;
        if (this.f22530A != null) {
            Context context = getContext();
            Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            eventDispatcher = L0.c((ReactContext) context, getId());
        } else {
            eventDispatcher = null;
        }
        if (eventDispatcher != null) {
            eventDispatcher.c(com.facebook.react.views.image.b.f22515h.d(L0.f(this), getId()));
        }
        ((C5249a) getHierarchy()).f(drawable, 1.0f, false);
        if (eventDispatcher == null || this.f22541k == null) {
            return;
        }
        b.a aVar = com.facebook.react.views.image.b.f22515h;
        int f10 = L0.f(this);
        int id2 = getId();
        C3609a c3609a = this.f22541k;
        eventDispatcher.c(aVar.c(f10, id2, c3609a != null ? c3609a.d() : null, getWidth(), getHeight()));
        eventDispatcher.c(aVar.b(L0.f(this), getId()));
    }

    private final void p(boolean z10) {
        Uri e10;
        C3609a c3609a = this.f22541k;
        if (c3609a == null || (e10 = c3609a.e()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        C3608a c3608a = this.f22556z;
        if (c3608a != null) {
            arrayList.add(c3608a);
        }
        b bVar = this.f22555y;
        if (bVar != null) {
            arrayList.add(bVar);
        }
        m4.d a10 = e.f22524b.a(arrayList);
        a4.f resizeOptions = z10 ? getResizeOptions() : null;
        m4.c I10 = m4.c.w(e10).H(a10).L(resizeOptions).x(true).I(this.f22533D);
        a.C0164a c0164a = R4.a.f8451B;
        Intrinsics.d(I10);
        R4.a a11 = c0164a.a(I10, this.f22534E);
        AbstractC4922b abstractC4922b = this.f22538h;
        Intrinsics.e(abstractC4922b, "null cannot be cast to non-null type com.facebook.drawee.controller.AbstractDraweeControllerBuilder<*, com.facebook.imagepipeline.request.ImageRequest, com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>, com.facebook.imagepipeline.image.ImageInfo>");
        abstractC4922b.x();
        abstractC4922b.B(a11).y(true).D(getController());
        Object obj = this.f22539i;
        if (obj != null) {
            abstractC4922b.z(obj);
        }
        C3609a c3609a2 = this.f22542l;
        if (c3609a2 != null) {
            abstractC4922b.C(m4.c.w(c3609a2.e()).H(a10).L(resizeOptions).x(true).I(this.f22533D).a());
        }
        g gVar = this.f22530A;
        if (gVar == null || this.f22531B == null) {
            InterfaceC4924d interfaceC4924d = this.f22531B;
            if (interfaceC4924d != null) {
                abstractC4922b.A(interfaceC4924d);
            } else if (gVar != null) {
                abstractC4922b.A(gVar);
            }
        } else {
            v3.f fVar = new v3.f();
            fVar.b(this.f22530A);
            fVar.b(this.f22531B);
            abstractC4922b.A(fVar);
        }
        if (this.f22530A != null) {
            ((C5249a) getHierarchy()).z(this.f22530A);
        }
        setController(abstractC4922b.a());
        abstractC4922b.x();
    }

    private final void r() {
        this.f22541k = null;
        if (this.f22540j.isEmpty()) {
            List list = this.f22540j;
            C3609a.C0550a c0550a = C3609a.f37086e;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            list.add(c0550a.a(context));
        } else if (l()) {
            b.a a10 = l5.b.a(getWidth(), getHeight(), this.f22540j);
            this.f22541k = a10.f37092a;
            this.f22542l = a10.f37093b;
            return;
        }
        this.f22541k = (C3609a) this.f22540j.get(0);
    }

    private final boolean s(C3609a c3609a) {
        int i10 = c.f22558a[this.f22537H.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
        } else if (!j3.f.k(c3609a.e()) && !j3.f.l(c3609a.e())) {
            return false;
        }
        return true;
    }

    private final void t(String str) {
        if (!C5109a.f44775b || ReactFeatureFlags.enableBridgelessArchitecture) {
            return;
        }
        Context context = getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        C3193c.d((ReactContext) context, "ReactImageView: Image source \"" + str + "\" doesn't exist");
    }

    public final C3609a getImageSource$ReactAndroid_release() {
        return this.f22541k;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void n() {
        if (this.f22554x) {
            if (!l() || (getWidth() > 0 && getHeight() > 0)) {
                r();
                C3609a c3609a = this.f22541k;
                if (c3609a == null) {
                    return;
                }
                boolean s10 = s(c3609a);
                if (!s10 || (getWidth() > 0 && getHeight() > 0)) {
                    if (!m() || (getWidth() > 0 && getHeight() > 0)) {
                        C5249a c5249a = (C5249a) getHierarchy();
                        c5249a.t(this.f22552v);
                        Drawable drawable = this.f22543m;
                        if (drawable != null) {
                            c5249a.x(drawable, this.f22552v);
                        }
                        Drawable drawable2 = this.f22544n;
                        if (drawable2 != null) {
                            c5249a.x(drawable2, p.b.f45291g);
                        }
                        float[] fArr = f22528J;
                        j(fArr);
                        C5252d o10 = c5249a.o();
                        if (o10 != null) {
                            o10.n(fArr[0], fArr[1], fArr[2], fArr[3]);
                            k kVar = this.f22545o;
                            if (kVar != null) {
                                kVar.b(this.f22547q, this.f22549s);
                                float[] d10 = o10.d();
                                if (d10 != null) {
                                    kVar.t(d10);
                                }
                                c5249a.u(kVar);
                            }
                            o10.m(this.f22547q, this.f22549s);
                            int i10 = this.f22548r;
                            if (i10 != 0) {
                                o10.p(i10);
                            } else {
                                o10.r(C5252d.a.BITMAP_ONLY);
                            }
                            c5249a.A(o10);
                        }
                        int i11 = this.f22532C;
                        if (i11 < 0) {
                            i11 = c3609a.f() ? 0 : 300;
                        }
                        c5249a.w(i11);
                        Drawable k10 = k(c3609a);
                        if (k10 != null) {
                            o(k10);
                        } else {
                            p(s10);
                        }
                        this.f22554x = false;
                    }
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (G4.a.c()) {
            C1931a.a(this, canvas);
        } else if (G4.a.s()) {
            this.f22536G.d(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f22554x = this.f22554x || l() || m();
        n();
    }

    public final void q(float f10, int i10) {
        if (G4.a.c()) {
            C1931a.l(this, EnumC3081c.values()[i10], Float.isNaN(f10) ? null : new X(C1944g0.f22418a.d(f10), Y.POINT));
            return;
        }
        if (G4.a.s()) {
            this.f22536G.h(f10, i10 + 1);
            return;
        }
        if (this.f22551u == null) {
            float[] fArr = new float[4];
            for (int i11 = 0; i11 < 4; i11++) {
                fArr[i11] = Float.NaN;
            }
            this.f22551u = fArr;
        }
        float[] fArr2 = this.f22551u;
        if (M.b(fArr2 != null ? Float.valueOf(fArr2[i10]) : null, Float.valueOf(f10))) {
            return;
        }
        float[] fArr3 = this.f22551u;
        if (fArr3 != null) {
            fArr3[i10] = f10;
        }
        this.f22554x = true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (G4.a.c()) {
            C1931a.i(this, Integer.valueOf(i10));
            return;
        }
        if (G4.a.s()) {
            this.f22536G.e(i10);
        } else if (this.f22546p != i10) {
            this.f22546p = i10;
            this.f22545o = new k(i10);
            this.f22554x = true;
        }
    }

    public final void setBlurRadius(float f10) {
        int b10 = ((int) C1944g0.f22418a.b(f10)) / 2;
        this.f22556z = b10 == 0 ? null : new C3608a(2, b10);
        this.f22554x = true;
    }

    public final void setBorderColor(int i10) {
        if (G4.a.c()) {
            C1931a.k(this, j.ALL, Integer.valueOf(i10));
            return;
        }
        if (G4.a.s()) {
            this.f22536G.f(8, Integer.valueOf(i10));
        } else if (this.f22547q != i10) {
            this.f22547q = i10;
            this.f22554x = true;
        }
    }

    public final void setBorderRadius(float f10) {
        if (G4.a.c()) {
            C1931a.l(this, EnumC3081c.BORDER_RADIUS, Float.isNaN(f10) ? null : new X(C1944g0.f22418a.d(f10), Y.POINT));
            return;
        }
        if (G4.a.s()) {
            this.f22536G.g(f10);
        } else {
            if (M.a(this.f22550t, f10)) {
                return;
            }
            this.f22550t = f10;
            this.f22554x = true;
        }
    }

    public final void setBorderWidth(float f10) {
        float b10 = C1944g0.f22418a.b(f10);
        if (G4.a.c()) {
            C1931a.n(this, j.ALL, Float.valueOf(f10));
            return;
        }
        if (G4.a.s()) {
            this.f22536G.j(8, b10);
        } else {
            if (M.a(this.f22549s, b10)) {
                return;
            }
            this.f22549s = b10;
            this.f22554x = true;
        }
    }

    public final void setControllerListener(InterfaceC4924d interfaceC4924d) {
        this.f22531B = interfaceC4924d;
        this.f22554x = true;
        n();
    }

    public final void setDefaultSource(String str) {
        l5.c a10 = l5.c.f37094b.a();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable f10 = a10.f(context, str);
        if (Intrinsics.b(this.f22543m, f10)) {
            return;
        }
        this.f22543m = f10;
        this.f22554x = true;
    }

    public final void setFadeDuration(int i10) {
        this.f22532C = i10;
    }

    public final void setHeaders(ReadableMap readableMap) {
        this.f22534E = readableMap;
    }

    public final void setImageSource$ReactAndroid_release(C3609a c3609a) {
        this.f22541k = c3609a;
    }

    public final void setLoadingIndicatorSource(String str) {
        l5.c a10 = l5.c.f37094b.a();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable f10 = a10.f(context, str);
        RunnableC5168b runnableC5168b = f10 != null ? new RunnableC5168b(f10, 1000) : null;
        if (Intrinsics.b(this.f22544n, runnableC5168b)) {
            return;
        }
        this.f22544n = runnableC5168b;
        this.f22554x = true;
    }

    public final void setOverlayColor(int i10) {
        if (this.f22548r != i10) {
            this.f22548r = i10;
            this.f22554x = true;
        }
    }

    public final void setProgressiveRenderingEnabled(boolean z10) {
        this.f22533D = z10;
    }

    public final void setResizeMethod(com.facebook.react.views.image.c resizeMethod) {
        Intrinsics.checkNotNullParameter(resizeMethod, "resizeMethod");
        if (this.f22537H != resizeMethod) {
            this.f22537H = resizeMethod;
            this.f22554x = true;
        }
    }

    public final void setResizeMultiplier(float f10) {
        if (Math.abs(this.f22535F - f10) > 9.999999747378752E-5d) {
            this.f22535F = f10;
            this.f22554x = true;
        }
    }

    public final void setScaleType(p.b scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (this.f22552v != scaleType) {
            this.f22552v = scaleType;
            this.f22554x = true;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean z10) {
        if (z10 == (this.f22530A != null)) {
            return;
        }
        if (z10) {
            Context context = getContext();
            Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.f22530A = new d(L0.c((ReactContext) context, getId()), this);
        } else {
            this.f22530A = null;
        }
        this.f22554x = true;
    }

    public final void setSource(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        if (readableArray == null || readableArray.size() == 0) {
            C3609a.C0550a c0550a = C3609a.f37086e;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList.add(c0550a.a(context));
        } else {
            if (readableArray.size() == 1) {
                ReadableMap map = readableArray.getMap(0);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                C3609a c3609a = new C3609a(context2, map.getString("uri"), 0.0d, 0.0d, 12, null);
                if (Intrinsics.b(Uri.EMPTY, c3609a.e())) {
                    t(map.getString("uri"));
                    C3609a.C0550a c0550a2 = C3609a.f37086e;
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    c3609a = c0550a2.a(context3);
                }
                arrayList.add(c3609a);
            } else {
                int size = readableArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ReadableMap map2 = readableArray.getMap(i10);
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    C3609a c3609a2 = new C3609a(context4, map2.getString("uri"), map2.getDouble("width"), map2.getDouble("height"));
                    if (Intrinsics.b(Uri.EMPTY, c3609a2.e())) {
                        t(map2.getString("uri"));
                        C3609a.C0550a c0550a3 = C3609a.f37086e;
                        Context context5 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        c3609a2 = c0550a3.a(context5);
                    }
                    arrayList.add(c3609a2);
                }
            }
        }
        if (Intrinsics.b(this.f22540j, arrayList)) {
            return;
        }
        this.f22540j.clear();
        this.f22540j.addAll(arrayList);
        this.f22554x = true;
    }

    public final void setTileMode(Shader.TileMode tileMode) {
        Intrinsics.checkNotNullParameter(tileMode, "tileMode");
        if (this.f22553w != tileMode) {
            this.f22553w = tileMode;
            this.f22555y = m() ? new b() : null;
            this.f22554x = true;
        }
    }
}
