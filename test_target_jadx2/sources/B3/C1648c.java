package b3;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1648c extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f18542a;

    public C1648c(OutputStream outputStream) {
        super(outputStream);
        this.f18542a = 0L;
    }

    public long a() {
        return this.f18542a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        this.f18542a += i11;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        ((FilterOutputStream) this).out.write(i10);
        this.f18542a++;
    }
}
