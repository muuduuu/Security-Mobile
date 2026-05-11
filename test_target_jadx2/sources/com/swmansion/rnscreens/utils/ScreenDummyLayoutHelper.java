package com.swmansion.rnscreens.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.C1944g0;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.F;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import xc.m;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 =2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u001dR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010-R\u0016\u00101\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", BuildConfig.FLAVOR, "c", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Z", "Landroid/content/Context;", "contextWithTheme", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "fontSize", "isTitleEmpty", BuildConfig.FLAVOR, "computeDummyLayout", "(IZ)F", "Lkotlin/Function0;", BuildConfig.FLAVOR, "lazyMessage", "e", "(Lkotlin/jvm/functions/Function0;)Lcom/facebook/react/bridge/ReactApplicationContext;", "Landroid/app/Activity;", "d", "()Landroid/app/Activity;", "onHostResume", "()V", "onHostPause", "onHostDestroy", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", C4870a.f43493a, "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Landroid/view/View;", "Landroid/view/View;", "dummyContentView", "Landroidx/appcompat/widget/Toolbar;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "F", "defaultFontSize", "f", "I", "defaultContentInsetStartWithNavigation", "Lcom/swmansion/rnscreens/utils/a;", "g", "Lcom/swmansion/rnscreens/utils/a;", "cache", "Ljava/lang/ref/WeakReference;", "h", "Ljava/lang/ref/WeakReference;", "reactContextRef", "i", "Z", "isLayoutInitialized", "j", "react-native-screens_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenDummyLayoutHelper implements LifecycleEventListener {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: k, reason: collision with root package name */
    private static WeakReference f30041k = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CoordinatorLayout coordinatorLayout;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private AppBarLayout appBarLayout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private View dummyContentView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Toolbar toolbar;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float defaultFontSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int defaultContentInsetStartWithNavigation;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private a cache;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private WeakReference reactContextRef;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isLayoutInitialized;

    /* renamed from: com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ScreenDummyLayoutHelper getInstance() {
            return (ScreenDummyLayoutHelper) ScreenDummyLayoutHelper.f30041k.get();
        }

        private Companion() {
        }
    }

    static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f30051a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return "[RNScreens] Context was null-ed before dummy layout was initialized";
        }
    }

    static final class c extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f30052a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return "[RNScreens] ReactContext missing in onHostResume! This should not happen.";
        }
    }

    static final class d extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f30053a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "[RNScreens] Attempt to require missing react context";
        }
    }

    public ScreenDummyLayoutHelper(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.cache = a.f30054c.a();
        this.reactContextRef = new WeakReference(reactContext);
        try {
            System.loadLibrary("react_codegen_rnscreens");
        } catch (UnsatisfiedLinkError unused) {
            Log.w("ScreenDummyLayoutHelper", "[RNScreens] Failed to load react_codegen_rnscreens library.");
        }
        f30041k = new WeakReference(this);
        if (reactContext.hasCurrentActivity() && c(reactContext)) {
            return;
        }
        reactContext.addLifecycleEventListener(this);
    }

    private final void b(Context contextWithTheme) {
        this.coordinatorLayout = new CoordinatorLayout(contextWithTheme);
        AppBarLayout appBarLayout = new AppBarLayout(contextWithTheme);
        appBarLayout.setLayoutParams(new CoordinatorLayout.f(-1, -2));
        this.appBarLayout = appBarLayout;
        Toolbar toolbar = new Toolbar(contextWithTheme);
        toolbar.setTitle("FontSize123!#$");
        AppBarLayout.e eVar = new AppBarLayout.e(-1, -2);
        eVar.g(0);
        toolbar.setLayoutParams(eVar);
        this.toolbar = toolbar;
        TextView a10 = F.f29864A.a(toolbar);
        Intrinsics.d(a10);
        this.defaultFontSize = a10.getTextSize();
        Toolbar toolbar2 = this.toolbar;
        View view = null;
        if (toolbar2 == null) {
            Intrinsics.v("toolbar");
            toolbar2 = null;
        }
        this.defaultContentInsetStartWithNavigation = toolbar2.getContentInsetStartWithNavigation();
        AppBarLayout appBarLayout2 = this.appBarLayout;
        if (appBarLayout2 == null) {
            Intrinsics.v("appBarLayout");
            appBarLayout2 = null;
        }
        Toolbar toolbar3 = this.toolbar;
        if (toolbar3 == null) {
            Intrinsics.v("toolbar");
            toolbar3 = null;
        }
        appBarLayout2.addView(toolbar3);
        View view2 = new View(contextWithTheme);
        view2.setLayoutParams(new CoordinatorLayout.f(-1, -1));
        this.dummyContentView = view2;
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        if (coordinatorLayout == null) {
            Intrinsics.v("coordinatorLayout");
            coordinatorLayout = null;
        }
        AppBarLayout appBarLayout3 = this.appBarLayout;
        if (appBarLayout3 == null) {
            Intrinsics.v("appBarLayout");
            appBarLayout3 = null;
        }
        coordinatorLayout.addView(appBarLayout3);
        View view3 = this.dummyContentView;
        if (view3 == null) {
            Intrinsics.v("dummyContentView");
        } else {
            view = view3;
        }
        coordinatorLayout.addView(view);
        this.isLayoutInitialized = true;
    }

    private final boolean c(ReactApplicationContext reactContext) {
        if (this.isLayoutInitialized) {
            return true;
        }
        if (!reactContext.hasCurrentActivity()) {
            return false;
        }
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity. This could happen only due to race-condition.");
        }
        Intrinsics.checkNotNullExpressionValue(currentActivity, "requireNotNull(...)");
        synchronized (this) {
            if (this.isLayoutInitialized) {
                return true;
            }
            b(currentActivity);
            Unit unit = Unit.f36324a;
            return true;
        }
    }

    private final float computeDummyLayout(int fontSize, boolean isTitleEmpty) {
        if (!this.isLayoutInitialized && !c(e(b.f30051a))) {
            Log.e("ScreenDummyLayoutHelper", "[RNScreens] Failed to late-init layout while computing header height. This is most likely a race-condition-bug in react-native-screens, please file an issue at https://github.com/software-mansion/react-native-screens/issues");
            return 0.0f;
        }
        if (this.cache.c(new com.swmansion.rnscreens.utils.b(fontSize, isTitleEmpty))) {
            return this.cache.b();
        }
        View decorView = d().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
        AppBarLayout appBarLayout = null;
        if (isTitleEmpty) {
            Toolbar toolbar = this.toolbar;
            if (toolbar == null) {
                Intrinsics.v("toolbar");
                toolbar = null;
            }
            toolbar.setTitle(BuildConfig.FLAVOR);
            Toolbar toolbar2 = this.toolbar;
            if (toolbar2 == null) {
                Intrinsics.v("toolbar");
                toolbar2 = null;
            }
            toolbar2.setContentInsetStartWithNavigation(0);
        } else {
            Toolbar toolbar3 = this.toolbar;
            if (toolbar3 == null) {
                Intrinsics.v("toolbar");
                toolbar3 = null;
            }
            toolbar3.setTitle("FontSize123!#$");
            Toolbar toolbar4 = this.toolbar;
            if (toolbar4 == null) {
                Intrinsics.v("toolbar");
                toolbar4 = null;
            }
            toolbar4.setContentInsetStartWithNavigation(this.defaultContentInsetStartWithNavigation);
        }
        F.a aVar = F.f29864A;
        Toolbar toolbar5 = this.toolbar;
        if (toolbar5 == null) {
            Intrinsics.v("toolbar");
            toolbar5 = null;
        }
        TextView a10 = aVar.a(toolbar5);
        if (a10 != null) {
            a10.setTextSize(fontSize != -1 ? fontSize : this.defaultFontSize);
        }
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        if (coordinatorLayout == null) {
            Intrinsics.v("coordinatorLayout");
            coordinatorLayout = null;
        }
        coordinatorLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        CoordinatorLayout coordinatorLayout2 = this.coordinatorLayout;
        if (coordinatorLayout2 == null) {
            Intrinsics.v("coordinatorLayout");
            coordinatorLayout2 = null;
        }
        coordinatorLayout2.layout(0, 0, width, height);
        AppBarLayout appBarLayout2 = this.appBarLayout;
        if (appBarLayout2 == null) {
            Intrinsics.v("appBarLayout");
        } else {
            appBarLayout = appBarLayout2;
        }
        float e10 = C1944g0.e(appBarLayout.getHeight());
        this.cache = new a(new com.swmansion.rnscreens.utils.b(fontSize, isTitleEmpty), e10);
        return e10;
    }

    private final Activity d() {
        Activity currentActivity = f(this, null, 1, null).getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity");
    }

    private final ReactApplicationContext e(Function0 lazyMessage) {
        Object obj = this.reactContextRef.get();
        if (lazyMessage == null) {
            lazyMessage = d.f30053a;
        }
        if (obj != null) {
            return (ReactApplicationContext) obj;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }

    static /* synthetic */ ReactApplicationContext f(ScreenDummyLayoutHelper screenDummyLayoutHelper, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        return screenDummyLayoutHelper.e(function0);
    }

    public static final ScreenDummyLayoutHelper getInstance() {
        return INSTANCE.getInstance();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.reactContextRef.get();
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactApplicationContext e10 = e(c.f30052a);
        if (c(e10)) {
            e10.removeLifecycleEventListener(this);
        } else {
            Log.w("ScreenDummyLayoutHelper", "[RNScreens] Failed to initialise dummy layout in onHostResume.");
        }
    }
}
