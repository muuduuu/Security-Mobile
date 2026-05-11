package u;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* loaded from: classes.dex */
class W extends X {
    W(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // u.V.a
    public Size[] c(int i10) {
        return this.f43421a.getOutputSizes(i10);
    }
}
