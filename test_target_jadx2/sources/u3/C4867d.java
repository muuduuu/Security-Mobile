package u3;

/* renamed from: u3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4867d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f43490a;

    /* renamed from: b, reason: collision with root package name */
    private int f43491b;

    /* renamed from: c, reason: collision with root package name */
    private int f43492c;

    public C4867d() {
        a();
    }

    public void a() {
        this.f43490a = false;
        this.f43491b = 4;
        c();
    }

    public void b() {
        this.f43492c++;
    }

    public void c() {
        this.f43492c = 0;
    }

    public void d(boolean z10) {
        this.f43490a = z10;
    }

    public boolean e() {
        return this.f43490a && this.f43492c < this.f43491b;
    }
}
