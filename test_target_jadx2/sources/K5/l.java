package K5;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    protected Map f5404a;

    public l() {
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map map = this.f5404a;
        return map == null ? Collections.emptyIterator() : map.values().iterator();
    }

    public l(Map map) {
        this.f5404a = map;
    }
}
