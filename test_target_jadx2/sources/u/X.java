package u;

import A.AbstractC0700h0;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import u.V;

/* loaded from: classes.dex */
abstract class X implements V.a {

    /* renamed from: a, reason: collision with root package name */
    final StreamConfigurationMap f43421a;

    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    X(StreamConfigurationMap streamConfigurationMap) {
        this.f43421a = streamConfigurationMap;
    }

    @Override // u.V.a
    public StreamConfigurationMap a() {
        return this.f43421a;
    }

    @Override // u.V.a
    public Size[] b(int i10) {
        return a.a(this.f43421a, i10);
    }

    @Override // u.V.a
    public int[] d() {
        try {
            return this.f43421a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e10) {
            AbstractC0700h0.m("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e10);
            return null;
        }
    }
}
