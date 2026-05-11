package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class k extends o {

    /* renamed from: d, reason: collision with root package name */
    private j f17734d;

    /* renamed from: e, reason: collision with root package name */
    private j f17735e;

    class a extends h {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.A
        protected void o(View view, RecyclerView.B b10, RecyclerView.A.a aVar) {
            k kVar = k.this;
            int[] c10 = kVar.c(kVar.f17742a.getLayoutManager(), view);
            int i10 = c10[0];
            int i11 = c10[1];
            int w10 = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (w10 > 0) {
                aVar.d(i10, i11, w10, this.f17723j);
            }
        }

        @Override // androidx.recyclerview.widget.h
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.h
        protected int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int k(View view, j jVar) {
        return (jVar.g(view) + (jVar.e(view) / 2)) - (jVar.m() + (jVar.n() / 2));
    }

    private View l(RecyclerView.p pVar, j jVar) {
        int J10 = pVar.J();
        View view = null;
        if (J10 == 0) {
            return null;
        }
        int m10 = jVar.m() + (jVar.n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < J10; i11++) {
            View I10 = pVar.I(i11);
            int abs = Math.abs((jVar.g(I10) + (jVar.e(I10) / 2)) - m10);
            if (abs < i10) {
                view = I10;
                i10 = abs;
            }
        }
        return view;
    }

    private j m(RecyclerView.p pVar) {
        j jVar = this.f17735e;
        if (jVar == null || jVar.f17731a != pVar) {
            this.f17735e = j.a(pVar);
        }
        return this.f17735e;
    }

    private j n(RecyclerView.p pVar) {
        if (pVar.l()) {
            return o(pVar);
        }
        if (pVar.k()) {
            return m(pVar);
        }
        return null;
    }

    private j o(RecyclerView.p pVar) {
        j jVar = this.f17734d;
        if (jVar == null || jVar.f17731a != pVar) {
            this.f17734d = j.c(pVar);
        }
        return this.f17734d;
    }

    private boolean p(RecyclerView.p pVar, int i10, int i11) {
        return pVar.k() ? i10 > 0 : i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean q(RecyclerView.p pVar) {
        PointF a10;
        int Y10 = pVar.Y();
        if (!(pVar instanceof RecyclerView.A.b) || (a10 = ((RecyclerView.A.b) pVar).a(Y10 - 1)) == null) {
            return false;
        }
        return a10.x < 0.0f || a10.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.o
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.k()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.l()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o
    protected RecyclerView.A d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.A.b) {
            return new a(this.f17742a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o
    public View f(RecyclerView.p pVar) {
        if (pVar.l()) {
            return l(pVar, o(pVar));
        }
        if (pVar.k()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o
    public int g(RecyclerView.p pVar, int i10, int i11) {
        j n10;
        int Y10 = pVar.Y();
        if (Y10 == 0 || (n10 = n(pVar)) == null) {
            return -1;
        }
        int J10 = pVar.J();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < J10; i14++) {
            View I10 = pVar.I(i14);
            if (I10 != null) {
                int k10 = k(I10, n10);
                if (k10 <= 0 && k10 > i13) {
                    view2 = I10;
                    i13 = k10;
                }
                if (k10 >= 0 && k10 < i12) {
                    view = I10;
                    i12 = k10;
                }
            }
        }
        boolean p10 = p(pVar, i10, i11);
        if (p10 && view != null) {
            return pVar.h0(view);
        }
        if (!p10 && view2 != null) {
            return pVar.h0(view2);
        }
        if (p10) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int h02 = pVar.h0(view) + (q(pVar) == p10 ? -1 : 1);
        if (h02 < 0 || h02 >= Y10) {
            return -1;
        }
        return h02;
    }
}
