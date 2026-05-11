package com.google.android.gms.internal.vision;

import org.conscrypt.BuildConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class Y0 {
    public static final Y0 zza;
    public static final Y0 zzb;
    public static final Y0 zzc;
    public static final Y0 zzd;
    public static final Y0 zze;
    public static final Y0 zzf;
    public static final Y0 zzg;
    public static final Y0 zzh;
    public static final Y0 zzi;
    public static final Y0 zzj;
    private static final /* synthetic */ Y0[] zzn;
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    static {
        Y0 y02 = new Y0("VOID", 0, Void.class, Void.class, null);
        zza = y02;
        Class cls = Integer.TYPE;
        Y0 y03 = new Y0("INT", 1, cls, Integer.class, 0);
        zzb = y03;
        Y0 y04 = new Y0("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = y04;
        Y0 y05 = new Y0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = y05;
        Y0 y06 = new Y0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = y06;
        Y0 y07 = new Y0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = y07;
        Y0 y08 = new Y0("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        zzg = y08;
        Y0 y09 = new Y0("BYTE_STRING", 7, AbstractC2570g0.class, AbstractC2570g0.class, AbstractC2570g0.f25133b);
        zzh = y09;
        Y0 y010 = new Y0("ENUM", 8, cls, Integer.class, null);
        zzi = y010;
        Y0 y011 = new Y0("MESSAGE", 9, Object.class, Object.class, null);
        zzj = y011;
        zzn = new Y0[]{y02, y03, y04, y05, y06, y07, y08, y09, y010, y011};
    }

    private Y0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    public static Y0[] values() {
        return (Y0[]) zzn.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
