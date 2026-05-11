package com.google.android.gms.internal.vision;

import java.lang.reflect.Type;

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
public final class G0 {
    public static final G0 zza;
    private static final G0 zzaa;
    private static final G0 zzab;
    private static final G0 zzac;
    private static final G0 zzad;
    private static final G0 zzae;
    private static final G0 zzaf;
    private static final G0 zzag;
    private static final G0 zzah;
    private static final G0 zzai;
    private static final G0 zzaj;
    private static final G0 zzak;
    private static final G0 zzal;
    private static final G0 zzam;
    private static final G0 zzan;
    private static final G0 zzao;
    private static final G0 zzap;
    private static final G0 zzaq;
    private static final G0 zzar;
    private static final G0 zzas;
    private static final G0 zzat;
    private static final G0 zzau;
    private static final G0 zzav;
    private static final G0 zzaw;
    private static final G0 zzax;
    private static final G0 zzay;
    public static final G0 zzb;
    private static final G0[] zzbe;
    private static final Type[] zzbf;
    private static final /* synthetic */ G0[] zzbg;
    private static final G0 zzc;
    private static final G0 zzd;
    private static final G0 zze;
    private static final G0 zzf;
    private static final G0 zzg;
    private static final G0 zzh;
    private static final G0 zzi;
    private static final G0 zzj;
    private static final G0 zzk;
    private static final G0 zzl;
    private static final G0 zzm;
    private static final G0 zzn;
    private static final G0 zzo;
    private static final G0 zzp;
    private static final G0 zzq;
    private static final G0 zzr;
    private static final G0 zzs;
    private static final G0 zzt;
    private static final G0 zzu;
    private static final G0 zzv;
    private static final G0 zzw;
    private static final G0 zzx;
    private static final G0 zzy;
    private static final G0 zzz;
    private final Y0 zzaz;
    private final int zzba;
    private final I0 zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    static {
        I0 i02 = I0.SCALAR;
        Y0 y02 = Y0.zze;
        G0 g02 = new G0("DOUBLE", 0, 0, i02, y02);
        zzc = g02;
        Y0 y03 = Y0.zzd;
        G0 g03 = new G0("FLOAT", 1, 1, i02, y03);
        zzd = g03;
        Y0 y04 = Y0.zzc;
        G0 g04 = new G0("INT64", 2, 2, i02, y04);
        zze = g04;
        G0 g05 = new G0("UINT64", 3, 3, i02, y04);
        zzf = g05;
        Y0 y05 = Y0.zzb;
        G0 g06 = new G0("INT32", 4, 4, i02, y05);
        zzg = g06;
        G0 g07 = new G0("FIXED64", 5, 5, i02, y04);
        zzh = g07;
        G0 g08 = new G0("FIXED32", 6, 6, i02, y05);
        zzi = g08;
        Y0 y06 = Y0.zzf;
        G0 g09 = new G0("BOOL", 7, 7, i02, y06);
        zzj = g09;
        Y0 y07 = Y0.zzg;
        G0 g010 = new G0("STRING", 8, 8, i02, y07);
        zzk = g010;
        Y0 y08 = Y0.zzj;
        G0 g011 = new G0("MESSAGE", 9, 9, i02, y08);
        zzl = g011;
        Y0 y09 = Y0.zzh;
        G0 g012 = new G0("BYTES", 10, 10, i02, y09);
        zzm = g012;
        G0 g013 = new G0("UINT32", 11, 11, i02, y05);
        zzn = g013;
        Y0 y010 = Y0.zzi;
        G0 g014 = new G0("ENUM", 12, 12, i02, y010);
        zzo = g014;
        G0 g015 = new G0("SFIXED32", 13, 13, i02, y05);
        zzp = g015;
        G0 g016 = new G0("SFIXED64", 14, 14, i02, y04);
        zzq = g016;
        G0 g017 = new G0("SINT32", 15, 15, i02, y05);
        zzr = g017;
        G0 g018 = new G0("SINT64", 16, 16, i02, y04);
        zzs = g018;
        G0 g019 = new G0("GROUP", 17, 17, i02, y08);
        zzt = g019;
        I0 i03 = I0.VECTOR;
        G0 g020 = new G0("DOUBLE_LIST", 18, 18, i03, y02);
        zzu = g020;
        G0 g021 = new G0("FLOAT_LIST", 19, 19, i03, y03);
        zzv = g021;
        G0 g022 = new G0("INT64_LIST", 20, 20, i03, y04);
        zzw = g022;
        G0 g023 = new G0("UINT64_LIST", 21, 21, i03, y04);
        zzx = g023;
        G0 g024 = new G0("INT32_LIST", 22, 22, i03, y05);
        zzy = g024;
        G0 g025 = new G0("FIXED64_LIST", 23, 23, i03, y04);
        zzz = g025;
        G0 g026 = new G0("FIXED32_LIST", 24, 24, i03, y05);
        zzaa = g026;
        G0 g027 = new G0("BOOL_LIST", 25, 25, i03, y06);
        zzab = g027;
        G0 g028 = new G0("STRING_LIST", 26, 26, i03, y07);
        zzac = g028;
        G0 g029 = new G0("MESSAGE_LIST", 27, 27, i03, y08);
        zzad = g029;
        G0 g030 = new G0("BYTES_LIST", 28, 28, i03, y09);
        zzae = g030;
        G0 g031 = new G0("UINT32_LIST", 29, 29, i03, y05);
        zzaf = g031;
        G0 g032 = new G0("ENUM_LIST", 30, 30, i03, y010);
        zzag = g032;
        G0 g033 = new G0("SFIXED32_LIST", 31, 31, i03, y05);
        zzah = g033;
        G0 g034 = new G0("SFIXED64_LIST", 32, 32, i03, y04);
        zzai = g034;
        G0 g035 = new G0("SINT32_LIST", 33, 33, i03, y05);
        zzaj = g035;
        G0 g036 = new G0("SINT64_LIST", 34, 34, i03, y04);
        zzak = g036;
        I0 i04 = I0.PACKED_VECTOR;
        G0 g037 = new G0("DOUBLE_LIST_PACKED", 35, 35, i04, y02);
        zza = g037;
        G0 g038 = new G0("FLOAT_LIST_PACKED", 36, 36, i04, y03);
        zzal = g038;
        G0 g039 = new G0("INT64_LIST_PACKED", 37, 37, i04, y04);
        zzam = g039;
        G0 g040 = new G0("UINT64_LIST_PACKED", 38, 38, i04, y04);
        zzan = g040;
        G0 g041 = new G0("INT32_LIST_PACKED", 39, 39, i04, y05);
        zzao = g041;
        G0 g042 = new G0("FIXED64_LIST_PACKED", 40, 40, i04, y04);
        zzap = g042;
        G0 g043 = new G0("FIXED32_LIST_PACKED", 41, 41, i04, y05);
        zzaq = g043;
        G0 g044 = new G0("BOOL_LIST_PACKED", 42, 42, i04, y06);
        zzar = g044;
        G0 g045 = new G0("UINT32_LIST_PACKED", 43, 43, i04, y05);
        zzas = g045;
        G0 g046 = new G0("ENUM_LIST_PACKED", 44, 44, i04, y010);
        zzat = g046;
        G0 g047 = new G0("SFIXED32_LIST_PACKED", 45, 45, i04, y05);
        zzau = g047;
        G0 g048 = new G0("SFIXED64_LIST_PACKED", 46, 46, i04, y04);
        zzav = g048;
        G0 g049 = new G0("SINT32_LIST_PACKED", 47, 47, i04, y05);
        zzaw = g049;
        G0 g050 = new G0("SINT64_LIST_PACKED", 48, 48, i04, y04);
        zzb = g050;
        G0 g051 = new G0("GROUP_LIST", 49, 49, i03, y08);
        zzax = g051;
        G0 g052 = new G0("MAP", 50, 50, I0.MAP, Y0.zza);
        zzay = g052;
        zzbg = new G0[]{g02, g03, g04, g05, g06, g07, g08, g09, g010, g011, g012, g013, g014, g015, g016, g017, g018, g019, g020, g021, g022, g023, g024, g025, g026, g027, g028, g029, g030, g031, g032, g033, g034, g035, g036, g037, g038, g039, g040, g041, g042, g043, g044, g045, g046, g047, g048, g049, g050, g051, g052};
        zzbf = new Type[0];
        G0[] values = values();
        zzbe = new G0[values.length];
        for (G0 g053 : values) {
            zzbe[g053.zzba] = g053;
        }
    }

    private G0(String str, int i10, int i11, I0 i02, Y0 y02) {
        int i12;
        this.zzba = i11;
        this.zzbb = i02;
        this.zzaz = y02;
        int i13 = J0.f25036a[i02.ordinal()];
        if (i13 == 1) {
            this.zzbc = y02.zza();
        } else if (i13 != 2) {
            this.zzbc = null;
        } else {
            this.zzbc = y02.zza();
        }
        this.zzbd = (i02 != I0.SCALAR || (i12 = J0.f25037b[y02.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static G0[] values() {
        return (G0[]) zzbg.clone();
    }

    public final int zza() {
        return this.zzba;
    }
}
