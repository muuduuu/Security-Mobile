package yd;

import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;

/* renamed from: yd.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5208j {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f45540a = {C5142C.k(new xc.u(C5142C.d(AbstractC5208j.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* renamed from: b, reason: collision with root package name */
    private static final Ac.c f45541b;

    static {
        Dd.n c10 = a0.f45478b.c(C5142C.b(C5207i.class));
        Intrinsics.e(c10, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f45541b = c10;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a(a0 a0Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e10;
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        C5207i b10 = b(a0Var);
        return (b10 == null || (e10 = b10.e()) == null) ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b() : e10;
    }

    public static final C5207i b(a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return (C5207i) f45541b.a(a0Var, f45540a[0]);
    }
}
