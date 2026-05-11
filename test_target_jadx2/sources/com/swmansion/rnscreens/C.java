package com.swmansion.rnscreens;

import Y7.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.K0;
import androidx.fragment.app.ComponentCallbacksC1573o;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.EnumC1946h0;
import com.facebook.react.uimanager.InterfaceC1964q0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.H;
import com.swmansion.rnscreens.r;
import ga.AbstractC3208a;
import ga.C3214g;
import ia.AbstractC3361b;
import ja.C3520a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002jn\u0018\u00002\u00020\u00012\u00020\u0002:\u0002vwB\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0007J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0007J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0007J)\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J+\u00101\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J-\u00107\u001a\b\u0012\u0004\u0012\u00020\u0003032\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u0003032\b\b\u0002\u00106\u001a\u000205H\u0000¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020\u000303H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010\u0007J\u0017\u0010<\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b<\u0010\u0015J\u001f\u0010>\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010,\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u000fH\u0016¢\u0006\u0004\b@\u0010\u0011J\u000f\u0010A\u001a\u00020\bH\u0016¢\u0006\u0004\bA\u0010\u0007R$\u0010I\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\u0017R\u0016\u0010S\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010\u0017R\u0018\u0010V\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR$\u0010^\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R0\u0010f\u001a\u0010\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0016\u0010i\u001a\u00020g8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006x"}, d2 = {"Lcom/swmansion/rnscreens/C;", "Lcom/swmansion/rnscreens/y;", "Lcom/swmansion/rnscreens/D;", "Lcom/swmansion/rnscreens/r;", "screenView", "<init>", "(Lcom/swmansion/rnscreens/r;)V", "()V", BuildConfig.FLAVOR, "d0", BuildConfig.FLAVOR, "l0", "()Ljava/lang/Integer;", "screen", "T", BuildConfig.FLAVOR, "k0", "()Z", "Landroid/view/Menu;", "menu", "m0", "(Landroid/view/Menu;)V", "Landroid/view/View;", "Z", "()Landroid/view/View;", "e0", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "h0", "(Landroidx/appcompat/widget/Toolbar;)V", "hidden", "i0", "(Z)V", "translucent", "j0", "s", "P", "transit", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "(IZI)Landroid/view/animation/Animation;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "Lcom/swmansion/rnscreens/l;", "keyboardState", "V", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/swmansion/rnscreens/l;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "X", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "onStop", "onPrepareOptionsMenu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "U", "Y", "Lcom/swmansion/rnscreens/n;", "i", "Lcom/swmansion/rnscreens/n;", "a0", "()Lcom/swmansion/rnscreens/n;", "f0", "(Lcom/swmansion/rnscreens/n;)V", "nativeDismissalObserver", "Lcom/google/android/material/appbar/AppBarLayout;", "j", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "k", "Landroidx/appcompat/widget/Toolbar;", "l", "isToolbarShadowHidden", "o", "isToolbarTranslucent", "p", "Landroid/view/View;", "lastFocusedChild", "Lcom/swmansion/rnscreens/c;", "q", "Lcom/swmansion/rnscreens/c;", "c0", "()Lcom/swmansion/rnscreens/c;", "setSearchView", "(Lcom/swmansion/rnscreens/c;)V", "searchView", "Lkotlin/Function1;", "r", "Lkotlin/jvm/functions/Function1;", "getOnSearchViewCreate", "()Lkotlin/jvm/functions/Function1;", "g0", "(Lkotlin/jvm/functions/Function1;)V", "onSearchViewCreate", "Lcom/swmansion/rnscreens/C$b;", "Lcom/swmansion/rnscreens/C$b;", "coordinatorLayout", "com/swmansion/rnscreens/C$c", "t", "Lcom/swmansion/rnscreens/C$c;", "bottomSheetStateCallback", "com/swmansion/rnscreens/C$d", "u", "Lcom/swmansion/rnscreens/C$d;", "keyboardSheetCallback", "Lcom/swmansion/rnscreens/B;", "b0", "()Lcom/swmansion/rnscreens/B;", "screenStack", C4870a.f43493a, "b", "react-native-screens_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class C extends y implements D {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private InterfaceC2944n nativeDismissalObserver;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private AppBarLayout appBarLayout;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Toolbar toolbar;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean isToolbarShadowHidden;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isToolbarTranslucent;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private View lastFocusedChild;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private C2933c searchView;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Function1 onSearchViewCreate;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private b coordinatorLayout;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final c bottomSheetStateCallback;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final d keyboardSheetCallback;

    private static final class a extends Animation {

        /* renamed from: a, reason: collision with root package name */
        private final y f29856a;

        public a(y mFragment) {
            Intrinsics.checkNotNullParameter(mFragment, "mFragment");
            this.f29856a = mFragment;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f10, Transformation t10) {
            Intrinsics.checkNotNullParameter(t10, "t");
            super.applyTransformation(f10, t10);
            this.f29856a.M(f10, !r3.isResumed());
        }
    }

    private static final class b extends CoordinatorLayout implements InterfaceC1964q0 {

        /* renamed from: y, reason: collision with root package name */
        private final C f29857y;

        /* renamed from: z, reason: collision with root package name */
        private final Animation.AnimationListener f29858z;

        public static final class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                b.this.f29857y.P();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                b.this.f29857y.Q();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, C fragment) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f29857y = fragment;
            this.f29858z = new a();
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }

        @Override // com.facebook.react.uimanager.InterfaceC1964q0
        public EnumC1946h0 getPointerEvents() {
            return EnumC1946h0.BOX_NONE;
        }

        @Override // android.view.View
        public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
            WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
            Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "onApplyWindowInsets(...)");
            return onApplyWindowInsets;
        }

        @Override // android.view.View
        public void startAnimation(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            a aVar = new a(this.f29857y);
            aVar.setDuration(animation.getDuration());
            if ((animation instanceof AnimationSet) && !this.f29857y.isRemoving()) {
                AnimationSet animationSet = (AnimationSet) animation;
                animationSet.addAnimation(aVar);
                animationSet.setAnimationListener(this.f29858z);
                super.startAnimation(animationSet);
                return;
            }
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.addAnimation(animation);
            animationSet2.addAnimation(aVar);
            animationSet2.setAnimationListener(this.f29858z);
            super.startAnimation(animationSet2);
        }
    }

    public static final class c extends BottomSheetBehavior.f {

        /* renamed from: a, reason: collision with root package name */
        private int f29860a;

        c() {
            this.f29860a = C3214g.f33640a.c(C.this.m().getSheetInitialDetentIndex(), C.this.m().getSheetDetents().size());
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            InterfaceC2944n nativeDismissalObserver;
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            C3214g c3214g = C3214g.f33640a;
            if (c3214g.b(i10)) {
                this.f29860a = i10;
                C.this.m().n(c3214g.a(this.f29860a, C.this.m().getSheetDetents().size()), true);
            } else if (i10 == 1) {
                C.this.m().n(c3214g.a(this.f29860a, C.this.m().getSheetDetents().size()), false);
            }
            if (i10 != 5 || (nativeDismissalObserver = C.this.getNativeDismissalObserver()) == null) {
                return;
            }
            nativeDismissalObserver.n(C.this);
        }
    }

    public static final class d extends BottomSheetBehavior.f {
        d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i10 == 4 && K0.w(bottomSheet.getRootWindowInsets()).p(K0.m.b())) {
                bottomSheet.requestFocus();
                ((InputMethodManager) C.this.requireContext().getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(bottomSheet.getWindowToken(), 0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(r screenView) {
        super(screenView);
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        this.bottomSheetStateCallback = new c();
        this.keyboardSheetCallback = new d();
    }

    private final void T(r screen) {
        ColorStateList E10;
        float g10 = C1944g0.g(screen.getSheetCornerRadius());
        k.b bVar = new k.b();
        bVar.y(0, g10);
        bVar.D(0, g10);
        Y7.k m10 = bVar.m();
        Intrinsics.checkNotNullExpressionValue(m10, "build(...)");
        Y7.g gVar = new Y7.g(m10);
        Drawable background = screen.getBackground();
        Integer num = null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            num = Integer.valueOf(colorDrawable.getColor());
        } else {
            Drawable background2 = screen.getBackground();
            Y7.g gVar2 = background2 instanceof Y7.g ? (Y7.g) background2 : null;
            if (gVar2 != null && (E10 = gVar2.E()) != null) {
                num = Integer.valueOf(E10.getDefaultColor());
            }
        }
        gVar.setTint(num != null ? num.intValue() : 0);
        screen.setBackground(gVar);
    }

    public static /* synthetic */ BottomSheetBehavior W(C c10, BottomSheetBehavior bottomSheetBehavior, AbstractC2942l abstractC2942l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC2942l = C2941k.f29967a;
        }
        return c10.V(bottomSheetBehavior, abstractC2942l);
    }

    private final View Z() {
        View m10 = m();
        while (m10 != null) {
            if (m10.isFocused()) {
                return m10;
            }
            m10 = m10 instanceof ViewGroup ? ((ViewGroup) m10).getFocusedChild() : null;
        }
        return null;
    }

    private final B b0() {
        C2949t container = m().getContainer();
        if (container instanceof B) {
            return (B) container;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
    }

    private final void d0() {
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof B) {
            ((B) parent).I();
        }
    }

    private final boolean k0() {
        F headerConfig = m().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig != null && configSubviewsCount > 0) {
            for (int i10 = 0; i10 < configSubviewsCount; i10++) {
                if (headerConfig.g(i10).getType() == H.a.SEARCH_BAR) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r0 = r0.getCurrentWindowMetrics();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r0 = r0.getBounds();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Integer l0() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Resources resources;
        DisplayMetrics displayMetrics;
        if (m().getContainer() != null) {
            return Integer.valueOf(b0().getHeight());
        }
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return Integer.valueOf(displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Context context2 = getContext();
            Object systemService = context2 != null ? context2.getSystemService("window") : null;
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null && currentWindowMetrics != null && bounds != null) {
                return Integer.valueOf(bounds.height());
            }
        }
        return null;
    }

    private final void m0(Menu menu) {
        menu.clear();
        if (k0()) {
            Context context = getContext();
            if (this.searchView == null && context != null) {
                C2933c c2933c = new C2933c(context, this);
                this.searchView = c2933c;
                Function1 function1 = this.onSearchViewCreate;
                if (function1 != null) {
                    function1.invoke(c2933c);
                }
            }
            MenuItem add = menu.add(BuildConfig.FLAVOR);
            add.setShowAsAction(2);
            add.setActionView(this.searchView);
        }
    }

    @Override // com.swmansion.rnscreens.y
    public void P() {
        super.P();
        d0();
    }

    public boolean U() {
        C2949t container = m().getContainer();
        if (!(container instanceof B)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        if (!Intrinsics.b(((B) container).getRootScreen(), m())) {
            return true;
        }
        ComponentCallbacksC1573o parentFragment = getParentFragment();
        if (parentFragment instanceof C) {
            return ((C) parentFragment).U();
        }
        return false;
    }

    public final BottomSheetBehavior V(BottomSheetBehavior behavior, AbstractC2942l keyboardState) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(keyboardState, "keyboardState");
        if (l0() == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        behavior.C0(true);
        behavior.x0(true);
        behavior.W(this.bottomSheetStateCallback);
        w footer = m().getFooter();
        if (footer != null) {
            footer.F(behavior);
        }
        if (keyboardState instanceof C2941k) {
            int size = m().getSheetDetents().size();
            if (size != 1) {
                if (size == 2) {
                    return AbstractC3208a.e(behavior, Integer.valueOf(C3214g.f33640a.c(m().getSheetInitialDetentIndex(), m().getSheetDetents().size())), Integer.valueOf((int) (m().getSheetDetents().get(0).doubleValue() * r1.intValue())), Integer.valueOf((int) (m().getSheetDetents().get(1).doubleValue() * r1.intValue())));
                }
                if (size == 3) {
                    return AbstractC3208a.c(behavior, Integer.valueOf(C3214g.f33640a.c(m().getSheetInitialDetentIndex(), m().getSheetDetents().size())), Integer.valueOf((int) (m().getSheetDetents().get(0).doubleValue() * r1.intValue())), Float.valueOf((float) (m().getSheetDetents().get(1).doubleValue() / m().getSheetDetents().get(2).doubleValue())), Integer.valueOf((int) ((1 - m().getSheetDetents().get(2).doubleValue()) * r1.intValue())));
                }
                throw new IllegalStateException("[RNScreens] Invalid detent count " + m().getSheetDetents().size() + ". Expected at most 3.");
            }
            if (ga.h.a(m())) {
                C2950u c2950u = m().getContentWrapper().get();
                valueOf = c2950u != null ? Integer.valueOf(c2950u.getHeight()) : null;
            } else {
                valueOf = Integer.valueOf((int) (((Number) CollectionsKt.d0(m().getSheetDetents())).doubleValue() * r1.intValue()));
            }
            AbstractC3208a.b(behavior, valueOf, false, 2, null);
        } else {
            if (!(keyboardState instanceof C2943m)) {
                if (!(keyboardState instanceof C2940j)) {
                    throw new lc.m();
                }
                behavior.s0(this.keyboardSheetCallback);
                int size2 = m().getSheetDetents().size();
                if (size2 == 1) {
                    return AbstractC3208a.a(behavior, Integer.valueOf((int) (((Number) CollectionsKt.d0(m().getSheetDetents())).doubleValue() * r1.intValue())), false);
                }
                if (size2 == 2) {
                    return AbstractC3208a.f(behavior, null, Integer.valueOf((int) (m().getSheetDetents().get(0).doubleValue() * r1.intValue())), Integer.valueOf((int) (m().getSheetDetents().get(1).doubleValue() * r1.intValue())), 1, null);
                }
                if (size2 == 3) {
                    return AbstractC3208a.d(behavior, null, Integer.valueOf((int) (m().getSheetDetents().get(0).doubleValue() * r1.intValue())), Float.valueOf((float) (m().getSheetDetents().get(1).doubleValue() / m().getSheetDetents().get(2).doubleValue())), Integer.valueOf((int) ((1 - m().getSheetDetents().get(2).doubleValue()) * r1.intValue())), 1, null);
                }
                throw new IllegalStateException("[RNScreens] Invalid detent count " + m().getSheetDetents().size() + ". Expected at most 3.");
            }
            C2943m c2943m = (C2943m) keyboardState;
            int k02 = behavior.k0() - c2943m.a() > 1 ? behavior.k0() - c2943m.a() : behavior.k0();
            int size3 = m().getSheetDetents().size();
            if (size3 == 1) {
                AbstractC3208a.b(behavior, Integer.valueOf(k02), false, 2, null);
                behavior.W(this.keyboardSheetCallback);
            } else if (size3 == 2) {
                AbstractC3208a.f(behavior, 3, null, Integer.valueOf(k02), 2, null);
                behavior.W(this.keyboardSheetCallback);
            } else {
                if (size3 != 3) {
                    throw new IllegalStateException("[RNScreens] Invalid detent count " + m().getSheetDetents().size() + ". Expected at most 3.");
                }
                AbstractC3208a.d(behavior, 3, null, null, null, 14, null);
                behavior.D0(k02);
                behavior.W(this.keyboardSheetCallback);
            }
        }
        return behavior;
    }

    public final BottomSheetBehavior X() {
        return W(this, new BottomSheetBehavior(), null, 2, null);
    }

    public void Y() {
        b0().D(this);
    }

    /* renamed from: a0, reason: from getter */
    public final InterfaceC2944n getNativeDismissalObserver() {
        return this.nativeDismissalObserver;
    }

    /* renamed from: c0, reason: from getter */
    public final C2933c getSearchView() {
        return this.searchView;
    }

    public void e0() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null && (toolbar = this.toolbar) != null && toolbar.getParent() == appBarLayout) {
            appBarLayout.removeView(toolbar);
        }
        this.toolbar = null;
    }

    public final void f0(InterfaceC2944n interfaceC2944n) {
        this.nativeDismissalObserver = interfaceC2944n;
    }

    public final void g0(Function1 function1) {
        this.onSearchViewCreate = function1;
    }

    public void h0(Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.e eVar = new AppBarLayout.e(-1, -2);
        eVar.g(0);
        toolbar.setLayoutParams(eVar);
        this.toolbar = toolbar;
    }

    public void i0(boolean hidden) {
        if (this.isToolbarShadowHidden != hidden) {
            AppBarLayout appBarLayout = this.appBarLayout;
            if (appBarLayout != null) {
                appBarLayout.setElevation(hidden ? 0.0f : C1944g0.g(4.0f));
            }
            AppBarLayout appBarLayout2 = this.appBarLayout;
            if (appBarLayout2 != null) {
                appBarLayout2.setStateListAnimator(null);
            }
            this.isToolbarShadowHidden = hidden;
        }
    }

    public void j0(boolean translucent) {
        if (this.isToolbarTranslucent != translucent) {
            ViewGroup.LayoutParams layoutParams = m().getLayoutParams();
            Intrinsics.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.f) layoutParams).o(translucent ? null : new AppBarLayout.ScrollingViewBehavior());
            this.isToolbarTranslucent = translucent;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        if (m().getStackPresentation() != r.e.FORM_SHEET) {
            return null;
        }
        return enter ? AnimationUtils.loadAnimation(getContext(), AbstractC2945o.f29989u) : AnimationUtils.loadAnimation(getContext(), AbstractC2945o.f29992x);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m0(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.swmansion.rnscreens.y, androidx.fragment.app.ComponentCallbacksC1573o
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        AppBarLayout appBarLayout3;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.coordinatorLayout = new b(requireContext, this);
        r m10 = m();
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.o(ga.h.b(m()) ? X() : this.isToolbarTranslucent ? null : new AppBarLayout.ScrollingViewBehavior());
        m10.setLayoutParams(fVar);
        if (ga.h.b(m())) {
            m().setClipToOutline(true);
            T(m());
            m().setElevation(m().getSheetElevation());
        }
        b bVar = this.coordinatorLayout;
        if (bVar == null) {
            Intrinsics.v("coordinatorLayout");
            bVar = null;
        }
        bVar.addView(AbstractC3361b.b(m()));
        if (!ga.h.b(m())) {
            Context context = getContext();
            if (context != null) {
                appBarLayout = new AppBarLayout(context);
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setLayoutParams(new AppBarLayout.e(-1, -2));
            } else {
                appBarLayout = null;
            }
            this.appBarLayout = appBarLayout;
            b bVar2 = this.coordinatorLayout;
            if (bVar2 == null) {
                Intrinsics.v("coordinatorLayout");
                bVar2 = null;
            }
            bVar2.addView(this.appBarLayout);
            if (this.isToolbarShadowHidden && (appBarLayout3 = this.appBarLayout) != null) {
                appBarLayout3.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.toolbar;
            if (toolbar != null && (appBarLayout2 = this.appBarLayout) != null) {
                appBarLayout2.addView(AbstractC3361b.b(toolbar));
            }
            setHasOptionsMenu(true);
        }
        b bVar3 = this.coordinatorLayout;
        if (bVar3 != null) {
            return bVar3;
        }
        Intrinsics.v("coordinatorLayout");
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onPrepareOptionsMenu(Menu menu) {
        F headerConfig;
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (!m().l() || ((headerConfig = m().getHeaderConfig()) != null && !headerConfig.h())) {
            m0(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onStop() {
        if (C3520a.f35951a.a(getContext())) {
            this.lastFocusedChild = Z();
        }
        super.onStop();
    }

    @Override // com.swmansion.rnscreens.y, com.swmansion.rnscreens.z
    public void s() {
        super.s();
        F headerConfig = m().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.j();
        }
    }

    public C() {
        this.bottomSheetStateCallback = new c();
        this.keyboardSheetCallback = new d();
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }
}
