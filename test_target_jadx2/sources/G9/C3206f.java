package g9;

import android.graphics.PointF;
import t7.v6;
import t7.w6;

/* renamed from: g9.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3206f {

    /* renamed from: a, reason: collision with root package name */
    private final int f33616a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f33617b;

    C3206f(int i10, PointF pointF) {
        this.f33616a = i10;
        this.f33617b = pointF;
    }

    public String toString() {
        v6 a10 = w6.a("FaceLandmark");
        a10.b("type", this.f33616a);
        a10.c("position", this.f33617b);
        return a10.toString();
    }
}
