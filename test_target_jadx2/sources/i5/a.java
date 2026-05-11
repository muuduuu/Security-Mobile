package I5;

import D5.c;
import D5.j;
import D5.l;
import K5.s;
import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.h;

/* loaded from: classes2.dex */
public class a extends l {

    /* renamed from: c, reason: collision with root package name */
    protected final j f4304c;

    /* renamed from: d, reason: collision with root package name */
    protected transient c f4305d;

    /* renamed from: e, reason: collision with root package name */
    protected transient s f4306e;

    protected a(h hVar, String str, j jVar) {
        super(hVar, str);
        this.f4304c = jVar;
        this.f4305d = null;
        this.f4306e = null;
    }

    public static a q(f fVar, String str, c cVar, s sVar) {
        return new a(fVar, str, cVar, sVar);
    }

    public static a r(f fVar, String str, j jVar) {
        return new a(fVar, str, jVar);
    }

    public static a s(h hVar, String str, j jVar) {
        return new a(hVar, str, jVar);
    }

    protected a(f fVar, String str, j jVar) {
        super(fVar, str);
        this.f4304c = jVar;
        this.f4305d = null;
        this.f4306e = null;
    }

    protected a(f fVar, String str, c cVar, s sVar) {
        super(fVar, str);
        this.f4304c = cVar == null ? null : cVar.m();
        this.f4305d = cVar;
        this.f4306e = sVar;
    }
}
