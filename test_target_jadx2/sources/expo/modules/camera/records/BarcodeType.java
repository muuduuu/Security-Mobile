package expo.modules.camera.records;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.m;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import qc.AbstractC3958a;
import u5.C4870a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lexpo/modules/camera/records/BarcodeType;", BuildConfig.FLAVOR, "Lexpo/modules/kotlin/types/Enumerable;", BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", BuildConfig.FLAVOR, "mapToBarcode", "()I", "Ljava/lang/String;", "Companion", C4870a.f43493a, "AZTEC", "EAN13", "EAN8", "QR", "PDF417", "UPCE", "DATAMATRIX", "CODE39", "CODE93", "ITF14", "CODABAR", "CODE128", "UPCA", "UNKNOWN", "expo-camera_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BarcodeType implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BarcodeType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;
    public static final BarcodeType AZTEC = new BarcodeType("AZTEC", 0, "aztec");
    public static final BarcodeType EAN13 = new BarcodeType("EAN13", 1, "ean13");
    public static final BarcodeType EAN8 = new BarcodeType("EAN8", 2, "ean8");
    public static final BarcodeType QR = new BarcodeType("QR", 3, "qr");
    public static final BarcodeType PDF417 = new BarcodeType("PDF417", 4, "pdf417");
    public static final BarcodeType UPCE = new BarcodeType("UPCE", 5, "upc_e");
    public static final BarcodeType DATAMATRIX = new BarcodeType("DATAMATRIX", 6, "datamatrix");
    public static final BarcodeType CODE39 = new BarcodeType("CODE39", 7, "code39");
    public static final BarcodeType CODE93 = new BarcodeType("CODE93", 8, "code93");
    public static final BarcodeType ITF14 = new BarcodeType("ITF14", 9, "itf14");
    public static final BarcodeType CODABAR = new BarcodeType("CODABAR", 10, "codabar");
    public static final BarcodeType CODE128 = new BarcodeType("CODE128", 11, "code128");
    public static final BarcodeType UPCA = new BarcodeType("UPCA", 12, "upc_a");
    public static final BarcodeType UNKNOWN = new BarcodeType("UNKNOWN", 13, "unknown");

    /* renamed from: expo.modules.camera.records.BarcodeType$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            BarcodeType barcodeType;
            if (i10 == 1) {
                barcodeType = BarcodeType.CODE128;
            } else if (i10 != 2) {
                switch (i10) {
                    case 4:
                        barcodeType = BarcodeType.CODE93;
                        break;
                    case 8:
                        barcodeType = BarcodeType.CODABAR;
                        break;
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        barcodeType = BarcodeType.DATAMATRIX;
                        break;
                    case 32:
                        barcodeType = BarcodeType.EAN13;
                        break;
                    case 64:
                        barcodeType = BarcodeType.EAN8;
                        break;
                    case 128:
                        barcodeType = BarcodeType.ITF14;
                        break;
                    case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
                        barcodeType = BarcodeType.QR;
                        break;
                    case 512:
                        barcodeType = BarcodeType.UPCA;
                        break;
                    case 1024:
                        barcodeType = BarcodeType.UPCE;
                        break;
                    case 2048:
                        barcodeType = BarcodeType.PDF417;
                        break;
                    case 4096:
                        barcodeType = BarcodeType.AZTEC;
                        break;
                    default:
                        barcodeType = BarcodeType.UNKNOWN;
                        break;
                }
            } else {
                barcodeType = BarcodeType.CODE39;
            }
            return barcodeType.value;
        }

        private Companion() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32584a;

        static {
            int[] iArr = new int[BarcodeType.values().length];
            try {
                iArr[BarcodeType.AZTEC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeType.EAN13.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BarcodeType.EAN8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BarcodeType.QR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BarcodeType.PDF417.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BarcodeType.UPCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BarcodeType.DATAMATRIX.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BarcodeType.CODE39.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BarcodeType.CODE93.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BarcodeType.ITF14.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BarcodeType.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BarcodeType.CODE128.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BarcodeType.UPCA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BarcodeType.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f32584a = iArr;
        }
    }

    private static final /* synthetic */ BarcodeType[] $values() {
        return new BarcodeType[]{AZTEC, EAN13, EAN8, QR, PDF417, UPCE, DATAMATRIX, CODE39, CODE93, ITF14, CODABAR, CODE128, UPCA, UNKNOWN};
    }

    static {
        BarcodeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        INSTANCE = new Companion(null);
    }

    private BarcodeType(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BarcodeType valueOf(String str) {
        return (BarcodeType) Enum.valueOf(BarcodeType.class, str);
    }

    public static BarcodeType[] values() {
        return (BarcodeType[]) $VALUES.clone();
    }

    public final int mapToBarcode() {
        switch (b.f32584a[ordinal()]) {
            case 1:
                return 4096;
            case 2:
                return 32;
            case 3:
                return 64;
            case 4:
                return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            case 5:
                return 2048;
            case 6:
                return 1024;
            case 7:
                return 16;
            case 8:
                return 2;
            case 9:
                return 4;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return 128;
            case 11:
                return 8;
            case 12:
                return 1;
            case 13:
                return 512;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return -1;
            default:
                throw new m();
        }
    }
}
