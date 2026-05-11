package N5;

import S5.o;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class h extends f {

    /* renamed from: d, reason: collision with root package name */
    protected final String f6545d;

    /* renamed from: e, reason: collision with root package name */
    protected final String f6546e;

    protected h(D5.j jVar, o oVar, M5.c cVar) {
        super(jVar, oVar, cVar);
        String name = jVar.q().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.f6545d = BuildConfig.FLAVOR;
            this.f6546e = ".";
        } else {
            this.f6546e = name.substring(0, lastIndexOf + 1);
            this.f6545d = name.substring(0, lastIndexOf);
        }
    }

    public static h f(D5.j jVar, F5.l lVar, M5.c cVar) {
        return new h(jVar, lVar.z(), cVar);
    }

    @Override // N5.f, M5.e
    public String b(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this.f6546e) ? name.substring(this.f6546e.length() - 1) : name;
    }
}
