package r7;

/* loaded from: classes2.dex */
public enum K5 implements Q0 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);

    private final int zzl;

    K5(int i10) {
        this.zzl = i10;
    }

    @Override // r7.Q0
    public final int zza() {
        return this.zzl;
    }
}
