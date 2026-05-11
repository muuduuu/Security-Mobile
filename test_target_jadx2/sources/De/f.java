package De;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface f {

    public static abstract class a {
        protected static Type a(int i10, ParameterizedType parameterizedType) {
            return E.g(i10, parameterizedType);
        }

        protected static Class b(Type type) {
            return E.h(type);
        }

        public f c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, A a10) {
            return null;
        }

        public abstract f d(Type type, Annotation[] annotationArr, A a10);

        public f e(Type type, Annotation[] annotationArr, A a10) {
            return null;
        }
    }

    Object a(Object obj);
}
