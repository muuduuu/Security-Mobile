package D9;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v9.C4977f;
import xc.m;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1398a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static volatile C4977f f1399b = new C4977f(null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 511, null);

    /* renamed from: c, reason: collision with root package name */
    private static volatile Function1 f1400c;

    /* renamed from: D9.a$a, reason: collision with other inner class name */
    static final class C0026a extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f1401a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f1402b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0026a(Function2 function2, double d10) {
            super(1);
            this.f1401a = function2;
            this.f1402b = d10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4977f invoke(C4977f updateTrace) {
            Intrinsics.checkNotNullParameter(updateTrace, "$this$updateTrace");
            return (C4977f) this.f1401a.invoke(updateTrace, Double.valueOf(this.f1402b));
        }
    }

    private a() {
    }

    private final boolean a() {
        C4977f c4977f = f1399b;
        return !(CollectionsKt.s0(CollectionsKt.m(Double.valueOf(c4977f.f()), Double.valueOf(c4977f.d()), Double.valueOf(c4977f.c()))) == -1.0d);
    }

    private final void b() {
        Function1 function1;
        if (f1400c == null || !a() || (function1 = f1400c) == null) {
            return;
        }
        function1.invoke(f1399b);
    }

    public final Object c(Function0 block, Function2 updateTraceFn) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(updateTraceFn, "updateTraceFn");
        long nanoTime = System.nanoTime();
        Object invoke = block.invoke();
        d(new C0026a(updateTraceFn, (System.nanoTime() - nanoTime) / 1000000.0d));
        return invoke;
    }

    public final void d(Function1 updateFn) {
        Intrinsics.checkNotNullParameter(updateFn, "updateFn");
        f1399b = (C4977f) updateFn.invoke(f1399b);
        b();
    }
}
