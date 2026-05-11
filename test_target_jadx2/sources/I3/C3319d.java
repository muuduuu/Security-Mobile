package i3;

/* renamed from: i3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3319d implements InterfaceC3316a {

    /* renamed from: a, reason: collision with root package name */
    private static final C3319d f34136a = new C3319d();

    private C3319d() {
    }

    public static C3319d a() {
        return f34136a;
    }

    @Override // i3.InterfaceC3316a
    public long now() {
        return System.currentTimeMillis();
    }
}
