package com.google.android.gms.internal.measurement;

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
/* renamed from: com.google.android.gms.internal.measurement.q5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2335q5 {
    public static final EnumC2335q5 zza;
    public static final EnumC2335q5 zzb;
    public static final EnumC2335q5 zzc;
    public static final EnumC2335q5 zzd;
    public static final EnumC2335q5 zze;
    public static final EnumC2335q5 zzf;
    public static final EnumC2335q5 zzg;
    public static final EnumC2335q5 zzh;
    public static final EnumC2335q5 zzi;
    public static final EnumC2335q5 zzj;
    private static final /* synthetic */ EnumC2335q5[] zzl;
    private final Class zzk;

    static {
        EnumC2335q5 enumC2335q5 = new EnumC2335q5("VOID", 0, Void.class, Void.class, null);
        zza = enumC2335q5;
        Class cls = Integer.TYPE;
        EnumC2335q5 enumC2335q52 = new EnumC2335q5("INT", 1, cls, Integer.class, 0);
        zzb = enumC2335q52;
        EnumC2335q5 enumC2335q53 = new EnumC2335q5("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = enumC2335q53;
        EnumC2335q5 enumC2335q54 = new EnumC2335q5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = enumC2335q54;
        EnumC2335q5 enumC2335q55 = new EnumC2335q5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = enumC2335q55;
        EnumC2335q5 enumC2335q56 = new EnumC2335q5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = enumC2335q56;
        EnumC2335q5 enumC2335q57 = new EnumC2335q5("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        zzg = enumC2335q57;
        EnumC2335q5 enumC2335q58 = new EnumC2335q5("BYTE_STRING", 7, J4.class, J4.class, J4.f24246b);
        zzh = enumC2335q58;
        EnumC2335q5 enumC2335q59 = new EnumC2335q5("ENUM", 8, cls, Integer.class, null);
        zzi = enumC2335q59;
        EnumC2335q5 enumC2335q510 = new EnumC2335q5("MESSAGE", 9, Object.class, Object.class, null);
        zzj = enumC2335q510;
        zzl = new EnumC2335q5[]{enumC2335q5, enumC2335q52, enumC2335q53, enumC2335q54, enumC2335q55, enumC2335q56, enumC2335q57, enumC2335q58, enumC2335q59, enumC2335q510};
    }

    private EnumC2335q5(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzk = cls2;
    }

    public static EnumC2335q5[] values() {
        return (EnumC2335q5[]) zzl.clone();
    }

    public final Class zza() {
        return this.zzk;
    }
}
