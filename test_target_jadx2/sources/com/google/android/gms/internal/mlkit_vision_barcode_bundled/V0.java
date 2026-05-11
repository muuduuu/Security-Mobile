package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class V0 {

    /* renamed from: d, reason: collision with root package name */
    private static final V0 f24817d = new V0(true);

    /* renamed from: a, reason: collision with root package name */
    final AbstractC2524v2 f24818a = new C2475l2(16);

    /* renamed from: b, reason: collision with root package name */
    private boolean f24819b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24820c;

    private V0() {
    }

    public static int a(U0 u02, Object obj) {
        int j10;
        int A10;
        P2 f10 = u02.f();
        int zza = u02.zza();
        u02.i();
        int A11 = M0.A(zza << 3);
        if (f10 == P2.zzj) {
            byte[] bArr = AbstractC2489o1.f24887d;
            A11 += A11;
        }
        Q2 q22 = Q2.INT;
        int i10 = 4;
        switch (f10.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i10 = 8;
                return A11 + i10;
            case 1:
                ((Float) obj).floatValue();
                return A11 + i10;
            case 2:
                i10 = M0.B(((Long) obj).longValue());
                return A11 + i10;
            case 3:
                i10 = M0.B(((Long) obj).longValue());
                return A11 + i10;
            case 4:
                i10 = M0.w(((Integer) obj).intValue());
                return A11 + i10;
            case 5:
                ((Long) obj).longValue();
                i10 = 8;
                return A11 + i10;
            case 6:
                ((Integer) obj).intValue();
                return A11 + i10;
            case 7:
                ((Boolean) obj).booleanValue();
                i10 = 1;
                return A11 + i10;
            case 8:
                if (!(obj instanceof E0)) {
                    i10 = M0.z((String) obj);
                    return A11 + i10;
                }
                j10 = ((E0) obj).j();
                A10 = M0.A(j10);
                i10 = A10 + j10;
                return A11 + i10;
            case 9:
                i10 = ((P1) obj).x();
                return A11 + i10;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                i10 = M0.x((P1) obj);
                return A11 + i10;
            case 11:
                if (obj instanceof E0) {
                    j10 = ((E0) obj).j();
                    A10 = M0.A(j10);
                } else {
                    j10 = ((byte[]) obj).length;
                    A10 = M0.A(j10);
                }
                i10 = A10 + j10;
                return A11 + i10;
            case 12:
                i10 = M0.A(((Integer) obj).intValue());
                return A11 + i10;
            case 13:
                i10 = obj instanceof InterfaceC2454h1 ? M0.w(((InterfaceC2454h1) obj).zza()) : M0.w(((Integer) obj).intValue());
                return A11 + i10;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                ((Integer) obj).intValue();
                return A11 + i10;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                ((Long) obj).longValue();
                i10 = 8;
                return A11 + i10;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                int intValue = ((Integer) obj).intValue();
                i10 = M0.A((intValue >> 31) ^ (intValue + intValue));
                return A11 + i10;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                long longValue = ((Long) obj).longValue();
                i10 = M0.B((longValue >> 63) ^ (longValue + longValue));
                return A11 + i10;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static V0 d() {
        return f24817d;
    }

    private static Object l(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void m(Map.Entry entry) {
        U0 u02 = (U0) entry.getKey();
        Object value = entry.getValue();
        u02.i();
        if (u02.g() != Q2.MESSAGE) {
            this.f24818a.put(u02, l(value));
            return;
        }
        Object e10 = e(u02);
        if (e10 == null) {
            this.f24818a.put(u02, l(value));
            return;
        }
        O1 D10 = ((P1) e10).D();
        u02.m(D10, (P1) value);
        this.f24818a.put(u02, D10.r());
    }

    private static boolean n(Map.Entry entry) {
        U0 u02 = (U0) entry.getKey();
        if (u02.g() != Q2.MESSAGE) {
            return true;
        }
        u02.i();
        Object value = entry.getValue();
        if (value instanceof Q1) {
            return ((Q1) value).z();
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int o(Map.Entry entry) {
        U0 u02 = (U0) entry.getKey();
        Object value = entry.getValue();
        if (u02.g() != Q2.MESSAGE) {
            return a(u02, value);
        }
        u02.i();
        u02.h();
        int A10 = M0.A(((U0) entry.getKey()).zza());
        int A11 = M0.A(24) + M0.x((P1) value);
        int A12 = M0.A(16);
        int A13 = M0.A(8);
        return A13 + A13 + A12 + A10 + A11;
    }

    public final int b() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f24818a.b(); i11++) {
            i10 += o(this.f24818a.g(i11));
        }
        Iterator it = this.f24818a.c().iterator();
        while (it.hasNext()) {
            i10 += o((Map.Entry) it.next());
        }
        return i10;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final V0 clone() {
        V0 v02 = new V0();
        for (int i10 = 0; i10 < this.f24818a.b(); i10++) {
            Map.Entry g10 = this.f24818a.g(i10);
            v02.i((U0) g10.getKey(), g10.getValue());
        }
        for (Map.Entry entry : this.f24818a.c()) {
            v02.i((U0) entry.getKey(), entry.getValue());
        }
        v02.f24820c = this.f24820c;
        return v02;
    }

    public final Object e(U0 u02) {
        return this.f24818a.get(u02);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V0) {
            return this.f24818a.equals(((V0) obj).f24818a);
        }
        return false;
    }

    public final Iterator f() {
        return this.f24820c ? new C2513t1(this.f24818a.entrySet().iterator()) : this.f24818a.entrySet().iterator();
    }

    public final void g() {
        if (this.f24819b) {
            return;
        }
        for (int i10 = 0; i10 < this.f24818a.b(); i10++) {
            Map.Entry g10 = this.f24818a.g(i10);
            if (g10.getValue() instanceof AbstractC2444f1) {
                ((AbstractC2444f1) g10.getValue()).q();
            }
        }
        this.f24818a.a();
        this.f24819b = true;
    }

    public final void h(V0 v02) {
        for (int i10 = 0; i10 < v02.f24818a.b(); i10++) {
            m(v02.f24818a.g(i10));
        }
        Iterator it = v02.f24818a.c().iterator();
        while (it.hasNext()) {
            m((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f24818a.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2454h1) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r0 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(U0 u02, Object obj) {
        boolean z10;
        u02.i();
        u02.f();
        byte[] bArr = AbstractC2489o1.f24887d;
        obj.getClass();
        P2 p22 = P2.zza;
        Q2 q22 = Q2.INT;
        switch (r0.zza()) {
            case INT:
                z10 = obj instanceof Integer;
                break;
            case LONG:
                z10 = obj instanceof Long;
                break;
            case FLOAT:
                z10 = obj instanceof Float;
                break;
            case DOUBLE:
                z10 = obj instanceof Double;
                break;
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                break;
            case STRING:
                z10 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof E0)) {
                    break;
                }
                this.f24818a.put(u02, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                this.f24818a.put(u02, obj);
                return;
            case MESSAGE:
                break;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(u02.zza()), u02.f().zza(), obj.getClass().getName()));
        }
    }

    public final boolean j() {
        return this.f24819b;
    }

    public final boolean k() {
        for (int i10 = 0; i10 < this.f24818a.b(); i10++) {
            if (!n(this.f24818a.g(i10))) {
                return false;
            }
        }
        Iterator it = this.f24818a.c().iterator();
        while (it.hasNext()) {
            if (!n((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private V0(boolean z10) {
        g();
        g();
    }
}
