package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2627z1 implements K1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2609t1 f25225a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2549a2 f25226b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25227c;

    /* renamed from: d, reason: collision with root package name */
    private final C0 f25228d;

    private C2627z1(AbstractC2549a2 abstractC2549a2, C0 c02, InterfaceC2609t1 interfaceC2609t1) {
        this.f25226b = abstractC2549a2;
        this.f25227c = c02.d(interfaceC2609t1);
        this.f25228d = c02;
        this.f25225a = interfaceC2609t1;
    }

    static C2627z1 i(AbstractC2549a2 abstractC2549a2, C0 c02, InterfaceC2609t1 interfaceC2609t1) {
        return new C2627z1(abstractC2549a2, c02, interfaceC2609t1);
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final void a(Object obj) {
        this.f25226b.j(obj);
        this.f25228d.f(obj);
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final int b(Object obj) {
        int hashCode = this.f25226b.f(obj).hashCode();
        return this.f25227c ? (hashCode * 53) + this.f25228d.b(obj).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final void c(Object obj, y2 y2Var) {
        Iterator j10 = this.f25228d.b(obj).j();
        if (j10.hasNext()) {
            android.support.v4.media.session.b.a(((Map.Entry) j10.next()).getKey());
            throw null;
        }
        AbstractC2549a2 abstractC2549a2 = this.f25226b;
        abstractC2549a2.g(abstractC2549a2.f(obj), y2Var);
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final boolean d(Object obj) {
        return this.f25228d.b(obj).m();
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final int e(Object obj) {
        AbstractC2549a2 abstractC2549a2 = this.f25226b;
        int k10 = abstractC2549a2.k(abstractC2549a2.f(obj));
        return this.f25227c ? k10 + this.f25228d.b(obj).n() : k10;
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final void f(Object obj, Object obj2) {
        L1.o(this.f25226b, obj, obj2);
        if (this.f25227c) {
            L1.m(this.f25228d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final boolean g(Object obj, Object obj2) {
        if (!this.f25226b.f(obj).equals(this.f25226b.f(obj2))) {
            return false;
        }
        if (this.f25227c) {
            return this.f25228d.b(obj).equals(this.f25228d.b(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final void h(Object obj, byte[] bArr, int i10, int i11, C2555c0 c2555c0) {
        N0 n02 = (N0) obj;
        if (n02.zzb == C2561d2.a()) {
            n02.zzb = C2561d2.g();
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.vision.K1
    public final Object zza() {
        return this.f25225a.k().g();
    }
}
