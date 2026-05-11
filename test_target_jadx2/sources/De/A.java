package De;

import De.C0817a;
import De.InterfaceC0819c;
import De.f;
import Td.InterfaceC1229e;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private final Map f1601a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC1229e.a f1602b;

    /* renamed from: c, reason: collision with root package name */
    final Td.w f1603c;

    /* renamed from: d, reason: collision with root package name */
    final List f1604d;

    /* renamed from: e, reason: collision with root package name */
    final List f1605e;

    /* renamed from: f, reason: collision with root package name */
    final Executor f1606f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f1607g;

    class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final w f1608a = w.f();

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f1609b = new Object[0];

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f1610c;

        a(Class cls) {
            this.f1610c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f1609b;
            }
            return this.f1608a.h(method) ? this.f1608a.g(method, this.f1610c, obj, objArr) : A.this.c(method).a(objArr);
        }
    }

    A(InterfaceC1229e.a aVar, Td.w wVar, List list, List list2, Executor executor, boolean z10) {
        this.f1602b = aVar;
        this.f1603c = wVar;
        this.f1604d = list;
        this.f1605e = list2;
        this.f1606f = executor;
        this.f1607g = z10;
    }

    private void j(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f1607g) {
            w f10 = w.f();
            for (Method method : cls.getDeclaredMethods()) {
                if (!f10.h(method) && !Modifier.isStatic(method.getModifiers())) {
                    c(method);
                }
            }
        }
    }

    public InterfaceC0819c a(Type type, Annotation[] annotationArr) {
        return d(null, type, annotationArr);
    }

    public Object b(Class cls) {
        j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    B c(Method method) {
        B b10;
        B b11 = (B) this.f1601a.get(method);
        if (b11 != null) {
            return b11;
        }
        synchronized (this.f1601a) {
            try {
                b10 = (B) this.f1601a.get(method);
                if (b10 == null) {
                    b10 = B.b(this, method);
                    this.f1601a.put(method, b10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b10;
    }

    public InterfaceC0819c d(InterfaceC0819c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f1605e.indexOf(aVar) + 1;
        int size = this.f1605e.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            InterfaceC0819c a10 = ((InterfaceC0819c.a) this.f1605e.get(i10)).a(type, annotationArr, this);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((InterfaceC0819c.a) this.f1605e.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f1605e.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((InterfaceC0819c.a) this.f1605e.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public f e(f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f1604d.indexOf(aVar) + 1;
        int size = this.f1604d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f c10 = ((f.a) this.f1604d.get(i10)).c(type, annotationArr, annotationArr2, this);
            if (c10 != null) {
                return c10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((f.a) this.f1604d.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f1604d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((f.a) this.f1604d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public f f(f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f1604d.indexOf(aVar) + 1;
        int size = this.f1604d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f d10 = ((f.a) this.f1604d.get(i10)).d(type, annotationArr, this);
            if (d10 != null) {
                return d10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((f.a) this.f1604d.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f1604d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((f.a) this.f1604d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public f g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e(null, type, annotationArr, annotationArr2);
    }

    public f h(Type type, Annotation[] annotationArr) {
        return f(null, type, annotationArr);
    }

    public f i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f1604d.size();
        for (int i10 = 0; i10 < size; i10++) {
            f e10 = ((f.a) this.f1604d.get(i10)).e(type, annotationArr, this);
            if (e10 != null) {
                return e10;
            }
        }
        return C0817a.d.f1631a;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final w f1612a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1229e.a f1613b;

        /* renamed from: c, reason: collision with root package name */
        private Td.w f1614c;

        /* renamed from: d, reason: collision with root package name */
        private final List f1615d;

        /* renamed from: e, reason: collision with root package name */
        private final List f1616e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f1617f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f1618g;

        b(w wVar) {
            this.f1615d = new ArrayList();
            this.f1616e = new ArrayList();
            this.f1612a = wVar;
        }

        public b a(f.a aVar) {
            List list = this.f1615d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(Td.w wVar) {
            Objects.requireNonNull(wVar, "baseUrl == null");
            if (BuildConfig.FLAVOR.equals(wVar.m().get(r0.size() - 1))) {
                this.f1614c = wVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + wVar);
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return b(Td.w.g(str));
        }

        public A d() {
            if (this.f1614c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC1229e.a aVar = this.f1613b;
            if (aVar == null) {
                aVar = new Td.B();
            }
            InterfaceC1229e.a aVar2 = aVar;
            Executor executor = this.f1617f;
            if (executor == null) {
                executor = this.f1612a.b();
            }
            Executor executor2 = executor;
            ArrayList arrayList = new ArrayList(this.f1616e);
            arrayList.addAll(this.f1612a.a(executor2));
            ArrayList arrayList2 = new ArrayList(this.f1615d.size() + 1 + this.f1612a.d());
            arrayList2.add(new C0817a());
            arrayList2.addAll(this.f1615d);
            arrayList2.addAll(this.f1612a.c());
            return new A(aVar2, this.f1614c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f1618g);
        }

        public b e(InterfaceC1229e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f1613b = aVar;
            return this;
        }

        public b f(Td.B b10) {
            Objects.requireNonNull(b10, "client == null");
            return e(b10);
        }

        public b() {
            this(w.f());
        }
    }
}
