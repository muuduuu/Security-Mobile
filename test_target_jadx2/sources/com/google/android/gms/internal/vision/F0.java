package com.google.android.gms.internal.vision;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class F0 {

    /* renamed from: d, reason: collision with root package name */
    private static final F0 f25020d = new F0(true);

    /* renamed from: a, reason: collision with root package name */
    final O1 f25021a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25022b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25023c;

    private F0() {
        this.f25021a = O1.b(16);
    }

    static int a(s2 s2Var, int i10, Object obj) {
        int c02 = AbstractC2614v0.c0(i10);
        if (s2Var == s2.zzj) {
            R0.g((InterfaceC2609t1) obj);
            c02 <<= 1;
        }
        return c02 + b(s2Var, obj);
    }

    private static int b(s2 s2Var, Object obj) {
        switch (E0.f25019b[s2Var.ordinal()]) {
            case 1:
                return AbstractC2614v0.x(((Double) obj).doubleValue());
            case 2:
                return AbstractC2614v0.y(((Float) obj).floatValue());
            case 3:
                return AbstractC2614v0.Z(((Long) obj).longValue());
            case 4:
                return AbstractC2614v0.e0(((Long) obj).longValue());
            case 5:
                return AbstractC2614v0.g0(((Integer) obj).intValue());
            case 6:
                return AbstractC2614v0.n0(((Long) obj).longValue());
            case 7:
                return AbstractC2614v0.s0(((Integer) obj).intValue());
            case 8:
                return AbstractC2614v0.H(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC2614v0.R((InterfaceC2609t1) obj);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return AbstractC2614v0.F((InterfaceC2609t1) obj);
            case 11:
                return obj instanceof AbstractC2570g0 ? AbstractC2614v0.E((AbstractC2570g0) obj) : AbstractC2614v0.G((String) obj);
            case 12:
                return obj instanceof AbstractC2570g0 ? AbstractC2614v0.E((AbstractC2570g0) obj) : AbstractC2614v0.I((byte[]) obj);
            case 13:
                return AbstractC2614v0.k0(((Integer) obj).intValue());
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return AbstractC2614v0.v0(((Integer) obj).intValue());
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return AbstractC2614v0.r0(((Long) obj).longValue());
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return AbstractC2614v0.o0(((Integer) obj).intValue());
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return AbstractC2614v0.j0(((Long) obj).longValue());
            case 18:
                return obj instanceof Q0 ? AbstractC2614v0.x0(((Q0) obj).zza()) : AbstractC2614v0.x0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean e(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        throw null;
    }

    private final void g(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static int h(H0 h02, Object obj) {
        s2 zzb = h02.zzb();
        int zza = h02.zza();
        if (!h02.f()) {
            return a(zzb, zza, obj);
        }
        int i10 = 0;
        if (h02.g()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i10 += b(zzb, it.next());
            }
            return AbstractC2614v0.c0(zza) + i10 + AbstractC2614v0.z0(i10);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i10 += a(zzb, zza, it2.next());
        }
        return i10;
    }

    private static int i(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.vision.InterfaceC2609t1) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.vision.Q0) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void k(H0 h02, Object obj) {
        s2 zzb = h02.zzb();
        R0.d(obj);
        boolean z10 = true;
        switch (E0.f25018a[zzb.zza().ordinal()]) {
            case 1:
                z10 = obj instanceof Integer;
                break;
            case 2:
                z10 = obj instanceof Long;
                break;
            case 3:
                z10 = obj instanceof Float;
                break;
            case 4:
                z10 = obj instanceof Double;
                break;
            case 5:
                z10 = obj instanceof Boolean;
                break;
            case 6:
                z10 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof AbstractC2570g0)) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 9:
                break;
            default:
                z10 = false;
                break;
        }
        if (!z10) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(h02.zza()), h02.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final void c(F0 f02) {
        for (int i10 = 0; i10 < f02.f25021a.j(); i10++) {
            g(f02.f25021a.h(i10));
        }
        Iterator it = f02.f25021a.n().iterator();
        while (it.hasNext()) {
            g((Map.Entry) it.next());
        }
    }

    public final /* synthetic */ Object clone() {
        F0 f02 = new F0();
        for (int i10 = 0; i10 < this.f25021a.j(); i10++) {
            Map.Entry h10 = this.f25021a.h(i10);
            android.support.v4.media.session.b.a(h10.getKey());
            f02.d(null, h10.getValue());
        }
        for (Map.Entry entry : this.f25021a.n()) {
            android.support.v4.media.session.b.a(entry.getKey());
            f02.d(null, entry.getValue());
        }
        f02.f25023c = this.f25023c;
        return f02;
    }

    public final void d(H0 h02, Object obj) {
        if (!h02.f()) {
            k(h02, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                k(h02, obj2);
            }
            obj = arrayList;
        }
        this.f25021a.put(h02, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F0) {
            return this.f25021a.equals(((F0) obj).f25021a);
        }
        return false;
    }

    public final void f() {
        if (this.f25022b) {
            return;
        }
        this.f25021a.e();
        this.f25022b = true;
    }

    public final int hashCode() {
        return this.f25021a.hashCode();
    }

    public final Iterator j() {
        return this.f25023c ? new C2548a1(this.f25021a.entrySet().iterator()) : this.f25021a.entrySet().iterator();
    }

    final Iterator l() {
        return this.f25023c ? new C2548a1(this.f25021a.p().iterator()) : this.f25021a.p().iterator();
    }

    public final boolean m() {
        for (int i10 = 0; i10 < this.f25021a.j(); i10++) {
            if (!e(this.f25021a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f25021a.n().iterator();
        while (it.hasNext()) {
            if (!e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int n() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f25021a.j(); i11++) {
            i10 += i(this.f25021a.h(i11));
        }
        Iterator it = this.f25021a.n().iterator();
        while (it.hasNext()) {
            i10 += i((Map.Entry) it.next());
        }
        return i10;
    }

    private F0(boolean z10) {
        this(O1.b(0));
        f();
    }

    private F0(O1 o12) {
        this.f25021a = o12;
        f();
    }
}
