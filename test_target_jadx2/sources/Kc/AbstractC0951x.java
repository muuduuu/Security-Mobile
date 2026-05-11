package Kc;

import id.C3367b;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xc.AbstractC5156i;
import xc.C5142C;

/* renamed from: Kc.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0951x {

    /* renamed from: Kc.x$a */
    /* synthetic */ class a extends AbstractC5156i implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public static final a f5603j = new a();

        a() {
            super(1);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(C3367b.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final C3367b invoke(C3367b p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return p02.g();
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "getOuterClassId";
        }
    }

    /* renamed from: Kc.x$b */
    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5604a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C3367b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return 0;
        }
    }

    public static final InterfaceC0933e a(G g10, C3367b classId) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        InterfaceC0936h b10 = b(g10, classId);
        if (b10 instanceof InterfaceC0933e) {
            return (InterfaceC0933e) b10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC0936h b(G g10, C3367b classId) {
        InterfaceC0936h f10;
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        G a10 = kd.o.a(g10);
        if (a10 == null) {
            id.c h10 = classId.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getPackageFqName(...)");
            P p02 = g10.p0(h10);
            List f11 = classId.i().f();
            Intrinsics.checkNotNullExpressionValue(f11, "pathSegments(...)");
            rd.h w10 = p02.w();
            Object d02 = CollectionsKt.d0(f11);
            Intrinsics.checkNotNullExpressionValue(d02, "first(...)");
            f10 = w10.f((id.f) d02, Rc.d.FROM_DESERIALIZATION);
            if (f10 == null) {
                return null;
            }
            for (id.f fVar : f11.subList(1, f11.size())) {
                if (!(f10 instanceof InterfaceC0933e)) {
                    return null;
                }
                rd.h G02 = ((InterfaceC0933e) f10).G0();
                Intrinsics.d(fVar);
                InterfaceC0936h f12 = G02.f(fVar, Rc.d.FROM_DESERIALIZATION);
                f10 = f12 instanceof InterfaceC0933e ? (InterfaceC0933e) f12 : null;
                if (f10 == null) {
                    return null;
                }
            }
        } else {
            id.c h11 = classId.h();
            Intrinsics.checkNotNullExpressionValue(h11, "getPackageFqName(...)");
            P p03 = a10.p0(h11);
            List f13 = classId.i().f();
            Intrinsics.checkNotNullExpressionValue(f13, "pathSegments(...)");
            rd.h w11 = p03.w();
            Object d03 = CollectionsKt.d0(f13);
            Intrinsics.checkNotNullExpressionValue(d03, "first(...)");
            InterfaceC0936h f14 = w11.f((id.f) d03, Rc.d.FROM_DESERIALIZATION);
            if (f14 != null) {
                for (id.f fVar2 : f13.subList(1, f13.size())) {
                    if (f14 instanceof InterfaceC0933e) {
                        rd.h G03 = ((InterfaceC0933e) f14).G0();
                        Intrinsics.d(fVar2);
                        InterfaceC0936h f15 = G03.f(fVar2, Rc.d.FROM_DESERIALIZATION);
                        f14 = f15 instanceof InterfaceC0933e ? (InterfaceC0933e) f15 : null;
                        if (f14 != null) {
                        }
                    }
                }
                if (f14 == null) {
                    return f14;
                }
                id.c h12 = classId.h();
                Intrinsics.checkNotNullExpressionValue(h12, "getPackageFqName(...)");
                P p04 = g10.p0(h12);
                List f16 = classId.i().f();
                Intrinsics.checkNotNullExpressionValue(f16, "pathSegments(...)");
                rd.h w12 = p04.w();
                Object d04 = CollectionsKt.d0(f16);
                Intrinsics.checkNotNullExpressionValue(d04, "first(...)");
                f10 = w12.f((id.f) d04, Rc.d.FROM_DESERIALIZATION);
                if (f10 == null) {
                    return null;
                }
                for (id.f fVar3 : f16.subList(1, f16.size())) {
                    if (!(f10 instanceof InterfaceC0933e)) {
                        return null;
                    }
                    rd.h G04 = ((InterfaceC0933e) f10).G0();
                    Intrinsics.d(fVar3);
                    InterfaceC0936h f17 = G04.f(fVar3, Rc.d.FROM_DESERIALIZATION);
                    f10 = f17 instanceof InterfaceC0933e ? (InterfaceC0933e) f17 : null;
                    if (f10 == null) {
                        return null;
                    }
                }
            }
            f14 = null;
            if (f14 == null) {
            }
        }
        return f10;
    }

    public static final InterfaceC0933e c(G g10, C3367b classId, J notFoundClasses) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        InterfaceC0933e a10 = a(g10, classId);
        return a10 != null ? a10 : notFoundClasses.d(classId, kotlin.sequences.j.C(kotlin.sequences.j.w(kotlin.sequences.j.h(classId, a.f5603j), b.f5604a)));
    }

    public static final e0 d(G g10, C3367b classId) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        InterfaceC0936h b10 = b(g10, classId);
        if (b10 instanceof e0) {
            return (e0) b10;
        }
        return null;
    }
}
