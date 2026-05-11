package b2;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private float f18533a;

    /* renamed from: b, reason: collision with root package name */
    private int f18534b;

    public void a(float f10) {
        float f11 = this.f18533a + f10;
        this.f18533a = f11;
        int i10 = this.f18534b + 1;
        this.f18534b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f18533a = f11 / 2.0f;
            this.f18534b = i10 / 2;
        }
    }
}
