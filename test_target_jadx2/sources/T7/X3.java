package t7;

/* loaded from: classes2.dex */
public enum X3 implements InterfaceC4786v0 {
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

    X3(int i10) {
        this.zzl = i10;
    }

    @Override // t7.InterfaceC4786v0
    public final int zza() {
        return this.zzl;
    }
}
