package kotlin.reflect.jvm.internal.impl.types.error;

import Kc.G;
import Kc.InterfaceC0941m;
import Kc.U;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.e0;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f36726a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static final G f36727b = d.f36706a;

    /* renamed from: c, reason: collision with root package name */
    private static final a f36728c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5197E f36729d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC5197E f36730e;

    /* renamed from: f, reason: collision with root package name */
    private static final U f36731f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set f36732g;

    static {
        String format = String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        id.f r10 = id.f.r(format);
        Intrinsics.checkNotNullExpressionValue(r10, "special(...)");
        f36728c = new a(r10);
        f36729d = d(j.CYCLIC_SUPERTYPES, new String[0]);
        f36730e = d(j.ERROR_PROPERTY_TYPE, new String[0]);
        e eVar = new e();
        f36731f = eVar;
        f36732g = O.c(eVar);
    }

    private k() {
    }

    public static final f a(g kind, boolean z10, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return z10 ? new l(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new f(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final f b(g kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final h d(j kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return f36726a.g(kind, CollectionsKt.j(), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean m(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m != null) {
            k kVar = f36726a;
            if (kVar.n(interfaceC0941m) || kVar.n(interfaceC0941m.b()) || interfaceC0941m == f36727b) {
                return true;
            }
        }
        return false;
    }

    private final boolean n(InterfaceC0941m interfaceC0941m) {
        return interfaceC0941m instanceof a;
    }

    public static final boolean o(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            return false;
        }
        e0 W02 = abstractC5197E.W0();
        return (W02 instanceof i) && ((i) W02).g() == j.UNINFERRED_TYPE_VARIABLE;
    }

    public final h c(j kind, e0 typeConstructor, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return f(kind, CollectionsKt.j(), typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final i e(j kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return new i(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final h f(j kind, List arguments, e0 typeConstructor, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return new h(typeConstructor, b(g.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final h g(j kind, List arguments, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return f(kind, arguments, e(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final a h() {
        return f36728c;
    }

    public final G i() {
        return f36727b;
    }

    public final Set j() {
        return f36732g;
    }

    public final AbstractC5197E k() {
        return f36730e;
    }

    public final AbstractC5197E l() {
        return f36729d;
    }

    public final String p(AbstractC5197E type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Bd.a.u(type);
        e0 W02 = type.W0();
        Intrinsics.e(W02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((i) W02).h(0);
    }
}
