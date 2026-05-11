package wd;

import Kc.InterfaceC0941m;
import Kc.a0;
import Kc.d0;
import Mc.AbstractC0976b;
import dd.C3040q;
import dd.C3042s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import ud.B;
import ud.E;
import ud.y;
import yd.AbstractC5197E;

/* renamed from: wd.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5081m extends AbstractC0976b {

    /* renamed from: k, reason: collision with root package name */
    private final ud.m f44576k;

    /* renamed from: l, reason: collision with root package name */
    private final C3042s f44577l;

    /* renamed from: m, reason: collision with root package name */
    private final C5069a f44578m;

    /* renamed from: wd.m$a */
    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return CollectionsKt.O0(C5081m.this.f44576k.c().d().g(C5081m.this.X0(), C5081m.this.f44576k.g()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5081m(ud.m c10, C3042s proto, int i10) {
        super(r2, r3, r4, r5, r0.d(r1), proto.L(), i10, a0.f5560a, d0.a.f5565a);
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(proto, "proto");
        xd.n h10 = c10.h();
        InterfaceC0941m e10 = c10.e();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
        id.f b11 = y.b(c10.g(), proto.K());
        B b12 = B.f43625a;
        C3042s.c Q10 = proto.Q();
        Intrinsics.checkNotNullExpressionValue(Q10, "getVariance(...)");
        this.f44576k = c10;
        this.f44577l = proto;
        this.f44578m = new C5069a(c10.h(), new a());
    }

    @Override // Mc.AbstractC0979e
    protected List U0() {
        List s10 = fd.f.s(this.f44577l, this.f44576k.j());
        if (s10.isEmpty()) {
            return CollectionsKt.e(AbstractC3778c.j(this).y());
        }
        List list = s10;
        E i10 = this.f44576k.i();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i10.q((C3040q) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public C5069a i() {
        return this.f44578m;
    }

    public final C3042s X0() {
        return this.f44577l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mc.AbstractC0979e
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public Void T0(AbstractC5197E type) {
        Intrinsics.checkNotNullParameter(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
