package Tc;

import Hc.j;
import Zc.InterfaceC1328a;
import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.k;
import lc.t;
import md.C3694u;
import xc.C5142C;
import xc.m;
import xc.u;

/* loaded from: classes3.dex */
public final class e extends b {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ k[] f9757h = {C5142C.k(new u(C5142C.b(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    private final xd.i f9758g;

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9759a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return G.e(t.a(c.f9748a.b(), new C3694u("Deprecated in Java")));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC1328a interfaceC1328a, Vc.g c10) {
        super(c10, interfaceC1328a, j.a.f3979y);
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f9758g = c10.e().d(a.f9759a);
    }

    @Override // Tc.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        return (Map) xd.m.a(this.f9758g, this, f9757h[0]);
    }
}
