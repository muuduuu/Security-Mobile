package yd;

import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5210l implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private int f45547a;

    private final boolean h(InterfaceC0936h interfaceC0936h) {
        return (kotlin.reflect.jvm.internal.impl.types.error.k.m(interfaceC0936h) || kd.f.E(interfaceC0936h)) ? false : true;
    }

    @Override // yd.e0
    public abstract InterfaceC0936h d();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0) || obj.hashCode() != hashCode()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.c().size() != c().size()) {
            return false;
        }
        InterfaceC0936h d10 = d();
        InterfaceC0936h d11 = e0Var.d();
        if (d11 != null && h(d10) && h(d11)) {
            return i(d11);
        }
        return false;
    }

    protected final boolean g(InterfaceC0936h first, InterfaceC0936h second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (!Intrinsics.b(first.getName(), second.getName())) {
            return false;
        }
        InterfaceC0941m b10 = first.b();
        for (InterfaceC0941m b11 = second.b(); b10 != null && b11 != null; b11 = b11.b()) {
            if (b10 instanceof Kc.G) {
                return b11 instanceof Kc.G;
            }
            if (b11 instanceof Kc.G) {
                return false;
            }
            if (b10 instanceof Kc.K) {
                return (b11 instanceof Kc.K) && Intrinsics.b(((Kc.K) b10).e(), ((Kc.K) b11).e());
            }
            if ((b11 instanceof Kc.K) || !Intrinsics.b(b10.getName(), b11.getName())) {
                return false;
            }
            b10 = b10.b();
        }
        return true;
    }

    public int hashCode() {
        int i10 = this.f45547a;
        if (i10 != 0) {
            return i10;
        }
        InterfaceC0936h d10 = d();
        int hashCode = h(d10) ? kd.f.m(d10).hashCode() : System.identityHashCode(this);
        this.f45547a = hashCode;
        return hashCode;
    }

    protected abstract boolean i(InterfaceC0936h interfaceC0936h);
}
