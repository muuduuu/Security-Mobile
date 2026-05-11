package Fc;

import Fc.e;
import Fc.f;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class h implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Method f2692a;

    /* renamed from: b, reason: collision with root package name */
    private final List f2693b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f2694c;

    public static final class a extends h implements d {

        /* renamed from: d, reason: collision with root package name */
        private final Object f2695d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method unboxMethod, Object obj) {
            super(unboxMethod, CollectionsKt.j(), null);
            Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
            this.f2695d = obj;
        }

        @Override // Fc.e
        public Object h(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            c(args);
            return b(this.f2695d, args);
        }
    }

    public static final class b extends h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method unboxMethod) {
            super(unboxMethod, CollectionsKt.e(unboxMethod.getDeclaringClass()), null);
            Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
        }

        @Override // Fc.e
        public Object h(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            c(args);
            Object obj = args[0];
            f.d dVar = f.f2678e;
            return b(obj, args.length <= 1 ? new Object[0] : AbstractC3574i.m(args, 1, args.length));
        }
    }

    public /* synthetic */ h(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    protected final Object b(Object obj, Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.f2692a.invoke(obj, Arrays.copyOf(args, args.length));
    }

    public void c(Object[] objArr) {
        e.a.a(this, objArr);
    }

    @Override // Fc.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Method a() {
        return null;
    }

    @Override // Fc.e
    public final Type g() {
        return this.f2694c;
    }

    @Override // Fc.e
    public final List i() {
        return this.f2693b;
    }

    private h(Method method, List list) {
        this.f2692a = method;
        this.f2693b = list;
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        this.f2694c = returnType;
    }
}
