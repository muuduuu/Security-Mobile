package fd;

import com.appsflyer.attribution.RequestError;
import dd.C3026c;
import dd.EnumC3033j;
import dd.EnumC3034k;
import dd.x;
import kotlin.reflect.jvm.internal.impl.protobuf.j;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: A, reason: collision with root package name */
    public static final C0485b f32994A;

    /* renamed from: B, reason: collision with root package name */
    public static final C0485b f32995B;

    /* renamed from: C, reason: collision with root package name */
    public static final C0485b f32996C;

    /* renamed from: D, reason: collision with root package name */
    public static final C0485b f32997D;

    /* renamed from: E, reason: collision with root package name */
    public static final C0485b f32998E;

    /* renamed from: F, reason: collision with root package name */
    public static final C0485b f32999F;

    /* renamed from: G, reason: collision with root package name */
    public static final C0485b f33000G;

    /* renamed from: H, reason: collision with root package name */
    public static final C0485b f33001H;

    /* renamed from: I, reason: collision with root package name */
    public static final C0485b f33002I;

    /* renamed from: J, reason: collision with root package name */
    public static final C0485b f33003J;

    /* renamed from: K, reason: collision with root package name */
    public static final C0485b f33004K;

    /* renamed from: L, reason: collision with root package name */
    public static final C0485b f33005L;

    /* renamed from: M, reason: collision with root package name */
    public static final C0485b f33006M;

    /* renamed from: N, reason: collision with root package name */
    public static final C0485b f33007N;

    /* renamed from: O, reason: collision with root package name */
    public static final C0485b f33008O;

    /* renamed from: P, reason: collision with root package name */
    public static final C0485b f33009P;

    /* renamed from: a, reason: collision with root package name */
    public static final C0485b f33010a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0485b f33011b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0485b f33012c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f33013d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f33014e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f33015f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0485b f33016g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0485b f33017h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0485b f33018i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0485b f33019j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0485b f33020k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0485b f33021l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0485b f33022m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0485b f33023n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0485b f33024o;

    /* renamed from: p, reason: collision with root package name */
    public static final d f33025p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0485b f33026q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0485b f33027r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0485b f33028s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0485b f33029t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0485b f33030u;

    /* renamed from: v, reason: collision with root package name */
    public static final C0485b f33031v;

    /* renamed from: w, reason: collision with root package name */
    public static final C0485b f33032w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0485b f33033x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0485b f33034y;

    /* renamed from: z, reason: collision with root package name */
    public static final C0485b f33035z;

    /* renamed from: fd.b$b, reason: collision with other inner class name */
    public static class C0485b extends d {
        public C0485b(int i10) {
            super(i10, 1);
        }

        @Override // fd.b.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i10) {
            return Boolean.valueOf((i10 & (1 << this.f33037a)) != 0);
        }

        @Override // fd.b.d
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f33037a;
            }
            return 0;
        }
    }

    private static class c extends d {

        /* renamed from: c, reason: collision with root package name */
        private final j.a[] f33036c;

        public c(int i10, j.a[] aVarArr) {
            super(i10, g(aVarArr));
            this.f33036c = aVarArr;
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        private static int g(Object[] objArr) {
            if (objArr == null) {
                f(0);
            }
            int length = objArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + objArr.getClass());
        }

        @Override // fd.b.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public j.a d(int i10) {
            int i11 = (1 << this.f33038b) - 1;
            int i12 = this.f33037a;
            int i13 = (i10 & (i11 << i12)) >> i12;
            for (j.a aVar : this.f33036c) {
                if (aVar.getNumber() == i13) {
                    return aVar;
                }
            }
            return null;
        }

        @Override // fd.b.d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(j.a aVar) {
            return aVar.getNumber() << this.f33037a;
        }
    }

    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f33037a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33038b;

        public static d a(d dVar, j.a[] aVarArr) {
            return new c(dVar.f33037a + dVar.f33038b, aVarArr);
        }

        public static C0485b b(d dVar) {
            return new C0485b(dVar.f33037a + dVar.f33038b);
        }

        public static C0485b c() {
            return new C0485b(0);
        }

        public abstract Object d(int i10);

        public abstract int e(Object obj);

        private d(int i10, int i11) {
            this.f33037a = i10;
            this.f33038b = i11;
        }
    }

    static {
        C0485b c10 = d.c();
        f33010a = c10;
        f33011b = d.b(c10);
        C0485b c11 = d.c();
        f33012c = c11;
        d a10 = d.a(c11, x.values());
        f33013d = a10;
        d a11 = d.a(a10, EnumC3034k.values());
        f33014e = a11;
        d a12 = d.a(a11, C3026c.EnumC0459c.values());
        f33015f = a12;
        C0485b b10 = d.b(a12);
        f33016g = b10;
        C0485b b11 = d.b(b10);
        f33017h = b11;
        C0485b b12 = d.b(b11);
        f33018i = b12;
        C0485b b13 = d.b(b12);
        f33019j = b13;
        C0485b b14 = d.b(b13);
        f33020k = b14;
        C0485b b15 = d.b(b14);
        f33021l = b15;
        f33022m = d.b(b15);
        C0485b b16 = d.b(a10);
        f33023n = b16;
        f33024o = d.b(b16);
        d a13 = d.a(a11, EnumC3033j.values());
        f33025p = a13;
        C0485b b17 = d.b(a13);
        f33026q = b17;
        C0485b b18 = d.b(b17);
        f33027r = b18;
        C0485b b19 = d.b(b18);
        f33028s = b19;
        C0485b b20 = d.b(b19);
        f33029t = b20;
        C0485b b21 = d.b(b20);
        f33030u = b21;
        C0485b b22 = d.b(b21);
        f33031v = b22;
        C0485b b23 = d.b(b22);
        f33032w = b23;
        f33033x = d.b(b23);
        C0485b b24 = d.b(a13);
        f33034y = b24;
        C0485b b25 = d.b(b24);
        f33035z = b25;
        C0485b b26 = d.b(b25);
        f32994A = b26;
        C0485b b27 = d.b(b26);
        f32995B = b27;
        C0485b b28 = d.b(b27);
        f32996C = b28;
        C0485b b29 = d.b(b28);
        f32997D = b29;
        C0485b b30 = d.b(b29);
        f32998E = b30;
        C0485b b31 = d.b(b30);
        f32999F = b31;
        f33000G = d.b(b31);
        C0485b b32 = d.b(c11);
        f33001H = b32;
        C0485b b33 = d.b(b32);
        f33002I = b33;
        f33003J = d.b(b33);
        C0485b b34 = d.b(a11);
        f33004K = b34;
        C0485b b35 = d.b(b34);
        f33005L = b35;
        f33006M = d.b(b35);
        C0485b c12 = d.c();
        f33007N = c12;
        f33008O = d.b(c12);
        f33009P = d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[0] = "kind";
            } else if (i10 != 5) {
                if (i10 != 6) {
                    if (i10 != 8) {
                        if (i10 != 9) {
                            if (i10 != 11) {
                                objArr[0] = "visibility";
                            }
                        }
                    }
                }
                objArr[0] = "memberKind";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
            switch (i10) {
                case 3:
                    objArr[2] = "getConstructorFlags";
                    break;
                case 4:
                case 5:
                case 6:
                    objArr[2] = "getFunctionFlags";
                    break;
                case 7:
                case 8:
                case 9:
                    objArr[2] = "getPropertyFlags";
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case 11:
                    objArr[2] = "getAccessorFlags";
                    break;
                default:
                    objArr[2] = "getClassFlags";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        objArr[0] = "modality";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i10) {
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static int b(boolean z10, x xVar, EnumC3034k enumC3034k, boolean z11, boolean z12, boolean z13) {
        if (xVar == null) {
            a(10);
        }
        if (enumC3034k == null) {
            a(11);
        }
        return f33012c.e(Boolean.valueOf(z10)) | f33014e.e(enumC3034k) | f33013d.e(xVar) | f33004K.e(Boolean.valueOf(z11)) | f33005L.e(Boolean.valueOf(z12)) | f33006M.e(Boolean.valueOf(z13));
    }
}
