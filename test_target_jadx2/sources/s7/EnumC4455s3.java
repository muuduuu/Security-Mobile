package s7;

/* renamed from: s7.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4455s3 implements InterfaceC4375h {
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

    EnumC4455s3(int i10) {
        this.zzl = i10;
    }

    @Override // s7.InterfaceC4375h
    public final int zza() {
        return this.zzl;
    }
}
