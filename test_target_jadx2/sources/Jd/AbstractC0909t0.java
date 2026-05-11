package Jd;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import pc.AbstractC3868b;

/* renamed from: Jd.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0909t0 {

    /* renamed from: Jd.t0$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f5063a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f5064b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f5065c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f5065c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f5065c, dVar);
            aVar.f5064b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f5063a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            return AbstractC0909t0.d(((N) this.f5064b).y(), this.f5065c);
        }
    }

    public static final Object b(CoroutineContext coroutineContext, Function0 function0, kotlin.coroutines.d dVar) {
        return AbstractC0887i.g(coroutineContext, new a(function0, null), dVar);
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Function0 function0, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f36372a;
        }
        return b(coroutineContext, function0, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(CoroutineContext coroutineContext, Function0 function0) {
        try {
            R0 r02 = new R0();
            r02.C(z0.g(coroutineContext));
            try {
                return function0.invoke();
            } finally {
                r02.z();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
