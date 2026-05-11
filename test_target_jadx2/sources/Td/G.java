package Td;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.InterfaceC3879g;

/* loaded from: classes3.dex */
public abstract class G implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f9918b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private Reader f9919a;

    public static final class a extends Reader {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3879g f9920a;

        /* renamed from: b, reason: collision with root package name */
        private final Charset f9921b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9922c;

        /* renamed from: d, reason: collision with root package name */
        private Reader f9923d;

        public a(InterfaceC3879g source, Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f9920a = source;
            this.f9921b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Unit unit;
            this.f9922c = true;
            Reader reader = this.f9923d;
            if (reader != null) {
                reader.close();
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f9920a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i10, int i11) {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f9922c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f9923d;
            if (reader == null) {
                reader = new InputStreamReader(this.f9920a.a2(), Wd.p.m(this.f9920a, this.f9921b));
                this.f9923d = reader;
            }
            return reader.read(cbuf, i10, i11);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ G f(b bVar, InterfaceC3879g interfaceC3879g, z zVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                zVar = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return bVar.d(interfaceC3879g, zVar, j10);
        }

        public static /* synthetic */ G g(b bVar, byte[] bArr, z zVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                zVar = null;
            }
            return bVar.e(bArr, zVar);
        }

        public final G a(z zVar, long j10, InterfaceC3879g content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return d(content, zVar, j10);
        }

        public final G b(z zVar, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return c(content, zVar);
        }

        public final G c(String str, z zVar) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Pair b10 = Wd.a.b(zVar);
            Charset charset = (Charset) b10.getFirst();
            z zVar2 = (z) b10.getSecond();
            C3877e f22 = new C3877e().f2(str, charset);
            return d(f22, zVar2, f22.size());
        }

        public final G d(InterfaceC3879g interfaceC3879g, z zVar, long j10) {
            Intrinsics.checkNotNullParameter(interfaceC3879g, "<this>");
            return Wd.k.a(interfaceC3879g, zVar, j10);
        }

        public final G e(byte[] bArr, z zVar) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return Wd.k.d(bArr, zVar);
        }

        private b() {
        }
    }

    private final Charset d() {
        return Wd.a.a(f());
    }

    public static final G g(z zVar, long j10, InterfaceC3879g interfaceC3879g) {
        return f9918b.a(zVar, j10, interfaceC3879g);
    }

    public static final G i(z zVar, String str) {
        return f9918b.b(zVar, str);
    }

    public final InputStream a() {
        return j().a2();
    }

    public final byte[] b() {
        return Wd.k.b(this);
    }

    public final Reader c() {
        Reader reader = this.f9919a;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(j(), d());
        this.f9919a = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Wd.k.c(this);
    }

    public abstract long e();

    public abstract z f();

    public abstract InterfaceC3879g j();

    public final String l() {
        InterfaceC3879g j10 = j();
        try {
            String Y02 = j10.Y0(Wd.p.m(j10, d()));
            kotlin.io.c.a(j10, null);
            return Y02;
        } finally {
        }
    }
}
