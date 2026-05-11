package Pc;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Pc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1121c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1121c f7734a = new C1121c();

    /* renamed from: b, reason: collision with root package name */
    private static a f7735b;

    /* renamed from: Pc.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f7736a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f7737b;

        public a(Method method, Method method2) {
            this.f7736a = method;
            this.f7737b = method2;
        }

        public final Method a() {
            return this.f7737b;
        }

        public final Method b() {
            return this.f7736a;
        }
    }

    private C1121c() {
    }

    public final a a(Member member) {
        Intrinsics.checkNotNullParameter(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", null), d.f(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List b(Member member) {
        Method a10;
        Intrinsics.checkNotNullParameter(member, "member");
        a aVar = f7735b;
        if (aVar == null) {
            synchronized (this) {
                aVar = f7735b;
                if (aVar == null) {
                    aVar = f7734a.a(member);
                    f7735b = aVar;
                }
            }
        }
        Method b10 = aVar.b();
        if (b10 == null || (a10 = aVar.a()) == null) {
            return null;
        }
        Object invoke = b10.invoke(member, null);
        Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object invoke2 = a10.invoke(obj, null);
            Intrinsics.e(invoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke2);
        }
        return arrayList;
    }
}
