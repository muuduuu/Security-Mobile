package ud;

import Kc.EnumC0934f;
import dd.C3026c;
import dd.C3040q;
import dd.C3042s;
import dd.EnumC3034k;
import kotlin.jvm.internal.Intrinsics;
import yd.u0;

/* loaded from: classes3.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final B f43625a = new B();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43626a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43627b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f43628c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f43629d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f43630e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f43631f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f43632g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f43633h;

        static {
            int[] iArr = new int[EnumC3034k.values().length];
            try {
                iArr[EnumC3034k.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3034k.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3034k.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3034k.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f43626a = iArr;
            int[] iArr2 = new int[Kc.D.values().length];
            try {
                iArr2[Kc.D.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Kc.D.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Kc.D.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Kc.D.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f43627b = iArr2;
            int[] iArr3 = new int[dd.x.values().length];
            try {
                iArr3[dd.x.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[dd.x.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[dd.x.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[dd.x.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[dd.x.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[dd.x.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f43628c = iArr3;
            int[] iArr4 = new int[C3026c.EnumC0459c.values().length];
            try {
                iArr4[C3026c.EnumC0459c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[C3026c.EnumC0459c.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[C3026c.EnumC0459c.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[C3026c.EnumC0459c.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[C3026c.EnumC0459c.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[C3026c.EnumC0459c.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[C3026c.EnumC0459c.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f43629d = iArr4;
            int[] iArr5 = new int[EnumC0934f.values().length];
            try {
                iArr5[EnumC0934f.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[EnumC0934f.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[EnumC0934f.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[EnumC0934f.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[EnumC0934f.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[EnumC0934f.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            f43630e = iArr5;
            int[] iArr6 = new int[C3042s.c.values().length];
            try {
                iArr6[C3042s.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[C3042s.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[C3042s.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f43631f = iArr6;
            int[] iArr7 = new int[C3040q.b.c.values().length];
            try {
                iArr7[C3040q.b.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[C3040q.b.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[C3040q.b.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[C3040q.b.c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f43632g = iArr7;
            int[] iArr8 = new int[u0.values().length];
            try {
                iArr8[u0.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[u0.OUT_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[u0.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f43633h = iArr8;
        }
    }

    private B() {
    }

    public final EnumC0934f a(C3026c.EnumC0459c enumC0459c) {
        switch (enumC0459c == null ? -1 : a.f43629d[enumC0459c.ordinal()]) {
        }
        return EnumC0934f.CLASS;
    }

    public final Kc.D b(EnumC3034k enumC3034k) {
        int i10 = enumC3034k == null ? -1 : a.f43626a[enumC3034k.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Kc.D.FINAL : Kc.D.SEALED : Kc.D.ABSTRACT : Kc.D.OPEN : Kc.D.FINAL;
    }

    public final u0 c(C3040q.b.c projection) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        int i10 = a.f43632g[projection.ordinal()];
        if (i10 == 1) {
            return u0.IN_VARIANCE;
        }
        if (i10 == 2) {
            return u0.OUT_VARIANCE;
        }
        if (i10 == 3) {
            return u0.INVARIANT;
        }
        if (i10 != 4) {
            throw new lc.m();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
    }

    public final u0 d(C3042s.c variance) {
        Intrinsics.checkNotNullParameter(variance, "variance");
        int i10 = a.f43631f[variance.ordinal()];
        if (i10 == 1) {
            return u0.IN_VARIANCE;
        }
        if (i10 == 2) {
            return u0.OUT_VARIANCE;
        }
        if (i10 == 3) {
            return u0.INVARIANT;
        }
        throw new lc.m();
    }
}
