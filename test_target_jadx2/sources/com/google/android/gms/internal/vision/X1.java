package com.google.android.gms.internal.vision;

import com.appsflyer.attribution.RequestError;

/* loaded from: classes2.dex */
abstract class X1 {
    static String a(AbstractC2570g0 abstractC2570g0) {
        Z1 z12 = new Z1(abstractC2570g0);
        StringBuilder sb2 = new StringBuilder(z12.zza());
        for (int i10 = 0; i10 < z12.zza(); i10++) {
            byte b10 = z12.b(i10);
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
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
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b10);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
