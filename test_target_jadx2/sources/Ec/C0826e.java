package Ec;

import Kc.InterfaceC0952y;
import Kc.U;
import Mc.AbstractC0986l;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ec.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0826e extends AbstractC0986l {

    /* renamed from: a, reason: collision with root package name */
    private final n f1970a;

    public C0826e(n container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f1970a = container;
    }

    @Override // Mc.AbstractC0986l, Kc.InterfaceC0943o
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC0831j a(InterfaceC0952y descriptor, Unit data) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        return new o(this.f1970a, descriptor);
    }

    @Override // Kc.InterfaceC0943o
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC0831j l(U descriptor, Unit data) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        int i10 = (descriptor.l0() != null ? 1 : 0) + (descriptor.s0() != null ? 1 : 0);
        if (descriptor.q0()) {
            if (i10 == 0) {
                return new p(this.f1970a, descriptor);
            }
            if (i10 == 1) {
                return new q(this.f1970a, descriptor);
            }
            if (i10 == 2) {
                return new r(this.f1970a, descriptor);
            }
        } else {
            if (i10 == 0) {
                return new v(this.f1970a, descriptor);
            }
            if (i10 == 1) {
                return new w(this.f1970a, descriptor);
            }
            if (i10 == 2) {
                return new x(this.f1970a, descriptor);
            }
        }
        throw new D("Unsupported property: " + descriptor);
    }
}
