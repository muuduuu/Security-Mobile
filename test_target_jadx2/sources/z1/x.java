package Z1;

import O1.C1038i;
import W1.i;
import a2.AbstractC1346c;
import u5.C4870a;

/* loaded from: classes.dex */
abstract class x {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static W1.i a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        boolean z10;
        boolean z11;
        abstractC1346c.c();
        i.a aVar = null;
        V1.h hVar = null;
        V1.d dVar = null;
        boolean z12 = false;
        while (abstractC1346c.f()) {
            String l10 = abstractC1346c.l();
            l10.hashCode();
            switch (l10.hashCode()) {
                case 111:
                    if (l10.equals("o")) {
                        z10 = false;
                        break;
                    }
                    z10 = -1;
                    break;
                case 3588:
                    if (l10.equals("pt")) {
                        z10 = true;
                        break;
                    }
                    z10 = -1;
                    break;
                case 104433:
                    if (l10.equals("inv")) {
                        z10 = 2;
                        break;
                    }
                    z10 = -1;
                    break;
                case 3357091:
                    if (l10.equals("mode")) {
                        z10 = 3;
                        break;
                    }
                    z10 = -1;
                    break;
                default:
                    z10 = -1;
                    break;
            }
            switch (z10) {
                case false:
                    dVar = AbstractC1313d.h(abstractC1346c, c1038i);
                    break;
                case true:
                    hVar = AbstractC1313d.k(abstractC1346c, c1038i);
                    break;
                case true:
                    z12 = abstractC1346c.g();
                    break;
                case true:
                    String n10 = abstractC1346c.n();
                    n10.hashCode();
                    switch (n10.hashCode()) {
                        case 97:
                            if (n10.equals(C4870a.f43493a)) {
                                z11 = false;
                                break;
                            }
                            z11 = -1;
                            break;
                        case 105:
                            if (n10.equals("i")) {
                                z11 = true;
                                break;
                            }
                            z11 = -1;
                            break;
                        case 110:
                            if (n10.equals("n")) {
                                z11 = 2;
                                break;
                            }
                            z11 = -1;
                            break;
                        case 115:
                            if (n10.equals("s")) {
                                z11 = 3;
                                break;
                            }
                            z11 = -1;
                            break;
                        default:
                            z11 = -1;
                            break;
                    }
                    switch (z11) {
                        case false:
                            aVar = i.a.MASK_MODE_ADD;
                            break;
                        case true:
                            c1038i.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = i.a.MASK_MODE_INTERSECT;
                            break;
                        case true:
                            aVar = i.a.MASK_MODE_NONE;
                            break;
                        case true:
                            aVar = i.a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            b2.f.c("Unknown mask mode " + l10 + ". Defaulting to Add.");
                            aVar = i.a.MASK_MODE_ADD;
                            break;
                    }
                default:
                    abstractC1346c.t();
                    break;
            }
        }
        abstractC1346c.e();
        return new W1.i(aVar, hVar, dVar, z12);
    }
}
