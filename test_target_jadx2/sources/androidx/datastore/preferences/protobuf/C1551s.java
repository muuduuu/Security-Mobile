package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1551s {

    /* renamed from: d, reason: collision with root package name */
    private static final C1551s f16463d = new C1551s(true);

    /* renamed from: a, reason: collision with root package name */
    private final i0 f16464a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16465b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16466c;

    /* renamed from: androidx.datastore.preferences.protobuf.s$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16467a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f16468b;

        static {
            int[] iArr = new int[r0.b.values().length];
            f16468b = iArr;
            try {
                iArr[r0.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16468b[r0.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16468b[r0.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16468b[r0.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16468b[r0.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16468b[r0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16468b[r0.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16468b[r0.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16468b[r0.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16468b[r0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16468b[r0.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16468b[r0.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16468b[r0.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16468b[r0.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16468b[r0.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16468b[r0.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16468b[r0.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16468b[r0.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            f16467a = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f16467a[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f16467a[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f16467a[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f16467a[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f16467a[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f16467a[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f16467a[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f16467a[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface b extends Comparable {
        int getNumber();

        boolean isPacked();

        boolean j();

        r0.b k();
    }

    private C1551s() {
        this.f16464a = i0.r();
    }

    static int b(r0.b bVar, int i10, Object obj) {
        int O10 = AbstractC1543j.O(i10);
        if (bVar == r0.b.GROUP) {
            O10 *= 2;
        }
        return O10 + c(bVar, obj);
    }

    static int c(r0.b bVar, Object obj) {
        switch (a.f16468b[bVar.ordinal()]) {
            case 1:
                return AbstractC1543j.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC1543j.q(((Float) obj).floatValue());
            case 3:
                return AbstractC1543j.x(((Long) obj).longValue());
            case 4:
                return AbstractC1543j.S(((Long) obj).longValue());
            case 5:
                return AbstractC1543j.v(((Integer) obj).intValue());
            case 6:
                return AbstractC1543j.o(((Long) obj).longValue());
            case 7:
                return AbstractC1543j.m(((Integer) obj).intValue());
            case 8:
                return AbstractC1543j.d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC1543j.s((P) obj);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return AbstractC1543j.A((P) obj);
            case 11:
                return obj instanceof AbstractC1540g ? AbstractC1543j.g((AbstractC1540g) obj) : AbstractC1543j.N((String) obj);
            case 12:
                return obj instanceof AbstractC1540g ? AbstractC1543j.g((AbstractC1540g) obj) : AbstractC1543j.e((byte[]) obj);
            case 13:
                return AbstractC1543j.Q(((Integer) obj).intValue());
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return AbstractC1543j.F(((Integer) obj).intValue());
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return AbstractC1543j.H(((Long) obj).longValue());
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return AbstractC1543j.J(((Integer) obj).intValue());
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return AbstractC1543j.L(((Long) obj).longValue());
            case 18:
                return AbstractC1543j.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        r0.b k10 = bVar.k();
        int number = bVar.getNumber();
        if (!bVar.j()) {
            return b(k10, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.isPacked()) {
            int i11 = 0;
            while (i10 < size) {
                i11 += b(k10, number, list.get(i10));
                i10++;
            }
            return i11;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i12 = 0;
        while (i10 < size) {
            i12 += c(k10, list.get(i10));
            i10++;
        }
        return AbstractC1543j.O(number) + i12 + AbstractC1543j.Q(i12);
    }

    private int g(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(r0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.getWireType();
    }

    private static boolean l(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        throw null;
    }

    private static boolean m(r0.b bVar, Object obj) {
        AbstractC1557y.a(obj);
        switch (a.f16467a[bVar.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC1540g) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof P;
            default:
                return false;
        }
    }

    private void q(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static C1551s r() {
        return new C1551s();
    }

    private void t(b bVar, Object obj) {
        if (!m(bVar.k(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.getNumber()), bVar.k().getJavaType(), obj.getClass().getName()));
        }
    }

    static void u(AbstractC1543j abstractC1543j, r0.b bVar, int i10, Object obj) {
        if (bVar == r0.b.GROUP) {
            abstractC1543j.q0(i10, (P) obj);
        } else {
            abstractC1543j.M0(i10, i(bVar, false));
            v(abstractC1543j, bVar, obj);
        }
    }

    static void v(AbstractC1543j abstractC1543j, r0.b bVar, Object obj) {
        switch (a.f16468b[bVar.ordinal()]) {
            case 1:
                abstractC1543j.h0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC1543j.p0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC1543j.x0(((Long) obj).longValue());
                break;
            case 4:
                abstractC1543j.Q0(((Long) obj).longValue());
                break;
            case 5:
                abstractC1543j.v0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC1543j.n0(((Long) obj).longValue());
                break;
            case 7:
                abstractC1543j.l0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC1543j.b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC1543j.s0((P) obj);
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                abstractC1543j.z0((P) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC1540g)) {
                    abstractC1543j.L0((String) obj);
                    break;
                } else {
                    abstractC1543j.f0((AbstractC1540g) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC1540g)) {
                    abstractC1543j.c0((byte[]) obj);
                    break;
                } else {
                    abstractC1543j.f0((AbstractC1540g) obj);
                    break;
                }
            case 13:
                abstractC1543j.O0(((Integer) obj).intValue());
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                abstractC1543j.D0(((Integer) obj).intValue());
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                abstractC1543j.F0(((Long) obj).longValue());
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                abstractC1543j.H0(((Integer) obj).intValue());
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                abstractC1543j.J0(((Long) obj).longValue());
                break;
            case 18:
                abstractC1543j.j0(((Integer) obj).intValue());
                break;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1551s clone() {
        C1551s r10 = r();
        int l10 = this.f16464a.l();
        for (int i10 = 0; i10 < l10; i10++) {
            Map.Entry j10 = this.f16464a.j(i10);
            android.support.v4.media.session.b.a(j10.getKey());
            r10.s(null, j10.getValue());
        }
        for (Map.Entry entry : this.f16464a.n()) {
            android.support.v4.media.session.b.a(entry.getKey());
            r10.s(null, entry.getValue());
        }
        r10.f16466c = this.f16466c;
        return r10;
    }

    Iterator e() {
        return j() ? Collections.emptyIterator() : this.f16466c ? new B(this.f16464a.h().iterator()) : this.f16464a.h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1551s) {
            return this.f16464a.equals(((C1551s) obj).f16464a);
        }
        return false;
    }

    public int f() {
        int l10 = this.f16464a.l();
        int i10 = 0;
        for (int i11 = 0; i11 < l10; i11++) {
            i10 += g(this.f16464a.j(i11));
        }
        Iterator it = this.f16464a.n().iterator();
        while (it.hasNext()) {
            i10 += g((Map.Entry) it.next());
        }
        return i10;
    }

    public int h() {
        int l10 = this.f16464a.l();
        int i10 = 0;
        for (int i11 = 0; i11 < l10; i11++) {
            Map.Entry j10 = this.f16464a.j(i11);
            android.support.v4.media.session.b.a(j10.getKey());
            i10 += d(null, j10.getValue());
        }
        for (Map.Entry entry : this.f16464a.n()) {
            android.support.v4.media.session.b.a(entry.getKey());
            i10 += d(null, entry.getValue());
        }
        return i10;
    }

    public int hashCode() {
        return this.f16464a.hashCode();
    }

    boolean j() {
        return this.f16464a.isEmpty();
    }

    public boolean k() {
        int l10 = this.f16464a.l();
        for (int i10 = 0; i10 < l10; i10++) {
            if (!l(this.f16464a.j(i10))) {
                return false;
            }
        }
        Iterator it = this.f16464a.n().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return j() ? Collections.emptyIterator() : this.f16466c ? new B(this.f16464a.entrySet().iterator()) : this.f16464a.entrySet().iterator();
    }

    public void o() {
        if (this.f16465b) {
            return;
        }
        int l10 = this.f16464a.l();
        for (int i10 = 0; i10 < l10; i10++) {
            Map.Entry j10 = this.f16464a.j(i10);
            if (j10.getValue() instanceof AbstractC1555w) {
                ((AbstractC1555w) j10.getValue()).z();
            }
        }
        this.f16464a.q();
        this.f16465b = true;
    }

    public void p(C1551s c1551s) {
        int l10 = c1551s.f16464a.l();
        for (int i10 = 0; i10 < l10; i10++) {
            q(c1551s.f16464a.j(i10));
        }
        Iterator it = c1551s.f16464a.n().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public void s(b bVar, Object obj) {
        if (!bVar.j()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f16464a.s(bVar, obj);
    }

    private C1551s(boolean z10) {
        this(i0.r());
        o();
    }

    private C1551s(i0 i0Var) {
        this.f16464a = i0Var;
        o();
    }
}
