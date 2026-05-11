package t7;

import java.util.Map;

/* renamed from: t7.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4647b0 {
    static Object a(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean b(Map map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
