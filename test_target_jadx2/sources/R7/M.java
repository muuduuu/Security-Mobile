package r7;

import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class M implements InterfaceC4259x0 {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f39507a;

    /* renamed from: b, reason: collision with root package name */
    private transient Map f39508b;

    M() {
    }

    abstract Map b();

    abstract Set d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC4259x0) {
            return q().equals(((InterfaceC4259x0) obj).q());
        }
        return false;
    }

    public final int hashCode() {
        return q().hashCode();
    }

    @Override // r7.InterfaceC4259x0
    public final Map q() {
        Map map = this.f39508b;
        if (map != null) {
            return map;
        }
        Map b10 = b();
        this.f39508b = b10;
        return b10;
    }

    public final String toString() {
        return q().toString();
    }

    @Override // r7.InterfaceC4259x0
    public final Set w() {
        Set set = this.f39507a;
        if (set != null) {
            return set;
        }
        Set d10 = d();
        this.f39507a = d10;
        return d10;
    }
}
