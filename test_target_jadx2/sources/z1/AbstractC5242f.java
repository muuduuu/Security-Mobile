package z1;

import C1.u;
import Jd.A0;
import Jd.AbstractC0891k;
import Jd.InterfaceC0915w0;
import Jd.InterfaceC0919z;
import Jd.J;
import Jd.N;
import Jd.O;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import pc.AbstractC3868b;
import x1.n;

/* renamed from: z1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5242f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f45671a;

    /* renamed from: z1.f$a */
    static final class a extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f45672a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5241e f45673b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f45674c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5240d f45675d;

        /* renamed from: z1.f$a$a, reason: collision with other inner class name */
        static final class C0672a implements Md.f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5240d f45676a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f45677b;

            C0672a(InterfaceC5240d interfaceC5240d, u uVar) {
                this.f45676a = interfaceC5240d;
                this.f45677b = uVar;
            }

            @Override // Md.f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object f(AbstractC5238b abstractC5238b, kotlin.coroutines.d dVar) {
                this.f45676a.d(this.f45677b, abstractC5238b);
                return Unit.f36324a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5241e c5241e, u uVar, InterfaceC5240d interfaceC5240d, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f45673b = c5241e;
            this.f45674c = uVar;
            this.f45675d = interfaceC5240d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new a(this.f45673b, this.f45674c, this.f45675d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f45672a;
            if (i10 == 0) {
                p.b(obj);
                Md.e b10 = this.f45673b.b(this.f45674c);
                C0672a c0672a = new C0672a(this.f45675d, this.f45674c);
                this.f45672a = 1;
                if (b10.b(c0672a, this) == e10) {
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

    static {
        String i10 = n.i("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f45671a = i10;
    }

    public static final InterfaceC0915w0 b(C5241e c5241e, u spec, J dispatcher, InterfaceC5240d listener) {
        InterfaceC0919z b10;
        Intrinsics.checkNotNullParameter(c5241e, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b10 = A0.b(null, 1, null);
        AbstractC0891k.d(O.a(dispatcher.l(b10)), null, null, new a(c5241e, spec, listener, null), 3, null);
        return b10;
    }
}
