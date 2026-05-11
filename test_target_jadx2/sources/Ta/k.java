package Ta;

import ab.C1372c;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import expo.modules.image.enums.ContentFit;
import expo.modules.image.enums.Priority;
import expo.modules.image.records.CachePolicy;
import expo.modules.image.records.ContentPosition;
import expo.modules.image.records.DecodeFormat;
import expo.modules.image.records.ImageTransition;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import jc.C3523b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;
import q1.AbstractC3901a;
import xc.C5142C;
import z0.C5228A;

/* loaded from: classes2.dex */
public final class k extends expo.modules.kotlin.views.h {

    /* renamed from: G, reason: collision with root package name */
    private static com.bumptech.glide.l f9596G;

    /* renamed from: A, reason: collision with root package name */
    private boolean f9599A;

    /* renamed from: B, reason: collision with root package name */
    private m f9600B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f9601C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f9602D;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.l f9603c;

    /* renamed from: d, reason: collision with root package name */
    private final Ya.b f9604d;

    /* renamed from: e, reason: collision with root package name */
    private final h f9605e;

    /* renamed from: f, reason: collision with root package name */
    private final h f9606f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f9607g;

    /* renamed from: h, reason: collision with root package name */
    private t f9608h;

    /* renamed from: i, reason: collision with root package name */
    private t f9609i;

    /* renamed from: j, reason: collision with root package name */
    private List f9610j;

    /* renamed from: k, reason: collision with root package name */
    private List f9611k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f9612l;

    /* renamed from: m, reason: collision with root package name */
    private ImageTransition f9613m;

    /* renamed from: n, reason: collision with root package name */
    private ContentFit f9614n;

    /* renamed from: o, reason: collision with root package name */
    private ContentFit f9615o;
    private final Ib.c onDisplay$delegate;
    private final Ib.c onError$delegate;
    private final Ib.c onLoad$delegate;
    private final Ib.c onLoadStart$delegate;
    private final Ib.c onProgress$delegate;

    /* renamed from: p, reason: collision with root package name */
    private ContentPosition f9616p;

    /* renamed from: q, reason: collision with root package name */
    private Integer f9617q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f9618r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f9619s;

    /* renamed from: t, reason: collision with root package name */
    private String f9620t;

    /* renamed from: u, reason: collision with root package name */
    private String f9621u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f9622v;

    /* renamed from: w, reason: collision with root package name */
    private DecodeFormat f9623w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f9624x;

    /* renamed from: y, reason: collision with root package name */
    private Priority f9625y;

    /* renamed from: z, reason: collision with root package name */
    private CachePolicy f9626z;

    /* renamed from: F, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f9595F = {C5142C.k(new xc.u(k.class, "onLoadStart", "getOnLoadStart$expo_image_release()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), C5142C.k(new xc.u(k.class, "onProgress", "getOnProgress$expo_image_release()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), C5142C.k(new xc.u(k.class, "onError", "getOnError$expo_image_release()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), C5142C.k(new xc.u(k.class, "onLoad", "getOnLoad$expo_image_release()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), C5142C.k(new xc.u(k.class, "onDisplay", "getOnDisplay$expo_image_release()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0))};

    /* renamed from: E, reason: collision with root package name */
    public static final a f9594E = new a(null);

    /* renamed from: H, reason: collision with root package name */
    private static WeakReference f9597H = new WeakReference(null);

    /* renamed from: I, reason: collision with root package name */
    private static WeakReference f9598I = new WeakReference(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final com.bumptech.glide.l a(Activity activity) {
            com.bumptech.glide.l u10 = com.bumptech.glide.c.u(activity);
            Intrinsics.checkNotNullExpressionValue(u10, "with(...)");
            return u10;
        }

        public final com.bumptech.glide.l b(C3862a appContext, Activity activity) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(activity, "activity");
            a aVar = k.f9594E;
            synchronized (aVar) {
                com.bumptech.glide.l lVar = k.f9596G;
                if (lVar == null) {
                    com.bumptech.glide.l a10 = aVar.a(activity);
                    k.f9596G = a10;
                    k.f9597H = new WeakReference(appContext);
                    k.f9598I = new WeakReference(activity);
                    return a10;
                }
                if (Intrinsics.b(k.f9597H.get(), appContext) && Intrinsics.b(k.f9598I.get(), activity)) {
                    return lVar;
                }
                com.bumptech.glide.l a11 = aVar.a(activity);
                k.f9596G = a11;
                k.f9597H = new WeakReference(appContext);
                k.f9598I = new WeakReference(activity);
                return a11;
            }
        }

