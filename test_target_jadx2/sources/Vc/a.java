package Vc;

import Kc.InterfaceC0935g;
import Kc.InterfaceC0941m;
import Sc.y;
import Zc.z;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lc.l;
import xc.m;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: Vc.a$a, reason: collision with other inner class name */
    static final class C0206a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f11107a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0935g f11108b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0206a(g gVar, InterfaceC0935g interfaceC0935g) {
            super(0);
            this.f11107a = gVar;
            this.f11108b = interfaceC0935g;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return a.g(this.f11107a, this.f11108b.i());
        }
    }

    static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f11109a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f11110b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
            super(0);
            this.f11109a = gVar;
            this.f11110b = gVar2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return a.g(this.f11109a, this.f11110b);
        }
    }

    private static final g a(g gVar, InterfaceC0941m interfaceC0941m, z zVar, int i10, Lazy lazy) {
        return new g(gVar.a(), zVar != null ? new h(gVar, interfaceC0941m, zVar, i10) : gVar.f(), lazy);
    }

    public static final g b(g gVar, k typeParameterResolver) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        return new g(gVar.a(), typeParameterResolver, gVar.c());
    }

    public static final g c(g gVar, InterfaceC0935g containingDeclaration, z zVar, int i10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        return a(gVar, containingDeclaration, zVar, i10, lc.i.b(l.NONE, new C0206a(gVar, containingDeclaration)));
    }

    public static /* synthetic */ g d(g gVar, InterfaceC0935g interfaceC0935g, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            zVar = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return c(gVar, interfaceC0935g, zVar, i10);
    }

    public static final g e(g gVar, InterfaceC0941m containingDeclaration, z typeParameterOwner, int i10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        return a(gVar, containingDeclaration, typeParameterOwner, i10, gVar.c());
    }

    public static /* synthetic */ g f(g gVar, InterfaceC0941m interfaceC0941m, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(gVar, interfaceC0941m, zVar, i10);
    }

    public static final y g(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g additionalAnnotations) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return gVar.a().a().c(gVar.b(), additionalAnnotations);
    }

    public static final g h(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g additionalAnnotations) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? gVar : new g(gVar.a(), gVar.f(), lc.i.b(l.NONE, new b(gVar, additionalAnnotations)));
    }

    public static final g i(g gVar, Vc.b components) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        return new g(components, gVar.f(), gVar.c());
    }
}
