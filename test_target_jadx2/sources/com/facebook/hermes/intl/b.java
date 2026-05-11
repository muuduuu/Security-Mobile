package com.facebook.hermes.intl;

import java.text.AttributedCharacterIterator;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public interface b {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20652a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20653b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f20654c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f20655d;

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f20656e;

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f20657f;

        /* renamed from: g, reason: collision with root package name */
        static final /* synthetic */ int[] f20658g;

        /* renamed from: h, reason: collision with root package name */
        static final /* synthetic */ int[] f20659h;

        /* renamed from: i, reason: collision with root package name */
        static final /* synthetic */ int[] f20660i;

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ int[] f20661j;

        /* renamed from: k, reason: collision with root package name */
        static final /* synthetic */ int[] f20662k;

        /* renamed from: l, reason: collision with root package name */
        static final /* synthetic */ int[] f20663l;

        /* renamed from: m, reason: collision with root package name */
        static final /* synthetic */ int[] f20664m;

        static {
            int[] iArr = new int[k.values().length];
            f20664m = iArr;
            try {
                iArr[k.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20664m[k.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20664m[k.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20664m[k.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20664m[k.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC0365b.values().length];
            f20663l = iArr2;
            try {
                iArr2[EnumC0365b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20663l[EnumC0365b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20663l[EnumC0365b.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20663l[EnumC0365b.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20663l[EnumC0365b.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[l.values().length];
            f20662k = iArr3;
            try {
                iArr3[l.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20662k[l.LONGOFFSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20662k[l.LONGGENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20662k[l.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20662k[l.SHORTOFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f20662k[l.SHORTGENERIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20662k[l.UNDEFINED.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr4 = new int[j.values().length];
            f20661j = iArr4;
            try {
                iArr4[j.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f20661j[j.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f20661j[j.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr5 = new int[h.values().length];
            f20660i = iArr5;
            try {
                iArr5[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f20660i[h.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f20660i[h.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            int[] iArr6 = new int[f.values().length];
            f20659h = iArr6;
            try {
                iArr6[f.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f20659h[f.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f20659h[f.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr7 = new int[c.values().length];
            f20658g = iArr7;
            try {
                iArr7[c.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f20658g[c.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f20658g[c.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            int[] iArr8 = new int[i.values().length];
            f20657f = iArr8;
            try {
                iArr8[i.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f20657f[i.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f20657f[i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f20657f[i.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f20657f[i.NARROW.ordinal()] = 5;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f20657f[i.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused35) {
            }
            int[] iArr9 = new int[n.values().length];
            f20656e = iArr9;
            try {
                iArr9[n.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f20656e[n.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f20656e[n.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr10 = new int[d.values().length];
            f20655d = iArr10;
            try {
                iArr10[d.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f20655d[d.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f20655d[d.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f20655d[d.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            int[] iArr11 = new int[m.values().length];
            f20654c = iArr11;
            try {
                iArr11[m.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f20654c[m.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f20654c[m.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f20654c[m.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused46) {
            }
            int[] iArr12 = new int[g.values().length];
            f20653b = iArr12;
            try {
                iArr12[g.H11.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f20653b[g.H12.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f20653b[g.H23.ordinal()] = 3;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f20653b[g.H24.ordinal()] = 4;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f20653b[g.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused51) {
            }
            int[] iArr13 = new int[e.values().length];
            f20652a = iArr13;
            try {
                iArr13[e.BESTFIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f20652a[e.BASIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused53) {
            }
        }
    }

    /* renamed from: com.facebook.hermes.intl.b$b, reason: collision with other inner class name */
    public enum EnumC0365b {
        FULL,
        LONG,
        MEDIUM,
        SHORT,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20663l[ordinal()];
            if (i10 == 1) {
                return "full";
            }
            if (i10 == 2) {
                return "long";
            }
            if (i10 == 3) {
                return "medium";
            }
            if (i10 == 4) {
                return "short";
            }
            if (i10 == 5) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }
    }

    public enum c {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String getSkeleonSymbol() {
            int i10 = a.f20658g[ordinal()];
            if (i10 == 1) {
                return "d";
            }
            if (i10 == 2) {
                return "dd";
            }
            if (i10 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20658g[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }
    }

    public enum d {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String getSkeleonSymbol() {
            int i10 = a.f20655d[ordinal()];
            if (i10 == 1) {
                return "GGGG";
            }
            if (i10 == 2) {
                return "GGG";
            }
            if (i10 == 3) {
                return "G5";
            }
            if (i10 == 4) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20655d[ordinal()];
            if (i10 == 1) {
                return "long";
            }
            if (i10 == 2) {
                return "short";
            }
            if (i10 == 3) {
                return "narrow";
            }
            if (i10 == 4) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }
    }

    public enum e {
        BESTFIT,
        BASIC;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20652a[ordinal()];
            if (i10 == 1) {
                return "best fit";
            }
            if (i10 == 2) {
                return "basic";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum f {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String getSkeleonSymbol12() {
            int i10 = a.f20659h[ordinal()];
            if (i10 == 1) {
                return "h";
            }
            if (i10 == 2) {
                return "hh";
            }
            if (i10 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }

        public String getSkeleonSymbol24() {
            int i10 = a.f20659h[ordinal()];
            if (i10 == 1) {
                return "k";
            }
            if (i10 == 2) {
                return "kk";
            }
            if (i10 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20659h[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }
    }

    public enum g {
        H11,
        H12,
        H23,
        H24,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20653b[ordinal()];
            if (i10 == 1) {
                return "h11";
            }
            if (i10 == 2) {
                return "h12";
            }
            if (i10 == 3) {
                return "h23";
            }
            if (i10 == 4) {
                return "h24";
            }
            if (i10 == 5) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }
    }

    public enum h {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String getSkeleonSymbol() {
            int i10 = a.f20660i[ordinal()];
            if (i10 == 1) {
                return "m";
            }
            if (i10 == 2) {
                return "mm";
            }
            if (i10 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20660i[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }
    }

    public enum i {
        NUMERIC,
        DIGIT2,
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String getSkeleonSymbol() {
            switch (a.f20657f[ordinal()]) {
                case 1:
                    return "M";
                case 2:
                    return "MM";
                case 3:
                    return "MMMM";
                case 4:
                    return "MMM";
                case 5:
                    return "MMMMM";
                case 6:
                    return BuildConfig.FLAVOR;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (a.f20657f[ordinal()]) {
                case 1:
                    return "numeric";
                case 2:
                    return "2-digit";
                case 3:
                    return "long";
                case 4:
                    return "short";
                case 5:
                    return "narrow";
                case 6:
                    return BuildConfig.FLAVOR;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public enum j {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String getSkeleonSymbol() {
            int i10 = a.f20661j[ordinal()];
            if (i10 == 1) {
                return "s";
            }
            if (i10 == 2) {
                return "ss";
            }
            if (i10 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20661j[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }
    }

    public enum k {
        FULL,
        LONG,
        MEDIUM,
        SHORT,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20664m[ordinal()];
            if (i10 == 1) {
                return "full";
            }
            if (i10 == 2) {
                return "long";
            }
            if (i10 == 3) {
                return "medium";
            }
            if (i10 == 4) {
                return "short";
            }
            if (i10 == 5) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }
    }

    public enum l {
        LONG,
        LONGOFFSET,
        LONGGENERIC,
        SHORT,
        SHORTOFFSET,
        SHORTGENERIC,
        UNDEFINED;

        public String getSkeleonSymbol() {
            switch (a.f20662k[ordinal()]) {
                case 1:
                    return "zzzz";
                case 2:
                    return "OOOO";
                case 3:
                    return "vvvv";
                case 4:
                    return "z";
                case 5:
                    return "O";
                case 6:
                    return "v";
                case 7:
                    return BuildConfig.FLAVOR;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (a.f20662k[ordinal()]) {
                case 1:
                    return "long";
                case 2:
                    return "longOffset";
                case 3:
                    return "longGeneric";
                case 4:
                    return "short";
                case 5:
                    return "shortOffset";
                case 6:
                    return "shortGeneric";
                case 7:
                    return BuildConfig.FLAVOR;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public enum m {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String getSkeleonSymbol() {
            int i10 = a.f20654c[ordinal()];
            if (i10 == 1) {
                return "EEEE";
            }
            if (i10 == 2) {
                return "EEE";
            }
            if (i10 == 3) {
                return "EEEEE";
            }
            if (i10 == 4) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20654c[ordinal()];
            if (i10 == 1) {
                return "long";
            }
            if (i10 == 2) {
                return "short";
            }
            if (i10 == 3) {
                return "narrow";
            }
            if (i10 == 4) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }
    }

    public enum n {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String getSkeleonSymbol() {
            int i10 = a.f20656e[ordinal()];
            if (i10 == 1) {
                return "yyyy";
            }
            if (i10 == 2) {
                return "yy";
            }
            if (i10 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20656e[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }
    }

    AttributedCharacterIterator a(double d10);

    String b(Q3.b bVar);

    String c(double d10);

    String d(Q3.b bVar);

    void e(Q3.b bVar, String str, String str2, e eVar, m mVar, d dVar, n nVar, i iVar, c cVar, f fVar, h hVar, j jVar, l lVar, g gVar, Object obj, EnumC0365b enumC0365b, k kVar, Object obj2);

    String f(Q3.b bVar);

    String g(AttributedCharacterIterator.Attribute attribute, String str);

    g h(Q3.b bVar);
}
