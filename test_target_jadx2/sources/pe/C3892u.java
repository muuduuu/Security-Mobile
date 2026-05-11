package pe;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3892u extends AbstractC3882j {

    /* renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f38730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3892u(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f38730e = randomAccessFile;
    }

    @Override // pe.AbstractC3882j
    protected synchronized void f() {
        this.f38730e.close();
    }

    @Override // pe.AbstractC3882j
    protected synchronized int g(long j10, byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f38730e.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int read = this.f38730e.read(array, i10, i11 - i12);
            if (read != -1) {
                i12 += read;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // pe.AbstractC3882j
    protected synchronized long i() {
        return this.f38730e.length();
    }
}
