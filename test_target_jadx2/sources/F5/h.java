package F5;

import K5.I;
import java.io.Serializable;
import java.util.Map;
import v5.InterfaceC4942i;
import v5.p;
import v5.z;

/* loaded from: classes2.dex */
public class h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected Map f2525a;

    /* renamed from: b, reason: collision with root package name */
    protected p.b f2526b;

    /* renamed from: c, reason: collision with root package name */
    protected z.a f2527c;

    /* renamed from: d, reason: collision with root package name */
    protected I f2528d;

    /* renamed from: e, reason: collision with root package name */
    protected Boolean f2529e;

    /* renamed from: f, reason: collision with root package name */
    protected Boolean f2530f;

    public h() {
        this(null, p.b.c(), z.a.c(), I.a.o(), null, null);
    }

    public InterfaceC4942i.d a(Class cls) {
        g gVar;
        InterfaceC4942i.d b10;
        Map map = this.f2525a;
        if (map != null && (gVar = (g) map.get(cls)) != null && (b10 = gVar.b()) != null) {
            return !b10.j() ? b10.p(this.f2530f) : b10;
        }
        Boolean bool = this.f2530f;
        return bool == null ? InterfaceC4942i.d.b() : InterfaceC4942i.d.c(bool.booleanValue());
    }

    public g b(Class cls) {
        Map map = this.f2525a;
        if (map == null) {
            return null;
        }
        return (g) map.get(cls);
    }

    public p.b c() {
        return this.f2526b;
    }

    public Boolean d() {
        return this.f2529e;
    }

    public z.a e() {
        return this.f2527c;
    }

    public I f() {
        return this.f2528d;
    }

    protected h(Map map, p.b bVar, z.a aVar, I i10, Boolean bool, Boolean bool2) {
        this.f2525a = map;
        this.f2526b = bVar;
        this.f2527c = aVar;
        this.f2528d = i10;
        this.f2529e = bool;
        this.f2530f = bool2;
    }
}
