package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Hc.j;
import Kc.G;
import id.C3367b;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import md.C3674a;
import md.C3675b;
import md.C3683j;
import md.C3694u;
import org.conscrypt.BuildConfig;
import yd.AbstractC5197E;
import yd.M;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final id.f f36439a;

    /* renamed from: b, reason: collision with root package name */
    private static final id.f f36440b;

    /* renamed from: c, reason: collision with root package name */
    private static final id.f f36441c;

    /* renamed from: d, reason: collision with root package name */
    private static final id.f f36442d;

    /* renamed from: e, reason: collision with root package name */
    private static final id.f f36443e;

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Hc.g f36444a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Hc.g gVar) {
            super(1);
            this.f36444a = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke(G module) {
            Intrinsics.checkNotNullParameter(module, "module");
            M l10 = module.v().l(u0.INVARIANT, this.f36444a.W());
            Intrinsics.checkNotNullExpressionValue(l10, "getArrayType(...)");
            return l10;
        }
    }

    static {
        id.f o10 = id.f.o("message");
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        f36439a = o10;
        id.f o11 = id.f.o("replaceWith");
        Intrinsics.checkNotNullExpressionValue(o11, "identifier(...)");
        f36440b = o11;
        id.f o12 = id.f.o("level");
        Intrinsics.checkNotNullExpressionValue(o12, "identifier(...)");
        f36441c = o12;
        id.f o13 = id.f.o("expression");
        Intrinsics.checkNotNullExpressionValue(o13, "identifier(...)");
        f36442d = o13;
        id.f o14 = id.f.o("imports");
        Intrinsics.checkNotNullExpressionValue(o14, "identifier(...)");
        f36443e = o14;
    }

    public static final c a(Hc.g gVar, String message, String replaceWith, String level, boolean z10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(replaceWith, "replaceWith");
        Intrinsics.checkNotNullParameter(level, "level");
        j jVar = new j(gVar, j.a.f3895B, kotlin.collections.G.k(t.a(f36442d, new C3694u(replaceWith)), t.a(f36443e, new C3675b(CollectionsKt.j(), new a(gVar)))), false, 8, null);
        id.c cVar = j.a.f3979y;
        Pair a10 = t.a(f36439a, new C3694u(message));
        Pair a11 = t.a(f36440b, new C3674a(jVar));
        id.f fVar = f36441c;
        C3367b m10 = C3367b.m(j.a.f3893A);
        Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
        id.f o10 = id.f.o(level);
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        return new j(gVar, cVar, kotlin.collections.G.k(a10, a11, t.a(fVar, new C3683j(m10, o10))), z10);
    }

    public static /* synthetic */ c b(Hc.g gVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return a(gVar, str, str2, str3, z10);
    }
}
