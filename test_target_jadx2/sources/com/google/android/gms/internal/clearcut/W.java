package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzgy' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class W {
    private static final W zzgy;
    private static final W zzgz;
    private static final W zzha;
    private static final W zzhb;
    private static final W zzhc;
    private static final W zzhd;
    private static final W zzhe;
    private static final W zzhf;
    private static final W zzhg;
    public static final W zzhh;
    private static final W zzhi;
    private static final W zzhj;
    public static final W zzhk;
    private static final W zzhl;
    private static final W zzhm;
    private static final W zzhn;
    private static final W zzho;
    public static final W zzhp;
    public static final W zzhq;
    private static final W zzhr;
    private static final W zzhs;
    private static final W zzht;
    private static final W zzhu;
    private static final W zzhv;
    private static final W zzhw;
    private static final W zzhx;
    private static final W zzhy;
    public static final W zzhz;
    private static final W zzia;
    private static final W zzib;
    public static final W zzic;
    private static final W zzid;
    private static final W zzie;
    private static final W zzif;
    private static final W zzig;
    public static final W zzih;
    private static final W zzii;
    private static final W zzij;
    private static final W zzik;
    private static final W zzil;
    private static final W zzim;
    private static final W zzin;
    private static final W zzio;
    private static final W zzip;
    public static final W zziq;
    private static final W zzir;
    private static final W zzis;
    private static final W zzit;
    public static final W zziu;
    public static final W zziv;
    public static final W zziw;
    private static final W[] zzjb;
    private static final Type[] zzjc;
    private static final /* synthetic */ W[] zzjd;

    /* renamed from: id, reason: collision with root package name */
    private final int f23953id;
    private final EnumC2133i0 zzix;
    private final Y zziy;
    private final Class<?> zziz;
    private final boolean zzja;

    static {
        Y y10 = Y.SCALAR;
        EnumC2133i0 enumC2133i0 = EnumC2133i0.zzlb;
        W w10 = new W("DOUBLE", 0, 0, y10, enumC2133i0);
        zzgy = w10;
        EnumC2133i0 enumC2133i02 = EnumC2133i0.zzla;
        W w11 = new W("FLOAT", 1, 1, y10, enumC2133i02);
        zzgz = w11;
        EnumC2133i0 enumC2133i03 = EnumC2133i0.zzkz;
        W w12 = new W("INT64", 2, 2, y10, enumC2133i03);
        zzha = w12;
        W w13 = new W("UINT64", 3, 3, y10, enumC2133i03);
        zzhb = w13;
        EnumC2133i0 enumC2133i04 = EnumC2133i0.zzky;
        W w14 = new W("INT32", 4, 4, y10, enumC2133i04);
        zzhc = w14;
        W w15 = new W("FIXED64", 5, 5, y10, enumC2133i03);
        zzhd = w15;
        W w16 = new W("FIXED32", 6, 6, y10, enumC2133i04);
        zzhe = w16;
        EnumC2133i0 enumC2133i05 = EnumC2133i0.zzlc;
        W w17 = new W("BOOL", 7, 7, y10, enumC2133i05);
        zzhf = w17;
        EnumC2133i0 enumC2133i06 = EnumC2133i0.zzld;
        W w18 = new W("STRING", 8, 8, y10, enumC2133i06);
        zzhg = w18;
        EnumC2133i0 enumC2133i07 = EnumC2133i0.zzlg;
        W w19 = new W("MESSAGE", 9, 9, y10, enumC2133i07);
        zzhh = w19;
        EnumC2133i0 enumC2133i08 = EnumC2133i0.zzle;
        W w20 = new W("BYTES", 10, 10, y10, enumC2133i08);
        zzhi = w20;
        W w21 = new W("UINT32", 11, 11, y10, enumC2133i04);
        zzhj = w21;
        EnumC2133i0 enumC2133i09 = EnumC2133i0.zzlf;
        W w22 = new W("ENUM", 12, 12, y10, enumC2133i09);
        zzhk = w22;
        W w23 = new W("SFIXED32", 13, 13, y10, enumC2133i04);
        zzhl = w23;
        W w24 = new W("SFIXED64", 14, 14, y10, enumC2133i03);
        zzhm = w24;
        W w25 = new W("SINT32", 15, 15, y10, enumC2133i04);
        zzhn = w25;
        W w26 = new W("SINT64", 16, 16, y10, enumC2133i03);
        zzho = w26;
        W w27 = new W("GROUP", 17, 17, y10, enumC2133i07);
        zzhp = w27;
        Y y11 = Y.VECTOR;
        W w28 = new W("DOUBLE_LIST", 18, 18, y11, enumC2133i0);
        zzhq = w28;
        W w29 = new W("FLOAT_LIST", 19, 19, y11, enumC2133i02);
        zzhr = w29;
        W w30 = new W("INT64_LIST", 20, 20, y11, enumC2133i03);
        zzhs = w30;
        W w31 = new W("UINT64_LIST", 21, 21, y11, enumC2133i03);
        zzht = w31;
        W w32 = new W("INT32_LIST", 22, 22, y11, enumC2133i04);
        zzhu = w32;
        W w33 = new W("FIXED64_LIST", 23, 23, y11, enumC2133i03);
        zzhv = w33;
        W w34 = new W("FIXED32_LIST", 24, 24, y11, enumC2133i04);
        zzhw = w34;
        W w35 = new W("BOOL_LIST", 25, 25, y11, enumC2133i05);
        zzhx = w35;
        W w36 = new W("STRING_LIST", 26, 26, y11, enumC2133i06);
        zzhy = w36;
        W w37 = new W("MESSAGE_LIST", 27, 27, y11, enumC2133i07);
        zzhz = w37;
        W w38 = new W("BYTES_LIST", 28, 28, y11, enumC2133i08);
        zzia = w38;
        W w39 = new W("UINT32_LIST", 29, 29, y11, enumC2133i04);
        zzib = w39;
        W w40 = new W("ENUM_LIST", 30, 30, y11, enumC2133i09);
        zzic = w40;
        W w41 = new W("SFIXED32_LIST", 31, 31, y11, enumC2133i04);
        zzid = w41;
        W w42 = new W("SFIXED64_LIST", 32, 32, y11, enumC2133i03);
        zzie = w42;
        W w43 = new W("SINT32_LIST", 33, 33, y11, enumC2133i04);
        zzif = w43;
        W w44 = new W("SINT64_LIST", 34, 34, y11, enumC2133i03);
        zzig = w44;
        Y y12 = Y.PACKED_VECTOR;
        W w45 = new W("DOUBLE_LIST_PACKED", 35, 35, y12, enumC2133i0);
        zzih = w45;
        W w46 = new W("FLOAT_LIST_PACKED", 36, 36, y12, enumC2133i02);
        zzii = w46;
        W w47 = new W("INT64_LIST_PACKED", 37, 37, y12, enumC2133i03);
        zzij = w47;
        W w48 = new W("UINT64_LIST_PACKED", 38, 38, y12, enumC2133i03);
        zzik = w48;
        W w49 = new W("INT32_LIST_PACKED", 39, 39, y12, enumC2133i04);
        zzil = w49;
        W w50 = new W("FIXED64_LIST_PACKED", 40, 40, y12, enumC2133i03);
        zzim = w50;
        W w51 = new W("FIXED32_LIST_PACKED", 41, 41, y12, enumC2133i04);
        zzin = w51;
        W w52 = new W("BOOL_LIST_PACKED", 42, 42, y12, enumC2133i05);
        zzio = w52;
        W w53 = new W("UINT32_LIST_PACKED", 43, 43, y12, enumC2133i04);
        zzip = w53;
        W w54 = new W("ENUM_LIST_PACKED", 44, 44, y12, enumC2133i09);
        zziq = w54;
        W w55 = new W("SFIXED32_LIST_PACKED", 45, 45, y12, enumC2133i04);
        zzir = w55;
        W w56 = new W("SFIXED64_LIST_PACKED", 46, 46, y12, enumC2133i03);
        zzis = w56;
        W w57 = new W("SINT32_LIST_PACKED", 47, 47, y12, enumC2133i04);
        zzit = w57;
        W w58 = new W("SINT64_LIST_PACKED", 48, 48, y12, enumC2133i03);
        zziu = w58;
        W w59 = new W("GROUP_LIST", 49, 49, y11, enumC2133i07);
        zziv = w59;
        W w60 = new W("MAP", 50, 50, Y.MAP, EnumC2133i0.zzkx);
        zziw = w60;
        zzjd = new W[]{w10, w11, w12, w13, w14, w15, w16, w17, w18, w19, w20, w21, w22, w23, w24, w25, w26, w27, w28, w29, w30, w31, w32, w33, w34, w35, w36, w37, w38, w39, w40, w41, w42, w43, w44, w45, w46, w47, w48, w49, w50, w51, w52, w53, w54, w55, w56, w57, w58, w59, w60};
        zzjc = new Type[0];
        W[] values = values();
        zzjb = new W[values.length];
        for (W w61 : values) {
            zzjb[w61.f23953id] = w61;
        }
    }

    private W(String str, int i10, int i11, Y y10, EnumC2133i0 enumC2133i0) {
        int i12;
        this.f23953id = i11;
        this.zziy = y10;
        this.zzix = enumC2133i0;
        int i13 = X.f23955a[y10.ordinal()];
        this.zziz = (i13 == 1 || i13 == 2) ? enumC2133i0.zzbq() : null;
        this.zzja = (y10 != Y.SCALAR || (i12 = X.f23956b[enumC2133i0.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static W[] values() {
        return (W[]) zzjd.clone();
    }

    public final int id() {
        return this.f23953id;
    }
}
