package o0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l0.C3591c;
import l0.C3592d;
import l0.C3597i;
import n0.C3702a;
import o0.d;
import org.conscrypt.BuildConfig;
import p0.l;
import p0.n;
import p0.p;

/* loaded from: classes.dex */
public class e {

    /* renamed from: J0, reason: collision with root package name */
    public static float f37672J0 = 0.5f;

    /* renamed from: A0, reason: collision with root package name */
    boolean f37674A0;

    /* renamed from: B0, reason: collision with root package name */
    boolean f37676B0;

    /* renamed from: C0, reason: collision with root package name */
    public float[] f37678C0;

    /* renamed from: D0, reason: collision with root package name */
    protected e[] f37680D0;

    /* renamed from: E0, reason: collision with root package name */
    protected e[] f37682E0;

    /* renamed from: F0, reason: collision with root package name */
    e f37684F0;

    /* renamed from: G0, reason: collision with root package name */
    e f37686G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f37688H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f37690I0;

    /* renamed from: K, reason: collision with root package name */
    private boolean f37692K;

    /* renamed from: V, reason: collision with root package name */
    public d f37703V;

    /* renamed from: W, reason: collision with root package name */
    public d[] f37704W;

    /* renamed from: X, reason: collision with root package name */
    protected ArrayList f37705X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean[] f37706Y;

    /* renamed from: Z, reason: collision with root package name */
    public b[] f37707Z;

    /* renamed from: a0, reason: collision with root package name */
    public e f37709a0;

    /* renamed from: b0, reason: collision with root package name */
    int f37711b0;

    /* renamed from: c, reason: collision with root package name */
    public p0.c f37712c;

    /* renamed from: c0, reason: collision with root package name */
    int f37713c0;

    /* renamed from: d, reason: collision with root package name */
    public p0.c f37714d;

    /* renamed from: d0, reason: collision with root package name */
    public float f37715d0;

    /* renamed from: e0, reason: collision with root package name */
    protected int f37717e0;

    /* renamed from: f0, reason: collision with root package name */
    protected int f37719f0;

    /* renamed from: g0, reason: collision with root package name */
    protected int f37721g0;

    /* renamed from: h0, reason: collision with root package name */
    int f37723h0;

    /* renamed from: i0, reason: collision with root package name */
    int f37725i0;

    /* renamed from: j0, reason: collision with root package name */
    protected int f37727j0;

    /* renamed from: k0, reason: collision with root package name */
    protected int f37729k0;

    /* renamed from: l0, reason: collision with root package name */
    int f37731l0;

    /* renamed from: m0, reason: collision with root package name */
    protected int f37733m0;

    /* renamed from: n0, reason: collision with root package name */
    protected int f37735n0;

    /* renamed from: o, reason: collision with root package name */
    public String f37736o;

    /* renamed from: o0, reason: collision with root package name */
    float f37737o0;

    /* renamed from: p0, reason: collision with root package name */
    float f37739p0;

    /* renamed from: q0, reason: collision with root package name */
    private Object f37741q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f37743r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f37745s0;

    /* renamed from: t0, reason: collision with root package name */
    private String f37747t0;

    /* renamed from: u0, reason: collision with root package name */
    private String f37749u0;

    /* renamed from: v0, reason: collision with root package name */
    boolean f37751v0;

    /* renamed from: w0, reason: collision with root package name */
    boolean f37753w0;

    /* renamed from: x0, reason: collision with root package name */
    boolean f37755x0;

    /* renamed from: y0, reason: collision with root package name */
    int f37757y0;

    /* renamed from: z0, reason: collision with root package name */
    int f37759z0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f37708a = false;

    /* renamed from: b, reason: collision with root package name */
    public p[] f37710b = new p[2];

    /* renamed from: e, reason: collision with root package name */
    public l f37716e = null;

    /* renamed from: f, reason: collision with root package name */
    public n f37718f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f37720g = {true, true};

    /* renamed from: h, reason: collision with root package name */
    boolean f37722h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f37724i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f37726j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f37728k = true;

    /* renamed from: l, reason: collision with root package name */
    private int f37730l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f37732m = -1;

    /* renamed from: n, reason: collision with root package name */
    public C3702a f37734n = new C3702a(this);

    /* renamed from: p, reason: collision with root package name */
    private boolean f37738p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37740q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f37742r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f37744s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f37746t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f37748u = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f37750v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f37752w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f37754x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int[] f37756y = new int[2];

    /* renamed from: z, reason: collision with root package name */
    public int f37758z = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f37673A = 0;

    /* renamed from: B, reason: collision with root package name */
    public float f37675B = 1.0f;

    /* renamed from: C, reason: collision with root package name */
    public int f37677C = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f37679D = 0;

    /* renamed from: E, reason: collision with root package name */
    public float f37681E = 1.0f;

    /* renamed from: F, reason: collision with root package name */
    int f37683F = -1;

    /* renamed from: G, reason: collision with root package name */
    float f37685G = 1.0f;

    /* renamed from: H, reason: collision with root package name */
    private int[] f37687H = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: I, reason: collision with root package name */
    private float f37689I = 0.0f;

    /* renamed from: J, reason: collision with root package name */
    private boolean f37691J = false;

    /* renamed from: L, reason: collision with root package name */
    private boolean f37693L = false;

    /* renamed from: M, reason: collision with root package name */
    private int f37694M = 0;

    /* renamed from: N, reason: collision with root package name */
    private int f37695N = 0;

    /* renamed from: O, reason: collision with root package name */
    public d f37696O = new d(this, d.b.LEFT);

    /* renamed from: P, reason: collision with root package name */
    public d f37697P = new d(this, d.b.TOP);

    /* renamed from: Q, reason: collision with root package name */
    public d f37698Q = new d(this, d.b.RIGHT);

    /* renamed from: R, reason: collision with root package name */
    public d f37699R = new d(this, d.b.BOTTOM);

    /* renamed from: S, reason: collision with root package name */
    public d f37700S = new d(this, d.b.BASELINE);

    /* renamed from: T, reason: collision with root package name */
    d f37701T = new d(this, d.b.CENTER_X);

    /* renamed from: U, reason: collision with root package name */
    d f37702U = new d(this, d.b.CENTER_Y);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37760a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f37761b;

        static {
            int[] iArr = new int[b.values().length];
            f37761b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37761b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37761b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37761b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f37760a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37760a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37760a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37760a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37760a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37760a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37760a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37760a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37760a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.f37703V = dVar;
        this.f37704W = new d[]{this.f37696O, this.f37698Q, this.f37697P, this.f37699R, this.f37700S, dVar};
        this.f37705X = new ArrayList();
        this.f37706Y = new boolean[2];
        b bVar = b.FIXED;
        this.f37707Z = new b[]{bVar, bVar};
        this.f37709a0 = null;
        this.f37711b0 = 0;
        this.f37713c0 = 0;
        this.f37715d0 = 0.0f;
        this.f37717e0 = -1;
        this.f37719f0 = 0;
        this.f37721g0 = 0;
        this.f37723h0 = 0;
        this.f37725i0 = 0;
        this.f37727j0 = 0;
        this.f37729k0 = 0;
        this.f37731l0 = 0;
        float f10 = f37672J0;
        this.f37737o0 = f10;
        this.f37739p0 = f10;
        this.f37743r0 = 0;
        this.f37745s0 = 0;
        this.f37747t0 = null;
        this.f37749u0 = null;
        this.f37755x0 = false;
        this.f37757y0 = 0;
        this.f37759z0 = 0;
        this.f37678C0 = new float[]{-1.0f, -1.0f};
        this.f37680D0 = new e[]{null, null};
        this.f37682E0 = new e[]{null, null};
        this.f37684F0 = null;
        this.f37686G0 = null;
        this.f37688H0 = -1;
        this.f37690I0 = -1;
        d();
    }

