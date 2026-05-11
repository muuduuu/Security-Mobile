package Ta;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ta.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1196a implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f9511a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9512b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9513c;

    public C1196a(Uri uri, int i10, int i11) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f9511a = uri;
        this.f9512b = i10;
        this.f9513c = i11;
    }

    @Override // Ta.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Ua.d a() {
        return new Ua.d(this.f9511a, this.f9512b, this.f9513c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1196a)) {
            return false;
        }
        C1196a c1196a = (C1196a) obj;
        return Intrinsics.b(this.f9511a, c1196a.f9511a) && this.f9512b == c1196a.f9512b && this.f9513c == c1196a.f9513c;
    }

    public int hashCode() {
        return (((this.f9511a.hashCode() * 31) + Integer.hashCode(this.f9512b)) * 31) + Integer.hashCode(this.f9513c);
    }

    public String toString() {
        return "BlurhashModelProvider(uri=" + this.f9511a + ", width=" + this.f9512b + ", height=" + this.f9513c + ")";
    }
}
