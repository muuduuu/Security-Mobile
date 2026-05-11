package I0;

import Jd.AbstractC0891k;
import Jd.InterfaceC0915w0;
import Jd.N;
import Ld.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private final N f3992a;

    /* renamed from: b, reason: collision with root package name */
    private final Function2 f3993b;

    /* renamed from: c, reason: collision with root package name */
    private final Ld.g f3994c;

    /* renamed from: d, reason: collision with root package name */
    private final C0836b f3995d;

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f3996a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f3997b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f3998c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, B b10, Function2 function2) {
            super(1);
            this.f3996a = function1;
            this.f3997b = b10;
            this.f3998c = function2;
        }

        public final void a(Throwable th) {
            Unit unit;
            this.f3996a.invoke(th);
            this.f3997b.f3994c.v(th);
            do {
                Object f10 = Ld.k.f(this.f3997b.f3994c.e());
                if (f10 != null) {
                    this.f3998c.invoke(f10, th);
                    unit = Unit.f36324a;
                } else {
                    unit = null;
                }
            } while (unit != null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f36324a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f3999a;

        /* renamed from: b, reason: collision with root package name */
        int f4000b;

        b(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return B.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pc.AbstractC3868b.e()
                int r1 = r5.f4000b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                lc.p.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f3999a
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                lc.p.b(r6)
                goto L51
            L22:
                lc.p.b(r6)
                I0.B r6 = I0.B.this
                I0.b r6 = I0.B.c(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                I0.B r6 = I0.B.this
                Jd.N r6 = I0.B.d(r6)
                Jd.O.e(r6)
                I0.B r6 = I0.B.this
                kotlin.jvm.functions.Function2 r1 = I0.B.a(r6)
                I0.B r6 = I0.B.this
                Ld.g r6 = I0.B.b(r6)
                r5.f3999a = r1
                r5.f4000b = r3
                java.lang.Object r6 = r6.m(r5)
                if (r6 != r0) goto L51
                return r0
            L51:
                r4 = 0
                r5.f3999a = r4
                r5.f4000b = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
                return r0
            L5d:
                I0.B r6 = I0.B.this
                I0.b r6 = I0.B.c(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                kotlin.Unit r6 = kotlin.Unit.f36324a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.B.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public B(N scope, Function1 onComplete, Function2 onUndeliveredElement, Function2 consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f3992a = scope;
        this.f3993b = consumeMessage;
        this.f3994c = Ld.j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f3995d = new C0836b(0);
        InterfaceC0915w0 interfaceC0915w0 = (InterfaceC0915w0) scope.y().a(InterfaceC0915w0.f5070O);
        if (interfaceC0915w0 != null) {
            interfaceC0915w0.z(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(Object obj) {
        Object B10 = this.f3994c.B(obj);
        if (B10 instanceof k.a) {
            Throwable e10 = Ld.k.e(B10);
            if (e10 != null) {
                throw e10;
            }
            throw new Ld.q("Channel was closed normally");
        }
        if (!Ld.k.i(B10)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f3995d.c() == 0) {
            AbstractC0891k.d(this.f3992a, null, null, new b(null), 3, null);
        }
    }
}
