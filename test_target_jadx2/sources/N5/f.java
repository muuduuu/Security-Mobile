package N5;

import S5.o;
import java.util.EnumMap;
import java.util.EnumSet;

/* loaded from: classes2.dex */
public class f extends k {

    /* renamed from: c, reason: collision with root package name */
    protected final M5.c f6543c;

    public f(D5.j jVar, o oVar, M5.c cVar) {
        super(jVar, oVar);
        this.f6543c = cVar;
    }

    public static f e(D5.j jVar, F5.l lVar, M5.c cVar) {
        return new f(jVar, lVar.z(), cVar);
    }

    @Override // M5.e
    public String b(Object obj) {
        return d(obj, obj.getClass(), this.f6556a);
    }

    @Override // M5.e
    public String c(Object obj, Class cls) {
        return d(obj, cls, this.f6556a);
    }

    protected String d(Object obj, Class cls, o oVar) {
        if (T5.f.G(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        return name.startsWith("java.util.") ? obj instanceof EnumSet ? oVar.w(EnumSet.class, T5.f.s((EnumSet) obj)).d() : obj instanceof EnumMap ? oVar.z(EnumMap.class, T5.f.r((EnumMap) obj), Object.class).d() : name : (name.indexOf(36) < 0 || T5.f.A(cls) == null || T5.f.A(this.f6557b.q()) != null) ? name : this.f6557b.q().getName();
    }
}
