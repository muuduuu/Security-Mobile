package com.google.android.gms.common;

import V6.AbstractC1287s;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: c, reason: collision with root package name */
    private static r f23515c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f23516a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f23517b;

    public r(Context context) {
        this.f23516a = context.getApplicationContext();
    }

    public static r a(Context context) {
        AbstractC1287s.m(context);
        synchronized (r.class) {
            try {
                if (f23515c == null) {
                    L.a(context);
                    f23515c = new r(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f23515c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final boolean d(PackageInfo packageInfo, boolean z10) {
        SigningInfo signingInfo;
        n7.i r10;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] signingCertificateHistory2;
        if (packageInfo == null) {
            return false;
        }
        if (z10 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            n7.i iVar = z10 ? K.f23295c : K.f23294b;
            int i10 = com.google.android.gms.common.util.a.f23527b;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 28) {
                Signature[] signatureArr = packageInfo.signatures;
                byte[] bArr = null;
                if (signatureArr != null && signatureArr.length == 1) {
                    bArr = signatureArr[0].toByteArray();
                }
                r10 = bArr != null ? n7.i.t(bArr) : n7.i.r();
            } else {
                n7.s.a(i11 >= 28);
                signingInfo = packageInfo.signingInfo;
                if (signingInfo != null) {
                    hasMultipleSigners = signingInfo.hasMultipleSigners();
                    if (!hasMultipleSigners) {
                        signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        if (signingCertificateHistory != null) {
                            int i12 = n7.i.f37581c;
                            n7.e eVar = new n7.e();
                            signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                            for (Signature signature : signingCertificateHistory2) {
                                eVar.b(signature.toByteArray());
                            }
                            r10 = eVar.c();
                        }
                    }
                }
                r10 = n7.i.r();
            }
            if (r10.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            n7.i k10 = r10.k();
            int size = k10.size();
            int i13 = 0;
            while (i13 < size) {
                byte[] bArr2 = (byte[]) k10.get(i13);
                n7.m listIterator = iVar.listIterator(0);
                do {
                    int i14 = i13 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            Log.i("GoogleSignatureVerifier", "package info is not set correctly");
            return (z10 ? f(packageInfo, K.f23293a) : f(packageInfo, K.f23293a[0])) != null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final W e(String str, boolean z10, boolean z11) {
        W c10;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return W.c("null pkg");
        }
        if (str.equals(this.f23517b)) {
            return W.b();
        }
        J j10 = L.f23296a;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                L.b();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
        }
        try {
            if (L.f23302g.i()) {
                T t10 = new T(null);
                t10.a(str);
                t10.b(AbstractC2022n.g(this.f23516a));
                t10.c(true);
                c10 = L.c(t10.d());
                if (c10.f23329a) {
                    this.f23517b = str;
                }
                return c10;
            }
            PackageInfo packageInfo = this.f23516a.getPackageManager().getPackageInfo(str, allowThreadDiskReads >= 28 ? 134217792 : 64);
            boolean g10 = AbstractC2022n.g(this.f23516a);
            if (packageInfo == null) {
                c10 = W.c("null pkg");
            } else {
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr == null || signatureArr.length != 1) {
                    c10 = W.c("single cert required");
                } else {
                    H h10 = new H(packageInfo.signatures[0].toByteArray());
                    String str2 = packageInfo.packageName;
                    W d10 = L.d(str2, h10, g10, false);
                    c10 = (!d10.f23329a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !L.d(str2, h10, false, true).f23329a) ? d10 : W.c("debuggable release cert app rejected");
                }
            }
            if (c10.f23329a) {
            }
            return c10;
        } catch (PackageManager.NameNotFoundException e11) {
            return W.d("no pkg ".concat(str), e11);
        }
        allowThreadDiskReads = Build.VERSION.SDK_INT;
    }

    private static G f(PackageInfo packageInfo, G... gArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            H h10 = new H(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < gArr.length; i10++) {
                if (gArr[i10].equals(h10)) {
                    return gArr[i10];
                }
            }
        }
        return null;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        if (d(packageInfo, true)) {
            if (AbstractC2022n.g(this.f23516a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        W c10;
        int length;
        String[] packagesForUid = this.f23516a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c10 = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    AbstractC1287s.m(c10);
                    break;
                }
                c10 = e(packagesForUid[i11], false, false);
                if (c10.f23329a) {
                    break;
                }
                i11++;
            }
        } else {
            c10 = W.c("no pkgs");
        }
        c10.e();
        return c10.f23329a;
    }
}
