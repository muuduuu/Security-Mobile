package P5;

import D5.B;
import D5.z;
import K5.AbstractC0928i;
import R5.t;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected final D5.d f7468a;

    /* renamed from: b, reason: collision with root package name */
    protected final AbstractC0928i f7469b;

    /* renamed from: c, reason: collision with root package name */
    protected D5.o f7470c;

    /* renamed from: d, reason: collision with root package name */
    protected t f7471d;

    public a(D5.d dVar, AbstractC0928i abstractC0928i, D5.o oVar) {
        this.f7469b = abstractC0928i;
        this.f7468a = dVar;
        this.f7470c = oVar;
        if (oVar instanceof t) {
            this.f7471d = (t) oVar;
        }
    }

    public void a(z zVar) {
        this.f7469b.h(zVar.D(D5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public void b(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        Object m10 = this.f7469b.m(obj);
        if (m10 == null) {
            return;
        }
        if (!(m10 instanceof Map)) {
            b10.i(this.f7468a.getType(), String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", this.f7469b.c(), m10.getClass().getName()));
        }
        t tVar = this.f7471d;
        if (tVar != null) {
            tVar.P((Map) m10, fVar, b10);
        } else {
            this.f7470c.f(m10, fVar, b10);
        }
    }

    public void c(B b10) {
        D5.o oVar = this.f7470c;
        if (oVar instanceof i) {
            D5.o U10 = b10.U(oVar, this.f7468a);
            this.f7470c = U10;
            if (U10 instanceof t) {
                this.f7471d = (t) U10;
            }
        }
    }
}
