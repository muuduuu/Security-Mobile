package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
class B implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f16287a;

    public B(Iterator it) {
        this.f16287a = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f16287a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f16287a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f16287a.remove();
    }
}
