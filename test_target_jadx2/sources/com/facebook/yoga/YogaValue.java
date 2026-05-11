package com.facebook.yoga;

/* loaded from: classes2.dex */
public class YogaValue {

    /* renamed from: c, reason: collision with root package name */
    static final YogaValue f23101c = new YogaValue(Float.NaN, w.UNDEFINED);

    /* renamed from: d, reason: collision with root package name */
    static final YogaValue f23102d = new YogaValue(0.0f, w.POINT);

    /* renamed from: e, reason: collision with root package name */
    static final YogaValue f23103e = new YogaValue(Float.NaN, w.AUTO);

    /* renamed from: a, reason: collision with root package name */
    public final float f23104a;

    /* renamed from: b, reason: collision with root package name */
    public final w f23105b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23106a;

        static {
            int[] iArr = new int[w.values().length];
            f23106a = iArr;
            try {
                iArr[w.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23106a[w.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23106a[w.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23106a[w.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public YogaValue(float f10, w wVar) {
        this.f23104a = f10;
        this.f23105b = wVar;
    }

    public static YogaValue a(String str) {
        if (str == null) {
            return null;
        }
        return "undefined".equals(str) ? f23101c : "auto".equals(str) ? f23103e : str.endsWith("%") ? new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), w.PERCENT) : new YogaValue(Float.parseFloat(str), w.POINT);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        w wVar = this.f23105b;
        if (wVar == yogaValue.f23105b) {
            return wVar == w.UNDEFINED || wVar == w.AUTO || Float.compare(this.f23104a, yogaValue.f23104a) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f23104a) + this.f23105b.intValue();
    }

    public String toString() {
        int i10 = a.f23106a[this.f23105b.ordinal()];
        if (i10 == 1) {
            return "undefined";
        }
        if (i10 == 2) {
            return Float.toString(this.f23104a);
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return this.f23104a + "%";
    }

    YogaValue(float f10, int i10) {
        this(f10, w.fromInt(i10));
    }
}
