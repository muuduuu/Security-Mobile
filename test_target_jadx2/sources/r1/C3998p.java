package r1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import r1.AbstractC3994l;

/* renamed from: r1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3998p extends AbstractC3994l {

    /* renamed from: X, reason: collision with root package name */
    int f39094X;

    /* renamed from: J, reason: collision with root package name */
    private ArrayList f39092J = new ArrayList();

    /* renamed from: K, reason: collision with root package name */
    private boolean f39093K = true;

    /* renamed from: Y, reason: collision with root package name */
    boolean f39095Y = false;

    /* renamed from: Z, reason: collision with root package name */
    private int f39096Z = 0;

    /* renamed from: r1.p$a */
    class a extends AbstractC3995m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3994l f39097a;

        a(AbstractC3994l abstractC3994l) {
            this.f39097a = abstractC3994l;
        }

        @Override // r1.AbstractC3994l.f
        public void a(AbstractC3994l abstractC3994l) {
            this.f39097a.c0();
            abstractC3994l.Y(this);
        }
    }

    /* renamed from: r1.p$b */
    static class b extends AbstractC3995m {

        /* renamed from: a, reason: collision with root package name */
        C3998p f39099a;

        b(C3998p c3998p) {
            this.f39099a = c3998p;
        }

        @Override // r1.AbstractC3994l.f
        public void a(AbstractC3994l abstractC3994l) {
            C3998p c3998p = this.f39099a;
            int i10 = c3998p.f39094X - 1;
            c3998p.f39094X = i10;
            if (i10 == 0) {
                c3998p.f39095Y = false;
                c3998p.w();
            }
            abstractC3994l.Y(this);
        }

        @Override // r1.AbstractC3995m, r1.AbstractC3994l.f
        public void b(AbstractC3994l abstractC3994l) {
            C3998p c3998p = this.f39099a;
            if (c3998p.f39095Y) {
                return;
            }
            c3998p.j0();
            this.f39099a.f39095Y = true;
        }
    }

    private void o0(AbstractC3994l abstractC3994l) {
        this.f39092J.add(abstractC3994l);
        abstractC3994l.f39068r = this;
    }

    private void x0() {
        b bVar = new b(this);
        Iterator it = this.f39092J.iterator();
        while (it.hasNext()) {
            ((AbstractC3994l) it.next()).a(bVar);
        }
        this.f39094X = this.f39092J.size();
    }

    @Override // r1.AbstractC3994l
    public void W(View view) {
        super.W(view);
        int size = this.f39092J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC3994l) this.f39092J.get(i10)).W(view);
        }
    }

    @Override // r1.AbstractC3994l
    public void a0(View view) {
        super.a0(view);
        int size = this.f39092J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC3994l) this.f39092J.get(i10)).a0(view);
        }
    }

    @Override // r1.AbstractC3994l
    protected void c0() {
        if (this.f39092J.isEmpty()) {
            j0();
            w();
            return;
        }
        x0();
        if (this.f39093K) {
            Iterator it = this.f39092J.iterator();
            while (it.hasNext()) {
                ((AbstractC3994l) it.next()).c0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f39092J.size(); i10++) {
            ((AbstractC3994l) this.f39092J.get(i10 - 1)).a(new a((AbstractC3994l) this.f39092J.get(i10)));
        }
        AbstractC3994l abstractC3994l = (AbstractC3994l) this.f39092J.get(0);
        if (abstractC3994l != null) {
            abstractC3994l.c0();
        }
    }

    @Override // r1.AbstractC3994l
    public void e0(AbstractC3994l.e eVar) {
        super.e0(eVar);
        this.f39096Z |= 8;
        int size = this.f39092J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC3994l) this.f39092J.get(i10)).e0(eVar);
        }
    }

    @Override // r1.AbstractC3994l
    public void g0(AbstractC3989g abstractC3989g) {
        super.g0(abstractC3989g);
        this.f39096Z |= 4;
        if (this.f39092J != null) {
            for (int i10 = 0; i10 < this.f39092J.size(); i10++) {
                ((AbstractC3994l) this.f39092J.get(i10)).g0(abstractC3989g);
            }
        }
    }

    @Override // r1.AbstractC3994l
    public void h0(AbstractC3997o abstractC3997o) {
        super.h0(abstractC3997o);
        this.f39096Z |= 2;
        int size = this.f39092J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC3994l) this.f39092J.get(i10)).h0(abstractC3997o);
        }
    }

    @Override // r1.AbstractC3994l
    public void k(s sVar) {
        if (P(sVar.f39104b)) {
            Iterator it = this.f39092J.iterator();
            while (it.hasNext()) {
                AbstractC3994l abstractC3994l = (AbstractC3994l) it.next();
                if (abstractC3994l.P(sVar.f39104b)) {
                    abstractC3994l.k(sVar);
                    sVar.f39105c.add(abstractC3994l);
                }
            }
        }
    }

    @Override // r1.AbstractC3994l
    String k0(String str) {
        String k02 = super.k0(str);
        for (int i10 = 0; i10 < this.f39092J.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(k02);
            sb2.append("\n");
            sb2.append(((AbstractC3994l) this.f39092J.get(i10)).k0(str + "  "));
            k02 = sb2.toString();
        }
        return k02;
    }

    @Override // r1.AbstractC3994l
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C3998p a(AbstractC3994l.f fVar) {
        return (C3998p) super.a(fVar);
    }

    @Override // r1.AbstractC3994l
    void m(s sVar) {
        super.m(sVar);
        int size = this.f39092J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC3994l) this.f39092J.get(i10)).m(sVar);
        }
    }

    @Override // r1.AbstractC3994l
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C3998p b(View view) {
        for (int i10 = 0; i10 < this.f39092J.size(); i10++) {
            ((AbstractC3994l) this.f39092J.get(i10)).b(view);
        }
        return (C3998p) super.b(view);
    }

    @Override // r1.AbstractC3994l
    public void n(s sVar) {
        if (P(sVar.f39104b)) {
            Iterator it = this.f39092J.iterator();
            while (it.hasNext()) {
                AbstractC3994l abstractC3994l = (AbstractC3994l) it.next();
                if (abstractC3994l.P(sVar.f39104b)) {
                    abstractC3994l.n(sVar);
                    sVar.f39105c.add(abstractC3994l);
                }
            }
        }
    }

    public C3998p n0(AbstractC3994l abstractC3994l) {
        o0(abstractC3994l);
        long j10 = this.f39053c;
        if (j10 >= 0) {
            abstractC3994l.d0(j10);
        }
        if ((this.f39096Z & 1) != 0) {
            abstractC3994l.f0(z());
        }
        if ((this.f39096Z & 2) != 0) {
            D();
            abstractC3994l.h0(null);
        }
        if ((this.f39096Z & 4) != 0) {
            abstractC3994l.g0(C());
        }
        if ((this.f39096Z & 8) != 0) {
            abstractC3994l.e0(y());
        }
        return this;
    }

    public AbstractC3994l p0(int i10) {
        if (i10 < 0 || i10 >= this.f39092J.size()) {
            return null;
        }
        return (AbstractC3994l) this.f39092J.get(i10);
    }

    @Override // r1.AbstractC3994l
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC3994l clone() {
        C3998p c3998p = (C3998p) super.clone();
        c3998p.f39092J = new ArrayList();
        int size = this.f39092J.size();
        for (int i10 = 0; i10 < size; i10++) {
            c3998p.o0(((AbstractC3994l) this.f39092J.get(i10)).clone());
        }
        return c3998p;
    }

    public int q0() {
        return this.f39092J.size();
    }

    @Override // r1.AbstractC3994l
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C3998p Y(AbstractC3994l.f fVar) {
        return (C3998p) super.Y(fVar);
    }

    @Override // r1.AbstractC3994l
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C3998p Z(View view) {
        for (int i10 = 0; i10 < this.f39092J.size(); i10++) {
            ((AbstractC3994l) this.f39092J.get(i10)).Z(view);
        }
        return (C3998p) super.Z(view);
    }

    @Override // r1.AbstractC3994l
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C3998p d0(long j10) {
        ArrayList arrayList;
        super.d0(j10);
        if (this.f39053c >= 0 && (arrayList = this.f39092J) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC3994l) this.f39092J.get(i10)).d0(j10);
            }
        }
        return this;
    }

    @Override // r1.AbstractC3994l
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C3998p f0(TimeInterpolator timeInterpolator) {
        this.f39096Z |= 1;
        ArrayList arrayList = this.f39092J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC3994l) this.f39092J.get(i10)).f0(timeInterpolator);
            }
        }
        return (C3998p) super.f0(timeInterpolator);
    }

    @Override // r1.AbstractC3994l
    protected void v(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        long G10 = G();
        int size = this.f39092J.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC3994l abstractC3994l = (AbstractC3994l) this.f39092J.get(i10);
            if (G10 > 0 && (this.f39093K || i10 == 0)) {
                long G11 = abstractC3994l.G();
                if (G11 > 0) {
                    abstractC3994l.i0(G11 + G10);
                } else {
                    abstractC3994l.i0(G10);
                }
            }
            abstractC3994l.v(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public C3998p v0(int i10) {
        if (i10 == 0) {
            this.f39093K = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
            }
            this.f39093K = false;
        }
        return this;
    }

    @Override // r1.AbstractC3994l
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public C3998p i0(long j10) {
        return (C3998p) super.i0(j10);
    }
}
