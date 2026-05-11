package n;

import java.util.HashMap;
import java.util.Map;
import n.C3701b;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3700a extends C3701b {

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f37501e = new HashMap();

    public boolean contains(Object obj) {
        return this.f37501e.containsKey(obj);
    }

    @Override // n.C3701b
    protected C3701b.c h(Object obj) {
        return (C3701b.c) this.f37501e.get(obj);
    }

    @Override // n.C3701b
    public Object r(Object obj, Object obj2) {
        C3701b.c h10 = h(obj);
        if (h10 != null) {
            return h10.f37507b;
        }
        this.f37501e.put(obj, m(obj, obj2));
        return null;
    }

    @Override // n.C3701b
    public Object t(Object obj) {
        Object t10 = super.t(obj);
        this.f37501e.remove(obj);
        return t10;
    }

    public Map.Entry u(Object obj) {
        if (contains(obj)) {
            return ((C3701b.c) this.f37501e.get(obj)).f37509d;
        }
        return null;
    }
}
