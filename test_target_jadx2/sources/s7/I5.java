package s7;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public abstract class I5 {
    public static void a(C4492x5 c4492x5, int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        c4492x5.c(c(i10, i11, j10, i12, i13, i14, i15), F3.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void b(C4492x5 c4492x5, int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        c4492x5.c(c(i10, i11, j10, i12, i13, i14, i15), F3.ODML_IMAGE);
    }

    private static H5 c(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        return new H5(i10, i11, i14, i12, i13, SystemClock.elapsedRealtime() - j10, i15);
    }
}
