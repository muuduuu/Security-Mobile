package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2740o {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f26223a;

    C2740o() {
        this.f26223a = new EnumMap(Z3.class);
    }

    public static C2740o d(String str) {
        EnumMap enumMap = new EnumMap(Z3.class);
        if (str.length() >= Z3.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                Z3[] values = Z3.values();
                int length = values.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put((EnumMap) values[i10], (Z3) EnumC2732n.zza(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C2740o(enumMap);
            }
        }
        return new C2740o();
    }

    public final EnumC2732n a(Z3 z32) {
        EnumC2732n enumC2732n = (EnumC2732n) this.f26223a.get(z32);
        return enumC2732n == null ? EnumC2732n.UNSET : enumC2732n;
    }

    public final void b(Z3 z32, int i10) {
        EnumC2732n enumC2732n = EnumC2732n.UNSET;
        if (i10 != -30) {
            if (i10 != -20) {
                if (i10 == -10) {
                    enumC2732n = EnumC2732n.MANIFEST;
                } else if (i10 != 0) {
                    if (i10 == 30) {
                        enumC2732n = EnumC2732n.INITIALIZATION;
                    }
                }
            }
            enumC2732n = EnumC2732n.API;
        } else {
            enumC2732n = EnumC2732n.TCF;
        }
        this.f26223a.put((EnumMap) z32, (Z3) enumC2732n);
    }

    public final void c(Z3 z32, EnumC2732n enumC2732n) {
        this.f26223a.put((EnumMap) z32, (Z3) enumC2732n);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (Z3 z32 : Z3.values()) {
            EnumC2732n enumC2732n = (EnumC2732n) this.f26223a.get(z32);
            if (enumC2732n == null) {
                enumC2732n = EnumC2732n.UNSET;
            }
            sb2.append(enumC2732n.zzb());
        }
        return sb2.toString();
    }

    private C2740o(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(Z3.class);
        this.f26223a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
