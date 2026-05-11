package Fc;

import Fc.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.C5145F;

/* loaded from: classes3.dex */
public abstract class f implements Fc.e {

    /* renamed from: e, reason: collision with root package name */
    public static final d f2678e = new d(null);

    /* renamed from: a, reason: collision with root package name */
    private final Member f2679a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f2680b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f2681c;

    /* renamed from: d, reason: collision with root package name */
    private final List f2682d;

    public static final class a extends f implements Fc.d {

        /* renamed from: f, reason: collision with root package name */
        private final Object f2683f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Constructor constructor, Object obj) {
            super(constructor, r3, null, (Type[]) (r0.length <= 2 ? new Type[0] : AbstractC3574i.m(r0, 1, r0.length - 1)), null);
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            this.f2683f = obj;
        }

        @Override // Fc.e
        public Object h(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            b(args);
            Constructor constructor = (Constructor) a();
            C5145F c5145f = new C5145F(3);
            c5145f.a(this.f2683f);
            c5145f.b(args);
            c5145f.a(null);
            return constructor.newInstance(c5145f.d(new Object[c5145f.c()]));
        }
    }

    public static final class b extends f {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(Constructor constructor) {
            super(constructor, r3, null, (Type[]) (r0.length <= 1 ? new Type[0] : AbstractC3574i.m(r0, 0, r0.length - 1)), null);
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        }

        @Override // Fc.e
        public Object h(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            b(args);
            Constructor constructor = (Constructor) a();
            C5145F c5145f = new C5145F(2);
            c5145f.b(args);
            c5145f.a(null);
            return constructor.newInstance(c5145f.d(new Object[c5145f.c()]));
        }
    }

    public static final class c extends f implements Fc.d {

        /* renamed from: f, reason: collision with root package name */
        private final Object f2684f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(Constructor constructor, Object obj) {
            super(constructor, r3, null, r5, null);
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            this.f2684f = obj;
        }

        @Override // Fc.e
        public Object h(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            b(args);
            Constructor constructor = (Constructor) a();
            C5145F c5145f = new C5145F(2);
            c5145f.a(this.f2684f);
            c5145f.b(args);
            return constructor.newInstance(c5145f.d(new Object[c5145f.c()]));
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public static final class e extends f {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(Constructor constructor) {
            super(constructor, r3, r4, r5, null);
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Class declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        }

        @Override // Fc.e
        public Object h(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            b(args);
            return ((Constructor) a()).newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* renamed from: Fc.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0059f extends f {

        /* renamed from: Fc.f$f$a */
        public static final class a extends AbstractC0059f implements Fc.d {

            /* renamed from: f, reason: collision with root package name */
            private final Object f2685f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
                this.f2685f = obj;
            }

            @Override // Fc.f.AbstractC0059f, Fc.e
            public Object h(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                b(args);
                return ((Field) a()).get(this.f2685f);
            }
        }

        /* renamed from: Fc.f$f$b */
        public static final class b extends AbstractC0059f implements Fc.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* renamed from: Fc.f$f$c */
        public static final class c extends AbstractC0059f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* renamed from: Fc.f$f$d */
        public static final class d extends AbstractC0059f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // Fc.f
            public void b(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                super.b(args);
                c(AbstractC3574i.A(args));
            }
        }

        /* renamed from: Fc.f$f$e */
        public static final class e extends AbstractC0059f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        public /* synthetic */ AbstractC0059f(Field field, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10);
        }

        @Override // Fc.e
        public Object h(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            b(args);
            return ((Field) a()).get(d() != null ? AbstractC3574i.z(args) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AbstractC0059f(Field field, boolean z10) {
            super(field, r2, z10 ? field.getDeclaringClass() : null, new Type[0], null);
            Type genericType = field.getGenericType();
            Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
        }
    }

    public static abstract class g extends f {

        /* renamed from: f, reason: collision with root package name */
        private final boolean f2686f;

        public static final class a extends g implements Fc.d {

            /* renamed from: g, reason: collision with root package name */
            private final Object f2687g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
                this.f2687g = obj;
            }

            @Override // Fc.f.g, Fc.e
            public Object h(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                b(args);
                ((Field) a()).set(this.f2687g, AbstractC3574i.z(args));
                return Unit.f36324a;
            }
        }

        public static final class b extends g implements Fc.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // Fc.f.g, Fc.e
            public Object h(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                b(args);
                ((Field) a()).set(null, AbstractC3574i.T(args));
                return Unit.f36324a;
            }
        }

        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // Fc.f.g, Fc.f
            public void b(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                super.b(args);
                c(AbstractC3574i.A(args));
            }
        }

        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        public /* synthetic */ g(Field field, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10, z11);
        }

        @Override // Fc.f
        public void b(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            super.b(args);
            if (this.f2686f && AbstractC3574i.T(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // Fc.e
        public Object h(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            b(args);
            ((Field) a()).set(d() != null ? AbstractC3574i.z(args) : null, AbstractC3574i.T(args));
            return Unit.f36324a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private g(Field field, boolean z10, boolean z11) {
            super(field, TYPE, r3, new Type[]{r9}, null);
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            Class<?> declaringClass = z11 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
            this.f2686f = z10;
        }
    }

    public static abstract class h extends f {

        /* renamed from: f, reason: collision with root package name */
        private final boolean f2688f;

        public static final class a extends h implements Fc.d {

            /* renamed from: g, reason: collision with root package name */
            private final Object f2689g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
                this.f2689g = obj;
            }

            @Override // Fc.e
            public Object h(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                b(args);
                return e(this.f2689g, args);
            }
        }

        public static final class b extends h implements Fc.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // Fc.e
            public Object h(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                b(args);
                return e(null, args);
            }
        }

        public static final class c extends h implements Fc.d {

            /* renamed from: g, reason: collision with root package name */
            private final Object f2690g;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public c(Method method, Object obj) {
                super(method, false, (Type[]) (r0.length <= 1 ? new Type[0] : AbstractC3574i.m(r0, 1, r0.length)), null);
                Intrinsics.checkNotNullParameter(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                this.f2690g = obj;
            }

            public final Object f() {
                return this.f2690g;
            }

            @Override // Fc.e
            public Object h(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                b(args);
                C5145F c5145f = new C5145F(2);
                c5145f.a(this.f2690g);
                c5145f.b(args);
                return e(null, c5145f.d(new Object[c5145f.c()]));
            }
        }

        public static final class d extends h implements Fc.d {

            /* renamed from: g, reason: collision with root package name */
            private final Object[] f2691g;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public d(Method method, Object[] boundReceiverComponents) {
                super(method, false, (Type[]) AbstractC3574i.w(r0, boundReceiverComponents.length).toArray(new Type[0]), null);
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(boundReceiverComponents, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                this.f2691g = boundReceiverComponents;
            }

            public final Object[] f() {
                return this.f2691g;
            }

            @Override // Fc.e
            public Object h(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                b(args);
                C5145F c5145f = new C5145F(2);
                c5145f.b(this.f2691g);
                c5145f.b(args);
                return e(null, c5145f.d(new Object[c5145f.c()]));
            }

            public final int j() {
                return this.f2691g.length;
            }
        }

        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, false, null, 6, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // Fc.e
            public Object h(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                b(args);
                return e(args[0], args.length <= 1 ? new Object[0] : AbstractC3574i.m(args, 1, args.length));
            }
        }

        /* renamed from: Fc.f$h$f, reason: collision with other inner class name */
        public static final class C0060f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0060f(Method method) {
                super(method, true, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // Fc.e
            public Object h(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                b(args);
                c(AbstractC3574i.A(args));
                return e(null, args.length <= 1 ? new Object[0] : AbstractC3574i.m(args, 1, args.length));
            }
        }

        public static final class g extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Method method) {
                super(method, false, null, 6, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // Fc.e
            public Object h(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                b(args);
                return e(null, args);
            }
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z10, typeArr);
        }

        protected final Object e(Object obj, Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return this.f2688f ? Unit.f36324a : ((Method) a()).invoke(obj, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z10, typeArr, null);
            z10 = (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10;
            if ((i10 & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(typeArr, "getGenericParameterTypes(...)");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private h(Method method, boolean z10, Type[] typeArr) {
            super(method, r2, z10 ? method.getDeclaringClass() : null, typeArr, null);
            Type genericReturnType = method.getGenericReturnType();
            Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
            this.f2688f = Intrinsics.b(g(), Void.TYPE);
        }
    }

    public /* synthetic */ f(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    @Override // Fc.e
    public final Member a() {
        return this.f2679a;
    }

    public void b(Object[] objArr) {
        e.a.a(this, objArr);
    }

    protected final void c(Object obj) {
        if (obj == null || !this.f2679a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Class d() {
        return this.f2681c;
    }

    @Override // Fc.e
    public final Type g() {
        return this.f2680b;
    }

    @Override // Fc.e
    public List i() {
        return this.f2682d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private f(Member member, Type type, Class cls, Type[] typeArr) {
        List m02;
        this.f2679a = member;
        this.f2680b = type;
        this.f2681c = cls;
        if (cls != null) {
            C5145F c5145f = new C5145F(2);
            c5145f.a(cls);
            c5145f.b(typeArr);
            m02 = CollectionsKt.m(c5145f.d(new Type[c5145f.c()]));
        }
        m02 = AbstractC3574i.m0(typeArr);
        this.f2682d = m02;
    }
}
