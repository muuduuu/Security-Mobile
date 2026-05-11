package io.sentry;

import io.sentry.C3471y1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: io.sentry.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3471y1 {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f35652d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final C3474z1 f35653a;

    /* renamed from: b, reason: collision with root package name */
    private final Callable f35654b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f35655c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.y1$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f35656a;

        /* renamed from: b, reason: collision with root package name */
        private final Callable f35657b;

        public a(Callable callable) {
            this.f35657b = callable;
        }

        private static byte[] b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] a() {
            Callable callable;
            if (this.f35656a == null && (callable = this.f35657b) != null) {
                this.f35656a = (byte[]) callable.call();
            }
            return b(this.f35656a);
        }
    }

    C3471y1(C3474z1 c3474z1, byte[] bArr) {
        this.f35653a = (C3474z1) io.sentry.util.n.c(c3474z1, "SentryEnvelopeItemHeader is required.");
        this.f35655c = bArr;
        this.f35654b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] B(Q q10, io.sentry.clientreport.b bVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f35652d));
            try {
                q10.a(bVar, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer C(a aVar) {
        return Integer.valueOf(aVar.a().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] E(Q q10, AbstractC3370a1 abstractC3370a1) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f35652d));
            try {
                q10.a(abstractC3370a1, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer F(a aVar) {
        return Integer.valueOf(aVar.a().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] H(File file, long j10, I0 i02, Q q10) {
        if (!file.exists()) {
            throw new io.sentry.exception.b(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String c10 = io.sentry.vendor.a.c(N(file.getPath(), j10), 3);
        if (c10.isEmpty()) {
            throw new io.sentry.exception.b("Profiling trace file is empty");
        }
        i02.G(c10);
        i02.F();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f35652d));
                    try {
                        q10.a(i02, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                file.delete();
            }
        } catch (IOException e10) {
            throw new io.sentry.exception.b(String.format("Failed to serialize profiling trace data\n%s", e10.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer I(a aVar) {
        return Integer.valueOf(aVar.a().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] K(Q q10, Z1 z12) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f35652d));
            try {
                q10.a(z12, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer L(a aVar) {
        return Integer.valueOf(aVar.a().length);
    }

    private static byte[] N(String str, long j10) {
        try {
            File file = new File(str);
            if (!file.isFile()) {
                throw new io.sentry.exception.b(String.format("Reading the item %s failed, because the file located at the path is not a file.", str));
            }
            if (!file.canRead()) {
                throw new io.sentry.exception.b(String.format("Reading the item %s failed, because can't read the file.", str));
            }
            if (file.length() > j10) {
                throw new io.sentry.exception.b(String.format("Dropping item, because its size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j10)));
            }
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read == -1) {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                bufferedInputStream.close();
                                fileInputStream.close();
                                return byteArray;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | SecurityException e10) {
            throw new io.sentry.exception.b(String.format("Reading the item %s failed.\n%s", str, e10.getMessage()));
        }
    }

    private static void p(long j10, long j11, String str) {
        if (j10 > j11) {
            throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static C3471y1 q(final Q q10, final ILogger iLogger, final C3396b c3396b, final long j10) {
        final a aVar = new a(new Callable() { // from class: io.sentry.u1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] y10;
                y10 = C3471y1.y(C3396b.this, j10, q10, iLogger);
                return y10;
            }
        });
        return new C3471y1(new C3474z1(J1.Attachment, new Callable() { // from class: io.sentry.v1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer z10;
                z10 = C3471y1.z(C3471y1.a.this);
                return z10;
            }
        }, c3396b.f(), c3396b.g(), c3396b.d()), new Callable() { // from class: io.sentry.w1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C3471y1.a.this.a();
                return a10;
            }
        });
    }

    public static C3471y1 r(final Q q10, final io.sentry.clientreport.b bVar) {
        io.sentry.util.n.c(q10, "ISerializer is required.");
        io.sentry.util.n.c(bVar, "ClientReport is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.r1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] B10;
                B10 = C3471y1.B(Q.this, bVar);
                return B10;
            }
        });
        return new C3471y1(new C3474z1(J1.resolve(bVar), new Callable() { // from class: io.sentry.s1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer C10;
                C10 = C3471y1.C(C3471y1.a.this);
                return C10;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.t1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C3471y1.a.this.a();
                return a10;
            }
        });
    }

    public static C3471y1 s(final Q q10, final AbstractC3370a1 abstractC3370a1) {
        io.sentry.util.n.c(q10, "ISerializer is required.");
        io.sentry.util.n.c(abstractC3370a1, "SentryEvent is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.m1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] E10;
                E10 = C3471y1.E(Q.this, abstractC3370a1);
                return E10;
            }
        });
        return new C3471y1(new C3474z1(J1.resolve(abstractC3370a1), new Callable() { // from class: io.sentry.n1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer F10;
                F10 = C3471y1.F(C3471y1.a.this);
                return F10;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.o1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C3471y1.a.this.a();
                return a10;
            }
        });
    }

    public static C3471y1 t(final I0 i02, final long j10, final Q q10) {
        final File B10 = i02.B();
        final a aVar = new a(new Callable() { // from class: io.sentry.x1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] H10;
                H10 = C3471y1.H(B10, j10, i02, q10);
                return H10;
            }
        });
        return new C3471y1(new C3474z1(J1.Profile, new Callable() { // from class: io.sentry.k1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer I10;
                I10 = C3471y1.I(C3471y1.a.this);
                return I10;
            }
        }, "application-json", B10.getName()), new Callable() { // from class: io.sentry.l1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C3471y1.a.this.a();
                return a10;
            }
        });
    }

    public static C3471y1 u(final Q q10, final Z1 z12) {
        io.sentry.util.n.c(q10, "ISerializer is required.");
        io.sentry.util.n.c(z12, "Session is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.j1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] K10;
                K10 = C3471y1.K(Q.this, z12);
                return K10;
            }
        });
        return new C3471y1(new C3474z1(J1.Session, new Callable() { // from class: io.sentry.p1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer L10;
                L10 = C3471y1.L(C3471y1.a.this);
                return L10;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.q1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C3471y1.a.this.a();
                return a10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] y(C3396b c3396b, long j10, Q q10, ILogger iLogger) {
        if (c3396b.e() != null) {
            byte[] e10 = c3396b.e();
            p(e10.length, j10, c3396b.g());
            return e10;
        }
        if (c3396b.i() != null) {
            byte[] b10 = io.sentry.util.k.b(q10, iLogger, c3396b.i());
            if (b10 != null) {
                p(b10.length, j10, c3396b.g());
                return b10;
            }
        } else if (c3396b.h() != null) {
            return N(c3396b.h(), j10);
        }
        throw new io.sentry.exception.b(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable or a path is set.", c3396b.g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer z(a aVar) {
        return Integer.valueOf(aVar.a().length);
    }

    public io.sentry.clientreport.b v(Q q10) {
        C3474z1 c3474z1 = this.f35653a;
        if (c3474z1 == null || c3474z1.b() != J1.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(w()), f35652d));
        try {
            io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) q10.c(bufferedReader, io.sentry.clientreport.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public byte[] w() {
        Callable callable;
        if (this.f35655c == null && (callable = this.f35654b) != null) {
            this.f35655c = (byte[]) callable.call();
        }
        return this.f35655c;
    }

    public C3474z1 x() {
        return this.f35653a;
    }

    C3471y1(C3474z1 c3474z1, Callable callable) {
        this.f35653a = (C3474z1) io.sentry.util.n.c(c3474z1, "SentryEnvelopeItemHeader is required.");
        this.f35654b = (Callable) io.sentry.util.n.c(callable, "DataFactory is required.");
        this.f35655c = null;
    }
}
