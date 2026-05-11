package t7;

import java.util.Map;
import java.util.Set;

/* renamed from: t7.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4764s implements InterfaceC4661d0 {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f43225a;

    /* renamed from: b, reason: collision with root package name */
    private transient Map f43226b;

    AbstractC4764s() {
    }

    @Override // t7.InterfaceC4661d0
    public final Map b() {
        Map map = this.f43226b;
        if (map != null) {
            return map;
        }
        Map d10 = d();
        this.f43226b = d10;
        return d10;
    }

    abstract Map d();

    abstract Set e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC4661d0) {
            return b().equals(((InterfaceC4661d0) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // t7.InterfaceC4661d0
    public final Set k() {
        Set set = this.f43225a;
        if (set != null) {
            return set;
        }
        Set e10 = e();
        this.f43225a = e10;
        return e10;
    }

    public final String toString() {
        return ((C4695i) b()).f42989c.toString();
    }
}
