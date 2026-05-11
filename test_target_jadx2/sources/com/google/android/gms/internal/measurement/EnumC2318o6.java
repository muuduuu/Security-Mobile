package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.measurement.o6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2318o6 {
    public static final EnumC2318o6 zza;
    public static final EnumC2318o6 zzb;
    public static final EnumC2318o6 zzc;
    public static final EnumC2318o6 zzd;
    public static final EnumC2318o6 zze;
    public static final EnumC2318o6 zzf;
    public static final EnumC2318o6 zzg;
    public static final EnumC2318o6 zzh;
    public static final EnumC2318o6 zzi;
    public static final EnumC2318o6 zzj;
    public static final EnumC2318o6 zzk;
    public static final EnumC2318o6 zzl;
    public static final EnumC2318o6 zzm;
    public static final EnumC2318o6 zzn;
    public static final EnumC2318o6 zzo;
    public static final EnumC2318o6 zzp;
    public static final EnumC2318o6 zzq;
    public static final EnumC2318o6 zzr;
    private static final /* synthetic */ EnumC2318o6[] zzu;
    private final EnumC2327p6 zzs;
    private final int zzt;

    static {
        EnumC2318o6 enumC2318o6 = new EnumC2318o6("DOUBLE", 0, EnumC2327p6.DOUBLE, 1);
        zza = enumC2318o6;
        EnumC2318o6 enumC2318o62 = new EnumC2318o6("FLOAT", 1, EnumC2327p6.FLOAT, 5);
        zzb = enumC2318o62;
        EnumC2327p6 enumC2327p6 = EnumC2327p6.LONG;
        EnumC2318o6 enumC2318o63 = new EnumC2318o6("INT64", 2, enumC2327p6, 0);
        zzc = enumC2318o63;
        EnumC2318o6 enumC2318o64 = new EnumC2318o6("UINT64", 3, enumC2327p6, 0);
        zzd = enumC2318o64;
        EnumC2327p6 enumC2327p62 = EnumC2327p6.INT;
        EnumC2318o6 enumC2318o65 = new EnumC2318o6("INT32", 4, enumC2327p62, 0);
        zze = enumC2318o65;
        EnumC2318o6 enumC2318o66 = new EnumC2318o6("FIXED64", 5, enumC2327p6, 1);
        zzf = enumC2318o66;
        EnumC2318o6 enumC2318o67 = new EnumC2318o6("FIXED32", 6, enumC2327p62, 5);
        zzg = enumC2318o67;
        EnumC2318o6 enumC2318o68 = new EnumC2318o6("BOOL", 7, EnumC2327p6.BOOLEAN, 0);
        zzh = enumC2318o68;
        EnumC2318o6 enumC2318o69 = new EnumC2318o6("STRING", 8, EnumC2327p6.STRING, 2);
        zzi = enumC2318o69;
        EnumC2327p6 enumC2327p63 = EnumC2327p6.MESSAGE;
        EnumC2318o6 enumC2318o610 = new EnumC2318o6("GROUP", 9, enumC2327p63, 3);
        zzj = enumC2318o610;
        EnumC2318o6 enumC2318o611 = new EnumC2318o6("MESSAGE", 10, enumC2327p63, 2);
        zzk = enumC2318o611;
        EnumC2318o6 enumC2318o612 = new EnumC2318o6("BYTES", 11, EnumC2327p6.BYTE_STRING, 2);
        zzl = enumC2318o612;
        EnumC2318o6 enumC2318o613 = new EnumC2318o6("UINT32", 12, enumC2327p62, 0);
        zzm = enumC2318o613;
        EnumC2318o6 enumC2318o614 = new EnumC2318o6("ENUM", 13, EnumC2327p6.ENUM, 0);
        zzn = enumC2318o614;
        EnumC2318o6 enumC2318o615 = new EnumC2318o6("SFIXED32", 14, enumC2327p62, 5);
        zzo = enumC2318o615;
        EnumC2318o6 enumC2318o616 = new EnumC2318o6("SFIXED64", 15, enumC2327p6, 1);
        zzp = enumC2318o616;
        EnumC2318o6 enumC2318o617 = new EnumC2318o6("SINT32", 16, enumC2327p62, 0);
        zzq = enumC2318o617;
        EnumC2318o6 enumC2318o618 = new EnumC2318o6("SINT64", 17, enumC2327p6, 0);
        zzr = enumC2318o618;
        zzu = new EnumC2318o6[]{enumC2318o6, enumC2318o62, enumC2318o63, enumC2318o64, enumC2318o65, enumC2318o66, enumC2318o67, enumC2318o68, enumC2318o69, enumC2318o610, enumC2318o611, enumC2318o612, enumC2318o613, enumC2318o614, enumC2318o615, enumC2318o616, enumC2318o617, enumC2318o618};
    }

    private EnumC2318o6(String str, int i10, EnumC2327p6 enumC2327p6, int i11) {
        this.zzs = enumC2327p6;
        this.zzt = i11;
    }

    public static EnumC2318o6[] values() {
        return (EnumC2318o6[]) zzu.clone();
    }

    public final EnumC2327p6 zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
