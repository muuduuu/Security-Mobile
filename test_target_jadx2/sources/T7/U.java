package t7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class U {
    static void a(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
