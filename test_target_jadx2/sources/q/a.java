package Q;

import A.B;
import androidx.camera.core.impl.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a {
    private static B a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        B b10 = (B) list.get(0);
        Integer valueOf = Integer.valueOf(b10.b());
        Integer valueOf2 = Integer.valueOf(b10.a());
        for (int i10 = 1; i10 < list.size(); i10++) {
            B b11 = (B) list.get(i10);
            valueOf = c(valueOf, Integer.valueOf(b11.b()));
            valueOf2 = b(valueOf2, Integer.valueOf(b11.a()));
            if (valueOf == null || valueOf2 == null) {
                return null;
            }
        }
        return new B(valueOf.intValue(), valueOf2.intValue());
    }

    private static Integer b(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0)) {
            return num;
        }
        if (num.equals(num2)) {
            return num;
        }
        return null;
    }

    private static Integer c(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0)) {
            return num;
        }
        if (num.equals(2) && !num2.equals(1)) {
            return num2;
        }
        if (num2.equals(2) && !num.equals(1)) {
            return num;
        }
        if (num.equals(num2)) {
            return num;
        }
        return null;
    }

    public static B d(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((l1) it.next()).k());
        }
        return a(arrayList);
    }
}