        private a() {
        }
    }

    static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f9627a;

        b(Function0 function0) {
            this.f9627a = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f9627a.invoke();
        }
    }

    static final class c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f9628a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f9629b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f9630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h hVar, t tVar, k kVar) {
            super(0);
            this.f9628a = hVar;
            this.f9629b = tVar;
            this.f9630c = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke() {
            t g10 = this.f9628a.g();
            if (g10 == null) {
                return null;
            }
            t tVar = this.f9629b;
            k kVar = this.f9630c;
            if (Intrinsics.b(g10, tVar)) {
                return g10;
            }
            g10.e(kVar.getRequestManager$expo_image_release());
            return g10;
        }
    }

    public static final class d extends C1483a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9631d;

        d(boolean z10) {
            this.f9631d = z10;
        }

        @Override // androidx.core.view.C1483a
        public void g(View host, C5228A info) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            info.L0(this.f9631d);
            super.g(host, info);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, C3862a appContext) {
        super(context, appContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f9603c = f9594E.b(appContext, getActivity());
        this.f9604d = new Ya.b(new WeakReference(this));
        h hVar = new h(getActivity());
        this.f9605e = hVar;
        h hVar2 = new h(getActivity());
        this.f9606f = hVar2;
        this.f9607g = new Handler(context.getMainLooper());
        this.f9608h = new t(new WeakReference(this));
        this.f9609i = new t(new WeakReference(this));
        this.onLoadStart$delegate = new Ib.c(this, null);
        this.onProgress$delegate = new Ib.c(this, null);
        this.onError$delegate = new Ib.c(this, null);
        this.onLoad$delegate = new Ib.c(this, null);
        this.onDisplay$delegate = new Ib.c(this, null);
        this.f9610j = CollectionsKt.j();
        this.f9611k = CollectionsKt.j();
        this.f9614n = ContentFit.Cover;
        this.f9615o = ContentFit.ScaleDown;
        this.f9616p = ContentPosition.INSTANCE.a();
        this.f9622v = true;
        this.f9623w = DecodeFormat.ARGB_8888;
        this.f9624x = true;
        this.f9625y = Priority.NORMAL;
        this.f9626z = CachePolicy.DISK;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        hVar.setVisibility(0);
        hVar2.setVisibility(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(hVar, layoutParams);
        frameLayout.addView(hVar2, layoutParams);
        addView(frameLayout, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E(expo.modules.image.records.b bVar, m mVar, m mVar2) {
        if (getWidth() != 0 && getHeight() != 0 && ((bVar != null && mVar != null) || mVar2 != null)) {
            return false;
        }
        this.f9605e.g();
        this.f9606f.g();
        this.f9603c.p(this.f9608h);
        this.f9603c.p(this.f9609i);
        this.f9599A = false;
        this.f9600B = null;
        this.f9601C = false;
        this.f9602D = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        if (this.f9602D) {
            t g10 = (this.f9605e.getDrawable() != null ? this.f9605e : this.f9606f).g();
            if (g10 != null) {
                g10.e(this.f9603c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void G(h hVar, t tVar, Drawable drawable, boolean z10) {
        hVar.setImageDrawable(drawable);
        hVar.setPlaceholder(z10);
        ContentFit o10 = tVar.o();
        if (o10 == null) {
            o10 = ContentFit.ScaleDown;
        }
        hVar.setPlaceholderContentFit$expo_image_release(o10);
        H(hVar);
        hVar.setVisibility(0);
        hVar.setCurrentTarget(tVar);
        hVar.layout(0, 0, getWidth(), getHeight());
        hVar.c();
        tVar.A(true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    private final void H(h hVar) {
        hVar.setContentFit$expo_image_release(this.f9614n);
        hVar.setContentPosition$expo_image_release(this.f9616p);
        hVar.setTintColor$expo_image_release(this.f9617q);
        hVar.setFocusable(this.f9618r);
        hVar.setContentDescription(this.f9620t);
        Q(hVar, this.f9619s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r2.n I(t tVar) {
        if (this.f9622v) {
            ContentFit contentFit = this.f9614n;
            return (contentFit == ContentFit.Fill || contentFit == ContentFit.None) ? new x(this.f9623w) : new C1197b(tVar, this.f9614n);
        }
        r2.n nVar = r2.n.f39168f;
        Intrinsics.d(nVar);
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.bumptech.glide.request.h J() {
        com.bumptech.glide.request.a Z10 = new com.bumptech.glide.request.h().Z(this.f9625y.toGlidePriority$expo_image_release());
        Intrinsics.checkNotNullExpressionValue(Z10, "priority(...)");
        com.bumptech.glide.request.h hVar = (com.bumptech.glide.request.h) Z10;
        CachePolicy cachePolicy = this.f9626z;
        if ((cachePolicy == CachePolicy.MEMORY_AND_DISK || cachePolicy == CachePolicy.MEMORY) ? false : true) {
            com.bumptech.glide.request.a h02 = hVar.h0(true);
            Intrinsics.checkNotNullExpressionValue(h02, "skipMemoryCache(...)");
            hVar = (com.bumptech.glide.request.h) h02;
        }
        CachePolicy cachePolicy2 = this.f9626z;
        if (cachePolicy2 == CachePolicy.NONE || cachePolicy2 == CachePolicy.MEMORY) {
            com.bumptech.glide.request.a k10 = hVar.k(k2.j.f36073b);
            Intrinsics.checkNotNullExpressionValue(k10, "diskCacheStrategy(...)");
            hVar = (com.bumptech.glide.request.h) k10;
        }
        Integer num = this.f9612l;
        if (num == null) {
            return hVar;
        }
        com.bumptech.glide.request.a i02 = hVar.i0(new C3523b(Math.min(num.intValue(), 25), 4));
        Intrinsics.checkNotNullExpressionValue(i02, "transform(...)");
        return (com.bumptech.glide.request.h) i02;
    }

    private final expo.modules.image.records.b K(List list) {
        expo.modules.image.records.b bVar = null;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (expo.modules.image.records.b) CollectionsKt.d0(list);
        }
        int width = getWidth() * getHeight();
        if (width == 0) {
            return null;
        }
        Iterator it = list.iterator();
        double d10 = Double.MAX_VALUE;
        while (it.hasNext()) {
            expo.modules.image.records.b bVar2 = (expo.modules.image.records.b) it.next();
            double abs = Math.abs(1 - (bVar2.getPixelCount() / width));
            if (abs < d10) {
                bVar = bVar2;
                d10 = abs;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void M(k this$0, boolean z10, t target, Drawable resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(target, "$target");
        Intrinsics.checkNotNullParameter(resource, "$resource");
        AbstractC3901a.c("[" + B.f9505a.c() + "] onResourceReady");
        try {
            ImageTransition transition$expo_image_release = this$0.getTransition$expo_image_release();
            long duration = transition$expo_image_release != null ? transition$expo_image_release.getDuration() : 0;
            if (z10 && target.g()) {
                if ((this$0.f9605e.getDrawable() == null || this$0.f9605e.f()) && this$0.f9606f.getDrawable() == null) {
                    t g10 = this$0.f9605e.g();
                    if (g10 != null && !Intrinsics.b(g10, target)) {
                        g10.e(this$0.getRequestManager$expo_image_release());
                    }
                    this$0.G(this$0.f9605e, target, resource, z10);
                    if (duration > 0) {
                        this$0.f9605e.bringToFront();
                        this$0.f9605e.setAlpha(0.0f);
                        this$0.f9606f.setVisibility(8);
                        ViewPropertyAnimator animate = this$0.f9605e.animate();
                        animate.setDuration(duration);
                        animate.alpha(1.0f);
                    }
                    if ((resource instanceof Animatable) && !z10 && !this$0.getAutoplay$expo_image_release()) {
                        ((Animatable) resource).stop();
                    }
                }
                Unit unit = Unit.f36324a;
                AbstractC3901a.f();
            }
            Pair a10 = this$0.f9605e.getDrawable() == null ? lc.t.a(this$0.f9605e, this$0.f9606f) : lc.t.a(this$0.f9606f, this$0.f9605e);
            h hVar = (h) a10.getFirst();
            h hVar2 = (h) a10.getSecond();
            c cVar = new c(hVar2, target, this$0);
            this$0.G(hVar, target, resource, z10);
            if (target.g()) {
                this$0.getOnDisplay$expo_image_release().invoke(Unit.f36324a);
            }
            if (duration <= 0) {
                cVar.invoke();
                hVar.setAlpha(1.0f);
                hVar.bringToFront();
            } else {
                hVar.bringToFront();
                hVar2.setAlpha(1.0f);
                hVar.setAlpha(0.0f);
                ViewPropertyAnimator animate2 = hVar2.animate();
                animate2.setDuration(duration);
                animate2.alpha(0.0f);
                animate2.withEndAction(new b(cVar));
                ViewPropertyAnimator animate3 = hVar.animate();
                animate3.setDuration(duration);
                animate3.alpha(1.0f);
            }
            if (resource instanceof Animatable) {
                ((Animatable) resource).stop();
            }
            Unit unit2 = Unit.f36324a;
            AbstractC3901a.f();
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }

    public static /* synthetic */ void P(k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        kVar.O(z10);
    }

    private final void Q(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            view.setScreenReaderFocusable(z10);
        } else {
            AbstractC1484a0.q0(this, new d(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h getActiveView() {
        return this.f9606f.getDrawable() != null ? this.f9606f : this.f9605e;
    }

    private final Activity getActivity() {
        return getAppContext().x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final expo.modules.image.records.b getBestPlaceholder() {
        return K(this.f9611k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final expo.modules.image.records.b getBestSource() {
        return K(this.f9610j);
    }

    public final boolean L(final t target, final Drawable resource, final boolean z10) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(resource, "resource");
        return this.f9607g.postAtFrontOfQueue(new Runnable() { // from class: Ta.j
            @Override // java.lang.Runnable
            public final void run() {
                k.M(k.this, z10, target, resource);
            }
        });
    }

    public final void N() {
        this.f9605e.setImageDrawable(null);
        this.f9606f.setImageDrawable(null);
        this.f9603c.p(this.f9608h);
        this.f9603c.p(this.f9609i);
    }

    public final void O(boolean z10) {
        m mVar;
        m mVar2;
        com.bumptech.glide.request.h hVar;
        B b10 = B.f9505a;
        AbstractC3901a.c("[" + b10.c() + "] " + ("rerenderIfNeeded(shouldRerenderBecauseOfResize=" + z10 + ")"));
        try {
            expo.modules.image.records.b bestSource = getBestSource();
            expo.modules.image.records.b bestPlaceholder = getBestPlaceholder();
            if (bestSource != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                mVar = bestSource.createGlideModelProvider(context);
            } else {
                mVar = null;
            }
            if (bestPlaceholder != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                mVar2 = bestPlaceholder.createGlideModelProvider(context2);
            } else {
                mVar2 = null;
            }
            if (!E(bestSource, mVar, mVar2)) {
                if (Intrinsics.b(mVar, this.f9600B) && !this.f9599A && ((mVar != null || mVar2 == null) && !z10)) {
                    if (this.f9601C) {
                        getActiveView().c();
                    }
                    this.f9601C = false;
                    this.f9602D = false;
                }
                F();
                this.f9599A = false;
                this.f9600B = mVar;
                if (bestSource != null) {
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    hVar = bestSource.createGlideOptions(context3);
                } else {
                    hVar = null;
                }
                com.bumptech.glide.request.h J10 = J();
                Object a10 = mVar != null ? mVar.a() : null;
                if (a10 instanceof Za.b) {
                    ((Za.b) a10).c(this.f9604d);
                }
                getOnLoadStart$expo_image_release().invoke(Unit.f36324a);
                t tVar = this.f9609i.t() ? this.f9608h : this.f9609i;
                tVar.w(mVar != null);
                r2.n I10 = I(tVar);
                com.bumptech.glide.k B02 = getRequestManager$expo_image_release().g().B0(a10);
                Intrinsics.checkNotNullExpressionValue(B02, "load(...)");
                if (bestPlaceholder != null && mVar2 != null) {
                    tVar.x(!bestPlaceholder.usesPlaceholderContentFit() ? getContentFit$expo_image_release() : getPlaceholderContentFit$expo_image_release());
                    com.bumptech.glide.k u10 = getRequestManager$expo_image_release().u(mVar2.a());
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    B02 = B02.H0(u10.a(bestPlaceholder.createGlideOptions(context4)));
                    Intrinsics.checkNotNullExpressionValue(B02, "thumbnail(...)");
                }
                com.bumptech.glide.k a11 = ((com.bumptech.glide.k) ((com.bumptech.glide.k) ((com.bumptech.glide.k) B02.l(I10)).n0(new Ya.a(new WeakReference(this))).m(100)).n(getDecodeFormat$expo_image_release().toGlideFormat())).a(J10);
                Intrinsics.checkNotNullExpressionValue(a11, "apply(...)");
                com.bumptech.glide.k a12 = l.a(a11, hVar);
                Integer tintColor$expo_image_release = getTintColor$expo_image_release();
                if (tintColor$expo_image_release != null) {
                    a12 = a12.a(new com.bumptech.glide.request.h().e0(C1199d.f9518a.a(), Integer.valueOf(tintColor$expo_image_release.intValue())));
                    Intrinsics.checkNotNullExpressionValue(a12, "apply(...)");
                }
                int b11 = b10.b();
                AbstractC3901a.a("[" + b10.c() + "] " + b10.a(), b11);
                tVar.v(b11);
                a12.v0(tVar);
                this.f9601C = false;
                this.f9602D = false;
            }
            Unit unit = Unit.f36324a;
            AbstractC3901a.f();
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }

    public final String getAccessibilityLabel$expo_image_release() {
        return this.f9620t;
    }

    public final boolean getAccessible$expo_image_release() {
        return this.f9619s;
    }

    public final boolean getAllowDownscaling$expo_image_release() {
        return this.f9622v;
    }

    public final boolean getAutoplay$expo_image_release() {
        return this.f9624x;
    }

    public final Integer getBlurRadius$expo_image_release() {
        return this.f9612l;
    }

    public final CachePolicy getCachePolicy$expo_image_release() {
        return this.f9626z;
    }

    public final ContentFit getContentFit$expo_image_release() {
        return this.f9614n;
    }

    public final ContentPosition getContentPosition$expo_image_release() {
        return this.f9616p;
    }

    public final DecodeFormat getDecodeFormat$expo_image_release() {
        return this.f9623w;
    }

    public final Ib.b getOnDisplay$expo_image_release() {
        return this.onDisplay$delegate.a(this, f9595F[4]);
    }

    public final Ib.b getOnError$expo_image_release() {
        return this.onError$delegate.a(this, f9595F[2]);
    }

    public final Ib.b getOnLoad$expo_image_release() {
        return this.onLoad$delegate.a(this, f9595F[3]);
    }

    public final Ib.b getOnLoadStart$expo_image_release() {
        return this.onLoadStart$delegate.a(this, f9595F[0]);
    }

    public final Ib.b getOnProgress$expo_image_release() {
        return this.onProgress$delegate.a(this, f9595F[1]);
    }

    public final ContentFit getPlaceholderContentFit$expo_image_release() {
        return this.f9615o;
    }

    public final List<expo.modules.image.records.b> getPlaceholders$expo_image_release() {
        return this.f9611k;
    }

    public final Priority getPriority$expo_image_release() {
        return this.f9625y;
    }

    public final String getRecyclingKey() {
        return this.f9621u;
    }

    public final com.bumptech.glide.l getRequestManager$expo_image_release() {
        return this.f9603c;
    }

    public final List<expo.modules.image.records.b> getSources$expo_image_release() {
        return this.f9610j;
    }

    public final Integer getTintColor$expo_image_release() {
        return this.f9617q;
    }

    public final ImageTransition getTransition$expo_image_release() {
        return this.f9613m;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        ContentFit contentFit;
        super.onSizeChanged(i10, i11, i12, i13);
        O((!this.f9622v || (contentFit = this.f9614n) == ContentFit.Fill || contentFit == ContentFit.None) ? false : true);
    }

    public final void setAccessibilityLabel$expo_image_release(String str) {
        this.f9620t = str;
        getActiveView().setContentDescription(this.f9620t);
    }

    public final void setAccessible$expo_image_release(boolean z10) {
        this.f9619s = z10;
        Q(getActiveView(), z10);
    }

    public final void setAllowDownscaling$expo_image_release(boolean z10) {
        this.f9622v = z10;
        this.f9599A = true;
    }

    public final void setAutoplay$expo_image_release(boolean z10) {
        this.f9624x = z10;
    }

    public final void setBlurRadius$expo_image_release(Integer num) {
        if (!Intrinsics.b(this.f9612l, num)) {
            this.f9599A = true;
        }
        this.f9612l = num;
    }

    public final void setCachePolicy$expo_image_release(CachePolicy cachePolicy) {
        Intrinsics.checkNotNullParameter(cachePolicy, "<set-?>");
        this.f9626z = cachePolicy;
    }

    public final void setContentFit$expo_image_release(ContentFit value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f9614n = value;
        getActiveView().setContentFit$expo_image_release(value);
        this.f9601C = true;
    }

    public final void setContentPosition$expo_image_release(ContentPosition value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f9616p = value;
        getActiveView().setContentPosition$expo_image_release(value);
        this.f9601C = true;
    }

    public final void setDecodeFormat$expo_image_release(DecodeFormat value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f9623w = value;
        this.f9599A = true;
    }

    public final void setFocusableProp$expo_image_release(boolean z10) {
        this.f9618r = z10;
        getActiveView().setFocusable(z10);
    }

    public final void setIsAnimating(boolean z10) {
        Object drawable = getActiveView().getDrawable();
        if (drawable instanceof Animatable) {
            if (z10) {
                ((Animatable) drawable).start();
            } else {
                ((Animatable) drawable).stop();
            }
        }
    }

    public final void setPlaceholderContentFit$expo_image_release(ContentFit value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f9615o = value;
        getActiveView().setPlaceholderContentFit$expo_image_release(value);
        this.f9601C = true;
    }

    public final void setPlaceholders$expo_image_release(List<? extends expo.modules.image.records.b> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f9611k = list;
    }

    public final void setPriority$expo_image_release(Priority priority) {
        Intrinsics.checkNotNullParameter(priority, "<set-?>");
        this.f9625y = priority;
    }

    public final void setRecyclingKey(String str) {
        String str2 = this.f9621u;
        this.f9602D = (str2 == null || str == null || Intrinsics.b(str, str2)) ? false : true;
        this.f9621u = str;
    }

    public final void setSources$expo_image_release(List<? extends expo.modules.image.records.b> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f9610j = list;
    }

    public final void setTintColor$expo_image_release(Integer num) {
        this.f9617q = num;
        if (getActiveView().getDrawable() instanceof C1372c) {
            this.f9599A = true;
        } else {
            getActiveView().setTintColor$expo_image_release(num);
        }
    }

    public final void setTransition$expo_image_release(ImageTransition imageTransition) {
        this.f9613m = imageTransition;
    }
}
