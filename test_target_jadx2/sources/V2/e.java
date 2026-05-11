package V2;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {
    public static String a(d dVar) {
        try {
            return dVar instanceof f ? c((d) ((f) dVar).d().get(0)) : c(dVar);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static List b(d dVar) {
        ArrayList arrayList;
        try {
            if (dVar instanceof f) {
                List d10 = ((f) dVar).d();
                arrayList = new ArrayList(d10.size());
                for (int i10 = 0; i10 < d10.size(); i10++) {
                    arrayList.add(c((d) d10.get(i10)));
                }
            } else {
                arrayList = new ArrayList(1);
                arrayList.add(dVar.b() ? dVar.c() : c(dVar));
            }
            return arrayList;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static String c(d dVar) {
        return j3.c.a(dVar.c().getBytes("UTF-8"));
    }
}
