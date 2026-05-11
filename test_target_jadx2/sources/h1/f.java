package h1;

import Jd.AbstractC0887i;
import Jd.AbstractC0891k;
import Jd.C0899o;
import Jd.C0902p0;
import Jd.InterfaceC0895m;
import Jd.InterfaceC0915w0;
import Jd.J;
import Jd.N;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.o;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33848a = new a(null);

    public static final class a {

        /* renamed from: h1.f$a$a, reason: collision with other inner class name */
        static final class C0502a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f33849a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable f33850b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0502a(Callable callable, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f33850b = callable;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return new C0502a(this.f33850b, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((C0502a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC3868b.e();
                if (this.f33849a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
                return this.f33850b.call();
            }
        }

        static final class b extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellationSignal f33851a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC0915w0 f33852b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CancellationSignal cancellationSignal, InterfaceC0915w0 interfaceC0915w0) {
                super(1);
                this.f33851a = cancellationSignal;
                this.f33852b = interfaceC0915w0;
            }

            public final void a(Throwable th) {
                CancellationSignal cancellationSignal = this.f33851a;
                if (cancellationSignal != null) {
                    l1.b.a(cancellationSignal);
                }
                InterfaceC0915w0.a.a(this.f33852b, null, 1, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.f36324a;
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f33853a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable f33854b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC0895m f33855c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Callable callable, InterfaceC0895m interfaceC0895m, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f33854b = callable;
                this.f33855c = interfaceC0895m;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return new c(this.f33854b, this.f33855c, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC3868b.e();
                if (this.f33853a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
                try {
                    this.f33855c.resumeWith(lc.o.b(this.f33854b.call()));
                } catch (Throwable th) {
                    InterfaceC0895m interfaceC0895m = this.f33855c;
                    o.a aVar = lc.o.f37128b;
                    interfaceC0895m.resumeWith(lc.o.b(lc.p.a(th)));
                }
                return Unit.f36324a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(s sVar, boolean z10, CancellationSignal cancellationSignal, Callable callable, kotlin.coroutines.d dVar) {
            InterfaceC0915w0 d10;
            if (sVar.y() && sVar.s()) {
                return callable.call();
            }
            android.support.v4.media.session.b.a(dVar.getContext().a(B.f33798a));
            J b10 = z10 ? g.b(sVar) : g.a(sVar);
            C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
            c0899o.F();
            d10 = AbstractC0891k.d(C0902p0.f5058a, b10, null, new c(callable, c0899o, null), 2, null);
            c0899o.s(new b(cancellationSignal, d10));
            Object y10 = c0899o.y();
            if (y10 == AbstractC3868b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y10;
        }

        public final Object b(s sVar, boolean z10, Callable callable, kotlin.coroutines.d dVar) {
            if (sVar.y() && sVar.s()) {
                return callable.call();
            }
            android.support.v4.media.session.b.a(dVar.getContext().a(B.f33798a));
            return AbstractC0887i.g(z10 ? g.b(sVar) : g.a(sVar), new C0502a(callable, null), dVar);
        }

        private a() {
        }
    }

    public static final Object a(s sVar, boolean z10, CancellationSignal cancellationSignal, Callable callable, kotlin.coroutines.d dVar) {
        return f33848a.a(sVar, z10, cancellationSignal, callable, dVar);
    }

    public static final Object b(s sVar, boolean z10, Callable callable, kotlin.coroutines.d dVar) {
        return f33848a.b(sVar, z10, callable, dVar);
    }
}
