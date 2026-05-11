package de;

import Wd.p;
import de.C3048e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.C3880h;
import pe.InterfaceC3879g;
import pe.b0;
import pe.c0;

/* renamed from: de.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3052i implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f32022e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f32023f;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3879g f32024a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32025b;

    /* renamed from: c, reason: collision with root package name */
    private final b f32026c;

    /* renamed from: d, reason: collision with root package name */
    private final C3048e.a f32027d;

    /* renamed from: de.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return C3052i.f32023f;
        }

        public final int b(int i10, int i11, int i12) {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        private a() {
        }
    }

    /* renamed from: de.i$c */
    public interface c {
        void a();

        void b(boolean z10, int i10, int i11, List list);

        void c(boolean z10, int i10, InterfaceC3879g interfaceC3879g, int i11);

        void e(int i10, long j10);

        void f(int i10, EnumC3045b enumC3045b, C3880h c3880h);

        void g(boolean z10, int i10, int i11);

        void h(int i10, int i11, int i12, boolean z10);

        void i(int i10, EnumC3045b enumC3045b);

        void j(boolean z10, C3057n c3057n);

        void k(int i10, int i11, List list);
    }

    static {
        Logger logger = Logger.getLogger(C3049f.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f32023f = logger;
    }

    public C3052i(InterfaceC3879g source, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f32024a = source;
        this.f32025b = z10;
        b bVar = new b(source);
        this.f32026c = bVar;
        this.f32027d = new C3048e.a(bVar, 4096, 0, 4, null);
    }

    private final void d(c cVar, int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int b10 = (i11 & 8) != 0 ? Wd.m.b(this.f32024a.readByte(), 255) : 0;
        cVar.c(z10, i12, this.f32024a, f32022e.b(i10, i11, b10));
        this.f32024a.skip(b10);
    }

    private final void e(c cVar, int i10, int i11, int i12) {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int readInt = this.f32024a.readInt();
        int readInt2 = this.f32024a.readInt();
        int i13 = i10 - 8;
        EnumC3045b a10 = EnumC3045b.Companion.a(readInt2);
        if (a10 == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        }
        C3880h c3880h = C3880h.f38684e;
        if (i13 > 0) {
            c3880h = this.f32024a.Y(i13);
        }
        cVar.f(readInt, a10, c3880h);
    }

    private final List f(int i10, int i11, int i12, int i13) {
        this.f32026c.d(i10);
        b bVar = this.f32026c;
        bVar.e(bVar.a());
        this.f32026c.f(i11);
        this.f32026c.c(i12);
        this.f32026c.g(i13);
        this.f32027d.k();
        return this.f32027d.e();
    }

    private final void g(c cVar, int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int b10 = (i11 & 8) != 0 ? Wd.m.b(this.f32024a.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            j(cVar, i12);
            i10 -= 5;
        }
        cVar.b(z10, i12, -1, f(f32022e.b(i10, i11, b10), b10, i11, i12));
    }

    private final void i(c cVar, int i10, int i11, int i12) {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.g((i11 & 1) != 0, this.f32024a.readInt(), this.f32024a.readInt());
    }

    private final void j(c cVar, int i10) {
        int readInt = this.f32024a.readInt();
        cVar.h(i10, readInt & Integer.MAX_VALUE, Wd.m.b(this.f32024a.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private final void l(c cVar, int i10, int i11, int i12) {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            j(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    private final void n(c cVar, int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int b10 = (i11 & 8) != 0 ? Wd.m.b(this.f32024a.readByte(), 255) : 0;
        cVar.k(i12, this.f32024a.readInt() & Integer.MAX_VALUE, f(f32022e.b(i10 - 4, i11, b10), b10, i11, i12));
    }

    private final void o(c cVar, int i10, int i11, int i12) {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int readInt = this.f32024a.readInt();
        EnumC3045b a10 = EnumC3045b.Companion.a(readInt);
        if (a10 != null) {
            cVar.i(i12, a10);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
    }

    private final void p(c cVar, int i10, int i11, int i12) {
        int readInt;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.a();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
        C3057n c3057n = new C3057n();
        kotlin.ranges.a n10 = kotlin.ranges.d.n(kotlin.ranges.d.p(0, i10), 6);
        int c10 = n10.c();
        int e10 = n10.e();
        int h10 = n10.h();
        if ((h10 > 0 && c10 <= e10) || (h10 < 0 && e10 <= c10)) {
            while (true) {
                int c11 = Wd.m.c(this.f32024a.readShort(), 65535);
                readInt = this.f32024a.readInt();
                if (c11 != 2) {
                    if (c11 == 3) {
                        c11 = 4;
                    } else if (c11 != 4) {
                        if (c11 == 5 && (readInt < 16384 || readInt > 16777215)) {
                            break;
                        }
                    } else {
                        if (readInt < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        c11 = 7;
                    }
                } else if (readInt != 0 && readInt != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                c3057n.h(c11, readInt);
                if (c10 == e10) {
                    break;
                } else {
                    c10 += h10;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
        }
        cVar.j(false, c3057n);
    }

    private final void q(c cVar, int i10, int i11, int i12) {
        try {
            if (i10 != 4) {
                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
            }
            long d10 = Wd.m.d(this.f32024a.readInt(), 2147483647L);
            if (d10 == 0) {
                throw new IOException("windowSizeIncrement was 0");
            }
            Logger logger = f32023f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C3049f.f31929a.d(true, i12, i10, d10));
            }
            cVar.e(i12, d10);
        } catch (Exception e10) {
            f32023f.fine(C3049f.f31929a.c(true, i12, i10, 8, i11));
            throw e10;
        }
    }

    public final boolean b(boolean z10, c handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.f32024a.S1(9L);
            int E10 = Wd.m.E(this.f32024a);
            if (E10 > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + E10);
            }
            int b10 = Wd.m.b(this.f32024a.readByte(), 255);
            int b11 = Wd.m.b(this.f32024a.readByte(), 255);
            int readInt = this.f32024a.readInt() & Integer.MAX_VALUE;
            if (b10 != 8) {
                Logger logger = f32023f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C3049f.f31929a.c(true, readInt, E10, b10, b11));
                }
            }
            if (z10 && b10 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + C3049f.f31929a.b(b10));
            }
            switch (b10) {
                case 0:
                    d(handler, E10, b11, readInt);
                    return true;
                case 1:
                    g(handler, E10, b11, readInt);
                    return true;
                case 2:
                    l(handler, E10, b11, readInt);
                    return true;
                case 3:
                    o(handler, E10, b11, readInt);
                    return true;
                case 4:
                    p(handler, E10, b11, readInt);
                    return true;
                case 5:
                    n(handler, E10, b11, readInt);
                    return true;
                case 6:
                    i(handler, E10, b11, readInt);
                    return true;
                case 7:
                    e(handler, E10, b11, readInt);
                    return true;
                case 8:
                    q(handler, E10, b11, readInt);
                    return true;
                default:
                    this.f32024a.skip(E10);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(c handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f32025b) {
            if (!b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC3879g interfaceC3879g = this.f32024a;
        C3880h c3880h = C3049f.f31930b;
        C3880h Y10 = interfaceC3879g.Y(c3880h.L());
        Logger logger = f32023f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(p.i("<< CONNECTION " + Y10.u(), new Object[0]));
        }
        if (Intrinsics.b(c3880h, Y10)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + Y10.R());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32024a.close();
    }

    /* renamed from: de.i$b */
    public static final class b implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3879g f32028a;

        /* renamed from: b, reason: collision with root package name */
        private int f32029b;

        /* renamed from: c, reason: collision with root package name */
        private int f32030c;

        /* renamed from: d, reason: collision with root package name */
        private int f32031d;

        /* renamed from: e, reason: collision with root package name */
        private int f32032e;

        /* renamed from: f, reason: collision with root package name */
        private int f32033f;

        public b(InterfaceC3879g source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f32028a = source;
        }

        private final void b() {
            int i10 = this.f32031d;
            int E10 = Wd.m.E(this.f32028a);
            this.f32032e = E10;
            this.f32029b = E10;
            int b10 = Wd.m.b(this.f32028a.readByte(), 255);
            this.f32030c = Wd.m.b(this.f32028a.readByte(), 255);
            a aVar = C3052i.f32022e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(C3049f.f31929a.c(true, this.f32031d, this.f32029b, b10, this.f32030c));
            }
            int readInt = this.f32028a.readInt() & Integer.MAX_VALUE;
            this.f32031d = readInt;
            if (b10 == 9) {
                if (readInt != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(b10 + " != TYPE_CONTINUATION");
            }
        }

        @Override // pe.b0
        public c0 A() {
            return this.f32028a.A();
        }

        public final int a() {
            return this.f32032e;
        }

        @Override // pe.b0
        public long b2(C3877e sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i10 = this.f32032e;
                if (i10 != 0) {
                    long b22 = this.f32028a.b2(sink, Math.min(j10, i10));
                    if (b22 == -1) {
                        return -1L;
                    }
                    this.f32032e -= (int) b22;
                    return b22;
                }
                this.f32028a.skip(this.f32033f);
                this.f32033f = 0;
                if ((this.f32030c & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        public final void c(int i10) {
            this.f32030c = i10;
        }

        public final void d(int i10) {
            this.f32032e = i10;
        }

        public final void e(int i10) {
            this.f32029b = i10;
        }

        public final void f(int i10) {
            this.f32033f = i10;
        }

        public final void g(int i10) {
            this.f32031d = i10;
        }

        @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
