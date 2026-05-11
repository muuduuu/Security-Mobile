package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f36377a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final a f36378b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    private static a f36379c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f36380a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f36381b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f36382c;

        public a(Method method, Method method2, Method method3) {
            this.f36380a = method;
            this.f36381b = method2;
            this.f36382c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f36379c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f36378b;
            f36379c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        a aVar = f36379c;
        if (aVar == null) {
            aVar = a(continuation);
        }
        if (aVar == f36378b) {
            return null;
        }
        Method method = aVar.f36380a;
        Object invoke = method != null ? method.invoke(continuation.getClass(), null) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f36381b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f36382c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
