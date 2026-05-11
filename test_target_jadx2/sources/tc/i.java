package Tc;

import Hc.j;
import Zc.InterfaceC1328a;
import Zc.InterfaceC1329b;
import java.util.Map;
import kotlin.collections.CollectionsKt;
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
public final class i extends b {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ k[] f9765h = {C5142C.k(new u(C5142C.b(i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    private final xd.i f9766g;

    static final class a extends m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            InterfaceC1329b b10 = i.this.b();
            AbstractC3680g c10 = b10 instanceof Zc.e ? d.f9753a.c(((Zc.e) i.this.b()).e()) : b10 instanceof Zc.m ? d.f9753a.c(CollectionsKt.e(i.this.b())) : null;
            Map e10 = c10 != null ? G.e(t.a(c.f9748a.d(), c10)) : null;
            return e10 == null ? G.h() : e10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC1328a annotation, Vc.g c10) {
        super(c10, annotation, j.a.f3907H);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f9766g = c10.e().d(new a());
    }

    @Override // Tc.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        return (Map) xd.m.a(this.f9766g, this, f9765h[0]);
    }
}
