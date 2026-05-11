package Oc;

import Hc.j;
import bd.t;
import id.C3367b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;
import md.C3679f;
import vc.AbstractC5011a;

/* loaded from: classes3.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f7284a = new c();

    private c() {
    }

    private final C3679f a(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(cls, "getComponentType(...)");
        }
        if (!cls.isPrimitive()) {
            C3367b a10 = Pc.d.a(cls);
            Jc.c cVar = Jc.c.f4890a;
            id.c b10 = a10.b();
            Intrinsics.checkNotNullExpressionValue(b10, "asSingleFqName(...)");
            C3367b m10 = cVar.m(b10);
            if (m10 != null) {
                a10 = m10;
            }
            return new C3679f(a10, i10);
        }
        if (Intrinsics.b(cls, Void.TYPE)) {
            C3367b m11 = C3367b.m(j.a.f3941f.l());
            Intrinsics.checkNotNullExpressionValue(m11, "topLevel(...)");
            return new C3679f(m11, i10);
        }
        Hc.h primitiveType = pd.e.get(cls.getName()).getPrimitiveType();
        Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
        if (i10 > 0) {
            C3367b m12 = C3367b.m(primitiveType.getArrayTypeFqName());
            Intrinsics.checkNotNullExpressionValue(m12, "topLevel(...)");
            return new C3679f(m12, i10 - 1);
        }
        C3367b m13 = C3367b.m(primitiveType.getTypeFqName());
        Intrinsics.checkNotNullExpressionValue(m13, "topLevel(...)");
        return new C3679f(m13, i10);
    }

    private final void c(Class cls, t.d dVar) {
        Constructor<?>[] constructorArr;
        int i10;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
        int length = declaredConstructors.length;
        int i11 = 0;
        while (i11 < length) {
            Constructor<?> constructor = declaredConstructors[i11];
            id.f fVar = id.h.f34202i;
            m mVar = m.f7298a;
            Intrinsics.d(constructor);
            t.e b10 = dVar.b(fVar, mVar.a(constructor));
            if (b10 == null) {
                constructorArr = declaredConstructors;
                i10 = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (Annotation annotation : declaredAnnotations) {
                    Intrinsics.d(annotation);
                    f(b10, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                Intrinsics.d(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i12 = 0; i12 < length3; i12++) {
                        Annotation[] annotationArr = parameterAnnotations[i12];
                        Intrinsics.d(annotationArr);
                        int length4 = annotationArr.length;
                        int i13 = 0;
                        while (i13 < length4) {
                            Annotation annotation2 = annotationArr[i13];
                            Class b11 = AbstractC5011a.b(AbstractC5011a.a(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            C3367b a10 = Pc.d.a(b11);
                            int i14 = length;
                            Intrinsics.d(annotation2);
                            t.a c10 = b10.c(i12 + length2, a10, new b(annotation2));
                            if (c10 != null) {
                                f7284a.h(c10, annotation2, b11);
                            }
                            i13++;
                            declaredConstructors = constructorArr2;
                            length = i14;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i10 = length;
                b10.a();
            }
            i11++;
            declaredConstructors = constructorArr;
            length = i10;
        }
    }

    private final void d(Class cls, t.d dVar) {
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            id.f o10 = id.f.o(field.getName());
            Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
            m mVar = m.f7298a;
            Intrinsics.d(field);
            t.c a10 = dVar.a(o10, mVar.b(field), null);
            if (a10 != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (Annotation annotation : declaredAnnotations) {
                    Intrinsics.d(annotation);
                    f(a10, annotation);
                }
                a10.a();
            }
        }
    }

    private final void e(Class cls, t.d dVar) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            id.f o10 = id.f.o(method.getName());
            Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
            m mVar = m.f7298a;
            Intrinsics.d(method);
            t.e b10 = dVar.b(o10, mVar.c(method));
            if (b10 != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (Annotation annotation : declaredAnnotations) {
                    Intrinsics.d(annotation);
                    f(b10, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Annotation[] annotationArr2 = annotationArr[i10];
                    Intrinsics.d(annotationArr2);
                    for (Annotation annotation2 : annotationArr2) {
                        Class b11 = AbstractC5011a.b(AbstractC5011a.a(annotation2));
                        C3367b a10 = Pc.d.a(b11);
                        Intrinsics.d(annotation2);
                        t.a c10 = b10.c(i10, a10, new b(annotation2));
                        if (c10 != null) {
                            f7284a.h(c10, annotation2, b11);
                        }
                    }
                }
                b10.a();
            }
        }
    }

    private final void f(t.c cVar, Annotation annotation) {
        Class b10 = AbstractC5011a.b(AbstractC5011a.a(annotation));
        t.a b11 = cVar.b(Pc.d.a(b10), new b(annotation));
        if (b11 != null) {
            f7284a.h(b11, annotation, b10);
        }
    }

    private final void g(t.a aVar, id.f fVar, Object obj) {
        Set set;
        Class<?> cls = obj.getClass();
        if (Intrinsics.b(cls, Class.class)) {
            Intrinsics.e(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.b(fVar, a((Class) obj));
            return;
        }
        set = i.f7291a;
        if (set.contains(cls)) {
            aVar.d(fVar, obj);
            return;
        }
        if (Pc.d.h(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            Intrinsics.d(cls);
            C3367b a10 = Pc.d.a(cls);
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            id.f o10 = id.f.o(((Enum) obj).name());
            Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
            aVar.f(fVar, a10, o10);
            return;
        }
        if (Annotation.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
            Class cls2 = (Class) AbstractC3574i.Z(interfaces);
            Intrinsics.d(cls2);
            t.a e10 = aVar.e(fVar, Pc.d.a(cls2));
            if (e10 == null) {
                return;
            }
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(e10, (Annotation) obj, cls2);
            return;
        }
        if (!cls.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
        }
        t.b c10 = aVar.c(fVar);
        if (c10 == null) {
            return;
        }
        Class<?> componentType = cls.getComponentType();
        int i10 = 0;
        if (componentType.isEnum()) {
            Intrinsics.d(componentType);
            C3367b a11 = Pc.d.a(componentType);
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i10 < length) {
                Object obj2 = objArr[i10];
                Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                id.f o11 = id.f.o(((Enum) obj2).name());
                Intrinsics.checkNotNullExpressionValue(o11, "identifier(...)");
                c10.c(a11, o11);
                i10++;
            }
        } else if (Intrinsics.b(componentType, Class.class)) {
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i10 < length2) {
                Object obj3 = objArr2[i10];
                Intrinsics.e(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                c10.e(a((Class) obj3));
                i10++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i10 < length3) {
                Object obj4 = objArr3[i10];
                Intrinsics.d(componentType);
                t.a b10 = c10.b(Pc.d.a(componentType));
                if (b10 != null) {
                    Intrinsics.e(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    h(b10, (Annotation) obj4, componentType);
                }
                i10++;
            }
        } else {
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i10 < length4) {
                c10.d(objArr4[i10]);
                i10++;
            }
        }
        c10.a();
    }

    private final void h(t.a aVar, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, null);
                Intrinsics.d(invoke);
                id.f o10 = id.f.o(method.getName());
                Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
                g(aVar, o10, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(Class klass, t.c visitor) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            Intrinsics.d(annotation);
            f(visitor, annotation);
        }
        visitor.a();
    }

    public final void i(Class klass, t.d memberVisitor) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(memberVisitor, "memberVisitor");
        e(klass, memberVisitor);
        c(klass, memberVisitor);
        d(klass, memberVisitor);
    }
}
