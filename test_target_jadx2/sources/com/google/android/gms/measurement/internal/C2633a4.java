package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.measurement.internal.a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2633a4 {

    /* renamed from: c, reason: collision with root package name */
    public static final C2633a4 f25768c = new C2633a4(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f25769a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25770b;

    public C2633a4(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(Z3.class);
        this.f25769a = enumMap;
        enumMap.put((EnumMap) Z3.AD_STORAGE, (Z3) h(null));
        enumMap.put((EnumMap) Z3.ANALYTICS_STORAGE, (Z3) h(null));
        this.f25770b = i10;
    }

    public static C2633a4 a(X3 x32, X3 x33, int i10) {
        EnumMap enumMap = new EnumMap(Z3.class);
        enumMap.put((EnumMap) Z3.AD_STORAGE, (Z3) x32);
        enumMap.put((EnumMap) Z3.ANALYTICS_STORAGE, (Z3) x33);
        return new C2633a4(enumMap, -10);
    }

    static String d(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static C2633a4 e(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C2633a4(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(Z3.class);
        for (Z3 z32 : Y3.STORAGE.zzb()) {
            enumMap.put((EnumMap) z32, (Z3) g(bundle.getString(z32.zze)));
        }
        return new C2633a4(enumMap, i10);
    }

    public static C2633a4 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(Z3.class);
        Z3[] zza = Y3.STORAGE.zza();
        for (int i11 = 0; i11 < zza.length; i11++) {
            String str2 = str == null ? BuildConfig.FLAVOR : str;
            Z3 z32 = zza[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put((EnumMap) z32, (Z3) j(str2.charAt(i12)));
            } else {
                enumMap.put((EnumMap) z32, (Z3) X3.UNINITIALIZED);
            }
        }
        return new C2633a4(enumMap, i10);
    }

    static X3 g(String str) {
        return str == null ? X3.UNINITIALIZED : str.equals("granted") ? X3.GRANTED : str.equals("denied") ? X3.DENIED : X3.UNINITIALIZED;
    }

    static X3 h(Boolean bool) {
        return bool == null ? X3.UNINITIALIZED : bool.booleanValue() ? X3.GRANTED : X3.DENIED;
    }

    static String i(X3 x32) {
        int ordinal = x32.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    static X3 j(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? X3.UNINITIALIZED : X3.GRANTED : X3.DENIED : X3.POLICY;
    }

    static char m(X3 x32) {
        if (x32 == null) {
            return '-';
        }
        int ordinal = x32.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean u(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final int b() {
        return this.f25770b;
    }

    public final boolean c() {
        Iterator it = this.f25769a.values().iterator();
        while (it.hasNext()) {
            if (((X3) it.next()) != X3.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2633a4)) {
            return false;
        }
        C2633a4 c2633a4 = (C2633a4) obj;
        for (Z3 z32 : Y3.STORAGE.zzb()) {
            if (this.f25769a.get(z32) != c2633a4.f25769a.get(z32)) {
                return false;
            }
        }
        return this.f25770b == c2633a4.f25770b;
    }

    public final int hashCode() {
        Iterator it = this.f25769a.values().iterator();
        int i10 = this.f25770b * 17;
        while (it.hasNext()) {
            i10 = (i10 * 31) + ((X3) it.next()).hashCode();
        }
        return i10;
    }

    public final String k() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (Z3 z32 : Y3.STORAGE.zza()) {
            X3 x32 = (X3) this.f25769a.get(z32);
            char c10 = '-';
            if (x32 != null && (ordinal = x32.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c10 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (Z3 z32 : Y3.STORAGE.zza()) {
            sb2.append(m((X3) this.f25769a.get(z32)));
        }
        return sb2.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f25769a.entrySet()) {
            String i10 = i((X3) entry.getValue());
            if (i10 != null) {
                bundle.putString(((Z3) entry.getKey()).zze, i10);
            }
        }
        return bundle;
    }

    public final boolean o(Z3 z32) {
        return ((X3) this.f25769a.get(z32)) != X3.DENIED;
    }

    public final X3 p() {
        X3 x32 = (X3) this.f25769a.get(Z3.AD_STORAGE);
        return x32 == null ? X3.UNINITIALIZED : x32;
    }

    public final X3 q() {
        X3 x32 = (X3) this.f25769a.get(Z3.ANALYTICS_STORAGE);
        return x32 == null ? X3.UNINITIALIZED : x32;
    }

    public final boolean r(C2633a4 c2633a4) {
        EnumMap enumMap = this.f25769a;
        for (Z3 z32 : (Z3[]) enumMap.keySet().toArray(new Z3[0])) {
            X3 x32 = (X3) enumMap.get(z32);
            X3 x33 = (X3) c2633a4.f25769a.get(z32);
            X3 x34 = X3.DENIED;
            if (x32 == x34 && x33 != x34) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2633a4 s(C2633a4 c2633a4) {
        EnumMap enumMap = new EnumMap(Z3.class);
        for (Z3 z32 : Y3.STORAGE.zzb()) {
            X3 x32 = (X3) this.f25769a.get(z32);
            X3 x33 = (X3) c2633a4.f25769a.get(z32);
            if (x32 != null) {
                if (x33 != null) {
                    X3 x34 = X3.UNINITIALIZED;
                    if (x32 != x34) {
                        if (x33 != x34) {
                            X3 x35 = X3.POLICY;
                            if (x32 != x35) {
                                if (x33 != x35) {
                                    X3 x36 = X3.DENIED;
                                    x32 = (x32 == x36 || x33 == x36) ? x36 : X3.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (x32 == null) {
                    enumMap.put((EnumMap) z32, (Z3) x32);
                }
            }
            x32 = x33;
            if (x32 == null) {
            }
        }
        return new C2633a4(enumMap, 100);
    }

    public final C2633a4 t(C2633a4 c2633a4) {
        EnumMap enumMap = new EnumMap(Z3.class);
        for (Z3 z32 : Y3.STORAGE.zzb()) {
            X3 x32 = (X3) this.f25769a.get(z32);
            if (x32 == X3.UNINITIALIZED) {
                x32 = (X3) c2633a4.f25769a.get(z32);
            }
            if (x32 != null) {
                enumMap.put((EnumMap) z32, (Z3) x32);
            }
        }
        return new C2633a4(enumMap, this.f25770b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(d(this.f25770b));
        for (Z3 z32 : Y3.STORAGE.zzb()) {
            sb2.append(",");
            sb2.append(z32.zze);
            sb2.append("=");
            X3 x32 = (X3) this.f25769a.get(z32);
            if (x32 == null) {
                x32 = X3.UNINITIALIZED;
            }
            sb2.append(x32);
        }
        return sb2.toString();
    }

    private C2633a4(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(Z3.class);
        this.f25769a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f25770b = i10;
    }
}
