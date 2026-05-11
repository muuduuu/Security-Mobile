package g4;

import java.util.Map;

/* loaded from: classes.dex */
public class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final int f33547a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33548b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33549c;

    /* renamed from: d, reason: collision with root package name */
    private final n f33550d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f33551e;

    public l(int i10, int i11, int i12, n nVar, Map map) {
        this.f33547a = i10;
        this.f33548b = i11;
        this.f33549c = i12;
        this.f33550d = nVar;
        this.f33551e = map;
    }

    @Override // g4.j, N3.a
    public Map getExtras() {
        return this.f33551e;
    }

    @Override // g4.k
    public int getHeight() {
        return this.f33548b;
    }

    @Override // g4.k
    public int getWidth() {
        return this.f33547a;
    }
}
