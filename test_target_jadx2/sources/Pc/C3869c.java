package pc;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pc.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3869c {

    /* renamed from: pc.c$a */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        private int f38591a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f38592b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f38593c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, Function2 function2, Object obj) {
            super(dVar);
            this.f38592b = function2;
            this.f38593c = obj;
            Intrinsics.e(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f38591a;
            if (i10 == 0) {
                this.f38591a = 1;
                p.b(obj);
                Intrinsics.e(this.f38592b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((Function2) kotlin.jvm.internal.a.f(this.f38592b, 2)).invoke(this.f38593c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f38591a = 2;
            p.b(obj);
            return obj;
        }
    }

    /* renamed from: pc.c$b */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        private int f38594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f38595b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f38596c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.coroutines.d dVar, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(dVar, coroutineContext);
            this.f38595b = function2;
            this.f38596c = obj;
            Intrinsics.e(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f38594a;
            if (i10 == 0) {
                this.f38594a = 1;
                p.b(obj);
                Intrinsics.e(this.f38595b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((Function2) kotlin.jvm.internal.a.f(this.f38595b, 2)).invoke(this.f38596c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f38594a = 2;
            p.b(obj);
            return obj;
        }
    }

    /* renamed from: pc.c$c, reason: collision with other inner class name */
    public static final class C0596c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0596c(kotlin.coroutines.d dVar) {
            super(dVar);
            Intrinsics.e(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            p.b(obj);
            return obj;
        }
    }

    /* renamed from: pc.c$d */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.coroutines.d dVar, CoroutineContext coroutineContext) {
            super(dVar, coroutineContext);
            Intrinsics.e(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            p.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kotlin.coroutines.d a(Function2 function2, Object obj, kotlin.coroutines.d completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        kotlin.coroutines.d<?> a10 = h.a(completion);
        if (function2 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function2).create(obj, a10);
        }
        CoroutineContext context = a10.getContext();
        return context == g.f36372a ? new a(a10, function2, obj) : new b(a10, context, function2, obj);
    }

    private static final kotlin.coroutines.d b(kotlin.coroutines.d dVar) {
        CoroutineContext context = dVar.getContext();
        return context == g.f36372a ? new C0596c(dVar) : new d(dVar, context);
    }

    public static kotlin.coroutines.d c(kotlin.coroutines.d dVar) {
        kotlin.coroutines.d<Object> intercepted;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar2 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }

    public static Object d(Function2 function2, Object obj, kotlin.coroutines.d completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function2) kotlin.jvm.internal.a.f(function2, 2)).invoke(obj, b(h.a(completion)));
    }
}
