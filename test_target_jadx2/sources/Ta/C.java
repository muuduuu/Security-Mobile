package Ta;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class C implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f9509a;

    public C(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f9509a = uri;
    }

    @Override // Ta.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Uri a() {
        return this.f9509a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && Intrinsics.b(this.f9509a, ((C) obj).f9509a);
    }

    public int hashCode() {
        return this.f9509a.hashCode();
    }

    public String toString() {
        return "UriModelProvider(uri=" + this.f9509a + ")";
    }
}
