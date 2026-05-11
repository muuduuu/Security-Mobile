package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class n extends RecyclerView.m {

    /* renamed from: g, reason: collision with root package name */
    boolean f17741g = true;

    public final void A(RecyclerView.F f10) {
        I(f10);
        h(f10);
    }

    public final void B(RecyclerView.F f10) {
        J(f10);
    }

    public final void C(RecyclerView.F f10, boolean z10) {
        K(f10, z10);
        h(f10);
    }

    public final void D(RecyclerView.F f10, boolean z10) {
        L(f10, z10);
    }

    public final void E(RecyclerView.F f10) {
        M(f10);
        h(f10);
    }

    public final void F(RecyclerView.F f10) {
        N(f10);
    }

    public final void G(RecyclerView.F f10) {
        O(f10);
        h(f10);
    }

    public final void H(RecyclerView.F f10) {
        P(f10);
    }

    public void I(RecyclerView.F f10) {
    }

    public void J(RecyclerView.F f10) {
    }

    public void K(RecyclerView.F f10, boolean z10) {
    }

    public void L(RecyclerView.F f10, boolean z10) {
    }

    public void M(RecyclerView.F f10) {
    }

    public void N(RecyclerView.F f10) {
    }

    public void O(RecyclerView.F f10) {
    }

    public void P(RecyclerView.F f10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.F f10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10;
        int i11;
        return (bVar == null || ((i10 = bVar.f17484a) == (i11 = bVar2.f17484a) && bVar.f17485b == bVar2.f17485b)) ? w(f10) : y(f10, i10, bVar.f17485b, i11, bVar2.f17485b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.F f10, RecyclerView.F f11, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f17484a;
        int i13 = bVar.f17485b;
        if (f11.L()) {
            int i14 = bVar.f17484a;
            i11 = bVar.f17485b;
            i10 = i14;
        } else {
            i10 = bVar2.f17484a;
            i11 = bVar2.f17485b;
        }
        return x(f10, f11, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.F f10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10 = bVar.f17484a;
        int i11 = bVar.f17485b;
        View view = f10.f17450a;
        int left = bVar2 == null ? view.getLeft() : bVar2.f17484a;
        int top = bVar2 == null ? view.getTop() : bVar2.f17485b;
        if (f10.x() || (i10 == left && i11 == top)) {
            return z(f10);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(f10, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.F f10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10 = bVar.f17484a;
        int i11 = bVar2.f17484a;
        if (i10 != i11 || bVar.f17485b != bVar2.f17485b) {
            return y(f10, i10, bVar.f17485b, i11, bVar2.f17485b);
        }
        E(f10);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.F f10) {
        return !this.f17741g || f10.v();
    }

    public abstract boolean w(RecyclerView.F f10);

    public abstract boolean x(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13);

    public abstract boolean y(RecyclerView.F f10, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.F f10);
}
