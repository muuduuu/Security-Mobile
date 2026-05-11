package C;

import androidx.camera.core.ImageProcessingUtil;
import java.util.Objects;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public class B implements M.y {
    @Override // M.y
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public M.z apply(M.z zVar) {
        androidx.camera.core.q qVar = new androidx.camera.core.q(androidx.camera.core.o.a(zVar.h().getWidth(), zVar.h().getHeight(), PSKKeyManager.MAX_KEY_LENGTH_BYTES, 2));
        androidx.camera.core.n e10 = ImageProcessingUtil.e(qVar, (byte[]) zVar.c());
        qVar.m();
        Objects.requireNonNull(e10);
        E.g d10 = zVar.d();
        Objects.requireNonNull(d10);
        return M.z.k(e10, d10, zVar.b(), zVar.f(), zVar.g(), zVar.a());
    }
}
