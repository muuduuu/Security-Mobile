package le;

import Td.B;
import Td.C;
import Td.D;
import Td.F;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import Td.J;
import Td.K;
import Td.s;
import Wd.m;
import Wd.p;
import ae.k;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import le.g;
import pe.C3880h;
import pe.InterfaceC3878f;
import pe.InterfaceC3879g;
import xc.C5141B;

/* loaded from: classes3.dex */
public final class d implements J, g.a {

    /* renamed from: A, reason: collision with root package name */
    public static final b f37168A = new b(null);

    /* renamed from: B, reason: collision with root package name */
    private static final List f37169B = CollectionsKt.e(C.HTTP_1_1);

    /* renamed from: a, reason: collision with root package name */
    private final D f37170a;

    /* renamed from: b, reason: collision with root package name */
    private final K f37171b;

    /* renamed from: c, reason: collision with root package name */
    private final Random f37172c;

    /* renamed from: d, reason: collision with root package name */
    private final long f37173d;

    /* renamed from: e, reason: collision with root package name */
    private le.e f37174e;

    /* renamed from: f, reason: collision with root package name */
    private long f37175f;

    /* renamed from: g, reason: collision with root package name */
    private final long f37176g;

    /* renamed from: h, reason: collision with root package name */
    private final String f37177h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC1229e f37178i;

    /* renamed from: j, reason: collision with root package name */
    private Zd.a f37179j;

    /* renamed from: k, reason: collision with root package name */
    private le.g f37180k;

    /* renamed from: l, reason: collision with root package name */
    private le.h f37181l;

    /* renamed from: m, reason: collision with root package name */
    private Zd.c f37182m;

    /* renamed from: n, reason: collision with root package name */
    private String f37183n;

    /* renamed from: o, reason: collision with root package name */
    private AbstractC0552d f37184o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayDeque f37185p;

    /* renamed from: q, reason: collision with root package name */
    private final ArrayDeque f37186q;

    /* renamed from: r, reason: collision with root package name */
    private long f37187r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f37188s;

    /* renamed from: t, reason: collision with root package name */
    private int f37189t;

    /* renamed from: u, reason: collision with root package name */
    private String f37190u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f37191v;

    /* renamed from: w, reason: collision with root package name */
    private int f37192w;

    /* renamed from: x, reason: collision with root package name */
    private int f37193x;

    /* renamed from: y, reason: collision with root package name */
    private int f37194y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f37195z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f37196a;

        /* renamed from: b, reason: collision with root package name */
        private final C3880h f37197b;

        /* renamed from: c, reason: collision with root package name */
        private final long f37198c;

        public a(int i10, C3880h c3880h, long j10) {
            this.f37196a = i10;
            this.f37197b = c3880h;
            this.f37198c = j10;
        }

        public final long a() {
            return this.f37198c;
        }

        public final int b() {
            return this.f37196a;
        }

        public final C3880h c() {
            return this.f37197b;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f37199a;

        /* renamed from: b, reason: collision with root package name */
        private final C3880h f37200b;

        public c(int i10, C3880h data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f37199a = i10;
            this.f37200b = data;
        }

        public final C3880h a() {
            return this.f37200b;
        }

        public final int b() {
            return this.f37199a;
        }
    }

    /* renamed from: le.d$d, reason: collision with other inner class name */
    public static abstract class AbstractC0552d implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f37201a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3879g f37202b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3878f f37203c;

        public AbstractC0552d(boolean z10, InterfaceC3879g source, InterfaceC3878f sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.f37201a = z10;
            this.f37202b = source;
            this.f37203c = sink;
        }

        public abstract void a();

        public final boolean b() {
            return this.f37201a;
        }

        public final InterfaceC3878f c() {
            return this.f37203c;
        }

