package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC1481c;
import androidx.core.view.AbstractC1522u;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.AbstractC1604v;
import androidx.lifecycle.C1607y;
import androidx.lifecycle.InterfaceC1590g;
import androidx.lifecycle.InterfaceC1596m;
import androidx.lifecycle.InterfaceC1599p;
import androidx.lifecycle.V;
import e.AbstractC3061c;
import e.AbstractC3062d;
import e.InterfaceC3060b;
import e.InterfaceC3063e;
import f.AbstractC3126a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC3735a;

/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ComponentCallbacksC1573o implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1599p, androidx.lifecycle.X, InterfaceC1590g, k1.f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    V.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    G mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC1582y mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.r mLifecycleRegistry;
    ComponentCallbacksC1573o mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    k1.e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    ComponentCallbacksC1573o mTarget;
    int mTargetRequestCode;
    View mView;
    U mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    G mChildFragmentManager = new H();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new b();
    AbstractC1592i.b mMaxState = AbstractC1592i.b.RESUMED;
    C1607y mViewLifecycleOwnerLiveData = new C1607y();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<n> mOnPreAttachedListeners = new ArrayList<>();
    private final n mSavedStateAttachListener = new c();

    /* renamed from: androidx.fragment.app.o$a */
    class a extends AbstractC3061c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f16971a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3126a f16972b;

        a(AtomicReference atomicReference, AbstractC3126a abstractC3126a) {
            this.f16971a = atomicReference;
            this.f16972b = abstractC3126a;
        }

        @Override // e.AbstractC3061c
        public void b(Object obj, AbstractC1481c abstractC1481c) {
            AbstractC3061c abstractC3061c = (AbstractC3061c) this.f16971a.get();
            if (abstractC3061c == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC3061c.b(obj, abstractC1481c);
        }

        @Override // e.AbstractC3061c
        public void c() {
            AbstractC3061c abstractC3061c = (AbstractC3061c) this.f16971a.getAndSet(null);
            if (abstractC3061c != null) {
                abstractC3061c.c();
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksC1573o.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.o$c */
    class c extends n {
        c() {
            super(null);
        }

        @Override // androidx.fragment.app.ComponentCallbacksC1573o.n
        void a() {
            ComponentCallbacksC1573o.this.mSavedStateRegistryController.c();
            androidx.lifecycle.J.c(ComponentCallbacksC1573o.this);
            Bundle bundle = ComponentCallbacksC1573o.this.mSavedFragmentState;
            ComponentCallbacksC1573o.this.mSavedStateRegistryController.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* renamed from: androidx.fragment.app.o$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksC1573o.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.o$e */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z f16977a;

        e(Z z10) {
            this.f16977a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16977a.k();
        }
    }

    /* renamed from: androidx.fragment.app.o$f */
    class f extends AbstractC1579v {
        f() {
        }

        @Override // androidx.fragment.app.AbstractC1579v
        public View c(int i10) {
            View view = ComponentCallbacksC1573o.this.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + ComponentCallbacksC1573o.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC1579v
        public boolean d() {
            return ComponentCallbacksC1573o.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.o$g */
    class g implements InterfaceC1596m {
        g() {
        }

        @Override // androidx.lifecycle.InterfaceC1596m
        public void d(InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar) {
            View view;
            if (aVar != AbstractC1592i.a.ON_STOP || (view = ComponentCallbacksC1573o.this.mView) == null) {
                return;
            }
            l.a(view);
        }
    }

    /* renamed from: androidx.fragment.app.o$h */
    class h implements InterfaceC3735a {
        h() {
        }

        @Override // o.InterfaceC3735a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC3062d apply(Void r32) {
            ComponentCallbacksC1573o componentCallbacksC1573o = ComponentCallbacksC1573o.this;
            Object obj = componentCallbacksC1573o.mHost;
            return obj instanceof InterfaceC3063e ? ((InterfaceC3063e) obj).getActivityResultRegistry() : componentCallbacksC1573o.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.o$i */
    class i implements InterfaceC3735a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3062d f16982a;

        i(AbstractC3062d abstractC3062d) {
            this.f16982a = abstractC3062d;
        }

        @Override // o.InterfaceC3735a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC3062d apply(Void r12) {
            return this.f16982a;
        }
    }

    /* renamed from: androidx.fragment.app.o$j */
    class j extends n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3735a f16984a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f16985b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3126a f16986c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3060b f16987d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC3735a interfaceC3735a, AtomicReference atomicReference, AbstractC3126a abstractC3126a, InterfaceC3060b interfaceC3060b) {
            super(null);
            this.f16984a = interfaceC3735a;
            this.f16985b = atomicReference;
            this.f16986c = abstractC3126a;
            this.f16987d = interfaceC3060b;
        }

        @Override // androidx.fragment.app.ComponentCallbacksC1573o.n
        void a() {
            String generateActivityResultKey = ComponentCallbacksC1573o.this.generateActivityResultKey();
            this.f16985b.set(((AbstractC3062d) this.f16984a.apply(null)).i(generateActivityResultKey, ComponentCallbacksC1573o.this, this.f16986c, this.f16987d));
        }
    }

    /* renamed from: androidx.fragment.app.o$k */
    static class k {

        /* renamed from: a, reason: collision with root package name */
        View f16989a;

        /* renamed from: b, reason: collision with root package name */
        boolean f16990b;

        /* renamed from: c, reason: collision with root package name */
        int f16991c;

        /* renamed from: d, reason: collision with root package name */
        int f16992d;

        /* renamed from: e, reason: collision with root package name */
        int f16993e;

        /* renamed from: f, reason: collision with root package name */
        int f16994f;

        /* renamed from: g, reason: collision with root package name */
        int f16995g;

        /* renamed from: h, reason: collision with root package name */
        ArrayList f16996h;

        /* renamed from: i, reason: collision with root package name */
        ArrayList f16997i;

        /* renamed from: j, reason: collision with root package name */
        Object f16998j = null;

        /* renamed from: k, reason: collision with root package name */
        Object f16999k;

        /* renamed from: l, reason: collision with root package name */
        Object f17000l;

        /* renamed from: m, reason: collision with root package name */
        Object f17001m;

        /* renamed from: n, reason: collision with root package name */
        Object f17002n;

        /* renamed from: o, reason: collision with root package name */
        Object f17003o;

        /* renamed from: p, reason: collision with root package name */
        Boolean f17004p;

        /* renamed from: q, reason: collision with root package name */
        Boolean f17005q;

        /* renamed from: r, reason: collision with root package name */
        float f17006r;

        /* renamed from: s, reason: collision with root package name */
        View f17007s;

        /* renamed from: t, reason: collision with root package name */
        boolean f17008t;

        k() {
            Object obj = ComponentCallbacksC1573o.USE_DEFAULT_TRANSITION;
            this.f16999k = obj;
            this.f17000l = null;
            this.f17001m = obj;
            this.f17002n = null;
            this.f17003o = obj;
            this.f17006r = 1.0f;
            this.f17007s = null;
        }
    }

    /* renamed from: androidx.fragment.app.o$l */
    static class l {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.fragment.app.o$m */
    public static class m extends RuntimeException {
        public m(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.o$n */
    private static abstract class n {
        private n() {
        }

        abstract void a();

        /* synthetic */ n(b bVar) {
            this();
        }
    }

    public ComponentCallbacksC1573o() {
        y();
    }

    private AbstractC3061c A(AbstractC3126a abstractC3126a, InterfaceC3735a interfaceC3735a, InterfaceC3060b interfaceC3060b) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            B(new j(interfaceC3735a, atomicReference, abstractC3126a, interfaceC3060b));
            return new a(atomicReference, abstractC3126a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void B(n nVar) {
        if (this.mState >= 0) {
            nVar.a();
        } else {
            this.mOnPreAttachedListeners.add(nVar);
        }
    }

    private void C() {
        if (G.J0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    @Deprecated
    public static ComponentCallbacksC1573o instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private k v() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new k();
        }
        return this.mAnimationInfo;
    }

    private int w() {
        AbstractC1592i.b bVar = this.mMaxState;
        return (bVar == AbstractC1592i.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.w());
    }

    private ComponentCallbacksC1573o x(boolean z10) {
        String str;
        if (z10) {
            U0.c.j(this);
        }
        ComponentCallbacksC1573o componentCallbacksC1573o = this.mTarget;
        if (componentCallbacksC1573o != null) {
            return componentCallbacksC1573o;
        }
        G g10 = this.mFragmentManager;
        if (g10 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return g10.e0(str);
    }

    private void y() {
        this.mLifecycleRegistry = new androidx.lifecycle.r(this);
        this.mSavedStateRegistryController = k1.e.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        B(this.mSavedStateAttachListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        G g10;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f17008t = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (g10 = this.mFragmentManager) == null) {
            return;
        }
        Z r10 = Z.r(viewGroup, g10);
        r10.t();
        if (z10) {
            this.mHost.g().post(new e(r10));
        } else {
            r10.k();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    AbstractC1579v createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        ComponentCallbacksC1573o x10 = x(false);
        if (x10 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(x10);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.V(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    ComponentCallbacksC1573o findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.j0(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final AbstractActivityC1577t getActivity() {
        AbstractC1582y abstractC1582y = this.mHost;
        if (abstractC1582y == null) {
            return null;
        }
        return (AbstractActivityC1577t) abstractC1582y.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f17005q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f17004p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f16989a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final G getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        AbstractC1582y abstractC1582y = this.mHost;
        if (abstractC1582y == null) {
            return null;
        }
        return abstractC1582y.f();
    }

    @Override // androidx.lifecycle.InterfaceC1590g
    public Z0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && G.J0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        Z0.b bVar = new Z0.b();
        if (application != null) {
            bVar.c(V.a.f17104h, application);
        }
        bVar.c(androidx.lifecycle.J.f17050a, this);
        bVar.c(androidx.lifecycle.J.f17051b, this);
        if (getArguments() != null) {
            bVar.c(androidx.lifecycle.J.f17052c, getArguments());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.InterfaceC1590g
    public V.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && G.J0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.M(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f16991c;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f16998j;
    }

    androidx.core.app.C getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f16992d;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17000l;
    }

    androidx.core.app.C getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17007s;
    }

    @Deprecated
    public final G getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC1582y abstractC1582y = this.mHost;
        if (abstractC1582y == null) {
            return null;
        }
        return abstractC1582y.i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC1599p
    public AbstractC1592i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f16995g;
    }

    public final ComponentCallbacksC1573o getParentFragment() {
        return this.mParentFragment;
    }

    public final G getParentFragmentManager() {
        G g10 = this.mFragmentManager;
        if (g10 != null) {
            return g10;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f16990b;
    }

    int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f16993e;
    }

    int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f16994f;
    }

    float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f17006r;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f17001m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        U0.c.h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f16999k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // k1.f
    public final k1.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17002n;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f17003o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f16996h) == null) ? new ArrayList<>() : arrayList;
    }

    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f16997i) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final ComponentCallbacksC1573o getTargetFragment() {
        return x(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        U0.c.i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC1599p getViewLifecycleOwner() {
        U u10 = this.mViewLifecycleOwner;
        if (u10 != null) {
            return u10;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public AbstractC1604v getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.X
    public androidx.lifecycle.W getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (w() != AbstractC1592i.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.E0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        y();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new H();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        G g10;
        return this.mHidden || ((g10 = this.mFragmentManager) != null && g10.M0(this.mParentFragment));
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        G g10;
        return this.mMenuVisible && ((g10 = this.mFragmentManager) == null || g10.N0(this.mParentFragment));
    }

    boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f17008t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        G g10 = this.mFragmentManager;
        if (g10 == null) {
            return false;
        }
        return g10.Q0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.a1();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        if (G.J0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC1582y abstractC1582y = this.mHost;
        Activity e10 = abstractC1582y == null ? null : abstractC1582y.e();
        if (e10 != null) {
            this.mCalled = false;
            onAttach(e10);
        }
    }

    @Deprecated
    public void onAttachFragment(ComponentCallbacksC1573o componentCallbacksC1573o) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.P0(1)) {
            return;
        }
        this.mChildFragmentManager.A();
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC1582y abstractC1582y = this.mHost;
        Activity e10 = abstractC1582y == null ? null : abstractC1582y.e();
        if (e10 != null) {
            this.mCalled = false;
            onInflate(e10, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.a1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            C();
            this.mChildFragmentManager.w();
        } else {
            throw new c0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        Iterator<n> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.l(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.G(this);
            this.mChildFragmentManager.x();
        } else {
            throw new c0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.z(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.a1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.i(AbstractC1592i.a.ON_CREATE);
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.B(menu, menuInflater);
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.a1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new U(this, getViewModelStore(), new Runnable() { // from class: androidx.fragment.app.n
            @Override // java.lang.Runnable
            public final void run() {
                ComponentCallbacksC1573o.this.z();
            }
        });
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (G.J0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        androidx.lifecycle.Y.b(this.mView, this.mViewLifecycleOwner);
        androidx.lifecycle.Z.a(this.mView, this.mViewLifecycleOwner);
        k1.g.a(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.o(this.mViewLifecycleOwner);
    }

    void performDestroy() {
        this.mChildFragmentManager.C();
        this.mLifecycleRegistry.i(AbstractC1592i.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.D();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().isAtLeast(AbstractC1592i.b.CREATED)) {
            this.mViewLifecycleOwner.a(AbstractC1592i.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.b(this).d();
            this.mPerformedCreateView = false;
        } else {
            throw new c0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.I0()) {
                return;
            }
            this.mChildFragmentManager.C();
            this.mChildFragmentManager = new H();
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.I(menuItem);
    }

    void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.J(menu);
    }

    void performPause() {
        this.mChildFragmentManager.L();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1592i.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.i(AbstractC1592i.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.N(menu);
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean O02 = this.mFragmentManager.O0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != O02) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(O02);
            onPrimaryNavigationFragmentChanged(O02);
            this.mChildFragmentManager.O();
        }
    }

    void performResume() {
        this.mChildFragmentManager.a1();
        this.mChildFragmentManager.Z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new c0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.r rVar = this.mLifecycleRegistry;
        AbstractC1592i.a aVar = AbstractC1592i.a.ON_RESUME;
        rVar.i(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.P();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    void performStart() {
        this.mChildFragmentManager.a1();
        this.mChildFragmentManager.Z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new c0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.r rVar = this.mLifecycleRegistry;
        AbstractC1592i.a aVar = AbstractC1592i.a.ON_START;
        rVar.i(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.Q();
    }

    void performStop() {
        this.mChildFragmentManager.S();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1592i.a.ON_STOP);
        }
        this.mLifecycleRegistry.i(AbstractC1592i.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.T();
    }

    public void postponeEnterTransition() {
        v().f17008t = true;
    }

    public final <I, O> AbstractC3061c registerForActivityResult(AbstractC3126a abstractC3126a, InterfaceC3060b interfaceC3060b) {
        return A(abstractC3126a, new h(), interfaceC3060b);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost != null) {
            getParentFragmentManager().W0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final AbstractActivityC1577t requireActivity() {
        AbstractActivityC1577t activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final G requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final ComponentCallbacksC1573o requireParentFragment() {
        ComponentCallbacksC1573o parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.o1(bundle);
        this.mChildFragmentManager.A();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(AbstractC1592i.a.ON_CREATE);
            }
        } else {
            throw new c0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        v().f17005q = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        v().f17004p = Boolean.valueOf(z10);
    }

    void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        v().f16991c = i10;
        v().f16992d = i11;
        v().f16993e = i12;
        v().f16994f = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(androidx.core.app.C c10) {
        v().getClass();
    }

    public void setEnterTransition(Object obj) {
        v().f16998j = obj;
    }

    public void setExitSharedElementCallback(androidx.core.app.C c10) {
        v().getClass();
    }

    public void setExitTransition(Object obj) {
        v().f17000l = obj;
    }

    void setFocusedView(View view) {
        v().f17007s = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.o();
        }
    }

    public void setInitialSavedState(C0289o c0289o) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c0289o == null || (bundle = c0289o.f17009a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.o();
            }
        }
    }

    void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        v();
        this.mAnimationInfo.f16995g = i10;
    }

    void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        v().f16990b = z10;
    }

    void setPostOnViewCreatedAlpha(float f10) {
        v().f17006r = f10;
    }

    public void setReenterTransition(Object obj) {
        v().f17001m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        U0.c.k(this);
        this.mRetainInstance = z10;
        G g10 = this.mFragmentManager;
        if (g10 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            g10.j(this);
        } else {
            g10.m1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        v().f16999k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        v().f17002n = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        v();
        k kVar = this.mAnimationInfo;
        kVar.f16996h = arrayList;
        kVar.f16997i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        v().f17003o = obj;
    }

    @Deprecated
    public void setTargetFragment(ComponentCallbacksC1573o componentCallbacksC1573o, int i10) {
        if (componentCallbacksC1573o != null) {
            U0.c.l(this, componentCallbacksC1573o, i10);
        }
        G g10 = this.mFragmentManager;
        G g11 = componentCallbacksC1573o != null ? componentCallbacksC1573o.mFragmentManager : null;
        if (g10 != null && g11 != null && g10 != g11) {
            throw new IllegalArgumentException("Fragment " + componentCallbacksC1573o + " must share the same FragmentManager to be set as a target fragment");
        }
        for (ComponentCallbacksC1573o componentCallbacksC1573o2 = componentCallbacksC1573o; componentCallbacksC1573o2 != null; componentCallbacksC1573o2 = componentCallbacksC1573o2.x(false)) {
            if (componentCallbacksC1573o2.equals(this)) {
                throw new IllegalArgumentException("Setting " + componentCallbacksC1573o + " as the target of " + this + " would create a target cycle");
            }
        }
        if (componentCallbacksC1573o == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || componentCallbacksC1573o.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = componentCallbacksC1573o;
        } else {
            this.mTargetWho = componentCallbacksC1573o.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        U0.c.m(this, z10);
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            G g10 = this.mFragmentManager;
            g10.c1(g10.u(this));
        }
        this.mUserVisibleHint = z10;
        this.mDeferStart = this.mState < 5 && !z10;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC1582y abstractC1582y = this.mHost;
        if (abstractC1582y != null) {
            return abstractC1582y.l(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (G.J0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().Y0(this, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !v().f17008t) {
            return;
        }
        if (this.mHost == null) {
            v().f17008t = false;
        } else if (Looper.myLooper() != this.mHost.g().getLooper()) {
            this.mHost.g().postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* renamed from: androidx.fragment.app.o$o, reason: collision with other inner class name */
    public static class C0289o implements Parcelable {
        public static final Parcelable.Creator<C0289o> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        final Bundle f17009a;

        /* renamed from: androidx.fragment.app.o$o$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0289o createFromParcel(Parcel parcel) {
                return new C0289o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0289o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0289o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0289o[] newArray(int i10) {
                return new C0289o[i10];
            }
        }

        C0289o(Bundle bundle) {
            this.f17009a = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f17009a);
        }

        C0289o(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f17009a = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    @Deprecated
    public static ComponentCallbacksC1573o instantiate(Context context, String str, Bundle bundle) {
        try {
            ComponentCallbacksC1573o componentCallbacksC1573o = (ComponentCallbacksC1573o) AbstractC1581x.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(componentCallbacksC1573o.getClass().getClassLoader());
                componentCallbacksC1573o.setArguments(bundle);
            }
            return componentCallbacksC1573o;
        } catch (IllegalAccessException e10) {
            throw new m("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new m("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new m("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new m("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        v().f17008t = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        G g10 = this.mFragmentManager;
        if (g10 != null) {
            this.mPostponedHandler = g10.w0().g();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> AbstractC3061c registerForActivityResult(AbstractC3126a abstractC3126a, AbstractC3062d abstractC3062d, InterfaceC3060b interfaceC3060b) {
        return A(abstractC3126a, new i(abstractC3062d), interfaceC3060b);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC1582y abstractC1582y = this.mHost;
        if (abstractC1582y != null) {
            abstractC1582y.m(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().X0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC1582y abstractC1582y = this.mHost;
        if (abstractC1582y != null) {
            LayoutInflater j10 = abstractC1582y.j();
            AbstractC1522u.a(j10, this.mChildFragmentManager.x0());
            return j10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
