package De;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class w {

    /* renamed from: c, reason: collision with root package name */
    private static final w f1742c = e();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1743a;

    /* renamed from: b, reason: collision with root package name */
    private final Constructor f1744b;

    static final class a extends w {

        /* renamed from: De.w$a$a, reason: collision with other inner class name */
        static final class ExecutorC0033a implements Executor {

            /* renamed from: a, reason: collision with root package name */
            private final Handler f1745a = new Handler(Looper.getMainLooper());

            ExecutorC0033a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f1745a.post(runnable);
            }
        }

        a() {
            super(true);
        }

        @Override // De.w
        public Executor b() {
            return new ExecutorC0033a();
        }

        @Override // De.w
        Object g(Method method, Class cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    w(boolean z10) {
        this.f1743a = z10;
        Constructor constructor = null;
        if (z10) {
            try {
                constructor = q.a().getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f1744b = constructor;
    }

    private static w e() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new w(true);
    }

    static w f() {
        return f1742c;
    }

    List a(Executor executor) {
        g gVar = new g(executor);
        return this.f1743a ? Arrays.asList(C0821e.f1634a, gVar) : Collections.singletonList(gVar);
    }

    Executor b() {
        return null;
    }

    List c() {
        return this.f1743a ? Collections.singletonList(o.f1695a) : Collections.emptyList();
    }

    int d() {
        return this.f1743a ? 1 : 0;
    }

    Object g(Method method, Class cls, Object obj, Object... objArr) {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor constructor = this.f1744b;
        unreflectSpecial = (constructor != null ? r.a(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    boolean h(Method method) {
        return this.f1743a && method.isDefault();
    }
}