        public final InterfaceC3879g d() {
            return this.f37202b;
        }
    }

    private final class e extends Zd.a {
        public e() {
            super(d.this.f37183n + " writer", false, 2, null);
        }

        @Override // Zd.a
        public long f() {
            try {
                return d.this.y() ? 0L : -1L;
            } catch (IOException e10) {
                d.r(d.this, e10, null, true, 2, null);
                return -1L;
            }
        }
    }

    public static final class f implements InterfaceC1230f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f37206b;

        f(D d10) {
            this.f37206b = d10;
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e call, F response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            ae.e g10 = response.g();
            try {
                d.this.n(response, g10);
                Intrinsics.d(g10);
                AbstractC0552d n10 = g10.n();
                le.e a10 = le.e.f37213g.a(response.p());
                d.this.f37174e = a10;
                if (!d.this.u(a10)) {
                    d dVar = d.this;
                    synchronized (dVar) {
                        dVar.f37186q.clear();
                        dVar.f(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                d.this.t(p.f11602f + " WebSocket " + this.f37206b.n().s(), n10);
                d.this.v(response);
            } catch (IOException e10) {
                d.r(d.this, e10, response, false, 4, null);
                m.f(response);
                if (g10 != null) {
                    g10.w();
                }
            }
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e call, IOException e10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            d.r(d.this, e10, null, false, 6, null);
        }
    }

    static final class g extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5141B f37207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5141B f37208b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C5141B c5141b, C5141B c5141b2) {
            super(0);
            this.f37207a = c5141b;
            this.f37208b = c5141b2;
        }

        public final void a() {
            m.f((Closeable) this.f37207a.f44962a);
            AbstractC0552d abstractC0552d = (AbstractC0552d) this.f37208b.f44962a;
            if (abstractC0552d != null) {
                m.f(abstractC0552d);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class h extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ le.h f37209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(le.h hVar) {
            super(0);
            this.f37209a = hVar;
        }

        public final void a() {
            m.f(this.f37209a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class i extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f37211b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j10) {
            super(0);
            this.f37211b = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            d.this.z();
            return Long.valueOf(this.f37211b);
        }
    }

    static final class j extends xc.m implements Function0 {
        j() {
            super(0);
        }

        public final void a() {
            d.this.m();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public d(Zd.d taskRunner, D originalRequest, K listener, Random random, long j10, le.e eVar, long j11, long j12) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f37170a = originalRequest;
        this.f37171b = listener;
        this.f37172c = random;
        this.f37173d = j10;
        this.f37174e = eVar;
        this.f37175f = j11;
        this.f37176g = j12;
        this.f37182m = taskRunner.k();
        this.f37185p = new ArrayDeque();
        this.f37186q = new ArrayDeque();
        this.f37189t = -1;
        if (!Intrinsics.b("GET", originalRequest.i())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.i()).toString());
        }
        C3880h.a aVar = C3880h.f38683d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.f36324a;
        this.f37177h = C3880h.a.g(aVar, bArr, 0, 0, 3, null).b();
    }

    public static /* synthetic */ void r(d dVar, Exception exc, F f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        dVar.q(exc, f10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(le.e eVar) {
        if (!eVar.f37219f && eVar.f37215b == null) {
            return eVar.f37217d == null || new IntRange(8, 15).C(eVar.f37217d.intValue());
        }
        return false;
    }

    private final void w() {
        if (!p.f11601e || Thread.holdsLock(this)) {
            Zd.a aVar = this.f37179j;
            if (aVar != null) {
                Zd.c.m(this.f37182m, aVar, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final synchronized boolean x(C3880h c3880h, int i10) {
        if (!this.f37191v && !this.f37188s) {
            if (this.f37187r + c3880h.L() > 16777216) {
                f(1001, null);
                return false;
            }
            this.f37187r += c3880h.L();
            this.f37186q.add(new c(i10, c3880h));
            w();
            return true;
        }
        return false;
    }

    @Override // Td.J
    public boolean a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return x(C3880h.f38683d.d(text), 1);
    }

    @Override // Td.J
    public boolean b(C3880h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return x(bytes, 2);
    }

    @Override // le.g.a
    public void c(C3880h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f37171b.e(this, bytes);
    }

    @Override // le.g.a
    public void d(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f37171b.d(this, text);
    }

    @Override // le.g.a
    public synchronized void e(C3880h payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.f37191v && (!this.f37188s || !this.f37186q.isEmpty())) {
                this.f37185p.add(payload);
                w();
                this.f37193x++;
            }
        } finally {
        }
    }

    @Override // Td.J
    public boolean f(int i10, String str) {
        return o(i10, str, this.f37176g);
    }

    @Override // le.g.a
    public void g(int i10, String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            if (this.f37189t != -1) {
                throw new IllegalStateException("already closed");
            }
            this.f37189t = i10;
            this.f37190u = reason;
            Unit unit = Unit.f36324a;
        }
        this.f37171b.b(this, i10, reason);
    }

    @Override // le.g.a
    public synchronized void h(C3880h payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f37194y++;
        this.f37195z = false;
    }

    public void m() {
        InterfaceC1229e interfaceC1229e = this.f37178i;
        Intrinsics.d(interfaceC1229e);
        interfaceC1229e.cancel();
    }

    public final void n(F response, ae.e eVar) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.f() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.f() + ' ' + response.r() + '\'');
        }
        String o10 = F.o(response, "Connection", null, 2, null);
        if (!StringsKt.r("Upgrade", o10, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + o10 + '\'');
        }
        String o11 = F.o(response, "Upgrade", null, 2, null);
        if (!StringsKt.r("websocket", o11, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + o11 + '\'');
        }
        String o12 = F.o(response, "Sec-WebSocket-Accept", null, 2, null);
        String b10 = C3880h.f38683d.d(this.f37177h + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").J().b();
        if (Intrinsics.b(b10, o12)) {
            if (eVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + b10 + "' but was '" + o12 + '\'');
    }

    public final synchronized boolean o(int i10, String str, long j10) {
        C3880h c3880h;
        try {
            le.f.f37220a.c(i10);
            if (str != null) {
                c3880h = C3880h.f38683d.d(str);
                if (c3880h.L() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                c3880h = null;
            }
            if (!this.f37191v && !this.f37188s) {
                this.f37188s = true;
                this.f37186q.add(new a(i10, c3880h, j10));
                w();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void p(B client) {
        Intrinsics.checkNotNullParameter(client, "client");
        if (this.f37170a.e("Sec-WebSocket-Extensions") != null) {
            r(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            return;
        }
        B c10 = client.A().m(s.f10201b).b0(f37169B).c();
        D b10 = this.f37170a.j().l("Upgrade", "websocket").l("Connection", "Upgrade").l("Sec-WebSocket-Key", this.f37177h).l("Sec-WebSocket-Version", "13").l("Sec-WebSocket-Extensions", "permessage-deflate").b();
        k kVar = new k(c10, b10, true);
        this.f37178i = kVar;
        Intrinsics.d(kVar);
        kVar.g1(new f(b10));
    }

    public final void q(Exception e10, F f10, boolean z10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        C5141B c5141b = new C5141B();
        C5141B c5141b2 = new C5141B();
        synchronized (this) {
            try {
                if (this.f37191v) {
                    return;
                }
                this.f37191v = true;
                AbstractC0552d abstractC0552d = this.f37184o;
                le.h hVar = this.f37181l;
                c5141b2.f44962a = hVar;
                AbstractC0552d abstractC0552d2 = null;
                this.f37181l = null;
                if (hVar != null && this.f37180k == null) {
                    abstractC0552d2 = abstractC0552d;
                }
                c5141b.f44962a = abstractC0552d2;
                if (!z10 && c5141b2.f44962a != null) {
                    Zd.c.d(this.f37182m, this.f37183n + " writer close", 0L, false, new g(c5141b2, c5141b), 2, null);
                }
                this.f37182m.q();
                Unit unit = Unit.f36324a;
                try {
                    this.f37171b.c(this, e10, f10);
                } finally {
                    if (abstractC0552d != null) {
                        abstractC0552d.a();
                    }
                    if (z10) {
                        le.h hVar2 = (le.h) c5141b2.f44962a;
                        if (hVar2 != null) {
                            m.f(hVar2);
                        }
                        AbstractC0552d abstractC0552d3 = (AbstractC0552d) c5141b.f44962a;
                        if (abstractC0552d3 != null) {
                            m.f(abstractC0552d3);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        boolean z10;
        int i10;
        String str;
        le.g gVar;
        AbstractC0552d abstractC0552d;
        synchronized (this) {
            try {
                z10 = this.f37191v;
                i10 = this.f37189t;
                str = this.f37190u;
                gVar = this.f37180k;
                this.f37180k = null;
                if (this.f37188s && this.f37186q.isEmpty()) {
                    le.h hVar = this.f37181l;
                    if (hVar != null) {
                        this.f37181l = null;
                        Zd.c.d(this.f37182m, this.f37183n + " writer close", 0L, false, new h(hVar), 2, null);
                    }
                    this.f37182m.q();
                }
                abstractC0552d = this.f37181l == null ? this.f37184o : null;
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10 && abstractC0552d != null && this.f37189t != -1) {
            K k10 = this.f37171b;
            Intrinsics.d(str);
            k10.a(this, i10, str);
        }
        if (gVar != null) {
            m.f(gVar);
        }
        if (abstractC0552d != null) {
            m.f(abstractC0552d);
        }
    }

    public final void t(String name, AbstractC0552d streams) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        le.e eVar = this.f37174e;
        Intrinsics.d(eVar);
        synchronized (this) {
            try {
                this.f37183n = name;
                this.f37184o = streams;
                this.f37181l = new le.h(streams.b(), streams.c(), this.f37172c, eVar.f37214a, eVar.a(streams.b()), this.f37175f);
                this.f37179j = new e();
                long j10 = this.f37173d;
                if (j10 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                    this.f37182m.l(name + " ping", nanos, new i(nanos));
                }
                if (!this.f37186q.isEmpty()) {
                    w();
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f37180k = new le.g(streams.b(), streams.d(), this, eVar.f37214a, eVar.a(!streams.b()));
    }

    public final void v(F response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            try {
                this.f37171b.f(this, response);
                while (this.f37189t == -1) {
                    le.g gVar = this.f37180k;
                    Intrinsics.d(gVar);
                    gVar.a();
                }
            } catch (Exception e10) {
                r(this, e10, null, false, 6, null);
            }
        } finally {
            s();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[Catch: all -> 0x0091, TRY_ENTER, TryCatch #0 {all -> 0x0091, blocks: (B:26:0x0088, B:33:0x0093, B:35:0x0097, B:36:0x00a7, B:39:0x00b6, B:43:0x00b9, B:44:0x00ba, B:45:0x00bb, B:47:0x00bf, B:49:0x00d1, B:50:0x00e5, B:51:0x00ea, B:38:0x00a8), top: B:24:0x0086, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:26:0x0088, B:33:0x0093, B:35:0x0097, B:36:0x00a7, B:39:0x00b6, B:43:0x00b9, B:44:0x00ba, B:45:0x00bb, B:47:0x00bf, B:49:0x00d1, B:50:0x00e5, B:51:0x00ea, B:38:0x00a8), top: B:24:0x0086, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y() {
        AbstractC0552d abstractC0552d;
        String str;
        int i10;
        ?? r52;
        synchronized (this) {
            try {
                if (this.f37191v) {
                    return false;
                }
                le.h hVar = this.f37181l;
                Object poll = this.f37185p.poll();
                Object obj = null;
                r4 = null;
                AbstractC0552d abstractC0552d2 = null;
                try {
                    if (poll == null) {
                        Object poll2 = this.f37186q.poll();
                        if (poll2 instanceof a) {
                            int i11 = this.f37189t;
                            str = this.f37190u;
                            if (i11 != -1) {
                                le.h hVar2 = this.f37181l;
                                this.f37181l = null;
                                if (hVar2 != null && this.f37180k == null) {
                                    abstractC0552d2 = this.f37184o;
                                }
                                this.f37182m.q();
                                i10 = i11;
                                abstractC0552d = abstractC0552d2;
                                obj = poll2;
                                r52 = hVar2;
                            } else {
                                long a10 = ((a) poll2).a();
                                Zd.c.d(this.f37182m, this.f37183n + " cancel", TimeUnit.MILLISECONDS.toNanos(a10), false, new j(), 4, null);
                                r52 = 0;
                                obj = poll2;
                                i10 = i11;
                                abstractC0552d = null;
                            }
                            Unit unit = Unit.f36324a;
                            if (poll == null) {
                                Intrinsics.d(hVar);
                                hVar.e((C3880h) poll);
                            } else if (obj instanceof c) {
                                c cVar = (c) obj;
                                Intrinsics.d(hVar);
                                hVar.c(cVar.b(), cVar.a());
                                synchronized (this) {
                                    this.f37187r -= cVar.a().L();
                                }
                            } else {
                                if (!(obj instanceof a)) {
                                    throw new AssertionError();
                                }
                                a aVar = (a) obj;
                                Intrinsics.d(hVar);
                                hVar.a(aVar.b(), aVar.c());
                                if (abstractC0552d != null) {
                                    K k10 = this.f37171b;
                                    Intrinsics.d(str);
                                    k10.a(this, i10, str);
                                }
                            }
                        }
                        if (poll2 == null) {
                            return false;
                        }
                        abstractC0552d = null;
                        str = null;
                        obj = poll2;
                    } else {
                        abstractC0552d = null;
                        str = null;
                    }
                    if (poll == null) {
                    }
                } finally {
                    if (r52 != 0) {
                        m.f(r52);
                    }
                    if (abstractC0552d != null) {
                        m.f(abstractC0552d);
                    }
                }
                i10 = -1;
                r52 = str;
                Unit unit2 = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z() {
        synchronized (this) {
            try {
                if (this.f37191v) {
                    return;
                }
                le.h hVar = this.f37181l;
                if (hVar == null) {
                    return;
                }
                int i10 = this.f37195z ? this.f37192w : -1;
                this.f37192w++;
                this.f37195z = true;
                Unit unit = Unit.f36324a;
                if (i10 == -1) {
                    try {
                        hVar.d(C3880h.f38684e);
                        return;
                    } catch (IOException e10) {
                        r(this, e10, null, true, 2, null);
                        return;
                    }
                }
                r(this, new SocketTimeoutException("sent ping but didn't receive pong within " + this.f37173d + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null, true, 2, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
