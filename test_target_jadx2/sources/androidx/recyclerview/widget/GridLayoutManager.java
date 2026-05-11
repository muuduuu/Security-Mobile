package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import z0.C5228A;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I, reason: collision with root package name */
    boolean f17265I;

    /* renamed from: J, reason: collision with root package name */
    int f17266J;

    /* renamed from: K, reason: collision with root package name */
    int[] f17267K;

    /* renamed from: L, reason: collision with root package name */
    View[] f17268L;

    /* renamed from: M, reason: collision with root package name */
    final SparseIntArray f17269M;

    /* renamed from: N, reason: collision with root package name */
    final SparseIntArray f17270N;

    /* renamed from: O, reason: collision with root package name */
    c f17271O;

    /* renamed from: P, reason: collision with root package name */
    final Rect f17272P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f17273Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f17276a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f17277b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f17278c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f17279d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f17279d) {
                return d(i10, i11);
            }
            int i12 = this.f17277b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int d10 = d(i10, i11);
            this.f17277b.put(i10, d10);
            return d10;
        }

        int c(int i10, int i11) {
            if (!this.f17278c) {
                return e(i10, i11);
            }
            int i12 = this.f17276a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int e10 = e(i10, i11);
            this.f17276a.put(i10, e10);
            return e10;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int a10;
            if (!this.f17279d || (a10 = a(this.f17277b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            } else {
                i12 = this.f17277b.get(a10);
                i13 = a10 + 1;
                i14 = c(a10, i11) + f(a10);
                if (i14 == i11) {
                    i12++;
                    i14 = 0;
                }
            }
            int f10 = f(i10);
            while (i13 < i10) {
                int f11 = f(i13);
                i14 += f11;
                if (i14 == i11) {
                    i12++;
                    i14 = 0;
                } else if (i14 > i11) {
                    i12++;
                    i14 = f11;
                }
                i13++;
            }
            return i14 + f10 > i11 ? i12 + 1 : i12;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f17277b.clear();
        }

        public void h() {
            this.f17276a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f17265I = false;
        this.f17266J = -1;
        this.f17269M = new SparseIntArray();
        this.f17270N = new SparseIntArray();
        this.f17271O = new a();
        this.f17272P = new Rect();
        Z2(RecyclerView.p.i0(context, attributeSet, i10, i11).f17510b);
    }

    private void J2(RecyclerView.w wVar, RecyclerView.B b10, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.f17268L[i11];
            b bVar = (b) view.getLayoutParams();
            int V22 = V2(wVar, b10, h0(view));
            bVar.f17275f = V22;
            bVar.f17274e = i14;
            i14 += V22;
            i11 += i13;
        }
    }

    private void K2() {
        int J10 = J();
        for (int i10 = 0; i10 < J10; i10++) {
            b bVar = (b) I(i10).getLayoutParams();
            int a10 = bVar.a();
            this.f17269M.put(a10, bVar.f());
            this.f17270N.put(a10, bVar.e());
        }
    }

    private void L2(int i10) {
        this.f17267K = M2(this.f17267K, this.f17266J, i10);
    }

    static int[] M2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void N2() {
        this.f17269M.clear();
        this.f17270N.clear();
    }

    private int O2(RecyclerView.B b10) {
        if (J() != 0 && b10.b() != 0) {
            T1();
            boolean n22 = n2();
            View X12 = X1(!n22, true);
            View W12 = W1(!n22, true);
            if (X12 != null && W12 != null) {
                int b11 = this.f17271O.b(h0(X12), this.f17266J);
                int b12 = this.f17271O.b(h0(W12), this.f17266J);
                int max = this.f17293x ? Math.max(0, ((this.f17271O.b(b10.b() - 1, this.f17266J) + 1) - Math.max(b11, b12)) - 1) : Math.max(0, Math.min(b11, b12));
                if (n22) {
                    return Math.round((max * (Math.abs(this.f17290u.d(W12) - this.f17290u.g(X12)) / ((this.f17271O.b(h0(W12), this.f17266J) - this.f17271O.b(h0(X12), this.f17266J)) + 1))) + (this.f17290u.m() - this.f17290u.g(X12)));
                }
                return max;
            }
        }
        return 0;
    }

    private int P2(RecyclerView.B b10) {
        if (J() != 0 && b10.b() != 0) {
            T1();
            View X12 = X1(!n2(), true);
            View W12 = W1(!n2(), true);
            if (X12 != null && W12 != null) {
                if (!n2()) {
                    return this.f17271O.b(b10.b() - 1, this.f17266J) + 1;
                }
                int d10 = this.f17290u.d(W12) - this.f17290u.g(X12);
                int b11 = this.f17271O.b(h0(X12), this.f17266J);
                return (int) ((d10 / ((this.f17271O.b(h0(W12), this.f17266J) - b11) + 1)) * (this.f17271O.b(b10.b() - 1, this.f17266J) + 1));
            }
        }
        return 0;
    }

    private void Q2(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int U22 = U2(wVar, b10, aVar.f17297b);
        if (z10) {
            while (U22 > 0) {
                int i11 = aVar.f17297b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f17297b = i12;
                U22 = U2(wVar, b10, i12);
            }
            return;
        }
        int b11 = b10.b() - 1;
        int i13 = aVar.f17297b;
        while (i13 < b11) {
            int i14 = i13 + 1;
            int U23 = U2(wVar, b10, i14);
            if (U23 <= U22) {
                break;
            }
            i13 = i14;
            U22 = U23;
        }
        aVar.f17297b = i13;
    }

    private void R2() {
        View[] viewArr = this.f17268L;
        if (viewArr == null || viewArr.length != this.f17266J) {
            this.f17268L = new View[this.f17266J];
        }
    }

    private int T2(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f17271O.b(i10, this.f17266J);
        }
        int f10 = wVar.f(i10);
        if (f10 != -1) {
            return this.f17271O.b(f10, this.f17266J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    private int U2(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f17271O.c(i10, this.f17266J);
        }
        int i11 = this.f17270N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = wVar.f(i10);
        if (f10 != -1) {
            return this.f17271O.c(f10, this.f17266J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    private int V2(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f17271O.f(i10);
        }
        int i11 = this.f17269M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = wVar.f(i10);
        if (f10 != -1) {
            return this.f17271O.f(f10);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    private void W2(float f10, int i10) {
        L2(Math.max(Math.round(f10 * this.f17266J), i10));
    }

    private void X2(View view, int i10, boolean z10) {
        int i11;
        int i12;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f17514b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int S22 = S2(bVar.f17274e, bVar.f17275f);
        if (this.f17288s == 1) {
            i12 = RecyclerView.p.K(S22, i10, i14, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i11 = RecyclerView.p.K(this.f17290u.n(), X(), i13, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int K10 = RecyclerView.p.K(S22, i10, i13, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int K11 = RecyclerView.p.K(this.f17290u.n(), p0(), i14, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i11 = K10;
            i12 = K11;
        }
        Y2(view, i12, i11, z10);
    }

    private void Y2(View view, int i10, int i11, boolean z10) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10 ? H1(view, i10, i11, qVar) : F1(view, i10, i11, qVar)) {
            view.measure(i10, i11);
        }
    }

    private void a3() {
        int W10;
        int g02;
        if (l2() == 1) {
            W10 = o0() - f0();
            g02 = e0();
        } else {
            W10 = W() - d0();
            g02 = g0();
        }
        L2(W10 - g02);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.A2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C1(Rect rect, int i10, int i11) {
        int n10;
        int n11;
        if (this.f17267K == null) {
            super.C1(rect, i10, i11);
        }
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f17288s == 1) {
            n11 = RecyclerView.p.n(i11, rect.height() + g02, b0());
            int[] iArr = this.f17267K;
            n10 = RecyclerView.p.n(i10, iArr[iArr.length - 1] + e02, c0());
        } else {
            n10 = RecyclerView.p.n(i10, rect.width() + e02, c0());
            int[] iArr2 = this.f17267K;
            n11 = RecyclerView.p.n(i11, iArr2[iArr2.length - 1] + g02, b0());
        }
        B1(n10, n11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return this.f17288s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
    
        if (r13 == (r2 > r7)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View J0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        int J10;
        int i11;
        int i12;
        View view2;
        View view3;
        int i13;
        int i14;
        int i15;
        int i16;
        RecyclerView.w wVar2 = wVar;
        RecyclerView.B b11 = b10;
        View B10 = B(view);
        View view4 = null;
        if (B10 == null) {
            return null;
        }
        b bVar = (b) B10.getLayoutParams();
        int i17 = bVar.f17274e;
        int i18 = bVar.f17275f + i17;
        if (super.J0(view, i10, wVar, b10) == null) {
            return null;
        }
        if ((R1(i10) == 1) != this.f17293x) {
            i12 = J() - 1;
            J10 = -1;
            i11 = -1;
        } else {
            J10 = J();
            i11 = 1;
            i12 = 0;
        }
        boolean z10 = this.f17288s == 1 && m2();
        int T22 = T2(wVar2, b11, i12);
        int i19 = -1;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        int i23 = i12;
        View view5 = null;
        while (i23 != J10) {
            int T23 = T2(wVar2, b11, i23);
            View I10 = I(i23);
            if (I10 == B10) {
                break;
            }
            if (!I10.hasFocusable() || T23 == T22) {
                b bVar2 = (b) I10.getLayoutParams();
                int i24 = bVar2.f17274e;
                view2 = B10;
                int i25 = bVar2.f17275f + i24;
                if (I10.hasFocusable() && i24 == i17 && i25 == i18) {
                    return I10;
                }
                if (!(I10.hasFocusable() && view4 == null) && (I10.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i25, i18) - Math.max(i24, i17);
                    if (I10.hasFocusable()) {
                        if (min <= i21) {
                            if (min == i21) {
                            }
                        }
                    } else if (view4 == null) {
                        i13 = i21;
                        i14 = J10;
                        if (y0(I10, false, true)) {
                            i15 = i22;
                            if (min > i15) {
                                i16 = i20;
                            } else {
                                if (min == i15) {
                                    i16 = i20;
                                } else {
                                    i16 = i20;
                                }
                                i20 = i16;
                                i22 = i15;
                                i21 = i13;
                                view5 = view3;
                                i23 += i11;
                                wVar2 = wVar;
                                b11 = b10;
                                B10 = view2;
                                J10 = i14;
                            }
                            if (I10.hasFocusable()) {
                                int i26 = bVar2.f17274e;
                                i22 = Math.min(i25, i18) - Math.max(i24, i17);
                                i20 = i26;
                                i21 = i13;
                                view5 = I10;
                            } else {
                                i19 = bVar2.f17274e;
                                i20 = i16;
                                i22 = i15;
                                view5 = view3;
                                view4 = I10;
                                i21 = Math.min(i25, i18) - Math.max(i24, i17);
                            }
                            i23 += i11;
                            wVar2 = wVar;
                            b11 = b10;
                            B10 = view2;
                            J10 = i14;
                        }
                        i16 = i20;
                        i15 = i22;
                        i20 = i16;
                        i22 = i15;
                        i21 = i13;
                        view5 = view3;
                        i23 += i11;
                        wVar2 = wVar;
                        b11 = b10;
                        B10 = view2;
                        J10 = i14;
                    }
                } else {
                    view3 = view5;
                }
                i13 = i21;
                i14 = J10;
                i16 = i20;
                i15 = i22;
                if (I10.hasFocusable()) {
                }
                i23 += i11;
                wVar2 = wVar;
                b11 = b10;
                B10 = view2;
                J10 = i14;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = B10;
                view3 = view5;
            }
            i13 = i21;
            i14 = J10;
            i16 = i20;
            i15 = i22;
            i20 = i16;
            i22 = i15;
            i21 = i13;
            view5 = view3;
            i23 += i11;
            wVar2 = wVar;
            b11 = b10;
            B10 = view2;
            J10 = i14;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean L1() {
        return this.f17283D == null && !this.f17265I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(RecyclerView.w wVar, RecyclerView.B b10, C5228A c5228a) {
        super.M0(wVar, b10, c5228a);
        c5228a.q0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int N(RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f17288s == 1) {
            return this.f17266J;
        }
        if (b10.b() < 1) {
            return 0;
        }
        return T2(wVar, b10, b10.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void N1(RecyclerView.B b10, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i10 = this.f17266J;
        for (int i11 = 0; i11 < this.f17266J && cVar.c(b10) && i10 > 0; i11++) {
            int i12 = cVar.f17308d;
            cVar2.a(i12, Math.max(0, cVar.f17311g));
            i10 -= this.f17271O.f(i12);
            cVar.f17308d += cVar.f17309e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(RecyclerView.w wVar, RecyclerView.B b10, View view, C5228A c5228a) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.O0(view, c5228a);
            return;
        }
        b bVar = (b) layoutParams;
        int T22 = T2(wVar, b10, bVar.a());
        if (this.f17288s == 0) {
            c5228a.t0(C5228A.f.b(bVar.e(), bVar.f(), T22, 1, false, false));
        } else {
            c5228a.t0(C5228A.f.b(T22, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView, int i10, int i11) {
        this.f17271O.h();
        this.f17271O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView) {
        this.f17271O.h();
        this.f17271O.g();
    }

    int S2(int i10, int i11) {
        if (this.f17288s != 1 || !m2()) {
            int[] iArr = this.f17267K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f17267K;
        int i12 = this.f17266J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f17271O.h();
        this.f17271O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i10, int i11) {
        this.f17271O.h();
        this.f17271O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f17271O.h();
        this.f17271O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.w wVar, RecyclerView.B b10) {
        if (b10.e()) {
            K2();
        }
        super.X0(wVar, b10);
        N2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.B b10) {
        super.Y0(b10);
        this.f17265I = false;
    }

    public void Z2(int i10) {
        if (i10 == this.f17266J) {
            return;
        }
        this.f17265I = true;
        if (i10 >= 1) {
            this.f17266J = i10;
            this.f17271O.h();
            t1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View f2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int J10 = J();
        int i12 = 1;
        if (z11) {
            i11 = J() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = J10;
            i11 = 0;
        }
        int b11 = b10.b();
        T1();
        int m10 = this.f17290u.m();
        int i13 = this.f17290u.i();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View I10 = I(i11);
            int h02 = h0(I10);
            if (h02 >= 0 && h02 < b11 && U2(wVar, b10, h02) == 0) {
                if (((RecyclerView.q) I10.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I10;
                    }
                } else {
                    if (this.f17290u.g(I10) < i13 && this.f17290u.d(I10) >= m10) {
                        return I10;
                    }
                    if (view == null) {
                        view = I10;
                    }
                }
            }
            i11 += i12;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int k0(RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f17288s == 0) {
            return this.f17266J;
        }
        if (b10.b() < 1) {
            return 0;
        }
        return T2(wVar, b10, b10.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r21.f17302b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void o2(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int f10;
        int i19;
        int K10;
        int i20;
        View d10;
        int l10 = this.f17290u.l();
        boolean z10 = l10 != 1073741824;
        int i21 = J() > 0 ? this.f17267K[this.f17266J] : 0;
        if (z10) {
            a3();
        }
        boolean z11 = cVar.f17309e == 1;
        int i22 = this.f17266J;
        if (!z11) {
            i22 = U2(wVar, b10, cVar.f17308d) + V2(wVar, b10, cVar.f17308d);
        }
        int i23 = 0;
        while (i23 < this.f17266J && cVar.c(b10) && i22 > 0) {
            int i24 = cVar.f17308d;
            int V22 = V2(wVar, b10, i24);
            if (V22 > this.f17266J) {
                throw new IllegalArgumentException("Item at position " + i24 + " requires " + V22 + " spans but GridLayoutManager has only " + this.f17266J + " spans.");
            }
            i22 -= V22;
            if (i22 < 0 || (d10 = cVar.d(wVar)) == null) {
                break;
            }
            this.f17268L[i23] = d10;
            i23++;
        }
        J2(wVar, b10, i23, z11);
        float f11 = 0.0f;
        int i25 = 0;
        for (int i26 = 0; i26 < i23; i26++) {
            View view = this.f17268L[i26];
            if (cVar.f17316l == null) {
                if (z11) {
                    d(view);
                } else {
                    e(view, 0);
                }
            } else if (z11) {
                b(view);
            } else {
                c(view, 0);
            }
            j(view, this.f17272P);
            X2(view, l10, false);
            int e10 = this.f17290u.e(view);
            if (e10 > i25) {
                i25 = e10;
            }
            float f12 = (this.f17290u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f17275f;
            if (f12 > f11) {
                f11 = f12;
            }
        }
        if (z10) {
            W2(f11, i21);
            i25 = 0;
            for (int i27 = 0; i27 < i23; i27++) {
                View view2 = this.f17268L[i27];
                X2(view2, 1073741824, true);
                int e11 = this.f17290u.e(view2);
                if (e11 > i25) {
                    i25 = e11;
                }
            }
        }
        for (int i28 = 0; i28 < i23; i28++) {
            View view3 = this.f17268L[i28];
            if (this.f17290u.e(view3) != i25) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f17514b;
                int i29 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i30 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int S22 = S2(bVar2.f17274e, bVar2.f17275f);
                if (this.f17288s == 1) {
                    i20 = RecyclerView.p.K(S22, 1073741824, i30, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    K10 = View.MeasureSpec.makeMeasureSpec(i25 - i29, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i25 - i30, 1073741824);
                    K10 = RecyclerView.p.K(S22, 1073741824, i29, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    i20 = makeMeasureSpec;
                }
                Y2(view3, i20, K10, true);
            }
        }
        bVar.f17301a = i25;
        if (this.f17288s == 1) {
            if (cVar.f17310f == -1) {
                i15 = cVar.f17306b;
                i19 = i15 - i25;
            } else {
                i19 = cVar.f17306b;
                i15 = i19 + i25;
            }
            i13 = i19;
            i14 = 0;
            i12 = 0;
        } else {
            if (cVar.f17310f == -1) {
                i11 = cVar.f17306b;
                i10 = i11 - i25;
            } else {
                i10 = cVar.f17306b;
                i11 = i10 + i25;
            }
            i12 = i10;
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        int i31 = 0;
        while (i31 < i23) {
            View view4 = this.f17268L[i31];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f17288s == 1) {
                if (m2()) {
                    int e02 = e0() + this.f17267K[this.f17266J - bVar3.f17274e];
                    f10 = i15;
                    i17 = e02;
                    i18 = e02 - this.f17290u.f(view4);
                } else {
                    int e03 = e0() + this.f17267K[bVar3.f17274e];
                    f10 = i15;
                    i18 = e03;
                    i17 = this.f17290u.f(view4) + e03;
                }
                i16 = i13;
            } else {
                int g02 = g0() + this.f17267K[bVar3.f17274e];
                i16 = g02;
                i17 = i14;
                i18 = i12;
                f10 = this.f17290u.f(view4) + g02;
            }
            z0(view4, i18, i16, i17, f10);
            if (bVar3.c() || bVar3.b()) {
                bVar.f17303c = true;
            }
            bVar.f17304d |= view4.hasFocusable();
            i31++;
            i15 = f10;
            i14 = i17;
            i12 = i18;
            i13 = i16;
        }
        Arrays.fill(this.f17268L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void q2(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.a aVar, int i10) {
        super.q2(wVar, b10, aVar, i10);
        a3();
        if (b10.b() > 0 && !b10.e()) {
            Q2(wVar, b10, aVar, i10);
        }
        R2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.B b10) {
        return this.f17273Q ? O2(b10) : super.r(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.B b10) {
        return this.f17273Q ? P2(b10) : super.s(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.B b10) {
        return this.f17273Q ? O2(b10) : super.u(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.B b10) {
        return this.f17273Q ? P2(b10) : super.v(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        a3();
        R2();
        return super.w1(i10, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int y1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        a3();
        R2();
        return super.y1(i10, wVar, b10);
    }

    public static class b extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        int f17274e;

        /* renamed from: f, reason: collision with root package name */
        int f17275f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17274e = -1;
            this.f17275f = 0;
        }

        public int e() {
            return this.f17274e;
        }

        public int f() {
            return this.f17275f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f17274e = -1;
            this.f17275f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f17274e = -1;
            this.f17275f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17274e = -1;
            this.f17275f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f17265I = false;
        this.f17266J = -1;
        this.f17269M = new SparseIntArray();
        this.f17270N = new SparseIntArray();
        this.f17271O = new a();
        this.f17272P = new Rect();
        Z2(i10);
    }
}
