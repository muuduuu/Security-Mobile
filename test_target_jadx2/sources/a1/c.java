package A1;

import Ld.s;
import Ld.u;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import pc.AbstractC3868b;
import xc.m;
import z1.AbstractC5238b;
import z1.InterfaceC5237a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final B1.h f293a;

    static final class a extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f294a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f295b;

        /* renamed from: A1.c$a$a, reason: collision with other inner class name */
        static final class C0001a extends m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f297a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f298b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0001a(c cVar, b bVar) {
                super(0);
                this.f297a = cVar;
                this.f298b = bVar;
            }

            public final void a() {
                this.f297a.f293a.f(this.f298b);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f36324a;
            }
        }

        public static final class b implements InterfaceC5237a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f299a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f300b;

            b(c cVar, u uVar) {
                this.f299a = cVar;
                this.f300b = uVar;
            }

            @Override // z1.InterfaceC5237a
            public void a(Object obj) {
                this.f300b.r().B(this.f299a.e(obj) ? new AbstractC5238b.C0670b(this.f299a.b()) : AbstractC5238b.a.f45658a);
            }
        }

        a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = c.this.new a(dVar);
            aVar.f295b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, kotlin.coroutines.d dVar) {
            return ((a) create(uVar, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f294a;
            if (i10 == 0) {
                p.b(obj);
                u uVar = (u) this.f295b;
                b bVar = new b(c.this, uVar);
                c.this.f293a.c(bVar);
                C0001a c0001a = new C0001a(c.this, bVar);
                this.f294a = 1;
                if (s.a(uVar, c0001a, this) == e10) {
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

    public c(B1.h tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f293a = tracker;
    }

    public abstract int b();

    public abstract boolean c(C1.u uVar);

    public final boolean d(C1.u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return c(workSpec) && e(this.f293a.e());
    }

    public abstract boolean e(Object obj);

    public final Md.e f() {
        return Md.g.c(new a(null));
    }
}
