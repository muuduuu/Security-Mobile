package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.A.b {

    /* renamed from: B, reason: collision with root package name */
    private BitSet f17535B;

    /* renamed from: G, reason: collision with root package name */
    private boolean f17540G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f17541H;

    /* renamed from: I, reason: collision with root package name */
    private e f17542I;

    /* renamed from: J, reason: collision with root package name */
    private int f17543J;

    /* renamed from: O, reason: collision with root package name */
    private int[] f17548O;

    /* renamed from: t, reason: collision with root package name */
    f[] f17551t;

    /* renamed from: u, reason: collision with root package name */
    j f17552u;

    /* renamed from: v, reason: collision with root package name */
    j f17553v;

    /* renamed from: w, reason: collision with root package name */
    private int f17554w;

    /* renamed from: x, reason: collision with root package name */
    private int f17555x;

    /* renamed from: y, reason: collision with root package name */
    private final g f17556y;

    /* renamed from: s, reason: collision with root package name */
    private int f17550s = -1;

    /* renamed from: z, reason: collision with root package name */
    boolean f17557z = false;

    /* renamed from: A, reason: collision with root package name */
    boolean f17534A = false;

    /* renamed from: C, reason: collision with root package name */
    int f17536C = -1;

    /* renamed from: D, reason: collision with root package name */
    int f17537D = Integer.MIN_VALUE;

    /* renamed from: E, reason: collision with root package name */
    d f17538E = new d();

    /* renamed from: F, reason: collision with root package name */
    private int f17539F = 2;

    /* renamed from: K, reason: collision with root package name */
    private final Rect f17544K = new Rect();

    /* renamed from: L, reason: collision with root package name */
    private final b f17545L = new b();

    /* renamed from: M, reason: collision with root package name */
    private boolean f17546M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f17547N = true;

    /* renamed from: P, reason: collision with root package name */
    private final Runnable f17549P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.S1();
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        int f17559a;

        /* renamed from: b, reason: collision with root package name */
        int f17560b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17561c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17562d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17563e;

        /* renamed from: f, reason: collision with root package name */
        int[] f17564f;

        b() {
            c();
        }

        void a() {
            this.f17560b = this.f17561c ? StaggeredGridLayoutManager.this.f17552u.i() : StaggeredGridLayoutManager.this.f17552u.m();
        }

        void b(int i10) {
            if (this.f17561c) {
                this.f17560b = StaggeredGridLayoutManager.this.f17552u.i() - i10;
            } else {
                this.f17560b = StaggeredGridLayoutManager.this.f17552u.m() + i10;
            }
        }

        void c() {
            this.f17559a = -1;
            this.f17560b = Integer.MIN_VALUE;
            this.f17561c = false;
            this.f17562d = false;
            this.f17563e = false;
            int[] iArr = this.f17564f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f17564f;
            if (iArr == null || iArr.length < length) {
                this.f17564f = new int[StaggeredGridLayoutManager.this.f17551t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f17564f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        f f17566e;

        /* renamed from: f, reason: collision with root package name */
        boolean f17567f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f17567f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f17574a;

        /* renamed from: b, reason: collision with root package name */
        int f17575b;

        /* renamed from: c, reason: collision with root package name */
        int f17576c;

        /* renamed from: d, reason: collision with root package name */
        int[] f17577d;

        /* renamed from: e, reason: collision with root package name */
        int f17578e;

        /* renamed from: f, reason: collision with root package name */
        int[] f17579f;

        /* renamed from: g, reason: collision with root package name */
        List f17580g;

        /* renamed from: h, reason: collision with root package name */
        boolean f17581h;

        /* renamed from: i, reason: collision with root package name */
        boolean f17582i;

        /* renamed from: j, reason: collision with root package name */
        boolean f17583j;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        void a() {
            this.f17577d = null;
            this.f17576c = 0;
            this.f17574a = -1;
            this.f17575b = -1;
        }

        void b() {
            this.f17577d = null;
            this.f17576c = 0;
            this.f17578e = 0;
            this.f17579f = null;
            this.f17580g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f17574a);
            parcel.writeInt(this.f17575b);
            parcel.writeInt(this.f17576c);
            if (this.f17576c > 0) {
                parcel.writeIntArray(this.f17577d);
            }
            parcel.writeInt(this.f17578e);
            if (this.f17578e > 0) {
                parcel.writeIntArray(this.f17579f);
            }
            parcel.writeInt(this.f17581h ? 1 : 0);
            parcel.writeInt(this.f17582i ? 1 : 0);
            parcel.writeInt(this.f17583j ? 1 : 0);
            parcel.writeList(this.f17580g);
        }

        e(Parcel parcel) {
            this.f17574a = parcel.readInt();
            this.f17575b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f17576c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f17577d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f17578e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f17579f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f17581h = parcel.readInt() == 1;
            this.f17582i = parcel.readInt() == 1;
            this.f17583j = parcel.readInt() == 1;
            this.f17580g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f17576c = eVar.f17576c;
            this.f17574a = eVar.f17574a;
            this.f17575b = eVar.f17575b;
            this.f17577d = eVar.f17577d;
            this.f17578e = eVar.f17578e;
            this.f17579f = eVar.f17579f;
            this.f17581h = eVar.f17581h;
            this.f17582i = eVar.f17582i;
            this.f17583j = eVar.f17583j;
            this.f17580g = eVar.f17580g;
        }
    }

    class f {

        /* renamed from: a, reason: collision with root package name */
        ArrayList f17584a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        int f17585b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f17586c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f17587d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f17588e;

        f(int i10) {
            this.f17588e = i10;
        }

        void a(View view) {
            c n10 = n(view);
            n10.f17566e = this;
            this.f17584a.add(view);
            this.f17586c = Integer.MIN_VALUE;
            if (this.f17584a.size() == 1) {
                this.f17585b = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f17587d += StaggeredGridLayoutManager.this.f17552u.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int l10 = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l10 == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || l10 >= StaggeredGridLayoutManager.this.f17552u.i()) {
                if (z10 || l10 <= StaggeredGridLayoutManager.this.f17552u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        l10 += i10;
                    }
                    this.f17586c = l10;
                    this.f17585b = l10;
                }
            }
        }

        void c() {
            d.a f10;
            ArrayList arrayList = this.f17584a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c n10 = n(view);
            this.f17586c = StaggeredGridLayoutManager.this.f17552u.d(view);
            if (n10.f17567f && (f10 = StaggeredGridLayoutManager.this.f17538E.f(n10.a())) != null && f10.f17571b == 1) {
                this.f17586c += f10.a(this.f17588e);
            }
        }

        void d() {
            d.a f10;
            View view = (View) this.f17584a.get(0);
            c n10 = n(view);
            this.f17585b = StaggeredGridLayoutManager.this.f17552u.g(view);
            if (n10.f17567f && (f10 = StaggeredGridLayoutManager.this.f17538E.f(n10.a())) != null && f10.f17571b == -1) {
                this.f17585b -= f10.a(this.f17588e);
            }
        }

        void e() {
            this.f17584a.clear();
            q();
            this.f17587d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f17557z ? i(this.f17584a.size() - 1, -1, true) : i(0, this.f17584a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f17557z ? i(0, this.f17584a.size(), true) : i(this.f17584a.size() - 1, -1, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int m10 = StaggeredGridLayoutManager.this.f17552u.m();
            int i12 = StaggeredGridLayoutManager.this.f17552u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = (View) this.f17584a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.f17552u.g(view);
                int d10 = StaggeredGridLayoutManager.this.f17552u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? g10 >= i12 : g10 > i12;
                if (!z12 ? d10 > m10 : d10 >= m10) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (g10 >= m10 && d10 <= i12) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                        if (g10 < m10 || d10 > i12) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f17587d;
        }

        int k() {
            int i10 = this.f17586c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f17586c;
        }

        int l(int i10) {
            int i11 = this.f17586c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f17584a.size() == 0) {
                return i10;
            }
            c();
            return this.f17586c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f17584a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f17584a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f17557z && staggeredGridLayoutManager.h0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f17557z && staggeredGridLayoutManager2.h0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f17584a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = (View) this.f17584a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f17557z && staggeredGridLayoutManager3.h0(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f17557z && staggeredGridLayoutManager4.h0(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f17585b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f17585b;
        }

        int p(int i10) {
            int i11 = this.f17585b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f17584a.size() == 0) {
                return i10;
            }
            d();
            return this.f17585b;
        }

        void q() {
            this.f17585b = Integer.MIN_VALUE;
            this.f17586c = Integer.MIN_VALUE;
        }

        void r(int i10) {
            int i11 = this.f17585b;
            if (i11 != Integer.MIN_VALUE) {
                this.f17585b = i11 + i10;
            }
            int i12 = this.f17586c;
            if (i12 != Integer.MIN_VALUE) {
                this.f17586c = i12 + i10;
            }
        }

        void s() {
            int size = this.f17584a.size();
            View view = (View) this.f17584a.remove(size - 1);
            c n10 = n(view);
            n10.f17566e = null;
            if (n10.c() || n10.b()) {
                this.f17587d -= StaggeredGridLayoutManager.this.f17552u.e(view);
            }
            if (size == 1) {
                this.f17585b = Integer.MIN_VALUE;
            }
            this.f17586c = Integer.MIN_VALUE;
        }

        void t() {
            View view = (View) this.f17584a.remove(0);
            c n10 = n(view);
            n10.f17566e = null;
            if (this.f17584a.size() == 0) {
                this.f17586c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f17587d -= StaggeredGridLayoutManager.this.f17552u.e(view);
            }
            this.f17585b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c n10 = n(view);
            n10.f17566e = this;
            this.f17584a.add(0, view);
            this.f17585b = Integer.MIN_VALUE;
            if (this.f17584a.size() == 1) {
                this.f17586c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f17587d += StaggeredGridLayoutManager.this.f17552u.e(view);
            }
        }

        void v(int i10) {
            this.f17585b = i10;
            this.f17586c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d i02 = RecyclerView.p.i0(context, attributeSet, i10, i11);
        H2(i02.f17509a);
        J2(i02.f17510b);
        I2(i02.f17511c);
        this.f17556y = new g();
        a2();
    }

    private void A2(RecyclerView.w wVar, g gVar) {
        if (!gVar.f17713a || gVar.f17721i) {
            return;
        }
        if (gVar.f17714b == 0) {
            if (gVar.f17717e == -1) {
                B2(wVar, gVar.f17719g);
                return;
            } else {
                C2(wVar, gVar.f17718f);
                return;
            }
        }
        if (gVar.f17717e != -1) {
            int n22 = n2(gVar.f17719g) - gVar.f17719g;
            C2(wVar, n22 < 0 ? gVar.f17718f : Math.min(n22, gVar.f17714b) + gVar.f17718f);
        } else {
            int i10 = gVar.f17718f;
            int m22 = i10 - m2(i10);
            B2(wVar, m22 < 0 ? gVar.f17719g : gVar.f17719g - Math.min(m22, gVar.f17714b));
        }
    }

    private void B2(RecyclerView.w wVar, int i10) {
        for (int J10 = J() - 1; J10 >= 0; J10--) {
            View I10 = I(J10);
            if (this.f17552u.g(I10) < i10 || this.f17552u.q(I10) < i10) {
                return;
            }
            c cVar = (c) I10.getLayoutParams();
            if (cVar.f17567f) {
                for (int i11 = 0; i11 < this.f17550s; i11++) {
                    if (this.f17551t[i11].f17584a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f17550s; i12++) {
                    this.f17551t[i12].s();
                }
            } else if (cVar.f17566e.f17584a.size() == 1) {
                return;
            } else {
                cVar.f17566e.s();
            }
            m1(I10, wVar);
        }
    }

    private void C2(RecyclerView.w wVar, int i10) {
        while (J() > 0) {
            View I10 = I(0);
            if (this.f17552u.d(I10) > i10 || this.f17552u.p(I10) > i10) {
                return;
            }
            c cVar = (c) I10.getLayoutParams();
            if (cVar.f17567f) {
                for (int i11 = 0; i11 < this.f17550s; i11++) {
                    if (this.f17551t[i11].f17584a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f17550s; i12++) {
                    this.f17551t[i12].t();
                }
            } else if (cVar.f17566e.f17584a.size() == 1) {
                return;
            } else {
                cVar.f17566e.t();
            }
            m1(I10, wVar);
        }
    }

    private void D2() {
        if (this.f17553v.k() == 1073741824) {
            return;
        }
        int J10 = J();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < J10; i10++) {
            View I10 = I(i10);
            float e10 = this.f17553v.e(I10);
            if (e10 >= f10) {
                if (((c) I10.getLayoutParams()).e()) {
                    e10 = (e10 * 1.0f) / this.f17550s;
                }
                f10 = Math.max(f10, e10);
            }
        }
        int i11 = this.f17555x;
        int round = Math.round(f10 * this.f17550s);
        if (this.f17553v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f17553v.n());
        }
        P2(round);
        if (this.f17555x == i11) {
            return;
        }
        for (int i12 = 0; i12 < J10; i12++) {
            View I11 = I(i12);
            c cVar = (c) I11.getLayoutParams();
            if (!cVar.f17567f) {
                if (t2() && this.f17554w == 1) {
                    int i13 = this.f17550s;
                    int i14 = cVar.f17566e.f17588e;
                    I11.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f17555x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f17566e.f17588e;
                    int i16 = this.f17555x * i15;
                    int i17 = i15 * i11;
                    if (this.f17554w == 1) {
                        I11.offsetLeftAndRight(i16 - i17);
                    } else {
                        I11.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    private void E2() {
        if (this.f17554w == 1 || !t2()) {
            this.f17534A = this.f17557z;
        } else {
            this.f17534A = !this.f17557z;
        }
    }

    private void G2(int i10) {
        g gVar = this.f17556y;
        gVar.f17717e = i10;
        gVar.f17716d = this.f17534A != (i10 == -1) ? -1 : 1;
    }

    private void K2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f17550s; i12++) {
            if (!this.f17551t[i12].f17584a.isEmpty()) {
                Q2(this.f17551t[i12], i10, i11);
            }
        }
    }

    private boolean L2(RecyclerView.B b10, b bVar) {
        bVar.f17559a = this.f17540G ? g2(b10.b()) : c2(b10.b());
        bVar.f17560b = Integer.MIN_VALUE;
        return true;
    }

    private void M1(View view) {
        for (int i10 = this.f17550s - 1; i10 >= 0; i10--) {
            this.f17551t[i10].a(view);
        }
    }

    private void N1(b bVar) {
        e eVar = this.f17542I;
        int i10 = eVar.f17576c;
        if (i10 > 0) {
            if (i10 == this.f17550s) {
                for (int i11 = 0; i11 < this.f17550s; i11++) {
                    this.f17551t[i11].e();
                    e eVar2 = this.f17542I;
                    int i12 = eVar2.f17577d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f17582i ? this.f17552u.i() : this.f17552u.m();
                    }
                    this.f17551t[i11].v(i12);
                }
            } else {
                eVar.b();
                e eVar3 = this.f17542I;
                eVar3.f17574a = eVar3.f17575b;
            }
        }
        e eVar4 = this.f17542I;
        this.f17541H = eVar4.f17583j;
        I2(eVar4.f17581h);
        E2();
        e eVar5 = this.f17542I;
        int i13 = eVar5.f17574a;
        if (i13 != -1) {
            this.f17536C = i13;
            bVar.f17561c = eVar5.f17582i;
        } else {
            bVar.f17561c = this.f17534A;
        }
        if (eVar5.f17578e > 1) {
            d dVar = this.f17538E;
            dVar.f17568a = eVar5.f17579f;
            dVar.f17569b = eVar5.f17580g;
        }
    }

    private void O2(int i10, RecyclerView.B b10) {
        int i11;
        int i12;
        int c10;
        g gVar = this.f17556y;
        boolean z10 = false;
        gVar.f17714b = 0;
        gVar.f17715c = i10;
        if (!x0() || (c10 = b10.c()) == -1) {
            i11 = 0;
            i12 = 0;
        } else {
            if (this.f17534A == (c10 < i10)) {
                i11 = this.f17552u.n();
                i12 = 0;
            } else {
                i12 = this.f17552u.n();
                i11 = 0;
            }
        }
        if (M()) {
            this.f17556y.f17718f = this.f17552u.m() - i12;
            this.f17556y.f17719g = this.f17552u.i() + i11;
        } else {
            this.f17556y.f17719g = this.f17552u.h() + i11;
            this.f17556y.f17718f = -i12;
        }
        g gVar2 = this.f17556y;
        gVar2.f17720h = false;
        gVar2.f17713a = true;
        if (this.f17552u.k() == 0 && this.f17552u.h() == 0) {
            z10 = true;
        }
        gVar2.f17721i = z10;
    }

    private void Q1(View view, c cVar, g gVar) {
        if (gVar.f17717e == 1) {
            if (cVar.f17567f) {
                M1(view);
                return;
            } else {
                cVar.f17566e.a(view);
                return;
            }
        }
        if (cVar.f17567f) {
            z2(view);
        } else {
            cVar.f17566e.u(view);
        }
    }

    private void Q2(f fVar, int i10, int i11) {
        int j10 = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + j10 <= i11) {
                this.f17535B.set(fVar.f17588e, false);
            }
        } else if (fVar.k() - j10 >= i11) {
            this.f17535B.set(fVar.f17588e, false);
        }
    }

    private int R1(int i10) {
        if (J() == 0) {
            return this.f17534A ? 1 : -1;
        }
        return (i10 < j2()) != this.f17534A ? -1 : 1;
    }

    private int R2(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private boolean T1(f fVar) {
        if (this.f17534A) {
            if (fVar.k() < this.f17552u.i()) {
                ArrayList arrayList = fVar.f17584a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f17567f;
            }
        } else if (fVar.o() > this.f17552u.m()) {
            return !fVar.n((View) fVar.f17584a.get(0)).f17567f;
        }
        return false;
    }

    private int U1(RecyclerView.B b10) {
        if (J() == 0) {
            return 0;
        }
        return m.a(b10, this.f17552u, e2(!this.f17547N), d2(!this.f17547N), this, this.f17547N);
    }

    private int V1(RecyclerView.B b10) {
        if (J() == 0) {
            return 0;
        }
        return m.b(b10, this.f17552u, e2(!this.f17547N), d2(!this.f17547N), this, this.f17547N, this.f17534A);
    }

    private int W1(RecyclerView.B b10) {
        if (J() == 0) {
            return 0;
        }
        return m.c(b10, this.f17552u, e2(!this.f17547N), d2(!this.f17547N), this, this.f17547N);
    }

    private int X1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f17554w == 1) ? 1 : Integer.MIN_VALUE : this.f17554w == 0 ? 1 : Integer.MIN_VALUE : this.f17554w == 1 ? -1 : Integer.MIN_VALUE : this.f17554w == 0 ? -1 : Integer.MIN_VALUE : (this.f17554w != 1 && t2()) ? -1 : 1 : (this.f17554w != 1 && t2()) ? 1 : -1;
    }

    private d.a Y1(int i10) {
        d.a aVar = new d.a();
        aVar.f17572c = new int[this.f17550s];
        for (int i11 = 0; i11 < this.f17550s; i11++) {
            aVar.f17572c[i11] = i10 - this.f17551t[i11].l(i10);
        }
        return aVar;
    }

    private d.a Z1(int i10) {
        d.a aVar = new d.a();
        aVar.f17572c = new int[this.f17550s];
        for (int i11 = 0; i11 < this.f17550s; i11++) {
            aVar.f17572c[i11] = this.f17551t[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void a2() {
        this.f17552u = j.b(this, this.f17554w);
        this.f17553v = j.b(this, 1 - this.f17554w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int b2(RecyclerView.w wVar, g gVar, RecyclerView.B b10) {
        f fVar;
        int e10;
        int i10;
        int i11;
        int e11;
        boolean z10;
        ?? r92 = 0;
        this.f17535B.set(0, this.f17550s, true);
        int i12 = this.f17556y.f17721i ? gVar.f17717e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : gVar.f17717e == 1 ? gVar.f17719g + gVar.f17714b : gVar.f17718f - gVar.f17714b;
        K2(gVar.f17717e, i12);
        int i13 = this.f17534A ? this.f17552u.i() : this.f17552u.m();
        boolean z11 = false;
        while (gVar.a(b10) && (this.f17556y.f17721i || !this.f17535B.isEmpty())) {
            View b11 = gVar.b(wVar);
            c cVar = (c) b11.getLayoutParams();
            int a10 = cVar.a();
            int g10 = this.f17538E.g(a10);
            boolean z12 = g10 == -1 ? true : r92;
            if (z12) {
                fVar = cVar.f17567f ? this.f17551t[r92] : p2(gVar);
                this.f17538E.n(a10, fVar);
            } else {
                fVar = this.f17551t[g10];
            }
            f fVar2 = fVar;
            cVar.f17566e = fVar2;
            if (gVar.f17717e == 1) {
                d(b11);
            } else {
                e(b11, r92);
            }
            v2(b11, cVar, r92);
            if (gVar.f17717e == 1) {
                int l22 = cVar.f17567f ? l2(i13) : fVar2.l(i13);
                int e12 = this.f17552u.e(b11) + l22;
                if (z12 && cVar.f17567f) {
                    d.a Y12 = Y1(l22);
                    Y12.f17571b = -1;
                    Y12.f17570a = a10;
                    this.f17538E.a(Y12);
                }
                i10 = e12;
                e10 = l22;
            } else {
                int o22 = cVar.f17567f ? o2(i13) : fVar2.p(i13);
                e10 = o22 - this.f17552u.e(b11);
                if (z12 && cVar.f17567f) {
                    d.a Z12 = Z1(o22);
                    Z12.f17571b = 1;
                    Z12.f17570a = a10;
                    this.f17538E.a(Z12);
                }
                i10 = o22;
            }
            if (cVar.f17567f && gVar.f17716d == -1) {
                if (z12) {
                    this.f17546M = true;
                } else {
                    if (!(gVar.f17717e == 1 ? O1() : P1())) {
                        d.a f10 = this.f17538E.f(a10);
                        if (f10 != null) {
                            f10.f17573d = true;
                        }
                        this.f17546M = true;
                    }
                }
            }
            Q1(b11, cVar, gVar);
            if (t2() && this.f17554w == 1) {
                int i14 = cVar.f17567f ? this.f17553v.i() : this.f17553v.i() - (((this.f17550s - 1) - fVar2.f17588e) * this.f17555x);
                e11 = i14;
                i11 = i14 - this.f17553v.e(b11);
            } else {
                int m10 = cVar.f17567f ? this.f17553v.m() : (fVar2.f17588e * this.f17555x) + this.f17553v.m();
                i11 = m10;
                e11 = this.f17553v.e(b11) + m10;
            }
            if (this.f17554w == 1) {
                z0(b11, i11, e10, e11, i10);
            } else {
                z0(b11, e10, i11, i10, e11);
            }
            if (cVar.f17567f) {
                K2(this.f17556y.f17717e, i12);
            } else {
                Q2(fVar2, this.f17556y.f17717e, i12);
            }
            A2(wVar, this.f17556y);
            if (this.f17556y.f17720h && b11.hasFocusable()) {
                if (cVar.f17567f) {
                    this.f17535B.clear();
                } else {
                    z10 = false;
                    this.f17535B.set(fVar2.f17588e, false);
                    r92 = z10;
                    z11 = true;
                }
            }
            z10 = false;
            r92 = z10;
            z11 = true;
        }
        int i15 = r92;
        if (!z11) {
            A2(wVar, this.f17556y);
        }
        int m11 = this.f17556y.f17717e == -1 ? this.f17552u.m() - o2(this.f17552u.m()) : l2(this.f17552u.i()) - this.f17552u.i();
        return m11 > 0 ? Math.min(gVar.f17714b, m11) : i15;
    }

    private int c2(int i10) {
        int J10 = J();
        for (int i11 = 0; i11 < J10; i11++) {
            int h02 = h0(I(i11));
            if (h02 >= 0 && h02 < i10) {
                return h02;
            }
        }
        return 0;
    }

    private int g2(int i10) {
        for (int J10 = J() - 1; J10 >= 0; J10--) {
            int h02 = h0(I(J10));
            if (h02 >= 0 && h02 < i10) {
                return h02;
            }
        }
        return 0;
    }

    private void h2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int i10;
        int l22 = l2(Integer.MIN_VALUE);
        if (l22 != Integer.MIN_VALUE && (i10 = this.f17552u.i() - l22) > 0) {
            int i11 = i10 - (-F2(-i10, wVar, b10));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f17552u.r(i11);
        }
    }

    private void i2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int m10;
        int o22 = o2(Integer.MAX_VALUE);
        if (o22 != Integer.MAX_VALUE && (m10 = o22 - this.f17552u.m()) > 0) {
            int F22 = m10 - F2(m10, wVar, b10);
            if (!z10 || F22 <= 0) {
                return;
            }
            this.f17552u.r(-F22);
        }
    }

    private int l2(int i10) {
        int l10 = this.f17551t[0].l(i10);
        for (int i11 = 1; i11 < this.f17550s; i11++) {
            int l11 = this.f17551t[i11].l(i10);
            if (l11 > l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int m2(int i10) {
        int p10 = this.f17551t[0].p(i10);
        for (int i11 = 1; i11 < this.f17550s; i11++) {
            int p11 = this.f17551t[i11].p(i10);
            if (p11 > p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private int n2(int i10) {
        int l10 = this.f17551t[0].l(i10);
        for (int i11 = 1; i11 < this.f17550s; i11++) {
            int l11 = this.f17551t[i11].l(i10);
            if (l11 < l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int o2(int i10) {
        int p10 = this.f17551t[0].p(i10);
        for (int i11 = 1; i11 < this.f17550s; i11++) {
            int p11 = this.f17551t[i11].p(i10);
            if (p11 < p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private f p2(g gVar) {
        int i10;
        int i11;
        int i12;
        if (x2(gVar.f17717e)) {
            i11 = this.f17550s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f17550s;
            i11 = 0;
            i12 = 1;
        }
        f fVar = null;
        if (gVar.f17717e == 1) {
            int m10 = this.f17552u.m();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                f fVar2 = this.f17551t[i11];
                int l10 = fVar2.l(m10);
                if (l10 < i13) {
                    fVar = fVar2;
                    i13 = l10;
                }
                i11 += i12;
            }
            return fVar;
        }
        int i14 = this.f17552u.i();
        int i15 = Integer.MIN_VALUE;
        while (i11 != i10) {
            f fVar3 = this.f17551t[i11];
            int p10 = fVar3.p(i14);
            if (p10 > i15) {
                fVar = fVar3;
                i15 = p10;
            }
            i11 += i12;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void q2(int i10, int i11, int i12) {
        int i13;
        int i14;
        int k22 = this.f17534A ? k2() : j2();
        if (i12 != 8) {
            i13 = i10 + i11;
        } else {
            if (i10 >= i11) {
                i13 = i10 + 1;
                i14 = i11;
                this.f17538E.h(i14);
                if (i12 != 1) {
                    this.f17538E.j(i10, i11);
                } else if (i12 == 2) {
                    this.f17538E.k(i10, i11);
                } else if (i12 == 8) {
                    this.f17538E.k(i10, 1);
                    this.f17538E.j(i11, 1);
                }
                if (i13 > k22) {
                    return;
                }
                if (i14 <= (this.f17534A ? j2() : k2())) {
                    t1();
                    return;
                }
                return;
            }
            i13 = i11 + 1;
        }
        i14 = i10;
        this.f17538E.h(i14);
        if (i12 != 1) {
        }
        if (i13 > k22) {
        }
    }

    private void u2(View view, int i10, int i11, boolean z10) {
        j(view, this.f17544K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f17544K;
        int R22 = R2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f17544K;
        int R23 = R2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? H1(view, R22, R23, cVar) : F1(view, R22, R23, cVar)) {
            view.measure(R22, R23);
        }
    }

    private void v2(View view, c cVar, boolean z10) {
        if (cVar.f17567f) {
            if (this.f17554w == 1) {
                u2(view, this.f17543J, RecyclerView.p.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                u2(view, RecyclerView.p.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f17543J, z10);
                return;
            }
        }
        if (this.f17554w == 1) {
            u2(view, RecyclerView.p.K(this.f17555x, p0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            u2(view, RecyclerView.p.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.K(this.f17555x, X(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        if (S1() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void w2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        e eVar;
        b bVar = this.f17545L;
        if (!(this.f17542I == null && this.f17536C == -1) && b10.b() == 0) {
            k1(wVar);
            bVar.c();
            return;
        }
        boolean z11 = true;
        boolean z12 = (bVar.f17563e && this.f17536C == -1 && this.f17542I == null) ? false : true;
        if (z12) {
            bVar.c();
            if (this.f17542I != null) {
                N1(bVar);
            } else {
                E2();
                bVar.f17561c = this.f17534A;
            }
            N2(b10, bVar);
            bVar.f17563e = true;
        }
        if (this.f17542I == null && this.f17536C == -1 && (bVar.f17561c != this.f17540G || t2() != this.f17541H)) {
            this.f17538E.b();
            bVar.f17562d = true;
        }
        if (J() > 0 && ((eVar = this.f17542I) == null || eVar.f17576c < 1)) {
            if (bVar.f17562d) {
                for (int i10 = 0; i10 < this.f17550s; i10++) {
                    this.f17551t[i10].e();
                    int i11 = bVar.f17560b;
                    if (i11 != Integer.MIN_VALUE) {
                        this.f17551t[i10].v(i11);
                    }
                }
            } else if (z12 || this.f17545L.f17564f == null) {
                for (int i12 = 0; i12 < this.f17550s; i12++) {
                    this.f17551t[i12].b(this.f17534A, bVar.f17560b);
                }
                this.f17545L.d(this.f17551t);
            } else {
                for (int i13 = 0; i13 < this.f17550s; i13++) {
                    f fVar = this.f17551t[i13];
                    fVar.e();
                    fVar.v(this.f17545L.f17564f[i13]);
                }
            }
        }
        w(wVar);
        this.f17556y.f17713a = false;
        this.f17546M = false;
        P2(this.f17553v.n());
        O2(bVar.f17559a, b10);
        if (bVar.f17561c) {
            G2(-1);
            b2(wVar, this.f17556y, b10);
            G2(1);
            g gVar = this.f17556y;
            gVar.f17715c = bVar.f17559a + gVar.f17716d;
            b2(wVar, gVar, b10);
        } else {
            G2(1);
            b2(wVar, this.f17556y, b10);
            G2(-1);
            g gVar2 = this.f17556y;
            gVar2.f17715c = bVar.f17559a + gVar2.f17716d;
            b2(wVar, gVar2, b10);
        }
        D2();
        if (J() > 0) {
            if (this.f17534A) {
                h2(wVar, b10, true);
                i2(wVar, b10, false);
            } else {
                i2(wVar, b10, true);
                h2(wVar, b10, false);
            }
        }
        if (z10 && !b10.e() && this.f17539F != 0 && J() > 0 && (this.f17546M || r2() != null)) {
            o1(this.f17549P);
        }
        z11 = false;
        if (b10.e()) {
            this.f17545L.c();
        }
        this.f17540G = bVar.f17561c;
        this.f17541H = t2();
        if (z11) {
            this.f17545L.c();
            w2(wVar, b10, false);
        }
    }

    private boolean x2(int i10) {
        if (this.f17554w == 0) {
            return (i10 == -1) != this.f17534A;
        }
        return ((i10 == -1) == this.f17534A) == t2();
    }

    private void z2(View view) {
        for (int i10 = this.f17550s - 1; i10 >= 0; i10--) {
            this.f17551t[i10].u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C0(int i10) {
        super.C0(i10);
        for (int i11 = 0; i11 < this.f17550s; i11++) {
            this.f17551t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C1(Rect rect, int i10, int i11) {
        int n10;
        int n11;
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f17554w == 1) {
            n11 = RecyclerView.p.n(i11, rect.height() + g02, b0());
            n10 = RecyclerView.p.n(i10, (this.f17555x * this.f17550s) + e02, c0());
        } else {
            n10 = RecyclerView.p.n(i10, rect.width() + e02, c0());
            n11 = RecyclerView.p.n(i11, (this.f17555x * this.f17550s) + g02, b0());
        }
        B1(n10, n11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return this.f17554w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D0(int i10) {
        super.D0(i10);
        for (int i11 = 0; i11 < this.f17550s; i11++) {
            this.f17551t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void E0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f17538E.b();
        for (int i10 = 0; i10 < this.f17550s; i10++) {
            this.f17551t[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    int F2(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        y2(i10, b10);
        int b22 = b2(wVar, this.f17556y, b10);
        if (this.f17556y.f17714b >= b22) {
            i10 = i10 < 0 ? -b22 : b22;
        }
        this.f17552u.r(-i10);
        this.f17540G = this.f17534A;
        g gVar = this.f17556y;
        gVar.f17714b = 0;
        A2(wVar, gVar);
        return i10;
    }

    public void H2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        g(null);
        if (i10 == this.f17554w) {
            return;
        }
        this.f17554w = i10;
        j jVar = this.f17552u;
        this.f17552u = this.f17553v;
        this.f17553v = jVar;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.I0(recyclerView, wVar);
        o1(this.f17549P);
        for (int i10 = 0; i10 < this.f17550s; i10++) {
            this.f17551t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        h hVar = new h(recyclerView.getContext());
        hVar.p(i10);
        J1(hVar);
    }

    public void I2(boolean z10) {
        g(null);
        e eVar = this.f17542I;
        if (eVar != null && eVar.f17581h != z10) {
            eVar.f17581h = z10;
        }
        this.f17557z = z10;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View J0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        View B10;
        View m10;
        if (J() == 0 || (B10 = B(view)) == null) {
            return null;
        }
        E2();
        int X12 = X1(i10);
        if (X12 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) B10.getLayoutParams();
        boolean z10 = cVar.f17567f;
        f fVar = cVar.f17566e;
        int k22 = X12 == 1 ? k2() : j2();
        O2(k22, b10);
        G2(X12);
        g gVar = this.f17556y;
        gVar.f17715c = gVar.f17716d + k22;
        gVar.f17714b = (int) (this.f17552u.n() * 0.33333334f);
        g gVar2 = this.f17556y;
        gVar2.f17720h = true;
        gVar2.f17713a = false;
        b2(wVar, gVar2, b10);
        this.f17540G = this.f17534A;
        if (!z10 && (m10 = fVar.m(k22, X12)) != null && m10 != B10) {
            return m10;
        }
        if (x2(X12)) {
            for (int i11 = this.f17550s - 1; i11 >= 0; i11--) {
                View m11 = this.f17551t[i11].m(k22, X12);
                if (m11 != null && m11 != B10) {
                    return m11;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f17550s; i12++) {
                View m12 = this.f17551t[i12].m(k22, X12);
                if (m12 != null && m12 != B10) {
                    return m12;
                }
            }
        }
        boolean z11 = (this.f17557z ^ true) == (X12 == -1);
        if (!z10) {
            View C10 = C(z11 ? fVar.f() : fVar.g());
            if (C10 != null && C10 != B10) {
                return C10;
            }
        }
        if (x2(X12)) {
            for (int i13 = this.f17550s - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f17588e) {
                    View C11 = C(z11 ? this.f17551t[i13].f() : this.f17551t[i13].g());
                    if (C11 != null && C11 != B10) {
                        return C11;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f17550s; i14++) {
                View C12 = C(z11 ? this.f17551t[i14].f() : this.f17551t[i14].g());
                if (C12 != null && C12 != B10) {
                    return C12;
                }
            }
        }
        return null;
    }

    public void J2(int i10) {
        g(null);
        if (i10 != this.f17550s) {
            s2();
            this.f17550s = i10;
            this.f17535B = new BitSet(this.f17550s);
            this.f17551t = new f[this.f17550s];
            for (int i11 = 0; i11 < this.f17550s; i11++) {
                this.f17551t[i11] = new f(i11);
            }
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            View e22 = e2(false);
            View d22 = d2(false);
            if (e22 == null || d22 == null) {
                return;
            }
            int h02 = h0(e22);
            int h03 = h0(d22);
            if (h02 < h03) {
                accessibilityEvent.setFromIndex(h02);
                accessibilityEvent.setToIndex(h03);
            } else {
                accessibilityEvent.setFromIndex(h03);
                accessibilityEvent.setToIndex(h02);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean L1() {
        return this.f17542I == null;
    }

    boolean M2(RecyclerView.B b10, b bVar) {
        int i10;
        if (!b10.e() && (i10 = this.f17536C) != -1) {
            if (i10 >= 0 && i10 < b10.b()) {
                e eVar = this.f17542I;
                if (eVar == null || eVar.f17574a == -1 || eVar.f17576c < 1) {
                    View C10 = C(this.f17536C);
                    if (C10 != null) {
                        bVar.f17559a = this.f17534A ? k2() : j2();
                        if (this.f17537D != Integer.MIN_VALUE) {
                            if (bVar.f17561c) {
                                bVar.f17560b = (this.f17552u.i() - this.f17537D) - this.f17552u.d(C10);
                            } else {
                                bVar.f17560b = (this.f17552u.m() + this.f17537D) - this.f17552u.g(C10);
                            }
                            return true;
                        }
                        if (this.f17552u.e(C10) > this.f17552u.n()) {
                            bVar.f17560b = bVar.f17561c ? this.f17552u.i() : this.f17552u.m();
                            return true;
                        }
                        int g10 = this.f17552u.g(C10) - this.f17552u.m();
                        if (g10 < 0) {
                            bVar.f17560b = -g10;
                            return true;
                        }
                        int i11 = this.f17552u.i() - this.f17552u.d(C10);
                        if (i11 < 0) {
                            bVar.f17560b = i11;
                            return true;
                        }
                        bVar.f17560b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.f17536C;
                        bVar.f17559a = i12;
                        int i13 = this.f17537D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f17561c = R1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f17562d = true;
                    }
                } else {
                    bVar.f17560b = Integer.MIN_VALUE;
                    bVar.f17559a = this.f17536C;
                }
                return true;
            }
            this.f17536C = -1;
            this.f17537D = Integer.MIN_VALUE;
        }
        return false;
    }

    void N2(RecyclerView.B b10, b bVar) {
        if (M2(b10, bVar) || L2(b10, bVar)) {
            return;
        }
        bVar.a();
        bVar.f17559a = 0;
    }

    boolean O1() {
        int l10 = this.f17551t[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f17550s; i10++) {
            if (this.f17551t[i10].l(Integer.MIN_VALUE) != l10) {
                return false;
            }
        }
        return true;
    }

    boolean P1() {
        int p10 = this.f17551t[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f17550s; i10++) {
            if (this.f17551t[i10].p(Integer.MIN_VALUE) != p10) {
                return false;
            }
        }
        return true;
    }

    void P2(int i10) {
        this.f17555x = i10 / this.f17550s;
        this.f17543J = View.MeasureSpec.makeMeasureSpec(i10, this.f17553v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView, int i10, int i11) {
        q2(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView) {
        this.f17538E.b();
        t1();
    }

    boolean S1() {
        int j22;
        int k22;
        if (J() == 0 || this.f17539F == 0 || !r0()) {
            return false;
        }
        if (this.f17534A) {
            j22 = k2();
            k22 = j2();
        } else {
            j22 = j2();
            k22 = k2();
        }
        if (j22 == 0 && r2() != null) {
            this.f17538E.b();
            u1();
            t1();
            return true;
        }
        if (!this.f17546M) {
            return false;
        }
        int i10 = this.f17534A ? -1 : 1;
        int i11 = k22 + 1;
        d.a e10 = this.f17538E.e(j22, i11, i10, true);
        if (e10 == null) {
            this.f17546M = false;
            this.f17538E.d(i11);
            return false;
        }
        d.a e11 = this.f17538E.e(j22, e10.f17570a, i10 * (-1), true);
        if (e11 == null) {
            this.f17538E.d(e10.f17570a);
        } else {
            this.f17538E.d(e11.f17570a + 1);
        }
        u1();
        t1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        q2(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i10, int i11) {
        q2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        q2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.w wVar, RecyclerView.B b10) {
        w2(wVar, b10, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.B b10) {
        super.Y0(b10);
        this.f17536C = -1;
        this.f17537D = Integer.MIN_VALUE;
        this.f17542I = null;
        this.f17545L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF a(int i10) {
        int R12 = R1(i10);
        PointF pointF = new PointF();
        if (R12 == 0) {
            return null;
        }
        if (this.f17554w == 0) {
            pointF.x = R12;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = R12;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f17542I = eVar;
            if (this.f17536C != -1) {
                eVar.a();
                this.f17542I.b();
            }
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable d1() {
        int p10;
        int m10;
        int[] iArr;
        if (this.f17542I != null) {
            return new e(this.f17542I);
        }
        e eVar = new e();
        eVar.f17581h = this.f17557z;
        eVar.f17582i = this.f17540G;
        eVar.f17583j = this.f17541H;
        d dVar = this.f17538E;
        if (dVar == null || (iArr = dVar.f17568a) == null) {
            eVar.f17578e = 0;
        } else {
            eVar.f17579f = iArr;
            eVar.f17578e = iArr.length;
            eVar.f17580g = dVar.f17569b;
        }
        if (J() > 0) {
            eVar.f17574a = this.f17540G ? k2() : j2();
            eVar.f17575b = f2();
            int i10 = this.f17550s;
            eVar.f17576c = i10;
            eVar.f17577d = new int[i10];
            for (int i11 = 0; i11 < this.f17550s; i11++) {
                if (this.f17540G) {
                    p10 = this.f17551t[i11].l(Integer.MIN_VALUE);
                    if (p10 != Integer.MIN_VALUE) {
                        m10 = this.f17552u.i();
                        p10 -= m10;
                        eVar.f17577d[i11] = p10;
                    } else {
                        eVar.f17577d[i11] = p10;
                    }
                } else {
                    p10 = this.f17551t[i11].p(Integer.MIN_VALUE);
                    if (p10 != Integer.MIN_VALUE) {
                        m10 = this.f17552u.m();
                        p10 -= m10;
                        eVar.f17577d[i11] = p10;
                    } else {
                        eVar.f17577d[i11] = p10;
                    }
                }
            }
        } else {
            eVar.f17574a = -1;
            eVar.f17575b = -1;
            eVar.f17576c = 0;
        }
        return eVar;
    }

    View d2(boolean z10) {
        int m10 = this.f17552u.m();
        int i10 = this.f17552u.i();
        View view = null;
        for (int J10 = J() - 1; J10 >= 0; J10--) {
            View I10 = I(J10);
            int g10 = this.f17552u.g(I10);
            int d10 = this.f17552u.d(I10);
            if (d10 > m10 && g10 < i10) {
                if (d10 <= i10 || !z10) {
                    return I10;
                }
                if (view == null) {
                    view = I10;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(int i10) {
        if (i10 == 0) {
            S1();
        }
    }

    View e2(boolean z10) {
        int m10 = this.f17552u.m();
        int i10 = this.f17552u.i();
        int J10 = J();
        View view = null;
        for (int i11 = 0; i11 < J10; i11++) {
            View I10 = I(i11);
            int g10 = this.f17552u.g(I10);
            if (this.f17552u.d(I10) > m10 && g10 < i10) {
                if (g10 >= m10 || !z10) {
                    return I10;
                }
                if (view == null) {
                    view = I10;
                }
            }
        }
        return view;
    }

    int f2() {
        View d22 = this.f17534A ? d2(true) : e2(true);
        if (d22 == null) {
            return -1;
        }
        return h0(d22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(String str) {
        if (this.f17542I == null) {
            super.g(str);
        }
    }

    int j2() {
        if (J() == 0) {
            return 0;
        }
        return h0(I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean k() {
        return this.f17554w == 0;
    }

    int k2() {
        int J10 = J();
        if (J10 == 0) {
            return 0;
        }
        return h0(I(J10 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.f17554w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o(int i10, int i11, RecyclerView.B b10, RecyclerView.p.c cVar) {
        int l10;
        int i12;
        if (this.f17554w != 0) {
            i10 = i11;
        }
        if (J() == 0 || i10 == 0) {
            return;
        }
        y2(i10, b10);
        int[] iArr = this.f17548O;
        if (iArr == null || iArr.length < this.f17550s) {
            this.f17548O = new int[this.f17550s];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f17550s; i14++) {
            g gVar = this.f17556y;
            if (gVar.f17716d == -1) {
                l10 = gVar.f17718f;
                i12 = this.f17551t[i14].p(l10);
            } else {
                l10 = this.f17551t[i14].l(gVar.f17719g);
                i12 = this.f17556y.f17719g;
            }
            int i15 = l10 - i12;
            if (i15 >= 0) {
                this.f17548O[i13] = i15;
                i13++;
            }
        }
        Arrays.sort(this.f17548O, 0, i13);
        for (int i16 = 0; i16 < i13 && this.f17556y.a(b10); i16++) {
            cVar.a(this.f17556y.f17715c, this.f17548O[i16]);
            g gVar2 = this.f17556y;
            gVar2.f17715c += gVar2.f17716d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q(RecyclerView.B b10) {
        return U1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.B b10) {
        return V1(b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    View r2() {
        int i10;
        int J10 = J();
        int i11 = J10 - 1;
        BitSet bitSet = new BitSet(this.f17550s);
        bitSet.set(0, this.f17550s, true);
        char c10 = (this.f17554w == 1 && t2()) ? (char) 1 : (char) 65535;
        if (this.f17534A) {
            J10 = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11 < J10 ? 1 : -1;
        while (i11 != J10) {
            View I10 = I(i11);
            c cVar = (c) I10.getLayoutParams();
            if (bitSet.get(cVar.f17566e.f17588e)) {
                if (T1(cVar.f17566e)) {
                    return I10;
                }
                bitSet.clear(cVar.f17566e.f17588e);
            }
            if (!cVar.f17567f && (i10 = i11 + i12) != J10) {
                View I11 = I(i10);
                if (this.f17534A) {
                    int d10 = this.f17552u.d(I10);
                    int d11 = this.f17552u.d(I11);
                    if (d10 < d11) {
                        return I10;
                    }
                    if (d10 != d11) {
                        continue;
                    }
                    if ((cVar.f17566e.f17588e - ((c) I11.getLayoutParams()).f17566e.f17588e >= 0) == (c10 >= 0)) {
                        return I10;
                    }
                } else {
                    int g10 = this.f17552u.g(I10);
                    int g11 = this.f17552u.g(I11);
                    if (g10 > g11) {
                        return I10;
                    }
                    if (g10 != g11) {
                        continue;
                    }
                    if ((cVar.f17566e.f17588e - ((c) I11.getLayoutParams()).f17566e.f17588e >= 0) == (c10 >= 0)) {
                    }
                }
            }
            i11 += i12;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.B b10) {
        return W1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s0() {
        return this.f17539F != 0;
    }

    public void s2() {
        this.f17538E.b();
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.B b10) {
        return U1(b10);
    }

    boolean t2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.B b10) {
        return V1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.B b10) {
        return W1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        return F2(i10, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void x1(int i10) {
        e eVar = this.f17542I;
        if (eVar != null && eVar.f17574a != i10) {
            eVar.a();
        }
        this.f17536C = i10;
        this.f17537D = Integer.MIN_VALUE;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        return F2(i10, wVar, b10);
    }

    void y2(int i10, RecyclerView.B b10) {
        int j22;
        int i11;
        if (i10 > 0) {
            j22 = k2();
            i11 = 1;
        } else {
            j22 = j2();
            i11 = -1;
        }
        this.f17556y.f17713a = true;
        O2(j22, b10);
        G2(i11);
        g gVar = this.f17556y;
        gVar.f17715c = j22 + gVar.f17716d;
        gVar.f17714b = Math.abs(i10);
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        int[] f17568a;

        /* renamed from: b, reason: collision with root package name */
        List f17569b;

        d() {
        }

        private int i(int i10) {
            if (this.f17569b == null) {
                return -1;
            }
            a f10 = f(i10);
            if (f10 != null) {
                this.f17569b.remove(f10);
            }
            int size = this.f17569b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (((a) this.f17569b.get(i11)).f17570a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = (a) this.f17569b.get(i11);
            this.f17569b.remove(i11);
            return aVar.f17570a;
        }

        private void l(int i10, int i11) {
            List list = this.f17569b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f17569b.get(size);
                int i12 = aVar.f17570a;
                if (i12 >= i10) {
                    aVar.f17570a = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List list = this.f17569b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f17569b.get(size);
                int i13 = aVar.f17570a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f17569b.remove(size);
                    } else {
                        aVar.f17570a = i13 - i11;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f17569b == null) {
                this.f17569b = new ArrayList();
            }
            int size = this.f17569b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = (a) this.f17569b.get(i10);
                if (aVar2.f17570a == aVar.f17570a) {
                    this.f17569b.remove(i10);
                }
                if (aVar2.f17570a >= aVar.f17570a) {
                    this.f17569b.add(i10, aVar);
                    return;
                }
            }
            this.f17569b.add(aVar);
        }

        void b() {
            int[] iArr = this.f17568a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f17569b = null;
        }

        void c(int i10) {
            int[] iArr = this.f17568a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f17568a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f17568a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f17568a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List list = this.f17569b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f17569b.get(size)).f17570a >= i10) {
                        this.f17569b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List list = this.f17569b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = (a) this.f17569b.get(i13);
                int i14 = aVar.f17570a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f17571b == i12 || (z10 && aVar.f17573d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List list = this.f17569b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f17569b.get(size);
                if (aVar.f17570a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f17568a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f17568a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f17568a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f17568a.length;
            }
            int min = Math.min(i11 + 1, this.f17568a.length);
            Arrays.fill(this.f17568a, i10, min, -1);
            return min;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f17568a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f17568a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f17568a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f17568a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f17568a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f17568a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        void n(int i10, f fVar) {
            c(i10);
            this.f17568a[i10] = fVar.f17588e;
        }

        int o(int i10) {
            int length = this.f17568a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0298a();

            /* renamed from: a, reason: collision with root package name */
            int f17570a;

            /* renamed from: b, reason: collision with root package name */
            int f17571b;

            /* renamed from: c, reason: collision with root package name */
            int[] f17572c;

            /* renamed from: d, reason: collision with root package name */
            boolean f17573d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C0298a implements Parcelable.Creator {
                C0298a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a(Parcel parcel) {
                this.f17570a = parcel.readInt();
                this.f17571b = parcel.readInt();
                this.f17573d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f17572c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f17572c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f17570a + ", mGapDir=" + this.f17571b + ", mHasUnwantedGapAfter=" + this.f17573d + ", mGapPerSpan=" + Arrays.toString(this.f17572c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f17570a);
                parcel.writeInt(this.f17571b);
                parcel.writeInt(this.f17573d ? 1 : 0);
                int[] iArr = this.f17572c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f17572c);
                }
            }

            a() {
            }
        }
    }
}
