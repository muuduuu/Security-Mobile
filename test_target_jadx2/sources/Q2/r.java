package Q2;

import androidx.lifecycle.AbstractC1604v;
import androidx.lifecycle.C1605w;
import androidx.lifecycle.InterfaceC1608z;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m.C3632c;
import xc.C5141B;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8121a = new Object();

    static final class a extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8122a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair invoke(Object obj, Object obj2) {
            return lc.t.a(obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8123a = new b();

        b() {
            super(2);
        }

        public final boolean a(Object obj, Object obj2) {
            return Intrinsics.b(obj, obj2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(a(obj, obj2));
        }
    }

    public static final AbstractC1604v e(AbstractC1604v abstractC1604v, AbstractC1604v other) {
        Intrinsics.checkNotNullParameter(abstractC1604v, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return f(abstractC1604v, other, a.f8122a);
    }

    public static final AbstractC1604v f(AbstractC1604v abstractC1604v, AbstractC1604v other, final Function2 func) {
        Intrinsics.checkNotNullParameter(abstractC1604v, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(func, "func");
        final C1605w c1605w = new C1605w();
        final C5141B c5141b = new C5141B();
        final C5141B c5141b2 = new C5141B();
        c1605w.p(abstractC1604v, new InterfaceC1608z() { // from class: Q2.n
            @Override // androidx.lifecycle.InterfaceC1608z
            public final void b(Object obj) {
                r.g(C5141B.this, c5141b2, c1605w, func, obj);
            }
        });
        c1605w.p(other, new InterfaceC1608z() { // from class: Q2.o
            @Override // androidx.lifecycle.InterfaceC1608z
            public final void b(Object obj) {
                r.h(C5141B.this, c5141b, c1605w, func, obj);
            }
        });
        return c1605w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C5141B lastA, C5141B lastB, C1605w this_apply, Function2 func, Object obj) {
        Intrinsics.checkNotNullParameter(lastA, "$lastA");
        Intrinsics.checkNotNullParameter(lastB, "$lastB");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(func, "$func");
        lastA.f44962a = obj;
        Object obj2 = lastB.f44962a;
        if (obj == null && this_apply.f() != null) {
            this_apply.o(null);
        } else {
            if (obj == null || obj2 == null) {
                return;
            }
            this_apply.o(func.invoke(obj, obj2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C5141B lastB, C5141B lastA, C1605w this_apply, Function2 func, Object obj) {
        Intrinsics.checkNotNullParameter(lastB, "$lastB");
        Intrinsics.checkNotNullParameter(lastA, "$lastA");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(func, "$func");
        lastB.f44962a = obj;
        Object obj2 = lastA.f44962a;
        if (obj == null && this_apply.f() != null) {
            this_apply.o(null);
        } else {
            if (obj2 == null || obj == null) {
                return;
            }
            this_apply.o(func.invoke(obj2, obj));
        }
    }

    public static final AbstractC1604v i(AbstractC1604v abstractC1604v, final Executor executor, final Function2 areEqual) {
        Intrinsics.checkNotNullParameter(abstractC1604v, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(areEqual, "areEqual");
        final C1605w c1605w = new C1605w();
        final C5141B c5141b = new C5141B();
        c5141b.f44962a = f8121a;
        c1605w.p(abstractC1604v, new InterfaceC1608z() { // from class: Q2.p
            @Override // androidx.lifecycle.InterfaceC1608z
            public final void b(Object obj) {
                r.k(executor, c5141b, areEqual, c1605w, obj);
            }
        });
        return c1605w;
    }

    public static /* synthetic */ AbstractC1604v j(AbstractC1604v abstractC1604v, Executor executor, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            executor = m();
        }
        if ((i10 & 2) != 0) {
            function2 = b.f8123a;
        }
        return i(abstractC1604v, executor, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Executor executor, final C5141B old, final Function2 areEqual, final C1605w distinctMediator, final Object obj) {
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(old, "$old");
        Intrinsics.checkNotNullParameter(areEqual, "$areEqual");
        Intrinsics.checkNotNullParameter(distinctMediator, "$distinctMediator");
        executor.execute(new Runnable() { // from class: Q2.q
            @Override // java.lang.Runnable
            public final void run() {
                r.l(C5141B.this, areEqual, obj, distinctMediator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(C5141B old, Function2 areEqual, Object obj, C1605w distinctMediator) {
        Intrinsics.checkNotNullParameter(old, "$old");
        Intrinsics.checkNotNullParameter(areEqual, "$areEqual");
        Intrinsics.checkNotNullParameter(distinctMediator, "$distinctMediator");
        Object obj2 = old.f44962a;
        if (obj2 == f8121a || !((Boolean) areEqual.invoke(obj2, obj)).booleanValue()) {
            old.f44962a = obj;
            distinctMediator.m(obj);
        }
    }

    private static final Executor m() {
        Executor g10 = C3632c.g();
        Intrinsics.checkNotNullExpressionValue(g10, "getIOThreadExecutor()");
        return g10;
    }
}
