package s7;

/* renamed from: s7.l5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4409l5 extends AbstractC4450r5 {

    /* renamed from: a, reason: collision with root package name */
    private String f41323a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f41324b;

    /* renamed from: c, reason: collision with root package name */
    private int f41325c;

    /* renamed from: d, reason: collision with root package name */
    private byte f41326d;

    C4409l5() {
    }

    @Override // s7.AbstractC4450r5
    public final AbstractC4450r5 a(boolean z10) {
        this.f41324b = true;
        this.f41326d = (byte) (1 | this.f41326d);
        return this;
    }

    @Override // s7.AbstractC4450r5
    public final AbstractC4450r5 b(int i10) {
        this.f41325c = 1;
        this.f41326d = (byte) (this.f41326d | 2);
        return this;
    }

    @Override // s7.AbstractC4450r5
    public final AbstractC4457s5 c() {
        String str;
        if (this.f41326d == 3 && (str = this.f41323a) != null) {
            return new C4430o5(str, this.f41324b, this.f41325c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f41323a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f41326d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f41326d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final AbstractC4450r5 d(String str) {
        this.f41323a = "vision-common";
        return this;
    }
}
