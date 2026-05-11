package V2;

import android.net.Uri;
import b3.l;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a, reason: collision with root package name */
    final List f10787a;

    public f(List list) {
        this.f10787a = (List) l.g(list);
    }

    @Override // V2.d
    public boolean a(Uri uri) {
        for (int i10 = 0; i10 < this.f10787a.size(); i10++) {
            if (((d) this.f10787a.get(i10)).a(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // V2.d
    public boolean b() {
        return false;
    }

    @Override // V2.d
    public String c() {
        return ((d) this.f10787a.get(0)).c();
    }

    public List d() {
        return this.f10787a;
    }

    @Override // V2.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f10787a.equals(((f) obj).f10787a);
        }
        return false;
    }

    @Override // V2.d
    public int hashCode() {
        return this.f10787a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f10787a.toString();
    }
}
