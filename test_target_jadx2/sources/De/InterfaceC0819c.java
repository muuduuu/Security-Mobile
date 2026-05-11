package De;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: De.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0819c {

    /* renamed from: De.c$a */
    public static abstract class a {
        protected static Type b(int i10, ParameterizedType parameterizedType) {
            return E.g(i10, parameterizedType);
        }

        protected static Class c(Type type) {
            return E.h(type);
        }

        public abstract InterfaceC0819c a(Type type, Annotation[] annotationArr, A a10);
    }

    Object a(InterfaceC0818b interfaceC0818b);

    Type b();
}
