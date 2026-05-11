package Sc;

import Kc.InterfaceC0933e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import md.AbstractC3680g;
import md.C3675b;
import md.C3683j;
import od.AbstractC3778c;

/* renamed from: Sc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1154d extends AbstractC1151a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154d(x javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    private final List y(AbstractC3680g abstractC3680g) {
        if (!(abstractC3680g instanceof C3675b)) {
            return abstractC3680g instanceof C3683j ? CollectionsKt.e(((C3683j) abstractC3680g).c().e()) : CollectionsKt.j();
        }
        Iterable iterable = (Iterable) ((C3675b) abstractC3680g).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.z(arrayList, y((AbstractC3680g) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Sc.AbstractC1151a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Iterable b(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, boolean z10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Map a10 = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a10.entrySet()) {
            CollectionsKt.z(arrayList, (!z10 || Intrinsics.b((id.f) entry.getKey(), B.f8945c)) ? y((AbstractC3680g) entry.getValue()) : CollectionsKt.j());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Sc.AbstractC1151a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public id.c i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Sc.AbstractC1151a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Object j(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        InterfaceC0933e i10 = AbstractC3778c.i(cVar);
        Intrinsics.d(i10);
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Sc.AbstractC1151a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i10;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        InterfaceC0933e i11 = AbstractC3778c.i(cVar);
        return (i11 == null || (i10 = i11.i()) == null) ? CollectionsKt.j() : i10;
    }
}
