package g9;

import java.util.List;
import t7.v6;
import t7.w6;

/* renamed from: g9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3202b {

    /* renamed from: a, reason: collision with root package name */
    private final int f33600a;

    /* renamed from: b, reason: collision with root package name */
    private final List f33601b;

    public C3202b(int i10, List list) {
        this.f33600a = i10;
        this.f33601b = list;
    }

    public String toString() {
        v6 a10 = w6.a("FaceContour");
        a10.b("type", this.f33600a);
        a10.c("points", this.f33601b.toArray());
        return a10.toString();
    }
}
