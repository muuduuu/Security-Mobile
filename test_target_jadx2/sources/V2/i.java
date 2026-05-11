package V2;

import android.net.Uri;
import b3.l;

/* loaded from: classes.dex */
public class i implements d {

    /* renamed from: a, reason: collision with root package name */
    final String f10790a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f10791b;

    public i(String str) {
        this(str, false);
    }

    @Override // V2.d
    public boolean a(Uri uri) {
        return this.f10790a.contains(uri.toString());
    }

    @Override // V2.d
    public boolean b() {
        return this.f10791b;
    }

    @Override // V2.d
    public String c() {
        return this.f10790a;
    }

    @Override // V2.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f10790a.equals(((i) obj).f10790a);
        }
        return false;
    }

    @Override // V2.d
    public int hashCode() {
        return this.f10790a.hashCode();
    }

    public String toString() {
        return this.f10790a;
    }

    public i(String str, boolean z10) {
        this.f10790a = (String) l.g(str);
        this.f10791b = z10;
    }
}
