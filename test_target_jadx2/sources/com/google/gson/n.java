package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class n extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Object f28657a;

    public n(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f28657a = bool;
    }

    private static boolean G(n nVar) {
        Object obj = nVar.f28657a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean A() {
        return F() ? ((Boolean) this.f28657a).booleanValue() : Boolean.parseBoolean(E());
    }

    public double B() {
        return I() ? D().doubleValue() : Double.parseDouble(E());
    }

    public Number D() {
        Object obj = this.f28657a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new P8.g((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String E() {
        Object obj = this.f28657a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (I()) {
            return D().toString();
        }
        if (F()) {
            return ((Boolean) this.f28657a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f28657a.getClass());
    }

    public boolean F() {
        return this.f28657a instanceof Boolean;
    }

    public boolean I() {
        return this.f28657a instanceof Number;
    }

    public boolean J() {
        return this.f28657a instanceof String;
    }

    @Override // com.google.gson.h
    public int c() {
        return I() ? D().intValue() : Integer.parseInt(E());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f28657a == null) {
            return nVar.f28657a == null;
        }
        if (G(this) && G(nVar)) {
            return ((this.f28657a instanceof BigInteger) || (nVar.f28657a instanceof BigInteger)) ? w().equals(nVar.w()) : D().longValue() == nVar.D().longValue();
        }
        Object obj2 = this.f28657a;
        if (obj2 instanceof Number) {
            Object obj3 = nVar.f28657a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return v().compareTo(nVar.v()) == 0;
                }
                double B10 = B();
                double B11 = nVar.B();
                if (B10 != B11) {
                    return Double.isNaN(B10) && Double.isNaN(B11);
                }
                return true;
            }
        }
        return obj2.equals(nVar.f28657a);
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f28657a == null) {
            return 31;
        }
        if (G(this)) {
            doubleToLongBits = D().longValue();
        } else {
            Object obj = this.f28657a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(D().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // com.google.gson.h
    public long k() {
        return I() ? D().longValue() : Long.parseLong(E());
    }

    public BigDecimal v() {
        Object obj = this.f28657a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : P8.i.b(E());
    }

    public BigInteger w() {
        Object obj = this.f28657a;
        return obj instanceof BigInteger ? (BigInteger) obj : G(this) ? BigInteger.valueOf(D().longValue()) : P8.i.c(E());
    }

    public n(Number number) {
        Objects.requireNonNull(number);
        this.f28657a = number;
    }

    public n(String str) {
        Objects.requireNonNull(str);
        this.f28657a = str;
    }
}
