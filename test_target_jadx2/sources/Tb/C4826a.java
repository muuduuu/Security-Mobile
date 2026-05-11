package tb;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Db.T;
import Db.U;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedRef;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.g;
import kotlin.reflect.o;
import lc.t;
import pb.C3863b;
import wb.AbstractC5052a;
import wb.q;
import xc.C5142C;
import xc.j;
import xc.m;
import yb.AbstractC5184b;
import yb.C5185c;

/* renamed from: tb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4826a extends AbstractC5184b {

    /* renamed from: i, reason: collision with root package name */
    private final String f43351i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlin.reflect.d f43352j;

    /* renamed from: k, reason: collision with root package name */
    private final C0792a f43353k;

    /* renamed from: l, reason: collision with root package name */
    private q f43354l;

    /* renamed from: tb.a$a, reason: collision with other inner class name */
    /* synthetic */ class C0619a extends j implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public static final C0619a f43355j = new C0619a();

        C0619a() {
            super(2, SharedObject.class, "onStartListeningToEvent", "onStartListeningToEvent(Ljava/lang/String;)V", 0);
        }

        public final void I(SharedObject p02, String p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            p02.n(p12);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            I((SharedObject) obj, (String) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: tb.a$b */
    /* synthetic */ class b extends j implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public static final b f43356j = new b();

        b() {
            super(2, SharedObject.class, "onStopListeningToEvent", "onStopListeningToEvent(Ljava/lang/String;)V", 0);
        }

        public final void I(SharedObject p02, String p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            p02.o(p12);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            I((SharedObject) obj, (String) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: tb.a$c */
    static final class c extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f43357a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(1);
            this.f43357a = gVar;
        }

        public final void a(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((Function2) this.f43357a).invoke(objArr[0], objArr[1]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Unit.f36324a;
        }
    }

    /* renamed from: tb.a$d */
    static final class d extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f43358a = new d();

        d() {
            super(1);
        }

        public final void a(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Unit.f36324a;
        }
    }

    /* renamed from: tb.a$e */
    public static final class e extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43359a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    public C4826a(String name, kotlin.reflect.d ownerClass, C0792a ownerType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ownerClass, "ownerClass");
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        this.f43351i = name;
        this.f43352j = ownerClass;
        this.f43353k = ownerType;
    }

    public final C4827b o() {
        boolean b10 = Intrinsics.b(this.f43352j, C5142C.b(Unit.class));
        boolean z10 = !b10 && Cc.d.i(this.f43352j, C5142C.b(SharedObject.class));
        boolean z11 = !b10 && Cc.d.i(this.f43352j, C5142C.b(SharedRef.class));
        if (l() != null && z10) {
            for (Pair pair : CollectionsKt.m(t.a("__expo_onStartListeningToEvent", C0619a.f43355j), t.a("__expo_onStopListeningToEvent", b.f43356j))) {
                String str = (String) pair.getFirst();
                g gVar = (g) pair.getSecond();
                C0792a c0792a = this.f43353k;
                C0792a c0792a2 = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(String.class), Boolean.FALSE));
                if (c0792a2 == null) {
                    c0792a2 = new C0792a(new M(C5142C.b(String.class), false, e.f43359a));
                }
                C0792a[] c0792aArr = {c0792a, c0792a2};
                U u10 = U.f1425a;
                T t10 = (T) u10.a().get(C5142C.b(Unit.class));
                if (t10 == null) {
                    t10 = new T(C5142C.b(Unit.class));
                    u10.a().put(C5142C.b(Unit.class), t10);
                }
                q qVar = new q(str, c0792aArr, t10, new c(gVar));
                qVar.c(false);
                n().put(str, qVar);
            }
        }
        C5185c j10 = j();
        C3863b d10 = j10.d();
        while (d10.hasNext()) {
            AbstractC5052a abstractC5052a = (AbstractC5052a) d10.next();
            abstractC5052a.k(this.f43353k.d());
            abstractC5052a.j(true);
        }
        if (!b10 && this.f43354l == null && !z11) {
            throw new IllegalArgumentException("constructor cannot be null");
        }
        q qVar2 = this.f43354l;
        if (qVar2 == null) {
            C0792a[] c0792aArr2 = new C0792a[0];
            U u11 = U.f1425a;
            T t11 = (T) u11.a().get(C5142C.b(Unit.class));
            if (t11 == null) {
                t11 = new T(C5142C.b(Unit.class));
                u11.a().put(C5142C.b(Unit.class), t11);
            }
            qVar2 = new q("constructor", c0792aArr2, t11, d.f43358a);
        }
        qVar2.j(true);
        qVar2.k(this.f43353k.d());
        return new C4827b(this.f43351i, qVar2, j10, z11);
    }

    public final C0792a p() {
        return this.f43353k;
    }

    public final void q(q qVar) {
        this.f43354l = qVar;
    }
}
