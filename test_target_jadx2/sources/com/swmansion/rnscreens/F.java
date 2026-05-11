package com.swmansion.rnscreens;

import android.R;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC1397a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ComponentCallbacksC1573o;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.H;
import ha.C3301a;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class F extends AbstractC2935e {

    /* renamed from: A, reason: collision with root package name */
    public static final a f29864A = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f29865e;

    /* renamed from: f, reason: collision with root package name */
    private final C2934d f29866f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29867g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29868h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f29869i;

    /* renamed from: j, reason: collision with root package name */
    private String f29870j;

    /* renamed from: k, reason: collision with root package name */
    private int f29871k;

    /* renamed from: l, reason: collision with root package name */
    private String f29872l;

    /* renamed from: m, reason: collision with root package name */
    private String f29873m;

    /* renamed from: n, reason: collision with root package name */
    private float f29874n;

    /* renamed from: o, reason: collision with root package name */
    private int f29875o;

    /* renamed from: p, reason: collision with root package name */
    private Integer f29876p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f29877q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f29878r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f29879s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f29880t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f29881u;

    /* renamed from: v, reason: collision with root package name */
    private int f29882v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f29883w;

    /* renamed from: x, reason: collision with root package name */
    private final int f29884x;

    /* renamed from: y, reason: collision with root package name */
    private final int f29885y;

    /* renamed from: z, reason: collision with root package name */
    private final View.OnClickListener f29886z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextView a(Toolbar toolbar) {
            Intrinsics.checkNotNullParameter(toolbar, "toolbar");
            int childCount = toolbar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = toolbar.getChildAt(i10);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (Intrinsics.b(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29887a;

        static {
            int[] iArr = new int[H.a.values().length];
            try {
                iArr[H.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29887a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29865e = new ArrayList(3);
        this.f29881u = true;
        this.f29886z = new View.OnClickListener() { // from class: com.swmansion.rnscreens.E
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F.e(F.this, view);
            }
        };
        setVisibility(8);
        C2934d c2934d = new C2934d(context, this);
        this.f29866f = c2934d;
        this.f29884x = c2934d.getContentInsetStart();
        this.f29885y = c2934d.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            c2934d.setBackgroundColor(typedValue.data);
        }
        c2934d.setClipChildren(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(F this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C screenFragment = this$0.getScreenFragment();
        if (screenFragment != null) {
            B screenStack = this$0.getScreenStack();
            if (screenStack == null || !Intrinsics.b(screenStack.getRootScreen(), screenFragment.m())) {
                if (screenFragment.m().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.Y();
                    return;
                } else {
                    screenFragment.G();
                    return;
                }
            }
            ComponentCallbacksC1573o parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof C) {
                C c10 = (C) parentFragment;
                if (c10.m().getNativeBackButtonDismissalEnabled()) {
                    c10.Y();
                } else {
                    c10.G();
                }
            }
        }
    }

    private final r getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof r) {
            return (r) parent;
        }
        return null;
    }

    private final B getScreenStack() {
        r screen = getScreen();
        C2949t container = screen != null ? screen.getContainer() : null;
        if (container instanceof B) {
            return (B) container;
        }
        return null;
    }

    private final void i() {
        r screen;
        if (getParent() == null || this.f29879s || (screen = getScreen()) == null || screen.f()) {
            return;
        }
        j();
    }

    public final void d(H child, int i10) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.f29865e.add(i10, child);
        i();
    }

    public final void f() {
        this.f29879s = true;
    }

    public final H g(int i10) {
        Object obj = this.f29865e.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (H) obj;
    }

    public final int getConfigSubviewsCount() {
        return this.f29865e.size();
    }

    public final C getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof r)) {
            return null;
        }
        ComponentCallbacksC1573o fragment = ((r) parent).getFragment();
        if (fragment instanceof C) {
            return (C) fragment;
        }
        return null;
    }

    public final C2934d getToolbar() {
        return this.f29866f;
    }

    public final boolean h() {
        return this.f29867g;
    }

    public final void j() {
        Drawable navigationIcon;
        C screenFragment;
        C screenFragment2;
        ReactContext k10;
        B screenStack = getScreenStack();
        boolean z10 = screenStack == null || Intrinsics.b(screenStack.getTopScreen(), getParent());
        if (this.f29883w && z10 && !this.f29879s) {
            C screenFragment3 = getScreenFragment();
            androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) (screenFragment3 != null ? screenFragment3.getActivity() : null);
            if (dVar == null) {
                return;
            }
            String str = this.f29873m;
            if (str != null) {
                if (Intrinsics.b(str, "rtl")) {
                    this.f29866f.setLayoutDirection(1);
                } else if (Intrinsics.b(this.f29873m, "ltr")) {
                    this.f29866f.setLayoutDirection(0);
                }
            }
            r screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    k10 = (ReactContext) context;
                } else {
                    z fragmentWrapper = screen.getFragmentWrapper();
                    k10 = fragmentWrapper != null ? fragmentWrapper.k() : null;
                }
                L.f29898a.x(screen, dVar, k10);
            }
            if (this.f29867g) {
                if (this.f29866f.getParent() == null || (screenFragment2 = getScreenFragment()) == null) {
                    return;
                }
                screenFragment2.e0();
                return;
            }
            if (this.f29866f.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                screenFragment.h0(this.f29866f);
            }
            if (this.f29881u) {
                Integer num = this.f29869i;
                this.f29866f.setPadding(0, num != null ? num.intValue() : 0, 0, 0);
            } else if (this.f29866f.getPaddingTop() > 0) {
                this.f29866f.setPadding(0, 0, 0, 0);
            }
            dVar.setSupportActionBar(this.f29866f);
            AbstractC1397a supportActionBar = dVar.getSupportActionBar();
            if (supportActionBar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Intrinsics.checkNotNullExpressionValue(supportActionBar, "requireNotNull(...)");
            this.f29866f.setContentInsetStartWithNavigation(this.f29885y);
            C2934d c2934d = this.f29866f;
            int i10 = this.f29884x;
            c2934d.J(i10, i10);
            C screenFragment4 = getScreenFragment();
            supportActionBar.s((screenFragment4 == null || !screenFragment4.U() || this.f29877q) ? false : true);
            this.f29866f.setNavigationOnClickListener(this.f29886z);
            C screenFragment5 = getScreenFragment();
            if (screenFragment5 != null) {
                screenFragment5.i0(this.f29878r);
            }
            C screenFragment6 = getScreenFragment();
            if (screenFragment6 != null) {
                screenFragment6.j0(this.f29868h);
            }
            supportActionBar.v(this.f29870j);
            if (TextUtils.isEmpty(this.f29870j)) {
                this.f29866f.setContentInsetStartWithNavigation(0);
            }
            TextView a10 = f29864A.a(this.f29866f);
            int i11 = this.f29871k;
            if (i11 != 0) {
                this.f29866f.setTitleTextColor(i11);
            }
            if (a10 != null) {
                String str2 = this.f29872l;
                if (str2 != null || this.f29875o > 0) {
                    Typeface a11 = com.facebook.react.views.text.o.a(null, 0, this.f29875o, str2, getContext().getAssets());
                    Intrinsics.checkNotNullExpressionValue(a11, "applyStyles(...)");
                    a10.setTypeface(a11);
                }
                float f10 = this.f29874n;
                if (f10 > 0.0f) {
                    a10.setTextSize(f10);
                }
            }
            Integer num2 = this.f29876p;
            if (num2 != null) {
                this.f29866f.setBackgroundColor(num2.intValue());
            }
            if (this.f29882v != 0 && (navigationIcon = this.f29866f.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.f29882v, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount = this.f29866f.getChildCount() - 1; -1 < childCount; childCount--) {
                if (this.f29866f.getChildAt(childCount) instanceof H) {
                    this.f29866f.removeViewAt(childCount);
                }
            }
            int size = this.f29865e.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = this.f29865e.get(i12);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                H h10 = (H) obj;
                H.a type = h10.getType();
                if (type == H.a.BACK) {
                    View childAt = h10.getChildAt(0);
                    ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                    if (imageView == null) {
                        throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                    }
                    supportActionBar.t(imageView.getDrawable());
                } else {
                    Toolbar.g gVar = new Toolbar.g(-2, -1);
                    int i13 = b.f29887a[type.ordinal()];
                    if (i13 == 1) {
                        if (!this.f29880t) {
                            this.f29866f.setNavigationIcon((Drawable) null);
                        }
                        this.f29866f.setTitle((CharSequence) null);
                        gVar.f13148a = 8388611;
                    } else if (i13 == 2) {
                        gVar.f13148a = 8388613;
                    } else if (i13 == 3) {
                        ((ViewGroup.MarginLayoutParams) gVar).width = -1;
                        gVar.f13148a = 1;
                        this.f29866f.setTitle((CharSequence) null);
                    }
                    h10.setLayoutParams(gVar);
                    this.f29866f.addView(h10);
                }
            }
        }
    }

    public final void k() {
        this.f29865e.clear();
        i();
    }

    public final void l(int i10) {
        this.f29865e.remove(i10);
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Integer valueOf;
        int systemBars;
        Insets insets;
        int i10;
        super.onAttachedToWindow();
        this.f29883w = true;
        int f10 = L0.f(this);
        Context context = getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher c10 = L0.c((ReactContext) context, getId());
        if (c10 != null) {
            c10.c(new C3301a(f10, getId()));
        }
        if (this.f29869i == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowInsets rootWindowInsets = getRootWindowInsets();
                systemBars = WindowInsets.Type.systemBars();
                insets = rootWindowInsets.getInsets(systemBars);
                i10 = insets.top;
                valueOf = Integer.valueOf(i10);
            } else {
                valueOf = Integer.valueOf(getRootWindowInsets().getSystemWindowInsetTop());
            }
            this.f29869i = valueOf;
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29883w = false;
        int f10 = L0.f(this);
        Context context = getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher c10 = L0.c((ReactContext) context, getId());
        if (c10 != null) {
            c10.c(new ha.c(f10, getId()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setBackButtonInCustomView(boolean z10) {
        this.f29880t = z10;
    }

    public final void setBackgroundColor(Integer num) {
        this.f29876p = num;
    }

    public final void setDirection(String str) {
        this.f29873m = str;
    }

    public final void setHeaderHidden(boolean z10) {
        this.f29867g = z10;
    }

    public final void setHeaderTranslucent(boolean z10) {
        this.f29868h = z10;
    }

    public final void setHidden(boolean z10) {
        this.f29867g = z10;
    }

    public final void setHideBackButton(boolean z10) {
        this.f29877q = z10;
    }

    public final void setHideShadow(boolean z10) {
        this.f29878r = z10;
    }

    public final void setTintColor(int i10) {
        this.f29882v = i10;
    }

    public final void setTitle(String str) {
        this.f29870j = str;
    }

    public final void setTitleColor(int i10) {
        this.f29871k = i10;
    }

    public final void setTitleFontFamily(String str) {
        this.f29872l = str;
    }

    public final void setTitleFontSize(float f10) {
        this.f29874n = f10;
    }

    public final void setTitleFontWeight(String str) {
        this.f29875o = com.facebook.react.views.text.o.d(str);
    }

    public final void setTopInsetEnabled(boolean z10) {
        this.f29881u = z10;
    }

    public final void setTranslucent(boolean z10) {
        this.f29868h = z10;
    }
}
