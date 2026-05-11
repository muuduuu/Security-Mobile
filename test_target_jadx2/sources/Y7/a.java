package Y7;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final float f12026a;

    public a(float f10) {
        this.f12026a = f10;
    }

    @Override // Y7.c
    public float a(RectF rectF) {
        return this.f12026a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f12026a == ((a) obj).f12026a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f12026a)});
    }
}
