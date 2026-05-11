package za;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import lc.t;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f45853a;

    /* renamed from: b, reason: collision with root package name */
    private final int f45854b;

    /* renamed from: c, reason: collision with root package name */
    private final int f45855c;

    public h(String base64Image, int i10, int i11) {
        Intrinsics.checkNotNullParameter(base64Image, "base64Image");
        this.f45853a = base64Image;
        this.f45854b = i10;
        this.f45855c = i11;
    }

    public final Bundle a() {
        return androidx.core.os.c.b(t.a("data", this.f45853a), t.a("size", androidx.core.os.c.b(t.a("width", Integer.valueOf(this.f45854b)), t.a("height", Integer.valueOf(this.f45855c)))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.b(this.f45853a, hVar.f45853a) && this.f45854b == hVar.f45854b && this.f45855c == hVar.f45855c;
    }

    public int hashCode() {
        return (((this.f45853a.hashCode() * 31) + Integer.hashCode(this.f45854b)) * 31) + Integer.hashCode(this.f45855c);
    }

    public String toString() {
        return "ImageResult(base64Image=" + this.f45853a + ", width=" + this.f45854b + ", height=" + this.f45855c + ")";
    }
}
