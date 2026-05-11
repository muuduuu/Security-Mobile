package t;

import A.C0716t;
import u.C4844h;

/* loaded from: classes.dex */
public abstract class P0 {
    public static C0716t a(C4844h c4844h) {
        int d10 = c4844h.d();
        int i10 = 1;
        if (d10 != 1) {
            i10 = 2;
            if (d10 != 2) {
                i10 = 3;
                if (d10 != 3) {
                    i10 = 4;
                    if (d10 != 4) {
                        i10 = 5;
                        if (d10 != 5) {
                            i10 = d10 != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new C0716t(i10, c4844h);
    }
}
