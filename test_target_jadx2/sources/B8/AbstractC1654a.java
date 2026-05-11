package b8;

import android.graphics.Bitmap;

/* renamed from: b8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1654a {
    public static Bitmap a(C1659f c1659f) {
        j d10 = c1659f.d();
        if (d10.zzb().b() != 1) {
            throw new IllegalArgumentException("Extracting Bitmap from an MlImage created by objects other than Bitmap is not supported");
        }
        android.support.v4.media.session.b.a(d10);
        throw null;
    }
}
