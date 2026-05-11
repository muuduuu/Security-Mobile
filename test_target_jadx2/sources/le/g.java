package le;

import Wd.m;
import Wd.p;
import com.appsflyer.attribution.RequestError;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import pe.C3877e;
import pe.C3880h;
import pe.InterfaceC3879g;

/* loaded from: classes3.dex */
public final class g implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37221a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3879g f37222b;

    /* renamed from: c, reason: collision with root package name */
    private final a f37223c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37224d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f37225e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f37226f;

    /* renamed from: g, reason: collision with root package name */
    private int f37227g;

    /* renamed from: h, reason: collision with root package name */
    private long f37228h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f37229i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f37230j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f37231k;

    /* renamed from: l, reason: collision with root package name */
    private final C3877e f37232l;

    /* renamed from: m, reason: collision with root package name */
    private final C3877e f37233m;

    /* renamed from: n, reason: collision with root package name */
    private c f37234n;

    /* renamed from: o, reason: collision with root package name */
    private final byte[] f37235o;

    /* renamed from: p, reason: collision with root package name */
    private final C3877e.a f37236p;

    public interface a {
        void c(C3880h c3880h);

        void d(String str);

        void e(C3880h c3880h);

        void g(int i10, String str);

        void h(C3880h c3880h);
    }

    public g(boolean z10, InterfaceC3879g source, a frameCallback, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f37221a = z10;
        this.f37222b = source;
        this.f37223c = frameCallback;
        this.f37224d = z11;
        this.f37225e = z12;
        this.f37232l = new C3877e();
        this.f37233m = new C3877e();
        this.f37235o = z10 ? null : new byte[4];
        this.f37236p = z10 ? null : new C3877e.a();
    }

    private final void b() {
        short s10;
        String str;
        long j10 = this.f37228h;
        if (j10 > 0) {
            this.f37222b.R0(this.f37232l, j10);
            if (!this.f37221a) {
                C3877e c3877e = this.f37232l;
                C3877e.a aVar = this.f37236p;
                Intrinsics.d(aVar);
                c3877e.C(aVar);
                this.f37236p.d(0L);
                f fVar = f.f37220a;
                C3877e.a aVar2 = this.f37236p;
                byte[] bArr = this.f37235o;
                Intrinsics.d(bArr);
                fVar.b(aVar2, bArr);
                this.f37236p.close();
            }
        }
        switch (this.f37227g) {
            case 8:
                long size = this.f37232l.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s10 = this.f37232l.readShort();
                    str = this.f37232l.F1();
                    String a10 = f.f37220a.a(s10);
                    if (a10 != null) {
                        throw new ProtocolException(a10);
                    }
                } else {
                    s10 = 1005;
                    str = BuildConfig.FLAVOR;
                }
                this.f37223c.g(s10, str);
                this.f37226f = true;
                return;
            case 9:
                this.f37223c.e(this.f37232l.K());
                return;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                this.f37223c.h(this.f37232l.K());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + p.s(this.f37227g));
        }
    }

    private final void c() {
        boolean z10;
        if (this.f37226f) {
            throw new IOException("closed");
        }
        long h10 = this.f37222b.A().h();
        this.f37222b.A().b();
        try {
            int b10 = m.b(this.f37222b.readByte(), 255);
            this.f37222b.A().g(h10, TimeUnit.NANOSECONDS);
            int i10 = b10 & 15;
            this.f37227g = i10;
            boolean z11 = (b10 & 128) != 0;
            this.f37229i = z11;
            boolean z12 = (b10 & 8) != 0;
            this.f37230j = z12;
            if (z12 && !z11) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z13 = (b10 & 64) != 0;
            if (i10 == 1 || i10 == 2) {
                if (!z13) {
                    z10 = false;
                } else {
                    if (!this.f37224d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z10 = true;
                }
                this.f37231k = z10;
            } else if (z13) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b10 & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b10 & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int b11 = m.b(this.f37222b.readByte(), 255);
            boolean z14 = (b11 & 128) != 0;
            if (z14 == this.f37221a) {
                throw new ProtocolException(this.f37221a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j10 = b11 & 127;
            this.f37228h = j10;
            if (j10 == 126) {
                this.f37228h = m.c(this.f37222b.readShort(), 65535);
            } else if (j10 == 127) {
                long readLong = this.f37222b.readLong();
                this.f37228h = readLong;
                if (readLong < 0) {
                    throw new ProtocolException("Frame length 0x" + p.t(this.f37228h) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f37230j && this.f37228h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z14) {
                InterfaceC3879g interfaceC3879g = this.f37222b;
                byte[] bArr = this.f37235o;
                Intrinsics.d(bArr);
                interfaceC3879g.readFully(bArr);
            }
        } catch (Throwable th) {
            this.f37222b.A().g(h10, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void d() {
        while (!this.f37226f) {
            long j10 = this.f37228h;
            if (j10 > 0) {
                this.f37222b.R0(this.f37233m, j10);
                if (!this.f37221a) {
                    C3877e c3877e = this.f37233m;
                    C3877e.a aVar = this.f37236p;
                    Intrinsics.d(aVar);
                    c3877e.C(aVar);
                    this.f37236p.d(this.f37233m.size() - this.f37228h);
                    f fVar = f.f37220a;
                    C3877e.a aVar2 = this.f37236p;
                    byte[] bArr = this.f37235o;
                    Intrinsics.d(bArr);
                    fVar.b(aVar2, bArr);
                    this.f37236p.close();
                }
            }
            if (this.f37229i) {
                return;
            }
            f();
            if (this.f37227g != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + p.s(this.f37227g));
            }
        }
        throw new IOException("closed");
    }

    private final void e() {
        int i10 = this.f37227g;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Unknown opcode: " + p.s(i10));
        }
        d();
        if (this.f37231k) {
            c cVar = this.f37234n;
            if (cVar == null) {
                cVar = new c(this.f37225e);
                this.f37234n = cVar;
            }
            cVar.a(this.f37233m);
        }
        if (i10 == 1) {
            this.f37223c.d(this.f37233m.F1());
        } else {
            this.f37223c.c(this.f37233m.K());
        }
    }

    private final void f() {
        while (!this.f37226f) {
            c();
            if (!this.f37230j) {
                return;
            } else {
                b();
            }
        }
    }

    public final void a() {
        c();
        if (this.f37230j) {
            b();
        } else {
            e();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c cVar = this.f37234n;
        if (cVar != null) {
            cVar.close();
        }
    }
}
