package bb;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bb.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1669d {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f18919a;

    public C1669d(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f18919a = uri;
    }

    public final Uri a() {
        return this.f18919a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1669d) && Intrinsics.b(this.f18919a, ((C1669d) obj).f18919a);
    }

    public int hashCode() {
        return this.f18919a.hashCode();
    }

    public String toString() {
        return "ThumbhashModel(uri=" + this.f18919a + ")";
    }
}
