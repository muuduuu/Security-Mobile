package p;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.fragment.app.G;
import androidx.lifecycle.InterfaceC1608z;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import org.conscrypt.BuildConfig;
import p.n;

/* loaded from: classes.dex */
public class l extends ComponentCallbacksC1573o {

    /* renamed from: a, reason: collision with root package name */
    private i f38109a = new h();

    /* renamed from: b, reason: collision with root package name */
    private o f38110b;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f38111a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n.b f38112b;

        a(o oVar, n.b bVar) {
            this.f38111a = oVar;
            this.f38112b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38111a.l().c(this.f38112b);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f38114a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38115b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f38116c;

        b(o oVar, int i10, CharSequence charSequence) {
            this.f38114a = oVar;
            this.f38115b = i10;
            this.f38116c = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38114a.l().a(this.f38115b, this.f38116c);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f38118a;

        c(o oVar) {
            this.f38118a = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38118a.l().b();
        }
    }

    private static class d {
        static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    private static class e {
        static void a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static void b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static BiometricPrompt c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class f {
        static void a(BiometricPrompt.Builder builder, boolean z10) {
            builder.setConfirmationRequired(z10);
        }

        static void b(BiometricPrompt.Builder builder, boolean z10) {
            builder.setDeviceCredentialAllowed(z10);
        }
    }

    private static class g {
        static void a(BiometricPrompt.Builder builder, int i10) {
            builder.setAllowedAuthenticators(i10);
        }
    }

    static class h implements i {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f38120a = new Handler(Looper.getMainLooper());

        h() {
        }

        @Override // p.l.i
        public o a(Context context) {
            return n.h(context);
        }

        @Override // p.l.i
        public boolean b(Context context) {
            return v.b(context);
        }

        @Override // p.l.i
        public boolean c(Context context) {
            return v.a(context);
        }

        @Override // p.l.i
        public boolean d(Context context) {
            return v.c(context);
        }

        @Override // p.l.i
        public Handler getHandler() {
            return this.f38120a;
        }
    }

    interface i {
        o a(Context context);

        boolean b(Context context);

        boolean c(Context context);

        boolean d(Context context);

        Handler getHandler();
    }

    private static class j implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f38121a = new Handler(Looper.getMainLooper());

        j() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f38121a.post(runnable);
        }
    }

    private static class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f38122a;

        k(l lVar) {
            this.f38122a = new WeakReference(lVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38122a.get() != null) {
                ((l) this.f38122a.get()).D0();
            }
        }
    }

    /* renamed from: p.l$l, reason: collision with other inner class name */
    private static class RunnableC0587l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f38123a;

