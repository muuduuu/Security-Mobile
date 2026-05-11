package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2798v2 {

    /* renamed from: b, reason: collision with root package name */
    protected static final AtomicReference f26402b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    protected static final AtomicReference f26403c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    protected static final AtomicReference f26404d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2790u2 f26405a;

    public C2798v2(InterfaceC2790u2 interfaceC2790u2) {
        this.f26405a = interfaceC2790u2;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC1287s.m(strArr);
        AbstractC1287s.m(strArr2);
        AbstractC1287s.m(atomicReference);
        AbstractC1287s.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f26405a.zza() ? str : g(str, AbstractC2641b4.f25785c, AbstractC2641b4.f25783a, f26402b);
    }

    protected final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f26405a.zza() ? str : g(str, AbstractC2649c4.f25861b, AbstractC2649c4.f25860a, f26403c);
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f26405a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, AbstractC2657d4.f25886b, AbstractC2657d4.f25885a, f26404d);
        }
        return "experiment_id(" + str + ")";
    }

    protected final String d(I i10) {
        InterfaceC2790u2 interfaceC2790u2 = this.f26405a;
        if (!interfaceC2790u2.zza()) {
            return i10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(i10.f25444c);
        sb2.append(",name=");
        sb2.append(a(i10.f25442a));
        sb2.append(",params=");
        G g10 = i10.f25443b;
        sb2.append(g10 == null ? null : !interfaceC2790u2.zza() ? g10.toString() : e(g10.Z0()));
        return sb2.toString();
    }

    protected final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f26405a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(b(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    protected final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String e10 = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e10 != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(e10);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
