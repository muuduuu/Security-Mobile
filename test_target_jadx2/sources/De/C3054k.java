package de;

import Wd.p;
import de.C3048e;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.InterfaceC3878f;

/* renamed from: de.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3054k implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final a f32061g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Logger f32062h = Logger.getLogger(C3049f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3878f f32063a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32064b;

    /* renamed from: c, reason: collision with root package name */
    private final C3877e f32065c;

    /* renamed from: d, reason: collision with root package name */
    private int f32066d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32067e;

    /* renamed from: f, reason: collision with root package name */
    private final C3048e.b f32068f;

    /* renamed from: de.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3054k(InterfaceC3878f sink, boolean z10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f32063a = sink;
        this.f32064b = z10;
        C3877e c3877e = new C3877e();
        this.f32065c = c3877e;
        this.f32066d = 16384;
        this.f32068f = new C3048e.b(0, false, c3877e, 3, null);
    }

    private final void q(int i10, long j10) {
        while (j10 > 0) {
            long min = Math.min(this.f32066d, j10);
            j10 -= min;
            e(i10, (int) min, 9, j10 == 0 ? 4 : 0);
            this.f32063a.N0(this.f32065c, min);
        }
    }

    public final synchronized void a(C3057n peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f32067e) {
                throw new IOException("closed");
            }
            this.f32066d = peerSettings.e(this.f32066d);
            if (peerSettings.b() != -1) {
                this.f32068f.e(peerSettings.b());
            }
            e(0, 0, 4, 1);
            this.f32063a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f32067e) {
                throw new IOException("closed");
            }
            if (this.f32064b) {
                Logger logger = f32062h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(p.i(">> CONNECTION " + C3049f.f31930b.u(), new Object[0]));
                }
                this.f32063a.Q1(C3049f.f31930b);
                this.f32063a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z10, int i10, C3877e c3877e, int i11) {
        if (this.f32067e) {
            throw new IOException("closed");
        }
        d(i10, z10 ? 1 : 0, c3877e, i11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f32067e = true;
        this.f32063a.close();
    }

    public final void d(int i10, int i11, C3877e c3877e, int i12) {
        e(i10, i12, 0, i11);
        if (i12 > 0) {
            InterfaceC3878f interfaceC3878f = this.f32063a;
            Intrinsics.d(c3877e);
            interfaceC3878f.N0(c3877e, i12);
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        if (i12 != 8) {
            Logger logger = f32062h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C3049f.f31929a.c(false, i10, i11, i12, i13));
            }
        }
        if (i11 > this.f32066d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f32066d + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i10).toString());
        }
        Wd.m.L(this.f32063a, i11);
        this.f32063a.q0(i12 & 255);
        this.f32063a.q0(i13 & 255);
        this.f32063a.l0(i10 & Integer.MAX_VALUE);
    }

    public final synchronized void f(int i10, EnumC3045b errorCode, byte[] debugData) {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            if (this.f32067e) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            e(0, debugData.length + 8, 7, 0);
            this.f32063a.l0(i10);
            this.f32063a.l0(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.f32063a.G1(debugData);
            }
            this.f32063a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (this.f32067e) {
            throw new IOException("closed");
        }
        this.f32063a.flush();
    }

    public final synchronized void g(boolean z10, int i10, List headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f32067e) {
            throw new IOException("closed");
        }
        this.f32068f.g(headerBlock);
        long size = this.f32065c.size();
        long min = Math.min(this.f32066d, size);
        int i11 = size == min ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        e(i10, (int) min, 1, i11);
        this.f32063a.N0(this.f32065c, min);
        if (size > min) {
            q(i10, size - min);
        }
    }

    public final int i() {
        return this.f32066d;
    }

    public final synchronized void j(boolean z10, int i10, int i11) {
        if (this.f32067e) {
            throw new IOException("closed");
        }
        e(0, 8, 6, z10 ? 1 : 0);
        this.f32063a.l0(i10);
        this.f32063a.l0(i11);
        this.f32063a.flush();
    }

    public final synchronized void l(int i10, int i11, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.f32067e) {
            throw new IOException("closed");
        }
        this.f32068f.g(requestHeaders);
        long size = this.f32065c.size();
        int min = (int) Math.min(this.f32066d - 4, size);
        long j10 = min;
        e(i10, min + 4, 5, size == j10 ? 4 : 0);
        this.f32063a.l0(i11 & Integer.MAX_VALUE);
        this.f32063a.N0(this.f32065c, j10);
        if (size > j10) {
            q(i10, size - j10);
        }
    }

    public final synchronized void n(int i10, EnumC3045b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f32067e) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        e(i10, 4, 3, 0);
        this.f32063a.l0(errorCode.getHttpCode());
        this.f32063a.flush();
    }

    public final synchronized void o(C3057n settings) {
        try {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (this.f32067e) {
                throw new IOException("closed");
            }
            int i10 = 0;
            e(0, settings.i() * 6, 4, 0);
            while (i10 < 10) {
                if (settings.f(i10)) {
                    this.f32063a.f0(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.f32063a.l0(settings.a(i10));
                }
                i10++;
            }
            this.f32063a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void p(int i10, long j10) {
        try {
            if (this.f32067e) {
                throw new IOException("closed");
            }
            if (j10 == 0 || j10 > 2147483647L) {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
            }
            Logger logger = f32062h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C3049f.f31929a.d(false, i10, 4, j10));
            }
            e(i10, 4, 8, 0);
            this.f32063a.l0((int) j10);
            this.f32063a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }
}
