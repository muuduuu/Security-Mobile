package V;

import android.net.Uri;

/* renamed from: V.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1245h extends AbstractC1256t {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f10630a;

    C1245h(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.f10630a = uri;
    }

    @Override // V.AbstractC1256t
    public Uri a() {
        return this.f10630a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1256t) {
            return this.f10630a.equals(((AbstractC1256t) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f10630a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.f10630a + "}";
    }
}
