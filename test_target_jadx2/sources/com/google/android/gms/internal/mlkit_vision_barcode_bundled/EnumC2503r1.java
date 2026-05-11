package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.r1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2503r1 {
    public static final EnumC2503r1 zza;
    public static final EnumC2503r1 zzb;
    public static final EnumC2503r1 zzc;
    public static final EnumC2503r1 zzd;
    public static final EnumC2503r1 zze;
    public static final EnumC2503r1 zzf;
    public static final EnumC2503r1 zzg;
    public static final EnumC2503r1 zzh;
    public static final EnumC2503r1 zzi;
    public static final EnumC2503r1 zzj;
    private static final /* synthetic */ EnumC2503r1[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        EnumC2503r1 enumC2503r1 = new EnumC2503r1("VOID", 0, Void.class, Void.class, null);
        zza = enumC2503r1;
        Class cls = Integer.TYPE;
        EnumC2503r1 enumC2503r12 = new EnumC2503r1("INT", 1, cls, Integer.class, 0);
        zzb = enumC2503r12;
        EnumC2503r1 enumC2503r13 = new EnumC2503r1("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = enumC2503r13;
        EnumC2503r1 enumC2503r14 = new EnumC2503r1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = enumC2503r14;
        EnumC2503r1 enumC2503r15 = new EnumC2503r1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = enumC2503r15;
        EnumC2503r1 enumC2503r16 = new EnumC2503r1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = enumC2503r16;
        EnumC2503r1 enumC2503r17 = new EnumC2503r1("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        zzg = enumC2503r17;
        EnumC2503r1 enumC2503r18 = new EnumC2503r1("BYTE_STRING", 7, E0.class, E0.class, E0.f24749b);
        zzh = enumC2503r18;
        EnumC2503r1 enumC2503r19 = new EnumC2503r1("ENUM", 8, cls, Integer.class, null);
        zzi = enumC2503r19;
        EnumC2503r1 enumC2503r110 = new EnumC2503r1("MESSAGE", 9, Object.class, Object.class, null);
        zzj = enumC2503r110;
        zzk = new EnumC2503r1[]{enumC2503r1, enumC2503r12, enumC2503r13, enumC2503r14, enumC2503r15, enumC2503r16, enumC2503r17, enumC2503r18, enumC2503r19, enumC2503r110};
    }

    private EnumC2503r1(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static EnumC2503r1[] values() {
        return (EnumC2503r1[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
