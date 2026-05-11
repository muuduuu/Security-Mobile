package P8;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class g extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f7591a;

    public g(String str) {
        this.f7591a = str;
    }

    private BigDecimal a() {
        return i.b(this.f7591a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f7591a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f7591a.equals(((g) obj).f7591a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f7591a);
    }

    public int hashCode() {
        return this.f7591a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f7591a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f7591a);
            }
        } catch (NumberFormatException unused2) {
            return a().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f7591a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f7591a;
    }
}
