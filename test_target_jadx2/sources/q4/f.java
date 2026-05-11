package q4;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f38758a = new f();

    private f() {
    }

    public static final int a(InputStream stream, int i10, boolean z10) {
        int i11;
        Intrinsics.checkNotNullParameter(stream, "stream");
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int read = stream.read();
            if (read == -1) {
                throw new IOException("no more bytes");
            }
            if (z10) {
                i11 = (read & 255) << (i13 * 8);
            } else {
                i12 <<= 8;
                i11 = read & 255;
            }
            i12 |= i11;
        }
        return i12;
    }
}
