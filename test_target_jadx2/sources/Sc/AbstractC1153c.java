package Sc;

import ad.C1382i;
import ad.EnumC1381h;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;

/* renamed from: Sc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1153c {

    /* renamed from: a, reason: collision with root package name */
    private static final id.c f9018a = new id.c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b, reason: collision with root package name */
    private static final id.c f9019b = new id.c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c, reason: collision with root package name */
    private static final id.c f9020c = new id.c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d, reason: collision with root package name */
    private static final id.c f9021d = new id.c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e, reason: collision with root package name */
    private static final List f9022e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map f9023f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map f9024g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set f9025h;

    static {
        EnumC1152b enumC1152b = EnumC1152b.FIELD;
        EnumC1152b enumC1152b2 = EnumC1152b.METHOD_RETURN_TYPE;
        EnumC1152b enumC1152b3 = EnumC1152b.VALUE_PARAMETER;
        List m10 = CollectionsKt.m(enumC1152b, enumC1152b2, enumC1152b3, EnumC1152b.TYPE_PARAMETER_BOUNDS, EnumC1152b.TYPE_USE);
        f9022e = m10;
        id.c l10 = C.l();
        EnumC1381h enumC1381h = EnumC1381h.NOT_NULL;
        Map k10 = kotlin.collections.G.k(lc.t.a(l10, new r(new C1382i(enumC1381h, false, 2, null), m10, false)), lc.t.a(C.i(), new r(new C1382i(enumC1381h, false, 2, null), m10, false)));
        f9023f = k10;
        f9024g = kotlin.collections.G.n(kotlin.collections.G.k(lc.t.a(new id.c("javax.annotation.ParametersAreNullableByDefault"), new r(new C1382i(EnumC1381h.NULLABLE, false, 2, null), CollectionsKt.e(enumC1152b3), false, 4, null)), lc.t.a(new id.c("javax.annotation.ParametersAreNonnullByDefault"), new r(new C1382i(enumC1381h, false, 2, null), CollectionsKt.e(enumC1152b3), false, 4, null))), k10);
        f9025h = O.h(C.f(), C.e());
    }

    public static final Map a() {
        return f9024g;
    }

    public static final Set b() {
        return f9025h;
    }

    public static final Map c() {
        return f9023f;
    }

    public static final id.c d() {
        return f9021d;
    }

    public static final id.c e() {
        return f9020c;
    }

    public static final id.c f() {
        return f9019b;
    }

    public static final id.c g() {
        return f9018a;
    }
}
