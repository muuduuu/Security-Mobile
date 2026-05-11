package Ec;

import Kc.InterfaceC0929a;
import Kc.InterfaceC0952y;
import Kc.U;
import Kc.X;
import Kc.j0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.j;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f1945a = new H();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.renderer.c f1946b = kotlin.reflect.jvm.internal.impl.renderer.c.f36584g;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1947a;

        static {
            int[] iArr = new int[j.a.values().length];
            try {
                iArr[j.a.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.a.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.a.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1947a = iArr;
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1948a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j0 j0Var) {
            H h10 = H.f1945a;
            AbstractC5197E type = j0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return h10.h(type);
        }
    }

    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1949a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j0 j0Var) {
            H h10 = H.f1945a;
            AbstractC5197E type = j0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return h10.h(type);
        }
    }

    private H() {
    }

    private final void a(StringBuilder sb2, X x10) {
        if (x10 != null) {
            AbstractC5197E type = x10.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(h(type));
            sb2.append(".");
        }
    }

    private final void b(StringBuilder sb2, InterfaceC0929a interfaceC0929a) {
        X i10 = L.i(interfaceC0929a);
        X s02 = interfaceC0929a.s0();
        a(sb2, i10);
        boolean z10 = (i10 == null || s02 == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        a(sb2, s02);
        if (z10) {
            sb2.append(")");
        }
    }

    private final String c(InterfaceC0929a interfaceC0929a) {
        if (interfaceC0929a instanceof U) {
            return g((U) interfaceC0929a);
        }
        if (interfaceC0929a instanceof InterfaceC0952y) {
            return d((InterfaceC0952y) interfaceC0929a);
        }
        throw new IllegalStateException(("Illegal callable: " + interfaceC0929a).toString());
    }

    public final String d(InterfaceC0952y descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        H h10 = f1945a;
        h10.b(sb2, descriptor);
        kotlin.reflect.jvm.internal.impl.renderer.c cVar = f1946b;
        id.f name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(cVar.v(name, true));
        List m10 = descriptor.m();
        Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
        CollectionsKt.j0(m10, sb2, ", ", "(", ")", 0, null, b.f1948a, 48, null);
        sb2.append(": ");
        AbstractC5197E g10 = descriptor.g();
        Intrinsics.d(g10);
        sb2.append(h10.h(g10));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final String e(InterfaceC0952y invoke) {
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        H h10 = f1945a;
        h10.b(sb2, invoke);
        List m10 = invoke.m();
        Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
        CollectionsKt.j0(m10, sb2, ", ", "(", ")", 0, null, c.f1949a, 48, null);
        sb2.append(" -> ");
        AbstractC5197E g10 = invoke.g();
        Intrinsics.d(g10);
        sb2.append(h10.h(g10));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final String f(u parameter) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = a.f1947a[parameter.o().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else if (i10 == 3) {
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(f1945a.c(parameter.t().S()));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final String g(U descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.q0() ? "var " : "val ");
        H h10 = f1945a;
        h10.b(sb2, descriptor);
        kotlin.reflect.jvm.internal.impl.renderer.c cVar = f1946b;
        id.f name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(cVar.v(name, true));
        sb2.append(": ");
        AbstractC5197E type = descriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb2.append(h10.h(type));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final String h(AbstractC5197E type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return f1946b.w(type);
    }
}
