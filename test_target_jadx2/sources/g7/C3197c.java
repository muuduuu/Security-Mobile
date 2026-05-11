package g7;

/* renamed from: g7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3197c {

    /* renamed from: c, reason: collision with root package name */
    private static C3197c f33568c;

    /* renamed from: a, reason: collision with root package name */
    private final C3196b f33569a = new C3196b();

    /* renamed from: b, reason: collision with root package name */
    private final e f33570b = new e();

    static {
        C3197c c3197c = new C3197c();
        synchronized (C3197c.class) {
            f33568c = c3197c;
        }
    }

    private C3197c() {
    }

    public static C3196b a() {
        return b().f33569a;
    }

    private static C3197c b() {
        C3197c c3197c;
        synchronized (C3197c.class) {
            c3197c = f33568c;
        }
        return c3197c;
    }
}
