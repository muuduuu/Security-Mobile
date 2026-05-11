package md;

import Kc.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.M;

/* renamed from: md.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3681h {

    /* renamed from: a, reason: collision with root package name */
    public static final C3681h f37480a = new C3681h();

    /* renamed from: md.h$a */
    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Hc.h f37481a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Hc.h hVar) {
            super(1);
            this.f37481a = hVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke(G it) {
            Intrinsics.checkNotNullParameter(it, "it");
            M O10 = it.v().O(this.f37481a);
            Intrinsics.checkNotNullExpressionValue(O10, "getPrimitiveArrayKotlinType(...)");
            return O10;
        }
    }

    private C3681h() {
    }

    private final C3675b a(List list, G g10, Hc.h hVar) {
        List O02 = CollectionsKt.O0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = O02.iterator();
        while (it.hasNext()) {
            AbstractC3680g d10 = d(this, it.next(), null, 2, null);
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        if (g10 == null) {
            return new C3675b(arrayList, new a(hVar));
        }
        M O10 = g10.v().O(hVar);
        Intrinsics.checkNotNullExpressionValue(O10, "getPrimitiveArrayKotlinType(...)");
        return new C3695v(arrayList, O10);
    }

    public static /* synthetic */ AbstractC3680g d(C3681h c3681h, Object obj, G g10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            g10 = null;
        }
        return c3681h.c(obj, g10);
    }

    public final C3675b b(List value, AbstractC5197E type) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        return new C3695v(value, type);
    }

    public final AbstractC3680g c(Object obj, G g10) {
        if (obj instanceof Byte) {
            return new C3677d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C3693t(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C3686m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C3690q(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C3678e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C3685l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C3682i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C3676c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C3694u((String) obj);
        }
        if (obj instanceof byte[]) {
            return a(AbstractC3574i.g0((byte[]) obj), g10, Hc.h.BYTE);
        }
        if (obj instanceof short[]) {
            return a(AbstractC3574i.n0((short[]) obj), g10, Hc.h.SHORT);
        }
        if (obj instanceof int[]) {
            return a(AbstractC3574i.k0((int[]) obj), g10, Hc.h.INT);
        }
        if (obj instanceof long[]) {
            return a(AbstractC3574i.l0((long[]) obj), g10, Hc.h.LONG);
        }
        if (obj instanceof char[]) {
            return a(AbstractC3574i.h0((char[]) obj), g10, Hc.h.CHAR);
        }
        if (obj instanceof float[]) {
            return a(AbstractC3574i.j0((float[]) obj), g10, Hc.h.FLOAT);
        }
        if (obj instanceof double[]) {
            return a(AbstractC3574i.i0((double[]) obj), g10, Hc.h.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return a(AbstractC3574i.o0((boolean[]) obj), g10, Hc.h.BOOLEAN);
        }
        if (obj == null) {
            return new C3691r();
        }
        return null;
    }
}
