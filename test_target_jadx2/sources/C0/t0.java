package c0;

import A.AbstractC0700h0;
import android.media.MediaCodecInfo;
import android.util.Range;
import d0.AbstractC2970a;
import java.util.Objects;
import o.InterfaceC3735a;

/* loaded from: classes.dex */
public class t0 extends g0 implements r0 {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC3735a f19273d = new InterfaceC3735a() { // from class: c0.s0
        @Override // o.InterfaceC3735a
        public final Object apply(Object obj) {
            r0 m10;
            m10 = t0.m((p0) obj);
            return m10;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final MediaCodecInfo.VideoCapabilities f19274c;

    t0(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f19242b.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f19274c = videoCapabilities;
    }

    public static t0 l(p0 p0Var) {
        return new t0(AbstractC2970a.c(p0Var), p0Var.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r0 m(p0 p0Var) {
        try {
            return e0.e.l(l(p0Var), null);
        } catch (k0 e10) {
            AbstractC0700h0.m("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e10);
            return null;
        }
    }

    private static IllegalArgumentException n(Throwable th) {
        return th instanceof IllegalArgumentException ? (IllegalArgumentException) th : new IllegalArgumentException(th);
    }

    @Override // c0.r0
    public int b() {
        return this.f19274c.getWidthAlignment();
    }

    @Override // c0.r0
    public Range c() {
        return this.f19274c.getBitrateRange();
    }

    @Override // c0.r0
    public boolean d() {
        return true;
    }

    @Override // c0.r0
    public Range e(int i10) {
        try {
            return this.f19274c.getSupportedWidthsFor(i10);
        } catch (Throwable th) {
            throw n(th);
        }
    }

    @Override // c0.r0
    public Range f(int i10) {
        try {
            return this.f19274c.getSupportedHeightsFor(i10);
        } catch (Throwable th) {
            throw n(th);
        }
    }

    @Override // c0.r0
    public int g() {
        return this.f19274c.getHeightAlignment();
    }

    @Override // c0.r0
    public Range h() {
        return this.f19274c.getSupportedWidths();
    }

    @Override // c0.r0
    public boolean i(int i10, int i11) {
        return this.f19274c.isSizeSupported(i10, i11);
    }

    @Override // c0.r0
    public Range j() {
        return this.f19274c.getSupportedHeights();
    }
}
