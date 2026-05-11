package K;

import androidx.camera.core.impl.P0;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.n;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final IncorrectJpegMetadataQuirk f5076a;

    public d(P0 p02) {
        this.f5076a = (IncorrectJpegMetadataQuirk) p02.b(IncorrectJpegMetadataQuirk.class);
    }

    public byte[] a(n nVar) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f5076a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.i(nVar);
        }
        ByteBuffer m10 = nVar.S()[0].m();
        byte[] bArr = new byte[m10.capacity()];
        m10.rewind();
        m10.get(bArr);
        return bArr;
    }
}
