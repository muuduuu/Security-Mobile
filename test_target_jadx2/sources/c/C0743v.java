package C;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

/* renamed from: C.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0743v implements M.y {
    @Override // M.y
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap apply(M.z zVar) {
        androidx.camera.core.q qVar;
        Bitmap k10;
        androidx.camera.core.q qVar2 = null;
        try {
            try {
                if (zVar.e() == 35) {
                    androidx.camera.core.n nVar = (androidx.camera.core.n) zVar.c();
                    boolean z10 = zVar.f() % 180 != 0;
                    qVar = new androidx.camera.core.q(androidx.camera.core.o.a(z10 ? nVar.getHeight() : nVar.getWidth(), z10 ? nVar.getWidth() : nVar.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.n g10 = ImageProcessingUtil.g(nVar, qVar, ByteBuffer.allocateDirect(nVar.getWidth() * nVar.getHeight() * 4), zVar.f(), false);
                        nVar.close();
                        if (g10 == null) {
                            throw new A.X(0, "Can't covert YUV to RGB", null);
                        }
                        k10 = L.b.b(g10);
                        g10.close();
                    } catch (UnsupportedOperationException e10) {
                        e = e10;
                        throw new A.X(0, "Can't convert " + (zVar.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th) {
                        th = th;
                        qVar2 = qVar;
                        if (qVar2 != null) {
                            qVar2.close();
                        }
                        throw th;
                    }
                } else {
                    if (zVar.e() != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + zVar.e());
                    }
                    androidx.camera.core.n nVar2 = (androidx.camera.core.n) zVar.c();
                    Bitmap b10 = L.b.b(nVar2);
                    nVar2.close();
                    qVar = null;
                    k10 = L.b.k(b10, zVar.f());
                }
                if (qVar != null) {
                    qVar.close();
                }
                return k10;
            } catch (UnsupportedOperationException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
