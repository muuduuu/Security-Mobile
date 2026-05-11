package K5;

import K5.t;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public class F implements t.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected final t.a f5339a;

    /* renamed from: b, reason: collision with root package name */
    protected Map f5340b;

    public F(t.a aVar) {
        this.f5339a = aVar;
    }

    @Override // K5.t.a
    public Class a(Class cls) {
        Map map;
        t.a aVar = this.f5339a;
        Class a10 = aVar == null ? null : aVar.a(cls);
        return (a10 != null || (map = this.f5340b) == null) ? a10 : (Class) map.get(new S5.b(cls));
    }

    public boolean b() {
        if (this.f5340b != null) {
            return true;
        }
        t.a aVar = this.f5339a;
        if (aVar == null) {
            return false;
        }
        if (aVar instanceof F) {
            return ((F) aVar).b();
        }
        return true;
    }
}
