package r7;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: r7.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4278z extends K implements InterfaceC4190q0 {
    protected AbstractC4278z(Map map) {
        super(map);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.util.List] */
    @Override // r7.InterfaceC4190q0
    public final List c(Object obj) {
        return super.h(obj);
    }

    @Override // r7.K
    final Collection f(Object obj, Collection collection) {
        return i(obj, (List) collection, null);
    }
}
