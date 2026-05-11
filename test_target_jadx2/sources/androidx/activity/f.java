package androidx.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.f;
import androidx.core.app.AbstractC1480b;
import androidx.core.app.AbstractC1481c;
import androidx.core.app.w;
import androidx.core.app.x;
import androidx.core.app.z;
import androidx.core.view.B;
import androidx.core.view.C1532z;
import androidx.core.view.InterfaceC1526w;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC1590g;
import androidx.lifecycle.InterfaceC1596m;
import androidx.lifecycle.InterfaceC1599p;
import androidx.lifecycle.J;
import androidx.lifecycle.M;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import d.C2968a;
import d.InterfaceC2969b;
import e.AbstractC3061c;
import e.AbstractC3062d;
import e.C3064f;
import e.InterfaceC3060b;
import e.InterfaceC3063e;
import f.AbstractC3126a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k1.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import q1.AbstractC3901a;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public abstract class f extends androidx.core.app.h implements InterfaceC1599p, X, InterfaceC1590g, k1.f, q, InterfaceC3063e, androidx.core.content.c, androidx.core.content.d, w, x, InterfaceC1526w, m {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final AbstractC3062d mActivityResultRegistry;
    private int mContentLayoutId;
    private V.c mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final l mFullyDrawnReporter;
    private final AtomicInteger mNextLocalRequestCode;
    private final o mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC5159a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC5159a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC5159a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC5159a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC5159a> mOnTrimMemoryListeners;
    final i mReportFullyDrawnExecutor;
    final k1.e mSavedStateRegistryController;
    private W mViewModelStore;
    final C2968a mContextAwareHelper = new C2968a();
    private final C1532z mMenuHostHelper = new C1532z(new Runnable() { // from class: androidx.activity.b
        @Override // java.lang.Runnable
        public final void run() {
            f.this.invalidateMenu();
        }
    });
    private final androidx.lifecycle.r mLifecycleRegistry = new androidx.lifecycle.r(this);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    class b extends AbstractC3062d {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f12951a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC3126a.C0476a f12952b;

            a(int i10, AbstractC3126a.C0476a c0476a) {
                this.f12951a = i10;
                this.f12952b = c0476a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f12951a, this.f12952b.a());
            }
        }

        /* renamed from: androidx.activity.f$b$b, reason: collision with other inner class name */
        class RunnableC0240b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f12954a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f12955b;

            RunnableC0240b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f12954a = i10;
                this.f12955b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f12954a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f12955b));
            }
        }

        b() {
        }

        @Override // e.AbstractC3062d
        public void f(int i10, AbstractC3126a abstractC3126a, Object obj, AbstractC1481c abstractC1481c) {
            Bundle bundle;
            f fVar = f.this;
            AbstractC3126a.C0476a b10 = abstractC3126a.b(fVar, obj);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, b10));
                return;
            }
            Intent a10 = abstractC3126a.a(fVar, obj);
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(fVar.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC1480b.v(fVar, stringArrayExtra, i10);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                AbstractC1480b.z(fVar, a10, i10, bundle);
                return;
            }
            C3064f c3064f = (C3064f) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC1480b.A(fVar, c3064f.d(), i10, c3064f.a(), c3064f.b(), c3064f.c(), 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0240b(i10, e10));
            }
        }
    }

    class c implements InterfaceC1596m {
        c() {
        }

        @Override // androidx.lifecycle.InterfaceC1596m
        public void d(InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar) {
            if (aVar == AbstractC1592i.a.ON_STOP) {
                Window window = f.this.getWindow();
                View peekDecorView = window != null ? window.peekDecorView() : null;
                if (peekDecorView != null) {
                    C0241f.a(peekDecorView);
                }
            }
        }
    }

    class d implements InterfaceC1596m {
        d() {
        }

        @Override // androidx.lifecycle.InterfaceC1596m
        public void d(InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar) {
            if (aVar == AbstractC1592i.a.ON_DESTROY) {
                f.this.mContextAwareHelper.b();
                if (!f.this.isChangingConfigurations()) {
                    f.this.getViewModelStore().a();
                }
                f.this.mReportFullyDrawnExecutor.e();
            }
        }
    }

    class e implements InterfaceC1596m {
        e() {
        }

        @Override // androidx.lifecycle.InterfaceC1596m
        public void d(InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar) {
            f.this.ensureViewModelStore();
            f.this.getLifecycle().d(this);
        }
    }

    /* renamed from: androidx.activity.f$f, reason: collision with other inner class name */
    static class C0241f {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    static class g {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    static final class h {

        /* renamed from: a, reason: collision with root package name */
        Object f12960a;

        /* renamed from: b, reason: collision with root package name */
        W f12961b;

        h() {
        }
    }

    private interface i extends Executor {
        void e();

        void r(View view);
    }

    class j implements i, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: b, reason: collision with root package name */
        Runnable f12963b;

        /* renamed from: a, reason: collision with root package name */
        final long f12962a = SystemClock.uptimeMillis() + 10000;

        /* renamed from: c, reason: collision with root package name */
        boolean f12964c = false;

        j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            Runnable runnable = this.f12963b;
            if (runnable != null) {
                runnable.run();
                this.f12963b = null;
            }
        }

        @Override // androidx.activity.f.i
        public void e() {
            f.this.getWindow().getDecorView().removeCallbacks(this);
            f.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f12963b = runnable;
            View decorView = f.this.getWindow().getDecorView();
            if (!this.f12964c) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.j.this.b();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f12963b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f12962a) {
                    this.f12964c = false;
                    f.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f12963b = null;
            if (f.this.mFullyDrawnReporter.c()) {
                this.f12964c = false;
                f.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // androidx.activity.f.i
        public void r(View view) {
            if (this.f12964c) {
                return;
            }
            this.f12964c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public f() {
        k1.e a10 = k1.e.a(this);
        this.mSavedStateRegistryController = a10;
        this.mOnBackPressedDispatcher = new o(new a());
        i j10 = j();
        this.mReportFullyDrawnExecutor = j10;
        this.mFullyDrawnReporter = new l(j10, new Function0() { // from class: androidx.activity.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit m10;
                m10 = f.this.m();
                return m10;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new c());
        getLifecycle().a(new d());
        getLifecycle().a(new e());
        a10.c();
        J.c(this);
        getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new d.c() { // from class: androidx.activity.d
            @Override // k1.d.c
            public final Bundle a() {
                Bundle n10;
                n10 = f.this.n();
                return n10;
            }
        });
        addOnContextAvailableListener(new InterfaceC2969b() { // from class: androidx.activity.e
            @Override // d.InterfaceC2969b
            public final void a(Context context) {
                f.this.o(context);
            }
        });
    }

    private i j() {
        return new j();
    }

    private void k() {
        Y.b(getWindow().getDecorView(), this);
        Z.a(getWindow().getDecorView(), this);
        k1.g.a(getWindow().getDecorView(), this);
        t.a(getWindow().getDecorView(), this);
        s.a(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit m() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle n() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(Context context) {
        Bundle b10 = getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b10 != null) {
            this.mActivityResultRegistry.g(b10);
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        this.mReportFullyDrawnExecutor.r(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.InterfaceC1526w
    public void addMenuProvider(B b10) {
        this.mMenuHostHelper.c(b10);
    }

    @Override // androidx.core.content.c
    public final void addOnConfigurationChangedListener(InterfaceC5159a interfaceC5159a) {
        this.mOnConfigurationChangedListeners.add(interfaceC5159a);
    }

    public final void addOnContextAvailableListener(InterfaceC2969b interfaceC2969b) {
        this.mContextAwareHelper.a(interfaceC2969b);
    }

    @Override // androidx.core.app.w
    public final void addOnMultiWindowModeChangedListener(InterfaceC5159a interfaceC5159a) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC5159a);
    }

    public final void addOnNewIntentListener(InterfaceC5159a interfaceC5159a) {
        this.mOnNewIntentListeners.add(interfaceC5159a);
    }

    @Override // androidx.core.app.x
    public final void addOnPictureInPictureModeChangedListener(InterfaceC5159a interfaceC5159a) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC5159a);
    }

    @Override // androidx.core.content.d
    public final void addOnTrimMemoryListener(InterfaceC5159a interfaceC5159a) {
        this.mOnTrimMemoryListeners.add(interfaceC5159a);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.mViewModelStore = hVar.f12961b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new W();
            }
        }
    }

    @Override // e.InterfaceC3063e
    public final AbstractC3062d getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1590g
    public Z0.a getDefaultViewModelCreationExtras() {
        Z0.b bVar = new Z0.b();
        if (getApplication() != null) {
            bVar.c(V.a.f17104h, getApplication());
        }
        bVar.c(J.f17050a, this);
        bVar.c(J.f17051b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            bVar.c(J.f17052c, getIntent().getExtras());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.InterfaceC1590g
    public V.c getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new M(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public l getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        h hVar = (h) getLastNonConfigurationInstance();
        if (hVar != null) {
            return hVar.f12960a;
        }
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC1599p
    public AbstractC1592i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.q
    public final o getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // k1.f
    public final k1.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.X
    public W getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (this.mActivityResultRegistry.b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.e();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC5159a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        D.e(this);
        if (androidx.core.os.a.b()) {
            this.mOnBackPressedDispatcher.f(g.a(this));
        }
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.mMenuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC5159a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.p(z10));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC5159a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.mMenuHostHelper.i(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC5159a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new z(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.mMenuHostHelper.k(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        W w10 = this.mViewModelStore;
        if (w10 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            w10 = hVar.f12961b;
        }
        if (w10 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f12960a = onRetainCustomNonConfigurationInstance;
        hVar2.f12961b = w10;
        return hVar2;
    }

    @Override // androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        AbstractC1592i lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.r) {
            ((androidx.lifecycle.r) lifecycle).n(AbstractC1592i.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<InterfaceC5159a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> AbstractC3061c registerForActivityResult(AbstractC3126a abstractC3126a, AbstractC3062d abstractC3062d, InterfaceC3060b interfaceC3060b) {
        return abstractC3062d.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC3126a, interfaceC3060b);
    }

    @Override // androidx.core.view.InterfaceC1526w
    public void removeMenuProvider(B b10) {
        this.mMenuHostHelper.l(b10);
    }

    @Override // androidx.core.content.c
    public final void removeOnConfigurationChangedListener(InterfaceC5159a interfaceC5159a) {
        this.mOnConfigurationChangedListeners.remove(interfaceC5159a);
    }

    public final void removeOnContextAvailableListener(InterfaceC2969b interfaceC2969b) {
        this.mContextAwareHelper.e(interfaceC2969b);
    }

    @Override // androidx.core.app.w
    public final void removeOnMultiWindowModeChangedListener(InterfaceC5159a interfaceC5159a) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC5159a);
    }

    public final void removeOnNewIntentListener(InterfaceC5159a interfaceC5159a) {
        this.mOnNewIntentListeners.remove(interfaceC5159a);
    }

    @Override // androidx.core.app.x
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC5159a interfaceC5159a) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC5159a);
    }

    @Override // androidx.core.content.d
    public final void removeOnTrimMemoryListener(InterfaceC5159a interfaceC5159a) {
        this.mOnTrimMemoryListeners.remove(interfaceC5159a);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC3901a.h()) {
                AbstractC3901a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.b();
            AbstractC3901a.f();
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        k();
        this.mReportFullyDrawnExecutor.r(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    public void addMenuProvider(B b10, InterfaceC1599p interfaceC1599p) {
        this.mMenuHostHelper.d(b10, interfaceC1599p);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void addMenuProvider(B b10, InterfaceC1599p interfaceC1599p, AbstractC1592i.b bVar) {
        this.mMenuHostHelper.e(b10, interfaceC1599p, bVar);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC5159a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.p(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC5159a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new z(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> AbstractC3061c registerForActivityResult(AbstractC3126a abstractC3126a, InterfaceC3060b interfaceC3060b) {
        return registerForActivityResult(abstractC3126a, this.mActivityResultRegistry, interfaceC3060b);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        k();
        this.mReportFullyDrawnExecutor.r(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        this.mReportFullyDrawnExecutor.r(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
