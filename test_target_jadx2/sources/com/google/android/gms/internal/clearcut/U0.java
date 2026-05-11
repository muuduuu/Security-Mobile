package com.google.android.gms.internal.clearcut;

import com.appsflyer.attribution.RequestError;

/* loaded from: classes2.dex */
abstract class U0 {
    static String a(AbstractC2179y abstractC2179y) {
        String str;
        V0 v02 = new V0(abstractC2179y);
        StringBuilder sb2 = new StringBuilder(v02.size());
        for (int i10 = 0; i10 < v02.size(); i10++) {
            int a10 = v02.a(i10);
            if (a10 == 34) {
                str = "\\\"";
            } else if (a10 == 39) {
                str = "\\'";
            } else if (a10 != 92) {
                switch (a10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a10 < 32 || a10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a10 >>> 6) & 3) + 48));
                            sb2.append((char) (((a10 >>> 3) & 7) + 48));
                            a10 = (a10 & 7) + 48;
                        }
                        sb2.append((char) a10);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
