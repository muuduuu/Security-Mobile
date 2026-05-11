package com.swmansion.rnscreens;

import Y7.k;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1496g0;
import androidx.fragment.app.ComponentCallbacksC1573o;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.InterfaceC1952k0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.C2950u;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* loaded from: classes2.dex */
public final class r extends AbstractC2936f implements C2950u.a {

    /* renamed from: I, reason: collision with root package name */
    public static final b f29997I = new b(null);

    /* renamed from: A, reason: collision with root package name */
    private String f29998A;

    /* renamed from: B, reason: collision with root package name */
    private Boolean f29999B;

    /* renamed from: C, reason: collision with root package name */
    private Boolean f30000C;

    /* renamed from: D, reason: collision with root package name */
    private Integer f30001D;

    /* renamed from: E, reason: collision with root package name */
    private Integer f30002E;

    /* renamed from: F, reason: collision with root package name */
    private Boolean f30003F;

    /* renamed from: G, reason: collision with root package name */
    private Boolean f30004G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f30005H;

    /* renamed from: d, reason: collision with root package name */
    private final ReactContext f30006d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference f30007e;

    /* renamed from: f, reason: collision with root package name */
    private z f30008f;

    /* renamed from: g, reason: collision with root package name */
    private C2949t f30009g;

    /* renamed from: h, reason: collision with root package name */
    private a f30010h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30011i;

    /* renamed from: j, reason: collision with root package name */
    private e f30012j;

    /* renamed from: k, reason: collision with root package name */
    private c f30013k;

    /* renamed from: l, reason: collision with root package name */
    private d f30014l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f30015m;

    /* renamed from: n, reason: collision with root package name */
    private Integer f30016n;

    /* renamed from: o, reason: collision with root package name */
    private Boolean f30017o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f30018p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f30019q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f30020r;

    /* renamed from: s, reason: collision with root package name */
    private float f30021s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f30022t;

    /* renamed from: u, reason: collision with root package name */
    private List f30023u;

    /* renamed from: v, reason: collision with root package name */
    private int f30024v;

    /* renamed from: w, reason: collision with root package name */
    private int f30025w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f30026x;

    /* renamed from: y, reason: collision with root package name */
    private float f30027y;

