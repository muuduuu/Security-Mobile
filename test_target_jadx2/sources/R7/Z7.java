package r7;

/* loaded from: classes2.dex */
public enum Z7 implements Q0 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);

    private final int zzr;

    Z7(int i10) {
        this.zzr = i10;
    }

    @Override // r7.Q0
    public final int zza() {
        return this.zzr;
    }
}
