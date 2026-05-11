package k2;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
class n implements i2.f {

    /* renamed from: b, reason: collision with root package name */
    private final Object f36136b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36137c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36138d;

    /* renamed from: e, reason: collision with root package name */
    private final Class f36139e;

    /* renamed from: f, reason: collision with root package name */
    private final Class f36140f;

    /* renamed from: g, reason: collision with root package name */
    private final i2.f f36141g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f36142h;

    /* renamed from: i, reason: collision with root package name */
    private final i2.h f36143i;

    /* renamed from: j, reason: collision with root package name */
    private int f36144j;

    n(Object obj, i2.f fVar, int i10, int i11, Map map, Class cls, Class cls2, i2.h hVar) {
        this.f36136b = D2.k.d(obj);
        this.f36141g = (i2.f) D2.k.e(fVar, "Signature must not be null");
        this.f36137c = i10;
        this.f36138d = i11;
        this.f36142h = (Map) D2.k.d(map);
        this.f36139e = (Class) D2.k.e(cls, "Resource class must not be null");
        this.f36140f = (Class) D2.k.e(cls2, "Transcode class must not be null");
        this.f36143i = (i2.h) D2.k.d(hVar);
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f36136b.equals(nVar.f36136b) && this.f36141g.equals(nVar.f36141g) && this.f36138d == nVar.f36138d && this.f36137c == nVar.f36137c && this.f36142h.equals(nVar.f36142h) && this.f36139e.equals(nVar.f36139e) && this.f36140f.equals(nVar.f36140f) && this.f36143i.equals(nVar.f36143i);
    }

    @Override // i2.f
    public int hashCode() {
        if (this.f36144j == 0) {
            int hashCode = this.f36136b.hashCode();
            this.f36144j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f36141g.hashCode()) * 31) + this.f36137c) * 31) + this.f36138d;
            this.f36144j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f36142h.hashCode();
            this.f36144j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f36139e.hashCode();
            this.f36144j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f36140f.hashCode();
            this.f36144j = hashCode5;
            this.f36144j = (hashCode5 * 31) + this.f36143i.hashCode();
        }
        return this.f36144j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f36136b + ", width=" + this.f36137c + ", height=" + this.f36138d + ", resourceClass=" + this.f36139e + ", transcodeClass=" + this.f36140f + ", signature=" + this.f36141g + ", hashCode=" + this.f36144j + ", transformations=" + this.f36142h + ", options=" + this.f36143i + '}';
    }
}
