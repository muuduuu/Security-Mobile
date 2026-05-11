package r7;

/* renamed from: r7.e8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4078e8 extends AbstractC4128j8 {

    /* renamed from: a, reason: collision with root package name */
    private String f39991a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39992b;

    /* renamed from: c, reason: collision with root package name */
    private int f39993c;

    /* renamed from: d, reason: collision with root package name */
    private byte f39994d;

    C4078e8() {
    }

    @Override // r7.AbstractC4128j8
    public final AbstractC4128j8 a(boolean z10) {
        this.f39992b = true;
        this.f39994d = (byte) (1 | this.f39994d);
        return this;
    }

    @Override // r7.AbstractC4128j8
    public final AbstractC4128j8 b(int i10) {
        this.f39993c = 1;
        this.f39994d = (byte) (this.f39994d | 2);
        return this;
    }

    @Override // r7.AbstractC4128j8
    public final AbstractC4138k8 c() {
        String str;
        if (this.f39994d == 3 && (str = this.f39991a) != null) {
            return new C4098g8(str, this.f39992b, this.f39993c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f39991a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f39994d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f39994d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final AbstractC4128j8 d(String str) {
        this.f39991a = str;
        return this;
    }
}
