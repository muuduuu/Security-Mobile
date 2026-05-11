package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class o extends RecyclerView.s {

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f17742a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f17743b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView.u f17744c = new a();

    class a extends RecyclerView.u {

        /* renamed from: a, reason: collision with root package name */
        boolean f17745a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f17745a) {
                this.f17745a = false;
                o.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f17745a = true;
        }
    }

    private void e() {
        this.f17742a.i1(this.f17744c);
        this.f17742a.setOnFlingListener(null);
    }

    private void h() {
        if (this.f17742a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f17742a.n(this.f17744c);
        this.f17742a.setOnFlingListener(this);
    }

    private boolean i(RecyclerView.p pVar, int i10, int i11) {
        RecyclerView.A d10;
        int g10;
        if (!(pVar instanceof RecyclerView.A.b) || (d10 = d(pVar)) == null || (g10 = g(pVar, i10, i11)) == -1) {
            return false;
        }
        d10.p(g10);
        pVar.J1(d10);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i10, int i11) {
        RecyclerView.p layoutManager = this.f17742a.getLayoutManager();
        if (layoutManager == null || this.f17742a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f17742a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f17742a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f17742a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f17743b = new Scroller(this.f17742a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    protected abstract RecyclerView.A d(RecyclerView.p pVar);

    public abstract View f(RecyclerView.p pVar);

    public abstract int g(RecyclerView.p pVar, int i10, int i11);

    void j() {
        RecyclerView.p layoutManager;
        View f10;
        RecyclerView recyclerView = this.f17742a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f10 = f(layoutManager)) == null) {
            return;
        }
        int[] c10 = c(layoutManager, f10);
        int i10 = c10[0];
        if (i10 == 0 && c10[1] == 0) {
            return;
        }
        this.f17742a.w1(i10, c10[1]);
    }
}
