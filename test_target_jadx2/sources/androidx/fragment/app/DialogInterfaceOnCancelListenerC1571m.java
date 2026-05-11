package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.InterfaceC1599p;
import androidx.lifecycle.InterfaceC1608z;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1571m extends ComponentCallbacksC1573o implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    private Handler f16948a;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16957j;

    /* renamed from: l, reason: collision with root package name */
    private Dialog f16959l;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16960o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16961p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16962q;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f16949b = new a();

    /* renamed from: c, reason: collision with root package name */
    private DialogInterface.OnCancelListener f16950c = new b();

    /* renamed from: d, reason: collision with root package name */
    private DialogInterface.OnDismissListener f16951d = new c();

    /* renamed from: e, reason: collision with root package name */
    private int f16952e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f16953f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16954g = true;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16955h = true;

    /* renamed from: i, reason: collision with root package name */
    private int f16956i = -1;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC1608z f16958k = new d();

    /* renamed from: r, reason: collision with root package name */
    private boolean f16963r = false;

    /* renamed from: androidx.fragment.app.m$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC1571m.this.f16951d.onDismiss(DialogInterfaceOnCancelListenerC1571m.this.f16959l);
        }
    }

    /* renamed from: androidx.fragment.app.m$b */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1571m.this.f16959l != null) {
                DialogInterfaceOnCancelListenerC1571m dialogInterfaceOnCancelListenerC1571m = DialogInterfaceOnCancelListenerC1571m.this;
                dialogInterfaceOnCancelListenerC1571m.onCancel(dialogInterfaceOnCancelListenerC1571m.f16959l);
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$c */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1571m.this.f16959l != null) {
                DialogInterfaceOnCancelListenerC1571m dialogInterfaceOnCancelListenerC1571m = DialogInterfaceOnCancelListenerC1571m.this;
                dialogInterfaceOnCancelListenerC1571m.onDismiss(dialogInterfaceOnCancelListenerC1571m.f16959l);
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$d */
    class d implements InterfaceC1608z {
        d() {
        }

        @Override // androidx.lifecycle.InterfaceC1608z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC1599p interfaceC1599p) {
            if (interfaceC1599p == null || !DialogInterfaceOnCancelListenerC1571m.this.f16955h) {
                return;
            }
            View requireView = DialogInterfaceOnCancelListenerC1571m.this.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC1571m.this.f16959l != null) {
                if (G.J0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC1571m.this.f16959l);
                }
                DialogInterfaceOnCancelListenerC1571m.this.f16959l.setContentView(requireView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$e */
    class e extends AbstractC1579v {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1579v f16968a;

        e(AbstractC1579v abstractC1579v) {
            this.f16968a = abstractC1579v;
        }

        @Override // androidx.fragment.app.AbstractC1579v
        public View c(int i10) {
            return this.f16968a.d() ? this.f16968a.c(i10) : DialogInterfaceOnCancelListenerC1571m.this.N(i10);
        }

        @Override // androidx.fragment.app.AbstractC1579v
        public boolean d() {
            return this.f16968a.d() || DialogInterfaceOnCancelListenerC1571m.this.O();
        }
    }

    private void J(boolean z10, boolean z11, boolean z12) {
        if (this.f16961p) {
            return;
        }
        this.f16961p = true;
        this.f16962q = false;
        Dialog dialog = this.f16959l;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f16959l.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f16948a.getLooper()) {
                    onDismiss(this.f16959l);
                } else {
                    this.f16948a.post(this.f16949b);
                }
            }
        }
        this.f16960o = true;
        if (this.f16956i >= 0) {
            if (z12) {
                getParentFragmentManager().f1(this.f16956i, 1);
            } else {
                getParentFragmentManager().d1(this.f16956i, 1, z10);
            }
            this.f16956i = -1;
            return;
        }
        P n10 = getParentFragmentManager().n();
        n10.t(true);
        n10.m(this);
        if (z12) {
            n10.i();
        } else if (z10) {
            n10.h();
        } else {
            n10.g();
        }
    }

    private void P(Bundle bundle) {
        if (this.f16955h && !this.f16963r) {
            try {
                this.f16957j = true;
                Dialog M10 = M(bundle);
                this.f16959l = M10;
                if (this.f16955h) {
                    T(M10, this.f16952e);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f16959l.setOwnerActivity((Activity) context);
                    }
                    this.f16959l.setCancelable(this.f16954g);
                    this.f16959l.setOnCancelListener(this.f16950c);
                    this.f16959l.setOnDismissListener(this.f16951d);
                    this.f16963r = true;
                } else {
                    this.f16959l = null;
                }
                this.f16957j = false;
            } catch (Throwable th) {
                this.f16957j = false;
                throw th;
            }
        }
    }

    public void H() {
        J(false, false, false);
    }

    public void I() {
        J(true, false, false);
    }

    public Dialog K() {
        return this.f16959l;
    }

    public int L() {
        return this.f16953f;
    }

    public Dialog M(Bundle bundle) {
        if (G.J0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.j(requireContext(), L());
    }

    View N(int i10) {
        Dialog dialog = this.f16959l;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    boolean O() {
        return this.f16963r;
    }

    public final Dialog Q() {
        Dialog K10 = K();
        if (K10 != null) {
            return K10;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void R(boolean z10) {
        this.f16954g = z10;
        Dialog dialog = this.f16959l;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void S(boolean z10) {
        this.f16955h = z10;
    }

    public void T(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void U(G g10, String str) {
        this.f16961p = false;
        this.f16962q = true;
        P n10 = g10.n();
        n10.t(true);
        n10.e(this, str);
        n10.g();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    AbstractC1579v createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().j(this.f16958k);
        if (this.f16962q) {
            return;
        }
        this.f16961p = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16948a = new Handler();
        this.f16955h = this.mContainerId == 0;
        if (bundle != null) {
            this.f16952e = bundle.getInt("android:style", 0);
            this.f16953f = bundle.getInt("android:theme", 0);
            this.f16954g = bundle.getBoolean("android:cancelable", true);
            this.f16955h = bundle.getBoolean("android:showsDialog", this.f16955h);
            this.f16956i = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f16959l;
        if (dialog != null) {
            this.f16960o = true;
            dialog.setOnDismissListener(null);
            this.f16959l.dismiss();
            if (!this.f16961p) {
                onDismiss(this.f16959l);
            }
            this.f16959l = null;
            this.f16963r = false;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onDetach() {
        super.onDetach();
        if (!this.f16962q && !this.f16961p) {
            this.f16961p = true;
        }
        getViewLifecycleOwnerLiveData().n(this.f16958k);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f16960o) {
            return;
        }
        if (G.J0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        J(true, true, false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f16955h && !this.f16957j) {
            P(bundle);
            if (G.J0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f16959l;
            return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
        }
        if (G.J0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.f16955h) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return onGetLayoutInflater;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f16959l;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f16952e;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f16953f;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f16954g;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f16955h;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f16956i;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f16959l;
        if (dialog != null) {
            this.f16960o = false;
            dialog.show();
            View decorView = this.f16959l.getWindow().getDecorView();
            androidx.lifecycle.Y.b(decorView, this);
            androidx.lifecycle.Z.a(decorView, this);
            k1.g.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f16959l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f16959l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f16959l.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f16959l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f16959l.onRestoreInstanceState(bundle2);
    }
}
