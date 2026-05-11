package b8;

import android.media.Image;

/* renamed from: b8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1657d {
    public static Image a(C1659f c1659f) {
        j d10 = c1659f.d();
        if (d10.zzb().b() == 3) {
            return ((l) d10).b();
        }
        throw new IllegalArgumentException("Extract Media Image from an MlImage created by objects other than Media Image is not supported");
    }
}
