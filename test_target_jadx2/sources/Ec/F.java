package Ec;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class F {

    public static class a extends b implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f1942b;

        /* renamed from: c, reason: collision with root package name */
        private volatile SoftReference f1943c;

        public a(Object obj, Function0 function0) {
            if (function0 == null) {
                e(0);
            }
            this.f1943c = null;
            this.f1942b = function0;
            if (obj != null) {
                this.f1943c = new SoftReference(a(obj));
            }
        }

        private static /* synthetic */ void e(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // Ec.F.b, kotlin.jvm.functions.Function0
        public Object invoke() {
            Object obj;
            SoftReference softReference = this.f1943c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            Object invoke = this.f1942b.invoke();
            this.f1943c = new SoftReference(a(invoke));
            return invoke;
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Object f1944a = new a();

        static class a {
            a() {
            }
        }

        protected Object a(Object obj) {
            return obj == null ? f1944a : obj;
        }

        public final Object b(Object obj, Object obj2) {
            return invoke();
        }

        protected Object c(Object obj) {
            if (obj == f1944a) {
                return null;
            }
            return obj;
        }

        public abstract Object invoke();
    }

    private static /* synthetic */ void a(int i10) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static a b(Object obj, Function0 function0) {
        if (function0 == null) {
            a(0);
        }
        return new a(obj, function0);
    }

    public static a c(Function0 function0) {
        if (function0 == null) {
            a(1);
        }
        return b(null, function0);
    }
}
