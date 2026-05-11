package Ec;

import hd.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nc.AbstractC3728a;
import org.conscrypt.BuildConfig;

/* renamed from: Ec.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0829h {

    /* renamed from: Ec.h$a */
    public static final class a extends AbstractC0829h {

        /* renamed from: a, reason: collision with root package name */
        private final Class f1972a;

        /* renamed from: b, reason: collision with root package name */
        private final List f1973b;

        /* renamed from: Ec.h$a$a, reason: collision with other inner class name */
        static final class C0043a extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0043a f1974a = new C0043a();

            C0043a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                return Pc.d.b(returnType);
            }
        }

        /* renamed from: Ec.h$a$b */
        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC3728a.a(((Method) obj).getName(), ((Method) obj2).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class jClass) {
            super(null);
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            this.f1972a = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            this.f1973b = AbstractC3574i.d0(declaredMethods, new b());
        }

        @Override // Ec.AbstractC0829h
        public String a() {
            return CollectionsKt.l0(this.f1973b, BuildConfig.FLAVOR, "<init>(", ")V", 0, null, C0043a.f1974a, 24, null);
        }

        public final List b() {
            return this.f1973b;
        }
    }

    /* renamed from: Ec.h$b */
    public static final class b extends AbstractC0829h {

        /* renamed from: a, reason: collision with root package name */
        private final Constructor f1975a;

        /* renamed from: Ec.h$b$a */
        static final class a extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1976a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Class cls) {
                Intrinsics.d(cls);
                return Pc.d.b(cls);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(null);
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            this.f1975a = constructor;
        }

        @Override // Ec.AbstractC0829h
        public String a() {
            Class<?>[] parameterTypes = this.f1975a.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            return AbstractC3574i.S(parameterTypes, BuildConfig.FLAVOR, "<init>(", ")V", 0, null, a.f1976a, 24, null);
        }

        public final Constructor b() {
            return this.f1975a;
        }
    }

    /* renamed from: Ec.h$c */
    public static final class c extends AbstractC0829h {

        /* renamed from: a, reason: collision with root package name */
        private final Method f1977a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            Intrinsics.checkNotNullParameter(method, "method");
            this.f1977a = method;
        }

        @Override // Ec.AbstractC0829h
        public String a() {
            String b10;
            b10 = J.b(this.f1977a);
            return b10;
        }

        public final Method b() {
            return this.f1977a;
        }
    }

    /* renamed from: Ec.h$d */
    public static final class d extends AbstractC0829h {

        /* renamed from: a, reason: collision with root package name */
        private final d.b f1978a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1979b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d.b signature) {
            super(null);
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f1978a = signature;
            this.f1979b = signature.a();
        }

        @Override // Ec.AbstractC0829h
        public String a() {
            return this.f1979b;
        }

        public final String b() {
            return this.f1978a.b();
        }
    }

    /* renamed from: Ec.h$e */
    public static final class e extends AbstractC0829h {

        /* renamed from: a, reason: collision with root package name */
        private final d.b f1980a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1981b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d.b signature) {
            super(null);
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f1980a = signature;
            this.f1981b = signature.a();
        }

        @Override // Ec.AbstractC0829h
        public String a() {
            return this.f1981b;
        }

        public final String b() {
            return this.f1980a.b();
        }

        public final String c() {
            return this.f1980a.c();
        }
    }

    public /* synthetic */ AbstractC0829h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private AbstractC0829h() {
    }
}
