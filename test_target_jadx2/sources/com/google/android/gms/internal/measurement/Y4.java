package com.google.android.gms.internal.measurement;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class Y4 {

    /* renamed from: d, reason: collision with root package name */
    private static final Y4 f24424d = new Y4(true);

    /* renamed from: a, reason: collision with root package name */
    final AbstractC2192a6 f24425a = new W5();

    /* renamed from: b, reason: collision with root package name */
    private boolean f24426b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24427c;

    private Y4() {
    }

    static void c(O4 o42, EnumC2318o6 enumC2318o6, int i10, Object obj) {
        if (enumC2318o6 == EnumC2318o6.zzj) {
            H5 h52 = (H5) obj;
            AbstractC2308n5.d(h52);
            o42.i(i10, 3);
            h52.d(o42);
            o42.i(i10, 4);
            return;
        }
        o42.i(i10, enumC2318o6.zzb());
        EnumC2327p6 enumC2327p6 = EnumC2327p6.INT;
        switch (enumC2318o6.ordinal()) {
            case 0:
                o42.A(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                o42.y(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                o42.z(((Long) obj).longValue());
                break;
            case 3:
                o42.z(((Long) obj).longValue());
                break;
            case 4:
                o42.w(((Integer) obj).intValue());
                break;
            case 5:
                o42.A(((Long) obj).longValue());
                break;
            case 6:
                o42.y(((Integer) obj).intValue());
                break;
            case 7:
                o42.v(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof J4)) {
                    o42.C((String) obj);
                    break;
                } else {
                    o42.r((J4) obj);
                    break;
                }
            case 9:
                ((H5) obj).d(o42);
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                o42.u((H5) obj);
                break;
            case 11:
                if (!(obj instanceof J4)) {
                    byte[] bArr = (byte[]) obj;
                    o42.s(bArr, 0, bArr.length);
                    break;
                } else {
                    o42.r((J4) obj);
                    break;
                }
            case 12:
                o42.x(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC2263i5)) {
                    o42.w(((Integer) obj).intValue());
                    break;
                } else {
                    o42.w(((InterfaceC2263i5) obj).zza());
                    break;
                }
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                o42.y(((Integer) obj).intValue());
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                o42.A(((Long) obj).longValue());
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                int intValue = ((Integer) obj).intValue();
                o42.x((intValue >> 31) ^ (intValue + intValue));
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                long longValue = ((Long) obj).longValue();
                o42.z((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    static int d(EnumC2318o6 enumC2318o6, int i10, Object obj) {
        int E10 = O4.E(i10 << 3);
        if (enumC2318o6 == EnumC2318o6.zzj) {
            AbstractC2308n5.d((H5) obj);
            E10 += E10;
        }
        return E10 + e(enumC2318o6, obj);
    }

    static int e(EnumC2318o6 enumC2318o6, Object obj) {
        int h10;
        int E10;
        EnumC2318o6 enumC2318o62 = EnumC2318o6.zza;
        EnumC2327p6 enumC2327p6 = EnumC2327p6.INT;
        switch (enumC2318o6.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i10 = O4.f24319d;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i11 = O4.f24319d;
                return 4;
            case 2:
                return O4.a(((Long) obj).longValue());
            case 3:
                return O4.a(((Long) obj).longValue());
            case 4:
                return O4.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i12 = O4.f24319d;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i13 = O4.f24319d;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i14 = O4.f24319d;
                return 1;
            case 8:
                if (!(obj instanceof J4)) {
                    return O4.b((String) obj);
                }
                int i15 = O4.f24319d;
                h10 = ((J4) obj).h();
                E10 = O4.E(h10);
                break;
            case 9:
                return ((H5) obj).a();
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return O4.c((H5) obj);
            case 11:
                if (!(obj instanceof J4)) {
                    int i16 = O4.f24319d;
                    h10 = ((byte[]) obj).length;
                    E10 = O4.E(h10);
                    break;
                } else {
                    int i17 = O4.f24319d;
                    h10 = ((J4) obj).h();
                    E10 = O4.E(h10);
                    break;
                }
            case 12:
                return O4.E(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC2263i5 ? O4.a(((InterfaceC2263i5) obj).zza()) : O4.a(((Integer) obj).intValue());
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                ((Integer) obj).intValue();
                int i18 = O4.f24319d;
                return 4;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                ((Long) obj).longValue();
                int i19 = O4.f24319d;
                return 8;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                int intValue = ((Integer) obj).intValue();
                return O4.E((intValue >> 31) ^ (intValue + intValue));
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                long longValue = ((Long) obj).longValue();
                return O4.a((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return E10 + h10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void f(X4 x42, Object obj) {
        boolean z10;
        EnumC2318o6 zzb = x42.zzb();
        byte[] bArr = AbstractC2308n5.f24582b;
        obj.getClass();
        EnumC2318o6 enumC2318o6 = EnumC2318o6.zza;
        EnumC2327p6 enumC2327p6 = EnumC2327p6.INT;
        switch (zzb.zza().ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x42.zza()), x42.zzb().zza(), obj.getClass().getName()));
            case 1:
                z10 = obj instanceof Long;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x42.zza()), x42.zzb().zza(), obj.getClass().getName()));
            case 2:
                z10 = obj instanceof Float;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x42.zza()), x42.zzb().zza(), obj.getClass().getName()));
            case 3:
                z10 = obj instanceof Double;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x42.zza()), x42.zzb().zza(), obj.getClass().getName()));
            case 4:
                z10 = obj instanceof Boolean;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x42.zza()), x42.zzb().zza(), obj.getClass().getName()));
            case 5:
                z10 = obj instanceof String;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x42.zza()), x42.zzb().zza(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof J4) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x42.zza()), x42.zzb().zza(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC2263i5)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x42.zza()), x42.zzb().zza(), obj.getClass().getName()));
            case 8:
                if (obj instanceof H5) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x42.zza()), x42.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x42.zza()), x42.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final void a() {
        if (this.f24426b) {
            return;
        }
        AbstractC2192a6 abstractC2192a6 = this.f24425a;
        int c10 = abstractC2192a6.c();
        for (int i10 = 0; i10 < c10; i10++) {
            Object value = abstractC2192a6.d(i10).getValue();
            if (value instanceof AbstractC2245g5) {
                ((AbstractC2245g5) value).n();
            }
        }
        Iterator it = abstractC2192a6.e().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC2245g5) {
                ((AbstractC2245g5) value2).n();
            }
        }
        abstractC2192a6.a();
        this.f24426b = true;
    }

    public final void b(X4 x42, Object obj) {
        if (!x42.f()) {
            f(x42, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                f(x42, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f24425a.put(x42, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        Y4 y42 = new Y4();
        AbstractC2192a6 abstractC2192a6 = this.f24425a;
        int c10 = abstractC2192a6.c();
        for (int i10 = 0; i10 < c10; i10++) {
            Map.Entry d10 = abstractC2192a6.d(i10);
            android.support.v4.media.session.b.a(((X5) d10).b());
            y42.b(null, d10.getValue());
        }
        for (Map.Entry entry : abstractC2192a6.e()) {
            android.support.v4.media.session.b.a(entry.getKey());
            y42.b(null, entry.getValue());
        }
        y42.f24427c = this.f24427c;
        return y42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y4) {
            return this.f24425a.equals(((Y4) obj).f24425a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24425a.hashCode();
    }

    private Y4(boolean z10) {
        a();
        a();
    }
}
