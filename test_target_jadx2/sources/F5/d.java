package F5;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public class d implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final int f2512e = S5.f.values().length;

    /* renamed from: a, reason: collision with root package name */
    protected b f2513a;

    /* renamed from: b, reason: collision with root package name */
    protected final n f2514b;

    /* renamed from: c, reason: collision with root package name */
    protected n[] f2515c;

    /* renamed from: d, reason: collision with root package name */
    protected Map f2516d;

    public d() {
        this(b.TryConvert, new n(), null, null);
    }

    protected d(b bVar, n nVar, n[] nVarArr, Map map) {
        this.f2514b = nVar;
        this.f2513a = bVar;
        this.f2515c = nVarArr;
        this.f2516d = map;
    }
}
