package Tc;

import Hc.j;
import Kc.j0;
import Zc.InterfaceC1329b;
import id.C3367b;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.n;
import kotlin.reflect.jvm.internal.impl.types.error.k;
import lc.t;
import md.AbstractC3680g;
import md.C3675b;
import md.C3683j;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f9753a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f9754b = G.k(t.a("PACKAGE", EnumSet.noneOf(n.class)), t.a("TYPE", EnumSet.of(n.CLASS, n.FILE)), t.a("ANNOTATION_TYPE", EnumSet.of(n.ANNOTATION_CLASS)), t.a("TYPE_PARAMETER", EnumSet.of(n.TYPE_PARAMETER)), t.a("FIELD", EnumSet.of(n.FIELD)), t.a("LOCAL_VARIABLE", EnumSet.of(n.LOCAL_VARIABLE)), t.a("PARAMETER", EnumSet.of(n.VALUE_PARAMETER)), t.a("CONSTRUCTOR", EnumSet.of(n.CONSTRUCTOR)), t.a("METHOD", EnumSet.of(n.FUNCTION, n.PROPERTY_GETTER, n.PROPERTY_SETTER)), t.a("TYPE_USE", EnumSet.of(n.TYPE)));

    /* renamed from: c, reason: collision with root package name */
    private static final Map f9755c = G.k(t.a("RUNTIME", m.RUNTIME), t.a("CLASS", m.BINARY), t.a("SOURCE", m.SOURCE));

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9756a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke(Kc.G module) {
            Intrinsics.checkNotNullParameter(module, "module");
            j0 b10 = Tc.a.b(c.f9748a.d(), module.v().o(j.a.f3907H));
            AbstractC5197E type = b10 != null ? b10.getType() : null;
            return type == null ? k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
        }
    }

    private d() {
    }

    public final AbstractC3680g a(InterfaceC1329b interfaceC1329b) {
        Zc.m mVar = interfaceC1329b instanceof Zc.m ? (Zc.m) interfaceC1329b : null;
        if (mVar == null) {
            return null;
        }
        Map map = f9755c;
        id.f d10 = mVar.d();
        m mVar2 = (m) map.get(d10 != null ? d10.c() : null);
        if (mVar2 == null) {
            return null;
        }
        C3367b m10 = C3367b.m(j.a.f3913K);
        Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
        id.f o10 = id.f.o(mVar2.name());
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        return new C3683j(m10, o10);
    }

    public final Set b(String str) {
        EnumSet enumSet = (EnumSet) f9754b.get(str);
        return enumSet != null ? enumSet : O.d();
    }

    public final AbstractC3680g c(List arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        ArrayList<Zc.m> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof Zc.m) {
                arrayList.add(obj);
            }
        }
        ArrayList<n> arrayList2 = new ArrayList();
        for (Zc.m mVar : arrayList) {
            d dVar = f9753a;
            id.f d10 = mVar.d();
            CollectionsKt.z(arrayList2, dVar.b(d10 != null ? d10.c() : null));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.u(arrayList2, 10));
        for (n nVar : arrayList2) {
            C3367b m10 = C3367b.m(j.a.f3911J);
            Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
            id.f o10 = id.f.o(nVar.name());
            Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
            arrayList3.add(new C3683j(m10, o10));
        }
        return new C3675b(arrayList3, a.f9756a);
    }
}
