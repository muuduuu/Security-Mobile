package vb;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f44217a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44218b;

    /* renamed from: c, reason: collision with root package name */
    private final Intent f44219c;

    public j(int i10, int i11, Intent intent) {
        this.f44217a = i10;
        this.f44218b = i11;
        this.f44219c = intent;
    }

    public final int a() {
        return this.f44217a;
    }

    public final int b() {
        return this.f44218b;
    }

    public final Intent c() {
        return this.f44219c;
    }

    public final Intent d() {
        return this.f44219c;
    }

    public final int e() {
        return this.f44217a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f44217a == jVar.f44217a && this.f44218b == jVar.f44218b && Intrinsics.b(this.f44219c, jVar.f44219c);
    }

    public final int f() {
        return this.f44218b;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f44217a) * 31) + Integer.hashCode(this.f44218b)) * 31;
        Intent intent = this.f44219c;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        return "OnActivityResultPayload(requestCode=" + this.f44217a + ", resultCode=" + this.f44218b + ", data=" + this.f44219c + ")";
    }
}
