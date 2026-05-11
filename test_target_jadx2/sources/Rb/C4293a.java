package rb;

import Jd.AbstractC0891k;
import Jd.C0899o;
import Jd.C0902p0;
import Jd.InterfaceC0895m;
import Jd.N;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import lc.p;
import pc.AbstractC3868b;
import qb.InterfaceC3956a;
import zb.InterfaceC5271b;

/* renamed from: rb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4293a implements InterfaceC4294b, InterfaceC3956a {

    /* renamed from: a, reason: collision with root package name */
    private final i f40546a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f40547b;

    /* renamed from: c, reason: collision with root package name */
    private final qb.d f40548c;

    /* renamed from: rb.a$a, reason: collision with other inner class name */
    static final class C0604a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f40549a;

        /* renamed from: b, reason: collision with root package name */
        Object f40550b;

        /* renamed from: c, reason: collision with root package name */
        int f40551c;

        /* renamed from: rb.a$a$a, reason: collision with other inner class name */
        public static final class C0605a implements qb.e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0895m f40553a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3956a f40554b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4293a f40555c;

            public C0605a(InterfaceC0895m interfaceC0895m, InterfaceC3956a interfaceC3956a, C4293a c4293a) {
                this.f40553a = interfaceC0895m;
                this.f40554b = interfaceC3956a;
                this.f40555c = c4293a;
            }

            @Override // qb.e
            public void a(androidx.appcompat.app.d activity) {
                Object b10;
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (this.f40553a.b()) {
                    this.f40554b.b(this);
                    InterfaceC0895m interfaceC0895m = this.f40553a;
                    try {
                        o.a aVar = o.f37128b;
                        this.f40555c.f40546a.p(activity);
                        b10 = o.b(Unit.f36324a);
                    } catch (Throwable th) {
                        o.a aVar2 = o.f37128b;
                        b10 = o.b(p.a(th));
                    }
                    interfaceC0895m.resumeWith(b10);
                }
            }
        }

        /* renamed from: rb.a$a$b */
        static final class b extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3956a f40556a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0605a f40557b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC3956a interfaceC3956a, C0605a c0605a) {
                super(1);
                this.f40556a = interfaceC3956a;
                this.f40557b = c0605a;
            }

            public final void a(Throwable th) {
                this.f40556a.b(this.f40557b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.f36324a;
            }
        }

        C0604a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return C4293a.this.new C0604a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((C0604a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f40551c;
            if (i10 == 0) {
                p.b(obj);
                C4293a c4293a = C4293a.this;
                this.f40549a = c4293a;
                this.f40550b = c4293a;
                this.f40551c = 1;
                C0899o c0899o = new C0899o(AbstractC3868b.c(this), 1);
                c0899o.F();
                C0605a c0605a = new C0605a(c0899o, c4293a, c4293a);
                c4293a.c(c0605a);
                c0899o.s(new b(c4293a, c0605a));
                Object y10 = c0899o.y();
                if (y10 == AbstractC3868b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (y10 == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    /* renamed from: rb.a$b */
    public static final class b implements qb.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0895m f40558a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3956a f40559b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4293a f40560c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC4295c f40561d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC4296d f40562e;

        public b(InterfaceC0895m interfaceC0895m, InterfaceC3956a interfaceC3956a, C4293a c4293a, InterfaceC4295c interfaceC4295c, InterfaceC4296d interfaceC4296d) {
            this.f40558a = interfaceC0895m;
            this.f40559b = interfaceC3956a;
            this.f40560c = c4293a;
            this.f40561d = interfaceC4295c;
            this.f40562e = interfaceC4296d;
        }

        @Override // qb.e
        public void a(androidx.appcompat.app.d activity) {
            Object b10;
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (this.f40558a.b()) {
                this.f40559b.b(this);
                InterfaceC0895m interfaceC0895m = this.f40558a;
                try {
                    o.a aVar = o.f37128b;
                    b10 = o.b(this.f40560c.f40546a.n("AppContext_rq#" + this.f40560c.f40547b.getAndIncrement(), activity, this.f40561d, this.f40562e));
                } catch (Throwable th) {
                    o.a aVar2 = o.f37128b;
                    b10 = o.b(p.a(th));
                }
                interfaceC0895m.resumeWith(b10);
            }
        }
    }

    /* renamed from: rb.a$c */
    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3956a f40563a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f40564b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC3956a interfaceC3956a, b bVar) {
            super(1);
            this.f40563a = interfaceC3956a;
            this.f40564b = bVar;
        }

        public final void a(Throwable th) {
            this.f40563a.b(this.f40564b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f36324a;
        }
    }

    public C4293a(InterfaceC5271b currentActivityProvider) {
        Intrinsics.checkNotNullParameter(currentActivityProvider, "currentActivityProvider");
        this.f40546a = new i(currentActivityProvider);
        this.f40547b = new AtomicInteger();
        this.f40548c = new qb.d();
        AbstractC0891k.d(C0902p0.f5058a, null, null, new C0604a(null), 3, null);
    }

    @Override // rb.InterfaceC4294b
    public Object a(InterfaceC4295c interfaceC4295c, InterfaceC4296d interfaceC4296d, kotlin.coroutines.d dVar) {
        C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
        c0899o.F();
        b bVar = new b(c0899o, this, this, interfaceC4295c, interfaceC4296d);
        c(bVar);
        c0899o.s(new c(this, bVar));
        Object y10 = c0899o.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10;
    }

    @Override // qb.InterfaceC3956a
    public void b(qb.e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f40548c.b(listener);
    }

    @Override // qb.InterfaceC3956a
    public void c(qb.e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f40548c.c(listener);
    }

    public final void f(int i10, int i11, Intent intent) {
        this.f40546a.g(i10, i11, intent);
    }

    public final void g(androidx.appcompat.app.d activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f40546a.m(activity);
    }

    public final void h(androidx.appcompat.app.d activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f40548c.f(activity);
    }
}