        RunnableC0587l(o oVar) {
            this.f38123a = new WeakReference(oVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38123a.get() != null) {
                ((o) this.f38123a.get()).T(false);
            }
        }
    }

    private static class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f38124a;

        m(o oVar) {
            this.f38124a = new WeakReference(oVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38124a.get() != null) {
                ((o) this.f38124a.get()).Z(false);
            }
        }
    }

    private void A0() {
        BiometricPrompt.Builder d10 = e.d(requireContext().getApplicationContext());
        o V10 = V();
        if (V10 == null) {
            Log.e("BiometricFragment", "Not showing biometric prompt. View model was null.");
            return;
        }
        CharSequence w10 = V10.w();
        CharSequence v10 = V10.v();
        CharSequence o10 = V10.o();
        if (w10 != null) {
            e.h(d10, w10);
        }
        if (v10 != null) {
            e.g(d10, v10);
        }
        if (o10 != null) {
            e.e(d10, o10);
        }
        CharSequence u10 = V10.u();
        if (!TextUtils.isEmpty(u10)) {
            e.f(d10, u10, V10.m(), V10.t());
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f.a(d10, V10.z());
        }
        int e10 = V10.e();
        if (i10 >= 30) {
            g.a(d10, e10);
        } else if (i10 >= 29) {
            f.b(d10, AbstractC3782b.d(e10));
        }
        N(e.c(d10), getContext());
    }

    private void B0() {
        Context applicationContext = requireContext().getApplicationContext();
        androidx.core.hardware.fingerprint.a c10 = androidx.core.hardware.fingerprint.a.c(applicationContext);
        int Q10 = Q(c10);
        if (Q10 != 0) {
            k0(Q10, s.a(applicationContext, Q10));
            return;
        }
        final o V10 = V();
        if (V10 == null || !isAdded()) {
            return;
        }
        V10.V(true);
        if (!r.f(applicationContext, Build.MODEL)) {
            this.f38109a.getHandler().postDelayed(new Runnable() { // from class: p.d
                @Override // java.lang.Runnable
                public final void run() {
                    o.this.V(false);
                }
            }, 500L);
            t.Y().U(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
        }
        V10.N(0);
        O(c10, applicationContext);
    }

    private void C0(CharSequence charSequence) {
        o V10 = V();
        if (V10 != null) {
            if (charSequence == null) {
                charSequence = getString(AbstractC3780B.f38075b);
            }
            V10.Y(2);
            V10.W(charSequence);
        }
    }

    private static int Q(androidx.core.hardware.fingerprint.a aVar) {
        if (aVar.f()) {
            return !aVar.e() ? 11 : 0;
        }
        return 12;
    }

    private void R() {
        final o V10 = V();
        if (V10 != null) {
            V10.O(getActivity());
            V10.i().i(this, new InterfaceC1608z() { // from class: p.e
                @Override // androidx.lifecycle.InterfaceC1608z
                public final void b(Object obj) {
                    l.this.e0(V10, (n.b) obj);
                }
            });
            V10.g().i(this, new InterfaceC1608z() { // from class: p.f
                @Override // androidx.lifecycle.InterfaceC1608z
                public final void b(Object obj) {
                    l.this.f0(V10, (C3783c) obj);
                }
            });
            V10.h().i(this, new InterfaceC1608z() { // from class: p.g
                @Override // androidx.lifecycle.InterfaceC1608z
                public final void b(Object obj) {
                    l.this.g0(V10, (CharSequence) obj);
                }
            });
            V10.x().i(this, new InterfaceC1608z() { // from class: p.h
                @Override // androidx.lifecycle.InterfaceC1608z
                public final void b(Object obj) {
                    l.this.h0(V10, (Boolean) obj);
                }
            });
            V10.F().i(this, new InterfaceC1608z() { // from class: p.i
                @Override // androidx.lifecycle.InterfaceC1608z
                public final void b(Object obj) {
                    l.this.i0(V10, (Boolean) obj);
                }
            });
            V10.C().i(this, new InterfaceC1608z() { // from class: p.j
                @Override // androidx.lifecycle.InterfaceC1608z
                public final void b(Object obj) {
                    l.this.j0(V10, (Boolean) obj);
                }
            });
        }
    }

    private void T() {
        o V10 = V();
        if (V10 != null) {
            V10.d0(false);
        }
        if (isAdded()) {
            G parentFragmentManager = getParentFragmentManager();
            t tVar = (t) parentFragmentManager.i0("androidx.biometric.FingerprintDialogFragment");
            if (tVar != null) {
                if (tVar.isAdded()) {
                    tVar.I();
                } else {
                    parentFragmentManager.n().m(tVar).h();
                }
            }
        }
    }

    private int U() {
        Context context = getContext();
        return (context == null || !r.f(context, Build.MODEL)) ? 2000 : 0;
    }

    private o V() {
        if (this.f38110b == null) {
            this.f38110b = this.f38109a.a(n.g(this));
        }
        return this.f38110b;
    }

    private void W(int i10) {
        int i11 = -1;
        if (i10 != -1) {
            k0(10, getString(AbstractC3780B.f38085l));
            return;
        }
        o V10 = V();
        if (V10 == null || !V10.H()) {
            i11 = 1;
        } else {
            V10.e0(false);
        }
        y0(new n.b(null, i11));
    }

    private boolean X() {
        AbstractActivityC1577t activity = getActivity();
        return activity != null && activity.isChangingConfigurations();
    }

    private boolean Y() {
        Context g10 = n.g(this);
        o V10 = V();
        return (g10 == null || V10 == null || V10.n() == null || !r.g(g10, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    private boolean Z() {
        return Build.VERSION.SDK_INT == 28 && !this.f38109a.b(getContext());
    }

    private boolean a0() {
        Context context = getContext();
        if (context == null || !r.h(context, Build.MANUFACTURER)) {
            return false;
        }
        o V10 = V();
        int e10 = V10 != null ? V10.e() : 0;
        if (V10 == null || !AbstractC3782b.g(e10) || !AbstractC3782b.d(e10)) {
            return false;
        }
        V10.e0(true);
        return true;
    }

    private boolean b0() {
        Context context = getContext();
        if (Build.VERSION.SDK_INT != 29 || this.f38109a.b(context) || this.f38109a.c(context) || this.f38109a.d(context)) {
            return c0() && p.m.g(context).a(255) != 0;
        }
        return true;
    }

    private boolean d0() {
        return Build.VERSION.SDK_INT < 28 || Y() || Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(o oVar, n.b bVar) {
        if (bVar != null) {
            r0(bVar);
            oVar.L(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(o oVar, C3783c c3783c) {
        if (c3783c != null) {
            o0(c3783c.b(), c3783c.c());
            oVar.I(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(o oVar, CharSequence charSequence) {
        if (charSequence != null) {
            q0(charSequence);
            oVar.I(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(o oVar, Boolean bool) {
        if (bool.booleanValue()) {
            p0();
            oVar.J(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(o oVar, Boolean bool) {
        if (bool.booleanValue()) {
            if (c0()) {
                t0();
            } else {
                s0();
            }
            oVar.a0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(o oVar, Boolean bool) {
        if (bool.booleanValue()) {
            P(1);
            S();
            oVar.U(false);
        }
    }

    private void m0() {
        Context g10 = n.g(this);
        if (g10 == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client context not found.");
            return;
        }
        o V10 = V();
        if (V10 == null) {
            Log.e("BiometricFragment", "Failed to check device credential. View model was null.");
            return;
        }
        KeyguardManager a10 = u.a(g10);
        if (a10 == null) {
            k0(12, getString(AbstractC3780B.f38084k));
            return;
        }
        CharSequence w10 = V10.w();
        CharSequence v10 = V10.v();
        CharSequence o10 = V10.o();
        if (v10 == null) {
            v10 = o10;
        }
        Intent a11 = d.a(a10, w10, v10);
        if (a11 == null) {
            k0(14, getString(AbstractC3780B.f38083j));
            return;
        }
        V10.R(true);
        if (d0()) {
            T();
        }
        a11.setFlags(134742016);
        startActivityForResult(a11, 1);
    }

    static l n0() {
        return new l();
    }

    private void v0(int i10, CharSequence charSequence) {
        o V10 = V();
        if (V10 == null) {
            Log.e("BiometricFragment", "Unable to send error to client. View model was null.");
            return;
        }
        if (V10.A()) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!V10.y()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            V10.M(false);
            V10.m().execute(new b(V10, i10, charSequence));
        }
    }

    private void w0() {
        o V10 = V();
        if (V10 == null) {
            Log.e("BiometricFragment", "Unable to send failure to client. View model was null.");
        } else if (V10.y()) {
            V10.m().execute(new c(V10));
        } else {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    private void y0(n.b bVar) {
        z0(bVar);
        S();
    }

    private void z0(n.b bVar) {
        o V10 = V();
        if (V10 == null) {
            Log.e("BiometricFragment", "Unable to send success to client. View model was null.");
        } else if (!V10.y()) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            V10.M(false);
            V10.m().execute(new a(V10, bVar));
        }
    }

    void D0() {
        o V10 = V();
        if (V10 == null || V10.G()) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        V10.d0(true);
        V10.M(true);
        if (a0()) {
            m0();
        } else if (d0()) {
            B0();
        } else {
            A0();
        }
    }

    void M(n.d dVar, n.c cVar) {
        if (n.g(this) == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client context was null.");
            return;
        }
        o V10 = V();
        if (V10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. View model was null.");
            return;
        }
        V10.c0(dVar);
        int c10 = AbstractC3782b.c(dVar, cVar);
        if (Build.VERSION.SDK_INT < 30 && c10 == 15 && cVar == null) {
            V10.S(q.a());
        } else {
            V10.S(cVar);
        }
        if (c0()) {
            V10.b0(getString(AbstractC3780B.f38074a));
        } else {
            V10.b0(null);
        }
        if (b0()) {
            V10.M(true);
            m0();
        } else if (V10.B()) {
            this.f38109a.getHandler().postDelayed(new k(this), 600L);
        } else {
            D0();
        }
    }

    void N(BiometricPrompt biometricPrompt, Context context) {
        o V10 = V();
        if (V10 == null) {
            Log.e("BiometricFragment", "Not authenticating with biometric prompt. View model was null.");
            return;
        }
        BiometricPrompt.CryptoObject d10 = q.d(V10.n());
        CancellationSignal b10 = V10.k().b();
        j jVar = new j();
        BiometricPrompt$AuthenticationCallback a10 = V10.f().a();
        try {
            if (d10 == null) {
                e.b(biometricPrompt, b10, jVar, a10);
            } else {
                e.a(biometricPrompt, d10, b10, jVar, a10);
            }
        } catch (NullPointerException e10) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e10);
            k0(1, context != null ? context.getString(AbstractC3780B.f38075b) : BuildConfig.FLAVOR);
        }
    }

    void O(androidx.core.hardware.fingerprint.a aVar, Context context) {
        o V10 = V();
        if (V10 == null) {
            Log.e("BiometricFragment", "Not showing fingerprint dialog. View model was null.");
            return;
        }
        try {
            aVar.b(q.e(V10.n()), 0, V10.k().c(), V10.f().b(), null);
        } catch (NullPointerException e10) {
            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e10);
            k0(1, s.a(context, 1));
        }
    }

    void P(int i10) {
        o V10 = V();
        if (V10 == null) {
            Log.e("BiometricFragment", "Unable to cancel authentication. View model was null.");
            return;
        }
        if (i10 == 3 || !V10.E()) {
            if (d0()) {
                V10.N(i10);
                if (i10 == 1) {
                    v0(10, s.a(getContext(), 10));
                }
            }
            V10.k().a();
        }
    }

    void S() {
        T();
        o V10 = V();
        if (V10 != null) {
            V10.d0(false);
        }
        if (V10 == null || (!V10.A() && isAdded())) {
            getParentFragmentManager().n().m(this).h();
        }
        Context context = getContext();
        if (context == null || !r.e(context, Build.MODEL)) {
            return;
        }
        if (V10 != null) {
            V10.T(true);
        }
        this.f38109a.getHandler().postDelayed(new RunnableC0587l(this.f38110b), 600L);
    }

    boolean c0() {
        o V10 = V();
        return Build.VERSION.SDK_INT <= 28 && V10 != null && AbstractC3782b.d(V10.e());
    }

    void o0(final int i10, final CharSequence charSequence) {
        if (!s.b(i10)) {
            i10 = 8;
        }
        o V10 = V();
        if (V10 == null) {
            Log.e("BiometricFragment", "Unable to handle authentication error. View model was null.");
            return;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && s.c(i10) && context != null && u.b(context) && AbstractC3782b.d(V10.e())) {
            m0();
            return;
        }
        if (!d0()) {
            if (charSequence == null) {
                charSequence = getString(AbstractC3780B.f38075b) + " " + i10;
            }
            k0(i10, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = s.a(getContext(), i10);
        }
        if (i10 == 5) {
            int j10 = V10.j();
            if (j10 == 0 || j10 == 3) {
                v0(i10, charSequence);
            }
            S();
            return;
        }
        if (V10.D()) {
            k0(i10, charSequence);
        } else {
            C0(charSequence);
            this.f38109a.getHandler().postDelayed(new Runnable() { // from class: p.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.k0(i10, charSequence);
                }
            }, U());
        }
        V10.V(true);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            o V10 = V();
            if (V10 != null) {
                V10.R(false);
            }
            W(i11);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onStart() {
        super.onStart();
        o V10 = V();
        if (Build.VERSION.SDK_INT == 29 && V10 != null && AbstractC3782b.d(V10.e())) {
            V10.Z(true);
            this.f38109a.getHandler().postDelayed(new m(V10), 250L);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onStop() {
        super.onStop();
        o V10 = V();
        if (Build.VERSION.SDK_INT >= 29 || V10 == null || V10.A() || X()) {
            return;
        }
        P(0);
    }

    void p0() {
        if (d0()) {
            C0(getString(AbstractC3780B.f38082i));
        }
        w0();
    }

    void q0(CharSequence charSequence) {
        if (d0()) {
            C0(charSequence);
        }
    }

    void r0(n.b bVar) {
        y0(bVar);
    }

    void s0() {
        o V10 = V();
        CharSequence u10 = V10 != null ? V10.u() : null;
        if (u10 == null) {
            u10 = getString(AbstractC3780B.f38075b);
        }
        k0(13, u10);
        P(2);
    }

    void t0() {
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public void k0(int i10, CharSequence charSequence) {
        v0(i10, charSequence);
        S();
    }
}
