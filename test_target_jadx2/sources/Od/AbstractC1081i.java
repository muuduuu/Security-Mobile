package Od;

import Jd.AbstractC0882f0;
import Jd.InterfaceC0915w0;
import Jd.Q0;
import Jd.T0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import lc.o;

/* renamed from: Od.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1081i {

    /* renamed from: a, reason: collision with root package name */
    private static final D f7325a = new D("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final D f7326b = new D("REUSABLE_CLAIMED");

    public static final void b(kotlin.coroutines.d dVar, Object obj) {
        if (!(dVar instanceof C1080h)) {
            dVar.resumeWith(obj);
            return;
        }
        C1080h c1080h = (C1080h) dVar;
        Object b10 = Jd.D.b(obj);
        if (c1080h.f7321d.y(c1080h.getContext())) {
            c1080h.f7323f = b10;
            c1080h.f5021c = 1;
            c1080h.f7321d.s(c1080h.getContext(), c1080h);
            return;
        }
        AbstractC0882f0 b11 = Q0.f5006a.b();
        if (b11.i1()) {
            c1080h.f7323f = b10;
            c1080h.f5021c = 1;
            b11.O0(c1080h);
            return;
        }
        b11.a1(true);
        try {
            InterfaceC0915w0 interfaceC0915w0 = (InterfaceC0915w0) c1080h.getContext().a(InterfaceC0915w0.f5070O);
            if (interfaceC0915w0 == null || interfaceC0915w0.b()) {
                kotlin.coroutines.d dVar2 = c1080h.f7322e;
                Object obj2 = c1080h.f7324g;
                CoroutineContext context = dVar2.getContext();
                Object i10 = K.i(context, obj2);
                T0 m10 = i10 != K.f7306a ? Jd.H.m(dVar2, context, i10) : null;
                try {
                    c1080h.f7322e.resumeWith(obj);
                    Unit unit = Unit.f36324a;
                } finally {
                    if (m10 == null || m10.V0()) {
                        K.f(context, i10);
                    }
                }
            } else {
                CancellationException p10 = interfaceC0915w0.p();
                c1080h.a(b10, p10);
                o.a aVar = lc.o.f37128b;
                c1080h.resumeWith(lc.o.b(lc.p.a(p10)));
            }
            while (b11.o1()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final boolean c(C1080h c1080h) {
        Unit unit = Unit.f36324a;
        AbstractC0882f0 b10 = Q0.f5006a.b();
        if (b10.l1()) {
            return false;
        }
        if (b10.i1()) {
            c1080h.f7323f = unit;
            c1080h.f5021c = 1;
            b10.O0(c1080h);
            return true;
        }
        b10.a1(true);
        try {
            c1080h.run();
            do {
            } while (b10.o1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
