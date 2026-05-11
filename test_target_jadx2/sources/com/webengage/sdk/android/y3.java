package com.webengage.sdk.android;

import com.webengage.sdk.android.m3;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class y3 {

    /* renamed from: b, reason: collision with root package name */
    public static final y3 f31157b;

    /* renamed from: c, reason: collision with root package name */
    public static final y3 f31158c;

    /* renamed from: d, reason: collision with root package name */
    public static final y3 f31159d;

    /* renamed from: e, reason: collision with root package name */
    public static final y3 f31160e;

    /* renamed from: f, reason: collision with root package name */
    public static final y3 f31161f;

    /* renamed from: g, reason: collision with root package name */
    public static final y3 f31162g;

    /* renamed from: h, reason: collision with root package name */
    public static final y3 f31163h;

    /* renamed from: i, reason: collision with root package name */
    public static final y3 f31164i;

    /* renamed from: j, reason: collision with root package name */
    public static final y3 f31165j;

    /* renamed from: k, reason: collision with root package name */
    public static final y3 f31166k;

    /* renamed from: l, reason: collision with root package name */
    public static final y3 f31167l;

    /* renamed from: m, reason: collision with root package name */
    public static final y3 f31168m;

    /* renamed from: n, reason: collision with root package name */
    public static final y3 f31169n;

    /* renamed from: o, reason: collision with root package name */
    public static final y3 f31170o;

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ y3[] f31171p;

    /* renamed from: a, reason: collision with root package name */
    m3.a[] f31172a;

    static {
        m3.a aVar = e0.f30505c;
        m3.a aVar2 = b1.f30470d;
        y3 y3Var = new y3("BOOT_UP", 0, new m3.a[]{o.f30736c, aVar, aVar2});
        f31157b = y3Var;
        m3.a aVar3 = com.webengage.sdk.android.actions.render.o.f30427c;
        m3.a aVar4 = com.webengage.sdk.android.actions.database.a.f30283c;
        m3.a aVar5 = com.webengage.sdk.android.actions.rules.d.f30462c;
        m3.a aVar6 = p2.f30764d;
        y3 y3Var2 = new y3("EVENT", 1, new m3.a[]{aVar3, aVar4, aVar5, aVar2, aVar6});
        f31158c = y3Var2;
        y3 y3Var3 = new y3("GCM_MESSAGE", 2, new m3.a[]{aVar4, aVar3});
        f31159d = y3Var3;
        y3 y3Var4 = new y3("CONFIG_REFRESH", 3, new m3.a[]{aVar});
        f31160e = y3Var4;
        y3 y3Var5 = new y3("SYNC_TO_SERVER", 4, new m3.a[]{r3.f30793c});
        f31161f = y3Var5;
        y3 y3Var6 = new y3("DEEPLINK", 5, new m3.a[]{k0.f30679c});
        f31162g = y3Var6;
        y3 y3Var7 = new y3("EXCEPTION", 6, new m3.a[]{r0.f30787c});
        f31163h = y3Var7;
        y3 y3Var8 = new y3("INTERNAL_EVENT", 7, new m3.a[]{aVar3, aVar4, aVar5});
        f31164i = y3Var8;
        y3 y3Var9 = new y3("DATA", 8, new m3.a[]{aVar4});
        f31165j = y3Var9;
        y3 y3Var10 = new y3("RENDER", 9, new m3.a[]{aVar3});
        f31166k = y3Var10;
        y3 y3Var11 = new y3("RULE_EXECUTION", 10, new m3.a[]{aVar5});
        f31167l = y3Var11;
        y3 y3Var12 = new y3("FETCH_PROFILE", 11, new m3.a[]{com.webengage.sdk.android.actions.database.g.f30299c});
        f31168m = y3Var12;
        y3 y3Var13 = new y3("REPORT", 12, new m3.a[]{aVar6});
        f31169n = y3Var13;
        y3 y3Var14 = new y3("AMPLIFY", 13, new m3.a[]{C2957e.f30502c});
        f31170o = y3Var14;
        f31171p = new y3[]{y3Var, y3Var2, y3Var3, y3Var4, y3Var5, y3Var6, y3Var7, y3Var8, y3Var9, y3Var10, y3Var11, y3Var12, y3Var13, y3Var14};
    }

    private y3(String str, int i10, m3.a[] aVarArr) {
        this.f31172a = aVarArr;
    }

    public static y3 valueOf(String str) {
        return (y3) Enum.valueOf(y3.class, str);
    }

    public static y3[] values() {
        return (y3[]) f31171p.clone();
    }

    protected m3.a[] a() {
        return this.f31172a;
    }
}
