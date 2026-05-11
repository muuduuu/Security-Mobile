package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
class l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f36527a;

    public l(Iterator it) {
        this.f36527a = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f36527a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36527a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f36527a.remove();
    }
}
