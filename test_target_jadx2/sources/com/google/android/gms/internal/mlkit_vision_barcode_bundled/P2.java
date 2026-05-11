package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
/* loaded from: classes2.dex */
public final class P2 {
    public static final P2 zza;
    public static final P2 zzb;
    public static final P2 zzc;
    public static final P2 zzd;
    public static final P2 zze;
    public static final P2 zzf;
    public static final P2 zzg;
    public static final P2 zzh;
    public static final P2 zzi;
    public static final P2 zzj;
    public static final P2 zzk;
    public static final P2 zzl;
    public static final P2 zzm;
    public static final P2 zzn;
    public static final P2 zzo;
    public static final P2 zzp;
    public static final P2 zzq;
    public static final P2 zzr;
    private static final /* synthetic */ P2[] zzs;
    private final Q2 zzt;

    static {
        P2 p22 = new P2("DOUBLE", 0, Q2.DOUBLE, 1);
        zza = p22;
        P2 p23 = new P2("FLOAT", 1, Q2.FLOAT, 5);
        zzb = p23;
        Q2 q22 = Q2.LONG;
        P2 p24 = new P2("INT64", 2, q22, 0);
        zzc = p24;
        P2 p25 = new P2("UINT64", 3, q22, 0);
        zzd = p25;
        Q2 q23 = Q2.INT;
        P2 p26 = new P2("INT32", 4, q23, 0);
        zze = p26;
        P2 p27 = new P2("FIXED64", 5, q22, 1);
        zzf = p27;
        P2 p28 = new P2("FIXED32", 6, q23, 5);
        zzg = p28;
        P2 p29 = new P2("BOOL", 7, Q2.BOOLEAN, 0);
        zzh = p29;
        P2 p210 = new P2("STRING", 8, Q2.STRING, 2);
        zzi = p210;
        Q2 q24 = Q2.MESSAGE;
        P2 p211 = new P2("GROUP", 9, q24, 3);
        zzj = p211;
        P2 p212 = new P2("MESSAGE", 10, q24, 2);
        zzk = p212;
        P2 p213 = new P2("BYTES", 11, Q2.BYTE_STRING, 2);
        zzl = p213;
        P2 p214 = new P2("UINT32", 12, q23, 0);
        zzm = p214;
        P2 p215 = new P2("ENUM", 13, Q2.ENUM, 0);
        zzn = p215;
        P2 p216 = new P2("SFIXED32", 14, q23, 5);
        zzo = p216;
        P2 p217 = new P2("SFIXED64", 15, q22, 1);
        zzp = p217;
        P2 p218 = new P2("SINT32", 16, q23, 0);
        zzq = p218;
        P2 p219 = new P2("SINT64", 17, q22, 0);
        zzr = p219;
        zzs = new P2[]{p22, p23, p24, p25, p26, p27, p28, p29, p210, p211, p212, p213, p214, p215, p216, p217, p218, p219};
    }

    private P2(String str, int i10, Q2 q22, int i11) {
        this.zzt = q22;
    }

    public static P2[] values() {
        return (P2[]) zzs.clone();
    }

    public final Q2 zza() {
        return this.zzt;
    }
}
