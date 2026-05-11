package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.appsflyer.attribution.RequestError;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2462j implements InterfaceC2464j1 {

    /* renamed from: a, reason: collision with root package name */
    static final InterfaceC2464j1 f24876a = new C2462j();

    private C2462j() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2464j1
    public final boolean b(int i10) {
        if (i10 == 129 || i10 == 161 || i10 == 209 || i10 == 2705 || i10 == 20753 || i10 == 20769 || i10 == 215 || i10 == 216 || i10 == 1297 || i10 == 1298) {
            return true;
        }
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i10) {
                    case 9:
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                    case 11:
                    case 12:
                        return true;
                    default:
                        switch (i10) {
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                                return true;
                            default:
                                switch (i10) {
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 167:
                                    case 168:
                                    case 169:
                                        return true;
                                    default:
                                        switch (i10) {
                                            case 211:
                                            case 212:
                                            case 213:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }
}
