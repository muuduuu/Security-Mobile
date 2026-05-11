package com.google.protobuf;

import com.appsflyer.attribution.RequestError;

/* loaded from: classes2.dex */
abstract class g0 {

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC2877h f28728a;

        a(AbstractC2877h abstractC2877h) {
            this.f28728a = abstractC2877h;
        }

        @Override // com.google.protobuf.g0.b
        public byte a(int i10) {
            return this.f28728a.e(i10);
        }

        @Override // com.google.protobuf.g0.b
        public int size() {
            return this.f28728a.size();
        }
    }

    private interface b {
        byte a(int i10);

        int size();
    }

    static String a(AbstractC2877h abstractC2877h) {
        return b(new a(abstractC2877h));
    }

    static String b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            byte a10 = bVar.a(i10);
            if (a10 == 34) {
                sb2.append("\\\"");
            } else if (a10 == 39) {
                sb2.append("\\'");
            } else if (a10 != 92) {
                switch (a10) {
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
                        if (a10 < 32 || a10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a10 >>> 6) & 3) + 48));
                            sb2.append((char) (((a10 >>> 3) & 7) + 48));
                            sb2.append((char) ((a10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) a10);
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

    static String c(String str) {
        return a(AbstractC2877h.r(str));
    }
}
