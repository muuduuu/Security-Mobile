package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.AbstractC1480b;
import androidx.core.view.InterfaceC1526w;
import androidx.lifecycle.AbstractC1592i;
import d.InterfaceC2969b;
import e.AbstractC3062d;
import e.InterfaceC3063e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import k1.d;
import y0.InterfaceC5159a;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1577t extends androidx.activity.f implements AbstractC1480b.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final C1580w mFragments = C1580w.b(new a());
    final androidx.lifecycle.r mFragmentLifecycleRegistry = new androidx.lifecycle.r(this);
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.t$a */
    class a extends AbstractC1582y implements androidx.core.content.c, androidx.core.content.d, androidx.core.app.w, androidx.core.app.x, androidx.lifecycle.X, androidx.activity.q, InterfaceC3063e, k1.f, K, InterfaceC1526w {
        public a() {
            super(AbstractActivityC1577t.this);
        }

        @Override // androidx.fragment.app.K
        public void a(G g10, ComponentCallbacksC1573o componentCallbacksC1573o) {
            AbstractActivityC1577t.this.onAttachFragment(componentCallbacksC1573o);
        }

        @Override // androidx.core.view.InterfaceC1526w
        public void addMenuProvider(androidx.core.view.B b10) {
            AbstractActivityC1577t.this.addMenuProvider(b10);
        }

        @Override // androidx.core.content.c
        public void addOnConfigurationChangedListener(InterfaceC5159a interfaceC5159a) {
            AbstractActivityC1577t.this.addOnConfigurationChangedListener(interfaceC5159a);
        }

        @Override // androidx.core.app.w
        public void addOnMultiWindowModeChangedListener(InterfaceC5159a interfaceC5159a) {
            AbstractActivityC1577t.this.addOnMultiWindowModeChangedListener(interfaceC5159a);
        }

        @Override // androidx.core.app.x
        public void addOnPictureInPictureModeChangedListener(InterfaceC5159a interfaceC5159a) {
            AbstractActivityC1577t.this.addOnPictureInPictureModeChangedListener(interfaceC5159a);
        }

        @Override // androidx.core.content.d
        public void addOnTrimMemoryListener(InterfaceC5159a interfaceC5159a) {
            AbstractActivityC1577t.this.addOnTrimMemoryListener(interfaceC5159a);
        }

        @Override // androidx.fragment.app.AbstractC1579v
        public View c(int i10) {
            return AbstractActivityC1577t.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC1579v
        public boolean d() {
            Window window = AbstractActivityC1577t.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // e.InterfaceC3063e
        public AbstractC3062d getActivityResultRegistry() {
            return AbstractActivityC1577t.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC1599p
        public AbstractC1592i getLifecycle() {
            return AbstractActivityC1577t.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.q
        public androidx.activity.o getOnBackPressedDispatcher() {
            return AbstractActivityC1577t.this.getOnBackPressedDispatcher();
        }

        @Override // k1.f
        public k1.d getSavedStateRegistry() {
            return AbstractActivityC1577t.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.X
        public androidx.lifecycle.W getViewModelStore() {
            return AbstractActivityC1577t.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC1582y
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC1577t.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC1582y
        public LayoutInflater j() {
            return AbstractActivityC1577t.this.getLayoutInflater().cloneInContext(AbstractActivityC1577t.this);
        }

        @Override // androidx.fragment.app.AbstractC1582y
        public boolean l(String str) {
            return AbstractC1480b.y(AbstractActivityC1577t.this, str);
        }

        @Override // androidx.fragment.app.AbstractC1582y
        public void o() {
            p();
        }

        public void p() {
            AbstractActivityC1577t.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.AbstractC1582y
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC1577t i() {
            return AbstractActivityC1577t.this;
        }

        @Override // androidx.core.view.InterfaceC1526w
        public void removeMenuProvider(androidx.core.view.B b10) {
            AbstractActivityC1577t.this.removeMenuProvider(b10);
        }

        @Override // androidx.core.content.c
        public void removeOnConfigurationChangedListener(InterfaceC5159a interfaceC5159a) {
            AbstractActivityC1577t.this.removeOnConfigurationChangedListener(interfaceC5159a);
        }

        @Override // androidx.core.app.w
        public void removeOnMultiWindowModeChangedListener(InterfaceC5159a interfaceC5159a) {
            AbstractActivityC1577t.this.removeOnMultiWindowModeChangedListener(interfaceC5159a);
        }

        @Override // androidx.core.app.x
        public void removeOnPictureInPictureModeChangedListener(InterfaceC5159a interfaceC5159a) {
            AbstractActivityC1577t.this.removeOnPictureInPictureModeChangedListener(interfaceC5159a);
        }

        @Override // androidx.core.content.d
        public void removeOnTrimMemoryListener(InterfaceC5159a interfaceC5159a) {
            AbstractActivityC1577t.this.removeOnTrimMemoryListener(interfaceC5159a);
        }
    }

    public AbstractActivityC1577t() {
        t();
    }

    private void t() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new d.c() { // from class: androidx.fragment.app.p
            @Override // k1.d.c
            public final Bundle a() {
                Bundle u10;
                u10 = AbstractActivityC1577t.this.u();
                return u10;
            }
        });
        addOnConfigurationChangedListener(new InterfaceC5159a() { // from class: androidx.fragment.app.q
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                AbstractActivityC1577t.this.v((Configuration) obj);
            }
        });
        addOnNewIntentListener(new InterfaceC5159a() { // from class: androidx.fragment.app.r
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                AbstractActivityC1577t.this.w((Intent) obj);
            }
        });
        addOnContextAvailableListener(new InterfaceC2969b() { // from class: androidx.fragment.app.s
            @Override // d.InterfaceC2969b
            public final void a(Context context) {
                AbstractActivityC1577t.this.x(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle u() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.i(AbstractC1592i.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(Configuration configuration) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Intent intent) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Context context) {
        this.mFragments.a(null);
    }

    private static boolean y(G g10, AbstractC1592i.b bVar) {
        boolean z10 = false;
        for (ComponentCallbacksC1573o componentCallbacksC1573o : g10.v0()) {
            if (componentCallbacksC1573o != null) {
                if (componentCallbacksC1573o.getHost() != null) {
                    z10 |= y(componentCallbacksC1573o.getChildFragmentManager(), bVar);
                }
                U u10 = componentCallbacksC1573o.mViewLifecycleOwner;
                if (u10 != null && u10.getLifecycle().b().isAtLeast(AbstractC1592i.b.STARTED)) {
                    componentCallbacksC1573o.mViewLifecycleOwner.f(bVar);
                    z10 = true;
                }
                if (componentCallbacksC1573o.mLifecycleRegistry.b().isAtLeast(AbstractC1592i.b.STARTED)) {
                    componentCallbacksC1573o.mLifecycleRegistry.n(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().V(str, fileDescriptor, printWriter, strArr);
        }
    }

    public G getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        while (y(getSupportFragmentManager(), AbstractC1592i.b.CREATED)) {
        }
    }

    @Override // androidx.activity.f, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(ComponentCallbacksC1573o componentCallbacksC1573o) {
    }

    @Override // androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.i(AbstractC1592i.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.i(AbstractC1592i.a.ON_DESTROY);
    }

    @Override // androidx.activity.f, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.i(AbstractC1592i.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.f, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.i(AbstractC1592i.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.i(AbstractC1592i.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.i(AbstractC1592i.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.C c10) {
        AbstractC1480b.w(this, c10);
    }

    public void setExitSharedElementCallback(androidx.core.app.C c10) {
        AbstractC1480b.x(this, c10);
    }

    public void startActivityFromFragment(ComponentCallbacksC1573o componentCallbacksC1573o, Intent intent, int i10) {
        startActivityFromFragment(componentCallbacksC1573o, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(ComponentCallbacksC1573o componentCallbacksC1573o, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 == -1) {
            AbstractC1480b.A(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            componentCallbacksC1573o.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        AbstractC1480b.r(this);
    }

    public void supportPostponeEnterTransition() {
        AbstractC1480b.t(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC1480b.B(this);
    }

    @Override // androidx.core.app.AbstractC1480b.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public void startActivityFromFragment(ComponentCallbacksC1573o componentCallbacksC1573o, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            AbstractC1480b.z(this, intent, -1, bundle);
        } else {
            componentCallbacksC1573o.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }
}
