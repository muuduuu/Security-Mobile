package ze;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private Map f45972a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private G f45973b = new G();

    public void a() {
        this.f45972a.clear();
    }

    public String b(String str) {
        G c10;
        return (!d(str) || (c10 = c(str)) == null) ? str : c10.d();
    }

    public G c(String str) {
        if (str != null) {
            return (G) this.f45972a.get(str.toLowerCase());
        }
        return null;
    }

    public boolean d(String str) {
        return str != null && this.f45972a.containsKey(str.toLowerCase());
    }

    public Map e(String str, Map map) {
        G c10 = c(str);
        if (c10 != null) {
            map = c10.a(map);
        }
        return this.f45973b.a(map);
    }
}
