package z9;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.o;
import com.nextbillion.gobbler.internal.db.GobblerDatabase;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import v9.C4973b;
import v9.C4974c;
import v9.C4977f;
import v9.GobblerConfig;
import xc.m;

/* renamed from: z9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5265b implements InterfaceC5264a {

    /* renamed from: o, reason: collision with root package name */
    public static final a f45785o = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final Context f45786b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.gson.e f45787c;

    /* renamed from: d, reason: collision with root package name */
    private final C4973b f45788d;

    /* renamed from: e, reason: collision with root package name */
    private String f45789e;

    /* renamed from: f, reason: collision with root package name */
    private GobblerConfig f45790f;

    /* renamed from: g, reason: collision with root package name */
    private final Lazy f45791g;

    /* renamed from: h, reason: collision with root package name */
    private final Lazy f45792h;

    /* renamed from: i, reason: collision with root package name */
    private final Lazy f45793i;

    /* renamed from: j, reason: collision with root package name */
    private final Lazy f45794j;

    /* renamed from: k, reason: collision with root package name */
    private final Lazy f45795k;

    /* renamed from: l, reason: collision with root package name */
    private final Lazy f45796l;

    /* renamed from: m, reason: collision with root package name */
    private final Lazy f45797m;

    /* renamed from: n, reason: collision with root package name */
    private final Lazy f45798n;

    /* renamed from: z9.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: z9.b$b, reason: collision with other inner class name */
    static final class C0677b extends m implements Function0 {
        C0677b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F9.b invoke() {
            return new F9.b(C5265b.this.f45786b);
        }
    }

    /* renamed from: z9.b$c */
    static final class c extends m implements Function0 {

        /* renamed from: z9.b$c$a */
        static final class a extends m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5265b f45801a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5265b c5265b) {
                super(0);
                this.f45801a = c5265b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x9.b invoke() {
                return this.f45801a.t().I();
            }
        }

        /* renamed from: z9.b$c$b, reason: collision with other inner class name */
        static final class C0678b extends m implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0678b f45802a = new C0678b();

            C0678b() {
                super(2);
            }

            public final C4977f a(C4977f traceNanoTimedValue, double d10) {
                C4977f a10;
                Intrinsics.checkNotNullParameter(traceNanoTimedValue, "$this$traceNanoTimedValue");
                a10 = traceNanoTimedValue.a((r34 & 1) != 0 ? traceNanoTimedValue.f44048a : null, (r34 & 2) != 0 ? traceNanoTimedValue.f44049b : 0.0d, (r34 & 4) != 0 ? traceNanoTimedValue.f44050c : 0.0d, (r34 & 8) != 0 ? traceNanoTimedValue.f44051d : d10, (r34 & 16) != 0 ? traceNanoTimedValue.f44052e : 0.0d, (r34 & 32) != 0 ? traceNanoTimedValue.f44053f : 0.0d, (r34 & 64) != 0 ? traceNanoTimedValue.f44054g : 0.0d, (r34 & 128) != 0 ? traceNanoTimedValue.f44055h : 0.0d, (r34 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? traceNanoTimedValue.f44056i : 0.0d);
                return a10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((C4977f) obj, ((Number) obj2).doubleValue());
            }
        }

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x9.b invoke() {
            return (x9.b) D9.a.f1398a.c(new a(C5265b.this), C0678b.f45802a);
        }
    }

    /* renamed from: z9.b$d */
    static final class d extends m implements Function0 {

        /* renamed from: z9.b$d$a */
        static final class a extends m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5265b f45804a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5265b c5265b) {
                super(0);
                this.f45804a = c5265b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final A9.b invoke() {
                return new A9.b(this.f45804a.q(), this.f45804a.e(), this.f45804a.j());
            }
        }

        /* renamed from: z9.b$d$b, reason: collision with other inner class name */
        static final class C0679b extends m implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0679b f45805a = new C0679b();

            C0679b() {
                super(2);
            }

            public final C4977f a(C4977f traceNanoTimedValue, double d10) {
                C4977f a10;
                Intrinsics.checkNotNullParameter(traceNanoTimedValue, "$this$traceNanoTimedValue");
                a10 = traceNanoTimedValue.a((r34 & 1) != 0 ? traceNanoTimedValue.f44048a : null, (r34 & 2) != 0 ? traceNanoTimedValue.f44049b : 0.0d, (r34 & 4) != 0 ? traceNanoTimedValue.f44050c : 0.0d, (r34 & 8) != 0 ? traceNanoTimedValue.f44051d : 0.0d, (r34 & 16) != 0 ? traceNanoTimedValue.f44052e : 0.0d, (r34 & 32) != 0 ? traceNanoTimedValue.f44053f : 0.0d, (r34 & 64) != 0 ? traceNanoTimedValue.f44054g : 0.0d, (r34 & 128) != 0 ? traceNanoTimedValue.f44055h : 0.0d, (r34 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? traceNanoTimedValue.f44056i : d10);
                return a10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((C4977f) obj, ((Number) obj2).doubleValue());
            }
        }

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A9.b invoke() {
            return (A9.b) D9.a.f1398a.c(new a(C5265b.this), C0679b.f45805a);
        }
    }

    /* renamed from: z9.b$e */
    static final class e extends m implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GobblerConfig invoke() {
            return C5265b.this.p();
        }
    }

    /* renamed from: z9.b$f */
    static final class f extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f45807a = new f();

        f() {
            super(2);
        }

        public final C4977f a(C4977f traceNanoTimedValue, double d10) {
            C4977f a10;
            Intrinsics.checkNotNullParameter(traceNanoTimedValue, "$this$traceNanoTimedValue");
            a10 = traceNanoTimedValue.a((r34 & 1) != 0 ? traceNanoTimedValue.f44048a : null, (r34 & 2) != 0 ? traceNanoTimedValue.f44049b : 0.0d, (r34 & 4) != 0 ? traceNanoTimedValue.f44050c : 0.0d, (r34 & 8) != 0 ? traceNanoTimedValue.f44051d : 0.0d, (r34 & 16) != 0 ? traceNanoTimedValue.f44052e : 0.0d, (r34 & 32) != 0 ? traceNanoTimedValue.f44053f : 0.0d, (r34 & 64) != 0 ? traceNanoTimedValue.f44054g : d10, (r34 & 128) != 0 ? traceNanoTimedValue.f44055h : 0.0d, (r34 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? traceNanoTimedValue.f44056i : 0.0d);
            return a10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C4977f) obj, ((Number) obj2).doubleValue());
        }
    }

    /* renamed from: z9.b$g */
    static final class g extends m implements Function0 {

        /* renamed from: z9.b$g$a */
        static final class a extends m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5265b f45809a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5265b c5265b) {
                super(0);
                this.f45809a = c5265b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GobblerDatabase invoke() {
                return GobblerDatabase.INSTANCE.b(this.f45809a.f45786b);
            }
        }

        /* renamed from: z9.b$g$b, reason: collision with other inner class name */
        static final class C0680b extends m implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0680b f45810a = new C0680b();

            C0680b() {
                super(2);
            }

            public final C4977f a(C4977f traceNanoTimedValue, double d10) {
                C4977f a10;
                Intrinsics.checkNotNullParameter(traceNanoTimedValue, "$this$traceNanoTimedValue");
                a10 = traceNanoTimedValue.a((r34 & 1) != 0 ? traceNanoTimedValue.f44048a : null, (r34 & 2) != 0 ? traceNanoTimedValue.f44049b : 0.0d, (r34 & 4) != 0 ? traceNanoTimedValue.f44050c : d10, (r34 & 8) != 0 ? traceNanoTimedValue.f44051d : 0.0d, (r34 & 16) != 0 ? traceNanoTimedValue.f44052e : 0.0d, (r34 & 32) != 0 ? traceNanoTimedValue.f44053f : 0.0d, (r34 & 64) != 0 ? traceNanoTimedValue.f44054g : 0.0d, (r34 & 128) != 0 ? traceNanoTimedValue.f44055h : 0.0d, (r34 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? traceNanoTimedValue.f44056i : 0.0d);
                return a10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((C4977f) obj, ((Number) obj2).doubleValue());
            }
        }

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GobblerDatabase invoke() {
            return (GobblerDatabase) D9.a.f1398a.c(new a(C5265b.this), C0680b.f45810a);
        }
    }

    /* renamed from: z9.b$h */
    static final class h extends m implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E9.b invoke() {
            return new E9.b(C5265b.this.r(), C5265b.this.w(), C5265b.this.v());
        }
    }

    /* renamed from: z9.b$i */
    static final class i extends m implements Function0 {

        /* renamed from: z9.b$i$a */
        static final class a extends m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5265b f45813a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5265b c5265b) {
                super(0);
                this.f45813a = c5265b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SharedPreferences invoke() {
                return this.f45813a.f45786b.getSharedPreferences("gobbler_shared_prefs", 0);
            }
        }

        /* renamed from: z9.b$i$b, reason: collision with other inner class name */
        static final class C0681b extends m implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0681b f45814a = new C0681b();

            C0681b() {
                super(2);
            }

            public final C4977f a(C4977f traceNanoTimedValue, double d10) {
                C4977f a10;
                Intrinsics.checkNotNullParameter(traceNanoTimedValue, "$this$traceNanoTimedValue");
                a10 = traceNanoTimedValue.a((r34 & 1) != 0 ? traceNanoTimedValue.f44048a : null, (r34 & 2) != 0 ? traceNanoTimedValue.f44049b : 0.0d, (r34 & 4) != 0 ? traceNanoTimedValue.f44050c : 0.0d, (r34 & 8) != 0 ? traceNanoTimedValue.f44051d : 0.0d, (r34 & 16) != 0 ? traceNanoTimedValue.f44052e : 0.0d, (r34 & 32) != 0 ? traceNanoTimedValue.f44053f : d10, (r34 & 64) != 0 ? traceNanoTimedValue.f44054g : 0.0d, (r34 & 128) != 0 ? traceNanoTimedValue.f44055h : 0.0d, (r34 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? traceNanoTimedValue.f44056i : 0.0d);
                return a10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((C4977f) obj, ((Number) obj2).doubleValue());
            }
        }

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) D9.a.f1398a.c(new a(C5265b.this), C0681b.f45814a);
        }
    }

    /* renamed from: z9.b$j */
    static final class j extends m implements Function0 {

        /* renamed from: z9.b$j$a */
        static final class a extends m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5265b f45816a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5265b c5265b) {
                super(0);
                this.f45816a = c5265b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C9.b invoke() {
                return new C9.b(this.f45816a.j(), this.f45816a.q());
            }
        }

        /* renamed from: z9.b$j$b, reason: collision with other inner class name */
        static final class C0682b extends m implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0682b f45817a = new C0682b();

            C0682b() {
                super(2);
            }

            public final C4977f a(C4977f traceNanoTimedValue, double d10) {
                C4977f a10;
                Intrinsics.checkNotNullParameter(traceNanoTimedValue, "$this$traceNanoTimedValue");
                a10 = traceNanoTimedValue.a((r34 & 1) != 0 ? traceNanoTimedValue.f44048a : null, (r34 & 2) != 0 ? traceNanoTimedValue.f44049b : 0.0d, (r34 & 4) != 0 ? traceNanoTimedValue.f44050c : 0.0d, (r34 & 8) != 0 ? traceNanoTimedValue.f44051d : 0.0d, (r34 & 16) != 0 ? traceNanoTimedValue.f44052e : 0.0d, (r34 & 32) != 0 ? traceNanoTimedValue.f44053f : 0.0d, (r34 & 64) != 0 ? traceNanoTimedValue.f44054g : 0.0d, (r34 & 128) != 0 ? traceNanoTimedValue.f44055h : d10, (r34 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? traceNanoTimedValue.f44056i : 0.0d);
                return a10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((C4977f) obj, ((Number) obj2).doubleValue());
            }
        }

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C9.b invoke() {
            return (C9.b) D9.a.f1398a.c(new a(C5265b.this), C0682b.f45817a);
        }
    }

    /* renamed from: z9.b$k */
    static final class k extends m implements Function0 {

        /* renamed from: z9.b$k$a */
        static final class a extends m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5265b f45819a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5265b c5265b) {
                super(0);
                this.f45819a = c5265b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x9.d invoke() {
                return this.f45819a.t().J();
            }
        }

        /* renamed from: z9.b$k$b, reason: collision with other inner class name */
        static final class C0683b extends m implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0683b f45820a = new C0683b();

            C0683b() {
                super(2);
            }

            public final C4977f a(C4977f traceNanoTimedValue, double d10) {
                C4977f a10;
                Intrinsics.checkNotNullParameter(traceNanoTimedValue, "$this$traceNanoTimedValue");
                a10 = traceNanoTimedValue.a((r34 & 1) != 0 ? traceNanoTimedValue.f44048a : null, (r34 & 2) != 0 ? traceNanoTimedValue.f44049b : 0.0d, (r34 & 4) != 0 ? traceNanoTimedValue.f44050c : 0.0d, (r34 & 8) != 0 ? traceNanoTimedValue.f44051d : 0.0d, (r34 & 16) != 0 ? traceNanoTimedValue.f44052e : d10, (r34 & 32) != 0 ? traceNanoTimedValue.f44053f : 0.0d, (r34 & 64) != 0 ? traceNanoTimedValue.f44054g : 0.0d, (r34 & 128) != 0 ? traceNanoTimedValue.f44055h : 0.0d, (r34 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? traceNanoTimedValue.f44056i : 0.0d);
                return a10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((C4977f) obj, ((Number) obj2).doubleValue());
            }
        }

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x9.d invoke() {
            return (x9.d) D9.a.f1398a.c(new a(C5265b.this), C0683b.f45820a);
        }
    }

    public C5265b(Context context, com.google.gson.e gson, C4973b configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f45786b = context;
        this.f45787c = gson;
        this.f45788d = configuration;
        this.f45789e = BuildConfig.FLAVOR;
        this.f45791g = lc.i.a(new j());
        this.f45792h = lc.i.a(new g());
        this.f45793i = lc.i.a(new c());
        this.f45794j = lc.i.a(new k());
        this.f45795k = lc.i.a(new h());
        this.f45796l = lc.i.a(new C0677b());
        this.f45797m = lc.i.a(new d());
        this.f45798n = lc.i.a(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GobblerConfig p() {
        String string = u().getString("sdk_config", null);
        if (string == null) {
            return new GobblerConfig(0, null, null, 0, 0, 0, 0, 127, null);
        }
        try {
            Object k10 = this.f45787c.k(string, GobblerConfig.class);
            Intrinsics.d(k10);
            return (GobblerConfig) k10;
        } catch (Exception e10) {
            Ge.a.f3026a.d("Gobbler.DependencyProvider").b(e10, "getConfiguration(): error parsing config json", new Object[0]);
            return new GobblerConfig(0, null, null, 0, 0, 0, 0, 127, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x9.b r() {
        return (x9.b) this.f45793i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x9.d w() {
        return (x9.d) this.f45794j.getValue();
    }

    @Override // z9.InterfaceC5264a
    public void a(int i10) {
        u().edit().putInt("network_failures", i10).apply();
    }

    @Override // z9.InterfaceC5264a
    public void b(String deviceIdV1) {
        Intrinsics.checkNotNullParameter(deviceIdV1, "deviceIdV1");
        this.f45789e = deviceIdV1;
    }

    @Override // z9.InterfaceC5264a
    public void c(v9.i user) {
        Intrinsics.checkNotNullParameter(user, "user");
        u().edit().putString("user_props", this.f45787c.t(user)).apply();
    }

    @Override // z9.InterfaceC5264a
    public v9.i d() {
        String string = u().getString("user_props", null);
        if (string == null) {
            return new v9.i(null, null, null, null, 15, null);
        }
        try {
            Object k10 = this.f45787c.k(string, v9.i.class);
            Intrinsics.d(k10);
            return (v9.i) k10;
        } catch (o e10) {
            Ge.a.f3026a.d("Gobbler.DependencyProvider").b(e10, "getUser(): error parsing user json", new Object[0]);
            return new v9.i(null, null, null, null, 15, null);
        }
    }

    @Override // z9.InterfaceC5264a
    public E9.a e() {
        return (E9.a) this.f45795k.getValue();
    }

    @Override // z9.InterfaceC5264a
    public int f() {
        return u().getInt("network_failures", 0);
    }

    @Override // z9.InterfaceC5264a
    public C4974c g() {
        C4974c c4974c;
        String string = u().getString("event_context", null);
        if (string == null || string.length() == 0) {
            return new C4974c(null, null, null, null, 15, null);
        }
        try {
            c4974c = (C4974c) this.f45787c.k(string, C4974c.class);
        } catch (o e10) {
            Ge.a.f3026a.d("Gobbler.DependencyProvider").b(e10, "getEventContext(): error parsing event context json", new Object[0]);
            c4974c = new C4974c(null, null, null, null, 15, null);
        }
        Intrinsics.d(c4974c);
        return c4974c;
    }

    @Override // z9.InterfaceC5264a
    public GobblerConfig i() {
        GobblerConfig gobblerConfig = this.f45790f;
        if (gobblerConfig != null) {
            return gobblerConfig;
        }
        u();
        return (GobblerConfig) D9.a.f1398a.c(new e(), f.f45807a);
    }

    @Override // z9.InterfaceC5264a
    public C4973b j() {
        return this.f45788d;
    }

    @Override // z9.InterfaceC5264a
    public String k() {
        return this.f45789e;
    }

    public F9.a q() {
        return (F9.a) this.f45796l.getValue();
    }

    @Override // z9.InterfaceC5264a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public A9.b h() {
        return (A9.b) this.f45797m.getValue();
    }

    public GobblerDatabase t() {
        return (GobblerDatabase) this.f45792h.getValue();
    }

    public SharedPreferences u() {
        Object value = this.f45798n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    public C9.a v() {
        return (C9.a) this.f45791g.getValue();
    }
}
