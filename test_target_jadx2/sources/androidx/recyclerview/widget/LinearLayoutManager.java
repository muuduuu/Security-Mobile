package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.A.b {

    /* renamed from: A, reason: collision with root package name */
    int f17280A;

    /* renamed from: B, reason: collision with root package name */
    int f17281B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f17282C;

    /* renamed from: D, reason: collision with root package name */
    d f17283D;

    /* renamed from: E, reason: collision with root package name */
    final a f17284E;

    /* renamed from: F, reason: collision with root package name */
    private final b f17285F;

    /* renamed from: G, reason: collision with root package name */
    private int f17286G;

    /* renamed from: H, reason: collision with root package name */
    private int[] f17287H;

    /* renamed from: s, reason: collision with root package name */
    int f17288s;

    /* renamed from: t, reason: collision with root package name */
    private c f17289t;

    /* renamed from: u, reason: collision with root package name */
    j f17290u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f17291v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f17292w;

    /* renamed from: x, reason: collision with root package name */
    boolean f17293x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f17294y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f17295z;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        j f17296a;

        /* renamed from: b, reason: collision with root package name */
        int f17297b;

        /* renamed from: c, reason: collision with root package name */
        int f17298c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17299d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17300e;

        a() {
            e();
        }

        void a() {
            this.f17298c = this.f17299d ? this.f17296a.i() : this.f17296a.m();
        }

        public void b(View view, int i10) {
            if (this.f17299d) {
                this.f17298c = this.f17296a.d(view) + this.f17296a.o();
            } else {
                this.f17298c = this.f17296a.g(view);
            }
            this.f17297b = i10;
        }

        public void c(View view, int i10) {
            int o10 = this.f17296a.o();
            if (o10 >= 0) {
                b(view, i10);
                return;
            }
            this.f17297b = i10;
            if (this.f17299d) {
                int i11 = (this.f17296a.i() - o10) - this.f17296a.d(view);
                this.f17298c = this.f17296a.i() - i11;
                if (i11 > 0) {
                    int e10 = this.f17298c - this.f17296a.e(view);
                    int m10 = this.f17296a.m();
                    int min = e10 - (m10 + Math.min(this.f17296a.g(view) - m10, 0));
                    if (min < 0) {
                        this.f17298c += Math.min(i11, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g10 = this.f17296a.g(view);
            int m11 = g10 - this.f17296a.m();
            this.f17298c = g10;
            if (m11 > 0) {
                int i12 = (this.f17296a.i() - Math.min(0, (this.f17296a.i() - o10) - this.f17296a.d(view))) - (g10 + this.f17296a.e(view));
                if (i12 < 0) {
                    this.f17298c -= Math.min(m11, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.B b10) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < b10.b();
        }

        void e() {
            this.f17297b = -1;
            this.f17298c = Integer.MIN_VALUE;
            this.f17299d = false;
            this.f17300e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f17297b + ", mCoordinate=" + this.f17298c + ", mLayoutFromEnd=" + this.f17299d + ", mValid=" + this.f17300e + '}';
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f17301a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f17302b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f17303c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f17304d;

        protected b() {
        }

        void a() {
            this.f17301a = 0;
            this.f17302b = false;
            this.f17303c = false;
            this.f17304d = false;
        }
    }

    static class c {

        /* renamed from: b, reason: collision with root package name */
        int f17306b;

        /* renamed from: c, reason: collision with root package name */
        int f17307c;

        /* renamed from: d, reason: collision with root package name */
        int f17308d;

        /* renamed from: e, reason: collision with root package name */
        int f17309e;

        /* renamed from: f, reason: collision with root package name */
        int f17310f;

        /* renamed from: g, reason: collision with root package name */
        int f17311g;

        /* renamed from: k, reason: collision with root package name */
        int f17315k;

        /* renamed from: m, reason: collision with root package name */
        boolean f17317m;

        /* renamed from: a, reason: collision with root package name */
        boolean f17305a = true;

        /* renamed from: h, reason: collision with root package name */
        int f17312h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f17313i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f17314j = false;

        /* renamed from: l, reason: collision with root package name */
        List f17316l = null;

        c() {
        }

        private View e() {
            int size = this.f17316l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.F) this.f17316l.get(i10)).f17450a;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f17308d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f10 = f(view);
            if (f10 == null) {
                this.f17308d = -1;
            } else {
                this.f17308d = ((RecyclerView.q) f10.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.B b10) {
            int i10 = this.f17308d;
            return i10 >= 0 && i10 < b10.b();
        }

        View d(RecyclerView.w wVar) {
            if (this.f17316l != null) {
                return e();
            }
            View o10 = wVar.o(this.f17308d);
            this.f17308d += this.f17309e;
            return o10;
        }

        public View f(View view) {
            int a10;
            int size = this.f17316l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.F) this.f17316l.get(i11)).f17450a;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a10 = (qVar.a() - this.f17308d) * this.f17309e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f17318a;

        /* renamed from: b, reason: collision with root package name */
        int f17319b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17320c;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f17318a >= 0;
        }

        void b() {
            this.f17318a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f17318a);
            parcel.writeInt(this.f17319b);
            parcel.writeInt(this.f17320c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f17318a = parcel.readInt();
            this.f17319b = parcel.readInt();
            this.f17320c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f17318a = dVar.f17318a;
            this.f17319b = dVar.f17319b;
            this.f17320c = dVar.f17320c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private boolean B2(RecyclerView.w wVar, RecyclerView.B b10, a aVar) {
        View f22;
        boolean z10 = false;
        if (J() == 0) {
            return false;
        }
        View V10 = V();
        if (V10 != null && aVar.d(V10, b10)) {
            aVar.c(V10, h0(V10));
            return true;
        }
        boolean z11 = this.f17291v;
        boolean z12 = this.f17294y;
        if (z11 != z12 || (f22 = f2(wVar, b10, aVar.f17299d, z12)) == null) {
            return false;
        }
        aVar.b(f22, h0(f22));
        if (!b10.e() && L1()) {
            int g10 = this.f17290u.g(f22);
            int d10 = this.f17290u.d(f22);
            int m10 = this.f17290u.m();
            int i10 = this.f17290u.i();
            boolean z13 = d10 <= m10 && g10 < m10;
            if (g10 >= i10 && d10 > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f17299d) {
                    m10 = i10;
                }
                aVar.f17298c = m10;
            }
        }
        return true;
    }

    private boolean C2(RecyclerView.B b10, a aVar) {
        int i10;
        if (!b10.e() && (i10 = this.f17280A) != -1) {
            if (i10 >= 0 && i10 < b10.b()) {
                aVar.f17297b = this.f17280A;
                d dVar = this.f17283D;
                if (dVar != null && dVar.a()) {
                    boolean z10 = this.f17283D.f17320c;
                    aVar.f17299d = z10;
                    if (z10) {
                        aVar.f17298c = this.f17290u.i() - this.f17283D.f17319b;
                    } else {
                        aVar.f17298c = this.f17290u.m() + this.f17283D.f17319b;
                    }
                    return true;
                }
                if (this.f17281B != Integer.MIN_VALUE) {
                    boolean z11 = this.f17293x;
                    aVar.f17299d = z11;
                    if (z11) {
                        aVar.f17298c = this.f17290u.i() - this.f17281B;
                    } else {
                        aVar.f17298c = this.f17290u.m() + this.f17281B;
                    }
                    return true;
                }
                View C10 = C(this.f17280A);
                if (C10 == null) {
                    if (J() > 0) {
                        aVar.f17299d = (this.f17280A < h0(I(0))) == this.f17293x;
                    }
                    aVar.a();
                } else {
                    if (this.f17290u.e(C10) > this.f17290u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f17290u.g(C10) - this.f17290u.m() < 0) {
                        aVar.f17298c = this.f17290u.m();
                        aVar.f17299d = false;
                        return true;
                    }
                    if (this.f17290u.i() - this.f17290u.d(C10) < 0) {
                        aVar.f17298c = this.f17290u.i();
                        aVar.f17299d = true;
                        return true;
                    }
                    aVar.f17298c = aVar.f17299d ? this.f17290u.d(C10) + this.f17290u.o() : this.f17290u.g(C10);
                }
                return true;
            }
            this.f17280A = -1;
            this.f17281B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void D2(RecyclerView.w wVar, RecyclerView.B b10, a aVar) {
        if (C2(b10, aVar) || B2(wVar, b10, aVar)) {
            return;
        }
        aVar.a();
        aVar.f17297b = this.f17294y ? b10.b() - 1 : 0;
    }

    private void E2(int i10, int i11, boolean z10, RecyclerView.B b10) {
        int m10;
        this.f17289t.f17317m = v2();
        this.f17289t.f17310f = i10;
        int[] iArr = this.f17287H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(b10, iArr);
        int max = Math.max(0, this.f17287H[0]);
        int max2 = Math.max(0, this.f17287H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f17289t;
        int i12 = z11 ? max2 : max;
        cVar.f17312h = i12;
        if (!z11) {
            max = max2;
        }
        cVar.f17313i = max;
        if (z11) {
            cVar.f17312h = i12 + this.f17290u.j();
            View i22 = i2();
            c cVar2 = this.f17289t;
            cVar2.f17309e = this.f17293x ? -1 : 1;
            int h02 = h0(i22);
            c cVar3 = this.f17289t;
            cVar2.f17308d = h02 + cVar3.f17309e;
            cVar3.f17306b = this.f17290u.d(i22);
            m10 = this.f17290u.d(i22) - this.f17290u.i();
        } else {
            View j22 = j2();
            this.f17289t.f17312h += this.f17290u.m();
            c cVar4 = this.f17289t;
            cVar4.f17309e = this.f17293x ? 1 : -1;
            int h03 = h0(j22);
            c cVar5 = this.f17289t;
            cVar4.f17308d = h03 + cVar5.f17309e;
            cVar5.f17306b = this.f17290u.g(j22);
            m10 = (-this.f17290u.g(j22)) + this.f17290u.m();
        }
        c cVar6 = this.f17289t;
        cVar6.f17307c = i11;
        if (z10) {
            cVar6.f17307c = i11 - m10;
        }
        cVar6.f17311g = m10;
    }

    private void F2(int i10, int i11) {
        this.f17289t.f17307c = this.f17290u.i() - i11;
        c cVar = this.f17289t;
        cVar.f17309e = this.f17293x ? -1 : 1;
        cVar.f17308d = i10;
        cVar.f17310f = 1;
        cVar.f17306b = i11;
        cVar.f17311g = Integer.MIN_VALUE;
    }

    private void G2(a aVar) {
        F2(aVar.f17297b, aVar.f17298c);
    }

    private void H2(int i10, int i11) {
        this.f17289t.f17307c = i11 - this.f17290u.m();
        c cVar = this.f17289t;
        cVar.f17308d = i10;
        cVar.f17309e = this.f17293x ? 1 : -1;
        cVar.f17310f = -1;
        cVar.f17306b = i11;
        cVar.f17311g = Integer.MIN_VALUE;
    }

    private void I2(a aVar) {
        H2(aVar.f17297b, aVar.f17298c);
    }

    private int O1(RecyclerView.B b10) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return m.a(b10, this.f17290u, X1(!this.f17295z, true), W1(!this.f17295z, true), this, this.f17295z);
    }

    private int P1(RecyclerView.B b10) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return m.b(b10, this.f17290u, X1(!this.f17295z, true), W1(!this.f17295z, true), this, this.f17295z, this.f17293x);
    }

    private int Q1(RecyclerView.B b10) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return m.c(b10, this.f17290u, X1(!this.f17295z, true), W1(!this.f17295z, true), this, this.f17295z);
    }

    private View V1() {
        return b2(0, J());
    }

    private View Z1() {
        return b2(J() - 1, -1);
    }

    private View d2() {
        return this.f17293x ? V1() : Z1();
    }

    private View e2() {
        return this.f17293x ? Z1() : V1();
    }

    private int g2(int i10, RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int i11;
        int i12 = this.f17290u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -x2(-i12, wVar, b10);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f17290u.i() - i14) <= 0) {
            return i13;
        }
        this.f17290u.r(i11);
        return i11 + i13;
    }

    private int h2(int i10, RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int m10;
        int m11 = i10 - this.f17290u.m();
        if (m11 <= 0) {
            return 0;
        }
        int i11 = -x2(m11, wVar, b10);
        int i12 = i10 + i11;
        if (!z10 || (m10 = i12 - this.f17290u.m()) <= 0) {
            return i11;
        }
        this.f17290u.r(-m10);
        return i11 - m10;
    }

    private View i2() {
        return I(this.f17293x ? 0 : J() - 1);
    }

    private View j2() {
        return I(this.f17293x ? J() - 1 : 0);
    }

    private void p2(RecyclerView.w wVar, RecyclerView.B b10, int i10, int i11) {
        if (!b10.g() || J() == 0 || b10.e() || !L1()) {
            return;
        }
        List k10 = wVar.k();
        int size = k10.size();
        int h02 = h0(I(0));
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView.F f10 = (RecyclerView.F) k10.get(i14);
            if (!f10.x()) {
                if ((f10.o() < h02) != this.f17293x) {
                    i12 += this.f17290u.e(f10.f17450a);
                } else {
                    i13 += this.f17290u.e(f10.f17450a);
                }
            }
        }
        this.f17289t.f17316l = k10;
        if (i12 > 0) {
            H2(h0(j2()), i10);
            c cVar = this.f17289t;
            cVar.f17312h = i12;
            cVar.f17307c = 0;
            cVar.a();
            U1(wVar, this.f17289t, b10, false);
        }
        if (i13 > 0) {
            F2(h0(i2()), i11);
            c cVar2 = this.f17289t;
            cVar2.f17312h = i13;
            cVar2.f17307c = 0;
            cVar2.a();
            U1(wVar, this.f17289t, b10, false);
        }
        this.f17289t.f17316l = null;
    }

    private void r2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f17305a || cVar.f17317m) {
            return;
        }
        int i10 = cVar.f17311g;
        int i11 = cVar.f17313i;
        if (cVar.f17310f == -1) {
            t2(wVar, i10, i11);
        } else {
            u2(wVar, i10, i11);
        }
    }

    private void s2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                n1(i10, wVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                n1(i12, wVar);
            }
        }
    }

    private void t2(RecyclerView.w wVar, int i10, int i11) {
        int J10 = J();
        if (i10 < 0) {
            return;
        }
        int h10 = (this.f17290u.h() - i10) + i11;
        if (this.f17293x) {
            for (int i12 = 0; i12 < J10; i12++) {
                View I10 = I(i12);
                if (this.f17290u.g(I10) < h10 || this.f17290u.q(I10) < h10) {
                    s2(wVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = J10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View I11 = I(i14);
            if (this.f17290u.g(I11) < h10 || this.f17290u.q(I11) < h10) {
                s2(wVar, i13, i14);
                return;
            }
        }
    }

    private void u2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int J10 = J();
        if (!this.f17293x) {
            for (int i13 = 0; i13 < J10; i13++) {
                View I10 = I(i13);
                if (this.f17290u.d(I10) > i12 || this.f17290u.p(I10) > i12) {
                    s2(wVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = J10 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View I11 = I(i15);
            if (this.f17290u.d(I11) > i12 || this.f17290u.p(I11) > i12) {
                s2(wVar, i14, i15);
                return;
            }
        }
    }

    private void w2() {
        if (this.f17288s == 1 || !m2()) {
            this.f17293x = this.f17292w;
        } else {
            this.f17293x = !this.f17292w;
        }
    }

    public void A2(boolean z10) {
        g(null);
        if (this.f17294y == z10) {
            return;
        }
        this.f17294y = z10;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View C(int i10) {
        int J10 = J();
        if (J10 == 0) {
            return null;
        }
        int h02 = i10 - h0(I(0));
        if (h02 >= 0 && h02 < J10) {
            View I10 = I(h02);
            if (h0(I10) == i10) {
                return I10;
            }
        }
        return super.C(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean G1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.I0(recyclerView, wVar);
        if (this.f17282C) {
            k1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        h hVar = new h(recyclerView.getContext());
        hVar.p(i10);
        J1(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View J0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        int R12;
        w2();
        if (J() == 0 || (R12 = R1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        E2(R12, (int) (this.f17290u.n() * 0.33333334f), false, b10);
        c cVar = this.f17289t;
        cVar.f17311g = Integer.MIN_VALUE;
        cVar.f17305a = false;
        U1(wVar, cVar, b10, true);
        View e22 = R12 == -1 ? e2() : d2();
        View j22 = R12 == -1 ? j2() : i2();
        if (!j22.hasFocusable()) {
            return e22;
        }
        if (e22 == null) {
            return null;
        }
        return j22;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Y1());
            accessibilityEvent.setToIndex(a2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean L1() {
        return this.f17283D == null && this.f17291v == this.f17294y;
    }

    protected void M1(RecyclerView.B b10, int[] iArr) {
        int i10;
        int k22 = k2(b10);
        if (this.f17289t.f17310f == -1) {
            i10 = 0;
        } else {
            i10 = k22;
            k22 = 0;
        }
        iArr[0] = k22;
        iArr[1] = i10;
    }

    void N1(RecyclerView.B b10, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f17308d;
        if (i10 < 0 || i10 >= b10.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f17311g));
    }

    int R1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f17288s == 1) ? 1 : Integer.MIN_VALUE : this.f17288s == 0 ? 1 : Integer.MIN_VALUE : this.f17288s == 1 ? -1 : Integer.MIN_VALUE : this.f17288s == 0 ? -1 : Integer.MIN_VALUE : (this.f17288s != 1 && m2()) ? -1 : 1 : (this.f17288s != 1 && m2()) ? 1 : -1;
    }

    c S1() {
        return new c();
    }

    void T1() {
        if (this.f17289t == null) {
            this.f17289t = S1();
        }
    }

    int U1(RecyclerView.w wVar, c cVar, RecyclerView.B b10, boolean z10) {
        int i10 = cVar.f17307c;
        int i11 = cVar.f17311g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f17311g = i11 + i10;
            }
            r2(wVar, cVar);
        }
        int i12 = cVar.f17307c + cVar.f17312h;
        b bVar = this.f17285F;
        while (true) {
            if ((!cVar.f17317m && i12 <= 0) || !cVar.c(b10)) {
                break;
            }
            bVar.a();
            o2(wVar, b10, cVar, bVar);
            if (!bVar.f17302b) {
                cVar.f17306b += bVar.f17301a * cVar.f17310f;
                if (!bVar.f17303c || cVar.f17316l != null || !b10.e()) {
                    int i13 = cVar.f17307c;
                    int i14 = bVar.f17301a;
                    cVar.f17307c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f17311g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f17301a;
                    cVar.f17311g = i16;
                    int i17 = cVar.f17307c;
                    if (i17 < 0) {
                        cVar.f17311g = i16 + i17;
                    }
                    r2(wVar, cVar);
                }
                if (z10 && bVar.f17304d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f17307c;
    }

    View W1(boolean z10, boolean z11) {
        return this.f17293x ? c2(0, J(), z10, z11) : c2(J() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.w wVar, RecyclerView.B b10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int g22;
        int i14;
        View C10;
        int g10;
        int i15;
        int i16 = -1;
        if (!(this.f17283D == null && this.f17280A == -1) && b10.b() == 0) {
            k1(wVar);
            return;
        }
        d dVar = this.f17283D;
        if (dVar != null && dVar.a()) {
            this.f17280A = this.f17283D.f17318a;
        }
        T1();
        this.f17289t.f17305a = false;
        w2();
        View V10 = V();
        a aVar = this.f17284E;
        if (!aVar.f17300e || this.f17280A != -1 || this.f17283D != null) {
            aVar.e();
            a aVar2 = this.f17284E;
            aVar2.f17299d = this.f17293x ^ this.f17294y;
            D2(wVar, b10, aVar2);
            this.f17284E.f17300e = true;
        } else if (V10 != null && (this.f17290u.g(V10) >= this.f17290u.i() || this.f17290u.d(V10) <= this.f17290u.m())) {
            this.f17284E.c(V10, h0(V10));
        }
        c cVar = this.f17289t;
        cVar.f17310f = cVar.f17315k >= 0 ? 1 : -1;
        int[] iArr = this.f17287H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(b10, iArr);
        int max = Math.max(0, this.f17287H[0]) + this.f17290u.m();
        int max2 = Math.max(0, this.f17287H[1]) + this.f17290u.j();
        if (b10.e() && (i14 = this.f17280A) != -1 && this.f17281B != Integer.MIN_VALUE && (C10 = C(i14)) != null) {
            if (this.f17293x) {
                i15 = this.f17290u.i() - this.f17290u.d(C10);
                g10 = this.f17281B;
            } else {
                g10 = this.f17290u.g(C10) - this.f17290u.m();
                i15 = this.f17281B;
            }
            int i17 = i15 - g10;
            if (i17 > 0) {
                max += i17;
            } else {
                max2 -= i17;
            }
        }
        a aVar3 = this.f17284E;
        if (!aVar3.f17299d ? !this.f17293x : this.f17293x) {
            i16 = 1;
        }
        q2(wVar, b10, aVar3, i16);
        w(wVar);
        this.f17289t.f17317m = v2();
        this.f17289t.f17314j = b10.e();
        this.f17289t.f17313i = 0;
        a aVar4 = this.f17284E;
        if (aVar4.f17299d) {
            I2(aVar4);
            c cVar2 = this.f17289t;
            cVar2.f17312h = max;
            U1(wVar, cVar2, b10, false);
            c cVar3 = this.f17289t;
            i11 = cVar3.f17306b;
            int i18 = cVar3.f17308d;
            int i19 = cVar3.f17307c;
            if (i19 > 0) {
                max2 += i19;
            }
            G2(this.f17284E);
            c cVar4 = this.f17289t;
            cVar4.f17312h = max2;
            cVar4.f17308d += cVar4.f17309e;
            U1(wVar, cVar4, b10, false);
            c cVar5 = this.f17289t;
            i10 = cVar5.f17306b;
            int i20 = cVar5.f17307c;
            if (i20 > 0) {
                H2(i18, i11);
                c cVar6 = this.f17289t;
                cVar6.f17312h = i20;
                U1(wVar, cVar6, b10, false);
                i11 = this.f17289t.f17306b;
            }
        } else {
            G2(aVar4);
            c cVar7 = this.f17289t;
            cVar7.f17312h = max2;
            U1(wVar, cVar7, b10, false);
            c cVar8 = this.f17289t;
            i10 = cVar8.f17306b;
            int i21 = cVar8.f17308d;
            int i22 = cVar8.f17307c;
            if (i22 > 0) {
                max += i22;
            }
            I2(this.f17284E);
            c cVar9 = this.f17289t;
            cVar9.f17312h = max;
            cVar9.f17308d += cVar9.f17309e;
            U1(wVar, cVar9, b10, false);
            c cVar10 = this.f17289t;
            i11 = cVar10.f17306b;
            int i23 = cVar10.f17307c;
            if (i23 > 0) {
                F2(i21, i10);
                c cVar11 = this.f17289t;
                cVar11.f17312h = i23;
                U1(wVar, cVar11, b10, false);
                i10 = this.f17289t.f17306b;
            }
        }
        if (J() > 0) {
            if (this.f17293x ^ this.f17294y) {
                int g23 = g2(i10, wVar, b10, true);
                i12 = i11 + g23;
                i13 = i10 + g23;
                g22 = h2(i12, wVar, b10, false);
            } else {
                int h22 = h2(i11, wVar, b10, true);
                i12 = i11 + h22;
                i13 = i10 + h22;
                g22 = g2(i13, wVar, b10, false);
            }
            i11 = i12 + g22;
            i10 = i13 + g22;
        }
        p2(wVar, b10, i11, i10);
        if (b10.e()) {
            this.f17284E.e();
        } else {
            this.f17290u.s();
        }
        this.f17291v = this.f17294y;
    }

    View X1(boolean z10, boolean z11) {
        return this.f17293x ? c2(J() - 1, -1, z10, z11) : c2(0, J(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.B b10) {
        super.Y0(b10);
        this.f17283D = null;
        this.f17280A = -1;
        this.f17281B = Integer.MIN_VALUE;
        this.f17284E.e();
    }

    public int Y1() {
        View c22 = c2(0, J(), false, true);
        if (c22 == null) {
            return -1;
        }
        return h0(c22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF a(int i10) {
        if (J() == 0) {
            return null;
        }
        int i11 = (i10 < h0(I(0))) != this.f17293x ? -1 : 1;
        return this.f17288s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public int a2() {
        View c22 = c2(J() - 1, -1, false, true);
        if (c22 == null) {
            return -1;
        }
        return h0(c22);
    }

    View b2(int i10, int i11) {
        int i12;
        int i13;
        T1();
        if (i11 <= i10 && i11 >= i10) {
            return I(i10);
        }
        if (this.f17290u.g(I(i10)) < this.f17290u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f17288s == 0 ? this.f17493e.a(i10, i11, i12, i13) : this.f17494f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f17283D = dVar;
            if (this.f17280A != -1) {
                dVar.b();
            }
            t1();
        }
    }

    View c2(int i10, int i11, boolean z10, boolean z11) {
        T1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f17288s == 0 ? this.f17493e.a(i10, i11, i12, i13) : this.f17494f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable d1() {
        if (this.f17283D != null) {
            return new d(this.f17283D);
        }
        d dVar = new d();
        if (J() > 0) {
            T1();
            boolean z10 = this.f17291v ^ this.f17293x;
            dVar.f17320c = z10;
            if (z10) {
                View i22 = i2();
                dVar.f17319b = this.f17290u.i() - this.f17290u.d(i22);
                dVar.f17318a = h0(i22);
            } else {
                View j22 = j2();
                dVar.f17318a = h0(j22);
                dVar.f17319b = this.f17290u.g(j22) - this.f17290u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    View f2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        T1();
        int J10 = J();
        if (z11) {
            i11 = J() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = J10;
            i11 = 0;
            i12 = 1;
        }
        int b11 = b10.b();
        int m10 = this.f17290u.m();
        int i13 = this.f17290u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View I10 = I(i11);
            int h02 = h0(I10);
            int g10 = this.f17290u.g(I10);
            int d10 = this.f17290u.d(I10);
            if (h02 >= 0 && h02 < b11) {
                if (!((RecyclerView.q) I10.getLayoutParams()).c()) {
                    boolean z12 = d10 <= m10 && g10 < m10;
                    boolean z13 = g10 >= i13 && d10 > i13;
                    if (!z12 && !z13) {
                        return I10;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = I10;
                        }
                        view2 = I10;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = I10;
                        }
                        view2 = I10;
                    }
                } else if (view3 == null) {
                    view3 = I10;
                }
            }
            i11 += i12;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(String str) {
        if (this.f17283D == null) {
            super.g(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean k() {
        return this.f17288s == 0;
    }

    protected int k2(RecyclerView.B b10) {
        if (b10.d()) {
            return this.f17290u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.f17288s == 1;
    }

    public int l2() {
        return this.f17288s;
    }

    protected boolean m2() {
        return Z() == 1;
    }

    public boolean n2() {
        return this.f17295z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o(int i10, int i11, RecyclerView.B b10, RecyclerView.p.c cVar) {
        if (this.f17288s != 0) {
            i10 = i11;
        }
        if (J() == 0 || i10 == 0) {
            return;
        }
        T1();
        E2(i10 > 0 ? 1 : -1, Math.abs(i10), true, b10);
        N1(b10, this.f17289t, cVar);
    }

    void o2(RecyclerView.w wVar, RecyclerView.B b10, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int f10;
        View d10 = cVar.d(wVar);
        if (d10 == null) {
            bVar.f17302b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d10.getLayoutParams();
        if (cVar.f17316l == null) {
            if (this.f17293x == (cVar.f17310f == -1)) {
                d(d10);
            } else {
                e(d10, 0);
            }
        } else {
            if (this.f17293x == (cVar.f17310f == -1)) {
                b(d10);
            } else {
                c(d10, 0);
            }
        }
        A0(d10, 0, 0);
        bVar.f17301a = this.f17290u.e(d10);
        if (this.f17288s == 1) {
            if (m2()) {
                f10 = o0() - f0();
                i13 = f10 - this.f17290u.f(d10);
            } else {
                i13 = e0();
                f10 = this.f17290u.f(d10) + i13;
            }
            if (cVar.f17310f == -1) {
                int i14 = cVar.f17306b;
                i12 = i14;
                i11 = f10;
                i10 = i14 - bVar.f17301a;
            } else {
                int i15 = cVar.f17306b;
                i10 = i15;
                i11 = f10;
                i12 = bVar.f17301a + i15;
            }
        } else {
            int g02 = g0();
            int f11 = this.f17290u.f(d10) + g02;
            if (cVar.f17310f == -1) {
                int i16 = cVar.f17306b;
                i11 = i16;
                i10 = g02;
                i12 = f11;
                i13 = i16 - bVar.f17301a;
            } else {
                int i17 = cVar.f17306b;
                i10 = g02;
                i11 = bVar.f17301a + i17;
                i12 = f11;
                i13 = i17;
            }
        }
        z0(d10, i13, i10, i11, i12);
        if (qVar.c() || qVar.b()) {
            bVar.f17303c = true;
        }
        bVar.f17304d = d10.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.f17283D;
        if (dVar == null || !dVar.a()) {
            w2();
            z10 = this.f17293x;
            i11 = this.f17280A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.f17283D;
            z10 = dVar2.f17320c;
            i11 = dVar2.f17318a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f17286G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q(RecyclerView.B b10) {
        return O1(b10);
    }

    void q2(RecyclerView.w wVar, RecyclerView.B b10, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.B b10) {
        return P1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.B b10) {
        return Q1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.B b10) {
        return O1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.B b10) {
        return P1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.B b10) {
        return Q1(b10);
    }

    boolean v2() {
        return this.f17290u.k() == 0 && this.f17290u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f17288s == 1) {
            return 0;
        }
        return x2(i10, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void x1(int i10) {
        this.f17280A = i10;
        this.f17281B = Integer.MIN_VALUE;
        d dVar = this.f17283D;
        if (dVar != null) {
            dVar.b();
        }
        t1();
    }

    int x2(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        T1();
        this.f17289t.f17305a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        E2(i11, abs, true, b10);
        c cVar = this.f17289t;
        int U12 = cVar.f17311g + U1(wVar, cVar, b10, false);
        if (U12 < 0) {
            return 0;
        }
        if (abs > U12) {
            i10 = i11 * U12;
        }
        this.f17290u.r(-i10);
        this.f17289t.f17315k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f17288s == 0) {
            return 0;
        }
        return x2(i10, wVar, b10);
    }

    public void y2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        g(null);
        if (i10 != this.f17288s || this.f17290u == null) {
            j b10 = j.b(this, i10);
            this.f17290u = b10;
            this.f17284E.f17296a = b10;
            this.f17288s = i10;
            t1();
        }
    }

    public void z2(boolean z10) {
        g(null);
        if (z10 == this.f17292w) {
            return;
        }
        this.f17292w = z10;
        t1();
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f17288s = 1;
        this.f17292w = false;
        this.f17293x = false;
        this.f17294y = false;
        this.f17295z = true;
        this.f17280A = -1;
        this.f17281B = Integer.MIN_VALUE;
        this.f17283D = null;
        this.f17284E = new a();
        this.f17285F = new b();
        this.f17286G = 2;
        this.f17287H = new int[2];
        y2(i10);
        z2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f17288s = 1;
        this.f17292w = false;
        this.f17293x = false;
        this.f17294y = false;
        this.f17295z = true;
        this.f17280A = -1;
        this.f17281B = Integer.MIN_VALUE;
        this.f17283D = null;
        this.f17284E = new a();
        this.f17285F = new b();
        this.f17286G = 2;
        this.f17287H = new int[2];
        RecyclerView.p.d i02 = RecyclerView.p.i0(context, attributeSet, i10, i11);
        y2(i02.f17509a);
        z2(i02.f17511c);
        A2(i02.f17512d);
    }
}
