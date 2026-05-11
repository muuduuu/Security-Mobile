package com.google.android.gms.internal.vision;

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
public class s2 {
    public static final s2 zza;
    public static final s2 zzb;
    public static final s2 zzc;
    public static final s2 zzd;
    public static final s2 zze;
    public static final s2 zzf;
    public static final s2 zzg;
    public static final s2 zzh;
    public static final s2 zzi;
    public static final s2 zzj;
    public static final s2 zzk;
    public static final s2 zzl;
    public static final s2 zzm;
    public static final s2 zzn;
    public static final s2 zzo;
    public static final s2 zzp;
    public static final s2 zzq;
    public static final s2 zzr;
    private static final /* synthetic */ s2[] zzu;
    private final v2 zzs;
    private final int zzt;

    static {
        s2 s2Var = new s2("DOUBLE", 0, v2.DOUBLE, 1);
        zza = s2Var;
        s2 s2Var2 = new s2("FLOAT", 1, v2.FLOAT, 5);
        zzb = s2Var2;
        v2 v2Var = v2.LONG;
        final int i10 = 2;
        s2 s2Var3 = new s2("INT64", 2, v2Var, 0);
        zzc = s2Var3;
        final int i11 = 3;
        s2 s2Var4 = new s2("UINT64", 3, v2Var, 0);
        zzd = s2Var4;
        v2 v2Var2 = v2.INT;
        s2 s2Var5 = new s2("INT32", 4, v2Var2, 0);
        zze = s2Var5;
        s2 s2Var6 = new s2("FIXED64", 5, v2Var, 1);
        zzf = s2Var6;
        s2 s2Var7 = new s2("FIXED32", 6, v2Var2, 5);
        zzg = s2Var7;
        s2 s2Var8 = new s2("BOOL", 7, v2.BOOLEAN, 0);
        zzh = s2Var8;
        final int i12 = 8;
        final v2 v2Var3 = v2.STRING;
        final String str = "STRING";
        s2 s2Var9 = new s2(str, i12, v2Var3, i10) { // from class: com.google.android.gms.internal.vision.r2
            {
                int i13 = 2;
                int i14 = 8;
            }
        };
        zzi = s2Var9;
        final v2 v2Var4 = v2.MESSAGE;
        final String str2 = "GROUP";
        final int i13 = 9;
        s2 s2Var10 = new s2(str2, i13, v2Var4, i11) { // from class: com.google.android.gms.internal.vision.u2
            {
                int i14 = 3;
                int i15 = 9;
            }
        };
        zzj = s2Var10;
        final String str3 = "MESSAGE";
        final int i14 = 10;
        final int i15 = 2;
        s2 s2Var11 = new s2(str3, i14, v2Var4, i15) { // from class: com.google.android.gms.internal.vision.t2
            {
                int i16 = 2;
                int i17 = 10;
            }
        };
        zzk = s2Var11;
        final int i16 = 11;
        final v2 v2Var5 = v2.BYTE_STRING;
        final String str4 = "BYTES";
        s2 s2Var12 = new s2(str4, i16, v2Var5, i15) { // from class: com.google.android.gms.internal.vision.w2
            {
                int i17 = 2;
                int i18 = 11;
            }
        };
        zzl = s2Var12;
        s2 s2Var13 = new s2("UINT32", 12, v2Var2, 0);
        zzm = s2Var13;
        s2 s2Var14 = new s2("ENUM", 13, v2.ENUM, 0);
        zzn = s2Var14;
        s2 s2Var15 = new s2("SFIXED32", 14, v2Var2, 5);
        zzo = s2Var15;
        s2 s2Var16 = new s2("SFIXED64", 15, v2Var, 1);
        zzp = s2Var16;
        s2 s2Var17 = new s2("SINT32", 16, v2Var2, 0);
        zzq = s2Var17;
        s2 s2Var18 = new s2("SINT64", 17, v2Var, 0);
        zzr = s2Var18;
        zzu = new s2[]{s2Var, s2Var2, s2Var3, s2Var4, s2Var5, s2Var6, s2Var7, s2Var8, s2Var9, s2Var10, s2Var11, s2Var12, s2Var13, s2Var14, s2Var15, s2Var16, s2Var17, s2Var18};
    }

    private s2(String str, int i10, v2 v2Var, int i11) {
        this.zzs = v2Var;
        this.zzt = i11;
    }

    public static s2[] values() {
        return (s2[]) zzu.clone();
    }

    public final v2 zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
