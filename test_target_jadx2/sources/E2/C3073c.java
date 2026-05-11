package e2;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: e2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3073c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f32173a;

    /* renamed from: b, reason: collision with root package name */
    private final Charset f32174b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f32175c;

    /* renamed from: d, reason: collision with root package name */
    private int f32176d;

    /* renamed from: e, reason: collision with root package name */
    private int f32177e;

    /* renamed from: e2.c$a */
    class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, C3073c.this.f32174b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public C3073c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() {
        InputStream inputStream = this.f32173a;
        byte[] bArr = this.f32175c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f32176d = 0;
        this.f32177e = read;
    }

    public boolean c() {
        return this.f32177e == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f32173a) {
            try {
                if (this.f32175c != null) {
                    this.f32175c = null;
                    this.f32173a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f32173a) {
            try {
                if (this.f32175c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f32176d >= this.f32177e) {
                    b();
                }
                for (int i12 = this.f32176d; i12 != this.f32177e; i12++) {
                    byte[] bArr2 = this.f32175c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f32176d;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.f32174b.name());
                                this.f32176d = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.f32174b.name());
                        this.f32176d = i12 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f32177e - this.f32176d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f32175c;
                    int i14 = this.f32176d;
                    aVar.write(bArr3, i14, this.f32177e - i14);
                    this.f32177e = -1;
                    b();
                    i10 = this.f32176d;
                    while (i10 != this.f32177e) {
                        bArr = this.f32175c;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f32176d;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f32176d = i10 + 1;
                return aVar.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C3073c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(d.f32179a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f32173a = inputStream;
        this.f32174b = charset;
        this.f32175c = new byte[i10];
    }
}
