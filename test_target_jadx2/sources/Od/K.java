package Od;

import Jd.P0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final D f7306a = new D("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f7307b = new Function2() { // from class: Od.H
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Object d10;
            d10 = K.d(obj, (CoroutineContext.Element) obj2);
            return d10;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f7308c = new Function2() { // from class: Od.I
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            P0 e10;
            e10 = K.e((P0) obj, (CoroutineContext.Element) obj2);
            return e10;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f7309d = new Function2() { // from class: Od.J
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            O h10;
            h10 = K.h((O) obj, (CoroutineContext.Element) obj2);
            return h10;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof P0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? element : Integer.valueOf(intValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P0 e(P0 p02, CoroutineContext.Element element) {
        if (p02 != null) {
            return p02;
        }
        if (element instanceof P0) {
            return (P0) element;
        }
        return null;
    }

    public static final void f(CoroutineContext coroutineContext, Object obj) {
        if (obj == f7306a) {
            return;
        }
        if (obj instanceof O) {
            ((O) obj).b(coroutineContext);
            return;
        }
        Object K10 = coroutineContext.K(null, f7308c);
        Intrinsics.e(K10, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((P0) K10).C(coroutineContext, obj);
    }

    public static final Object g(CoroutineContext coroutineContext) {
        Object K10 = coroutineContext.K(0, f7307b);
        Intrinsics.d(K10);
        return K10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O h(O o10, CoroutineContext.Element element) {
        if (element instanceof P0) {
            P0 p02 = (P0) element;
            o10.a(p02, p02.Q(o10.f7310a));
        }
        return o10;
    }

    public static final Object i(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = g(coroutineContext);
        }
        if (obj == 0) {
            return f7306a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.K(new O(coroutineContext, ((Number) obj).intValue()), f7309d);
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((P0) obj).Q(coroutineContext);
    }
}
