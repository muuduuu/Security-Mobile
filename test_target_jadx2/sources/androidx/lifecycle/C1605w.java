package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import n.C3701b;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1605w extends C1607y {

    /* renamed from: l, reason: collision with root package name */
    private C3701b f17173l = new C3701b();

    /* renamed from: androidx.lifecycle.w$a */
    private static class a implements InterfaceC1608z {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC1604v f17174a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC1608z f17175b;

        /* renamed from: c, reason: collision with root package name */
        int f17176c = -1;

        a(AbstractC1604v abstractC1604v, InterfaceC1608z interfaceC1608z) {
            this.f17174a = abstractC1604v;
            this.f17175b = interfaceC1608z;
        }

        void a() {
            this.f17174a.j(this);
        }

        @Override // androidx.lifecycle.InterfaceC1608z
        public void b(Object obj) {
            if (this.f17176c != this.f17174a.g()) {
                this.f17176c = this.f17174a.g();
                this.f17175b.b(obj);
            }
        }

        void c() {
            this.f17174a.n(this);
        }
    }

    @Override // androidx.lifecycle.AbstractC1604v
    protected void k() {
        Iterator it = this.f17173l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).a();
        }
    }

    @Override // androidx.lifecycle.AbstractC1604v
    protected void l() {
        Iterator it = this.f17173l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).c();
        }
    }

    public void p(AbstractC1604v abstractC1604v, InterfaceC1608z interfaceC1608z) {
        if (abstractC1604v == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar = new a(abstractC1604v, interfaceC1608z);
        a aVar2 = (a) this.f17173l.r(abstractC1604v, aVar);
        if (aVar2 != null && aVar2.f17175b != interfaceC1608z) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar2 == null && h()) {
            aVar.a();
        }
    }

    public void q(AbstractC1604v abstractC1604v) {
        a aVar = (a) this.f17173l.t(abstractC1604v);
        if (aVar != null) {
            aVar.c();
        }
    }
}
