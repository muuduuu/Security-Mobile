package Dd;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f1593a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f1594b = new AtomicInteger(0);

    static final class a extends xc.m implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(s.this.f1594b.getAndIncrement());
        }
    }

    public abstract int b(ConcurrentHashMap concurrentHashMap, String str, Function1 function1);

    public final n c(kotlin.reflect.d kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        return new n(e(kClass));
    }

    public final int d(String keyQualifiedName) {
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        return b(this.f1593a, keyQualifiedName, new a());
    }

    public final int e(kotlin.reflect.d kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String e10 = kClass.e();
        Intrinsics.d(e10);
        return d(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Collection f() {
        Collection values = this.f1593a.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        return values;
    }
}
