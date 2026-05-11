package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class G0 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f23826a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0 f23827b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23828c;

    /* renamed from: d, reason: collision with root package name */
    private final P f23829d;

    private G0(Y0 y02, P p10, B0 b02) {
        this.f23827b = y02;
        this.f23828c = p10.g(b02);
        this.f23829d = p10;
        this.f23826a = b02;
    }

    static G0 j(Y0 y02, P p10, B0 b02) {
        return new G0(y02, p10, b02);
    }

    @Override // com.google.android.gms.internal.clearcut.R0
    public final void a(Object obj) {
        this.f23827b.d(obj);
        this.f23829d.f(obj);
    }

    @Override // com.google.android.gms.internal.clearcut.R0
    public final Object b() {
        return this.f23826a.p().Z0();
    }

    @Override // com.google.android.gms.internal.clearcut.R0
    public final boolean c(Object obj, Object obj2) {
        if (!this.f23827b.k(obj).equals(this.f23827b.k(obj2))) {
            return false;
        }
        if (this.f23828c) {
            return this.f23829d.b(obj).equals(this.f23829d.b(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.R0
    public final int d(Object obj) {
        int hashCode = this.f23827b.k(obj).hashCode();
        return this.f23828c ? (hashCode * 53) + this.f23829d.b(obj).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.clearcut.R0
    public final void e(Object obj, InterfaceC2166t1 interfaceC2166t1) {
        Iterator e10 = this.f23829d.b(obj).e();
        if (e10.hasNext()) {
            android.support.v4.media.session.b.a(((Map.Entry) e10.next()).getKey());
            throw null;
        }
        Y0 y02 = this.f23827b;
        y02.e(y02.k(obj), interfaceC2166t1);
    }

    @Override // com.google.android.gms.internal.clearcut.R0
    public final void f(Object obj, Object obj2) {
        T0.i(this.f23827b, obj, obj2);
        if (this.f23828c) {
            T0.g(this.f23829d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.R0
    public final int g(Object obj) {
        Y0 y02 = this.f23827b;
        int l10 = y02.l(y02.k(obj));
        return this.f23828c ? l10 + this.f23829d.b(obj).h() : l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[EDGE_INSN: B:24:0x0061->B:25:0x0061 BREAK  A[LOOP:1: B:10:0x0032->B:18:0x0032], SYNTHETIC] */
    @Override // com.google.android.gms.internal.clearcut.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, byte[] bArr, int i10, int i11, C2170v c2170v) {
        AbstractC2109a0 abstractC2109a0 = (AbstractC2109a0) obj;
        Z0 z02 = abstractC2109a0.zzjp;
        if (z02 == Z0.h()) {
            z02 = Z0.i();
            abstractC2109a0.zzjp = z02;
        }
        Z0 z03 = z02;
        while (i10 < i11) {
            int e10 = AbstractC2167u.e(bArr, i10, c2170v);
            int i12 = c2170v.f24100a;
            if (i12 != 11) {
                i10 = (i12 & 7) == 2 ? AbstractC2167u.c(i12, bArr, e10, i11, z03, c2170v) : AbstractC2167u.a(i12, bArr, e10, i11, c2170v);
            } else {
                int i13 = 0;
                AbstractC2179y abstractC2179y = null;
                while (e10 < i11) {
                    e10 = AbstractC2167u.e(bArr, e10, c2170v);
                    int i14 = c2170v.f24100a;
                    int i15 = i14 >>> 3;
                    int i16 = i14 & 7;
                    if (i15 != 2) {
                        if (i15 == 3 && i16 == 2) {
                            e10 = AbstractC2167u.m(bArr, e10, c2170v);
                            abstractC2179y = (AbstractC2179y) c2170v.f24102c;
                        }
                        if (i14 != 12) {
                            break;
                        } else {
                            e10 = AbstractC2167u.a(i14, bArr, e10, i11, c2170v);
                        }
                    } else if (i16 == 0) {
                        e10 = AbstractC2167u.e(bArr, e10, c2170v);
                        i13 = c2170v.f24100a;
                    } else if (i14 != 12) {
                    }
                }
                if (abstractC2179y != null) {
                    z03.e((i13 << 3) | 2, abstractC2179y);
                }
                i10 = e10;
            }
        }
        if (i10 != i11) {
            throw C2127g0.d();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.R0
    public final boolean i(Object obj) {
        return this.f23829d.b(obj).d();
    }
}
