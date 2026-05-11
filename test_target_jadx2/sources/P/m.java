package p;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final d f38125a;

    /* renamed from: b, reason: collision with root package name */
    private final BiometricManager f38126b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.core.hardware.fingerprint.a f38127c;

    private static class a {
        static int a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static BiometricManager b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    private static class b {
        static int a(BiometricManager biometricManager, int i10) {
            return biometricManager.canAuthenticate(i10);
        }
    }

    private static class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final Context f38128a;

        c(Context context) {
            this.f38128a = context.getApplicationContext();
        }

        @Override // p.m.d
        public BiometricManager a() {
            return a.b(this.f38128a);
        }

        @Override // p.m.d
        public boolean b() {
            return u.a(this.f38128a) != null;
        }

        @Override // p.m.d
        public boolean c() {
            return v.b(this.f38128a);
        }

        @Override // p.m.d
        public boolean d() {
            return u.b(this.f38128a);
        }

        @Override // p.m.d
        public boolean e() {
            return r.a(this.f38128a, Build.MODEL);
        }

        @Override // p.m.d
        public androidx.core.hardware.fingerprint.a f() {
            return androidx.core.hardware.fingerprint.a.c(this.f38128a);
        }
    }

    interface d {
        BiometricManager a();

        boolean b();

        boolean c();

        boolean d();

        boolean e();

        androidx.core.hardware.fingerprint.a f();
    }

    m(d dVar) {
        this.f38125a = dVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f38126b = i10 >= 29 ? dVar.a() : null;
        this.f38127c = i10 <= 29 ? dVar.f() : null;
    }

    private int b(int i10) {
        if (!AbstractC3782b.f(i10)) {
            return -2;
        }
        if (i10 == 0 || !this.f38125a.b()) {
            return 12;
        }
        if (AbstractC3782b.d(i10)) {
            return this.f38125a.d() ? 0 : 11;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 29) {
            return AbstractC3782b.g(i10) ? f() : e();
        }
        if (i11 != 28) {
            return c();
        }
        if (this.f38125a.c()) {
            return d();
        }
        return 12;
    }

    private int c() {
        androidx.core.hardware.fingerprint.a aVar = this.f38127c;
        if (aVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (aVar.f()) {
            return !this.f38127c.e() ? 11 : 0;
        }
        return 12;
    }

    private int d() {
        return !this.f38125a.d() ? c() : c() == 0 ? 0 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int e() {
        int f10;
        BiometricPrompt.CryptoObject d10;
        Method c10 = a.c();
        if (c10 != null && (d10 = q.d(q.a())) != null) {
            try {
                Object invoke = Build.VERSION.SDK_INT == 29 ? c10.invoke(this.f38126b, d10) : null;
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException e10) {
                e = e10;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                f10 = f();
                return this.f38125a.e() ? f10 : f10;
            } catch (IllegalArgumentException e11) {
                e = e11;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                f10 = f();
                if (this.f38125a.e()) {
                }
            } catch (InvocationTargetException e12) {
                e = e12;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                f10 = f();
                if (this.f38125a.e()) {
                }
            }
        }
        f10 = f();
        if (this.f38125a.e() && f10 == 0) {
            return d();
        }
    }

    private int f() {
        BiometricManager biometricManager = this.f38126b;
        if (biometricManager != null) {
            return a.a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public static m g(Context context) {
        return new m(new c(context));
    }

    public int a(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i10);
        }
        BiometricManager biometricManager = this.f38126b;
        if (biometricManager != null) {
            return b.a(biometricManager, i10);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