    private void N(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        v0(sb2, "      size", i10, 0);
        v0(sb2, "      min", i11, 0);
        v0(sb2, "      max", i12, Integer.MAX_VALUE);
        v0(sb2, "      matchMin", i14, 0);
        v0(sb2, "      matchDef", i15, 0);
        u0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    private void O(StringBuilder sb2, String str, d dVar) {
        if (dVar.f37667f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f37667f);
        sb2.append("'");
        if (dVar.f37669h != Integer.MIN_VALUE || dVar.f37668g != 0) {
            sb2.append(",");
            sb2.append(dVar.f37668g);
            if (dVar.f37669h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f37669h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    private void d() {
        this.f37705X.add(this.f37696O);
        this.f37705X.add(this.f37697P);
        this.f37705X.add(this.f37698Q);
        this.f37705X.add(this.f37699R);
        this.f37705X.add(this.f37701T);
        this.f37705X.add(this.f37702U);
        this.f37705X.add(this.f37703V);
        this.f37705X.add(this.f37700S);
    }

    private boolean d0(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.f37704W;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f37667f;
        return (dVar4 == null || dVar4.f37667f == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f37667f) == null || dVar2.f37667f != dVar) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0497, code lost:
    
        if ((r4 instanceof o0.C3736a) != false) goto L266;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x053a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0585 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0557 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i(C3592d c3592d, boolean z10, boolean z11, boolean z12, boolean z13, C3597i c3597i, C3597i c3597i2, b bVar, boolean z14, d dVar, d dVar2, int i10, int i11, int i12, int i13, float f10, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15, int i16, int i17, float f11, boolean z20) {
        int i18;
        boolean z21;
        int i19;
        int i20;
        int i21;
        C3597i c3597i3;
        int i22;
        int i23;
        C3597i c3597i4;
        C3597i c3597i5;
        C3597i c3597i6;
        int i24;
        boolean z22;
        boolean z23;
        C3597i q10;
        C3597i q11;
        d dVar3;
        int i25;
        C3597i c3597i7;
        int i26;
        boolean z24;
        int i27;
        C3597i c3597i8;
        char c10;
        char c11;
        boolean z25;
        boolean z26;
        int i28;
        int i29;
        int i30;
        C3597i c3597i9;
        int i31;
        boolean z27;
        boolean z28;
        C3597i c3597i10;
        e eVar;
        e eVar2;
        boolean z29;
        e eVar3;
        C3597i c3597i11;
        int i32;
        int i33;
        boolean z30;
        boolean z31;
        e eVar4;
        e eVar5;
        C3597i c3597i12;
        e eVar6;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        boolean z32;
        int i41;
        int i42;
        boolean z33;
        boolean z34;
        e eVar7;
        e eVar8;
        int i43 = i17;
        C3597i q12 = c3592d.q(dVar);
        C3597i q13 = c3592d.q(dVar2);
        C3597i q14 = c3592d.q(dVar.i());
        C3597i q15 = c3592d.q(dVar2.i());
        C3592d.x();
        boolean n10 = dVar.n();
        boolean n11 = dVar2.n();
        boolean n12 = this.f37703V.n();
        int i44 = n11 ? (n10 ? 1 : 0) + 1 : n10 ? 1 : 0;
        if (n12) {
            i44++;
        }
        int i45 = z15 ? 3 : i14;
        int i46 = a.f37761b[bVar.ordinal()];
        if (i46 == 1 || i46 == 2 || i46 == 3 || i46 != 4) {
            i18 = i45;
        } else {
            i18 = i45;
            if (i18 != 4) {
                z21 = true;
                i19 = this.f37730l;
                if (i19 != -1 && z10) {
                    this.f37730l = -1;
                    i11 = i19;
                    z21 = false;
                }
                i20 = this.f37732m;
                if (i20 != -1 || z10) {
                    i20 = i11;
                } else {
                    this.f37732m = -1;
                    z21 = false;
                }
                int i47 = i20;
                if (this.f37745s0 != 8) {
                    i21 = 0;
                    z21 = false;
                } else {
                    i21 = i47;
                }
                if (z20) {
                    c3597i3 = q15;
                    i22 = 8;
                } else {
                    if (!n10 && !n11 && !n12) {
                        c3592d.f(q12, i10);
                    } else if (n10 && !n11) {
                        c3597i3 = q15;
                        i22 = 8;
                        c3592d.e(q12, q14, dVar.e(), 8);
                    }
                    c3597i3 = q15;
                    i22 = 8;
                }
                if (z21) {
                    if (z14) {
                        c3592d.e(q13, q12, 0, 3);
                        if (i12 > 0) {
                            c3592d.h(q13, q12, i12, 8);
                        }
                        if (i13 < Integer.MAX_VALUE) {
                            c3592d.j(q13, q12, i13, 8);
                        }
                    } else {
                        c3592d.e(q13, q12, i21, i22);
                    }
                    i23 = i44;
                    c3597i4 = q14;
                    c3597i5 = q13;
                    z22 = z21;
                    c3597i6 = c3597i3;
                    z23 = z13;
                } else if (i44 == 2 || z15 || !(i18 == 1 || i18 == 0)) {
                    int i48 = i16 == -2 ? i21 : i16;
                    int i49 = i43 == -2 ? i21 : i43;
                    if (i21 > 0 && i18 != 1) {
                        i21 = 0;
                    }
                    if (i48 > 0) {
                        c3592d.h(q13, q12, i48, 8);
                        i21 = Math.max(i21, i48);
                    }
                    if (i49 > 0) {
                        if (!z11 || i18 != 1) {
                            c3592d.j(q13, q12, i49, 8);
                        }
                        i21 = Math.min(i21, i49);
                    }
                    if (i18 == 1) {
                        if (z11) {
                            c3592d.e(q13, q12, i21, 8);
                        } else if (z17) {
                            c3592d.e(q13, q12, i21, 5);
                            c3592d.j(q13, q12, i21, 8);
                        } else {
                            c3592d.e(q13, q12, i21, 5);
                            c3592d.j(q13, q12, i21, 8);
                        }
                        i43 = i49;
                        i23 = i44;
                        c3597i5 = q13;
                        z22 = z21;
                        c3597i6 = c3597i3;
                        z23 = z13;
                        i24 = i48;
                        c3597i4 = q14;
                    } else if (i18 == 2) {
                        d.b j10 = dVar.j();
                        d.b bVar2 = d.b.TOP;
                        if (j10 == bVar2 || dVar.j() == d.b.BOTTOM) {
                            q10 = c3592d.q(this.f37709a0.m(bVar2));
                            q11 = c3592d.q(this.f37709a0.m(d.b.BOTTOM));
                        } else {
                            q10 = c3592d.q(this.f37709a0.m(d.b.LEFT));
                            q11 = c3592d.q(this.f37709a0.m(d.b.RIGHT));
                        }
                        int i50 = i49;
                        i23 = i44;
                        c3597i6 = c3597i3;
                        int i51 = i48;
                        c3597i4 = q14;
                        c3597i5 = q13;
                        c3592d.d(c3592d.r().k(q13, q12, q11, q10, f11));
                        if (z11) {
                            z21 = false;
                        }
                        i43 = i50;
                        i24 = i51;
                        z22 = z21;
                        z23 = z13;
                    } else {
                        int i52 = i49;
                        int i53 = i48;
                        i23 = i44;
                        c3597i4 = q14;
                        c3597i5 = q13;
                        c3597i6 = c3597i3;
                        i43 = i52;
                        i24 = i53;
                        z22 = z21;
                        z23 = true;
                    }
                    if (z20 || z17) {
                        if (i23 < 2 && z11 && z23) {
                            c3592d.h(q12, c3597i, 0, 8);
                            Object[] objArr = z10 || this.f37700S.f37667f == null;
                            if (!z10 && (dVar3 = this.f37700S.f37667f) != null) {
                                e eVar9 = dVar3.f37665d;
                                if (eVar9.f37715d0 != 0.0f) {
                                    b[] bVarArr = eVar9.f37707Z;
                                    b bVar3 = bVarArr[0];
                                    b bVar4 = b.MATCH_CONSTRAINT;
                                    if (bVar3 == bVar4 && bVarArr[1] == bVar4) {
                                        objArr = true;
                                    }
                                }
                                objArr = false;
                            }
                            if (objArr == true) {
                                c3592d.h(c3597i2, c3597i5, 0, 8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (n10 || n11 || n12) {
                        if (!n10 || n11) {
                            if (!n10 && n11) {
                                c3592d.e(c3597i5, c3597i6, -dVar2.e(), 8);
                                if (z11) {
                                    if (this.f37726j && q12.f36967g && (eVar7 = this.f37709a0) != null) {
                                        f fVar = (f) eVar7;
                                        if (z10) {
                                            fVar.v1(dVar);
                                        } else {
                                            fVar.A1(dVar);
                                        }
                                    } else {
                                        c3592d.h(q12, c3597i, 0, 5);
                                        i25 = 0;
                                        i26 = 5;
                                        c3597i7 = c3597i6;
                                    }
                                }
                            } else if (n10 && n11) {
                                e eVar10 = dVar.f37667f.f37665d;
                                e eVar11 = dVar2.f37667f.f37665d;
                                e I10 = I();
                                if (z22) {
                                    if (i18 == 0) {
                                        if (i43 != 0 || i24 != 0) {
                                            z32 = false;
                                            i41 = 5;
                                            i42 = 5;
                                            z33 = true;
                                            z34 = true;
                                        } else if (c3597i4.f36967g && c3597i6.f36967g) {
                                            c3592d.e(q12, c3597i4, dVar.e(), 8);
                                            c3592d.e(c3597i5, c3597i6, -dVar2.e(), 8);
                                            return;
                                        } else {
                                            i41 = 8;
                                            i42 = 8;
                                            z33 = false;
                                            z34 = false;
                                            z32 = true;
                                        }
                                        if ((eVar10 instanceof C3736a) || (eVar11 instanceof C3736a)) {
                                            c3597i8 = c3597i2;
                                            i28 = 6;
                                            z26 = z33;
                                            z27 = z32;
                                            z25 = z34;
                                            z24 = true;
                                            i27 = 8;
                                            c11 = 5;
                                            i30 = 4;
                                        } else {
                                            c3597i8 = c3597i2;
                                            i28 = 6;
                                            i30 = i42;
                                            z26 = z33;
                                            z27 = z32;
                                            z25 = z34;
                                            z24 = true;
                                            i27 = 8;
                                            c11 = 5;
                                        }
                                        i29 = i41;
                                        c10 = 3;
                                    } else {
                                        i27 = 8;
                                        if (i18 == 2) {
                                            if ((eVar10 instanceof C3736a) || (eVar11 instanceof C3736a)) {
                                                c3597i8 = c3597i2;
                                                z27 = false;
                                                i28 = 6;
                                                c10 = 3;
                                                z24 = true;
                                                c11 = 5;
                                                i30 = 4;
                                            } else {
                                                c3597i8 = c3597i2;
                                                z27 = false;
                                                i28 = 6;
                                                c10 = 3;
                                                z24 = true;
                                                c11 = 5;
                                                i30 = 5;
                                            }
                                            i29 = 5;
                                        } else if (i18 == 1) {
                                            c3597i8 = c3597i2;
                                            z27 = false;
                                            i28 = 6;
                                            i29 = 8;
                                            c10 = 3;
                                            z24 = true;
                                            c11 = 5;
                                            i30 = 4;
                                        } else {
                                            c10 = 3;
                                            if (i18 != 3) {
                                                z24 = true;
                                                c3597i8 = c3597i2;
                                                i28 = 6;
                                                c11 = 5;
                                                i30 = 4;
                                                i29 = 5;
                                                z25 = false;
                                                z26 = false;
                                            } else if (this.f37683F == -1) {
                                                if (z18) {
                                                    c3597i8 = c3597i2;
                                                    i29 = 8;
                                                    c10 = 3;
                                                    z24 = true;
                                                    c11 = 5;
                                                    i28 = z11 ? 5 : 4;
                                                } else {
                                                    c3597i8 = c3597i2;
                                                    i28 = 8;
                                                    i29 = 8;
                                                    c10 = 3;
                                                    z24 = true;
                                                    c11 = 5;
                                                }
                                                i30 = 5;
                                                z25 = true;
                                                z26 = true;
                                                z27 = true;
                                            } else if (z15) {
                                                if (i15 != 2) {
                                                    z24 = true;
                                                    if (i15 != 1) {
                                                        i39 = 8;
                                                        i40 = 5;
                                                        i29 = i39;
                                                        i30 = i40;
                                                        z25 = z24;
                                                        z26 = z25;
                                                        z27 = z26;
                                                        i28 = 6;
                                                        c10 = 3;
                                                        c11 = 5;
                                                        c3597i8 = c3597i2;
                                                    }
                                                } else {
                                                    z24 = true;
                                                }
                                                i39 = 5;
                                                i40 = 4;
                                                i29 = i39;
                                                i30 = i40;
                                                z25 = z24;
                                                z26 = z25;
                                                z27 = z26;
                                                i28 = 6;
                                                c10 = 3;
                                                c11 = 5;
                                                c3597i8 = c3597i2;
                                            } else {
                                                z24 = true;
                                                if (i43 > 0) {
                                                    c3597i8 = c3597i2;
                                                    z25 = true;
                                                    z26 = true;
                                                    z27 = true;
                                                    i28 = 6;
                                                    c10 = 3;
                                                    c11 = 5;
                                                    i30 = 5;
                                                } else if (i43 != 0 || i24 != 0) {
                                                    c3597i8 = c3597i2;
                                                    z25 = true;
                                                    z26 = true;
                                                    z27 = true;
                                                    i28 = 6;
                                                    c10 = 3;
                                                    c11 = 5;
                                                    i30 = 4;
                                                } else if (z18) {
                                                    c3597i8 = c3597i2;
                                                    i29 = (eVar10 == I10 || eVar11 == I10) ? 5 : 4;
                                                    z25 = true;
                                                    z26 = true;
                                                    z27 = true;
                                                    i28 = 6;
                                                    c10 = 3;
                                                    c11 = 5;
                                                    i30 = 4;
                                                } else {
                                                    c3597i8 = c3597i2;
                                                    z25 = true;
                                                    z26 = true;
                                                    z27 = true;
                                                    i28 = 6;
                                                    i30 = 8;
                                                    c10 = 3;
                                                    c11 = 5;
                                                }
                                                i29 = 5;
                                            }
                                        }
                                        z25 = true;
                                        z26 = true;
                                    }
                                    if (z25 || c3597i4 != c3597i6 || eVar10 == I10) {
                                        z28 = z24;
                                    } else {
                                        z25 = false;
                                        z28 = false;
                                    }
                                    if (z26) {
                                        c3597i10 = c3597i4;
                                        eVar = I10;
                                        eVar2 = eVar11;
                                        z29 = z24;
                                        eVar3 = eVar10;
                                        c3597i11 = q12;
                                        i32 = i27;
                                        i33 = 4;
                                        z30 = z11;
                                    } else {
                                        if (z22 || z16 || z18 || c3597i4 != c3597i || c3597i6 != c3597i8) {
                                            i38 = i28;
                                            z30 = z11;
                                        } else {
                                            i29 = i27;
                                            i38 = i29;
                                            z30 = false;
                                            z28 = false;
                                        }
                                        c3597i10 = c3597i4;
                                        i32 = i27;
                                        i33 = 4;
                                        z29 = z24;
                                        eVar = I10;
                                        eVar2 = eVar11;
                                        eVar3 = eVar10;
                                        c3597i11 = q12;
                                        c3592d.c(q12, c3597i10, dVar.e(), f10, c3597i6, c3597i5, dVar2.e(), i38);
                                    }
                                    z31 = z28;
                                    if (this.f37745s0 != i32 && !dVar2.l()) {
                                        return;
                                    }
                                    C3597i c3597i13 = c3597i10;
                                    if (z25) {
                                        eVar4 = eVar2;
                                        eVar5 = eVar3;
                                        c3597i12 = c3597i11;
                                    } else {
                                        if (!z30 || c3597i13 == c3597i6 || z22) {
                                            eVar4 = eVar2;
                                            eVar5 = eVar3;
                                        } else {
                                            eVar5 = eVar3;
                                            if (eVar5 instanceof C3736a) {
                                                eVar4 = eVar2;
                                            } else {
                                                eVar4 = eVar2;
                                            }
                                            i37 = 6;
                                            c3597i12 = c3597i11;
                                            c3592d.h(c3597i12, c3597i13, dVar.e(), i37);
                                            c3592d.j(c3597i5, c3597i6, -dVar2.e(), i37);
                                            i29 = i37;
                                        }
                                        i37 = i29;
                                        c3597i12 = c3597i11;
                                        c3592d.h(c3597i12, c3597i13, dVar.e(), i37);
                                        c3592d.j(c3597i5, c3597i6, -dVar2.e(), i37);
                                        i29 = i37;
                                    }
                                    if (z30 || !z19 || (eVar5 instanceof C3736a) || (eVar4 instanceof C3736a)) {
                                        eVar6 = eVar;
                                    } else {
                                        eVar6 = eVar;
                                        if (eVar4 != eVar6) {
                                            i34 = 6;
                                            i35 = 6;
                                            z31 = z29;
                                            if (z31) {
                                                if (!z27 || (z18 && !z12)) {
                                                    i36 = i34;
                                                } else {
                                                    int i54 = (eVar5 == eVar6 || eVar4 == eVar6) ? 6 : i34;
                                                    if ((eVar5 instanceof g) || (eVar4 instanceof g)) {
                                                        i54 = 5;
                                                    }
                                                    if ((eVar5 instanceof C3736a) || (eVar4 instanceof C3736a)) {
                                                        i54 = 5;
                                                    }
                                                    if (z18) {
                                                        i54 = 5;
                                                    }
                                                    i36 = Math.max(i54, i34);
                                                }
                                                if (z30) {
                                                    i36 = Math.min(i35, i36);
                                                    if (z15 && !z18 && (eVar5 == eVar6 || eVar4 == eVar6)) {
                                                        i36 = i33;
                                                    }
                                                }
                                                c3592d.e(c3597i12, c3597i13, dVar.e(), i36);
                                                c3592d.e(c3597i5, c3597i6, -dVar2.e(), i36);
                                            }
                                            if (z30) {
                                                int e10 = c3597i == c3597i13 ? dVar.e() : 0;
                                                if (c3597i13 != c3597i) {
                                                    i26 = 5;
                                                    c3592d.h(c3597i12, c3597i, e10, 5);
                                                    if (z30 && z22) {
                                                        c3597i7 = c3597i6;
                                                        if (i12 == 0 && i24 == 0) {
                                                            if (z22 || i18 != 3) {
                                                                i25 = 0;
                                                                c3592d.h(c3597i5, c3597i12, 0, i26);
                                                            } else {
                                                                i25 = 0;
                                                                c3592d.h(c3597i5, c3597i12, 0, i32);
                                                            }
                                                            if (z30 && z23) {
                                                                if (dVar2.f37667f != null) {
                                                                    i25 = dVar2.e();
                                                                }
                                                                if (c3597i7 != c3597i2) {
                                                                    if (!this.f37726j || !c3597i5.f36967g || (eVar8 = this.f37709a0) == null) {
                                                                        c3592d.h(c3597i2, c3597i5, i25, i26);
                                                                        return;
                                                                    }
                                                                    f fVar2 = (f) eVar8;
                                                                    if (z10) {
                                                                        fVar2.u1(dVar2);
                                                                        return;
                                                                    } else {
                                                                        fVar2.z1(dVar2);
                                                                        return;
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        i25 = 0;
                                                        if (z30) {
                                                            return;
                                                        } else {
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                            i26 = 5;
                                            if (z30) {
                                                c3597i7 = c3597i6;
                                                if (i12 == 0) {
                                                    if (z22) {
                                                    }
                                                    i25 = 0;
                                                    c3592d.h(c3597i5, c3597i12, 0, i26);
                                                    if (z30) {
                                                    }
                                                }
                                                i25 = 0;
                                                if (z30) {
                                                }
                                            }
                                        }
                                    }
                                    i34 = i30;
                                    i35 = i29;
                                    if (z31) {
                                    }
                                    if (z30) {
                                    }
                                    i26 = 5;
                                    if (z30) {
                                    }
                                } else {
                                    z24 = true;
                                    i27 = 8;
                                    if (c3597i4.f36967g && c3597i6.f36967g) {
                                        c3592d.c(q12, c3597i4, dVar.e(), f10, c3597i6, c3597i5, dVar2.e(), 8);
                                        if (z11 && z23) {
                                            if (dVar2.f37667f != null) {
                                                i31 = dVar2.e();
                                                c3597i9 = c3597i2;
                                            } else {
                                                c3597i9 = c3597i2;
                                                i31 = 0;
                                            }
                                            if (c3597i6 != c3597i9) {
                                                c3592d.h(c3597i9, c3597i5, i31, 5);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    c3597i8 = c3597i2;
                                    c10 = 3;
                                    c11 = 5;
                                    z25 = true;
                                    z26 = true;
                                    i28 = 6;
                                    i29 = 5;
                                    i30 = 4;
                                }
                                z27 = false;
                                if (z25) {
                                }
                                z28 = z24;
                                if (z26) {
                                }
                                z31 = z28;
                                if (this.f37745s0 != i32) {
                                }
                                C3597i c3597i132 = c3597i10;
                                if (z25) {
                                }
                                if (z30) {
                                }
                                eVar6 = eVar;
                                i34 = i30;
                                i35 = i29;
                                if (z31) {
                                }
                                if (z30) {
                                }
                                i26 = 5;
                                if (z30) {
                                }
                            } else {
                                i25 = 0;
                                c3597i7 = c3597i6;
                                i26 = 5;
                            }
                            z30 = z11;
                            if (z30) {
                            }
                        } else {
                            z30 = z11;
                            i26 = (z11 && (dVar.f37667f.f37665d instanceof C3736a)) ? 8 : 5;
                        }
                        c3597i7 = c3597i6;
                        i25 = 0;
                        if (z30) {
                        }
                    }
                    c3597i7 = c3597i6;
                    i26 = 5;
                    i25 = 0;
                    z30 = z11;
                    if (z30) {
                    }
                } else {
                    int max = Math.max(i16, i21);
                    if (i43 > 0) {
                        max = Math.min(i43, max);
                    }
                    c3592d.e(q13, q12, max, 8);
                    z23 = z13;
                    i23 = i44;
                    c3597i4 = q14;
                    c3597i5 = q13;
                    c3597i6 = c3597i3;
                    z22 = false;
                }
                i24 = i16;
                if (z20) {
                }
                if (i23 < 2) {
                    return;
                } else {
                    return;
                }
            }
        }
        z21 = false;
        i19 = this.f37730l;
        if (i19 != -1) {
            this.f37730l = -1;
            i11 = i19;
            z21 = false;
        }
        i20 = this.f37732m;
        if (i20 != -1) {
        }
        i20 = i11;
        int i472 = i20;
        if (this.f37745s0 != 8) {
        }
        if (z20) {
        }
        if (z21) {
        }
        i24 = i16;
        if (z20) {
        }
        if (i23 < 2) {
        }
    }

    private void u0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    private void v0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private void w0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append(BuildConfig.FLAVOR);
        sb2.append("],\n");
    }

    public int A() {
        return this.f37694M;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public void A0(String str) {
        float f10;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.f37715d0 = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i11 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i11 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f10 = Float.parseFloat(substring2);
            }
            f10 = i10;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f10 = i11 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f10 = i10;
        }
        i10 = (f10 > i10 ? 1 : (f10 == i10 ? 0 : -1));
        if (i10 > 0) {
            this.f37715d0 = f10;
            this.f37717e0 = i11;
        }
    }

    public int B() {
        return this.f37695N;
    }

    public void B0(int i10) {
        if (this.f37691J) {
            int i11 = i10 - this.f37731l0;
            int i12 = this.f37713c0 + i11;
            this.f37721g0 = i11;
            this.f37697P.s(i11);
            this.f37699R.s(i12);
            this.f37700S.s(i10);
            this.f37740q = true;
        }
    }

    public int C(int i10) {
        if (i10 == 0) {
            return U();
        }
        if (i10 == 1) {
            return v();
        }
        return 0;
    }

    public void C0(int i10, int i11) {
        if (this.f37738p) {
            return;
        }
        this.f37696O.s(i10);
        this.f37698Q.s(i11);
        this.f37719f0 = i10;
        this.f37711b0 = i11 - i10;
        this.f37738p = true;
    }

    public int D() {
        return this.f37687H[1];
    }

    public void D0(int i10) {
        this.f37696O.s(i10);
        this.f37719f0 = i10;
    }

    public int E() {
        return this.f37687H[0];
    }

    public void E0(int i10) {
        this.f37697P.s(i10);
        this.f37721g0 = i10;
    }

    public int F() {
        return this.f37735n0;
    }

    public void F0(int i10, int i11) {
        if (this.f37740q) {
            return;
        }
        this.f37697P.s(i10);
        this.f37699R.s(i11);
        this.f37721g0 = i10;
        this.f37713c0 = i11 - i10;
        if (this.f37691J) {
            this.f37700S.s(i10 + this.f37731l0);
        }
        this.f37740q = true;
    }

    public int G() {
        return this.f37733m0;
    }

    public void G0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f37719f0 = i10;
        this.f37721g0 = i11;
        if (this.f37745s0 == 8) {
            this.f37711b0 = 0;
            this.f37713c0 = 0;
            return;
        }
        b[] bVarArr = this.f37707Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f37711b0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f37713c0)) {
            i17 = i14;
        }
        this.f37711b0 = i16;
        this.f37713c0 = i17;
        int i18 = this.f37735n0;
        if (i17 < i18) {
            this.f37713c0 = i18;
        }
        int i19 = this.f37733m0;
        if (i16 < i19) {
            this.f37711b0 = i19;
        }
        int i20 = this.f37673A;
        if (i20 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f37711b0 = Math.min(this.f37711b0, i20);
        }
        int i21 = this.f37679D;
        if (i21 > 0 && this.f37707Z[1] == b.MATCH_CONSTRAINT) {
            this.f37713c0 = Math.min(this.f37713c0, i21);
        }
        int i22 = this.f37711b0;
        if (i16 != i22) {
            this.f37730l = i22;
        }
        int i23 = this.f37713c0;
        if (i17 != i23) {
            this.f37732m = i23;
        }
    }

    public e H(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.f37699R).f37667f) != null && dVar2.f37667f == dVar) {
                return dVar2.f37665d;
            }
            return null;
        }
        d dVar3 = this.f37698Q;
        d dVar4 = dVar3.f37667f;
        if (dVar4 == null || dVar4.f37667f != dVar3) {
            return null;
        }
        return dVar4.f37665d;
    }

    public void H0(boolean z10) {
        this.f37691J = z10;
    }

    public e I() {
        return this.f37709a0;
    }

    public void I0(int i10) {
        this.f37713c0 = i10;
        int i11 = this.f37735n0;
        if (i10 < i11) {
            this.f37713c0 = i11;
        }
    }

    public e J(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.f37697P).f37667f) != null && dVar2.f37667f == dVar) {
                return dVar2.f37665d;
            }
            return null;
        }
        d dVar3 = this.f37696O;
        d dVar4 = dVar3.f37667f;
        if (dVar4 == null || dVar4.f37667f != dVar3) {
            return null;
        }
        return dVar4.f37665d;
    }

    public void J0(float f10) {
        this.f37737o0 = f10;
    }

    public int K() {
        return V() + this.f37711b0;
    }

    public void K0(int i10) {
        this.f37757y0 = i10;
    }

    public p L(int i10) {
        if (i10 == 0) {
            return this.f37716e;
        }
        if (i10 == 1) {
            return this.f37718f;
        }
        return null;
    }

    public void L0(int i10, int i11) {
        this.f37719f0 = i10;
        int i12 = i11 - i10;
        this.f37711b0 = i12;
        int i13 = this.f37733m0;
        if (i12 < i13) {
            this.f37711b0 = i13;
        }
    }

    public void M(StringBuilder sb2) {
        sb2.append("  " + this.f37736o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f37711b0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f37713c0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f37719f0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f37721g0);
        sb2.append("\n");
        O(sb2, "left", this.f37696O);
        O(sb2, "top", this.f37697P);
        O(sb2, "right", this.f37698Q);
        O(sb2, "bottom", this.f37699R);
        O(sb2, "baseline", this.f37700S);
        O(sb2, "centerX", this.f37701T);
        O(sb2, "centerY", this.f37702U);
        N(sb2, "    width", this.f37711b0, this.f37733m0, this.f37687H[0], this.f37730l, this.f37758z, this.f37752w, this.f37675B, this.f37678C0[0]);
        N(sb2, "    height", this.f37713c0, this.f37735n0, this.f37687H[1], this.f37732m, this.f37677C, this.f37754x, this.f37681E, this.f37678C0[1]);
        w0(sb2, "    dimensionRatio", this.f37715d0, this.f37717e0);
        u0(sb2, "    horizontalBias", this.f37737o0, f37672J0);
        u0(sb2, "    verticalBias", this.f37739p0, f37672J0);
        v0(sb2, "    horizontalChainStyle", this.f37757y0, 0);
        v0(sb2, "    verticalChainStyle", this.f37759z0, 0);
        sb2.append("  }");
    }

    public void M0(b bVar) {
        this.f37707Z[0] = bVar;
    }

    public void N0(int i10, int i11, int i12, float f10) {
        this.f37752w = i10;
        this.f37758z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f37673A = i12;
        this.f37675B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f37752w = 2;
    }

    public void O0(float f10) {
        this.f37678C0[0] = f10;
    }

    public float P() {
        return this.f37739p0;
    }

    protected void P0(int i10, boolean z10) {
        this.f37706Y[i10] = z10;
    }

    public int Q() {
        return this.f37759z0;
    }

    public void Q0(boolean z10) {
        this.f37692K = z10;
    }

    public b R() {
        return this.f37707Z[1];
    }

    public void R0(int i10, int i11) {
        this.f37694M = i10;
        this.f37695N = i11;
        U0(false);
    }

    public int S() {
        int i10 = this.f37696O != null ? this.f37697P.f37668g : 0;
        return this.f37698Q != null ? i10 + this.f37699R.f37668g : i10;
    }

    public void S0(int i10) {
        this.f37687H[1] = i10;
    }

    public int T() {
        return this.f37745s0;
    }

    public void T0(int i10) {
        this.f37687H[0] = i10;
    }

    public int U() {
        if (this.f37745s0 == 8) {
            return 0;
        }
        return this.f37711b0;
    }

    public void U0(boolean z10) {
        this.f37724i = z10;
    }

    public int V() {
        e eVar = this.f37709a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f37719f0 : ((f) eVar).f37768R0 + this.f37719f0;
    }

    public void V0(int i10) {
        if (i10 < 0) {
            this.f37735n0 = 0;
        } else {
            this.f37735n0 = i10;
        }
    }

    public int W() {
        e eVar = this.f37709a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f37721g0 : ((f) eVar).f37769S0 + this.f37721g0;
    }

    public void W0(int i10) {
        if (i10 < 0) {
            this.f37733m0 = 0;
        } else {
            this.f37733m0 = i10;
        }
    }

    public boolean X() {
        return this.f37691J;
    }

    public void X0(int i10, int i11) {
        this.f37719f0 = i10;
        this.f37721g0 = i11;
    }

    public boolean Y(int i10) {
        if (i10 == 0) {
            return (this.f37696O.f37667f != null ? 1 : 0) + (this.f37698Q.f37667f != null ? 1 : 0) < 2;
        }
        return ((this.f37697P.f37667f != null ? 1 : 0) + (this.f37699R.f37667f != null ? 1 : 0)) + (this.f37700S.f37667f != null ? 1 : 0) < 2;
    }

    public void Y0(e eVar) {
        this.f37709a0 = eVar;
    }

    public boolean Z() {
        int size = this.f37705X.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((d) this.f37705X.get(i10)).l()) {
                return true;
            }
        }
        return false;
    }

    public void Z0(float f10) {
        this.f37739p0 = f10;
    }

    public boolean a0() {
        return (this.f37730l == -1 && this.f37732m == -1) ? false : true;
    }

    public void a1(int i10) {
        this.f37759z0 = i10;
    }

    public boolean b0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.f37696O.f37667f;
            return dVar3 != null && dVar3.m() && (dVar2 = this.f37698Q.f37667f) != null && dVar2.m() && (this.f37698Q.f37667f.d() - this.f37698Q.e()) - (this.f37696O.f37667f.d() + this.f37696O.e()) >= i11;
        }
        d dVar4 = this.f37697P.f37667f;
        return dVar4 != null && dVar4.m() && (dVar = this.f37699R.f37667f) != null && dVar.m() && (this.f37699R.f37667f.d() - this.f37699R.e()) - (this.f37697P.f37667f.d() + this.f37697P.e()) >= i11;
        return false;
    }

    public void b1(int i10, int i11) {
        this.f37721g0 = i10;
        int i12 = i11 - i10;
        this.f37713c0 = i12;
        int i13 = this.f37735n0;
        if (i12 < i13) {
            this.f37713c0 = i13;
        }
    }

    public void c0(d.b bVar, e eVar, d.b bVar2, int i10, int i11) {
        m(bVar).a(eVar.m(bVar2), i10, i11, true);
    }

    public void c1(b bVar) {
        this.f37707Z[1] = bVar;
    }

    public void d1(int i10, int i11, int i12, float f10) {
        this.f37754x = i10;
        this.f37677C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f37679D = i12;
        this.f37681E = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f37754x = 2;
    }

    public void e(f fVar, C3592d c3592d, HashSet hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, c3592d, this);
            hashSet.remove(this);
            g(c3592d, fVar.P1(64));
        }
        if (i10 == 0) {
            HashSet c10 = this.f37696O.c();
            if (c10 != null) {
                Iterator it = c10.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f37665d.e(fVar, c3592d, hashSet, i10, true);
                }
            }
            HashSet c11 = this.f37698Q.c();
            if (c11 != null) {
                Iterator it2 = c11.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f37665d.e(fVar, c3592d, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet c12 = this.f37697P.c();
        if (c12 != null) {
            Iterator it3 = c12.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f37665d.e(fVar, c3592d, hashSet, i10, true);
            }
        }
        HashSet c13 = this.f37699R.c();
        if (c13 != null) {
            Iterator it4 = c13.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f37665d.e(fVar, c3592d, hashSet, i10, true);
            }
        }
        HashSet c14 = this.f37700S.c();
        if (c14 != null) {
            Iterator it5 = c14.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f37665d.e(fVar, c3592d, hashSet, i10, true);
            }
        }
    }

    public boolean e0() {
        return this.f37742r;
    }

    public void e1(float f10) {
        this.f37678C0[1] = f10;
    }

    boolean f() {
        return this instanceof g;
    }

    public boolean f0(int i10) {
        return this.f37706Y[i10];
    }

    public void f1(int i10) {
        this.f37745s0 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(C3592d c3592d, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        e eVar;
        e eVar2;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z16;
        int i22;
        boolean z17;
        b bVar;
        boolean z18;
        int i23;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        b bVar2;
        b bVar3;
        C3597i c3597i;
        C3597i c3597i2;
        C3597i c3597i3;
        C3597i c3597i4;
        C3597i c3597i5;
        boolean z23;
        int i24;
        int i25;
        int i26;
        e eVar3;
        C3592d c3592d2;
        C3597i c3597i6;
        C3597i c3597i7;
        C3597i c3597i8;
        int i27;
        C3597i c3597i9;
        C3597i c3597i10;
        boolean z24;
        l lVar;
        p0.f fVar;
        int i28;
        int i29;
        boolean g02;
        boolean i02;
        l lVar2;
        n nVar;
        p0.f fVar2;
        boolean[] zArr;
        C3597i q10 = c3592d.q(this.f37696O);
        C3597i q11 = c3592d.q(this.f37698Q);
        C3597i q12 = c3592d.q(this.f37697P);
        C3597i q13 = c3592d.q(this.f37699R);
        C3597i q14 = c3592d.q(this.f37700S);
        e eVar4 = this.f37709a0;
        if (eVar4 != null) {
            boolean z25 = eVar4 != null && eVar4.f37707Z[0] == b.WRAP_CONTENT;
            boolean z26 = eVar4 != null && eVar4.f37707Z[1] == b.WRAP_CONTENT;
            int i30 = this.f37750v;
            if (i30 == 1) {
                z11 = z25;
                z12 = false;
            } else if (i30 == 2) {
                z12 = z26;
                z11 = false;
            } else if (i30 != 3) {
                z12 = z26;
                z11 = z25;
            }
            if (this.f37745s0 == 8 && !Z()) {
                zArr = this.f37706Y;
                if (!zArr[0] && !zArr[1]) {
                    return;
                }
            }
            z13 = this.f37738p;
            if (!z13 || this.f37740q) {
                if (z13) {
                    c3592d.f(q10, this.f37719f0);
                    c3592d.f(q11, this.f37719f0 + this.f37711b0);
                    if (z11 && (eVar2 = this.f37709a0) != null) {
                        if (this.f37728k) {
                            f fVar3 = (f) eVar2;
                            fVar3.v1(this.f37696O);
                            fVar3.u1(this.f37698Q);
                        } else {
                            c3592d.h(c3592d.q(eVar2.f37698Q), q11, 0, 5);
                        }
                    }
                }
                if (this.f37740q) {
                    c3592d.f(q12, this.f37721g0);
                    c3592d.f(q13, this.f37721g0 + this.f37713c0);
                    if (this.f37700S.l()) {
                        c3592d.f(q14, this.f37721g0 + this.f37731l0);
                    }
                    if (z12 && (eVar = this.f37709a0) != null) {
                        if (this.f37728k) {
                            f fVar4 = (f) eVar;
                            fVar4.A1(this.f37697P);
                            fVar4.z1(this.f37699R);
                        } else {
                            c3592d.h(c3592d.q(eVar.f37699R), q13, 0, 5);
                        }
                    }
                }
                if (this.f37738p && this.f37740q) {
                    this.f37738p = false;
                    this.f37740q = false;
                    return;
                }
            }
            boolean z27 = C3592d.f36922r;
            if (z10 && (lVar2 = this.f37716e) != null && (nVar = this.f37718f) != null) {
                fVar2 = lVar2.f38286h;
                if (fVar2.f38244j && lVar2.f38287i.f38244j && nVar.f38286h.f38244j && nVar.f38287i.f38244j) {
                    c3592d.f(q10, fVar2.f38241g);
                    c3592d.f(q11, this.f37716e.f38287i.f38241g);
                    c3592d.f(q12, this.f37718f.f38286h.f38241g);
                    c3592d.f(q13, this.f37718f.f38287i.f38241g);
                    c3592d.f(q14, this.f37718f.f38261k.f38241g);
                    if (this.f37709a0 != null) {
                        if (z11 && this.f37720g[0] && !g0()) {
                            c3592d.h(c3592d.q(this.f37709a0.f37698Q), q11, 0, 8);
                        }
                        if (z12 && this.f37720g[1] && !i0()) {
                            c3592d.h(c3592d.q(this.f37709a0.f37699R), q13, 0, 8);
                        }
                    }
                    this.f37738p = false;
                    this.f37740q = false;
                    return;
                }
            }
            if (this.f37709a0 == null) {
                if (d0(0)) {
                    ((f) this.f37709a0).r1(this, 0);
                    g02 = true;
                } else {
                    g02 = g0();
                }
                if (d0(1)) {
                    ((f) this.f37709a0).r1(this, 1);
                    i02 = true;
                } else {
                    i02 = i0();
                }
                if (!g02 && z11 && this.f37745s0 != 8 && this.f37696O.f37667f == null && this.f37698Q.f37667f == null) {
                    c3592d.h(c3592d.q(this.f37709a0.f37698Q), q11, 0, 1);
                }
                if (!i02 && z12 && this.f37745s0 != 8 && this.f37697P.f37667f == null && this.f37699R.f37667f == null && this.f37700S == null) {
                    c3592d.h(c3592d.q(this.f37709a0.f37699R), q13, 0, 1);
                }
                z15 = g02;
                z14 = i02;
            } else {
                z14 = false;
                z15 = false;
            }
            i10 = this.f37711b0;
            i11 = this.f37733m0;
            if (i10 >= i11) {
                i11 = i10;
            }
            i12 = this.f37713c0;
            i13 = this.f37735n0;
            if (i12 >= i13) {
                i13 = i12;
            }
            b[] bVarArr = this.f37707Z;
            b bVar4 = bVarArr[0];
            b bVar5 = b.MATCH_CONSTRAINT;
            i14 = i11;
            boolean z28 = bVar4 == bVar5;
            b bVar6 = bVarArr[1];
            i15 = i13;
            boolean z29 = bVar6 == bVar5;
            int i31 = this.f37717e0;
            this.f37683F = i31;
            f10 = this.f37715d0;
            this.f37685G = f10;
            i16 = this.f37752w;
            i17 = this.f37754x;
            if (f10 <= 0.0f && this.f37745s0 != 8) {
                if (bVar4 == bVar5 && i16 == 0) {
                    i16 = 3;
                }
                if (bVar6 == bVar5 && i17 == 0) {
                    i17 = 3;
                }
                if (bVar4 == bVar5 && bVar6 == bVar5) {
                    i29 = 3;
                    if (i16 == 3 && i17 == 3) {
                        k1(z11, z12, z28, z29);
                        i18 = i16;
                        i19 = i17;
                        i20 = i14;
                        i21 = i15;
                        z16 = true;
                        int[] iArr = this.f37756y;
                        iArr[0] = i18;
                        iArr[1] = i19;
                        this.f37722h = z16;
                        if (z16) {
                            int i32 = this.f37683F;
                            i22 = -1;
                            if (i32 == 0 || i32 == -1) {
                                z17 = true;
                                boolean z30 = !z16 && ((i28 = this.f37683F) == 1 || i28 == i22);
                                b bVar7 = this.f37707Z[0];
                                bVar = b.WRAP_CONTENT;
                                z18 = bVar7 != bVar && (this instanceof f);
                                i23 = !z18 ? 0 : i20;
                                z19 = !this.f37703V.n();
                                boolean[] zArr2 = this.f37706Y;
                                z20 = zArr2[0];
                                boolean z31 = zArr2[1];
                                if (this.f37746t != 2 && !this.f37738p) {
                                    if (z10 && (lVar = this.f37716e) != null) {
                                        fVar = lVar.f38286h;
                                        if (fVar.f38244j && lVar.f38287i.f38244j) {
                                            if (!z10) {
                                                c3592d.f(q10, fVar.f38241g);
                                                c3592d.f(q11, this.f37716e.f38287i.f38241g);
                                                if (this.f37709a0 != null && z11 && this.f37720g[0] && !g0()) {
                                                    c3592d.h(c3592d.q(this.f37709a0.f37698Q), q11, 0, 8);
                                                }
                                                z21 = z11;
                                                z22 = z12;
                                                bVar2 = bVar5;
                                                bVar3 = bVar;
                                                z23 = z16;
                                                c3597i = q14;
                                                c3597i2 = q13;
                                                c3597i3 = q12;
                                                c3597i4 = q11;
                                                c3597i5 = q10;
                                                if (z10) {
                                                    eVar3 = this;
                                                    n nVar2 = eVar3.f37718f;
                                                    if (nVar2 != null) {
                                                        p0.f fVar5 = nVar2.f38286h;
                                                        if (fVar5.f38244j && nVar2.f38287i.f38244j) {
                                                            c3592d2 = c3592d;
                                                            c3597i8 = c3597i3;
                                                            c3592d2.f(c3597i8, fVar5.f38241g);
                                                            c3597i7 = c3597i2;
                                                            c3592d2.f(c3597i7, eVar3.f37718f.f38287i.f38241g);
                                                            c3597i6 = c3597i;
                                                            c3592d2.f(c3597i6, eVar3.f37718f.f38261k.f38241g);
                                                            e eVar5 = eVar3.f37709a0;
                                                            if (eVar5 == null || z14 || !z22) {
                                                                i24 = 8;
                                                                i25 = 0;
                                                                i26 = 1;
                                                            } else {
                                                                i26 = 1;
                                                                if (eVar3.f37720g[1]) {
                                                                    i24 = 8;
                                                                    i25 = 0;
                                                                    c3592d2.h(c3592d2.q(eVar5.f37699R), c3597i7, 0, 8);
                                                                } else {
                                                                    i24 = 8;
                                                                    i25 = 0;
                                                                }
                                                            }
                                                            i27 = i25;
                                                            if ((eVar3.f37748u != 2 ? i25 : i27) != 0 || eVar3.f37740q) {
                                                                c3597i9 = c3597i7;
                                                                c3597i10 = c3597i8;
                                                            } else {
                                                                boolean z32 = (eVar3.f37707Z[i26] == bVar3 && (eVar3 instanceof f)) ? i26 : i25;
                                                                if (z32) {
                                                                    i21 = i25;
                                                                }
                                                                e eVar6 = eVar3.f37709a0;
                                                                C3597i q15 = eVar6 != null ? c3592d2.q(eVar6.f37699R) : null;
                                                                e eVar7 = eVar3.f37709a0;
                                                                C3597i q16 = eVar7 != null ? c3592d2.q(eVar7.f37697P) : null;
                                                                if (eVar3.f37731l0 > 0 || eVar3.f37745s0 == i24) {
                                                                    d dVar = eVar3.f37700S;
                                                                    if (dVar.f37667f != null) {
                                                                        c3592d2.e(c3597i6, c3597i8, n(), i24);
                                                                        c3592d2.e(c3597i6, c3592d2.q(eVar3.f37700S.f37667f), eVar3.f37700S.e(), i24);
                                                                        if (z22) {
                                                                            c3592d2.h(q15, c3592d2.q(eVar3.f37699R), i25, 5);
                                                                        }
                                                                        z24 = i25;
                                                                        boolean z33 = eVar3.f37720g[i26];
                                                                        b[] bVarArr2 = eVar3.f37707Z;
                                                                        c3597i9 = c3597i7;
                                                                        c3597i10 = c3597i8;
                                                                        i(c3592d, false, z22, z21, z33, q16, q15, bVarArr2[i26], z32, eVar3.f37697P, eVar3.f37699R, eVar3.f37721g0, i21, eVar3.f37735n0, eVar3.f37687H[i26], eVar3.f37739p0, z30, bVarArr2[0] != bVar2, z14, z15, z31, i19, i18, eVar3.f37677C, eVar3.f37679D, eVar3.f37681E, z24);
                                                                    } else if (eVar3.f37745s0 == i24) {
                                                                        c3592d2.e(c3597i6, c3597i8, dVar.e(), i24);
                                                                    } else {
                                                                        c3592d2.e(c3597i6, c3597i8, n(), i24);
                                                                    }
                                                                }
                                                                z24 = z19;
                                                                boolean z332 = eVar3.f37720g[i26];
                                                                b[] bVarArr22 = eVar3.f37707Z;
                                                                c3597i9 = c3597i7;
                                                                c3597i10 = c3597i8;
                                                                i(c3592d, false, z22, z21, z332, q16, q15, bVarArr22[i26], z32, eVar3.f37697P, eVar3.f37699R, eVar3.f37721g0, i21, eVar3.f37735n0, eVar3.f37687H[i26], eVar3.f37739p0, z30, bVarArr22[0] != bVar2, z14, z15, z31, i19, i18, eVar3.f37677C, eVar3.f37679D, eVar3.f37681E, z24);
                                                            }
                                                            if (z23) {
                                                                if (this.f37683F == 1) {
                                                                    c3592d.k(c3597i9, c3597i10, c3597i4, c3597i5, this.f37685G, 8);
                                                                } else {
                                                                    c3592d.k(c3597i4, c3597i5, c3597i9, c3597i10, this.f37685G, 8);
                                                                }
                                                            }
                                                            if (this.f37703V.n()) {
                                                                c3592d.b(this, this.f37703V.i().g(), (float) Math.toRadians(this.f37689I + 90.0f), this.f37703V.e());
                                                            }
                                                            this.f37738p = false;
                                                            this.f37740q = false;
                                                        }
                                                    }
                                                    c3592d2 = c3592d;
                                                    c3597i6 = c3597i;
                                                    c3597i7 = c3597i2;
                                                    c3597i8 = c3597i3;
                                                    i24 = 8;
                                                    i25 = 0;
                                                    i26 = 1;
                                                } else {
                                                    i24 = 8;
                                                    i25 = 0;
                                                    i26 = 1;
                                                    eVar3 = this;
                                                    c3592d2 = c3592d;
                                                    c3597i6 = c3597i;
                                                    c3597i7 = c3597i2;
                                                    c3597i8 = c3597i3;
                                                }
                                                i27 = i26;
                                                if ((eVar3.f37748u != 2 ? i25 : i27) != 0) {
                                                }
                                                c3597i9 = c3597i7;
                                                c3597i10 = c3597i8;
                                                if (z23) {
                                                }
                                                if (this.f37703V.n()) {
                                                }
                                                this.f37738p = false;
                                                this.f37740q = false;
                                            }
                                        }
                                    }
                                    e eVar8 = this.f37709a0;
                                    C3597i q17 = eVar8 == null ? c3592d.q(eVar8.f37698Q) : null;
                                    e eVar9 = this.f37709a0;
                                    C3597i q18 = eVar9 == null ? c3592d.q(eVar9.f37696O) : null;
                                    boolean z34 = this.f37720g[0];
                                    b[] bVarArr3 = this.f37707Z;
                                    z21 = z11;
                                    z22 = z12;
                                    bVar2 = bVar5;
                                    c3597i = q14;
                                    c3597i2 = q13;
                                    c3597i3 = q12;
                                    c3597i4 = q11;
                                    bVar3 = bVar;
                                    c3597i5 = q10;
                                    z23 = z16;
                                    i(c3592d, true, z11, z12, z34, q18, q17, bVarArr3[0], z18, this.f37696O, this.f37698Q, this.f37719f0, i23, this.f37733m0, this.f37687H[0], this.f37737o0, z17, bVarArr3[1] != bVar5, z15, z14, z20, i18, i19, this.f37758z, this.f37673A, this.f37675B, z19);
                                    if (z10) {
                                    }
                                    i27 = i26;
                                    if ((eVar3.f37748u != 2 ? i25 : i27) != 0) {
                                    }
                                    c3597i9 = c3597i7;
                                    c3597i10 = c3597i8;
                                    if (z23) {
                                    }
                                    if (this.f37703V.n()) {
                                    }
                                    this.f37738p = false;
                                    this.f37740q = false;
                                }
                                z21 = z11;
                                z22 = z12;
                                bVar2 = bVar5;
                                bVar3 = bVar;
                                c3597i = q14;
                                c3597i2 = q13;
                                c3597i3 = q12;
                                c3597i4 = q11;
                                c3597i5 = q10;
                                z23 = z16;
                                if (z10) {
                                }
                                i27 = i26;
                                if ((eVar3.f37748u != 2 ? i25 : i27) != 0) {
                                }
                                c3597i9 = c3597i7;
                                c3597i10 = c3597i8;
                                if (z23) {
                                }
                                if (this.f37703V.n()) {
                                }
                                this.f37738p = false;
                                this.f37740q = false;
                            }
                        } else {
                            i22 = -1;
                        }
                        z17 = false;
                        if (z16) {
                        }
                        b bVar72 = this.f37707Z[0];
                        bVar = b.WRAP_CONTENT;
                        if (bVar72 != bVar) {
                        }
                        if (!z18) {
                        }
                        z19 = !this.f37703V.n();
                        boolean[] zArr22 = this.f37706Y;
                        z20 = zArr22[0];
                        boolean z312 = zArr22[1];
                        if (this.f37746t != 2) {
                            if (z10) {
                                fVar = lVar.f38286h;
                                if (fVar.f38244j) {
                                    if (!z10) {
                                    }
                                }
                            }
                            e eVar82 = this.f37709a0;
                            if (eVar82 == null) {
                            }
                            e eVar92 = this.f37709a0;
                            if (eVar92 == null) {
                            }
                            boolean z342 = this.f37720g[0];
                            b[] bVarArr32 = this.f37707Z;
                            z21 = z11;
                            z22 = z12;
                            bVar2 = bVar5;
                            c3597i = q14;
                            c3597i2 = q13;
                            c3597i3 = q12;
                            c3597i4 = q11;
                            bVar3 = bVar;
                            c3597i5 = q10;
                            z23 = z16;
                            i(c3592d, true, z11, z12, z342, q18, q17, bVarArr32[0], z18, this.f37696O, this.f37698Q, this.f37719f0, i23, this.f37733m0, this.f37687H[0], this.f37737o0, z17, bVarArr32[1] != bVar5, z15, z14, z20, i18, i19, this.f37758z, this.f37673A, this.f37675B, z19);
                            if (z10) {
                            }
                            i27 = i26;
                            if ((eVar3.f37748u != 2 ? i25 : i27) != 0) {
                            }
                            c3597i9 = c3597i7;
                            c3597i10 = c3597i8;
                            if (z23) {
                            }
                            if (this.f37703V.n()) {
                            }
                            this.f37738p = false;
                            this.f37740q = false;
                        }
                        z21 = z11;
                        z22 = z12;
                        bVar2 = bVar5;
                        bVar3 = bVar;
                        c3597i = q14;
                        c3597i2 = q13;
                        c3597i3 = q12;
                        c3597i4 = q11;
                        c3597i5 = q10;
                        z23 = z16;
                        if (z10) {
                        }
                        i27 = i26;
                        if ((eVar3.f37748u != 2 ? i25 : i27) != 0) {
                        }
                        c3597i9 = c3597i7;
                        c3597i10 = c3597i8;
                        if (z23) {
                        }
                        if (this.f37703V.n()) {
                        }
                        this.f37738p = false;
                        this.f37740q = false;
                    }
                } else {
                    i29 = 3;
                }
                if (bVar4 == bVar5 && i16 == i29) {
                    this.f37683F = 0;
                    int i33 = (int) (f10 * i12);
                    if (bVar6 != bVar5) {
                        i18 = 4;
                        i19 = i17;
                        i21 = i15;
                        z16 = false;
                        i20 = i33;
                        int[] iArr2 = this.f37756y;
                        iArr2[0] = i18;
                        iArr2[1] = i19;
                        this.f37722h = z16;
                        if (z16) {
                        }
                        z17 = false;
                        if (z16) {
                        }
                        b bVar722 = this.f37707Z[0];
                        bVar = b.WRAP_CONTENT;
                        if (bVar722 != bVar) {
                        }
                        if (!z18) {
                        }
                        z19 = !this.f37703V.n();
                        boolean[] zArr222 = this.f37706Y;
                        z20 = zArr222[0];
                        boolean z3122 = zArr222[1];
                        if (this.f37746t != 2) {
                        }
                        z21 = z11;
                        z22 = z12;
                        bVar2 = bVar5;
                        bVar3 = bVar;
                        c3597i = q14;
                        c3597i2 = q13;
                        c3597i3 = q12;
                        c3597i4 = q11;
                        c3597i5 = q10;
                        z23 = z16;
                        if (z10) {
                        }
                        i27 = i26;
                        if ((eVar3.f37748u != 2 ? i25 : i27) != 0) {
                        }
                        c3597i9 = c3597i7;
                        c3597i10 = c3597i8;
                        if (z23) {
                        }
                        if (this.f37703V.n()) {
                        }
                        this.f37738p = false;
                        this.f37740q = false;
                    }
                    i20 = i33;
                    i18 = i16;
                    i19 = i17;
                    i21 = i15;
                    z16 = true;
                    int[] iArr22 = this.f37756y;
                    iArr22[0] = i18;
                    iArr22[1] = i19;
                    this.f37722h = z16;
                    if (z16) {
                    }
                    z17 = false;
                    if (z16) {
                    }
                    b bVar7222 = this.f37707Z[0];
                    bVar = b.WRAP_CONTENT;
                    if (bVar7222 != bVar) {
                    }
                    if (!z18) {
                    }
                    z19 = !this.f37703V.n();
                    boolean[] zArr2222 = this.f37706Y;
                    z20 = zArr2222[0];
                    boolean z31222 = zArr2222[1];
                    if (this.f37746t != 2) {
                    }
                    z21 = z11;
                    z22 = z12;
                    bVar2 = bVar5;
                    bVar3 = bVar;
                    c3597i = q14;
                    c3597i2 = q13;
                    c3597i3 = q12;
                    c3597i4 = q11;
                    c3597i5 = q10;
                    z23 = z16;
                    if (z10) {
                    }
                    i27 = i26;
                    if ((eVar3.f37748u != 2 ? i25 : i27) != 0) {
                    }
                    c3597i9 = c3597i7;
                    c3597i10 = c3597i8;
                    if (z23) {
                    }
                    if (this.f37703V.n()) {
                    }
                    this.f37738p = false;
                    this.f37740q = false;
                }
                if (bVar6 == bVar5 && i17 == i29) {
                    this.f37683F = 1;
                    if (i31 == -1) {
                        this.f37685G = 1.0f / f10;
                    }
                    int i34 = (int) (this.f37685G * i10);
                    if (bVar4 == bVar5) {
                        i21 = i34;
                        i18 = i16;
                        i19 = i17;
                        i20 = i14;
                        z16 = true;
                        int[] iArr222 = this.f37756y;
                        iArr222[0] = i18;
                        iArr222[1] = i19;
                        this.f37722h = z16;
                        if (z16) {
                        }
                        z17 = false;
                        if (z16) {
                        }
                        b bVar72222 = this.f37707Z[0];
                        bVar = b.WRAP_CONTENT;
                        if (bVar72222 != bVar) {
                        }
                        if (!z18) {
                        }
                        z19 = !this.f37703V.n();
                        boolean[] zArr22222 = this.f37706Y;
                        z20 = zArr22222[0];
                        boolean z312222 = zArr22222[1];
                        if (this.f37746t != 2) {
                        }
                        z21 = z11;
                        z22 = z12;
                        bVar2 = bVar5;
                        bVar3 = bVar;
                        c3597i = q14;
                        c3597i2 = q13;
                        c3597i3 = q12;
                        c3597i4 = q11;
                        c3597i5 = q10;
                        z23 = z16;
                        if (z10) {
                        }
                        i27 = i26;
                        if ((eVar3.f37748u != 2 ? i25 : i27) != 0) {
                        }
                        c3597i9 = c3597i7;
                        c3597i10 = c3597i8;
                        if (z23) {
                        }
                        if (this.f37703V.n()) {
                        }
                        this.f37738p = false;
                        this.f37740q = false;
                    }
                    i19 = 4;
                    i21 = i34;
                    i18 = i16;
                    i20 = i14;
                }
                i18 = i16;
                i19 = i17;
                i20 = i14;
                i21 = i15;
                z16 = true;
                int[] iArr2222 = this.f37756y;
                iArr2222[0] = i18;
                iArr2222[1] = i19;
                this.f37722h = z16;
                if (z16) {
                }
                z17 = false;
                if (z16) {
                }
                b bVar722222 = this.f37707Z[0];
                bVar = b.WRAP_CONTENT;
                if (bVar722222 != bVar) {
                }
                if (!z18) {
                }
                z19 = !this.f37703V.n();
                boolean[] zArr222222 = this.f37706Y;
                z20 = zArr222222[0];
                boolean z3122222 = zArr222222[1];
                if (this.f37746t != 2) {
                }
                z21 = z11;
                z22 = z12;
                bVar2 = bVar5;
                bVar3 = bVar;
                c3597i = q14;
                c3597i2 = q13;
                c3597i3 = q12;
                c3597i4 = q11;
                c3597i5 = q10;
                z23 = z16;
                if (z10) {
                }
                i27 = i26;
                if ((eVar3.f37748u != 2 ? i25 : i27) != 0) {
                }
                c3597i9 = c3597i7;
                c3597i10 = c3597i8;
                if (z23) {
                }
                if (this.f37703V.n()) {
                }
                this.f37738p = false;
                this.f37740q = false;
            }
            i18 = i16;
            i19 = i17;
            i20 = i14;
            i21 = i15;
            z16 = false;
            int[] iArr22222 = this.f37756y;
            iArr22222[0] = i18;
            iArr22222[1] = i19;
            this.f37722h = z16;
            if (z16) {
            }
            z17 = false;
            if (z16) {
            }
            b bVar7222222 = this.f37707Z[0];
            bVar = b.WRAP_CONTENT;
            if (bVar7222222 != bVar) {
            }
            if (!z18) {
            }
            z19 = !this.f37703V.n();
            boolean[] zArr2222222 = this.f37706Y;
            z20 = zArr2222222[0];
            boolean z31222222 = zArr2222222[1];
            if (this.f37746t != 2) {
            }
            z21 = z11;
            z22 = z12;
            bVar2 = bVar5;
            bVar3 = bVar;
            c3597i = q14;
            c3597i2 = q13;
            c3597i3 = q12;
            c3597i4 = q11;
            c3597i5 = q10;
            z23 = z16;
            if (z10) {
            }
            i27 = i26;
            if ((eVar3.f37748u != 2 ? i25 : i27) != 0) {
            }
            c3597i9 = c3597i7;
            c3597i10 = c3597i8;
            if (z23) {
            }
            if (this.f37703V.n()) {
            }
            this.f37738p = false;
            this.f37740q = false;
        }
        z11 = false;
        z12 = false;
        if (this.f37745s0 == 8) {
            zArr = this.f37706Y;
            if (!zArr[0]) {
                return;
            }
        }
        z13 = this.f37738p;
        if (!z13) {
        }
        if (z13) {
        }
        if (this.f37740q) {
        }
        if (this.f37738p) {
            this.f37738p = false;
            this.f37740q = false;
            return;
        }
        boolean z272 = C3592d.f36922r;
        if (z10) {
            fVar2 = lVar2.f38286h;
            if (fVar2.f38244j) {
                c3592d.f(q10, fVar2.f38241g);
                c3592d.f(q11, this.f37716e.f38287i.f38241g);
                c3592d.f(q12, this.f37718f.f38286h.f38241g);
                c3592d.f(q13, this.f37718f.f38287i.f38241g);
                c3592d.f(q14, this.f37718f.f38261k.f38241g);
                if (this.f37709a0 != null) {
                }
                this.f37738p = false;
                this.f37740q = false;
                return;
            }
        }
        if (this.f37709a0 == null) {
        }
        i10 = this.f37711b0;
        i11 = this.f37733m0;
        if (i10 >= i11) {
        }
        i12 = this.f37713c0;
        i13 = this.f37735n0;
        if (i12 >= i13) {
        }
        b[] bVarArr4 = this.f37707Z;
        b bVar42 = bVarArr4[0];
        b bVar52 = b.MATCH_CONSTRAINT;
        i14 = i11;
        if (bVar42 == bVar52) {
        }
        b bVar62 = bVarArr4[1];
        i15 = i13;
        if (bVar62 == bVar52) {
        }
        int i312 = this.f37717e0;
        this.f37683F = i312;
        f10 = this.f37715d0;
        this.f37685G = f10;
        i16 = this.f37752w;
        i17 = this.f37754x;
        if (f10 <= 0.0f) {
        }
        i18 = i16;
        i19 = i17;
        i20 = i14;
        i21 = i15;
        z16 = false;
        int[] iArr222222 = this.f37756y;
        iArr222222[0] = i18;
        iArr222222[1] = i19;
        this.f37722h = z16;
        if (z16) {
        }
        z17 = false;
        if (z16) {
        }
        b bVar72222222 = this.f37707Z[0];
        bVar = b.WRAP_CONTENT;
        if (bVar72222222 != bVar) {
        }
        if (!z18) {
        }
        z19 = !this.f37703V.n();
        boolean[] zArr22222222 = this.f37706Y;
        z20 = zArr22222222[0];
        boolean z312222222 = zArr22222222[1];
        if (this.f37746t != 2) {
        }
        z21 = z11;
        z22 = z12;
        bVar2 = bVar52;
        bVar3 = bVar;
        c3597i = q14;
        c3597i2 = q13;
        c3597i3 = q12;
        c3597i4 = q11;
        c3597i5 = q10;
        z23 = z16;
        if (z10) {
        }
        i27 = i26;
        if ((eVar3.f37748u != 2 ? i25 : i27) != 0) {
        }
        c3597i9 = c3597i7;
        c3597i10 = c3597i8;
        if (z23) {
        }
        if (this.f37703V.n()) {
        }
        this.f37738p = false;
        this.f37740q = false;
    }

    public boolean g0() {
        d dVar = this.f37696O;
        d dVar2 = dVar.f37667f;
        if (dVar2 != null && dVar2.f37667f == dVar) {
            return true;
        }
        d dVar3 = this.f37698Q;
        d dVar4 = dVar3.f37667f;
        return dVar4 != null && dVar4.f37667f == dVar3;
    }

    public void g1(int i10) {
        this.f37711b0 = i10;
        int i11 = this.f37733m0;
        if (i10 < i11) {
            this.f37711b0 = i11;
        }
    }

    public boolean h() {
        return this.f37745s0 != 8;
    }

    public boolean h0() {
        return this.f37692K;
    }

    public void h1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f37750v = i10;
    }

    public boolean i0() {
        d dVar = this.f37697P;
        d dVar2 = dVar.f37667f;
        if (dVar2 != null && dVar2.f37667f == dVar) {
            return true;
        }
        d dVar3 = this.f37699R;
        d dVar4 = dVar3.f37667f;
        return dVar4 != null && dVar4.f37667f == dVar3;
    }

    public void i1(int i10) {
        this.f37719f0 = i10;
    }

    public void j(e eVar, float f10, int i10) {
        d.b bVar = d.b.CENTER;
        c0(bVar, eVar, bVar, i10, 0);
        this.f37689I = f10;
    }

    public boolean j0() {
        return this.f37693L;
    }

    public void j1(int i10) {
        this.f37721g0 = i10;
    }

    public void k(C3592d c3592d) {
        c3592d.q(this.f37696O);
        c3592d.q(this.f37697P);
        c3592d.q(this.f37698Q);
        c3592d.q(this.f37699R);
        if (this.f37731l0 > 0) {
            c3592d.q(this.f37700S);
        }
    }

    public boolean k0() {
        return this.f37724i && this.f37745s0 != 8;
    }

    public void k1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.f37683F == -1) {
            if (z12 && !z13) {
                this.f37683F = 0;
            } else if (!z12 && z13) {
                this.f37683F = 1;
                if (this.f37717e0 == -1) {
                    this.f37685G = 1.0f / this.f37685G;
                }
            }
        }
        if (this.f37683F == 0 && (!this.f37697P.n() || !this.f37699R.n())) {
            this.f37683F = 1;
        } else if (this.f37683F == 1 && (!this.f37696O.n() || !this.f37698Q.n())) {
            this.f37683F = 0;
        }
        if (this.f37683F == -1 && (!this.f37697P.n() || !this.f37699R.n() || !this.f37696O.n() || !this.f37698Q.n())) {
            if (this.f37697P.n() && this.f37699R.n()) {
                this.f37683F = 0;
            } else if (this.f37696O.n() && this.f37698Q.n()) {
                this.f37685G = 1.0f / this.f37685G;
                this.f37683F = 1;
            }
        }
        if (this.f37683F == -1) {
            int i10 = this.f37758z;
            if (i10 > 0 && this.f37677C == 0) {
                this.f37683F = 0;
            } else {
                if (i10 != 0 || this.f37677C <= 0) {
                    return;
                }
                this.f37685G = 1.0f / this.f37685G;
                this.f37683F = 1;
            }
        }
    }

    public void l() {
        if (this.f37716e == null) {
            this.f37716e = new l(this);
        }
        if (this.f37718f == null) {
            this.f37718f = new n(this);
        }
    }

    public boolean l0() {
        return this.f37738p || (this.f37696O.m() && this.f37698Q.m());
    }

    public void l1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean k10 = z10 & this.f37716e.k();
        boolean k11 = z11 & this.f37718f.k();
        l lVar = this.f37716e;
        int i12 = lVar.f38286h.f38241g;
        n nVar = this.f37718f;
        int i13 = nVar.f38286h.f38241g;
        int i14 = lVar.f38287i.f38241g;
        int i15 = nVar.f38287i.f38241g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (k10) {
            this.f37719f0 = i12;
        }
        if (k11) {
            this.f37721g0 = i13;
        }
        if (this.f37745s0 == 8) {
            this.f37711b0 = 0;
            this.f37713c0 = 0;
            return;
        }
        if (k10) {
            if (this.f37707Z[0] == b.FIXED && i17 < (i11 = this.f37711b0)) {
                i17 = i11;
            }
            this.f37711b0 = i17;
            int i19 = this.f37733m0;
            if (i17 < i19) {
                this.f37711b0 = i19;
            }
        }
        if (k11) {
            if (this.f37707Z[1] == b.FIXED && i18 < (i10 = this.f37713c0)) {
                i18 = i10;
            }
            this.f37713c0 = i18;
            int i20 = this.f37735n0;
            if (i18 < i20) {
                this.f37713c0 = i20;
            }
        }
    }

    public d m(d.b bVar) {
        switch (a.f37760a[bVar.ordinal()]) {
            case 1:
                return this.f37696O;
            case 2:
                return this.f37697P;
            case 3:
                return this.f37698Q;
            case 4:
                return this.f37699R;
            case 5:
                return this.f37700S;
            case 6:
                return this.f37703V;
            case 7:
                return this.f37701T;
            case 8:
                return this.f37702U;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean m0() {
        return this.f37740q || (this.f37697P.m() && this.f37699R.m());
    }

    public void m1(C3592d c3592d, boolean z10) {
        n nVar;
        l lVar;
        int y10 = c3592d.y(this.f37696O);
        int y11 = c3592d.y(this.f37697P);
        int y12 = c3592d.y(this.f37698Q);
        int y13 = c3592d.y(this.f37699R);
        if (z10 && (lVar = this.f37716e) != null) {
            p0.f fVar = lVar.f38286h;
            if (fVar.f38244j) {
                p0.f fVar2 = lVar.f38287i;
                if (fVar2.f38244j) {
                    y10 = fVar.f38241g;
                    y12 = fVar2.f38241g;
                }
            }
        }
        if (z10 && (nVar = this.f37718f) != null) {
            p0.f fVar3 = nVar.f38286h;
            if (fVar3.f38244j) {
                p0.f fVar4 = nVar.f38287i;
                if (fVar4.f38244j) {
                    y11 = fVar3.f38241g;
                    y13 = fVar4.f38241g;
                }
            }
        }
        int i10 = y13 - y11;
        if (y12 - y10 < 0 || i10 < 0 || y10 == Integer.MIN_VALUE || y10 == Integer.MAX_VALUE || y11 == Integer.MIN_VALUE || y11 == Integer.MAX_VALUE || y12 == Integer.MIN_VALUE || y12 == Integer.MAX_VALUE || y13 == Integer.MIN_VALUE || y13 == Integer.MAX_VALUE) {
            y10 = 0;
            y13 = 0;
            y11 = 0;
            y12 = 0;
        }
        G0(y10, y11, y12, y13);
    }

    public int n() {
        return this.f37731l0;
    }

    public boolean n0() {
        return this.f37744s;
    }

    public float o(int i10) {
        if (i10 == 0) {
            return this.f37737o0;
        }
        if (i10 == 1) {
            return this.f37739p0;
        }
        return -1.0f;
    }

    public void o0() {
        this.f37742r = true;
    }

    public int p() {
        return W() + this.f37713c0;
    }

    public void p0() {
        this.f37744s = true;
    }

    public Object q() {
        return this.f37741q0;
    }

    public boolean q0() {
        b[] bVarArr = this.f37707Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String r() {
        return this.f37747t0;
    }

    public void r0() {
        this.f37696O.p();
        this.f37697P.p();
        this.f37698Q.p();
        this.f37699R.p();
        this.f37700S.p();
        this.f37701T.p();
        this.f37702U.p();
        this.f37703V.p();
        this.f37709a0 = null;
        this.f37689I = 0.0f;
        this.f37711b0 = 0;
        this.f37713c0 = 0;
        this.f37715d0 = 0.0f;
        this.f37717e0 = -1;
        this.f37719f0 = 0;
        this.f37721g0 = 0;
        this.f37727j0 = 0;
        this.f37729k0 = 0;
        this.f37731l0 = 0;
        this.f37733m0 = 0;
        this.f37735n0 = 0;
        float f10 = f37672J0;
        this.f37737o0 = f10;
        this.f37739p0 = f10;
        b[] bVarArr = this.f37707Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f37741q0 = null;
        this.f37743r0 = 0;
        this.f37745s0 = 0;
        this.f37749u0 = null;
        this.f37751v0 = false;
        this.f37753w0 = false;
        this.f37757y0 = 0;
        this.f37759z0 = 0;
        this.f37674A0 = false;
        this.f37676B0 = false;
        float[] fArr = this.f37678C0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f37746t = -1;
        this.f37748u = -1;
        int[] iArr = this.f37687H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f37752w = 0;
        this.f37754x = 0;
        this.f37675B = 1.0f;
        this.f37681E = 1.0f;
        this.f37673A = Integer.MAX_VALUE;
        this.f37679D = Integer.MAX_VALUE;
        this.f37758z = 0;
        this.f37677C = 0;
        this.f37722h = false;
        this.f37683F = -1;
        this.f37685G = 1.0f;
        this.f37755x0 = false;
        boolean[] zArr = this.f37720g;
        zArr[0] = true;
        zArr[1] = true;
        this.f37693L = false;
        boolean[] zArr2 = this.f37706Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f37724i = true;
        int[] iArr2 = this.f37756y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f37730l = -1;
        this.f37732m = -1;
    }

    public b s(int i10) {
        if (i10 == 0) {
            return y();
        }
        if (i10 == 1) {
            return R();
        }
        return null;
    }

    public void s0() {
        this.f37738p = false;
        this.f37740q = false;
        this.f37742r = false;
        this.f37744s = false;
        int size = this.f37705X.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f37705X.get(i10)).q();
        }
    }

    public float t() {
        return this.f37715d0;
    }

    public void t0(C3591c c3591c) {
        this.f37696O.r(c3591c);
        this.f37697P.r(c3591c);
        this.f37698Q.r(c3591c);
        this.f37699R.r(c3591c);
        this.f37700S.r(c3591c);
        this.f37703V.r(c3591c);
        this.f37701T.r(c3591c);
        this.f37702U.r(c3591c);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = this.f37749u0;
        String str3 = BuildConfig.FLAVOR;
        if (str2 != null) {
            str = "type: " + this.f37749u0 + " ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb2.append(str);
        if (this.f37747t0 != null) {
            str3 = "id: " + this.f37747t0 + " ";
        }
        sb2.append(str3);
        sb2.append("(");
        sb2.append(this.f37719f0);
        sb2.append(", ");
        sb2.append(this.f37721g0);
        sb2.append(") - (");
        sb2.append(this.f37711b0);
        sb2.append(" x ");
        sb2.append(this.f37713c0);
        sb2.append(")");
        return sb2.toString();
    }

    public int u() {
        return this.f37717e0;
    }

    public int v() {
        if (this.f37745s0 == 8) {
            return 0;
        }
        return this.f37713c0;
    }

    public float w() {
        return this.f37737o0;
    }

    public int x() {
        return this.f37757y0;
    }

    public void x0(int i10) {
        this.f37731l0 = i10;
        this.f37691J = i10 > 0;
    }

    public b y() {
        return this.f37707Z[0];
    }

    public void y0(Object obj) {
        this.f37741q0 = obj;
    }

    public int z() {
        d dVar = this.f37696O;
        int i10 = dVar != null ? dVar.f37668g : 0;
        d dVar2 = this.f37698Q;
        return dVar2 != null ? i10 + dVar2.f37668g : i10;
    }

    public void z0(String str) {
        this.f37747t0 = str;
    }
}
