package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.clearcut.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2141l extends AbstractC2120e {

    /* renamed from: m, reason: collision with root package name */
    private final Object f24077m;

    /* renamed from: n, reason: collision with root package name */
    private String f24078n;

    /* renamed from: o, reason: collision with root package name */
    private Object f24079o;

    /* renamed from: p, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2147n f24080p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2141l(C2150o c2150o, String str, Object obj, InterfaceC2147n interfaceC2147n) {
        super(c2150o, str, obj, null);
        this.f24080p = interfaceC2147n;
        this.f24077m = new Object();
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2120e
    protected final Object f(SharedPreferences sharedPreferences) {
        try {
            return m(sharedPreferences.getString(this.f24034b, BuildConfig.FLAVOR));
        } catch (ClassCastException e10) {
            String valueOf = String.valueOf(this.f24034b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid byte[] value in SharedPreferences for ".concat(valueOf) : new String("Invalid byte[] value in SharedPreferences for "), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2120e
    protected final Object m(String str) {
        Object obj;
        try {
            synchronized (this.f24077m) {
                try {
                    if (!str.equals(this.f24078n)) {
                        Object a10 = this.f24080p.a(Base64.decode(str, 3));
                        this.f24078n = str;
                        this.f24079o = a10;
                    }
                    obj = this.f24079o;
                } finally {
                }
            }
            return obj;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f24034b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb2.append("Invalid byte[] value for ");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
