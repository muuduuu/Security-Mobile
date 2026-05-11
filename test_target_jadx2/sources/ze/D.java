package ze;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public class D extends F implements InterfaceC5277b {

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashMap f45887e;

    /* renamed from: f, reason: collision with root package name */
    private final List f45888f;

    /* renamed from: g, reason: collision with root package name */
    private o f45889g;

    /* renamed from: h, reason: collision with root package name */
    private List f45890h;

    /* renamed from: i, reason: collision with root package name */
    private Map f45891i;

    /* renamed from: j, reason: collision with root package name */
    private transient boolean f45892j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f45893k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f45894l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f45895m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f45896n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f45897o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f45898p;

    public D(String str) {
        this(str, false);
    }

    private void A(Map map) {
        this.f45887e.clear();
        this.f45887e.putAll(map);
    }

    private Map j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.f45887e.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (!linkedHashMap.containsKey(str.toLowerCase())) {
                linkedHashMap.put(str.toLowerCase(), this.f45887e.get(str));
            }
        }
        return linkedHashMap;
    }

    public void B(Map map) {
        if (this.f45895m) {
            A(map);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (Thread.currentThread().isInterrupted()) {
                p();
                return;
            }
            String str2 = (String) map.get(str);
            if (!this.f45895m) {
                String str3 = str;
                for (String str4 : this.f45887e.keySet()) {
                    if (str4.equalsIgnoreCase(str)) {
                        str3 = str4;
                    }
                }
                str = str3;
            }
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, str2);
            }
        }
        A(linkedHashMap);
    }

    public void C(boolean z10) {
        this.f45893k = z10;
    }

    public void D(o oVar) {
        this.f45889g = oVar;
    }

    public void E(boolean z10) {
        this.f45895m = true;
        this.f45894l = z10;
        if (z10) {
            return;
        }
        A(n());
    }

    void F() {
        G(true);
    }

    void G(boolean z10) {
        this.f45892j = z10;
    }

    void H(List list) {
        this.f45890h = list;
    }

    public void I(boolean z10) {
        this.f45897o = z10;
    }

    public void J(boolean z10) {
        this.f45896n = z10;
    }

    @Override // ze.F
    public void d(String str, String str2) {
        if (str != null) {
            String trim = str.trim();
            if (!this.f45894l && this.f45895m) {
                trim = trim.toLowerCase();
            }
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            if (this.f45896n) {
                str2 = str2.trim().replaceAll("\\p{Cntrl}", " ");
            }
            if (trim.length() == 0 || this.f45887e.containsKey(trim)) {
                return;
            }
            this.f45887e.put(trim, str2);
        }
    }

    @Override // ze.F
    public String e() {
        if (this.f45894l) {
            return this.f45902d;
        }
        String str = this.f45902d;
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public void f(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof List) {
            g((List) obj);
            return;
        }
        if (obj instanceof z) {
            this.f45888f.add(((z) obj).K());
            return;
        }
        if (!(obj instanceof InterfaceC5277b)) {
            throw new RuntimeException("Attempted to add invalid child object to TagNode; class=" + obj.getClass());
        }
        this.f45888f.add((InterfaceC5277b) obj);
        if (obj instanceof D) {
            ((D) obj).f45916c = this;
        }
    }

    public void g(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        }
    }

    void h(Object obj) {
        if (this.f45890h == null) {
            this.f45890h = new ArrayList();
        }
        if (obj instanceof InterfaceC5277b) {
            this.f45890h.add((InterfaceC5277b) obj);
            return;
        }
        throw new RuntimeException("Attempt to add invalid item for moving; class=" + obj.getClass());
    }

    public void i(String str, String str2) {
        if (this.f45891i == null) {
            this.f45891i = new TreeMap();
        }
        this.f45891i.put(str, str2);
    }

    public List k() {
        return this.f45888f;
    }

    public String l(String str) {
        if (str == null) {
            return null;
        }
        return (String) n().get(str.toLowerCase());
    }

    public Map m() {
        return new LinkedHashMap(this.f45887e);
    }

    public Map n() {
        return j();
    }

    List o() {
        return this.f45890h;
    }

    public boolean q(String str) {
        if (str == null) {
            return false;
        }
        Iterator it = this.f45887e.keySet().iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean r() {
        return this.f45893k;
    }

    public boolean s() {
        return this.f45898p;
    }

    public boolean t() {
        if (v()) {
            return true;
        }
        for (Object obj : this.f45888f) {
            if (obj instanceof D) {
                if (!((D) obj).v()) {
                    return false;
                }
            } else {
                if (!(obj instanceof l)) {
                    boolean z10 = obj instanceof k;
                    return false;
                }
                if (!((l) obj).e()) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean u() {
        return this.f45892j;
    }

    public boolean v() {
        return this.f45897o;
    }

    public D w() {
        D d10 = new D(this.f45902d, true);
        d10.f45887e.putAll(this.f45887e);
        return d10;
    }

    public void x(String str) {
        if (str == null || BuildConfig.FLAVOR.equals(str.trim())) {
            return;
        }
        this.f45887e.remove(str.toLowerCase());
    }

    public boolean y(Object obj) {
        return this.f45888f.remove(obj);
    }

    public boolean z() {
        D d10 = this.f45916c;
        if (d10 != null) {
            return d10.y(this);
        }
        return false;
    }

    private D(String str, boolean z10) {
        super(str);
        this.f45887e = new LinkedHashMap();
        this.f45888f = new ArrayList();
        this.f45895m = false;
        this.f45896n = true;
        this.f45898p = z10;
    }

    private void p() {
    }
}
