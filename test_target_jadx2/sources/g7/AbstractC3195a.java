package g7;

/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3195a {

    /* renamed from: a, reason: collision with root package name */
    private final int f33562a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33563b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f33564c;

    /* renamed from: g7.a$a, reason: collision with other inner class name */
    public static class C0487a extends AbstractC3195a {
        public C0487a(int i10, String str, Boolean bool) {
            super(i10, str, bool);
        }
    }

    private AbstractC3195a(int i10, String str, Object obj) {
        this.f33562a = i10;
        this.f33563b = str;
        this.f33564c = obj;
        C3197c.a().a(this);
    }

    public static C0487a a(int i10, String str, Boolean bool) {
        return new C0487a(i10, str, bool);
    }
}
