package Y7;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    private final float f12080a;

    public i(float f10) {
        this.f12080a = f10;
    }

    @Override // Y7.c
    public float a(RectF rectF) {
        return this.f12080a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f12080a == ((i) obj).f12080a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f12080a)});
    }
}
