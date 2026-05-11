package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: f, reason: collision with root package name */
    public static final A f25281f = new A((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    private final int f25282a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25283b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f25284c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25285d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumMap f25286e;

    A(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(Z3.class);
        this.f25286e = enumMap;
        enumMap.put((EnumMap) Z3.AD_USER_DATA, (Z3) C2633a4.h(bool));
        this.f25282a = i10;
        this.f25283b = l();
        this.f25284c = bool2;
        this.f25285d = str;
    }

    static A a(X3 x32, int i10) {
        EnumMap enumMap = new EnumMap(Z3.class);
        enumMap.put((EnumMap) Z3.AD_USER_DATA, (Z3) x32);
        return new A(enumMap, -10, (Boolean) null, (String) null);
    }

    public static A g(String str) {
        if (str == null || str.length() <= 0) {
            return f25281f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(Z3.class);
        Z3[] zza = Y3.DMA.zza();
        int length = zza.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put((EnumMap) zza[i11], (Z3) C2633a4.j(split[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new A(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static A h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new A((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(Z3.class);
        for (Z3 z32 : Y3.DMA.zza()) {
            enumMap.put((EnumMap) z32, (Z3) C2633a4.g(bundle.getString(z32.zze)));
        }
        return new A(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean i(Bundle bundle) {
        X3 g10;
        if (bundle == null || (g10 = C2633a4.g(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int ordinal = g10.ordinal();
        if (ordinal == 2) {
            return Boolean.FALSE;
        }
        if (ordinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25282a);
        for (Z3 z32 : Y3.DMA.zza()) {
            sb2.append(":");
            sb2.append(C2633a4.m((X3) this.f25286e.get(z32)));
        }
        return sb2.toString();
    }

    public final int b() {
        return this.f25282a;
    }

    public final X3 c() {
        X3 x32 = (X3) this.f25286e.get(Z3.AD_USER_DATA);
        return x32 == null ? X3.UNINITIALIZED : x32;
    }

    public final boolean d() {
        Iterator it = this.f25286e.values().iterator();
        while (it.hasNext()) {
            if (((X3) it.next()) != X3.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.f25283b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        if (this.f25283b.equalsIgnoreCase(a10.f25283b) && Objects.equals(this.f25284c, a10.f25284c)) {
            return Objects.equals(this.f25285d, a10.f25285d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f25286e.entrySet()) {
            String i10 = C2633a4.i((X3) entry.getValue());
            if (i10 != null) {
                bundle.putString(((Z3) entry.getKey()).zze, i10);
            }
        }
        Boolean bool = this.f25284c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f25285d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        Boolean bool = this.f25284c;
        int i10 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f25285d;
        return this.f25283b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final Boolean j() {
        return this.f25284c;
    }

    public final String k() {
        return this.f25285d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(C2633a4.d(this.f25282a));
        for (Z3 z32 : Y3.DMA.zza()) {
            sb2.append(",");
            sb2.append(z32.zze);
            sb2.append("=");
            X3 x32 = (X3) this.f25286e.get(z32);
            if (x32 == null) {
                sb2.append("uninitialized");
            } else {
                int ordinal = x32.ordinal();
                if (ordinal == 0) {
                    sb2.append("uninitialized");
                } else if (ordinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb2.append("denied");
                } else if (ordinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f25284c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f25285d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    private A(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(Z3.class);
        this.f25286e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f25282a = i10;
        this.f25283b = l();
        this.f25284c = bool;
        this.f25285d = str;
    }
}
