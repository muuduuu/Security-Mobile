package Be;

import ze.D;

/* loaded from: classes3.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private String f580a;

    public c(String str) {
        this.f580a = str;
    }

    @Override // Be.a
    public boolean a(D d10) {
        if (d10 == null) {
            return false;
        }
        return d10.e().equalsIgnoreCase(this.f580a);
    }
}
