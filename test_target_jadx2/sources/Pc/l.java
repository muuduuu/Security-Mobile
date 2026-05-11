package Pc;

import Kc.m0;
import Kc.n0;
import Zc.D;
import Zc.InterfaceC1328a;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import xc.AbstractC5156i;
import xc.C5142C;
import xc.C5145F;

/* loaded from: classes3.dex */
public final class l extends p implements Pc.h, v, Zc.g {

    /* renamed from: a, reason: collision with root package name */
    private final Class f7753a;

    /* synthetic */ class a extends AbstractC5156i implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public static final a f7754j = new a();

        a() {
            super(1);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(Member.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "isSynthetic";
        }
    }

    /* synthetic */ class b extends AbstractC5156i implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public static final b f7755j = new b();

        b() {
            super(1);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(o.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final o invoke(Constructor p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new o(p02);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "<init>";
        }
    }

    /* synthetic */ class c extends AbstractC5156i implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public static final c f7756j = new c();

        c() {
            super(1);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(Member.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "isSynthetic";
        }
    }

    /* synthetic */ class d extends AbstractC5156i implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public static final d f7757j = new d();

        d() {
            super(1);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(r.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final r invoke(Field p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new r(p02);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "<init>";
        }
    }

    static final class e extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f7758a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Class cls) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    static final class f extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f7759a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final id.f invoke(Class cls) {
            String simpleName = cls.getSimpleName();
            if (!id.f.q(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return id.f.o(simpleName);
            }
            return null;
        }
    }

    static final class g extends xc.m implements Function1 {
        g() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        
            if (r0.e0(r4) == false) goto L9;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Method method) {
            boolean z10 = false;
            if (!method.isSynthetic()) {
                if (l.this.G()) {
                    l lVar = l.this;
                    Intrinsics.d(method);
                }
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* synthetic */ class h extends AbstractC5156i implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public static final h f7761j = new h();

        h() {
            super(1);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(u.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final u invoke(Method p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new u(p02);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "<init>";
        }
    }

    public l(Class klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f7753a = klass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e0(Method method) {
        String name = method.getName();
        if (Intrinsics.b(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        }
        if (Intrinsics.b(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // Zc.g
    public boolean A() {
        return false;
    }

    @Override // Zc.g
    public boolean G() {
        return this.f7753a.isEnum();
    }

    @Override // Pc.v
    public int J() {
        return this.f7753a.getModifiers();
    }

    @Override // Zc.g
    public boolean K() {
        Boolean f10 = C1120b.f7728a.f(this.f7753a);
        if (f10 != null) {
            return f10.booleanValue();
        }
        return false;
    }

    @Override // Zc.g
    public boolean N() {
        return this.f7753a.isInterface();
    }

    @Override // Zc.s
    public boolean O() {
        return Modifier.isAbstract(J());
    }

    @Override // Zc.g
    public D P() {
        return null;
    }

    @Override // Zc.g
    public Collection U() {
        Class[] c10 = C1120b.f7728a.c(this.f7753a);
        if (c10 == null) {
            return CollectionsKt.j();
        }
        ArrayList arrayList = new ArrayList(c10.length);
        for (Class cls : c10) {
            arrayList.add(new n(cls));
        }
        return arrayList;
    }

    @Override // Zc.g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public List k() {
        Constructor<?>[] declaredConstructors = this.f7753a.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
        return kotlin.sequences.j.C(kotlin.sequences.j.w(kotlin.sequences.j.o(AbstractC3574i.t(declaredConstructors), a.f7754j), b.f7755j));
    }

    @Override // Pc.h
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public Class C() {
        return this.f7753a;
    }

    @Override // Zc.g
    public Collection a() {
        Class cls;
        cls = Object.class;
        if (Intrinsics.b(this.f7753a, cls)) {
            return CollectionsKt.j();
        }
        C5145F c5145f = new C5145F(2);
        Object genericSuperclass = this.f7753a.getGenericSuperclass();
        c5145f.a(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = this.f7753a.getGenericInterfaces();
        Intrinsics.checkNotNullExpressionValue(genericInterfaces, "getGenericInterfaces(...)");
        c5145f.b(genericInterfaces);
        List m10 = CollectionsKt.m(c5145f.d(new Type[c5145f.c()]));
        ArrayList arrayList = new ArrayList(CollectionsKt.u(m10, 10));
        Iterator it = m10.iterator();
        while (it.hasNext()) {
            arrayList.add(new n((Type) it.next()));
        }
        return arrayList;
    }

    @Override // Zc.g
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public List I() {
        Field[] declaredFields = this.f7753a.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        return kotlin.sequences.j.C(kotlin.sequences.j.w(kotlin.sequences.j.o(AbstractC3574i.t(declaredFields), c.f7756j), d.f7757j));
    }

    @Override // Zc.g
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public List R() {
        Class<?>[] declaredClasses = this.f7753a.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        return kotlin.sequences.j.C(kotlin.sequences.j.x(kotlin.sequences.j.o(AbstractC3574i.t(declaredClasses), e.f7758a), f.f7759a));
    }

    @Override // Zc.g
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public List T() {
        Method[] declaredMethods = this.f7753a.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        return kotlin.sequences.j.C(kotlin.sequences.j.w(kotlin.sequences.j.n(AbstractC3574i.t(declaredMethods), new g()), h.f7761j));
    }

    @Override // Zc.g
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public l q() {
        Class<?> declaringClass = this.f7753a.getDeclaringClass();
        if (declaringClass != null) {
            return new l(declaringClass);
        }
        return null;
    }

    @Override // Zc.g
    public id.c e() {
        id.c b10 = Pc.d.a(this.f7753a).b();
        Intrinsics.checkNotNullExpressionValue(b10, "asSingleFqName(...)");
        return b10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof l) && Intrinsics.b(this.f7753a, ((l) obj).f7753a);
    }

    @Override // Zc.t
    public id.f getName() {
        if (!this.f7753a.isAnonymousClass()) {
            id.f o10 = id.f.o(this.f7753a.getSimpleName());
            Intrinsics.d(o10);
            return o10;
        }
        String name = this.f7753a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        id.f o11 = id.f.o(StringsKt.M0(name, ".", null, 2, null));
        Intrinsics.d(o11);
        return o11;
    }

    @Override // Zc.s
    public n0 h() {
        int J10 = J();
        return Modifier.isPublic(J10) ? m0.h.f5580c : Modifier.isPrivate(J10) ? m0.e.f5577c : Modifier.isProtected(J10) ? Modifier.isStatic(J10) ? Nc.c.f6742c : Nc.b.f6741c : Nc.a.f6740c;
    }

    public int hashCode() {
        return this.f7753a.hashCode();
    }

    @Override // Zc.InterfaceC1331d
    public /* bridge */ /* synthetic */ Collection i() {
        return i();
    }

    @Override // Zc.z
    public List n() {
        TypeVariable[] typeParameters = this.f7753a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new A(typeVariable));
        }
        return arrayList;
    }

    @Override // Zc.s
    public boolean o() {
        return Modifier.isStatic(J());
    }

    @Override // Zc.InterfaceC1331d
    public /* bridge */ /* synthetic */ InterfaceC1328a p(id.c cVar) {
        return p(cVar);
    }

    @Override // Zc.g
    public Collection r() {
        Object[] d10 = C1120b.f7728a.d(this.f7753a);
        if (d10 == null) {
            d10 = new Object[0];
        }
        ArrayList arrayList = new ArrayList(d10.length);
        for (Object obj : d10) {
            arrayList.add(new y(obj));
        }
        return arrayList;
    }

    @Override // Zc.InterfaceC1331d
    public boolean s() {
        return false;
    }

    public String toString() {
        return l.class.getName() + ": " + this.f7753a;
    }

    @Override // Zc.s
    public boolean u() {
        return Modifier.isFinal(J());
    }

    @Override // Zc.g
    public boolean x() {
        return this.f7753a.isAnnotation();
    }

    @Override // Zc.g
    public boolean z() {
        Boolean e10 = C1120b.f7728a.e(this.f7753a);
        if (e10 != null) {
            return e10.booleanValue();
        }
        return false;
    }

    @Override // Pc.h, Zc.InterfaceC1331d
    public List i() {
        Annotation[] declaredAnnotations;
        List b10;
        AnnotatedElement C10 = C();
        return (C10 == null || (declaredAnnotations = C10.getDeclaredAnnotations()) == null || (b10 = i.b(declaredAnnotations)) == null) ? CollectionsKt.j() : b10;
    }

    @Override // Pc.h, Zc.InterfaceC1331d
    public Pc.e p(id.c fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        AnnotatedElement C10 = C();
        if (C10 == null || (declaredAnnotations = C10.getDeclaredAnnotations()) == null) {
            return null;
        }
        return i.a(declaredAnnotations, fqName);
    }
}
