package Sc;

import Sc.w;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static final id.c f9057a;

    /* renamed from: b, reason: collision with root package name */
    private static final id.c f9058b;

    /* renamed from: c, reason: collision with root package name */
    private static final id.c f9059c;

    /* renamed from: d, reason: collision with root package name */
    private static final id.c f9060d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f9061e;

    /* renamed from: f, reason: collision with root package name */
    private static final id.c[] f9062f;

    /* renamed from: g, reason: collision with root package name */
    private static final D f9063g;

    /* renamed from: h, reason: collision with root package name */
    private static final w f9064h;

    static {
        id.c cVar = new id.c("org.jspecify.nullness");
        f9057a = cVar;
        id.c cVar2 = new id.c("org.jspecify.annotations");
        f9058b = cVar2;
        id.c cVar3 = new id.c("io.reactivex.rxjava3.annotations");
        f9059c = cVar3;
        id.c cVar4 = new id.c("org.checkerframework.checker.nullness.compatqual");
        f9060d = cVar4;
        String b10 = cVar3.b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        f9061e = b10;
        f9062f = new id.c[]{new id.c(b10 + ".Nullable"), new id.c(b10 + ".NonNull")};
        id.c cVar5 = new id.c("org.jetbrains.annotations");
        w.a aVar = w.f9065d;
        Pair a10 = lc.t.a(cVar5, aVar.a());
        Pair a11 = lc.t.a(new id.c("androidx.annotation"), aVar.a());
        Pair a12 = lc.t.a(new id.c("android.support.annotation"), aVar.a());
        Pair a13 = lc.t.a(new id.c("android.annotation"), aVar.a());
        Pair a14 = lc.t.a(new id.c("com.android.annotations"), aVar.a());
        Pair a15 = lc.t.a(new id.c("org.eclipse.jdt.annotation"), aVar.a());
        Pair a16 = lc.t.a(new id.c("org.checkerframework.checker.nullness.qual"), aVar.a());
        Pair a17 = lc.t.a(cVar4, aVar.a());
        Pair a18 = lc.t.a(new id.c("javax.annotation"), aVar.a());
        Pair a19 = lc.t.a(new id.c("edu.umd.cs.findbugs.annotations"), aVar.a());
        Pair a20 = lc.t.a(new id.c("io.reactivex.annotations"), aVar.a());
        id.c cVar6 = new id.c("androidx.annotation.RecentlyNullable");
        G g10 = G.WARN;
        Pair a21 = lc.t.a(cVar6, new w(g10, null, null, 4, null));
        Pair a22 = lc.t.a(new id.c("androidx.annotation.RecentlyNonNull"), new w(g10, null, null, 4, null));
        Pair a23 = lc.t.a(new id.c("lombok"), aVar.a());
        lc.g gVar = new lc.g(2, 0);
        G g11 = G.STRICT;
        f9063g = new E(kotlin.collections.G.k(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, lc.t.a(cVar, new w(g10, gVar, g11)), lc.t.a(cVar2, new w(g10, new lc.g(2, 0), g11)), lc.t.a(cVar3, new w(g10, new lc.g(1, 8), g11))));
        f9064h = new w(g10, null, null, 4, null);
    }

    public static final z a(lc.g configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        w wVar = f9064h;
        G c10 = (wVar.d() == null || wVar.d().compareTo(configuredKotlinVersion) > 0) ? wVar.c() : wVar.b();
        return new z(c10, c(c10), null, 4, null);
    }

    public static /* synthetic */ z b(lc.g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = lc.g.f37121f;
        }
        return a(gVar);
    }

    public static final G c(G globalReportLevel) {
        Intrinsics.checkNotNullParameter(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == G.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    public static final G d(id.c annotationFqName) {
        Intrinsics.checkNotNullParameter(annotationFqName, "annotationFqName");
        return h(annotationFqName, D.f8984a.a(), null, 4, null);
    }

    public static final id.c e() {
        return f9058b;
    }

    public static final id.c[] f() {
        return f9062f;
    }

    public static final G g(id.c annotation, D configuredReportLevels, lc.g configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(configuredReportLevels, "configuredReportLevels");
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        G g10 = (G) configuredReportLevels.a(annotation);
        if (g10 != null) {
            return g10;
        }
        w wVar = (w) f9063g.a(annotation);
        return wVar == null ? G.IGNORE : (wVar.d() == null || wVar.d().compareTo(configuredKotlinVersion) > 0) ? wVar.c() : wVar.b();
    }

    public static /* synthetic */ G h(id.c cVar, D d10, lc.g gVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            gVar = new lc.g(1, 7, 20);
        }
        return g(cVar, d10, gVar);
    }
}
