package q7;

/* loaded from: classes2.dex */
final class E extends I {

    /* renamed from: a, reason: collision with root package name */
    private String f38768a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f38769b;

    /* renamed from: c, reason: collision with root package name */
    private int f38770c;

    /* renamed from: d, reason: collision with root package name */
    private byte f38771d;

    E() {
    }

    @Override // q7.I
    public final I a(boolean z10) {
        this.f38769b = true;
        this.f38771d = (byte) (1 | this.f38771d);
        return this;
    }

    @Override // q7.I
    public final I b(int i10) {
        this.f38770c = 1;
        this.f38771d = (byte) (this.f38771d | 2);
        return this;
    }

    @Override // q7.I
    public final J c() {
        String str;
        if (this.f38771d == 3 && (str = this.f38768a) != null) {
            return new G(str, this.f38769b, this.f38770c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f38768a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f38771d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f38771d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final I d(String str) {
        this.f38768a = "common";
        return this;
    }
}
