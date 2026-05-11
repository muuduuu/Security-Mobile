package ze;

import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
class z extends D {

    /* renamed from: q, reason: collision with root package name */
    private l f46015q;

    /* renamed from: r, reason: collision with root package name */
    private k f46016r;

    /* renamed from: s, reason: collision with root package name */
    private D f46017s;

    public z(l lVar, D d10) {
        super(BuildConfig.FLAVOR);
        this.f46015q = lVar;
        this.f46017s = d10;
    }

    public InterfaceC5277b K() {
        l lVar = this.f46015q;
        return lVar != null ? lVar : this.f46016r;
    }

    @Override // ze.AbstractC5276a
    public D c() {
        return null;
    }

    @Override // ze.D
    public boolean z() {
        this.f46017s.y(K());
        return true;
    }

    public z(k kVar, D d10) {
        super(BuildConfig.FLAVOR);
        this.f46016r = kVar;
        this.f46017s = d10;
    }
}
