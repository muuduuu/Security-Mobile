package Ua;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f10396a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10397b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10398c;

    public d(Uri uri, int i10, int i11) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f10396a = uri;
        this.f10397b = i10;
        this.f10398c = i11;
    }

    public final int a() {
        return this.f10398c;
    }

    public final Uri b() {
        return this.f10396a;
    }

    public final int c() {
        return this.f10397b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.b(this.f10396a, dVar.f10396a) && this.f10397b == dVar.f10397b && this.f10398c == dVar.f10398c;
    }

    public int hashCode() {
        return (((this.f10396a.hashCode() * 31) + Integer.hashCode(this.f10397b)) * 31) + Integer.hashCode(this.f10398c);
    }

    public String toString() {
        return "BlurhashModel(uri=" + this.f10396a + ", width=" + this.f10397b + ", height=" + this.f10398c + ")";
    }
}
