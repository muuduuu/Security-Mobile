package Ta;

import android.net.Uri;
import bb.C1669d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f9667a;

    public z(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f9667a = uri;
    }

    @Override // Ta.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1669d a() {
        return new C1669d(this.f9667a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.b(this.f9667a, ((z) obj).f9667a);
    }

    public int hashCode() {
        return this.f9667a.hashCode();
    }

    public String toString() {
        return "ThumbhashModelProvider(uri=" + this.f9667a + ")";
    }
}
