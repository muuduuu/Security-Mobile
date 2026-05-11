package Ec;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ec.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0824c {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC0822a f1958a = AbstractC0823b.a(d.f1966a);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC0822a f1959b = AbstractC0823b.a(e.f1967a);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC0822a f1960c = AbstractC0823b.a(a.f1963a);

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC0822a f1961d = AbstractC0823b.a(C0042c.f1965a);

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC0822a f1962e = AbstractC0823b.a(b.f1964a);

    /* renamed from: Ec.c$a */
    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1963a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke(Class it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Cc.e.b(AbstractC0824c.c(it), CollectionsKt.j(), false, CollectionsKt.j());
        }
    }

    /* renamed from: Ec.c$b */
    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1964a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap invoke(Class it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: Ec.c$c, reason: collision with other inner class name */
    static final class C0042c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0042c f1965a = new C0042c();

        C0042c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke(Class it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Cc.e.b(AbstractC0824c.c(it), CollectionsKt.j(), true, CollectionsKt.j());
        }
    }

    /* renamed from: Ec.c$d */
    static final class d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f1966a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0832k invoke(Class it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0832k(it);
        }
    }

    /* renamed from: Ec.c$e */
    static final class e extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f1967a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(Class it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new t(it);
        }
    }

    public static final kotlin.reflect.o a(Class jClass, List arguments, boolean z10) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return arguments.isEmpty() ? z10 ? (kotlin.reflect.o) f1961d.a(jClass) : (kotlin.reflect.o) f1960c.a(jClass) : b(jClass, arguments, z10);
    }

    private static final kotlin.reflect.o b(Class cls, List list, boolean z10) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f1962e.a(cls);
        Pair a10 = lc.t.a(list, Boolean.valueOf(z10));
        Object obj = concurrentHashMap.get(a10);
        if (obj == null) {
            kotlin.reflect.o b10 = Cc.e.b(c(cls), list, z10, CollectionsKt.j());
            Object putIfAbsent = concurrentHashMap.putIfAbsent(a10, b10);
            obj = putIfAbsent == null ? b10 : putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return (kotlin.reflect.o) obj;
    }

    public static final C0832k c(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Object a10 = f1958a.a(jClass);
        Intrinsics.e(a10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (C0832k) a10;
    }

    public static final kotlin.reflect.f d(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return (kotlin.reflect.f) f1959b.a(jClass);
    }
}
