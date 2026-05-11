package Ta;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f9520a;

    public e(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f9520a = drawable;
    }

    @Override // Ta.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Wa.b a() {
        return new Wa.b(this.f9520a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.b(this.f9520a, ((e) obj).f9520a);
    }

    public int hashCode() {
        return this.f9520a.hashCode();
    }

    public String toString() {
        return "DecodedModelProvider(drawable=" + this.f9520a + ")";
    }
}
