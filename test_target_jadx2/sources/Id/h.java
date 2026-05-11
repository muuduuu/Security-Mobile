package id;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f34194a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final f f34195b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f34196c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f34197d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f34198e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f34199f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f34200g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f34201h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f34202i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f34203j;

    /* renamed from: k, reason: collision with root package name */
    public static final f f34204k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f34205l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f34206m;

    /* renamed from: n, reason: collision with root package name */
    public static final f f34207n;

    /* renamed from: o, reason: collision with root package name */
    public static final f f34208o;

    /* renamed from: p, reason: collision with root package name */
    public static final f f34209p;

    /* renamed from: q, reason: collision with root package name */
    public static final f f34210q;

    static {
        f r10 = f.r("<no name provided>");
        Intrinsics.checkNotNullExpressionValue(r10, "special(...)");
        f34195b = r10;
        f r11 = f.r("<root package>");
        Intrinsics.checkNotNullExpressionValue(r11, "special(...)");
        f34196c = r11;
        f o10 = f.o("Companion");
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        f34197d = o10;
        f o11 = f.o("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        Intrinsics.checkNotNullExpressionValue(o11, "identifier(...)");
        f34198e = o11;
        f r12 = f.r("<anonymous>");
        Intrinsics.checkNotNullExpressionValue(r12, "special(...)");
        f34199f = r12;
        f r13 = f.r("<unary>");
        Intrinsics.checkNotNullExpressionValue(r13, "special(...)");
        f34200g = r13;
        f r14 = f.r("<this>");
        Intrinsics.checkNotNullExpressionValue(r14, "special(...)");
        f34201h = r14;
        f r15 = f.r("<init>");
        Intrinsics.checkNotNullExpressionValue(r15, "special(...)");
        f34202i = r15;
        f r16 = f.r("<iterator>");
        Intrinsics.checkNotNullExpressionValue(r16, "special(...)");
        f34203j = r16;
        f r17 = f.r("<destruct>");
        Intrinsics.checkNotNullExpressionValue(r17, "special(...)");
        f34204k = r17;
        f r18 = f.r("<local>");
        Intrinsics.checkNotNullExpressionValue(r18, "special(...)");
        f34205l = r18;
        f r19 = f.r("<unused var>");
        Intrinsics.checkNotNullExpressionValue(r19, "special(...)");
        f34206m = r19;
        f r20 = f.r("<set-?>");
        Intrinsics.checkNotNullExpressionValue(r20, "special(...)");
        f34207n = r20;
        f r21 = f.r("<array>");
        Intrinsics.checkNotNullExpressionValue(r21, "special(...)");
        f34208o = r21;
        f r22 = f.r("<receiver>");
        Intrinsics.checkNotNullExpressionValue(r22, "special(...)");
        f34209p = r22;
        f r23 = f.r("<get-entries>");
        Intrinsics.checkNotNullExpressionValue(r23, "special(...)");
        f34210q = r23;
    }

    private h() {
    }

    public static final f b(f fVar) {
        return (fVar == null || fVar.p()) ? f34198e : fVar;
    }

    public final boolean a(f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String c10 = name.c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        return c10.length() > 0 && !name.p();
    }
}
