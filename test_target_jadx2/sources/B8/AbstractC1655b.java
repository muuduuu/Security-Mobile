package b8;

import java.nio.ByteBuffer;

/* renamed from: b8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1655b {
    public static ByteBuffer a(C1659f c1659f) {
        j d10 = c1659f.d();
        if (d10.zzb().b() != 2) {
            throw new IllegalArgumentException("Extract ByteBuffer from an MlImage created by objects other than Bytebuffer is not supported");
        }
        android.support.v4.media.session.b.a(d10);
        throw null;
    }
}