    /* renamed from: z, reason: collision with root package name */
    private w f30028z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a INACTIVE = new a("INACTIVE", 0);
        public static final a TRANSITIONING_OR_BELOW_TOP = new a("TRANSITIONING_OR_BELOW_TOP", 1);
        public static final a ON_TOP = new a("ON_TOP", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{INACTIVE, TRANSITIONING_OR_BELOW_TOP, ON_TOP};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private a(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c PUSH = new c("PUSH", 0);
        public static final c POP = new c("POP", 1);

        private static final /* synthetic */ c[] $values() {
            return new c[]{PUSH, POP};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private c(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d DEFAULT = new d("DEFAULT", 0);
        public static final d NONE = new d("NONE", 1);
        public static final d FADE = new d("FADE", 2);
        public static final d SLIDE_FROM_BOTTOM = new d("SLIDE_FROM_BOTTOM", 3);
        public static final d SLIDE_FROM_RIGHT = new d("SLIDE_FROM_RIGHT", 4);
        public static final d SLIDE_FROM_LEFT = new d("SLIDE_FROM_LEFT", 5);
        public static final d FADE_FROM_BOTTOM = new d("FADE_FROM_BOTTOM", 6);
        public static final d IOS_FROM_RIGHT = new d("IOS_FROM_RIGHT", 7);
        public static final d IOS_FROM_LEFT = new d("IOS_FROM_LEFT", 8);

        private static final /* synthetic */ d[] $values() {
            return new d[]{DEFAULT, NONE, FADE, SLIDE_FROM_BOTTOM, SLIDE_FROM_RIGHT, SLIDE_FROM_LEFT, FADE_FROM_BOTTOM, IOS_FROM_RIGHT, IOS_FROM_LEFT};
        }

        static {
            d[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private d(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;
        public static final e PUSH = new e("PUSH", 0);
        public static final e MODAL = new e("MODAL", 1);
        public static final e TRANSPARENT_MODAL = new e("TRANSPARENT_MODAL", 2);
        public static final e FORM_SHEET = new e("FORM_SHEET", 3);

        private static final /* synthetic */ e[] $values() {
            return new e[]{PUSH, MODAL, TRANSPARENT_MODAL, FORM_SHEET};
        }

        static {
            e[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private e(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30029a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.TRANSPARENT_MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.FORM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30029a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class g {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ g[] $VALUES;
        public static final g ORIENTATION = new g("ORIENTATION", 0);
        public static final g COLOR = new g("COLOR", 1);
        public static final g STYLE = new g("STYLE", 2);
        public static final g TRANSLUCENT = new g("TRANSLUCENT", 3);
        public static final g HIDDEN = new g("HIDDEN", 4);
        public static final g ANIMATED = new g("ANIMATED", 5);
        public static final g NAVIGATION_BAR_COLOR = new g("NAVIGATION_BAR_COLOR", 6);
        public static final g NAVIGATION_BAR_TRANSLUCENT = new g("NAVIGATION_BAR_TRANSLUCENT", 7);
        public static final g NAVIGATION_BAR_HIDDEN = new g("NAVIGATION_BAR_HIDDEN", 8);

        private static final /* synthetic */ g[] $values() {
            return new g[]{ORIENTATION, COLOR, STYLE, TRANSLUCENT, HIDDEN, ANIMATED, NAVIGATION_BAR_COLOR, NAVIGATION_BAR_TRANSLUCENT, NAVIGATION_BAR_HIDDEN};
        }

        static {
            g[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private g(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f30006d = reactContext;
        this.f30007e = new WeakReference(null);
        this.f30012j = e.PUSH;
        this.f30013k = c.POP;
        this.f30014l = d.DEFAULT;
        this.f30015m = true;
        this.f30022t = true;
        this.f30023u = CollectionsKt.p(Double.valueOf(1.0d));
        this.f30024v = -1;
        this.f30026x = true;
        this.f30027y = 24.0f;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.f30005H = true;
    }

    private final boolean e(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && e((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    private final void m(int i10) {
        Context context = getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int e10 = L0.e(reactContext);
        EventDispatcher c10 = L0.c(reactContext, getId());
        if (c10 != null) {
            c10.c(new ha.d(e10, getId(), i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void s(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((viewGroup instanceof androidx.swiperefreshlayout.widget.c) && (childAt instanceof ImageView)) {
                    viewGroup.addView(new View(getContext()), i10);
                } else if (childAt != 0) {
                    Intrinsics.d(childAt);
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof F) {
                    s(((F) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    if ((childAt instanceof InterfaceC1952k0) && ((InterfaceC1952k0) childAt).getRemoveClippedSubviews() && !(childAt instanceof com.facebook.react.views.scroll.c) && !(childAt instanceof com.facebook.react.views.scroll.b)) {
                        try {
                            int childCount2 = ((ViewGroup) childAt).getChildCount();
                            for (int i11 = 0; i11 < childCount2; i11++) {
                                ((ViewGroup) childAt).addView(new View(getContext()));
                            }
                        } catch (Exception unused) {
                        }
                    }
                    s((ViewGroup) childAt);
                }
            }
        }
    }

    @Override // com.swmansion.rnscreens.C2950u.a
    public void a(boolean z10, int i10, int i11, int i12, int i13) {
        BottomSheetBehavior<r> sheetBehavior;
        int i14 = i13 - i11;
        if (this.f30023u.size() != 1 || ((Number) CollectionsKt.d0(this.f30023u)).doubleValue() != -1.0d || (sheetBehavior = getSheetBehavior()) == null || sheetBehavior.k0() == i14) {
            return;
        }
        sheetBehavior.D0(i14);
    }

    public final void d(int i10) {
        setImportantForAccessibility(i10);
        F headerConfig = getHeaderConfig();
        C2934d toolbar = headerConfig != null ? headerConfig.getToolbar() : null;
        if (toolbar == null) {
            return;
        }
        toolbar.setImportantForAccessibility(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public final boolean f() {
        return this.f30018p;
    }

    public final Boolean g() {
        return this.f30004G;
    }

    public final a getActivityState() {
        return this.f30010h;
    }

    public final C2949t getContainer() {
        return this.f30009g;
    }

    public final WeakReference<C2950u> getContentWrapper() {
        return this.f30007e;
    }

    public final w getFooter() {
        return this.f30028z;
    }

    public final ComponentCallbacksC1573o getFragment() {
        z zVar = this.f30008f;
        if (zVar != null) {
            return zVar.f();
        }
        return null;
    }

    public final z getFragmentWrapper() {
        return this.f30008f;
    }

    public final F getHeaderConfig() {
        Object obj;
        Iterator it = AbstractC1496g0.a(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((View) obj) instanceof F) {
                break;
            }
        }
        if (obj instanceof F) {
            return (F) obj;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.f30005H;
    }

    public final Integer getNavigationBarColor() {
        return this.f30002E;
    }

    public final ReactContext getReactContext() {
        return this.f30006d;
    }

    public final EventDispatcher getReactEventDispatcher() {
        return L0.c(this.f30006d, getId());
    }

    public final c getReplaceAnimation() {
        return this.f30013k;
    }

    public final Integer getScreenOrientation() {
        return this.f30016n;
    }

    public final BottomSheetBehavior<r> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        CoordinatorLayout.c f10 = fVar != null ? fVar.f() : null;
        if (f10 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) f10;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.f30026x;
    }

    public final float getSheetCornerRadius() {
        return this.f30021s;
    }

    public final List<Double> getSheetDetents() {
        return this.f30023u;
    }

    public final float getSheetElevation() {
        return this.f30027y;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.f30022t;
    }

    public final int getSheetInitialDetentIndex() {
        return this.f30025w;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.f30024v;
    }

    public final d getStackAnimation() {
        return this.f30014l;
    }

    public final e getStackPresentation() {
        return this.f30012j;
    }

    public final Integer getStatusBarColor() {
        return this.f30001D;
    }

    public final String getStatusBarStyle() {
        return this.f29998A;
    }

    public final Boolean h() {
        return this.f30003F;
    }

    public final Boolean i() {
        return this.f30017o;
    }

    public final Boolean j() {
        return this.f29999B;
    }

    public final Boolean k() {
        return this.f30000C;
    }

    public final boolean l() {
        int i10 = f.f30029a[this.f30012j.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public final void n(int i10, boolean z10) {
        int e10 = L0.e(this.f30006d);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.c(new ha.q(e10, getId(), i10, z10));
        }
    }

    public final void o() {
        if (this.f30020r) {
            this.f30020r = false;
            p();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if ((this.f30009g instanceof B) && z10) {
            b(i12 - i10, i13 - i11, i11);
            w wVar = this.f30028z;
            if (wVar != null) {
                C2949t c2949t = this.f30009g;
                Intrinsics.d(c2949t);
                wVar.E(z10, i10, i11, i12, i13, c2949t.getHeight());
            }
            m(i11);
        }
    }

    public final void p() {
        if (this.f30012j != e.FORM_SHEET || getBackground() == null) {
            return;
        }
        Drawable background = getBackground();
        Y7.g gVar = background instanceof Y7.g ? (Y7.g) background : null;
        if (gVar != null) {
            float e10 = C1944g0.e(this.f30021s);
            k.b bVar = new k.b();
            bVar.y(0, e10);
            bVar.D(0, e10);
            gVar.setShapeAppearanceModel(bVar.m());
        }
    }

    public final void q(C2950u wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        wrapper.setDelegate$react_native_screens_release(this);
        this.f30007e = new WeakReference(wrapper);
    }

    public final void r() {
        if (this.f30018p) {
            return;
        }
        this.f30018p = true;
        s(this);
    }

    public final void setActivityState(a activityState) {
        Intrinsics.checkNotNullParameter(activityState, "activityState");
        a aVar = this.f30010h;
        if (activityState == aVar) {
            return;
        }
        if ((this.f30009g instanceof B) && aVar != null) {
            Intrinsics.d(aVar);
            if (activityState.compareTo(aVar) < 0) {
                throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
            }
        }
        this.f30010h = activityState;
        C2949t c2949t = this.f30009g;
        if (c2949t != null) {
            c2949t.o();
        }
    }

    public final void setBeingRemoved(boolean z10) {
        this.f30018p = z10;
    }

    public final void setContainer(C2949t c2949t) {
        this.f30009g = c2949t;
    }

    public final void setContentWrapper(WeakReference<C2950u> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f30007e = weakReference;
    }

    public final void setFooter(w wVar) {
        BottomSheetBehavior<r> sheetBehavior;
        if (wVar == null && this.f30028z != null) {
            BottomSheetBehavior<r> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                w wVar2 = this.f30028z;
                Intrinsics.d(wVar2);
                wVar2.K(sheetBehavior2);
            }
        } else if (wVar != null && (sheetBehavior = getSheetBehavior()) != null) {
            wVar.F(sheetBehavior);
        }
        this.f30028z = wVar;
    }

    public final void setFragmentWrapper(z zVar) {
        this.f30008f = zVar;
    }

    public final void setGestureEnabled(boolean z10) {
        this.f30015m = z10;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z10) {
        this.f30005H = z10;
    }

    public final void setNavigationBarColor(Integer num) {
        if (num != null) {
            L.f29898a.e();
        }
        this.f30002E = num;
        z zVar = this.f30008f;
        if (zVar != null) {
            L.f29898a.q(this, zVar.e());
        }
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            L.f29898a.e();
        }
        this.f30004G = bool;
        z zVar = this.f30008f;
        if (zVar != null) {
            L.f29898a.r(this, zVar.e());
        }
    }

    public final void setNavigationBarTranslucent(Boolean bool) {
        if (bool != null) {
            L.f29898a.e();
        }
        this.f30003F = bool;
        z zVar = this.f30008f;
        if (zVar != null) {
            L.f29898a.s(this, zVar.e());
        }
    }

    public final void setReplaceAnimation(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f30013k = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void setScreenOrientation(String str) {
        int i10;
        if (str == null) {
            this.f30016n = null;
            return;
        }
        L l10 = L.f29898a;
        l10.f();
        switch (str.hashCode()) {
            case -1894896954:
                if (str.equals("portrait_down")) {
                    i10 = 9;
                    break;
                }
                i10 = -1;
                break;
            case 96673:
                if (str.equals("all")) {
                    i10 = 10;
                    break;
                }
                i10 = -1;
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    i10 = 7;
                    break;
                }
                i10 = -1;
                break;
            case 1430647483:
                if (str.equals("landscape")) {
                    i10 = 6;
                    break;
                }
                i10 = -1;
                break;
            case 1651658175:
                if (str.equals("portrait_up")) {
                    i10 = 1;
                    break;
                }
                i10 = -1;
                break;
            case 1730732811:
                if (str.equals("landscape_left")) {
                    i10 = 8;
                    break;
                }
                i10 = -1;
                break;
            case 2118770584:
                if (str.equals("landscape_right")) {
                    i10 = 0;
                    break;
                }
                i10 = -1;
                break;
            default:
                i10 = -1;
                break;
        }
        this.f30016n = i10;
        z zVar = this.f30008f;
        if (zVar != null) {
            l10.t(this, zVar.e());
        }
    }

    public final void setSheetClosesOnTouchOutside(boolean z10) {
        this.f30026x = z10;
    }

    public final void setSheetCornerRadius(float f10) {
        if (this.f30021s == f10) {
            return;
        }
        this.f30021s = f10;
        this.f30020r = true;
    }

    public final void setSheetDetents(List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f30023u = list;
    }

    public final void setSheetElevation(float f10) {
        this.f30027y = f10;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z10) {
        this.f30022t = z10;
    }

    public final void setSheetGrabberVisible(boolean z10) {
        this.f30019q = z10;
    }

    public final void setSheetInitialDetentIndex(int i10) {
        this.f30025w = i10;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i10) {
        this.f30024v = i10;
    }

    public final void setStackAnimation(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f30014l = dVar;
    }

    public final void setStackPresentation(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f30012j = eVar;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.f30017o = bool;
    }

    public final void setStatusBarColor(Integer num) {
        if (num != null) {
            L.f29898a.g();
        }
        this.f30001D = num;
        z zVar = this.f30008f;
        if (zVar != null) {
            L.f29898a.m(this, zVar.e(), zVar.k());
        }
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            L.f29898a.g();
        }
        this.f29999B = bool;
        z zVar = this.f30008f;
        if (zVar != null) {
            L.f29898a.o(this, zVar.e());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            L.f29898a.g();
        }
        this.f29998A = str;
        z zVar = this.f30008f;
        if (zVar != null) {
            L.f29898a.v(this, zVar.e(), zVar.k());
        }
    }

    public final void setStatusBarTranslucent(Boolean bool) {
        if (bool != null) {
            L.f29898a.g();
        }
        this.f30000C = bool;
        z zVar = this.f30008f;
        if (zVar != null) {
            L.f29898a.w(this, zVar.e(), zVar.k());
        }
    }

    public final void setTransitioning(boolean z10) {
        if (this.f30011i == z10) {
            return;
        }
        this.f30011i = z10;
        boolean e10 = e(this);
        if (!e10 || getLayerType() == 2) {
            super.setLayerType((!z10 || e10) ? 0 : 2, null);
        }
    }
}
