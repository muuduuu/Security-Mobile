package p;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import androidx.core.hardware.fingerprint.a;
import p.n;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3781a {

    /* renamed from: a, reason: collision with root package name */
    private BiometricPrompt$AuthenticationCallback f38086a;

    /* renamed from: b, reason: collision with root package name */
    private a.c f38087b;

    /* renamed from: c, reason: collision with root package name */
    final d f38088c;

    /* renamed from: p.a$a, reason: collision with other inner class name */
    class C0585a extends a.c {
        C0585a() {
        }

        @Override // androidx.core.hardware.fingerprint.a.c
        public void a(int i10, CharSequence charSequence) {
            C3781a.this.f38088c.a(i10, charSequence);
        }

        @Override // androidx.core.hardware.fingerprint.a.c
        public void b() {
            C3781a.this.f38088c.b();
        }

        @Override // androidx.core.hardware.fingerprint.a.c
        public void c(int i10, CharSequence charSequence) {
            C3781a.this.f38088c.c(charSequence);
        }

        @Override // androidx.core.hardware.fingerprint.a.c
        public void d(a.d dVar) {
            C3781a.this.f38088c.d(new n.b(dVar != null ? q.c(dVar.a()) : null, 2));
        }
    }

    /* renamed from: p.a$c */
    private static class c {
        static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* renamed from: p.a$d */
    static class d {
        d() {
        }

        abstract void a(int i10, CharSequence charSequence);

        abstract void b();

        abstract void c(CharSequence charSequence);

        abstract void d(n.b bVar);
    }

    C3781a(d dVar) {
        this.f38088c = dVar;
    }

    BiometricPrompt$AuthenticationCallback a() {
        if (this.f38086a == null) {
            this.f38086a = b.a(this.f38088c);
        }
        return this.f38086a;
    }

    a.c b() {
        if (this.f38087b == null) {
            this.f38087b = new C0585a();
        }
        return this.f38087b;
    }

    /* renamed from: p.a$b */
    private static class b {
        static BiometricPrompt$AuthenticationCallback a(d dVar) {
            return new C0586a(dVar);
        }

        static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getCryptoObject();
        }

        /* renamed from: p.a$b$a, reason: collision with other inner class name */
        class C0586a extends BiometricPrompt$AuthenticationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f38090a;

            C0586a(d dVar) {
                this.f38090a = dVar;
            }

            public void onAuthenticationError(int i10, CharSequence charSequence) {
                this.f38090a.a(i10, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f38090a.b();
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                n.c b10 = authenticationResult != null ? q.b(b.b(authenticationResult)) : null;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = -1;
                if (i10 >= 30) {
                    if (authenticationResult != null) {
                        i11 = c.a(authenticationResult);
                    }
                } else if (i10 != 29) {
                    i11 = 2;
                }
                this.f38090a.d(new n.b(b10, i11));
            }

            public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            }
        }
    }
}
