package yd;

/* loaded from: classes3.dex */
public abstract class j0 implements i0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return c() == i0Var.c() && a() == i0Var.a() && getType().equals(i0Var.getType());
    }

    public int hashCode() {
        int hashCode = a().hashCode();
        if (q0.w(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (c() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (c()) {
            return "*";
        }
        if (a() == u0.INVARIANT) {
            return getType().toString();
        }
        return a() + " " + getType();
    }
}
