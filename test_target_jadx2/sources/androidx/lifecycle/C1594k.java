package androidx.lifecycle;

import Jd.A0;
import Jd.AbstractC0891k;
import Jd.C0874b0;
import androidx.lifecycle.AbstractC1592i;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;

/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1594k extends AbstractC1593j implements InterfaceC1596m {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1592i f17131a;

    /* renamed from: b, reason: collision with root package name */
    private final CoroutineContext f17132b;

    /* renamed from: androidx.lifecycle.k$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f17133a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17134b;

        a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = C1594k.this.new a(dVar);
            aVar.f17134b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Jd.N n10, kotlin.coroutines.d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f17133a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            Jd.N n10 = (Jd.N) this.f17134b;
            if (C1594k.this.a().b().compareTo(AbstractC1592i.b.INITIALIZED) >= 0) {
                C1594k.this.a().a(C1594k.this);
            } else {
                A0.d(n10.y(), null, 1, null);
            }
            return Unit.f36324a;
        }
    }

    public C1594k(AbstractC1592i lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f17131a = lifecycle;
        this.f17132b = coroutineContext;
        if (a().b() == AbstractC1592i.b.DESTROYED) {
            A0.d(y(), null, 1, null);
        }
    }

    public AbstractC1592i a() {
        return this.f17131a;
    }

    public final void b() {
        AbstractC0891k.d(this, C0874b0.c().y0(), null, new a(null), 2, null);
    }

    @Override // androidx.lifecycle.InterfaceC1596m
    public void d(InterfaceC1599p source, AbstractC1592i.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (a().b().compareTo(AbstractC1592i.b.DESTROYED) <= 0) {
            a().d(this);
            A0.d(y(), null, 1, null);
        }
    }

    @Override // Jd.N
    public CoroutineContext y() {
        return this.f17132b;
    }
}
