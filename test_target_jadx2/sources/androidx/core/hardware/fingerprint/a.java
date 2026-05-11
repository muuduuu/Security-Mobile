package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15954a;

    /* renamed from: androidx.core.hardware.fingerprint.a$a, reason: collision with other inner class name */
    class C0268a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f15955a;

        C0268a(c cVar) {
            this.f15955a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i10, CharSequence charSequence) {
            this.f15955a.a(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f15955a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            this.f15955a.c(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f15955a.d(new d(a.g(b.b(authenticationResult))));
        }
    }

    static class b {
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }
    }

    public static abstract class c {
        public abstract void a(int i10, CharSequence charSequence);

        public abstract void b();

        public abstract void c(int i10, CharSequence charSequence);

        public abstract void d(d dVar);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final e f15956a;

        public d(e eVar) {
            this.f15956a = eVar;
        }

        public e a() {
            return this.f15956a;
        }
    }

    private a(Context context) {
        this.f15954a = context;
    }

    public static a c(Context context) {
        return new a(context);
    }

    private static FingerprintManager d(Context context) {
        return b.c(context);
    }

    static e g(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    private static FingerprintManager.AuthenticationCallback h(c cVar) {
        return new C0268a(cVar);
    }

    private static FingerprintManager.CryptoObject i(e eVar) {
        return b.g(eVar);
    }

    public void a(e eVar, int i10, CancellationSignal cancellationSignal, c cVar, Handler handler) {
        FingerprintManager d10 = d(this.f15954a);
        if (d10 != null) {
            b.a(d10, i(eVar), cancellationSignal, i10, h(cVar), handler);
        }
    }

    public void b(e eVar, int i10, androidx.core.os.d dVar, c cVar, Handler handler) {
        a(eVar, i10, dVar != null ? (CancellationSignal) dVar.b() : null, cVar, handler);
    }

    public boolean e() {
        FingerprintManager d10 = d(this.f15954a);
        return d10 != null && b.d(d10);
    }

    public boolean f() {
        FingerprintManager d10 = d(this.f15954a);
        return d10 != null && b.e(d10);
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f15957a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f15958b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f15959c;

        public e(Signature signature) {
            this.f15957a = signature;
            this.f15958b = null;
            this.f15959c = null;
        }

        public Cipher a() {
            return this.f15958b;
        }

        public Mac b() {
            return this.f15959c;
        }

        public Signature c() {
            return this.f15957a;
        }

        public e(Cipher cipher) {
            this.f15958b = cipher;
            this.f15957a = null;
            this.f15959c = null;
        }

        public e(Mac mac) {
            this.f15959c = mac;
            this.f15958b = null;
            this.f15957a = null;
        }
    }
}
