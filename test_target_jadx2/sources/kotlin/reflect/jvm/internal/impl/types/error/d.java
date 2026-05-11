package kotlin.reflect.jvm.internal.impl.types.error;

import Kc.F;
import Kc.G;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0943o;
import Kc.P;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* loaded from: classes3.dex */
public final class d implements G {

    /* renamed from: a, reason: collision with root package name */
    public static final d f36706a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final id.f f36707b;

    /* renamed from: c, reason: collision with root package name */
    private static final List f36708c;

    /* renamed from: d, reason: collision with root package name */
    private static final List f36709d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set f36710e;

    /* renamed from: f, reason: collision with root package name */
    private static final Lazy f36711f;

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36712a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Hc.e invoke() {
            return Hc.e.f3827h.a();
        }
    }

    static {
        id.f r10 = id.f.r(b.ERROR_MODULE.getDebugText());
        Intrinsics.checkNotNullExpressionValue(r10, "special(...)");
        f36707b = r10;
        f36708c = CollectionsKt.j();
        f36709d = CollectionsKt.j();
        f36710e = O.d();
        f36711f = lc.i.a(a.f36712a);
    }

    private d() {
    }

    public id.f D() {
        return f36707b;
    }

    @Override // Kc.G
    public boolean E(G targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        return false;
    }

    @Override // Kc.G
    public Object E0(F capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return null;
    }

    @Override // Kc.InterfaceC0941m
    public InterfaceC0941m b() {
        return null;
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return null;
    }

    @Override // Kc.I
    public id.f getName() {
        return D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
    }

    @Override // Kc.G
    public P p0(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // Kc.G
    public Collection t(id.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt.j();
    }

    @Override // Kc.G
    public Hc.g v() {
        return (Hc.g) f36711f.getValue();
    }

    @Override // Kc.G
    public List z0() {
        return f36709d;
    }

    @Override // Kc.InterfaceC0941m
    public InterfaceC0941m a() {
        return this;
    }
}
