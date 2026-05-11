package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2090t1 extends AbstractC2082q1 {
    C2090t1() {
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2082q1
    final /* synthetic */ Object a(Object obj) {
        return ((C0) obj).zzc;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2082q1
    final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2) {
        if (C2087s1.a().equals(obj2)) {
            return obj;
        }
        if (C2087s1.a().equals(obj)) {
            return C2087s1.c((C2087s1) obj, (C2087s1) obj2);
        }
        ((C2087s1) obj).b((C2087s1) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2082q1
    final void c(Object obj) {
        ((C0) obj).zzc.f();
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2082q1
    final /* synthetic */ void d(Object obj, Object obj2) {
        ((C0) obj).zzc = (C2087s1) obj2;
    }
}
