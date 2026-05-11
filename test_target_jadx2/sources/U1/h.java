package U1;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f10326a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10327b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10328c;

    public h(String str, float f10, float f11) {
        this.f10326a = str;
        this.f10328c = f11;
        this.f10327b = f10;
    }

    public boolean a(String str) {
        if (this.f10326a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f10326a.endsWith("\r")) {
            String str2 = this.f10326a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
