package com.facebook.hermes.intl;

import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.facebook.hermes.intl.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0364a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20649a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20650b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f20651c;

        static {
            int[] iArr = new int[b.values().length];
            f20651c = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20651c[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20651c[b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f20650b = iArr2;
            try {
                iArr2[d.SORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20650b[d.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[c.values().length];
            f20649a = iArr3;
            try {
                iArr3[c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20649a[c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20649a[c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20649a[c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20649a[c.LOCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum b {
        UPPER,
        LOWER,
        FALSE;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = C0364a.f20651c[ordinal()];
            if (i10 == 1) {
                return "upper";
            }
            if (i10 == 2) {
                return "lower";
            }
            if (i10 == 3) {
                return "false";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum c {
        BASE,
        ACCENT,
        CASE,
        VARIANT,
        LOCALE;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = C0364a.f20649a[ordinal()];
            if (i10 == 1) {
                return "base";
            }
            if (i10 == 2) {
                return "accent";
            }
            if (i10 == 3) {
                return "case";
            }
            if (i10 == 4) {
                return "variant";
            }
            if (i10 == 5) {
                return BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException();
        }
    }

    public enum d {
        SORT,
        SEARCH;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = C0364a.f20650b[ordinal()];
            if (i10 == 1) {
                return "sort";
            }
            if (i10 == 2) {
                return "search";
            }
            throw new IllegalArgumentException();
        }
    }

    int a(String str, String str2);

    c b();

    a c(b bVar);

    a d(boolean z10);

    a e(Q3.b bVar);

    a f(c cVar);

    a g(boolean z10);
}
