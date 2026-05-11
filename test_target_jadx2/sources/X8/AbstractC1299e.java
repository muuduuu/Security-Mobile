package X8;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1299e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f11786a = new HashMap();

    protected abstract Object a(Object obj);

    public Object b(Object obj) {
        synchronized (this.f11786a) {
            try {
                if (this.f11786a.containsKey(obj)) {
                    return this.f11786a.get(obj);
                }
                Object a10 = a(obj);
                this.f11786a.put(obj, a10);
                return a10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
