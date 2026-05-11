package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.p;

/* loaded from: classes3.dex */
public abstract class a implements p {

    /* renamed from: a, reason: collision with root package name */
    protected int f36461a = 0;

    v e() {
        return new v(this);
    }

    public void f(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        f I10 = f.I(outputStream, f.t(f.u(serializedSize) + serializedSize));
        I10.n0(serializedSize);
        d(I10);
        I10.H();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0531a implements p.a {
        protected static v h(p pVar) {
            return new v(pVar);
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a, reason: collision with other inner class name */
        static final class C0532a extends FilterInputStream {

            /* renamed from: a, reason: collision with root package name */
            private int f36462a;

            C0532a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f36462a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f36462a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                if (this.f36462a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f36462a--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) {
                long skip = super.skip(Math.min(j10, this.f36462a));
                if (skip >= 0) {
                    this.f36462a = (int) (this.f36462a - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) {
                int i12 = this.f36462a;
                if (i12 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i10, Math.min(i11, i12));
                if (read >= 0) {
                    this.f36462a -= read;
                }
                return read;
            }
        }
    }
}
