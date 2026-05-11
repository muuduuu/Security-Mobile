package R;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: g, reason: collision with root package name */
    private final int f8349g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8350h;

    /* renamed from: i, reason: collision with root package name */
    private final int f8351i;

    /* renamed from: j, reason: collision with root package name */
    private final String f8352j;

    a(int i10, int i11, int i12, String str) {
        this.f8349g = i10;
        this.f8350h = i11;
        this.f8351i = i12;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.f8352j = str;
    }

    @Override // R.e
    String n() {
        return this.f8352j;
    }

    @Override // R.e
    public int o() {
        return this.f8349g;
    }

    @Override // R.e
    int p() {
        return this.f8350h;
    }

    @Override // R.e
    int q() {
        return this.f8351i;
    }
}
