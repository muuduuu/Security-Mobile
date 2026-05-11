package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.appsflyer.attribution.RequestError;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2529w2 {
    static String a(E0 e02) {
        StringBuilder sb2 = new StringBuilder(e02.j());
        for (int i10 = 0; i10 < e02.j(); i10++) {
            byte c10 = e02.c(i10);
            if (c10 == 34) {
                sb2.append("\\\"");
            } else if (c10 == 39) {
                sb2.append("\\'");
            } else if (c10 != 92) {
                switch (c10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (c10 < 32 || c10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((c10 >>> 6) & 3) + 48));
                            sb2.append((char) (((c10 >>> 3) & 7) + 48));
                            sb2.append((char) ((c10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) c10);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
