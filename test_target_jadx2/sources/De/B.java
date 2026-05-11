package De;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
abstract class B {
    B() {
    }

    static B b(A a10, Method method) {
        y b10 = y.b(a10, method);
        Type genericReturnType = method.getGenericReturnType();
        if (E.j(genericReturnType)) {
            throw E.m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return k.f(a10, method, b10);
        }
        throw E.m(method, "Service methods cannot return void.", new Object[0]);
    }

    abstract Object a(Object[] objArr);
}
