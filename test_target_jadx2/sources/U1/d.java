package U1;

import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final List f10315a;

    /* renamed from: b, reason: collision with root package name */
    private final char f10316b;

    /* renamed from: c, reason: collision with root package name */
    private final double f10317c;

    /* renamed from: d, reason: collision with root package name */
    private final double f10318d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10319e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10320f;

    public d(List list, char c10, double d10, double d11, String str, String str2) {
        this.f10315a = list;
        this.f10316b = c10;
        this.f10317c = d10;
        this.f10318d = d11;
        this.f10319e = str;
        this.f10320f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List a() {
        return this.f10315a;
    }

    public double b() {
        return this.f10318d;
    }

    public int hashCode() {
        return c(this.f10316b, this.f10320f, this.f10319e);
    }
}
