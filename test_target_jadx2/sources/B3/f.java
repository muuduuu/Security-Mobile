package b3;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class f extends ArrayList {
    private f(int i10) {
        super(i10);
    }

    public static f h(Object... objArr) {
        f fVar = new f(objArr.length);
        Collections.addAll(fVar, objArr);
        return fVar;
    }
}
