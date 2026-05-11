package com.google.android.gms.internal.clearcut;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzqe' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.clearcut.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class EnumC2149n1 {
    public static final EnumC2149n1 zzqc;
    public static final EnumC2149n1 zzqd;
    public static final EnumC2149n1 zzqe;
    public static final EnumC2149n1 zzqf;
    public static final EnumC2149n1 zzqg;
    public static final EnumC2149n1 zzqh;
    public static final EnumC2149n1 zzqi;
    public static final EnumC2149n1 zzqj;
    public static final EnumC2149n1 zzqk;
    public static final EnumC2149n1 zzql;
    public static final EnumC2149n1 zzqm;
    public static final EnumC2149n1 zzqn;
    public static final EnumC2149n1 zzqo;
    public static final EnumC2149n1 zzqp;
    public static final EnumC2149n1 zzqq;
    public static final EnumC2149n1 zzqr;
    public static final EnumC2149n1 zzqs;
    public static final EnumC2149n1 zzqt;
    private static final /* synthetic */ EnumC2149n1[] zzqw;
    private final EnumC2163s1 zzqu;
    private final int zzqv;

    static {
        EnumC2149n1 enumC2149n1 = new EnumC2149n1("DOUBLE", 0, EnumC2163s1.DOUBLE, 1);
        zzqc = enumC2149n1;
        EnumC2149n1 enumC2149n12 = new EnumC2149n1("FLOAT", 1, EnumC2163s1.FLOAT, 5);
        zzqd = enumC2149n12;
        EnumC2163s1 enumC2163s1 = EnumC2163s1.LONG;
        final int i10 = 2;
        EnumC2149n1 enumC2149n13 = new EnumC2149n1("INT64", 2, enumC2163s1, 0);
        zzqe = enumC2149n13;
        final int i11 = 3;
        EnumC2149n1 enumC2149n14 = new EnumC2149n1("UINT64", 3, enumC2163s1, 0);
        zzqf = enumC2149n14;
        EnumC2163s1 enumC2163s12 = EnumC2163s1.INT;
        EnumC2149n1 enumC2149n15 = new EnumC2149n1("INT32", 4, enumC2163s12, 0);
        zzqg = enumC2149n15;
        EnumC2149n1 enumC2149n16 = new EnumC2149n1("FIXED64", 5, enumC2163s1, 1);
        zzqh = enumC2149n16;
        EnumC2149n1 enumC2149n17 = new EnumC2149n1("FIXED32", 6, enumC2163s12, 5);
        zzqi = enumC2149n17;
        EnumC2149n1 enumC2149n18 = new EnumC2149n1("BOOL", 7, EnumC2163s1.BOOLEAN, 0);
        zzqj = enumC2149n18;
        final int i12 = 8;
        final EnumC2163s1 enumC2163s13 = EnumC2163s1.STRING;
        final String str = "STRING";
        EnumC2149n1 enumC2149n19 = new EnumC2149n1(str, i12, enumC2163s13, i10) { // from class: com.google.android.gms.internal.clearcut.o1
            {
                int i13 = 2;
                int i14 = 8;
            }
        };
        zzqk = enumC2149n19;
        final EnumC2163s1 enumC2163s14 = EnumC2163s1.MESSAGE;
        final String str2 = "GROUP";
        final int i13 = 9;
        EnumC2149n1 enumC2149n110 = new EnumC2149n1(str2, i13, enumC2163s14, i11) { // from class: com.google.android.gms.internal.clearcut.p1
            {
                int i14 = 3;
                int i15 = 9;
            }
        };
        zzql = enumC2149n110;
        final String str3 = "MESSAGE";
        final int i14 = 10;
        final int i15 = 2;
        EnumC2149n1 enumC2149n111 = new EnumC2149n1(str3, i14, enumC2163s14, i15) { // from class: com.google.android.gms.internal.clearcut.q1
            {
                int i16 = 2;
                int i17 = 10;
            }
        };
        zzqm = enumC2149n111;
        final int i16 = 11;
        final EnumC2163s1 enumC2163s15 = EnumC2163s1.BYTE_STRING;
        final String str4 = "BYTES";
        EnumC2149n1 enumC2149n112 = new EnumC2149n1(str4, i16, enumC2163s15, i15) { // from class: com.google.android.gms.internal.clearcut.r1
            {
                int i17 = 2;
                int i18 = 11;
            }
        };
        zzqn = enumC2149n112;
        EnumC2149n1 enumC2149n113 = new EnumC2149n1("UINT32", 12, enumC2163s12, 0);
        zzqo = enumC2149n113;
        EnumC2149n1 enumC2149n114 = new EnumC2149n1("ENUM", 13, EnumC2163s1.ENUM, 0);
        zzqp = enumC2149n114;
        EnumC2149n1 enumC2149n115 = new EnumC2149n1("SFIXED32", 14, enumC2163s12, 5);
        zzqq = enumC2149n115;
        EnumC2149n1 enumC2149n116 = new EnumC2149n1("SFIXED64", 15, enumC2163s1, 1);
        zzqr = enumC2149n116;
        EnumC2149n1 enumC2149n117 = new EnumC2149n1("SINT32", 16, enumC2163s12, 0);
        zzqs = enumC2149n117;
        EnumC2149n1 enumC2149n118 = new EnumC2149n1("SINT64", 17, enumC2163s1, 0);
        zzqt = enumC2149n118;
        zzqw = new EnumC2149n1[]{enumC2149n1, enumC2149n12, enumC2149n13, enumC2149n14, enumC2149n15, enumC2149n16, enumC2149n17, enumC2149n18, enumC2149n19, enumC2149n110, enumC2149n111, enumC2149n112, enumC2149n113, enumC2149n114, enumC2149n115, enumC2149n116, enumC2149n117, enumC2149n118};
    }

    private EnumC2149n1(String str, int i10, EnumC2163s1 enumC2163s1, int i11) {
        this.zzqu = enumC2163s1;
        this.zzqv = i11;
    }

    public static EnumC2149n1[] values() {
        return (EnumC2149n1[]) zzqw.clone();
    }

    public final EnumC2163s1 zzek() {
        return this.zzqu;
    }

    public final int zzel() {
        return this.zzqv;
    }
}
