package Oc;

import Kc.G;
import bd.h;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final a f7293c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ud.k f7294a;

    /* renamed from: b, reason: collision with root package name */
    private final Oc.a f7295b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(ClassLoader classLoader) {
            Intrinsics.checkNotNullParameter(classLoader, "classLoader");
            g gVar = new g(classLoader);
            h.a aVar = bd.h.f19005b;
            ClassLoader classLoader2 = Unit.class.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader2, "getClassLoader(...)");
            h.a.C0336a a10 = aVar.a(gVar, new g(classLoader2), new d(classLoader), "runtime module for " + classLoader, j.f7292b, l.f7296a);
            return new k(a10.a().a(), new Oc.a(a10.b(), gVar), null);
        }

        private a() {
        }
    }

    public /* synthetic */ k(ud.k kVar, Oc.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, aVar);
    }

    public final ud.k a() {
        return this.f7294a;
    }

    public final G b() {
        return this.f7294a.q();
    }

    public final Oc.a c() {
        return this.f7295b;
    }

    private k(ud.k kVar, Oc.a aVar) {
        this.f7294a = kVar;
        this.f7295b = aVar;
    }
}
