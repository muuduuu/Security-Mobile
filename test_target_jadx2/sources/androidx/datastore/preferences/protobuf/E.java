package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1557y;
import java.util.List;

/* loaded from: classes.dex */
final class E implements D {
    E() {
    }

    static AbstractC1557y.b d(Object obj, long j10) {
        return (AbstractC1557y.b) p0.z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void a(Object obj, Object obj2, long j10) {
        AbstractC1557y.b d10 = d(obj, j10);
        AbstractC1557y.b d11 = d(obj2, j10);
        int size = d10.size();
        int size2 = d11.size();
        if (size > 0 && size2 > 0) {
            if (!d10.N()) {
                d10 = d10.y(size2 + size);
            }
            d10.addAll(d11);
        }
        if (size > 0) {
            d11 = d10;
        }
        p0.O(obj, j10, d11);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void b(Object obj, long j10) {
        d(obj, j10).x();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public List c(Object obj, long j10) {
        AbstractC1557y.b d10 = d(obj, j10);
        if (d10.N()) {
            return d10;
        }
        int size = d10.size();
        AbstractC1557y.b y10 = d10.y(size == 0 ? 10 : size * 2);
        p0.O(obj, j10, y10);
        return y10;
    }
}
