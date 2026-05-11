package e3;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f32194a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3074a f32195b;

    public l(InterfaceC3074a interfaceC3074a) {
        this(interfaceC3074a, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f32195b.get(this.f32194a);
        long j10 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f32194a);
                if (read == -1) {
                    return j10;
                }
                outputStream.write(bArr, 0, read);
                j10 += read;
            } finally {
                this.f32195b.a(bArr);
            }
        }
    }

    public l(InterfaceC3074a interfaceC3074a, int i10) {
        b3.l.b(Boolean.valueOf(i10 > 0));
        this.f32194a = i10;
        this.f32195b = interfaceC3074a;
    }
}
