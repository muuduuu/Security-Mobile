package Q2;

import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.M;
import pe.Z;
import pe.c0;

/* loaded from: classes.dex */
public final class y implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final File f8134a;

    /* renamed from: b, reason: collision with root package name */
    private final a f8135b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8136c;

    /* renamed from: d, reason: collision with root package name */
    private long f8137d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8138e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8139f;

    /* renamed from: g, reason: collision with root package name */
    private Z f8140g;

    public interface a {
        void a(File file, IOException iOException);

        void b(File file, long j10);
    }

    public y(File file, a callback, long j10) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f8134a = file;
        this.f8135b = callback;
        this.f8136c = j10;
        Z z10 = null;
        if (file != null) {
            try {
                z10 = M.e(file);
            } catch (IOException e10) {
                a(new IOException("Failed to use file " + this.f8134a + " by Chucker", e10));
            }
        }
        this.f8140g = z10;
    }

    private final void a(IOException iOException) {
        if (this.f8138e) {
            return;
        }
        this.f8138e = true;
        b();
        this.f8135b.a(this.f8134a, iOException);
    }

    private final Unit b() {
        try {
            Z z10 = this.f8140g;
            if (z10 == null) {
                return null;
            }
            z10.close();
            return Unit.f36324a;
        } catch (IOException e10) {
            a(e10);
            return Unit.f36324a;
        }
    }

    @Override // pe.Z
    public c0 A() {
        Z z10 = this.f8140g;
        c0 A10 = z10 == null ? null : z10.A();
        if (A10 != null) {
            return A10;
        }
        c0 NONE = c0.f38662e;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        return NONE;
    }

    @Override // pe.Z
    public void N0(C3877e source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j11 = this.f8137d;
        this.f8137d = j11 + j10;
        if (this.f8138e) {
            return;
        }
        long j12 = this.f8136c;
        if (j11 >= j12) {
            return;
        }
        if (j11 + j10 > j12) {
            j10 = j12 - j11;
        }
        if (j10 == 0) {
            return;
        }
        try {
            Z z10 = this.f8140g;
            if (z10 == null) {
                return;
            }
            z10.N0(source, j10);
        } catch (IOException e10) {
            a(e10);
        }
    }

    @Override // pe.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f8139f) {
            return;
        }
        this.f8139f = true;
        b();
        this.f8135b.b(this.f8134a, this.f8137d);
    }

    @Override // pe.Z, java.io.Flushable
    public void flush() {
        if (this.f8138e) {
            return;
        }
        try {
            Z z10 = this.f8140g;
            if (z10 == null) {
                return;
            }
            z10.flush();
        } catch (IOException e10) {
            a(e10);
        }
    }
}
