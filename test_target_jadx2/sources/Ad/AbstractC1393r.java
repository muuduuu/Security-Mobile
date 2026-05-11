package ad;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Sc.B;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* renamed from: ad.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1393r {

    /* renamed from: a, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f12736a;

    /* renamed from: b, reason: collision with root package name */
    private static final C1376c f12737b;

    /* renamed from: ad.r$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12738a;

        static {
            int[] iArr = new int[EnumC1381h.values().length];
            try {
                iArr[EnumC1381h.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1381h.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12738a = iArr;
        }
    }

    static {
        id.c ENHANCED_NULLABILITY_ANNOTATION = B.f8964v;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f12736a = new C1376c(ENHANCED_NULLABILITY_ANNOTATION);
        id.c ENHANCED_MUTABILITY_ANNOTATION = B.f8965w;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f12737b = new C1376c(ENHANCED_MUTABILITY_ANNOTATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k(CollectionsKt.O0(list)) : (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) CollectionsKt.A0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0936h f(InterfaceC0936h interfaceC0936h, C1378e c1378e, EnumC1390o enumC1390o) {
        Jc.d dVar = Jc.d.f4910a;
        if (!AbstractC1391p.a(enumC1390o) || !(interfaceC0936h instanceof InterfaceC0933e)) {
            return null;
        }
        if (c1378e.c() == EnumC1379f.READ_ONLY && enumC1390o == EnumC1390o.FLEXIBLE_LOWER) {
            InterfaceC0933e interfaceC0933e = (InterfaceC0933e) interfaceC0936h;
            if (dVar.c(interfaceC0933e)) {
                return dVar.a(interfaceC0933e);
            }
        }
        if (c1378e.c() != EnumC1379f.MUTABLE || enumC1390o != EnumC1390o.FLEXIBLE_UPPER) {
            return null;
        }
        InterfaceC0933e interfaceC0933e2 = (InterfaceC0933e) interfaceC0936h;
        if (dVar.d(interfaceC0933e2)) {
            return dVar.b(interfaceC0933e2);
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g() {
        return f12736a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(C1378e c1378e, EnumC1390o enumC1390o) {
        if (!AbstractC1391p.a(enumC1390o)) {
            return null;
        }
        EnumC1381h d10 = c1378e.d();
        int i10 = d10 == null ? -1 : a.f12738a[d10.ordinal()];
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return AbstractC1394s.c(kotlin.reflect.jvm.internal.impl.types.checker.o.f36699a, abstractC5197E);
    }
}
