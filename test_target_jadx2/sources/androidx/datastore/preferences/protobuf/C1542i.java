package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1558z;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.r0;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1542i implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1541h f16383a;

    /* renamed from: b, reason: collision with root package name */
    private int f16384b;

    /* renamed from: c, reason: collision with root package name */
    private int f16385c;

    /* renamed from: d, reason: collision with root package name */
    private int f16386d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16387a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f16387a = iArr;
            try {
                iArr[r0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16387a[r0.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16387a[r0.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16387a[r0.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16387a[r0.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16387a[r0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16387a[r0.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16387a[r0.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16387a[r0.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16387a[r0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16387a[r0.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16387a[r0.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16387a[r0.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16387a[r0.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16387a[r0.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16387a[r0.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16387a[r0.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C1542i(AbstractC1541h abstractC1541h) {
        AbstractC1541h abstractC1541h2 = (AbstractC1541h) AbstractC1557y.b(abstractC1541h, "input");
        this.f16383a = abstractC1541h2;
        abstractC1541h2.f16361d = this;
    }

    public static C1542i O(AbstractC1541h abstractC1541h) {
        C1542i c1542i = abstractC1541h.f16361d;
        return c1542i != null ? c1542i : new C1542i(abstractC1541h);
    }

    private void P(Object obj, f0 f0Var, C1548o c1548o) {
        int i10 = this.f16385c;
        this.f16385c = r0.c(r0.a(this.f16384b), 4);
        try {
            f0Var.h(obj, this, c1548o);
            if (this.f16384b == this.f16385c) {
            } else {
                throw C1558z.h();
            }
        } finally {
            this.f16385c = i10;
        }
    }

    private void Q(Object obj, f0 f0Var, C1548o c1548o) {
        int D10 = this.f16383a.D();
        AbstractC1541h abstractC1541h = this.f16383a;
        if (abstractC1541h.f16358a >= abstractC1541h.f16359b) {
            throw C1558z.i();
        }
        int m10 = abstractC1541h.m(D10);
        this.f16383a.f16358a++;
        f0Var.h(obj, this, c1548o);
        this.f16383a.a(0);
        r5.f16358a--;
        this.f16383a.l(m10);
    }

    private Object R(r0.b bVar, Class cls, C1548o c1548o) {
        switch (a.f16387a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(i());
            case 2:
                return C();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(s());
            case 5:
                return Integer.valueOf(h());
            case 6:
                return Long.valueOf(d());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(E());
            case 9:
                return Long.valueOf(L());
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return U(cls, c1548o);
            case 11:
                return Integer.valueOf(H());
            case 12:
                return Long.valueOf(j());
            case 13:
                return Integer.valueOf(v());
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return Long.valueOf(w());
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return M();
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return Integer.valueOf(l());
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return Long.valueOf(c());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private Object S(f0 f0Var, C1548o c1548o) {
        Object b10 = f0Var.b();
        P(b10, f0Var, c1548o);
        f0Var.e(b10);
        return b10;
    }

    private Object T(f0 f0Var, C1548o c1548o) {
        Object b10 = f0Var.b();
        Q(b10, f0Var, c1548o);
        f0Var.e(b10);
        return b10;
    }

    private void W(int i10) {
        if (this.f16383a.e() != i10) {
            throw C1558z.m();
        }
    }

    private void X(int i10) {
        if (r0.b(this.f16384b) != i10) {
            throw C1558z.e();
        }
    }

    private void Y(int i10) {
        if ((i10 & 3) != 0) {
            throw C1558z.h();
        }
    }

    private void Z(int i10) {
        if ((i10 & 7) != 0) {
            throw C1558z.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void A(List list) {
        V(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void B(List list) {
        V(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public AbstractC1540g C() {
        X(2);
        return this.f16383a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void D(List list) {
        int C10;
        if (list instanceof AbstractC1553u) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 != 2) {
                if (b10 != 5) {
                    throw C1558z.e();
                }
                this.f16383a.t();
                throw null;
            }
            Y(this.f16383a.D());
            this.f16383a.e();
            this.f16383a.t();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 2) {
            int D10 = this.f16383a.D();
            Y(D10);
            int e10 = this.f16383a.e() + D10;
            do {
                list.add(Float.valueOf(this.f16383a.t()));
            } while (this.f16383a.e() < e10);
            return;
        }
        if (b11 != 5) {
            throw C1558z.e();
        }
        do {
            list.add(Float.valueOf(this.f16383a.t()));
            if (this.f16383a.f()) {
                return;
            } else {
                C10 = this.f16383a.C();
            }
        } while (C10 == this.f16384b);
        this.f16386d = C10;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int E() {
        X(0);
        return this.f16383a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void F(List list, f0 f0Var, C1548o c1548o) {
        int C10;
        if (r0.b(this.f16384b) != 3) {
            throw C1558z.e();
        }
        int i10 = this.f16384b;
        do {
            list.add(S(f0Var, c1548o));
            if (this.f16383a.f() || this.f16386d != 0) {
                return;
            } else {
                C10 = this.f16383a.C();
            }
        } while (C10 == i10);
        this.f16386d = C10;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean G() {
        int i10;
        if (this.f16383a.f() || (i10 = this.f16384b) == this.f16385c) {
            return false;
        }
        return this.f16383a.F(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int H() {
        X(5);
        return this.f16383a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void I(List list) {
        int C10;
        if (r0.b(this.f16384b) != 2) {
            throw C1558z.e();
        }
        do {
            list.add(C());
            if (this.f16383a.f()) {
                return;
            } else {
                C10 = this.f16383a.C();
            }
        } while (C10 == this.f16384b);
        this.f16386d = C10;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void J(List list) {
        int C10;
        if (list instanceof AbstractC1545l) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 == 1) {
                this.f16383a.p();
                throw null;
            }
            if (b10 != 2) {
                throw C1558z.e();
            }
            Z(this.f16383a.D());
            this.f16383a.e();
            this.f16383a.p();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 1) {
            do {
                list.add(Double.valueOf(this.f16383a.p()));
                if (this.f16383a.f()) {
                    return;
                } else {
                    C10 = this.f16383a.C();
                }
            } while (C10 == this.f16384b);
            this.f16386d = C10;
            return;
        }
        if (b11 != 2) {
            throw C1558z.e();
        }
        int D10 = this.f16383a.D();
        Z(D10);
        int e10 = this.f16383a.e() + D10;
        do {
            list.add(Double.valueOf(this.f16383a.p()));
        } while (this.f16383a.e() < e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void K(List list, f0 f0Var, C1548o c1548o) {
        int C10;
        if (r0.b(this.f16384b) != 2) {
            throw C1558z.e();
        }
        int i10 = this.f16384b;
        do {
            list.add(T(f0Var, c1548o));
            if (this.f16383a.f() || this.f16386d != 0) {
                return;
            } else {
                C10 = this.f16383a.C();
            }
        } while (C10 == i10);
        this.f16386d = C10;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long L() {
        X(0);
        return this.f16383a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public String M() {
        X(2);
        return this.f16383a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void N(List list) {
        int C10;
        if (list instanceof G) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 == 1) {
                this.f16383a.s();
                throw null;
            }
            if (b10 != 2) {
                throw C1558z.e();
            }
            Z(this.f16383a.D());
            this.f16383a.e();
            this.f16383a.s();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 1) {
            do {
                list.add(Long.valueOf(this.f16383a.s()));
                if (this.f16383a.f()) {
                    return;
                } else {
                    C10 = this.f16383a.C();
                }
            } while (C10 == this.f16384b);
            this.f16386d = C10;
            return;
        }
        if (b11 != 2) {
            throw C1558z.e();
        }
        int D10 = this.f16383a.D();
        Z(D10);
        int e10 = this.f16383a.e() + D10;
        do {
            list.add(Long.valueOf(this.f16383a.s()));
        } while (this.f16383a.e() < e10);
    }

    public Object U(Class cls, C1548o c1548o) {
        X(2);
        return T(b0.a().c(cls), c1548o);
    }

    public void V(List list, boolean z10) {
        int C10;
        int C11;
        if (r0.b(this.f16384b) != 2) {
            throw C1558z.e();
        }
        if (!(list instanceof C) || z10) {
            do {
                list.add(z10 ? M() : y());
                if (this.f16383a.f()) {
                    return;
                } else {
                    C10 = this.f16383a.C();
                }
            } while (C10 == this.f16384b);
            this.f16386d = C10;
            return;
        }
        C c10 = (C) list;
        do {
            c10.A0(C());
            if (this.f16383a.f()) {
                return;
            } else {
                C11 = this.f16383a.C();
            }
        } while (C11 == this.f16384b);
        this.f16386d = C11;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int a() {
        return this.f16384b;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(List list) {
        int C10;
        if (list instanceof AbstractC1556x) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 == 0) {
                this.f16383a.y();
                throw null;
            }
            if (b10 != 2) {
                throw C1558z.e();
            }
            this.f16383a.D();
            this.f16383a.e();
            this.f16383a.y();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 0) {
            do {
                list.add(Integer.valueOf(this.f16383a.y()));
                if (this.f16383a.f()) {
                    return;
                } else {
                    C10 = this.f16383a.C();
                }
            } while (C10 == this.f16384b);
            this.f16386d = C10;
            return;
        }
        if (b11 != 2) {
            throw C1558z.e();
        }
        int e10 = this.f16383a.e() + this.f16383a.D();
        do {
            list.add(Integer.valueOf(this.f16383a.y()));
        } while (this.f16383a.e() < e10);
        W(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long c() {
        X(0);
        return this.f16383a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long d() {
        X(1);
        return this.f16383a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void e(List list) {
        int C10;
        if (list instanceof AbstractC1556x) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 != 2) {
                if (b10 != 5) {
                    throw C1558z.e();
                }
                this.f16383a.w();
                throw null;
            }
            Y(this.f16383a.D());
            this.f16383a.e();
            this.f16383a.w();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 2) {
            int D10 = this.f16383a.D();
            Y(D10);
            int e10 = this.f16383a.e() + D10;
            do {
                list.add(Integer.valueOf(this.f16383a.w()));
            } while (this.f16383a.e() < e10);
            return;
        }
        if (b11 != 5) {
            throw C1558z.e();
        }
        do {
            list.add(Integer.valueOf(this.f16383a.w()));
            if (this.f16383a.f()) {
                return;
            } else {
                C10 = this.f16383a.C();
            }
        } while (C10 == this.f16384b);
        this.f16386d = C10;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void f(List list) {
        int C10;
        if (list instanceof G) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 == 0) {
                this.f16383a.z();
                throw null;
            }
            if (b10 != 2) {
                throw C1558z.e();
            }
            this.f16383a.D();
            this.f16383a.e();
            this.f16383a.z();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 0) {
            do {
                list.add(Long.valueOf(this.f16383a.z()));
                if (this.f16383a.f()) {
                    return;
                } else {
                    C10 = this.f16383a.C();
                }
            } while (C10 == this.f16384b);
            this.f16386d = C10;
            return;
        }
        if (b11 != 2) {
            throw C1558z.e();
        }
        int e10 = this.f16383a.e() + this.f16383a.D();
        do {
            list.add(Long.valueOf(this.f16383a.z()));
        } while (this.f16383a.e() < e10);
        W(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void g(List list) {
        int C10;
        if (list instanceof AbstractC1556x) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 == 0) {
                this.f16383a.D();
                throw null;
            }
            if (b10 != 2) {
                throw C1558z.e();
            }
            this.f16383a.D();
            this.f16383a.e();
            this.f16383a.D();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 0) {
            do {
                list.add(Integer.valueOf(this.f16383a.D()));
                if (this.f16383a.f()) {
                    return;
                } else {
                    C10 = this.f16383a.C();
                }
            } while (C10 == this.f16384b);
            this.f16386d = C10;
            return;
        }
        if (b11 != 2) {
            throw C1558z.e();
        }
        int e10 = this.f16383a.e() + this.f16383a.D();
        do {
            list.add(Integer.valueOf(this.f16383a.D()));
        } while (this.f16383a.e() < e10);
        W(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int h() {
        X(5);
        return this.f16383a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean i() {
        X(0);
        return this.f16383a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long j() {
        X(1);
        return this.f16383a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void k(List list) {
        int C10;
        if (list instanceof G) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 == 0) {
                this.f16383a.E();
                throw null;
            }
            if (b10 != 2) {
                throw C1558z.e();
            }
            this.f16383a.D();
            this.f16383a.e();
            this.f16383a.E();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 0) {
            do {
                list.add(Long.valueOf(this.f16383a.E()));
                if (this.f16383a.f()) {
                    return;
                } else {
                    C10 = this.f16383a.C();
                }
            } while (C10 == this.f16384b);
            this.f16386d = C10;
            return;
        }
        if (b11 != 2) {
            throw C1558z.e();
        }
        int e10 = this.f16383a.e() + this.f16383a.D();
        do {
            list.add(Long.valueOf(this.f16383a.E()));
        } while (this.f16383a.e() < e10);
        W(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int l() {
        X(0);
        return this.f16383a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void m(List list) {
        int C10;
        if (list instanceof G) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 == 0) {
                this.f16383a.v();
                throw null;
            }
            if (b10 != 2) {
                throw C1558z.e();
            }
            this.f16383a.D();
            this.f16383a.e();
            this.f16383a.v();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 0) {
            do {
                list.add(Long.valueOf(this.f16383a.v()));
                if (this.f16383a.f()) {
                    return;
                } else {
                    C10 = this.f16383a.C();
                }
            } while (C10 == this.f16384b);
            this.f16386d = C10;
            return;
        }
        if (b11 != 2) {
            throw C1558z.e();
        }
        int e10 = this.f16383a.e() + this.f16383a.D();
        do {
            list.add(Long.valueOf(this.f16383a.v()));
        } while (this.f16383a.e() < e10);
        W(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void n(List list) {
        int C10;
        if (list instanceof G) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 == 1) {
                this.f16383a.x();
                throw null;
            }
            if (b10 != 2) {
                throw C1558z.e();
            }
            Z(this.f16383a.D());
            this.f16383a.e();
            this.f16383a.x();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 1) {
            do {
                list.add(Long.valueOf(this.f16383a.x()));
                if (this.f16383a.f()) {
                    return;
                } else {
                    C10 = this.f16383a.C();
                }
            } while (C10 == this.f16384b);
            this.f16386d = C10;
            return;
        }
        if (b11 != 2) {
            throw C1558z.e();
        }
        int D10 = this.f16383a.D();
        Z(D10);
        int e10 = this.f16383a.e() + D10;
        do {
            list.add(Long.valueOf(this.f16383a.x()));
        } while (this.f16383a.e() < e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void o(Object obj, f0 f0Var, C1548o c1548o) {
        X(2);
        Q(obj, f0Var, c1548o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void p(List list) {
        int C10;
        if (list instanceof AbstractC1556x) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 == 0) {
                this.f16383a.u();
                throw null;
            }
            if (b10 != 2) {
                throw C1558z.e();
            }
            this.f16383a.D();
            this.f16383a.e();
            this.f16383a.u();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 0) {
            do {
                list.add(Integer.valueOf(this.f16383a.u()));
                if (this.f16383a.f()) {
                    return;
                } else {
                    C10 = this.f16383a.C();
                }
            } while (C10 == this.f16384b);
            this.f16386d = C10;
            return;
        }
        if (b11 != 2) {
            throw C1558z.e();
        }
        int e10 = this.f16383a.e() + this.f16383a.D();
        do {
            list.add(Integer.valueOf(this.f16383a.u()));
        } while (this.f16383a.e() < e10);
        W(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void q(List list) {
        int C10;
        if (list instanceof AbstractC1556x) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 == 0) {
                this.f16383a.q();
                throw null;
            }
            if (b10 != 2) {
                throw C1558z.e();
            }
            this.f16383a.D();
            this.f16383a.e();
            this.f16383a.q();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 0) {
            do {
                list.add(Integer.valueOf(this.f16383a.q()));
                if (this.f16383a.f()) {
                    return;
                } else {
                    C10 = this.f16383a.C();
                }
            } while (C10 == this.f16384b);
            this.f16386d = C10;
            return;
        }
        if (b11 != 2) {
            throw C1558z.e();
        }
        int e10 = this.f16383a.e() + this.f16383a.D();
        do {
            list.add(Integer.valueOf(this.f16383a.q()));
        } while (this.f16383a.e() < e10);
        W(e10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.f16383a.l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(Map map, I.a aVar, C1548o c1548o) {
        X(2);
        int m10 = this.f16383a.m(this.f16383a.D());
        Object obj = aVar.f16298b;
        Object obj2 = aVar.f16300d;
        while (true) {
            try {
                int z10 = z();
                if (z10 == Integer.MAX_VALUE || this.f16383a.f()) {
                    break;
                }
                if (z10 == 1) {
                    obj = R(aVar.f16297a, null, null);
                } else if (z10 != 2) {
                    try {
                        if (!G()) {
                            throw new C1558z("Unable to parse map entry.");
                        }
                    } catch (C1558z.a unused) {
                        if (!G()) {
                            throw new C1558z("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj2 = R(aVar.f16299c, aVar.f16300d.getClass(), c1548o);
                }
            } catch (Throwable th) {
                this.f16383a.l(m10);
                throw th;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public double readDouble() {
        X(1);
        return this.f16383a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public float readFloat() {
        X(5);
        return this.f16383a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int s() {
        X(0);
        return this.f16383a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void t(Object obj, f0 f0Var, C1548o c1548o) {
        X(3);
        P(obj, f0Var, c1548o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void u(List list) {
        int C10;
        if (list instanceof AbstractC1556x) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 != 2) {
                if (b10 != 5) {
                    throw C1558z.e();
                }
                this.f16383a.r();
                throw null;
            }
            Y(this.f16383a.D());
            this.f16383a.e();
            this.f16383a.r();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 2) {
            int D10 = this.f16383a.D();
            Y(D10);
            int e10 = this.f16383a.e() + D10;
            do {
                list.add(Integer.valueOf(this.f16383a.r()));
            } while (this.f16383a.e() < e10);
            return;
        }
        if (b11 != 5) {
            throw C1558z.e();
        }
        do {
            list.add(Integer.valueOf(this.f16383a.r()));
            if (this.f16383a.f()) {
                return;
            } else {
                C10 = this.f16383a.C();
            }
        } while (C10 == this.f16384b);
        this.f16386d = C10;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int v() {
        X(0);
        return this.f16383a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long w() {
        X(0);
        return this.f16383a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void x(List list) {
        int C10;
        if (list instanceof AbstractC1538e) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f16384b);
            if (b10 == 0) {
                this.f16383a.n();
                throw null;
            }
            if (b10 != 2) {
                throw C1558z.e();
            }
            this.f16383a.D();
            this.f16383a.e();
            this.f16383a.n();
            throw null;
        }
        int b11 = r0.b(this.f16384b);
        if (b11 == 0) {
            do {
                list.add(Boolean.valueOf(this.f16383a.n()));
                if (this.f16383a.f()) {
                    return;
                } else {
                    C10 = this.f16383a.C();
                }
            } while (C10 == this.f16384b);
            this.f16386d = C10;
            return;
        }
        if (b11 != 2) {
            throw C1558z.e();
        }
        int e10 = this.f16383a.e() + this.f16383a.D();
        do {
            list.add(Boolean.valueOf(this.f16383a.n()));
        } while (this.f16383a.e() < e10);
        W(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public String y() {
        X(2);
        return this.f16383a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int z() {
        int i10 = this.f16386d;
        if (i10 != 0) {
            this.f16384b = i10;
            this.f16386d = 0;
        } else {
            this.f16384b = this.f16383a.C();
        }
        int i11 = this.f16384b;
        if (i11 == 0 || i11 == this.f16385c) {
            return Integer.MAX_VALUE;
        }
        return r0.a(i11);
    }
}
