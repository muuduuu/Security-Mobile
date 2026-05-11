package Ha;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3820a = new a();

    private a() {
    }

    public final boolean a() {
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (!StringsKt.F(FINGERPRINT, "generic", false, 2, null)) {
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (!StringsKt.F(FINGERPRINT, "unknown", false, 2, null)) {
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                if (!StringsKt.K(MODEL, "google_sdk", false, 2, null)) {
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = MODEL.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (!StringsKt.K(lowerCase, "droid4x", false, 2, null)) {
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        if (!StringsKt.K(MODEL, "Emulator", false, 2, null)) {
                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                            if (!StringsKt.K(MODEL, "Android SDK built for x86", false, 2, null)) {
                                String MANUFACTURER = Build.MANUFACTURER;
                                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                if (!StringsKt.K(MANUFACTURER, "Genymotion", false, 2, null)) {
                                    String HARDWARE = Build.HARDWARE;
                                    Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                                    if (!StringsKt.K(HARDWARE, "goldfish", false, 2, null)) {
                                        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                                        if (!StringsKt.K(HARDWARE, "ranchu", false, 2, null)) {
                                            Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                                            if (!StringsKt.K(HARDWARE, "vbox86", false, 2, null)) {
                                                String PRODUCT = Build.PRODUCT;
                                                Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                if (!StringsKt.K(PRODUCT, "sdk", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                    if (!StringsKt.K(PRODUCT, "google_sdk", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                        if (!StringsKt.K(PRODUCT, "sdk_google", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                            if (!StringsKt.K(PRODUCT, "sdk_x86", false, 2, null)) {
                                                                Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                                if (!StringsKt.K(PRODUCT, "vbox86p", false, 2, null)) {
                                                                    Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                                    if (!StringsKt.K(PRODUCT, "emulator", false, 2, null)) {
                                                                        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                                        if (!StringsKt.K(PRODUCT, "simulator", false, 2, null)) {
                                                                            String BOARD = Build.BOARD;
                                                                            Intrinsics.checkNotNullExpressionValue(BOARD, "BOARD");
                                                                            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                                            String lowerCase2 = BOARD.toLowerCase(ROOT);
                                                                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                                                            if (!StringsKt.K(lowerCase2, "nox", false, 2, null)) {
                                                                                String BOOTLOADER = Build.BOOTLOADER;
                                                                                Intrinsics.checkNotNullExpressionValue(BOOTLOADER, "BOOTLOADER");
                                                                                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                                                String lowerCase3 = BOOTLOADER.toLowerCase(ROOT);
                                                                                Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                                                                                if (!StringsKt.K(lowerCase3, "nox", false, 2, null)) {
                                                                                    Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                                                                                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                                                    String lowerCase4 = HARDWARE.toLowerCase(ROOT);
                                                                                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                                                                                    if (!StringsKt.K(lowerCase4, "nox", false, 2, null)) {
                                                                                        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                                                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                                                        String lowerCase5 = PRODUCT.toLowerCase(ROOT);
                                                                                        Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                                                                                        if (!StringsKt.K(lowerCase5, "nox", false, 2, null)) {
                                                                                            String BRAND = Build.BRAND;
                                                                                            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                                            if (!StringsKt.F(BRAND, "generic", false, 2, null)) {
                                                                                                return false;
                                                                                            }
                                                                                            String DEVICE = Build.DEVICE;
                                                                                            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                                            if (!StringsKt.F(DEVICE, "generic", false, 2, null)) {
                                                                                                return false;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
