package Fc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;

/* loaded from: classes3.dex */
class b implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Class f2669a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f2670b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f2671c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f2672d;

    /* renamed from: e, reason: collision with root package name */
    private final List f2673e;

    public b(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f2669a = cls;
        this.f2670b = map;
        this.f2671c = lazy;
        this.f2672d = lazy2;
        this.f2673e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object i10;
        i10 = c.i(this.f2669a, this.f2670b, this.f2671c, this.f2672d, this.f2673e, obj, method, objArr);
        return i10;
    }
}
