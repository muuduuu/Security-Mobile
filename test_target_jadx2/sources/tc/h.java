package Tc;

import Hc.j;
import Zc.InterfaceC1328a;
import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.k;
import lc.t;
import md.AbstractC3680g;
import xc.C5142C;
import xc.m;
import xc.u;

/* loaded from: classes3.dex */
public final class h extends b {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ k[] f9762h = {C5142C.k(new u(C5142C.b(h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    private final xd.i f9763g;

    static final class a extends m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            AbstractC3680g a10 = d.f9753a.a(h.this.b());
            Map e10 = a10 != null ? G.e(t.a(c.f9748a.c(), a10)) : null;
            return e10 == null ? G.h() : e10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC1328a annotation, Vc.g c10) {
        super(c10, annotation, j.a.f3915L);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f9763g = c10.e().d(new a());
    }

    @Override // Tc.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        return (Map) xd.m.a(this.f9763g, this, f9762h[0]);
    }
}
