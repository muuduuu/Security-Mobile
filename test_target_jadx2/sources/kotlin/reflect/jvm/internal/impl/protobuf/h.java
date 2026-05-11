package kotlin.reflect.jvm.internal.impl.protobuf;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.j;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.y;

/* loaded from: classes3.dex */
final class h {

    /* renamed from: d, reason: collision with root package name */
    private static final h f36498d = new h(true);

    /* renamed from: b, reason: collision with root package name */
    private boolean f36500b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36501c = false;

    /* renamed from: a, reason: collision with root package name */
    private final u f36499a = u.o(16);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36502a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f36503b;

        static {
            int[] iArr = new int[y.b.values().length];
            f36503b = iArr;
            try {
                iArr[y.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36503b[y.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36503b[y.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36503b[y.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36503b[y.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36503b[y.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36503b[y.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36503b[y.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36503b[y.b.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36503b[y.b.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f36503b[y.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f36503b[y.b.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f36503b[y.b.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f36503b[y.b.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f36503b[y.b.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f36503b[y.b.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f36503b[y.b.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f36503b[y.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[y.c.values().length];
            f36502a = iArr2;
            try {
                iArr2[y.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f36502a[y.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f36502a[y.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f36502a[y.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f36502a[y.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f36502a[y.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f36502a[y.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f36502a[y.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f36502a[y.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b extends Comparable {
        p.a a(p.a aVar, p pVar);

        int getNumber();

        boolean isPacked();

        boolean j();

        y.b k();

        y.c l();
    }

    private h() {
    }

    private Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int d(y.b bVar, int i10, Object obj) {
        int C10 = f.C(i10);
        if (bVar == y.b.GROUP) {
            C10 *= 2;
        }
        return C10 + e(bVar, obj);
    }

    private static int e(y.b bVar, Object obj) {
        switch (a.f36503b[bVar.ordinal()]) {
            case 1:
                return f.g(((Double) obj).doubleValue());
            case 2:
                return f.m(((Float) obj).floatValue());
            case 3:
                return f.q(((Long) obj).longValue());
            case 4:
                return f.E(((Long) obj).longValue());
            case 5:
                return f.p(((Integer) obj).intValue());
            case 6:
                return f.k(((Long) obj).longValue());
            case 7:
                return f.j(((Integer) obj).intValue());
            case 8:
                return f.b(((Boolean) obj).booleanValue());
            case 9:
                return f.B((String) obj);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return obj instanceof d ? f.e((d) obj) : f.c((byte[]) obj);
            case 11:
                return f.D(((Integer) obj).intValue());
            case 12:
                return f.w(((Integer) obj).intValue());
            case 13:
                return f.x(((Long) obj).longValue());
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return f.y(((Integer) obj).intValue());
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return f.A(((Long) obj).longValue());
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return f.n((p) obj);
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return f.s((p) obj);
            case 18:
                return obj instanceof j.a ? f.i(((j.a) obj).getNumber()) : f.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b bVar, Object obj) {
        y.b k10 = bVar.k();
        int number = bVar.getNumber();
        if (!bVar.j()) {
            return d(k10, number, obj);
        }
        int i10 = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i10 += e(k10, it.next());
            }
            return f.C(number) + i10 + f.u(i10);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i10 += d(k10, number, it2.next());
        }
        return i10;
    }

    public static h g() {
        return f36498d;
    }

    static int l(y.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.getWireType();
    }

    private boolean o(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.l() != y.c.MESSAGE) {
            return true;
        }
        if (!bVar.j()) {
            Object value = entry.getValue();
            if (value instanceof p) {
                return ((p) value).a();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((p) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    private void s(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.j()) {
            Object h10 = h(bVar);
            if (h10 == null) {
                h10 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) h10).add(c(it.next()));
            }
            this.f36499a.p(bVar, h10);
            return;
        }
        if (bVar.l() != y.c.MESSAGE) {
            this.f36499a.p(bVar, c(value));
            return;
        }
        Object h11 = h(bVar);
        if (h11 == null) {
            this.f36499a.p(bVar, c(value));
        } else {
            this.f36499a.p(bVar, bVar.a(((p) h11).b(), (p) value).c());
        }
    }

    public static h t() {
        return new h();
    }

    public static Object u(e eVar, y.b bVar, boolean z10) {
        switch (a.f36503b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.l());
            case 2:
                return Float.valueOf(eVar.p());
            case 3:
                return Long.valueOf(eVar.s());
            case 4:
                return Long.valueOf(eVar.L());
            case 5:
                return Integer.valueOf(eVar.r());
            case 6:
                return Long.valueOf(eVar.o());
            case 7:
                return Integer.valueOf(eVar.n());
            case 8:
                return Boolean.valueOf(eVar.j());
            case 9:
                return z10 ? eVar.I() : eVar.H();
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return eVar.k();
            case 11:
                return Integer.valueOf(eVar.K());
            case 12:
                return Integer.valueOf(eVar.D());
            case 13:
                return Long.valueOf(eVar.E());
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return Integer.valueOf(eVar.F());
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return Long.valueOf(eVar.G());
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.j.a) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void w(y.b bVar, Object obj) {
        obj.getClass();
        boolean z10 = true;
        boolean z11 = false;
        switch (a.f36502a[bVar.getJavaType().ordinal()]) {
            case 1:
                z11 = obj instanceof Integer;
                break;
            case 2:
                z11 = obj instanceof Long;
                break;
            case 3:
                z11 = obj instanceof Float;
                break;
            case 4:
                z11 = obj instanceof Double;
                break;
            case 5:
                z11 = obj instanceof Boolean;
                break;
            case 6:
                z11 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof d)) {
                    break;
                }
                z11 = z10;
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z11 = z10;
                break;
            case 9:
                z11 = obj instanceof p;
                break;
        }
        if (!z11) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static void x(f fVar, y.b bVar, int i10, Object obj) {
        if (bVar == y.b.GROUP) {
            fVar.X(i10, (p) obj);
        } else {
            fVar.v0(i10, l(bVar, false));
            y(fVar, bVar, obj);
        }
    }

    private static void y(f fVar, y.b bVar, Object obj) {
        switch (a.f36503b[bVar.ordinal()]) {
            case 1:
                fVar.Q(((Double) obj).doubleValue());
                break;
            case 2:
                fVar.W(((Float) obj).floatValue());
                break;
            case 3:
                fVar.b0(((Long) obj).longValue());
                break;
            case 4:
                fVar.y0(((Long) obj).longValue());
                break;
            case 5:
                fVar.a0(((Integer) obj).intValue());
                break;
            case 6:
                fVar.U(((Long) obj).longValue());
                break;
            case 7:
                fVar.T(((Integer) obj).intValue());
                break;
            case 8:
                fVar.L(((Boolean) obj).booleanValue());
                break;
            case 9:
                fVar.u0((String) obj);
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                if (!(obj instanceof d)) {
                    fVar.M((byte[]) obj);
                    break;
                } else {
                    fVar.O((d) obj);
                    break;
                }
            case 11:
                fVar.x0(((Integer) obj).intValue());
                break;
            case 12:
                fVar.p0(((Integer) obj).intValue());
                break;
            case 13:
                fVar.q0(((Long) obj).longValue());
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                fVar.r0(((Integer) obj).intValue());
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                fVar.t0(((Long) obj).longValue());
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                fVar.Y((p) obj);
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                fVar.d0((p) obj);
                break;
            case 18:
                if (!(obj instanceof j.a)) {
                    fVar.S(((Integer) obj).intValue());
                    break;
                } else {
                    fVar.S(((j.a) obj).getNumber());
                    break;
                }
        }
    }

    public static void z(b bVar, Object obj, f fVar) {
        y.b k10 = bVar.k();
        int number = bVar.getNumber();
        if (!bVar.j()) {
            x(fVar, k10, number, obj);
            return;
        }
        List list = (List) obj;
        if (!bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(fVar, k10, number, it.next());
            }
            return;
        }
        fVar.v0(number, 2);
        Iterator it2 = list.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            i10 += e(k10, it2.next());
        }
        fVar.n0(i10);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(fVar, k10, it3.next());
        }
    }

    public void a(b bVar, Object obj) {
        List list;
        if (!bVar.j()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        w(bVar.k(), obj);
        Object h10 = h(bVar);
        if (h10 == null) {
            list = new ArrayList();
            this.f36499a.p(bVar, list);
        } else {
            list = (List) h10;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h clone() {
        h t10 = t();
        for (int i10 = 0; i10 < this.f36499a.i(); i10++) {
            Map.Entry h10 = this.f36499a.h(i10);
            t10.v((b) h10.getKey(), h10.getValue());
        }
        for (Map.Entry entry : this.f36499a.j()) {
            t10.v((b) entry.getKey(), entry.getValue());
        }
        t10.f36501c = this.f36501c;
        return t10;
    }

    public Object h(b bVar) {
        return this.f36499a.get(bVar);
    }

    public Object i(b bVar, int i10) {
        if (!bVar.j()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object h10 = h(bVar);
        if (h10 != null) {
            return ((List) h10).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(b bVar) {
        if (!bVar.j()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object h10 = h(bVar);
        if (h10 == null) {
            return 0;
        }
        return ((List) h10).size();
    }

    public int k() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f36499a.i(); i11++) {
            Map.Entry h10 = this.f36499a.h(i11);
            i10 += f((b) h10.getKey(), h10.getValue());
        }
        for (Map.Entry entry : this.f36499a.j()) {
            i10 += f((b) entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public boolean m(b bVar) {
        if (bVar.j()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f36499a.get(bVar) != null;
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f36499a.i(); i10++) {
            if (!o(this.f36499a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f36499a.j().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator p() {
        return this.f36501c ? new l(this.f36499a.entrySet().iterator()) : this.f36499a.entrySet().iterator();
    }

    public void q() {
        if (this.f36500b) {
            return;
        }
        this.f36499a.n();
        this.f36500b = true;
    }

    public void r(h hVar) {
        for (int i10 = 0; i10 < hVar.f36499a.i(); i10++) {
            s(hVar.f36499a.h(i10));
        }
        Iterator it = hVar.f36499a.j().iterator();
        while (it.hasNext()) {
            s((Map.Entry) it.next());
        }
    }

    public void v(b bVar, Object obj) {
        if (!bVar.j()) {
            w(bVar.k(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(bVar.k(), it.next());
            }
            obj = arrayList;
        }
        this.f36499a.p(bVar, obj);
    }

    private h(boolean z10) {
        q();
    }
}
