package com.google.android.gms.internal.clearcut;

import org.conscrypt.BuildConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzky' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.clearcut.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2133i0 {
    public static final EnumC2133i0 zzkx;
    public static final EnumC2133i0 zzky;
    public static final EnumC2133i0 zzkz;
    public static final EnumC2133i0 zzla;
    public static final EnumC2133i0 zzlb;
    public static final EnumC2133i0 zzlc;
    public static final EnumC2133i0 zzld;
    public static final EnumC2133i0 zzle;
    public static final EnumC2133i0 zzlf;
    public static final EnumC2133i0 zzlg;
    private static final /* synthetic */ EnumC2133i0[] zzlk;
    private final Class<?> zzlh;
    private final Class<?> zzli;
    private final Object zzlj;

    static {
        EnumC2133i0 enumC2133i0 = new EnumC2133i0("VOID", 0, Void.class, Void.class, null);
        zzkx = enumC2133i0;
        Class cls = Integer.TYPE;
        EnumC2133i0 enumC2133i02 = new EnumC2133i0("INT", 1, cls, Integer.class, 0);
        zzky = enumC2133i02;
        EnumC2133i0 enumC2133i03 = new EnumC2133i0("LONG", 2, Long.TYPE, Long.class, 0L);
        zzkz = enumC2133i03;
        EnumC2133i0 enumC2133i04 = new EnumC2133i0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzla = enumC2133i04;
        EnumC2133i0 enumC2133i05 = new EnumC2133i0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zzlb = enumC2133i05;
        EnumC2133i0 enumC2133i06 = new EnumC2133i0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzlc = enumC2133i06;
        EnumC2133i0 enumC2133i07 = new EnumC2133i0("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        zzld = enumC2133i07;
        EnumC2133i0 enumC2133i08 = new EnumC2133i0("BYTE_STRING", 7, AbstractC2179y.class, AbstractC2179y.class, AbstractC2179y.f24108b);
        zzle = enumC2133i08;
        EnumC2133i0 enumC2133i09 = new EnumC2133i0("ENUM", 8, cls, Integer.class, null);
        zzlf = enumC2133i09;
        EnumC2133i0 enumC2133i010 = new EnumC2133i0("MESSAGE", 9, Object.class, Object.class, null);
        zzlg = enumC2133i010;
        zzlk = new EnumC2133i0[]{enumC2133i0, enumC2133i02, enumC2133i03, enumC2133i04, enumC2133i05, enumC2133i06, enumC2133i07, enumC2133i08, enumC2133i09, enumC2133i010};
    }

    private EnumC2133i0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzlh = cls;
        this.zzli = cls2;
        this.zzlj = obj;
    }

    public static EnumC2133i0[] values() {
        return (EnumC2133i0[]) zzlk.clone();
    }

    public final Class<?> zzbq() {
        return this.zzli;
    }
}
