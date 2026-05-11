package com.google.protobuf;

import com.google.protobuf.G;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
class J implements I {
    J() {
    }

    private static int i(int i10, Object obj, Object obj2) {
        H h10 = (H) obj;
        android.support.v4.media.session.b.a(obj2);
        if (h10.isEmpty()) {
            return 0;
        }
        Iterator it = h10.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    private static H j(Object obj, Object obj2) {
        H h10 = (H) obj;
        H h11 = (H) obj2;
        if (!h11.isEmpty()) {
            if (!h10.n()) {
                h10 = h10.q();
            }
            h10.p(h11);
        }
        return h10;
    }

    @Override // com.google.protobuf.I
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.I
    public Object b(Object obj) {
        ((H) obj).o();
        return obj;
    }

    @Override // com.google.protobuf.I
    public G.a c(Object obj) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.protobuf.I
    public Map d(Object obj) {
        return (H) obj;
    }

    @Override // com.google.protobuf.I
    public Object e(Object obj) {
        return H.h().q();
    }

    @Override // com.google.protobuf.I
    public int f(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.protobuf.I
    public boolean g(Object obj) {
        return !((H) obj).n();
    }

    @Override // com.google.protobuf.I
    public Map h(Object obj) {
        return (H) obj;
    }
}
