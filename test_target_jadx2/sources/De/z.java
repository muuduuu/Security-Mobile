package De;

import Td.F;
import Td.G;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class z<T> {

    /* renamed from: a, reason: collision with root package name */
    private final F f1797a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1798b;

    /* renamed from: c, reason: collision with root package name */
    private final G f1799c;

    private z(F f10, Object obj, G g10) {
        this.f1797a = f10;
        this.f1798b = obj;
        this.f1799c = g10;
    }

    public static z c(G g10, F f10) {
        Objects.requireNonNull(g10, "body == null");
        Objects.requireNonNull(f10, "rawResponse == null");
        if (f10.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new z(f10, null, g10);
    }

    public static z h(Object obj, F f10) {
        Objects.requireNonNull(f10, "rawResponse == null");
        if (f10.isSuccessful()) {
            return new z(f10, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public Object a() {
        return this.f1798b;
    }

    public int b() {
        return this.f1797a.f();
    }

    public G d() {
        return this.f1799c;
    }

    public Td.v e() {
        return this.f1797a.p();
    }

    public boolean f() {
        return this.f1797a.isSuccessful();
    }

    public String g() {
        return this.f1797a.r();
    }

    public String toString() {
        return this.f1797a.toString();
    }
}
