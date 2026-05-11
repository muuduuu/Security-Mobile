package com.facebook.hermes.intl;

import android.icu.text.MeasureFormat;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.text.AttributedCharacterIterator;

/* loaded from: classes.dex */
public interface c {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20665a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20666b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f20667c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f20668d;

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f20669e;

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f20670f;

        /* renamed from: g, reason: collision with root package name */
        static final /* synthetic */ int[] f20671g;

        static {
            int[] iArr = new int[d.values().length];
            f20671g = iArr;
            try {
                iArr[d.ACCOUNTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20671g[d.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0366c.values().length];
            f20670f = iArr2;
            try {
                iArr2[EnumC0366c.SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20670f[EnumC0366c.NARROWSYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20670f[EnumC0366c.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20670f[EnumC0366c.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[i.values().length];
            f20669e = iArr3;
            try {
                iArr3[i.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20669e[i.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20669e[i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[g.values().length];
            f20668d = iArr4;
            try {
                iArr4[g.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20668d[g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20668d[g.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20668d[g.EXCEPTZERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[b.values().length];
            f20667c = iArr5;
            try {
                iArr5[b.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20667c[b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr6 = new int[e.values().length];
            f20666b = iArr6;
            try {
                iArr6[e.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20666b[e.SCIENTIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f20666b[e.ENGINEERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f20666b[e.COMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr7 = new int[h.values().length];
            f20665a = iArr7;
            try {
                iArr7[h.DECIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f20665a[h.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f20665a[h.CURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f20665a[h.UNIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    public enum b {
        SHORT,
        LONG;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20667c[ordinal()];
            if (i10 == 1) {
                return "short";
            }
            if (i10 == 2) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$c, reason: collision with other inner class name */
    public enum EnumC0366c {
        SYMBOL,
        NARROWSYMBOL,
        CODE,
        NAME;

        public int getNameStyle() {
            return a.f20670f[ordinal()] != 4 ? 0 : 1;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20670f[ordinal()];
            if (i10 == 1) {
                return "symbol";
            }
            if (i10 == 2) {
                return "narrowSymbol";
            }
            if (i10 == 3) {
                return AppConstants.RETAKE_ERROR_CODE;
            }
            if (i10 == 4) {
                return "name";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum d {
        STANDARD,
        ACCOUNTING;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20671g[ordinal()];
            if (i10 == 1) {
                return "accounting";
            }
            if (i10 == 2) {
                return "standard";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum e {
        STANDARD,
        SCIENTIFIC,
        ENGINEERING,
        COMPACT;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20666b[ordinal()];
            if (i10 == 1) {
                return "standard";
            }
            if (i10 == 2) {
                return "scientific";
            }
            if (i10 == 3) {
                return "engineering";
            }
            if (i10 == 4) {
                return "compact";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum f {
        SIGNIFICANT_DIGITS,
        FRACTION_DIGITS,
        COMPACT_ROUNDING
    }

    public enum g {
        AUTO,
        ALWAYS,
        NEVER,
        EXCEPTZERO;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20668d[ordinal()];
            if (i10 == 1) {
                return "auto";
            }
            if (i10 == 2) {
                return "always";
            }
            if (i10 == 3) {
                return "never";
            }
            if (i10 == 4) {
                return "exceptZero";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum h {
        DECIMAL,
        PERCENT,
        CURRENCY,
        UNIT;

        public int getInitialNumberFormatStyle(e eVar, d dVar) {
            int i10 = a.f20665a[ordinal()];
            if (i10 == 2) {
                return 2;
            }
            if (i10 != 3) {
                return (eVar == e.SCIENTIFIC || eVar == e.ENGINEERING) ? 3 : 0;
            }
            if (dVar == d.ACCOUNTING) {
                return 7;
            }
            if (dVar == d.STANDARD) {
                return 1;
            }
            throw new Q3.e("Unrecognized formatting style requested.");
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20665a[ordinal()];
            if (i10 == 1) {
                return "decimal";
            }
            if (i10 == 2) {
                return "percent";
            }
            if (i10 == 3) {
                return "currency";
            }
            if (i10 == 4) {
                return "unit";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum i {
        SHORT,
        NARROW,
        LONG;

        public MeasureFormat.FormatWidth getFormatWidth() {
            int i10 = a.f20669e[ordinal()];
            return i10 != 2 ? i10 != 3 ? MeasureFormat.FormatWidth.SHORT : MeasureFormat.FormatWidth.WIDE : MeasureFormat.FormatWidth.NARROW;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f20669e[ordinal()];
            if (i10 == 1) {
                return "short";
            }
            if (i10 == 2) {
                return "narrow";
            }
            if (i10 == 3) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    AttributedCharacterIterator a(double d10);

    String b(Q3.b bVar);

    String c(double d10);

    c d(Q3.b bVar, String str, h hVar, d dVar, e eVar, b bVar2);

    c e(String str, i iVar);

    c f(g gVar);

    c g(String str, EnumC0366c enumC0366c);

    c h(f fVar, int i10, int i11);

    String i(AttributedCharacterIterator.Attribute attribute, double d10);

    c j(int i10);

    c k(boolean z10);

    c l(f fVar, int i10, int i11);
}
