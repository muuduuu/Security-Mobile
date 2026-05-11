package Y7;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final c f12027a;

    /* renamed from: b, reason: collision with root package name */
    private final float f12028b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f12027a;
            f10 += ((b) cVar).f12028b;
        }
        this.f12027a = cVar;
        this.f12028b = f10;
    }

    @Override // Y7.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f12027a.a(rectF) + this.f12028b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12027a.equals(bVar.f12027a) && this.f12028b == bVar.f12028b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12027a, Float.valueOf(this.f12028b)});
    }
}
