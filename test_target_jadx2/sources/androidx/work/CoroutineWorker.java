package androidx.work;

import Jd.A0;
import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.InterfaceC0915w0;
import Jd.InterfaceC0919z;
import Jd.J;
import Jd.N;
import Jd.O;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import x1.m;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010&\u001a\u00020 8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010\u0013\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lh8/d;", "Landroidx/work/c$a;", "o", "()Lh8/d;", "s", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lx1/h;", "u", "c", BuildConfig.FLAVOR, "m", "()V", "LJd/z;", "e", "LJd/z;", "getJob$work_runtime_release", "()LJd/z;", "job", "Landroidx/work/impl/utils/futures/c;", "f", "Landroidx/work/impl/utils/futures/c;", "w", "()Landroidx/work/impl/utils/futures/c;", "future", "LJd/J;", "g", "LJd/J;", "t", "()LJd/J;", "getCoroutineContext$annotations", "coroutineContext", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends c {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC0919z job;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.impl.utils.futures.c future;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final J coroutineContext;

    static final class a extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f18087a;

        /* renamed from: b, reason: collision with root package name */
        int f18088b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f18089c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f18090d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, CoroutineWorker coroutineWorker, d dVar) {
            super(2, dVar);
            this.f18089c = mVar;
            this.f18090d = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new a(this.f18089c, this.f18090d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            m mVar;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f18088b;
            if (i10 == 0) {
                p.b(obj);
                m mVar2 = this.f18089c;
                CoroutineWorker coroutineWorker = this.f18090d;
                this.f18087a = mVar2;
                this.f18088b = 1;
                Object u10 = coroutineWorker.u(this);
                if (u10 == e10) {
                    return e10;
                }
                mVar = mVar2;
                obj = u10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = (m) this.f18087a;
                p.b(obj);
            }
            mVar.b(obj);
            return Unit.f36324a;
        }
    }

    static final class b extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f18091a;

        b(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return CoroutineWorker.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, d dVar) {
            return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f18091a;
            try {
                if (i10 == 0) {
                    p.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f18091a = 1;
                    obj = coroutineWorker.s(this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                CoroutineWorker.this.getFuture().p((c.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture().q(th);
            }
            return Unit.f36324a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        InterfaceC0919z b10;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        b10 = A0.b(null, 1, null);
        this.job = b10;
        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        Intrinsics.checkNotNullExpressionValue(t10, "create()");
        this.future = t10;
        t10.e(new Runnable() { // from class: x1.e
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker.r(CoroutineWorker.this);
            }
        }, i().c());
        this.coroutineContext = C0874b0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(CoroutineWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.future.isCancelled()) {
            InterfaceC0915w0.a.a(this$0.job, null, 1, null);
        }
    }

    static /* synthetic */ Object v(CoroutineWorker coroutineWorker, d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    @Override // androidx.work.c
    public final h8.d c() {
        InterfaceC0919z b10;
        b10 = A0.b(null, 1, null);
        N a10 = O.a(getCoroutineContext().l(b10));
        m mVar = new m(b10, null, 2, null);
        AbstractC0891k.d(a10, null, null, new a(mVar, this, null), 3, null);
        return mVar;
    }

    @Override // androidx.work.c
    public final void m() {
        super.m();
        this.future.cancel(false);
    }

    @Override // androidx.work.c
    public final h8.d o() {
        AbstractC0891k.d(O.a(getCoroutineContext().l(this.job)), null, null, new b(null), 3, null);
        return this.future;
    }

    public abstract Object s(d dVar);

    /* renamed from: t, reason: from getter */
    public J getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object u(d dVar) {
        return v(this, dVar);
    }

    /* renamed from: w, reason: from getter */
    public final androidx.work.impl.utils.futures.c getFuture() {
        return this.future;
    }
}
