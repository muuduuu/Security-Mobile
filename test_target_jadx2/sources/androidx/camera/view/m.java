package androidx.camera.view;

import A.AbstractC0700h0;
import A.AbstractC0708l0;
import A.I0;
import A.L0;
import A.W;
import A.r0;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.H;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.camera.view.m;
import androidx.camera.view.n;
import androidx.core.view.AbstractC1484a0;
import androidx.lifecycle.AbstractC1604v;
import androidx.lifecycle.C1607y;
import f0.C3135a;
import h0.C3221a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class m extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    private static final c f14847o = c.PERFORMANCE;

    /* renamed from: a, reason: collision with root package name */
    c f14848a;

    /* renamed from: b, reason: collision with root package name */
    n f14849b;

    /* renamed from: c, reason: collision with root package name */
    final s f14850c;

    /* renamed from: d, reason: collision with root package name */
    final f f14851d;

    /* renamed from: e, reason: collision with root package name */
    boolean f14852e;

    /* renamed from: f, reason: collision with root package name */
    final C1607y f14853f;

    /* renamed from: g, reason: collision with root package name */
    final AtomicReference f14854g;

    /* renamed from: h, reason: collision with root package name */
    o f14855h;

    /* renamed from: i, reason: collision with root package name */
    private final C3135a f14856i;

    /* renamed from: j, reason: collision with root package name */
    G f14857j;

    /* renamed from: k, reason: collision with root package name */
    private MotionEvent f14858k;

    /* renamed from: l, reason: collision with root package name */
    private final b f14859l;

    /* renamed from: m, reason: collision with root package name */
    private final View.OnLayoutChangeListener f14860m;

    /* renamed from: n, reason: collision with root package name */
    final r0.c f14861n;

    class a implements r0.c {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(I0 i02) {
            m.this.f14861n.a(i02);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(H h10, I0 i02, I0.h hVar) {
            m mVar;
            n nVar;
            AbstractC0700h0.a("PreviewView", "Preview transformation info updated. " + hVar);
            m.this.f14851d.r(hVar, i02.p(), h10.q().i() == 0);
            if (hVar.d() == -1 || ((nVar = (mVar = m.this).f14849b) != null && (nVar instanceof w))) {
                m.this.f14852e = true;
            } else {
                mVar.f14852e = false;
            }
            m.this.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(androidx.camera.view.e eVar, H h10) {
            if (i.a(m.this.f14854g, eVar, null)) {
                eVar.l(e.IDLE);
            }
            eVar.f();
            h10.b().a(eVar);
        }

        @Override // A.r0.c
        public void a(final I0 i02) {
            n wVar;
            if (!E.q.c()) {
                androidx.core.content.a.h(m.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.a.this.e(i02);
                    }
                });
                return;
            }
            AbstractC0700h0.a("PreviewView", "Surface requested by Preview.");
            final H l10 = i02.l();
            m.this.f14857j = l10.q();
            m.this.f14855h.g(l10.h().g());
            i02.E(androidx.core.content.a.h(m.this.getContext()), new I0.i() { // from class: androidx.camera.view.k
                @Override // A.I0.i
                public final void a(I0.h hVar) {
                    m.a.this.f(l10, i02, hVar);
                }
            });
            m mVar = m.this;
            if (!m.f(mVar.f14849b, i02, mVar.f14848a)) {
                m mVar2 = m.this;
                if (m.g(i02, mVar2.f14848a)) {
                    m mVar3 = m.this;
                    wVar = new D(mVar3, mVar3.f14851d);
                } else {
                    m mVar4 = m.this;
                    wVar = new w(mVar4, mVar4.f14851d);
                }
                mVar2.f14849b = wVar;
            }
            G q10 = l10.q();
            m mVar5 = m.this;
            final androidx.camera.view.e eVar = new androidx.camera.view.e(q10, mVar5.f14853f, mVar5.f14849b);
            m.this.f14854g.set(eVar);
            l10.b().e(androidx.core.content.a.h(m.this.getContext()), eVar);
            m.this.f14849b.g(i02, new n.a() { // from class: androidx.camera.view.l
                @Override // androidx.camera.view.n.a
                public final void a() {
                    m.a.this.g(eVar, l10);
                }
            });
            m mVar6 = m.this;
            if (mVar6.indexOfChild(mVar6.f14850c) == -1) {
                m mVar7 = m.this;
                mVar7.addView(mVar7.f14850c);
            }
            m.this.getClass();
        }
    }

    class b implements DisplayManager.DisplayListener {
        b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            Display display = m.this.getDisplay();
            if (display == null || display.getDisplayId() != i10) {
                return;
            }
            m.this.e();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);

        private final int mId;

        c(int i10) {
            this.mId = i10;
        }

        static c fromId(int i10) {
            for (c cVar : values()) {
                if (cVar.mId == i10) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i10);
        }

        int getId() {
            return this.mId;
        }
    }

    public enum d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        private final int mId;

        d(int i10) {
            this.mId = i10;
        }

        static d fromId(int i10) {
            for (d dVar : values()) {
                if (dVar.mId == i10) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i10);
        }

        int getId() {
            return this.mId;
        }
    }

    public enum e {
        IDLE,
        STREAMING
    }

    public m(Context context) {
        this(context, null);
    }

    private void b(boolean z10) {
        E.q.a();
        getViewPort();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
            return;
        }
        e();
        b(true);
    }

    static boolean f(n nVar, I0 i02, c cVar) {
        return (nVar instanceof w) && !g(i02, cVar);
    }

    static boolean g(I0 i02, c cVar) {
        boolean equals = i02.l().q().k().equals("androidx.camera.camera2.legacy");
        boolean z10 = (androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewStretchedQuirk.class) == null && androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT <= 24 || equals || z10) {
            return true;
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private W.i getScreenFlashInternal() {
        return this.f14850c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (ordinal != 1) {
            i10 = 2;
            if (ordinal != 2) {
                i10 = 3;
                if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i10;
    }

    private void h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f14859l, new Handler(Looper.getMainLooper()));
    }

    private void i() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f14859l);
    }

    private void setScreenFlashUiInfo(W.i iVar) {
        AbstractC0700h0.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public L0 c(int i10) {
        E.q.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new L0.a(new Rational(getWidth(), getHeight()), i10).c(getViewPortScaleType()).b(getLayoutDirection()).a();
    }

    void e() {
        E.q.a();
        if (this.f14849b != null) {
            j();
            this.f14849b.h();
        }
        this.f14855h.f(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public Bitmap getBitmap() {
        E.q.a();
        n nVar = this.f14849b;
        if (nVar == null) {
            return null;
        }
        return nVar.a();
    }

    public AbstractC1475a getController() {
        E.q.a();
        return null;
    }

    public c getImplementationMode() {
        E.q.a();
        return this.f14848a;
    }

    public AbstractC0708l0 getMeteringPointFactory() {
        E.q.a();
        return this.f14855h;
    }

    public C3221a getOutputTransform() {
        Matrix matrix;
        E.q.a();
        try {
            matrix = this.f14851d.j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect i10 = this.f14851d.i();
        if (matrix == null || i10 == null) {
            AbstractC0700h0.a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrix.preConcat(E.r.b(i10));
        if (this.f14849b instanceof D) {
            matrix.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            AbstractC0700h0.l("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new C3221a(matrix, new Size(i10.width(), i10.height()));
    }

    public AbstractC1604v getPreviewStreamState() {
        return this.f14853f;
    }

    public d getScaleType() {
        E.q.a();
        return this.f14851d.g();
    }

    public W.i getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        E.q.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.f14851d.h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public r0.c getSurfaceProvider() {
        E.q.a();
        return this.f14861n;
    }

    public L0 getViewPort() {
        E.q.a();
        if (getDisplay() == null) {
            return null;
        }
        return c(getDisplay().getRotation());
    }

    void j() {
        Display display;
        G g10;
        if (!this.f14852e || (display = getDisplay()) == null || (g10 = this.f14857j) == null) {
            return;
        }
        this.f14851d.o(g10.m(display.getRotation()), display.getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
        addOnLayoutChangeListener(this.f14860m);
        n nVar = this.f14849b;
        if (nVar != null) {
            nVar.d();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f14860m);
        n nVar = this.f14849b;
        if (nVar != null) {
            nVar.e();
        }
        i();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f14858k = null;
        return super.performClick();
    }

    public void setController(AbstractC1475a abstractC1475a) {
        E.q.a();
        b(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(c cVar) {
        E.q.a();
        this.f14848a = cVar;
        c cVar2 = c.PERFORMANCE;
    }

    public void setScaleType(d dVar) {
        E.q.a();
        this.f14851d.q(dVar);
        e();
        b(false);
    }

    public void setScreenFlashOverlayColor(int i10) {
        this.f14850c.setBackgroundColor(i10);
    }

    public void setScreenFlashWindow(Window window) {
        E.q.a();
        this.f14850c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public m(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        c cVar = f14847o;
        this.f14848a = cVar;
        f fVar = new f();
        this.f14851d = fVar;
        this.f14852e = true;
        this.f14853f = new C1607y(e.IDLE);
        this.f14854g = new AtomicReference();
        this.f14855h = new o(fVar);
        this.f14859l = new b();
        this.f14860m = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                m.this.d(view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f14861n = new a();
        E.q.a();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.f14872a, i10, i11);
        AbstractC1484a0.o0(this, context, p.f14872a, attributeSet, obtainStyledAttributes, i10, i11);
        try {
            setScaleType(d.fromId(obtainStyledAttributes.getInteger(p.f14874c, fVar.g().getId())));
            setImplementationMode(c.fromId(obtainStyledAttributes.getInteger(p.f14873b, cVar.getId())));
            obtainStyledAttributes.recycle();
            this.f14856i = new C3135a(context, new C3135a.b() { // from class: androidx.camera.view.h
            });
            if (getBackground() == null) {
                setBackgroundColor(androidx.core.content.a.c(getContext(), R.color.black));
            }
            s sVar = new s(context);
            this.f14850c = sVar;
            sVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
