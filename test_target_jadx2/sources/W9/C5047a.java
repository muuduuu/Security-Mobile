package w9;

import A9.a;
import Jd.AbstractC0891k;
import Jd.N;
import Jd.O;
import Jd.O0;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.google.gson.e;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import org.conscrypt.PSKKeyManager;
import pc.AbstractC3868b;
import u9.InterfaceC4875a;
import v9.C4973b;
import v9.C4975d;
import v9.C4977f;
import v9.EnumC4972a;
import v9.g;
import v9.i;
import xc.m;
import z9.InterfaceC5264a;

/* renamed from: w9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5047a implements InterfaceC4875a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f44364d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile C5047a f44365e;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f44367b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0639a f44363c = new C0639a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Object f44366f = new Object();

    /* renamed from: w9.a$a, reason: collision with other inner class name */
    public static final class C0639a {

        /* renamed from: w9.a$a$a, reason: collision with other inner class name */
        static final class C0640a extends m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f44368a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f44369b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0640a(long j10, long j11) {
                super(1);
                this.f44368a = j10;
                this.f44369b = j11;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C4977f invoke(C4977f updateTrace) {
                C4977f a10;
                Intrinsics.checkNotNullParameter(updateTrace, "$this$updateTrace");
                a10 = updateTrace.a((r34 & 1) != 0 ? updateTrace.f44048a : updateTrace.e().a(this.f44369b, System.currentTimeMillis()), (r34 & 2) != 0 ? updateTrace.f44049b : SystemClock.uptimeMillis() - this.f44368a, (r34 & 4) != 0 ? updateTrace.f44050c : 0.0d, (r34 & 8) != 0 ? updateTrace.f44051d : 0.0d, (r34 & 16) != 0 ? updateTrace.f44052e : 0.0d, (r34 & 32) != 0 ? updateTrace.f44053f : 0.0d, (r34 & 64) != 0 ? updateTrace.f44054g : 0.0d, (r34 & 128) != 0 ? updateTrace.f44055h : 0.0d, (r34 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? updateTrace.f44056i : 0.0d);
                return a10;
            }
        }

        public /* synthetic */ C0639a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4875a a() {
            C5047a c5047a;
            C5047a c5047a2 = C5047a.f44365e;
            if (c5047a2 != null) {
                return c5047a2;
            }
            synchronized (C5047a.f44366f) {
                c5047a = C5047a.f44365e;
            }
            return c5047a;
        }

        public final void b(C4973b configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            synchronized (C5047a.f44366f) {
                if (C5047a.f44365e != null) {
                    throw new IllegalStateException("Gobbler is already initialized. If you want to re-initialize Gobbler with new Configuration, please call Gobbler#release first.");
                }
                long currentTimeMillis = System.currentTimeMillis();
                long uptimeMillis = SystemClock.uptimeMillis();
                Context applicationContext = configuration.a().getApplicationContext();
                InterfaceC5264a.C0676a c0676a = InterfaceC5264a.f45781a;
                Intrinsics.d(applicationContext);
                c0676a.b(applicationContext, new e(), configuration);
                C5047a.f44365e = new C5047a(null);
                C5047a.f44363c.c(true);
                D9.a.f1398a.d(new C0640a(uptimeMillis, currentTimeMillis));
                C5047a c5047a = C5047a.f44365e;
                Intrinsics.d(c5047a);
                c5047a.l(configuration.a());
                Unit unit = Unit.f36324a;
            }
        }

        public final void c(boolean z10) {
            C5047a.f44364d = z10;
        }

        private C0639a() {
        }
    }

    /* renamed from: w9.a$b */
    static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44370a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N invoke() {
            return O.a(O0.b(null, 1, null).l(F9.c.f2651a.a()));
        }
    }

    /* renamed from: w9.a$c */
    static final class c extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f44371a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f44372b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Application application, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f44372b = application;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new c(this.f44372b, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f44371a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            int flushInterval = InterfaceC5264a.f45781a.a().i().getFlushInterval();
            B9.a aVar = B9.a.f540a;
            Context applicationContext = this.f44372b.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            aVar.f(applicationContext, flushInterval);
            return Unit.f36324a;
        }
    }

    /* renamed from: w9.a$d */
    static final class d extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f44373a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f44375c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ byte[] f44376d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f44377e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, byte[] bArr, g gVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f44375c = str;
            this.f44376d = bArr;
            this.f44377e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return C5047a.this.new d(this.f44375c, this.f44376d, this.f44377e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((d) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f44373a;
            if (i10 == 0) {
                p.b(obj);
                A9.a h10 = InterfaceC5264a.f45781a.a().h();
                if (!C5047a.this.m(h10, this.f44375c)) {
                    return Unit.f36324a;
                }
                String str = this.f44375c;
                byte[] bArr = this.f44376d;
                g gVar = this.f44377e;
                EnumC4972a a10 = C4975d.f44033a.a();
                this.f44373a = 1;
                if (a.C0005a.a(h10, str, bArr, gVar, a10, null, false, this, 48, null) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    F9.d.g(F9.d.f2658a, "Gobbler.Core", "Event stored in db:: " + this.f44375c + ", " + this.f44377e, null, 4, null);
                    return Unit.f36324a;
                }
                p.b(obj);
            }
            B9.a aVar = B9.a.f540a;
            g gVar2 = this.f44377e;
            this.f44373a = 2;
            if (aVar.b(gVar2, this) == e10) {
                return e10;
            }
            F9.d.g(F9.d.f2658a, "Gobbler.Core", "Event stored in db:: " + this.f44375c + ", " + this.f44377e, null, 4, null);
            return Unit.f36324a;
        }
    }

    public /* synthetic */ C5047a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final N k() {
        return (N) this.f44367b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(A9.a aVar, String str) {
        if (!aVar.c(str)) {
            F9.d.g(F9.d.f2658a, "Gobbler.Core", "Not a valid event name " + str, null, 4, null);
            return false;
        }
        if (!aVar.b(str)) {
            return true;
        }
        F9.d.g(F9.d.f2658a, "Gobbler.Core", "Event is blacklisted " + str, null, 4, null);
        return false;
    }

    @Override // u9.InterfaceC4875a
    public void a() {
        synchronized (f44366f) {
            try {
                if (f44365e != null) {
                    f44365e = null;
                    f44364d = false;
                    InterfaceC5264a.f45781a.c();
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u9.InterfaceC4875a
    public void b(String deviceIdV1) {
        Intrinsics.checkNotNullParameter(deviceIdV1, "deviceIdV1");
        InterfaceC5264a.f45781a.a().b(deviceIdV1);
    }

    @Override // u9.InterfaceC4875a
    public void c(i user) {
        Intrinsics.checkNotNullParameter(user, "user");
        InterfaceC5264a.f45781a.a().c(user);
        F9.d.g(F9.d.f2658a, "Gobbler.Core", "Gobbler user updated", null, 4, null);
    }

    @Override // u9.InterfaceC4875a
    public i d() {
        return InterfaceC5264a.f45781a.a().d();
    }

    @Override // u9.InterfaceC4875a
    public void e(String eventName, byte[] eventBytes, g serviceName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventBytes, "eventBytes");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        F9.d.g(F9.d.f2658a, "Gobbler.Core", "track(" + eventName + ", " + eventBytes + ", " + serviceName + ")", null, 4, null);
        AbstractC0891k.d(k(), null, null, new d(eventName, eventBytes, serviceName, null), 3, null);
    }

    public final void l(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        AbstractC0891k.d(k(), null, null, new c(application, null), 3, null);
    }

    @Override // u9.InterfaceC4875a
    public void logout() {
        InterfaceC5264a.f45781a.a().c(new i(null, null, null, null, 15, null));
        F9.d.g(F9.d.f2658a, "Gobbler.Core", "Gobbler logout success", null, 4, null);
    }

    private C5047a() {
        this.f44367b = lc.i.a(b.f44370a);
    }
}
