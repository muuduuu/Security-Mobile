package r7;

import org.conscrypt.PSKKeyManager;

/* renamed from: r7.q6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4196q6 implements Q0 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(PSKKeyManager.MAX_KEY_LENGTH_BYTES),
    FORMAT_UPC_A(512),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);

    private final int zzp;

    EnumC4196q6(int i10) {
        this.zzp = i10;
    }

    @Override // r7.Q0
    public final int zza() {
        return this.zzp;
    }
}
