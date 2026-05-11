package De;

import De.E;
import Td.F;
import Td.InterfaceC1229e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
abstract class k extends B {

    /* renamed from: a, reason: collision with root package name */
    private final y f1659a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1229e.a f1660b;

    /* renamed from: c, reason: collision with root package name */
    private final f f1661c;

    static final class a extends k {

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC0819c f1662d;

        a(y yVar, InterfaceC1229e.a aVar, f fVar, InterfaceC0819c interfaceC0819c) {
            super(yVar, aVar, fVar);
            this.f1662d = interfaceC0819c;
        }

        @Override // De.k
        protected Object c(InterfaceC0818b interfaceC0818b, Object[] objArr) {
            return this.f1662d.a(interfaceC0818b);
        }
    }

    static final class b extends k {

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC0819c f1663d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f1664e;

        b(y yVar, InterfaceC1229e.a aVar, f fVar, InterfaceC0819c interfaceC0819c, boolean z10) {
            super(yVar, aVar, fVar);
            this.f1663d = interfaceC0819c;
            this.f1664e = z10;
        }

        @Override // De.k
        protected Object c(InterfaceC0818b interfaceC0818b, Object[] objArr) {
            InterfaceC0818b interfaceC0818b2 = (InterfaceC0818b) this.f1663d.a(interfaceC0818b);
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) objArr[objArr.length - 1];
            try {
                return this.f1664e ? m.b(interfaceC0818b2, dVar) : m.a(interfaceC0818b2, dVar);
            } catch (Exception e10) {
                return m.d(e10, dVar);
            }
        }
    }

    static final class c extends k {

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC0819c f1665d;

        c(y yVar, InterfaceC1229e.a aVar, f fVar, InterfaceC0819c interfaceC0819c) {
            super(yVar, aVar, fVar);
            this.f1665d = interfaceC0819c;
        }

        @Override // De.k
        protected Object c(InterfaceC0818b interfaceC0818b, Object[] objArr) {
            InterfaceC0818b interfaceC0818b2 = (InterfaceC0818b) this.f1665d.a(interfaceC0818b);
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) objArr[objArr.length - 1];
            try {
                return m.c(interfaceC0818b2, dVar);
            } catch (Exception e10) {
                return m.d(e10, dVar);
            }
        }
    }

    k(y yVar, InterfaceC1229e.a aVar, f fVar) {
        this.f1659a = yVar;
        this.f1660b = aVar;
        this.f1661c = fVar;
    }

    private static InterfaceC0819c d(A a10, Method method, Type type, Annotation[] annotationArr) {
        try {
            return a10.a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw E.n(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    private static f e(A a10, Method method, Type type) {
        try {
            return a10.h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw E.n(method, e10, "Unable to create converter for %s", type);
        }
    }

    static k f(A a10, Method method, y yVar) {
        Type genericReturnType;
        boolean z10;
        boolean z11 = yVar.f1771k;
        Annotation[] annotations = method.getAnnotations();
        if (z11) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f10 = E.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (E.h(f10) == z.class && (f10 instanceof ParameterizedType)) {
                f10 = E.g(0, (ParameterizedType) f10);
                z10 = true;
            } else {
                z10 = false;
            }
            genericReturnType = new E.b(null, InterfaceC0818b.class, f10);
            annotations = D.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
        }
        InterfaceC0819c d10 = d(a10, method, genericReturnType, annotations);
        Type b10 = d10.b();
        if (b10 == F.class) {
            throw E.m(method, "'" + E.h(b10).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (b10 == z.class) {
            throw E.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (yVar.f1763c.equals("HEAD") && !Void.class.equals(b10)) {
            throw E.m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        f e10 = e(a10, method, b10);
        InterfaceC1229e.a aVar = a10.f1602b;
        return !z11 ? new a(yVar, aVar, e10, d10) : z10 ? new c(yVar, aVar, e10, d10) : new b(yVar, aVar, e10, d10, false);
    }

    @Override // De.B
    final Object a(Object[] objArr) {
        return c(new n(this.f1659a, objArr, this.f1660b, this.f1661c), objArr);
    }

    protected abstract Object c(InterfaceC0818b interfaceC0818b, Object[] objArr);
}
