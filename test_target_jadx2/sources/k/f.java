package K;

import A.r0;
import android.media.MediaCodec;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.V0;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5078a;

    public f() {
        this.f5078a = androidx.camera.core.internal.compat.quirk.a.b(SurfaceOrderQuirk.class) != null;
    }

    private int b(AbstractC1429c0 abstractC1429c0) {
        if (abstractC1429c0.g() == MediaCodec.class) {
            return 2;
        }
        return abstractC1429c0.g() == r0.class ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int c(V0.f fVar, V0.f fVar2) {
        return b(fVar.f()) - b(fVar2.f());
    }

    public void d(List list) {
        if (this.f5078a) {
            Collections.sort(list, new Comparator() { // from class: K.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int c10;
                    c10 = f.this.c((V0.f) obj, (V0.f) obj2);
                    return c10;
                }
            });
        }
    }
}
