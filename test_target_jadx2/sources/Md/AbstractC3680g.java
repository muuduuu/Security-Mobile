package md;

import Kc.G;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* renamed from: md.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3680g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37479a;

    public AbstractC3680g(Object obj) {
        this.f37479a = obj;
    }

    public abstract AbstractC5197E a(G g10);

    public Object b() {
        return this.f37479a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            Object b10 = b();
            AbstractC3680g abstractC3680g = obj instanceof AbstractC3680g ? (AbstractC3680g) obj : null;
            if (!Intrinsics.b(b10, abstractC3680g != null ? abstractC3680g.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object b10 = b();
        if (b10 != null) {
            return b10.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
