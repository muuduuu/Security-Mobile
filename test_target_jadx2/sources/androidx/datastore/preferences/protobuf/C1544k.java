package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import com.appsflyer.attribution.RequestError;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1544k implements s0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1543j f16415a;

    /* renamed from: androidx.datastore.preferences.protobuf.k$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16416a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f16416a = iArr;
            try {
                iArr[r0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16416a[r0.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16416a[r0.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16416a[r0.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16416a[r0.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16416a[r0.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16416a[r0.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16416a[r0.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16416a[r0.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16416a[r0.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16416a[r0.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16416a[r0.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C1544k(AbstractC1543j abstractC1543j) {
        AbstractC1543j abstractC1543j2 = (AbstractC1543j) AbstractC1557y.b(abstractC1543j, "output");
        this.f16415a = abstractC1543j2;
        abstractC1543j2.f16408a = this;
    }

    public static C1544k P(AbstractC1543j abstractC1543j) {
        C1544k c1544k = abstractC1543j.f16408a;
        return c1544k != null ? c1544k : new C1544k(abstractC1543j);
    }

    private void Q(int i10, AbstractC1538e abstractC1538e, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void R(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.a0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.d(((Boolean) list.get(i13)).booleanValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.b0(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    private void S(int i10, boolean z10, Object obj, I.a aVar) {
        this.f16415a.M0(i10, 2);
        this.f16415a.O0(I.b(aVar, Boolean.valueOf(z10), obj));
        I.e(this.f16415a, aVar, Boolean.valueOf(z10), obj);
    }

    private void T(int i10, I.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            Object obj = map.get(Integer.valueOf(i13));
            this.f16415a.M0(i10, 2);
            this.f16415a.O0(I.b(aVar, Integer.valueOf(i13), obj));
            I.e(this.f16415a, aVar, Integer.valueOf(i13), obj);
        }
    }

    private void U(int i10, I.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            Object obj = map.get(Long.valueOf(j10));
            this.f16415a.M0(i10, 2);
            this.f16415a.O0(I.b(aVar, Long.valueOf(j10), obj));
            I.e(this.f16415a, aVar, Long.valueOf(j10), obj);
        }
    }

    private void V(int i10, I.a aVar, Map map) {
        switch (a.f16416a[aVar.f16297a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    S(i10, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    S(i10, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                T(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                U(i10, aVar, map);
                return;
            case 12:
                W(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f16297a);
        }
    }

    private void W(int i10, I.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = (String) it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            Object obj = map.get(str);
            this.f16415a.M0(i10, 2);
            this.f16415a.O0(I.b(aVar, str, obj));
            I.e(this.f16415a, aVar, str, obj);
        }
    }

    private void X(int i10, AbstractC1545l abstractC1545l, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void Y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.g0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.i(((Double) list.get(i13)).doubleValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.h0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    private void Z(int i10, AbstractC1556x abstractC1556x, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void a0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.i0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.k(((Integer) list.get(i13)).intValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.j0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void b0(int i10, AbstractC1556x abstractC1556x, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void c0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.k0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.m(((Integer) list.get(i13)).intValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.l0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void d0(int i10, G g10, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void e0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.m0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.o(((Long) list.get(i13)).longValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.n0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void f0(int i10, AbstractC1553u abstractC1553u, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void g0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.o0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.q(((Float) list.get(i13)).floatValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.p0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    private void h0(int i10, AbstractC1556x abstractC1556x, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void i0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.u0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.v(((Integer) list.get(i13)).intValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.v0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void j0(int i10, G g10, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void k0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.w0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.x(((Long) list.get(i13)).longValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.x0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void l0(int i10, Object obj) {
        if (obj instanceof String) {
            this.f16415a.K0(i10, (String) obj);
        } else {
            this.f16415a.e0(i10, (AbstractC1540g) obj);
        }
    }

    private void m0(int i10, AbstractC1556x abstractC1556x, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void n0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.C0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.F(((Integer) list.get(i13)).intValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.D0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void o0(int i10, G g10, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void p0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.E0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.H(((Long) list.get(i13)).longValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.F0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void q0(int i10, AbstractC1556x abstractC1556x, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void s0(int i10, G g10, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void t0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.I0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.L(((Long) list.get(i13)).longValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.J0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void u0(int i10, AbstractC1556x abstractC1556x, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void w0(int i10, G g10, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f16415a.M0(i10, 2);
        throw null;
    }

    private void x0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.P0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.S(((Long) list.get(i13)).longValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.Q0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void A(int i10, float f10) {
        this.f16415a.o0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void B(int i10) {
        this.f16415a.M0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void C(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC1556x)) {
            r0(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            q0(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void D(int i10, int i11) {
        this.f16415a.i0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void E(int i10, List list, boolean z10) {
        if (!(list instanceof G)) {
            k0(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            j0(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void F(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC1556x)) {
            a0(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            Z(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void G(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC1545l)) {
            Y(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            X(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void H(int i10, int i11) {
        this.f16415a.G0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f16415a.e0(i10, (AbstractC1540g) list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void J(int i10, List list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            M(i10, list.get(i11), f0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void K(int i10, List list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            O(i10, list.get(i11), f0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void L(int i10, AbstractC1540g abstractC1540g) {
        this.f16415a.e0(i10, abstractC1540g);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void M(int i10, Object obj, f0 f0Var) {
        this.f16415a.y0(i10, (P) obj, f0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void N(int i10, I.a aVar, Map map) {
        if (this.f16415a.X()) {
            V(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f16415a.M0(i10, 2);
            this.f16415a.O0(I.b(aVar, entry.getKey(), entry.getValue()));
            I.e(this.f16415a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void O(int i10, Object obj, f0 f0Var) {
        this.f16415a.r0(i10, (P) obj, f0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void a(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC1553u)) {
            g0(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            f0(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void b(int i10, int i11) {
        this.f16415a.N0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void c(int i10, Object obj) {
        if (obj instanceof AbstractC1540g) {
            this.f16415a.B0(i10, (AbstractC1540g) obj);
        } else {
            this.f16415a.A0(i10, (P) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void d(int i10, int i11) {
        this.f16415a.k0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void e(int i10, double d10) {
        this.f16415a.g0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void f(int i10, List list, boolean z10) {
        if (!(list instanceof G)) {
            p0(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            o0(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void g(int i10, List list, boolean z10) {
        if (!(list instanceof G)) {
            x0(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            w0(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void h(int i10, long j10) {
        this.f16415a.m0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public s0.a i() {
        return s0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void j(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof C)) {
            while (i11 < list.size()) {
                this.f16415a.K0(i10, (String) list.get(i11));
                i11++;
            }
        } else {
            C c10 = (C) list;
            while (i11 < list.size()) {
                l0(i10, c10.s(i11));
                i11++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void k(int i10, String str) {
        this.f16415a.K0(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void l(int i10, long j10) {
        this.f16415a.P0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void m(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC1556x)) {
            i0(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            h0(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void n(int i10, long j10) {
        this.f16415a.w0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void o(int i10, boolean z10) {
        this.f16415a.a0(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void p(int i10, int i11) {
        this.f16415a.C0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void q(int i10) {
        this.f16415a.M0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void r(int i10, int i11) {
        this.f16415a.u0(i10, i11);
    }

    public void r0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.G0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.J(((Integer) list.get(i13)).intValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.H0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void s(int i10, List list, boolean z10) {
        if (!(list instanceof G)) {
            e0(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            d0(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void t(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC1556x)) {
            n0(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            m0(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void u(int i10, long j10) {
        this.f16415a.E0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void v(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC1556x)) {
            c0(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            b0(i10, null, z10);
        }
    }

    public void v0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16415a.N0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f16415a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1543j.Q(((Integer) list.get(i13)).intValue());
        }
        this.f16415a.O0(i12);
        while (i11 < list.size()) {
            this.f16415a.O0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void w(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC1538e)) {
            R(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            Q(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void x(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC1556x)) {
            v0(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            u0(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void y(int i10, List list, boolean z10) {
        if (!(list instanceof G)) {
            t0(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            s0(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void z(int i10, long j10) {
        this.f16415a.I0(i10, j10);
    }
}
