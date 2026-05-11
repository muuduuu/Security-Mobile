package p;

import android.content.Context;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.fragment.app.G;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private G f38129a;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f38130a;

        /* renamed from: b, reason: collision with root package name */
        private final int f38131b;

        b(c cVar, int i10) {
            this.f38130a = cVar;
            this.f38131b = i10;
        }

        public int a() {
            return this.f38131b;
        }

        public c b() {
            return this.f38130a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f38136a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f38137b;

        /* renamed from: c, reason: collision with root package name */
        private final CharSequence f38138c;

        /* renamed from: d, reason: collision with root package name */
        private final CharSequence f38139d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f38140e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f38141f;

        /* renamed from: g, reason: collision with root package name */
        private final int f38142g;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private CharSequence f38143a = null;

            /* renamed from: b, reason: collision with root package name */
            private CharSequence f38144b = null;

            /* renamed from: c, reason: collision with root package name */
            private CharSequence f38145c = null;

            /* renamed from: d, reason: collision with root package name */
            private CharSequence f38146d = null;

            /* renamed from: e, reason: collision with root package name */
            private boolean f38147e = true;

            /* renamed from: f, reason: collision with root package name */
            private boolean f38148f = false;

            /* renamed from: g, reason: collision with root package name */
            private int f38149g = 0;

            public d a() {
                if (TextUtils.isEmpty(this.f38143a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!AbstractC3782b.f(this.f38149g)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + AbstractC3782b.a(this.f38149g));
                }
                int i10 = this.f38149g;
                boolean d10 = i10 != 0 ? AbstractC3782b.d(i10) : this.f38148f;
                if (TextUtils.isEmpty(this.f38146d) && !d10) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.f38146d) || !d10) {
                    return new d(this.f38143a, this.f38144b, this.f38145c, this.f38146d, this.f38147e, this.f38148f, this.f38149g);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }

            public a b(int i10) {
                this.f38149g = i10;
                return this;
            }

            public a c(boolean z10) {
                this.f38147e = z10;
                return this;
            }

            public a d(CharSequence charSequence) {
                this.f38146d = charSequence;
                return this;
            }

            public a e(CharSequence charSequence) {
                this.f38143a = charSequence;
                return this;
            }
        }

        d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10, boolean z11, int i10) {
            this.f38136a = charSequence;
            this.f38137b = charSequence2;
            this.f38138c = charSequence3;
            this.f38139d = charSequence4;
            this.f38140e = z10;
            this.f38141f = z11;
            this.f38142g = i10;
        }

        public int a() {
            return this.f38142g;
        }

        public CharSequence b() {
            return this.f38138c;
        }

        public CharSequence c() {
            CharSequence charSequence = this.f38139d;
            return charSequence != null ? charSequence : BuildConfig.FLAVOR;
        }

        public CharSequence d() {
            return this.f38137b;
        }

        public CharSequence e() {
            return this.f38136a;
        }

        public boolean f() {
            return this.f38140e;
        }

        public boolean g() {
            return this.f38141f;
        }
    }

    public n(AbstractActivityC1577t abstractActivityC1577t, Executor executor, a aVar) {
        if (abstractActivityC1577t == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        i(abstractActivityC1577t.getSupportFragmentManager(), h(abstractActivityC1577t), executor, aVar);
    }

    private void c(d dVar, c cVar) {
        G g10 = this.f38129a;
        if (g10 == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (g10.Q0()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            f(this.f38129a).M(dVar, cVar);
        }
    }

    private static l e(G g10) {
        return (l) g10.i0("androidx.biometric.BiometricFragment");
    }

    private static l f(G g10) {
        l e10 = e(g10);
        if (e10 != null) {
            return e10;
        }
        l n02 = l.n0();
        g10.n().e(n02, "androidx.biometric.BiometricFragment").h();
        g10.d0();
        return n02;
    }

    static Context g(ComponentCallbacksC1573o componentCallbacksC1573o) {
        AbstractActivityC1577t activity = componentCallbacksC1573o.getActivity();
        return activity != null ? activity : componentCallbacksC1573o.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static o h(Context context) {
        if (context instanceof X) {
            return (o) new V((X) context).a(o.class);
        }
        return null;
    }

    private void i(G g10, o oVar, Executor executor, a aVar) {
        this.f38129a = g10;
        if (oVar != null) {
            if (executor != null) {
                oVar.Q(executor);
            }
            oVar.P(aVar);
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        c(dVar, null);
    }

    public void b(d dVar, c cVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
        int c10 = AbstractC3782b.c(dVar, cVar);
        if (AbstractC3782b.g(c10)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && AbstractC3782b.d(c10)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        c(dVar, cVar);
    }

    public void d() {
        G g10 = this.f38129a;
        if (g10 == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        l e10 = e(g10);
        if (e10 == null) {
            Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
        } else {
            e10.P(3);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f38132a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f38133b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f38134c;

        /* renamed from: d, reason: collision with root package name */
        private final IdentityCredential f38135d;

        public c(Signature signature) {
            this.f38132a = signature;
            this.f38133b = null;
            this.f38134c = null;
            this.f38135d = null;
        }

        public Cipher a() {
            return this.f38133b;
        }

        public IdentityCredential b() {
            return this.f38135d;
        }

        public Mac c() {
            return this.f38134c;
        }

        public Signature d() {
            return this.f38132a;
        }

        public c(Cipher cipher) {
            this.f38132a = null;
            this.f38133b = cipher;
            this.f38134c = null;
            this.f38135d = null;
        }

        public c(Mac mac) {
            this.f38132a = null;
            this.f38133b = null;
            this.f38134c = mac;
            this.f38135d = null;
        }

        public c(IdentityCredential identityCredential) {
            this.f38132a = null;
            this.f38133b = null;
            this.f38134c = null;
            this.f38135d = identityCredential;
        }
    }

    public static abstract class a {
        public void b() {
        }

        public void c(b bVar) {
        }

        public void a(int i10, CharSequence charSequence) {
        }
    }
}
