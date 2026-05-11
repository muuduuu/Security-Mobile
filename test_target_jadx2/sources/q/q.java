package Q;

import C.InterfaceC0733k;
import Q.h;
import androidx.camera.core.impl.AbstractC1445k0;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.T;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class q extends AbstractC1445k0 {

    /* renamed from: c, reason: collision with root package name */
    private final h.a f7834c;

    q(D d10, h.a aVar) {
        super(d10);
        this.f7834c = aVar;
    }

    private int s(T t10) {
        Integer num = (Integer) t10.g().f(T.f14454j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int t(T t10) {
        Integer num = (Integer) t10.g().f(T.f14453i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h8.d u(h8.d dVar, InterfaceC0733k interfaceC0733k) {
        return ((InterfaceC0733k) dVar.get()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h8.d v(List list, Void r42) {
        return this.f7834c.a(s((T) list.get(0)), t((T) list.get(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h8.d w(h8.d dVar, Void r12) {
        return ((InterfaceC0733k) dVar.get()).b();
    }

    @Override // androidx.camera.core.impl.AbstractC1445k0, androidx.camera.core.impl.D
    public h8.d c(final List list, int i10, int i11) {
        y0.f.b(list.size() == 1, "Only support one capture config.");
        final h8.d j10 = j(i10, i11);
        return G.n.k(Collections.singletonList(G.d.a(j10).f(new G.a() { // from class: Q.n
            @Override // G.a
            public final h8.d apply(Object obj) {
                h8.d u10;
                u10 = q.u(h8.d.this, (InterfaceC0733k) obj);
                return u10;
            }
        }, F.c.b()).f(new G.a() { // from class: Q.o
            @Override // G.a
            public final h8.d apply(Object obj) {
                h8.d v10;
                v10 = q.this.v(list, (Void) obj);
                return v10;
            }
        }, F.c.b()).f(new G.a() { // from class: Q.p
            @Override // G.a
            public final h8.d apply(Object obj) {
                h8.d w10;
                w10 = q.w(h8.d.this, (Void) obj);
                return w10;
            }
        }, F.c.b())));
    }
}
