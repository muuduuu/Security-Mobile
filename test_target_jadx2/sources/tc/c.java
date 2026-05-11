package Tc;

import Hc.j;
import Sc.B;
import Zc.InterfaceC1328a;
import Zc.InterfaceC1331d;
import id.C3367b;
import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f9748a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final id.f f9749b;

    /* renamed from: c, reason: collision with root package name */
    private static final id.f f9750c;

    /* renamed from: d, reason: collision with root package name */
    private static final id.f f9751d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map f9752e;

    static {
        id.f o10 = id.f.o("message");
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        f9749b = o10;
        id.f o11 = id.f.o("allowedTargets");
        Intrinsics.checkNotNullExpressionValue(o11, "identifier(...)");
        f9750c = o11;
        id.f o12 = id.f.o("value");
        Intrinsics.checkNotNullExpressionValue(o12, "identifier(...)");
        f9751d = o12;
        f9752e = G.k(t.a(j.a.f3907H, B.f8946d), t.a(j.a.f3915L, B.f8948f), t.a(j.a.f3920P, B.f8951i));
    }

    private c() {
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.c f(c cVar, InterfaceC1328a interfaceC1328a, Vc.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return cVar.e(interfaceC1328a, gVar, z10);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(id.c kotlinName, InterfaceC1331d annotationOwner, Vc.g c10) {
        InterfaceC1328a p10;
        Intrinsics.checkNotNullParameter(kotlinName, "kotlinName");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        Intrinsics.checkNotNullParameter(c10, "c");
        if (Intrinsics.b(kotlinName, j.a.f3979y)) {
            id.c DEPRECATED_ANNOTATION = B.f8950h;
            Intrinsics.checkNotNullExpressionValue(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            InterfaceC1328a p11 = annotationOwner.p(DEPRECATED_ANNOTATION);
            if (p11 != null || annotationOwner.s()) {
                return new e(p11, c10);
            }
        }
        id.c cVar = (id.c) f9752e.get(kotlinName);
        if (cVar == null || (p10 = annotationOwner.p(cVar)) == null) {
            return null;
        }
        return f(f9748a, p10, c10, false, 4, null);
    }

    public final id.f b() {
        return f9749b;
    }

    public final id.f c() {
        return f9751d;
    }

    public final id.f d() {
        return f9750c;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e(InterfaceC1328a annotation, Vc.g c10, boolean z10) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c10, "c");
        C3367b l10 = annotation.l();
        if (Intrinsics.b(l10, C3367b.m(B.f8946d))) {
            return new i(annotation, c10);
        }
        if (Intrinsics.b(l10, C3367b.m(B.f8948f))) {
            return new h(annotation, c10);
        }
        if (Intrinsics.b(l10, C3367b.m(B.f8951i))) {
            return new b(c10, annotation, j.a.f3920P);
        }
        if (Intrinsics.b(l10, C3367b.m(B.f8950h))) {
            return null;
        }
        return new Wc.e(c10, annotation, z10);
    }
}
