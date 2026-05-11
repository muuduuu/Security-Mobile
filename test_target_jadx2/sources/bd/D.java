package bd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.PSKKeyManager;
import yd.u0;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: k, reason: collision with root package name */
    public static final a f18939k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final D f18940l;

    /* renamed from: m, reason: collision with root package name */
    public static final D f18941m;

    /* renamed from: n, reason: collision with root package name */
    public static final D f18942n;

    /* renamed from: o, reason: collision with root package name */
    public static final D f18943o;

    /* renamed from: p, reason: collision with root package name */
    public static final D f18944p;

    /* renamed from: q, reason: collision with root package name */
    public static final D f18945q;

    /* renamed from: r, reason: collision with root package name */
    public static final D f18946r;

    /* renamed from: s, reason: collision with root package name */
    public static final D f18947s;

    /* renamed from: t, reason: collision with root package name */
    public static final D f18948t;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18949a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18950b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18951c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18952d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18953e;

    /* renamed from: f, reason: collision with root package name */
    private final D f18954f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f18955g;

    /* renamed from: h, reason: collision with root package name */
    private final D f18956h;

    /* renamed from: i, reason: collision with root package name */
    private final D f18957i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f18958j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18959a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18959a = iArr;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        D d10 = null;
        boolean z14 = false;
        D d11 = null;
        D d12 = null;
        boolean z15 = false;
        D d13 = new D(z10, false, z11, z12, z13, d10, z14, d11, d12, z15, 1023, defaultConstructorMarker);
        f18940l = d13;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        D d14 = null;
        D d15 = null;
        boolean z22 = true;
        D d16 = new D(z16, z17, z18, z19, z20, null, z21, d14, d15, z22, 511, defaultConstructorMarker2);
        f18941m = d16;
        f18942n = new D(z10, true, z11, z12, z13, d10, z14, d11, d12, z15, 1021, defaultConstructorMarker);
        int i10 = 988;
        f18943o = new D(z10, false, z11, z12, z13, d13, z14, d11, d12, z15, i10, defaultConstructorMarker);
        f18944p = new D(z16, z17, z18, z19, z20, d16, z21, d14, d15, z22, 476, defaultConstructorMarker2);
        f18945q = new D(z10, true, z11, z12, z13, d13, z14, d11, d12, z15, i10, defaultConstructorMarker);
        boolean z23 = false;
        boolean z24 = true;
        f18946r = new D(z10, z23, z11, z24, z13, d13, z14, d11, d12, z15, 983, defaultConstructorMarker);
        f18947s = new D(z10, z23, z11, z24, z13, d13, z14, d11, d12, z15, 919, defaultConstructorMarker);
        f18948t = new D(z10, z23, true, false, z13, d13, z14, d11, d12, z15, 984, defaultConstructorMarker);
    }

    public D(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, D d10, boolean z15, D d11, D d12, boolean z16) {
        this.f18949a = z10;
        this.f18950b = z11;
        this.f18951c = z12;
        this.f18952d = z13;
        this.f18953e = z14;
        this.f18954f = d10;
        this.f18955g = z15;
        this.f18956h = d11;
        this.f18957i = d12;
        this.f18958j = z16;
    }

    public final boolean a() {
        return this.f18955g;
    }

    public final boolean b() {
        return this.f18958j;
    }

    public final boolean c() {
        return this.f18950b;
    }

    public final boolean d() {
        return this.f18949a;
    }

    public final boolean e() {
        return this.f18951c;
    }

    public final D f(u0 effectiveVariance, boolean z10) {
        Intrinsics.checkNotNullParameter(effectiveVariance, "effectiveVariance");
        if (!z10 || !this.f18951c) {
            int i10 = b.f18959a[effectiveVariance.ordinal()];
            if (i10 == 1) {
                D d10 = this.f18956h;
                if (d10 != null) {
                    return d10;
                }
            } else if (i10 != 2) {
                D d11 = this.f18954f;
                if (d11 != null) {
                    return d11;
                }
            } else {
                D d12 = this.f18957i;
                if (d12 != null) {
                    return d12;
                }
            }
        }
        return this;
    }

    public final D g() {
        return new D(this.f18949a, true, this.f18951c, this.f18952d, this.f18953e, this.f18954f, this.f18955g, this.f18956h, this.f18957i, false, 512, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ D(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, D d10, boolean z15, D d11, D d12, boolean z16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r6, r7, r8, (i10 & 64) == 0 ? z15 : true, (i10 & 128) != 0 ? r8 : d11, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? r8 : d12, (i10 & 512) == 0 ? z16 : false);
        boolean z17 = (i10 & 1) != 0 ? true : z10;
        boolean z18 = (i10 & 2) != 0 ? true : z11;
        boolean z19 = (i10 & 4) != 0 ? false : z12;
        boolean z20 = (i10 & 8) != 0 ? false : z13;
        boolean z21 = (i10 & 16) != 0 ? false : z14;
        D d13 = (i10 & 32) != 0 ? null : d10;
    }
}
