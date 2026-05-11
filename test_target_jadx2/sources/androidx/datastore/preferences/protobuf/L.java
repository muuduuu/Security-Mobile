package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;
import java.util.Map;

/* loaded from: classes.dex */
final class L implements K {
    L() {
    }

    private static int i(int i10, Object obj, Object obj2) {
        J j10 = (J) obj;
        I i11 = (I) obj2;
        int i12 = 0;
        if (j10.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : j10.entrySet()) {
            i12 += i11.a(i10, entry.getKey(), entry.getValue());
        }
        return i12;
    }

    private static J j(Object obj, Object obj2) {
        J j10 = (J) obj;
        J j11 = (J) obj2;
        if (!j11.isEmpty()) {
            if (!j10.n()) {
                j10 = j10.q();
            }
            j10.p(j11);
        }
        return j10;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Object b(Object obj) {
        ((J) obj).o();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public I.a c(Object obj) {
        return ((I) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Map d(Object obj) {
        return (J) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Object e(Object obj) {
        return J.h().q();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public int f(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public boolean g(Object obj) {
        return !((J) obj).n();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Map h(Object obj) {
        return (J) obj;
    }
}
