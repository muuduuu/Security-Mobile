package F3;

import android.net.Uri;

/* loaded from: classes.dex */
public class a implements V2.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f2486a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2487b;

    public a(int i10, boolean z10) {
        this.f2486a = "anim://" + i10;
        this.f2487b = z10;
    }

    @Override // V2.d
    public boolean a(Uri uri) {
        return uri.toString().startsWith(this.f2486a);
    }

    @Override // V2.d
    public boolean b() {
        return false;
    }

    @Override // V2.d
    public String c() {
        return this.f2486a;
    }

    @Override // V2.d
    public boolean equals(Object obj) {
        if (!this.f2487b) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f2486a.equals(((a) obj).f2486a);
    }

    @Override // V2.d
    public int hashCode() {
        return !this.f2487b ? super.hashCode() : this.f2486a.hashCode();
    }
}
