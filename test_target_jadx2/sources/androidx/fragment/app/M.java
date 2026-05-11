package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC1484a0;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1592i;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;

/* loaded from: classes.dex */
class M {

    /* renamed from: a, reason: collision with root package name */
    private final A f16784a;

    /* renamed from: b, reason: collision with root package name */
    private final O f16785b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentCallbacksC1573o f16786c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16787d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f16788e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f16789a;

        a(View view) {
            this.f16789a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f16789a.removeOnAttachStateChangeListener(this);
            AbstractC1484a0.n0(this.f16789a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16791a;

        static {
            int[] iArr = new int[AbstractC1592i.b.values().length];
            f16791a = iArr;
            try {
                iArr[AbstractC1592i.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16791a[AbstractC1592i.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16791a[AbstractC1592i.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16791a[AbstractC1592i.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    M(A a10, O o10, ComponentCallbacksC1573o componentCallbacksC1573o) {
        this.f16784a = a10;
        this.f16785b = o10;
        this.f16786c = componentCallbacksC1573o;
    }

    private boolean l(View view) {
        if (view == this.f16786c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f16786c.mView) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (G.J0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f16786c);
        }
        Bundle bundle = this.f16786c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f16786c.performActivityCreated(bundle2);
        this.f16784a.a(this.f16786c, bundle2, false);
    }

    void b() {
        ComponentCallbacksC1573o l02 = G.l0(this.f16786c.mContainer);
        ComponentCallbacksC1573o parentFragment = this.f16786c.getParentFragment();
        if (l02 != null && !l02.equals(parentFragment)) {
            ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
            U0.c.o(componentCallbacksC1573o, l02, componentCallbacksC1573o.mContainerId);
        }
        int j10 = this.f16785b.j(this.f16786c);
        ComponentCallbacksC1573o componentCallbacksC1573o2 = this.f16786c;
        componentCallbacksC1573o2.mContainer.addView(componentCallbacksC1573o2.mView, j10);
    }

    void c() {
        if (G.J0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f16786c);
        }
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
        ComponentCallbacksC1573o componentCallbacksC1573o2 = componentCallbacksC1573o.mTarget;
        M m10 = null;
        if (componentCallbacksC1573o2 != null) {
            M n10 = this.f16785b.n(componentCallbacksC1573o2.mWho);
            if (n10 == null) {
                throw new IllegalStateException("Fragment " + this.f16786c + " declared target fragment " + this.f16786c.mTarget + " that does not belong to this FragmentManager!");
            }
            ComponentCallbacksC1573o componentCallbacksC1573o3 = this.f16786c;
            componentCallbacksC1573o3.mTargetWho = componentCallbacksC1573o3.mTarget.mWho;
            componentCallbacksC1573o3.mTarget = null;
            m10 = n10;
        } else {
            String str = componentCallbacksC1573o.mTargetWho;
            if (str != null && (m10 = this.f16785b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f16786c + " declared target fragment " + this.f16786c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (m10 != null) {
            m10.m();
        }
        ComponentCallbacksC1573o componentCallbacksC1573o4 = this.f16786c;
        componentCallbacksC1573o4.mHost = componentCallbacksC1573o4.mFragmentManager.w0();
        ComponentCallbacksC1573o componentCallbacksC1573o5 = this.f16786c;
        componentCallbacksC1573o5.mParentFragment = componentCallbacksC1573o5.mFragmentManager.z0();
        this.f16784a.g(this.f16786c, false);
        this.f16786c.performAttach();
        this.f16784a.b(this.f16786c, false);
    }

    int d() {
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
        if (componentCallbacksC1573o.mFragmentManager == null) {
            return componentCallbacksC1573o.mState;
        }
        int i10 = this.f16788e;
        int i11 = b.f16791a[componentCallbacksC1573o.mMaxState.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(i10, -1) : Math.min(i10, 0) : Math.min(i10, 1) : Math.min(i10, 5);
        }
        ComponentCallbacksC1573o componentCallbacksC1573o2 = this.f16786c;
        if (componentCallbacksC1573o2.mFromLayout) {
            if (componentCallbacksC1573o2.mInLayout) {
                i10 = Math.max(this.f16788e, 2);
                View view = this.f16786c.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f16788e < 4 ? Math.min(i10, componentCallbacksC1573o2.mState) : Math.min(i10, 1);
            }
        }
        if (!this.f16786c.mAdded) {
            i10 = Math.min(i10, 1);
        }
        ComponentCallbacksC1573o componentCallbacksC1573o3 = this.f16786c;
        ViewGroup viewGroup = componentCallbacksC1573o3.mContainer;
        Z.c.a p10 = viewGroup != null ? Z.r(viewGroup, componentCallbacksC1573o3.getParentFragmentManager()).p(this) : null;
        if (p10 == Z.c.a.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (p10 == Z.c.a.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            ComponentCallbacksC1573o componentCallbacksC1573o4 = this.f16786c;
            if (componentCallbacksC1573o4.mRemoving) {
                i10 = componentCallbacksC1573o4.isInBackStack() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        ComponentCallbacksC1573o componentCallbacksC1573o5 = this.f16786c;
        if (componentCallbacksC1573o5.mDeferStart && componentCallbacksC1573o5.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (G.J0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f16786c);
        }
        return i10;
    }

    void e() {
        if (G.J0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f16786c);
        }
        Bundle bundle = this.f16786c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
        if (componentCallbacksC1573o.mIsCreated) {
            componentCallbacksC1573o.mState = 1;
            componentCallbacksC1573o.restoreChildFragmentState();
        } else {
            this.f16784a.h(componentCallbacksC1573o, bundle2, false);
            this.f16786c.performCreate(bundle2);
            this.f16784a.c(this.f16786c, bundle2, false);
        }
    }

    void f() {
        String str;
        if (this.f16786c.mFromLayout) {
            return;
        }
        if (G.J0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f16786c);
        }
        Bundle bundle = this.f16786c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = this.f16786c.performGetLayoutInflater(bundle2);
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
        ViewGroup viewGroup2 = componentCallbacksC1573o.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = componentCallbacksC1573o.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f16786c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) componentCallbacksC1573o.mFragmentManager.r0().c(this.f16786c.mContainerId);
                if (viewGroup == null) {
                    ComponentCallbacksC1573o componentCallbacksC1573o2 = this.f16786c;
                    if (!componentCallbacksC1573o2.mRestored) {
                        try {
                            str = componentCallbacksC1573o2.getResources().getResourceName(this.f16786c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f16786c.mContainerId) + " (" + str + ") for fragment " + this.f16786c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    U0.c.n(this.f16786c, viewGroup);
                }
            }
        }
        ComponentCallbacksC1573o componentCallbacksC1573o3 = this.f16786c;
        componentCallbacksC1573o3.mContainer = viewGroup;
        componentCallbacksC1573o3.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (this.f16786c.mView != null) {
            if (G.J0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f16786c);
            }
            this.f16786c.mView.setSaveFromParentEnabled(false);
            ComponentCallbacksC1573o componentCallbacksC1573o4 = this.f16786c;
            componentCallbacksC1573o4.mView.setTag(T0.b.f9129a, componentCallbacksC1573o4);
            if (viewGroup != null) {
                b();
            }
            ComponentCallbacksC1573o componentCallbacksC1573o5 = this.f16786c;
            if (componentCallbacksC1573o5.mHidden) {
                componentCallbacksC1573o5.mView.setVisibility(8);
            }
            if (AbstractC1484a0.T(this.f16786c.mView)) {
                AbstractC1484a0.n0(this.f16786c.mView);
            } else {
                View view = this.f16786c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f16786c.performViewCreated();
            A a10 = this.f16784a;
            ComponentCallbacksC1573o componentCallbacksC1573o6 = this.f16786c;
            a10.m(componentCallbacksC1573o6, componentCallbacksC1573o6.mView, bundle2, false);
            int visibility = this.f16786c.mView.getVisibility();
            this.f16786c.setPostOnViewCreatedAlpha(this.f16786c.mView.getAlpha());
            ComponentCallbacksC1573o componentCallbacksC1573o7 = this.f16786c;
            if (componentCallbacksC1573o7.mContainer != null && visibility == 0) {
                View findFocus = componentCallbacksC1573o7.mView.findFocus();
                if (findFocus != null) {
                    this.f16786c.setFocusedView(findFocus);
                    if (G.J0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f16786c);
                    }
                }
                this.f16786c.mView.setAlpha(0.0f);
            }
        }
        this.f16786c.mState = 2;
    }

    void g() {
        ComponentCallbacksC1573o f10;
        if (G.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f16786c);
        }
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
        boolean z10 = true;
        boolean z11 = componentCallbacksC1573o.mRemoving && !componentCallbacksC1573o.isInBackStack();
        if (z11) {
            ComponentCallbacksC1573o componentCallbacksC1573o2 = this.f16786c;
            if (!componentCallbacksC1573o2.mBeingSaved) {
                this.f16785b.B(componentCallbacksC1573o2.mWho, null);
            }
        }
        if (!z11 && !this.f16785b.p().q(this.f16786c)) {
            String str = this.f16786c.mTargetWho;
            if (str != null && (f10 = this.f16785b.f(str)) != null && f10.mRetainInstance) {
                this.f16786c.mTarget = f10;
            }
            this.f16786c.mState = 0;
            return;
        }
        AbstractC1582y abstractC1582y = this.f16786c.mHost;
        if (abstractC1582y instanceof androidx.lifecycle.X) {
            z10 = this.f16785b.p().n();
        } else if (abstractC1582y.f() instanceof Activity) {
            z10 = true ^ ((Activity) abstractC1582y.f()).isChangingConfigurations();
        }
        if ((z11 && !this.f16786c.mBeingSaved) || z10) {
            this.f16785b.p().f(this.f16786c);
        }
        this.f16786c.performDestroy();
        this.f16784a.d(this.f16786c, false);
        for (M m10 : this.f16785b.k()) {
            if (m10 != null) {
                ComponentCallbacksC1573o k10 = m10.k();
                if (this.f16786c.mWho.equals(k10.mTargetWho)) {
                    k10.mTarget = this.f16786c;
                    k10.mTargetWho = null;
                }
            }
        }
        ComponentCallbacksC1573o componentCallbacksC1573o3 = this.f16786c;
        String str2 = componentCallbacksC1573o3.mTargetWho;
        if (str2 != null) {
            componentCallbacksC1573o3.mTarget = this.f16785b.f(str2);
        }
        this.f16785b.s(this);
    }

    void h() {
        View view;
        if (G.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f16786c);
        }
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
        ViewGroup viewGroup = componentCallbacksC1573o.mContainer;
        if (viewGroup != null && (view = componentCallbacksC1573o.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f16786c.performDestroyView();
        this.f16784a.n(this.f16786c, false);
        ComponentCallbacksC1573o componentCallbacksC1573o2 = this.f16786c;
        componentCallbacksC1573o2.mContainer = null;
        componentCallbacksC1573o2.mView = null;
        componentCallbacksC1573o2.mViewLifecycleOwner = null;
        componentCallbacksC1573o2.mViewLifecycleOwnerLiveData.o(null);
        this.f16786c.mInLayout = false;
    }

    void i() {
        if (G.J0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f16786c);
        }
        this.f16786c.performDetach();
        this.f16784a.e(this.f16786c, false);
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
        componentCallbacksC1573o.mState = -1;
        componentCallbacksC1573o.mHost = null;
        componentCallbacksC1573o.mParentFragment = null;
        componentCallbacksC1573o.mFragmentManager = null;
        if ((!componentCallbacksC1573o.mRemoving || componentCallbacksC1573o.isInBackStack()) && !this.f16785b.p().q(this.f16786c)) {
            return;
        }
        if (G.J0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f16786c);
        }
        this.f16786c.initState();
    }

    void j() {
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
        if (componentCallbacksC1573o.mFromLayout && componentCallbacksC1573o.mInLayout && !componentCallbacksC1573o.mPerformedCreateView) {
            if (G.J0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f16786c);
            }
            Bundle bundle = this.f16786c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            ComponentCallbacksC1573o componentCallbacksC1573o2 = this.f16786c;
            componentCallbacksC1573o2.performCreateView(componentCallbacksC1573o2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f16786c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                ComponentCallbacksC1573o componentCallbacksC1573o3 = this.f16786c;
                componentCallbacksC1573o3.mView.setTag(T0.b.f9129a, componentCallbacksC1573o3);
                ComponentCallbacksC1573o componentCallbacksC1573o4 = this.f16786c;
                if (componentCallbacksC1573o4.mHidden) {
                    componentCallbacksC1573o4.mView.setVisibility(8);
                }
                this.f16786c.performViewCreated();
                A a10 = this.f16784a;
                ComponentCallbacksC1573o componentCallbacksC1573o5 = this.f16786c;
                a10.m(componentCallbacksC1573o5, componentCallbacksC1573o5.mView, bundle2, false);
                this.f16786c.mState = 2;
            }
        }
    }

    ComponentCallbacksC1573o k() {
        return this.f16786c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f16787d) {
            if (G.J0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f16787d = true;
            boolean z10 = false;
            while (true) {
                int d10 = d();
                ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
                int i10 = componentCallbacksC1573o.mState;
                if (d10 == i10) {
                    if (!z10 && i10 == -1 && componentCallbacksC1573o.mRemoving && !componentCallbacksC1573o.isInBackStack() && !this.f16786c.mBeingSaved) {
                        if (G.J0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f16786c);
                        }
                        this.f16785b.p().f(this.f16786c);
                        this.f16785b.s(this);
                        if (G.J0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f16786c);
                        }
                        this.f16786c.initState();
                    }
                    ComponentCallbacksC1573o componentCallbacksC1573o2 = this.f16786c;
                    if (componentCallbacksC1573o2.mHiddenChanged) {
                        if (componentCallbacksC1573o2.mView != null && (viewGroup = componentCallbacksC1573o2.mContainer) != null) {
                            Z r10 = Z.r(viewGroup, componentCallbacksC1573o2.getParentFragmentManager());
                            if (this.f16786c.mHidden) {
                                r10.g(this);
                            } else {
                                r10.i(this);
                            }
                        }
                        ComponentCallbacksC1573o componentCallbacksC1573o3 = this.f16786c;
                        G g10 = componentCallbacksC1573o3.mFragmentManager;
                        if (g10 != null) {
                            g10.H0(componentCallbacksC1573o3);
                        }
                        ComponentCallbacksC1573o componentCallbacksC1573o4 = this.f16786c;
                        componentCallbacksC1573o4.mHiddenChanged = false;
                        componentCallbacksC1573o4.onHiddenChanged(componentCallbacksC1573o4.mHidden);
                        this.f16786c.mChildFragmentManager.H();
                    }
                    this.f16787d = false;
                    return;
                }
                if (d10 <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (componentCallbacksC1573o.mBeingSaved && this.f16785b.q(componentCallbacksC1573o.mWho) == null) {
                                this.f16785b.B(this.f16786c.mWho, r());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f16786c.mState = 1;
                            break;
                        case 2:
                            componentCallbacksC1573o.mInLayout = false;
                            componentCallbacksC1573o.mState = 2;
                            break;
                        case 3:
                            if (G.J0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f16786c);
                            }
                            ComponentCallbacksC1573o componentCallbacksC1573o5 = this.f16786c;
                            if (componentCallbacksC1573o5.mBeingSaved) {
                                this.f16785b.B(componentCallbacksC1573o5.mWho, r());
                            } else if (componentCallbacksC1573o5.mView != null && componentCallbacksC1573o5.mSavedViewState == null) {
                                s();
                            }
                            ComponentCallbacksC1573o componentCallbacksC1573o6 = this.f16786c;
                            if (componentCallbacksC1573o6.mView != null && (viewGroup2 = componentCallbacksC1573o6.mContainer) != null) {
                                Z.r(viewGroup2, componentCallbacksC1573o6.getParentFragmentManager()).h(this);
                            }
                            this.f16786c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            componentCallbacksC1573o.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (componentCallbacksC1573o.mView != null && (viewGroup3 = componentCallbacksC1573o.mContainer) != null) {
                                Z.r(viewGroup3, componentCallbacksC1573o.getParentFragmentManager()).f(Z.c.b.from(this.f16786c.mView.getVisibility()), this);
                            }
                            this.f16786c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            componentCallbacksC1573o.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th) {
            this.f16787d = false;
            throw th;
        }
    }

    void n() {
        if (G.J0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f16786c);
        }
        this.f16786c.performPause();
        this.f16784a.f(this.f16786c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f16786c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f16786c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f16786c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
        componentCallbacksC1573o.mSavedViewState = componentCallbacksC1573o.mSavedFragmentState.getSparseParcelableArray("viewState");
        ComponentCallbacksC1573o componentCallbacksC1573o2 = this.f16786c;
        componentCallbacksC1573o2.mSavedViewRegistryState = componentCallbacksC1573o2.mSavedFragmentState.getBundle("viewRegistryState");
        L l10 = (L) this.f16786c.mSavedFragmentState.getParcelable(Keys.STATE);
        if (l10 != null) {
            ComponentCallbacksC1573o componentCallbacksC1573o3 = this.f16786c;
            componentCallbacksC1573o3.mTargetWho = l10.f16781l;
            componentCallbacksC1573o3.mTargetRequestCode = l10.f16782m;
            Boolean bool = componentCallbacksC1573o3.mSavedUserVisibleHint;
            if (bool != null) {
                componentCallbacksC1573o3.mUserVisibleHint = bool.booleanValue();
                this.f16786c.mSavedUserVisibleHint = null;
            } else {
                componentCallbacksC1573o3.mUserVisibleHint = l10.f16783n;
            }
        }
        ComponentCallbacksC1573o componentCallbacksC1573o4 = this.f16786c;
        if (componentCallbacksC1573o4.mUserVisibleHint) {
            return;
        }
        componentCallbacksC1573o4.mDeferStart = true;
    }

    void p() {
        if (G.J0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f16786c);
        }
        View focusedView = this.f16786c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (G.J0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f16786c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f16786c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f16786c.setFocusedView(null);
        this.f16786c.performResume();
        this.f16784a.i(this.f16786c, false);
        this.f16785b.B(this.f16786c.mWho, null);
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
        componentCallbacksC1573o.mSavedFragmentState = null;
        componentCallbacksC1573o.mSavedViewState = null;
        componentCallbacksC1573o.mSavedViewRegistryState = null;
    }

    ComponentCallbacksC1573o.C0289o q() {
        if (this.f16786c.mState > -1) {
            return new ComponentCallbacksC1573o.C0289o(r());
        }
        return null;
    }

    Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16786c;
        if (componentCallbacksC1573o.mState == -1 && (bundle = componentCallbacksC1573o.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(Keys.STATE, new L(this.f16786c));
        if (this.f16786c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f16786c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f16784a.j(this.f16786c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f16786c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle R02 = this.f16786c.mChildFragmentManager.R0();
            if (!R02.isEmpty()) {
                bundle2.putBundle("childFragmentManager", R02);
            }
            if (this.f16786c.mView != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.f16786c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f16786c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f16786c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void s() {
        if (this.f16786c.mView == null) {
            return;
        }
        if (G.J0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f16786c + " with view " + this.f16786c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f16786c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f16786c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f16786c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f16786c.mSavedViewRegistryState = bundle;
    }

    void t(int i10) {
        this.f16788e = i10;
    }

    void u() {
        if (G.J0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f16786c);
        }
        this.f16786c.performStart();
        this.f16784a.k(this.f16786c, false);
    }

    void v() {
        if (G.J0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f16786c);
        }
        this.f16786c.performStop();
        this.f16784a.l(this.f16786c, false);
    }

    M(A a10, O o10, ClassLoader classLoader, AbstractC1581x abstractC1581x, Bundle bundle) {
        this.f16784a = a10;
        this.f16785b = o10;
        ComponentCallbacksC1573o a11 = ((L) bundle.getParcelable(Keys.STATE)).a(abstractC1581x, classLoader);
        this.f16786c = a11;
        a11.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a11.setArguments(bundle2);
        if (G.J0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a11);
        }
    }

    M(A a10, O o10, ComponentCallbacksC1573o componentCallbacksC1573o, Bundle bundle) {
        this.f16784a = a10;
        this.f16785b = o10;
        this.f16786c = componentCallbacksC1573o;
        componentCallbacksC1573o.mSavedViewState = null;
        componentCallbacksC1573o.mSavedViewRegistryState = null;
        componentCallbacksC1573o.mBackStackNesting = 0;
        componentCallbacksC1573o.mInLayout = false;
        componentCallbacksC1573o.mAdded = false;
        ComponentCallbacksC1573o componentCallbacksC1573o2 = componentCallbacksC1573o.mTarget;
        componentCallbacksC1573o.mTargetWho = componentCallbacksC1573o2 != null ? componentCallbacksC1573o2.mWho : null;
        componentCallbacksC1573o.mTarget = null;
        componentCallbacksC1573o.mSavedFragmentState = bundle;
        componentCallbacksC1573o.mArguments = bundle.getBundle("arguments");
    }
}
