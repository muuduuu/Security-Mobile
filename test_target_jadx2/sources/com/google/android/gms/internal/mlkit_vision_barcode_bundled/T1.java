package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class T1 implements InterfaceC2460i2 {

    /* renamed from: a, reason: collision with root package name */
    private final P1 f24813a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2539y2 f24814b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24815c;

    /* renamed from: d, reason: collision with root package name */
    private final R0 f24816d;

    private T1(AbstractC2539y2 abstractC2539y2, R0 r02, P1 p12) {
        this.f24814b = abstractC2539y2;
        this.f24815c = r02.g(p12);
        this.f24816d = r02;
        this.f24813a = p12;
    }

    static T1 a(AbstractC2539y2 abstractC2539y2, R0 r02, P1 p12) {
        return new T1(abstractC2539y2, r02, p12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final int b(Object obj) {
        AbstractC2539y2 abstractC2539y2 = this.f24814b;
        int b10 = abstractC2539y2.b(abstractC2539y2.d(obj));
        return this.f24815c ? b10 + this.f24816d.b(obj).b() : b10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final boolean d(Object obj) {
        return this.f24816d.b(obj).k();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final int e(Object obj) {
        int hashCode = this.f24814b.d(obj).hashCode();
        return this.f24815c ? (hashCode * 53) + this.f24816d.b(obj).f24818a.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final void f(Object obj) {
        this.f24814b.g(obj);
        this.f24816d.e(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final Object g() {
        P1 p12 = this.f24813a;
        return p12 instanceof AbstractC2444f1 ? ((AbstractC2444f1) p12).h() : p12.C().u();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final void h(Object obj, R2 r22) {
        Iterator f10 = this.f24816d.b(obj).f();
        while (f10.hasNext()) {
            Map.Entry entry = (Map.Entry) f10.next();
            U0 u02 = (U0) entry.getKey();
            if (u02.g() != Q2.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            u02.i();
            u02.h();
            if (entry instanceof AbstractC2508s1) {
                u02.zza();
                ((AbstractC2508s1) entry).a();
                throw null;
            }
            r22.B(u02.zza(), entry.getValue());
        }
        AbstractC2539y2 abstractC2539y2 = this.f24814b;
        abstractC2539y2.i(abstractC2539y2.d(obj), r22);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final void i(Object obj, Object obj2) {
        AbstractC2470k2.c(this.f24814b, obj, obj2);
        if (this.f24815c) {
            AbstractC2470k2.b(this.f24816d, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf A[EDGE_INSN: B:24:0x00bf->B:25:0x00bf BREAK  A[LOOP:1: B:10:0x0067->B:18:0x0067], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Object obj, byte[] bArr, int i10, int i11, C2502r0 c2502r0) {
        AbstractC2444f1 abstractC2444f1 = (AbstractC2444f1) obj;
        C2544z2 c2544z2 = abstractC2444f1.zzc;
        if (c2544z2 == C2544z2.c()) {
            c2544z2 = C2544z2.f();
            abstractC2444f1.zzc = c2544z2;
        }
        V0 G10 = ((AbstractC2424b1) obj).G();
        Object obj2 = null;
        while (i10 < i11) {
            int j10 = AbstractC2507s0.j(bArr, i10, c2502r0);
            int i12 = c2502r0.f24918a;
            if (i12 == 11) {
                int i13 = 0;
                E0 e02 = null;
                while (j10 < i11) {
                    j10 = AbstractC2507s0.j(bArr, j10, c2502r0);
                    int i14 = c2502r0.f24918a;
                    int i15 = i14 >>> 3;
                    int i16 = i14 & 7;
                    if (i15 != 2) {
                        if (i15 == 3) {
                            if (obj2 != null) {
                                C2439e1 c2439e1 = (C2439e1) obj2;
                                j10 = AbstractC2507s0.d(X1.a().b(c2439e1.f24861c.getClass()), bArr, j10, i11, c2502r0);
                                G10.i(c2439e1.f24862d, c2502r0.f24920c);
                            } else if (i16 == 2) {
                                j10 = AbstractC2507s0.a(bArr, j10, c2502r0);
                                e02 = (E0) c2502r0.f24920c;
                            }
                        }
                        if (i14 != 12) {
                            break;
                        } else {
                            j10 = AbstractC2507s0.p(i14, bArr, j10, i11, c2502r0);
                        }
                    } else if (i16 == 0) {
                        j10 = AbstractC2507s0.j(bArr, j10, c2502r0);
                        i13 = c2502r0.f24918a;
                        obj2 = this.f24816d.d(c2502r0.f24921d, this.f24813a, i13);
                    } else if (i14 != 12) {
                    }
                }
                if (e02 != null) {
                    c2544z2.j((i13 << 3) | 2, e02);
                }
                i10 = j10;
            } else if ((i12 & 7) == 2) {
                Object d10 = this.f24816d.d(c2502r0.f24921d, this.f24813a, i12 >>> 3);
                if (d10 != null) {
                    C2439e1 c2439e12 = (C2439e1) d10;
                    i10 = AbstractC2507s0.d(X1.a().b(c2439e12.f24861c.getClass()), bArr, j10, i11, c2502r0);
                    G10.i(c2439e12.f24862d, c2502r0.f24920c);
                } else {
                    i10 = AbstractC2507s0.i(i12, bArr, j10, i11, c2544z2, c2502r0);
                }
                obj2 = d10;
            } else {
                i10 = AbstractC2507s0.p(i12, bArr, j10, i11, c2502r0);
            }
        }
        if (i10 != i11) {
            throw C2499q1.e();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2460i2
    public final boolean k(Object obj, Object obj2) {
        if (!this.f24814b.d(obj).equals(this.f24814b.d(obj2))) {
            return false;
        }
        if (this.f24815c) {
            return this.f24816d.b(obj).equals(this.f24816d.b(obj2));
        }
        return true;
    }
}
