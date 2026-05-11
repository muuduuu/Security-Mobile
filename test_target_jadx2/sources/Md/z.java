package Md;

import Jd.C0899o;
import Od.AbstractC1075c;
import Od.D;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
final class z extends Nd.d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f6468a = new AtomicReference(null);

    @Override // Nd.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(x xVar) {
        D d10;
        if (AbstractC1075c.a(this.f6468a) != null) {
            return false;
        }
        AtomicReference atomicReference = this.f6468a;
        d10 = y.f6466a;
        AbstractC1075c.b(atomicReference, d10);
        return true;
    }

    public final Object e(kotlin.coroutines.d dVar) {
        D d10;
        C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
        c0899o.F();
        AtomicReference atomicReference = this.f6468a;
        d10 = y.f6466a;
        if (!androidx.camera.view.i.a(atomicReference, d10, c0899o)) {
            o.a aVar = lc.o.f37128b;
            c0899o.resumeWith(lc.o.b(Unit.f36324a));
        }
        Object y10 = c0899o.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10 == AbstractC3868b.e() ? y10 : Unit.f36324a;
    }

    @Override // Nd.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.d[] b(x xVar) {
        AbstractC1075c.b(this.f6468a, null);
        return Nd.c.f6747a;
    }

    public final void g() {
        D d10;
        D d11;
        D d12;
        D d13;
        AtomicReference atomicReference = this.f6468a;
        while (true) {
            Object a10 = AbstractC1075c.a(atomicReference);
            if (a10 == null) {
                return;
            }
            d10 = y.f6467b;
            if (a10 == d10) {
                return;
            }
            d11 = y.f6466a;
            if (a10 == d11) {
                AtomicReference atomicReference2 = this.f6468a;
                d12 = y.f6467b;
                if (androidx.camera.view.i.a(atomicReference2, a10, d12)) {
                    return;
                }
            } else {
                AtomicReference atomicReference3 = this.f6468a;
                d13 = y.f6466a;
                if (androidx.camera.view.i.a(atomicReference3, a10, d13)) {
                    o.a aVar = lc.o.f37128b;
                    ((C0899o) a10).resumeWith(lc.o.b(Unit.f36324a));
                    return;
                }
            }
        }
    }

    public final boolean h() {
        D d10;
        D d11;
        AtomicReference atomicReference = this.f6468a;
        d10 = y.f6466a;
        Object andSet = atomicReference.getAndSet(d10);
        Intrinsics.d(andSet);
        d11 = y.f6467b;
        return andSet == d11;
    }
}
