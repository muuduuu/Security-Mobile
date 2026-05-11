package r5;

import com.facebook.soloader.B;
import com.facebook.soloader.C;
import com.facebook.soloader.C2000c;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;
import org.conscrypt.BuildConfig;

/* renamed from: r5.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4023k implements InterfaceC4020h {
    @Override // r5.InterfaceC4020h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C) || (unsatisfiedLinkError instanceof B)) {
            return false;
        }
        String a10 = ((C) unsatisfiedLinkError).a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Reunpacking NonApk UnpackingSoSources due to ");
        sb2.append(unsatisfiedLinkError);
        sb2.append(a10 == null ? BuildConfig.FLAVOR : ", retrying for specific library " + a10);
        p.b("SoLoader", sb2.toString());
        for (E e10 : eArr) {
            if (e10 instanceof G) {
                G g10 = (G) e10;
                if (g10 instanceof C2000c) {
                    continue;
                } else {
                    try {
                        p.b("SoLoader", "Runpacking " + g10.c());
                        g10.e(2);
                    } catch (Exception e11) {
                        p.c("SoLoader", "Encountered an exception while reunpacking " + g10.c() + " for library " + a10 + ": ", e11);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
