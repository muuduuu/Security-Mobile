package t7;

/* renamed from: t7.z5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4819z5 extends C5 {

    /* renamed from: a, reason: collision with root package name */
    private String f43328a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f43329b;

    /* renamed from: c, reason: collision with root package name */
    private int f43330c;

    /* renamed from: d, reason: collision with root package name */
    private byte f43331d;

    C4819z5() {
    }

    @Override // t7.C5
    public final C5 a(boolean z10) {
        this.f43329b = true;
        this.f43331d = (byte) (1 | this.f43331d);
        return this;
    }

    @Override // t7.C5
    public final C5 b(int i10) {
        this.f43330c = 1;
        this.f43331d = (byte) (this.f43331d | 2);
        return this;
    }

    @Override // t7.C5
    public final D5 c() {
        String str;
        if (this.f43331d == 3 && (str = this.f43328a) != null) {
            return new B5(str, this.f43329b, this.f43330c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f43328a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f43331d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f43331d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final C5 d(String str) {
        this.f43328a = str;
        return this;
    }
}
