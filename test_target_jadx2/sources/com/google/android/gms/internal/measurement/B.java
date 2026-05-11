package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class B implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC2275k f24193a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y1 f24194b;

    B(AbstractC2275k abstractC2275k, Y1 y12) {
        this.f24193a = abstractC2275k;
        this.f24194b = y12;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC2329q interfaceC2329q = (InterfaceC2329q) obj;
        InterfaceC2329q interfaceC2329q2 = (InterfaceC2329q) obj2;
        if (interfaceC2329q instanceof C2373v) {
            return !(interfaceC2329q2 instanceof C2373v) ? 1 : 0;
        }
        if (interfaceC2329q2 instanceof C2373v) {
            return -1;
        }
        AbstractC2275k abstractC2275k = this.f24193a;
        return abstractC2275k == null ? interfaceC2329q.a().compareTo(interfaceC2329q2.a()) : (int) AbstractC2412z2.i(abstractC2275k.b(this.f24194b, Arrays.asList(interfaceC2329q, interfaceC2329q2)).f().doubleValue());
    }
}
