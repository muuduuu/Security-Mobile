package kd;

import Kc.InterfaceC0929a;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class n {

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Gd.g f36318a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Gd.g gVar) {
            super(1);
            this.f36318a = gVar;
        }

        public final void a(Object obj) {
            Gd.g gVar = this.f36318a;
            Intrinsics.d(obj);
            gVar.add(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return Unit.f36324a;
        }
    }

    public static final Collection a(Collection collection, Function1 descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        Gd.g a10 = Gd.g.f3017c.a();
        while (!linkedList.isEmpty()) {
            Object d02 = CollectionsKt.d0(linkedList);
            Gd.g a11 = Gd.g.f3017c.a();
            Collection q10 = l.q(d02, linkedList, descriptorByHandle, new a(a11));
            Intrinsics.checkNotNullExpressionValue(q10, "extractMembersOverridableInBothWays(...)");
            if (q10.size() == 1 && a11.isEmpty()) {
                Object z02 = CollectionsKt.z0(q10);
                Intrinsics.checkNotNullExpressionValue(z02, "single(...)");
                a10.add(z02);
            } else {
                Object L10 = l.L(q10, descriptorByHandle);
                Intrinsics.checkNotNullExpressionValue(L10, "selectMostSpecificMember(...)");
                InterfaceC0929a interfaceC0929a = (InterfaceC0929a) descriptorByHandle.invoke(L10);
                for (Object obj : q10) {
                    Intrinsics.d(obj);
                    if (!l.B(interfaceC0929a, (InterfaceC0929a) descriptorByHandle.invoke(obj))) {
                        a11.add(obj);
                    }
                }
                if (!a11.isEmpty()) {
                    a10.addAll(a11);
                }
                a10.add(L10);
            }
        }
        return a10;
    }
}
