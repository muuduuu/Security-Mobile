package E;

import A.D;
import androidx.camera.core.impl.X0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class p {
    public static D a(X0 x02, D d10) {
        boolean z10;
        if (x02 == null) {
            return d10;
        }
        D.a aVar = new D.a(d10);
        boolean z11 = true;
        if (d10.c().isEmpty() || b(x02, 1, 2)) {
            z10 = false;
        } else {
            aVar.c(1);
            z10 = true;
        }
        if (!d10.b().isEmpty() && !b(x02, 3)) {
            aVar.c(2);
            z10 = true;
        }
        if (d10.d().isEmpty() || b(x02, 4)) {
            z11 = z10;
        } else {
            aVar.c(4);
        }
        if (!z11) {
            return d10;
        }
        D b10 = aVar.b();
        if (b10.c().isEmpty() && b10.b().isEmpty() && b10.d().isEmpty()) {
            return null;
        }
        return aVar.b();
    }

    public static boolean b(X0 x02, int... iArr) {
        if (x02 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return x02.a().containsAll(arrayList);
    }
}
