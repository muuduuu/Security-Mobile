package r5;

import com.facebook.soloader.C;
import com.facebook.soloader.C2000c;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;

/* renamed from: r5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4016d implements InterfaceC4020h {
    @Override // r5.InterfaceC4020h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        p.b("SoLoader", "Checking /data/data missing libraries.");
        boolean z10 = false;
        for (E e10 : eArr) {
            if ((e10 instanceof G) && !(e10 instanceof C2000c)) {
                G g10 = (G) e10;
                try {
                    G.c[] o10 = g10.o();
                    int length = o10.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            G.c cVar = o10[i10];
                            if (g10.f(cVar.f23020a) == null) {
                                p.b("SoLoader", "Missing " + cVar.f23020a + " from " + g10.c() + ", will force prepare.");
                                g10.e(2);
                                z10 = true;
                                break;
                            }
                            i10++;
                        }
                    }
                } catch (Exception e11) {
                    p.c("SoLoader", "Encountered an exception while recovering from /data/data failure ", e11);
                    return false;
                }
            }
        }
        if (z10) {
            p.b("SoLoader", "Successfully recovered from /data/data disk failure.");
            return true;
        }
        p.b("SoLoader", "No libraries missing from unpacking so paths while recovering /data/data failure");
        return false;
    }
}
