package Ya;

import Ta.k;
import com.facebook.react.modules.network.j;
import expo.modules.image.records.ImageProgressEvent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f12167a;

    public b(WeakReference expoImageViewWrapper) {
        Intrinsics.checkNotNullParameter(expoImageViewWrapper, "expoImageViewWrapper");
        this.f12167a = expoImageViewWrapper;
    }

    @Override // com.facebook.react.modules.network.j
    public void a(long j10, long j11, boolean z10) {
        k kVar;
        Ib.b onProgress$expo_image_release;
        if (j11 <= 0 || z10 || (kVar = (k) this.f12167a.get()) == null || (onProgress$expo_image_release = kVar.getOnProgress$expo_image_release()) == null) {
            return;
        }
        onProgress$expo_image_release.invoke(new ImageProgressEvent((int) j10, (int) j11));
    }
}
