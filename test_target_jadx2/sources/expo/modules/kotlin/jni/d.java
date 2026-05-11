package expo.modules.kotlin.jni;

import expo.modules.kotlin.jni.JavaScriptObject;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((JavaScriptObject.a) it.next()).getValue();
        }
        return i10;
    }
}
