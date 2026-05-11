package Z1;

import O1.C1038i;
import a2.AbstractC1346c;
import com.appsflyer.attribution.RequestError;

/* renamed from: Z1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1317h {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12307a = AbstractC1346c.a.a("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ce, code lost:
    
        if (r3.equals("fl") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static W1.c a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        W1.c cVar;
        String str;
        char c10 = 1;
        abstractC1346c.c();
        int i10 = 2;
        while (true) {
            cVar = null;
            if (!abstractC1346c.f()) {
                str = null;
                break;
            }
            int r10 = abstractC1346c.r(f12307a);
            if (r10 == 0) {
                str = abstractC1346c.n();
                break;
            }
            if (r10 != 1) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                i10 = abstractC1346c.j();
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3270:
                break;
            case 3295:
                if (str.equals("gf")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3307:
                if (str.equals("gr")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 3669:
                if (str.equals("sh")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                cVar = AbstractC1315f.a(abstractC1346c, c1038i, i10);
                break;
            case 1:
                cVar = I.a(abstractC1346c, c1038i);
                break;
            case 2:
                cVar = p.a(abstractC1346c, c1038i);
                break;
            case 3:
                cVar = J.a(abstractC1346c, c1038i);
                break;
            case 4:
                cVar = q.a(abstractC1346c, c1038i);
                break;
            case 5:
                cVar = y.a(abstractC1346c);
                c1038i.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                cVar = D.a(abstractC1346c, c1038i);
                break;
            case 7:
                cVar = F.a(abstractC1346c, c1038i);
                break;
            case '\b':
                cVar = E.a(abstractC1346c, c1038i);
                break;
            case '\t':
                cVar = K.a(abstractC1346c, c1038i);
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                cVar = C.a(abstractC1346c, c1038i, i10);
                break;
            case 11:
                cVar = L.a(abstractC1346c, c1038i);
                break;
            case '\f':
                cVar = M.a(abstractC1346c, c1038i);
                break;
            case '\r':
                cVar = AbstractC1312c.g(abstractC1346c, c1038i);
                break;
            default:
                b2.f.c("Unknown shape type " + str);
                break;
        }
        while (abstractC1346c.f()) {
            abstractC1346c.t();
        }
        abstractC1346c.e();
        return cVar;
    }
}
