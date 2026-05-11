package de;

import Wd.p;
import de.C3052i;
import de.InterfaceC3046c;
import ee.C3122a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.C3880h;
import pe.InterfaceC3878f;
import pe.InterfaceC3879g;
import xc.C5141B;
import xc.z;

/* renamed from: de.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3050g implements Closeable {

    /* renamed from: C, reason: collision with root package name */
    public static final c f31934C = new c(null);

    /* renamed from: D, reason: collision with root package name */
    private static final C3057n f31935D;

    /* renamed from: A, reason: collision with root package name */
    private final e f31936A;

    /* renamed from: B, reason: collision with root package name */
    private final Set f31937B;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31938a;

    /* renamed from: b, reason: collision with root package name */
    private final d f31939b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f31940c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31941d;

    /* renamed from: e, reason: collision with root package name */
    private int f31942e;

    /* renamed from: f, reason: collision with root package name */
    private int f31943f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31944g;

    /* renamed from: h, reason: collision with root package name */
    private final Zd.d f31945h;

    /* renamed from: i, reason: collision with root package name */
    private final Zd.c f31946i;

    /* renamed from: j, reason: collision with root package name */
    private final Zd.c f31947j;

    /* renamed from: k, reason: collision with root package name */
    private final Zd.c f31948k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3056m f31949l;

    /* renamed from: m, reason: collision with root package name */
    private long f31950m;

    /* renamed from: n, reason: collision with root package name */
    private long f31951n;

    /* renamed from: o, reason: collision with root package name */
    private long f31952o;

    /* renamed from: p, reason: collision with root package name */
    private long f31953p;

    /* renamed from: q, reason: collision with root package name */
    private long f31954q;

    /* renamed from: r, reason: collision with root package name */
    private long f31955r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3046c f31956s;

    /* renamed from: t, reason: collision with root package name */
    private final C3057n f31957t;

    /* renamed from: u, reason: collision with root package name */
    private C3057n f31958u;

    /* renamed from: v, reason: collision with root package name */
    private final C3122a f31959v;

    /* renamed from: w, reason: collision with root package name */
    private long f31960w;

    /* renamed from: x, reason: collision with root package name */
    private long f31961x;

    /* renamed from: y, reason: collision with root package name */
    private final Socket f31962y;

    /* renamed from: z, reason: collision with root package name */
    private final C3054k f31963z;

    /* renamed from: de.g$a */
    static final class a extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f31965b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10) {
            super(0);
            this.f31965b = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            boolean z10;
            C3050g c3050g = C3050g.this;
            synchronized (c3050g) {
                if (c3050g.f31951n < c3050g.f31950m) {
                    z10 = true;
                } else {
                    c3050g.f31950m++;
                    z10 = false;
                }
            }
            if (z10) {
                C3050g.this.y(null);
                return -1L;
            }
            C3050g.this.U1(false, 1, 0);
            return Long.valueOf(this.f31965b);
        }
    }

    /* renamed from: de.g$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f31966a;

        /* renamed from: b, reason: collision with root package name */
        private final Zd.d f31967b;

        /* renamed from: c, reason: collision with root package name */
        public Socket f31968c;

        /* renamed from: d, reason: collision with root package name */
        public String f31969d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC3879g f31970e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC3878f f31971f;

        /* renamed from: g, reason: collision with root package name */
        private d f31972g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC3056m f31973h;

        /* renamed from: i, reason: collision with root package name */
        private int f31974i;

        /* renamed from: j, reason: collision with root package name */
        private InterfaceC3046c f31975j;

        public b(boolean z10, Zd.d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f31966a = z10;
            this.f31967b = taskRunner;
            this.f31972g = d.f31977b;
            this.f31973h = InterfaceC3056m.f32077b;
            this.f31975j = InterfaceC3046c.a.f31897a;
        }

        public final C3050g a() {
            return new C3050g(this);
        }

        public final b b(InterfaceC3046c flowControlListener) {
            Intrinsics.checkNotNullParameter(flowControlListener, "flowControlListener");
            this.f31975j = flowControlListener;
            return this;
        }

        public final boolean c() {
            return this.f31966a;
        }

        public final String d() {
            String str = this.f31969d;
            if (str != null) {
                return str;
            }
            Intrinsics.v("connectionName");
            return null;
        }

        public final InterfaceC3046c e() {
            return this.f31975j;
        }

        public final d f() {
            return this.f31972g;
        }

        public final int g() {
            return this.f31974i;
        }

        public final InterfaceC3056m h() {
            return this.f31973h;
        }

        public final InterfaceC3878f i() {
            InterfaceC3878f interfaceC3878f = this.f31971f;
            if (interfaceC3878f != null) {
                return interfaceC3878f;
            }
            Intrinsics.v("sink");
            return null;
        }

        public final Socket j() {
            Socket socket = this.f31968c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.v("socket");
            return null;
        }

        public final InterfaceC3879g k() {
            InterfaceC3879g interfaceC3879g = this.f31970e;
            if (interfaceC3879g != null) {
                return interfaceC3879g;
            }
            Intrinsics.v("source");
            return null;
        }

        public final Zd.d l() {
            return this.f31967b;
        }

        public final b m(d listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f31972g = listener;
            return this;
        }

        public final b n(int i10) {
            this.f31974i = i10;
            return this;
        }

        public final void o(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f31969d = str;
        }

        public final void p(InterfaceC3878f interfaceC3878f) {
            Intrinsics.checkNotNullParameter(interfaceC3878f, "<set-?>");
            this.f31971f = interfaceC3878f;
        }

        public final void q(Socket socket) {
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.f31968c = socket;
        }

        public final void r(InterfaceC3879g interfaceC3879g) {
            Intrinsics.checkNotNullParameter(interfaceC3879g, "<set-?>");
            this.f31970e = interfaceC3879g;
        }

        public final b s(Socket socket, String peerName, InterfaceC3879g source, InterfaceC3878f sink) {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            q(socket);
            if (this.f31966a) {
                str = p.f11602f + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            o(str);
            r(source);
            p(sink);
            return this;
        }
    }

    /* renamed from: de.g$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3057n a() {
            return C3050g.f31935D;
        }

        private c() {
        }
    }

    /* renamed from: de.g$d */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f31976a = new b(null);

        /* renamed from: b, reason: collision with root package name */
        public static final d f31977b = new a();

        /* renamed from: de.g$d$a */
        public static final class a extends d {
            a() {
            }

            @Override // de.C3050g.d
            public void d(C3053j stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.e(EnumC3045b.REFUSED_STREAM, null);
            }
        }

        /* renamed from: de.g$d$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public void c(C3050g connection, C3057n settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void d(C3053j c3053j);
    }

    /* renamed from: de.g$f */
    static final class f extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31991b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3877e f31992c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f31993d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f31994e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, C3877e c3877e, int i11, boolean z10) {
            super(0);
            this.f31991b = i10;
            this.f31992c = c3877e;
            this.f31993d = i11;
            this.f31994e = z10;
        }

        public final void a() {
            C3050g c3050g = C3050g.this;
            int i10 = this.f31991b;
            C3877e c3877e = this.f31992c;
            int i11 = this.f31993d;
            boolean z10 = this.f31994e;
            try {
                boolean c10 = c3050g.f31949l.c(i10, c3877e, i11, z10);
                if (c10) {
                    c3050g.z0().n(i10, EnumC3045b.CANCEL);
                }
                if (c10 || z10) {
                    synchronized (c3050g) {
                        c3050g.f31937B.remove(Integer.valueOf(i10));
                    }
                }
            } catch (IOException unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: de.g$g, reason: collision with other inner class name */
    static final class C0462g extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31996b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f31997c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f31998d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0462g(int i10, List list, boolean z10) {
            super(0);
            this.f31996b = i10;
            this.f31997c = list;
            this.f31998d = z10;
        }

        public final void a() {
            boolean b10 = C3050g.this.f31949l.b(this.f31996b, this.f31997c, this.f31998d);
            C3050g c3050g = C3050g.this;
            int i10 = this.f31996b;
            boolean z10 = this.f31998d;
            if (b10) {
                try {
                    c3050g.z0().n(i10, EnumC3045b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b10 || z10) {
                synchronized (c3050g) {
                    c3050g.f31937B.remove(Integer.valueOf(i10));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: de.g$h */
    static final class h extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32000b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f32001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, List list) {
            super(0);
            this.f32000b = i10;
            this.f32001c = list;
        }

        public final void a() {
            boolean a10 = C3050g.this.f31949l.a(this.f32000b, this.f32001c);
            C3050g c3050g = C3050g.this;
            int i10 = this.f32000b;
            if (a10) {
                try {
                    c3050g.z0().n(i10, EnumC3045b.CANCEL);
                    synchronized (c3050g) {
                        c3050g.f31937B.remove(Integer.valueOf(i10));
                    }
                } catch (IOException unused) {
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: de.g$i */
    static final class i extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32003b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC3045b f32004c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, EnumC3045b enumC3045b) {
            super(0);
            this.f32003b = i10;
            this.f32004c = enumC3045b;
        }

        public final void a() {
            C3050g.this.f31949l.d(this.f32003b, this.f32004c);
            C3050g c3050g = C3050g.this;
            int i10 = this.f32003b;
            synchronized (c3050g) {
                c3050g.f31937B.remove(Integer.valueOf(i10));
                Unit unit = Unit.f36324a;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: de.g$j */
    static final class j extends xc.m implements Function0 {
        j() {
            super(0);
        }

        public final void a() {
            C3050g.this.U1(false, 2, 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: de.g$k */
    static final class k extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC3045b f32008c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i10, EnumC3045b enumC3045b) {
            super(0);
            this.f32007b = i10;
            this.f32008c = enumC3045b;
        }

        public final void a() {
            try {
                C3050g.this.e2(this.f32007b, this.f32008c);
            } catch (IOException e10) {
                C3050g.this.y(e10);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: de.g$l */
    static final class l extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32010b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f32011c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i10, long j10) {
            super(0);
            this.f32010b = i10;
            this.f32011c = j10;
        }

        public final void a() {
            try {
                C3050g.this.z0().p(this.f32010b, this.f32011c);
            } catch (IOException e10) {
                C3050g.this.y(e10);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static {
        C3057n c3057n = new C3057n();
        c3057n.h(7, 65535);
        c3057n.h(5, 16384);
        f31935D = c3057n;
    }

    public C3050g(b builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean c10 = builder.c();
        this.f31938a = c10;
        this.f31939b = builder.f();
        this.f31940c = new LinkedHashMap();
        String d10 = builder.d();
        this.f31941d = d10;
        this.f31943f = builder.c() ? 3 : 2;
        Zd.d l10 = builder.l();
        this.f31945h = l10;
        Zd.c k10 = l10.k();
        this.f31946i = k10;
        this.f31947j = l10.k();
        this.f31948k = l10.k();
        this.f31949l = builder.h();
        this.f31956s = builder.e();
        C3057n c3057n = new C3057n();
        if (builder.c()) {
            c3057n.h(7, 16777216);
        }
        this.f31957t = c3057n;
        this.f31958u = f31935D;
        this.f31959v = new C3122a(0);
        this.f31961x = this.f31958u.c();
        this.f31962y = builder.j();
        this.f31963z = new C3054k(builder.i(), c10);
        this.f31936A = new e(this, new C3052i(builder.k(), c10));
        this.f31937B = new LinkedHashSet();
        if (builder.g() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.g());
            k10.l(d10 + " ping", nanos, new a(nanos));
        }
    }

    public static /* synthetic */ void A1(C3050g c3050g, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        c3050g.z1(z10);
    }

    private final C3053j O0(int i10, List list, boolean z10) {
        int i11;
        C3053j c3053j;
        boolean z11 = true;
        boolean z12 = !z10;
        synchronized (this.f31963z) {
            try {
                synchronized (this) {
                    try {
                        if (this.f31943f > 1073741823) {
                            y1(EnumC3045b.REFUSED_STREAM);
                        }
                        if (this.f31944g) {
                            throw new C3044a();
                        }
                        i11 = this.f31943f;
                        this.f31943f = i11 + 2;
                        c3053j = new C3053j(i11, this, z12, false, null);
                        if (z10 && this.f31960w < this.f31961x && c3053j.s() < c3053j.r()) {
                            z11 = false;
                        }
                        if (c3053j.v()) {
                            this.f31940c.put(Integer.valueOf(i11), c3053j);
                        }
                        Unit unit = Unit.f36324a;
                    } finally {
                    }
                }
                if (i10 == 0) {
                    this.f31963z.g(z12, i11, list);
                } else {
                    if (this.f31938a) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                    }
                    this.f31963z.l(i10, i11, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z11) {
            this.f31963z.flush();
        }
        return c3053j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(IOException iOException) {
        EnumC3045b enumC3045b = EnumC3045b.PROTOCOL_ERROR;
        x(enumC3045b, enumC3045b, iOException);
    }

    public final synchronized boolean A0(long j10) {
        if (this.f31944g) {
            return false;
        }
        if (this.f31953p < this.f31952o) {
            if (j10 >= this.f31955r) {
                return false;
            }
        }
        return true;
    }

    public final String C() {
        return this.f31941d;
    }

    public final InterfaceC3046c F() {
        return this.f31956s;
    }

    public final int H() {
        return this.f31942e;
    }

    public final d I() {
        return this.f31939b;
    }

    public final int K() {
        return this.f31943f;
    }

    public final synchronized void M1(long j10) {
        try {
            C3122a.c(this.f31959v, j10, 0L, 2, null);
            long a10 = this.f31959v.a();
            if (a10 >= this.f31957t.c() / 2) {
                g2(0, a10);
                C3122a.c(this.f31959v, 0L, a10, 1, null);
            }
            this.f31956s.b(this.f31959v);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C3057n N() {
        return this.f31957t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f31963z.i());
        r6 = r2;
        r8.f31960w += r6;
        r4 = kotlin.Unit.f36324a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1(int i10, boolean z10, C3877e c3877e, long j10) {
        int min;
        long j11;
        if (j10 == 0) {
            this.f31963z.c(z10, i10, c3877e, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j12 = this.f31960w;
                            long j13 = this.f31961x;
                            if (j12 < j13) {
                                break;
                            }
                            if (!this.f31940c.containsKey(Integer.valueOf(i10))) {
                                throw new IOException("stream closed");
                            }
                            Intrinsics.e(this, "null cannot be cast to non-null type java.lang.Object");
                            wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j10 -= j11;
            this.f31963z.c(z10 && j10 == 0, i10, c3877e, min);
        }
    }

    public final void O1(int i10, boolean z10, List alternating) {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.f31963z.g(z10, i10, alternating);
    }

    public final C3057n Q() {
        return this.f31958u;
    }

    public final void U1(boolean z10, int i10, int i11) {
        try {
            this.f31963z.j(z10, i10, i11);
        } catch (IOException e10) {
            y(e10);
        }
    }

    public final C3053j Z0(List requestHeaders, boolean z10) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return O0(0, requestHeaders, z10);
    }

    public final void a1(int i10, InterfaceC3879g source, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        C3877e c3877e = new C3877e();
        long j10 = i11;
        source.S1(j10);
        source.b2(c3877e, j10);
        Zd.c.d(this.f31947j, this.f31941d + '[' + i10 + "] onData", 0L, false, new f(i10, c3877e, i11, z10), 6, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        x(EnumC3045b.NO_ERROR, EnumC3045b.CANCEL, null);
    }

    public final void e2(int i10, EnumC3045b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.f31963z.n(i10, statusCode);
    }

    public final void f2(int i10, EnumC3045b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Zd.c.d(this.f31946i, this.f31941d + '[' + i10 + "] writeSynReset", 0L, false, new k(i10, errorCode), 6, null);
    }

    public final void flush() {
        this.f31963z.flush();
    }

    public final void g1(int i10, List requestHeaders, boolean z10) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Zd.c.d(this.f31947j, this.f31941d + '[' + i10 + "] onHeaders", 0L, false, new C0462g(i10, requestHeaders, z10), 6, null);
    }

    public final void g2(int i10, long j10) {
        Zd.c.d(this.f31946i, this.f31941d + '[' + i10 + "] windowUpdate", 0L, false, new l(i10, j10), 6, null);
    }

    public final synchronized C3053j i0(int i10) {
        return (C3053j) this.f31940c.get(Integer.valueOf(i10));
    }

    public final void i1(int i10, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f31937B.contains(Integer.valueOf(i10))) {
                f2(i10, EnumC3045b.PROTOCOL_ERROR);
                return;
            }
            this.f31937B.add(Integer.valueOf(i10));
            Zd.c.d(this.f31947j, this.f31941d + '[' + i10 + "] onRequest", 0L, false, new h(i10, requestHeaders), 6, null);
        }
    }

    public final void l1(int i10, EnumC3045b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Zd.c.d(this.f31947j, this.f31941d + '[' + i10 + "] onReset", 0L, false, new i(i10, errorCode), 6, null);
    }

    public final boolean m1(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final Map o0() {
        return this.f31940c;
    }

    public final synchronized C3053j o1(int i10) {
        C3053j c3053j;
        c3053j = (C3053j) this.f31940c.remove(Integer.valueOf(i10));
        Intrinsics.e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return c3053j;
    }

    public final void t1() {
        synchronized (this) {
            long j10 = this.f31953p;
            long j11 = this.f31952o;
            if (j10 < j11) {
                return;
            }
            this.f31952o = j11 + 1;
            this.f31955r = System.nanoTime() + 1000000000;
            Unit unit = Unit.f36324a;
            Zd.c.d(this.f31946i, this.f31941d + " ping", 0L, false, new j(), 6, null);
        }
    }

    public final void v1(int i10) {
        this.f31942e = i10;
    }

    public final void x(EnumC3045b connectionCode, EnumC3045b streamCode, IOException iOException) {
        int i10;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (p.f11601e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            y1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f31940c.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.f31940c.values().toArray(new C3053j[0]);
                    this.f31940c.clear();
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C3053j[] c3053jArr = (C3053j[]) objArr;
        if (c3053jArr != null) {
            for (C3053j c3053j : c3053jArr) {
                try {
                    c3053j.e(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f31963z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f31962y.close();
        } catch (IOException unused4) {
        }
        this.f31946i.q();
        this.f31947j.q();
        this.f31948k.q();
    }

    public final void x1(C3057n c3057n) {
        Intrinsics.checkNotNullParameter(c3057n, "<set-?>");
        this.f31958u = c3057n;
    }

    public final long y0() {
        return this.f31961x;
    }

    public final void y1(EnumC3045b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f31963z) {
            z zVar = new z();
            synchronized (this) {
                if (this.f31944g) {
                    return;
                }
                this.f31944g = true;
                int i10 = this.f31942e;
                zVar.f45000a = i10;
                Unit unit = Unit.f36324a;
                this.f31963z.f(i10, statusCode, Wd.m.f11589a);
            }
        }
    }

    public final boolean z() {
        return this.f31938a;
    }

    public final C3054k z0() {
        return this.f31963z;
    }

    public final void z1(boolean z10) {
        if (z10) {
            this.f31963z.b();
            this.f31963z.o(this.f31957t);
            if (this.f31957t.c() != 65535) {
                this.f31963z.p(0, r9 - 65535);
            }
        }
        Zd.c.d(this.f31945h.k(), this.f31941d, 0L, false, this.f31936A, 6, null);
    }

    /* renamed from: de.g$e */
    public final class e implements C3052i.c, Function0 {

        /* renamed from: a, reason: collision with root package name */
        private final C3052i f31978a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3050g f31979b;

        /* renamed from: de.g$e$a */
        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3050g f31980a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5141B f31981b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3050g c3050g, C5141B c5141b) {
                super(0);
                this.f31980a = c3050g;
                this.f31981b = c5141b;
            }

            public final void a() {
                this.f31980a.I().c(this.f31980a, (C3057n) this.f31981b.f44962a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f36324a;
            }
        }

        /* renamed from: de.g$e$b */
        static final class b extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3050g f31982a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3053j f31983b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C3050g c3050g, C3053j c3053j) {
                super(0);
                this.f31982a = c3050g;
                this.f31983b = c3053j;
            }

            public final void a() {
                try {
                    this.f31982a.I().d(this.f31983b);
                } catch (IOException e10) {
                    ge.n.f33789a.g().k("Http2Connection.Listener failure for " + this.f31982a.C(), 4, e10);
                    try {
                        this.f31983b.e(EnumC3045b.PROTOCOL_ERROR, e10);
                    } catch (IOException unused) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f36324a;
            }
        }

        /* renamed from: de.g$e$c */
        static final class c extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3050g f31984a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f31985b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f31986c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C3050g c3050g, int i10, int i11) {
                super(0);
                this.f31984a = c3050g;
                this.f31985b = i10;
                this.f31986c = i11;
            }

            public final void a() {
                this.f31984a.U1(true, this.f31985b, this.f31986c);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f36324a;
            }
        }

        /* renamed from: de.g$e$d */
        static final class d extends xc.m implements Function0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f31988b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3057n f31989c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(boolean z10, C3057n c3057n) {
                super(0);
                this.f31988b = z10;
                this.f31989c = c3057n;
            }

            public final void a() {
                e.this.o(this.f31988b, this.f31989c);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f36324a;
            }
        }

        public e(C3050g c3050g, C3052i reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f31979b = c3050g;
            this.f31978a = reader;
        }

        @Override // de.C3052i.c
        public void b(boolean z10, int i10, int i11, List headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f31979b.m1(i10)) {
                this.f31979b.g1(i10, headerBlock, z10);
                return;
            }
            C3050g c3050g = this.f31979b;
            synchronized (c3050g) {
                C3053j i02 = c3050g.i0(i10);
                if (i02 != null) {
                    Unit unit = Unit.f36324a;
                    i02.y(p.r(headerBlock), z10);
                    return;
                }
                if (c3050g.f31944g) {
                    return;
                }
                if (i10 <= c3050g.H()) {
                    return;
                }
                if (i10 % 2 == c3050g.K() % 2) {
                    return;
                }
                C3053j c3053j = new C3053j(i10, c3050g, false, z10, p.r(headerBlock));
                c3050g.v1(i10);
                c3050g.o0().put(Integer.valueOf(i10), c3053j);
                Zd.c.d(c3050g.f31945h.k(), c3050g.C() + '[' + i10 + "] onStream", 0L, false, new b(c3050g, c3053j), 6, null);
            }
        }

        @Override // de.C3052i.c
        public void c(boolean z10, int i10, InterfaceC3879g source, int i11) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f31979b.m1(i10)) {
                this.f31979b.a1(i10, source, i11, z10);
                return;
            }
            C3053j i02 = this.f31979b.i0(i10);
            if (i02 == null) {
                this.f31979b.f2(i10, EnumC3045b.PROTOCOL_ERROR);
                long j10 = i11;
                this.f31979b.M1(j10);
                source.skip(j10);
                return;
            }
            i02.x(source, i11);
            if (z10) {
                i02.y(p.f11597a, true);
            }
        }

        @Override // de.C3052i.c
        public void e(int i10, long j10) {
            if (i10 == 0) {
                C3050g c3050g = this.f31979b;
                synchronized (c3050g) {
                    c3050g.f31961x = c3050g.y0() + j10;
                    Intrinsics.e(c3050g, "null cannot be cast to non-null type java.lang.Object");
                    c3050g.notifyAll();
                    Unit unit = Unit.f36324a;
                }
                return;
            }
            C3053j i02 = this.f31979b.i0(i10);
            if (i02 != null) {
                synchronized (i02) {
                    i02.b(j10);
                    Unit unit2 = Unit.f36324a;
                }
            }
        }

        @Override // de.C3052i.c
        public void f(int i10, EnumC3045b errorCode, C3880h debugData) {
            int i11;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.L();
            C3050g c3050g = this.f31979b;
            synchronized (c3050g) {
                array = c3050g.o0().values().toArray(new C3053j[0]);
                c3050g.f31944g = true;
                Unit unit = Unit.f36324a;
            }
            for (C3053j c3053j : (C3053j[]) array) {
                if (c3053j.l() > i10 && c3053j.u()) {
                    c3053j.z(EnumC3045b.REFUSED_STREAM);
                    this.f31979b.o1(c3053j.l());
                }
            }
        }

        @Override // de.C3052i.c
        public void g(boolean z10, int i10, int i11) {
            if (!z10) {
                Zd.c.d(this.f31979b.f31946i, this.f31979b.C() + " ping", 0L, false, new c(this.f31979b, i10, i11), 6, null);
                return;
            }
            C3050g c3050g = this.f31979b;
            synchronized (c3050g) {
                try {
                    if (i10 == 1) {
                        c3050g.f31951n++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            c3050g.f31954q++;
                            Intrinsics.e(c3050g, "null cannot be cast to non-null type java.lang.Object");
                            c3050g.notifyAll();
                        }
                        Unit unit = Unit.f36324a;
                    } else {
                        c3050g.f31953p++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // de.C3052i.c
        public void i(int i10, EnumC3045b errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f31979b.m1(i10)) {
                this.f31979b.l1(i10, errorCode);
                return;
            }
            C3053j o12 = this.f31979b.o1(i10);
            if (o12 != null) {
                o12.z(errorCode);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            p();
            return Unit.f36324a;
        }

        @Override // de.C3052i.c
        public void j(boolean z10, C3057n settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Zd.c.d(this.f31979b.f31946i, this.f31979b.C() + " applyAndAckSettings", 0L, false, new d(z10, settings), 6, null);
        }

        @Override // de.C3052i.c
        public void k(int i10, int i11, List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f31979b.i1(i11, requestHeaders);
        }

        public final void o(boolean z10, C3057n c3057n) {
            long c10;
            int i10;
            C3053j[] c3053jArr;
            C3053j[] c3053jArr2;
            C3057n settings = c3057n;
            Intrinsics.checkNotNullParameter(settings, "settings");
            C5141B c5141b = new C5141B();
            C3054k z02 = this.f31979b.z0();
            C3050g c3050g = this.f31979b;
            synchronized (z02) {
                synchronized (c3050g) {
                    try {
                        C3057n Q10 = c3050g.Q();
                        if (!z10) {
                            C3057n c3057n2 = new C3057n();
                            c3057n2.g(Q10);
                            c3057n2.g(settings);
                            settings = c3057n2;
                        }
                        c5141b.f44962a = settings;
                        c10 = settings.c() - Q10.c();
                        if (c10 != 0 && !c3050g.o0().isEmpty()) {
                            c3053jArr = (C3053j[]) c3050g.o0().values().toArray(new C3053j[0]);
                            c3053jArr2 = c3053jArr;
                            c3050g.x1((C3057n) c5141b.f44962a);
                            Zd.c.d(c3050g.f31948k, c3050g.C() + " onSettings", 0L, false, new a(c3050g, c5141b), 6, null);
                            Unit unit = Unit.f36324a;
                        }
                        c3053jArr = null;
                        c3053jArr2 = c3053jArr;
                        c3050g.x1((C3057n) c5141b.f44962a);
                        Zd.c.d(c3050g.f31948k, c3050g.C() + " onSettings", 0L, false, new a(c3050g, c5141b), 6, null);
                        Unit unit2 = Unit.f36324a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    c3050g.z0().a((C3057n) c5141b.f44962a);
                } catch (IOException e10) {
                    c3050g.y(e10);
                }
                Unit unit3 = Unit.f36324a;
            }
            if (c3053jArr2 != null) {
                for (C3053j c3053j : c3053jArr2) {
                    synchronized (c3053j) {
                        c3053j.b(c10);
                        Unit unit4 = Unit.f36324a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [de.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [de.i, java.io.Closeable] */
        public void p() {
            EnumC3045b enumC3045b;
            EnumC3045b enumC3045b2 = EnumC3045b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f31978a.c(this);
                    while (this.f31978a.b(false, this)) {
                    }
                    EnumC3045b enumC3045b3 = EnumC3045b.NO_ERROR;
                    try {
                        this.f31979b.x(enumC3045b3, EnumC3045b.CANCEL, null);
                        enumC3045b = enumC3045b3;
                    } catch (IOException e11) {
                        e10 = e11;
                        EnumC3045b enumC3045b4 = EnumC3045b.PROTOCOL_ERROR;
                        C3050g c3050g = this.f31979b;
                        c3050g.x(enumC3045b4, enumC3045b4, e10);
                        enumC3045b = c3050g;
                        enumC3045b2 = this.f31978a;
                        Wd.m.f(enumC3045b2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f31979b.x(enumC3045b, enumC3045b2, e10);
                    Wd.m.f(this.f31978a);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                enumC3045b = enumC3045b2;
                this.f31979b.x(enumC3045b, enumC3045b2, e10);
                Wd.m.f(this.f31978a);
                throw th;
            }
            enumC3045b2 = this.f31978a;
            Wd.m.f(enumC3045b2);
        }

        @Override // de.C3052i.c
        public void a() {
        }

        @Override // de.C3052i.c
        public void h(int i10, int i11, int i12, boolean z10) {
        }
    }
}
