package W1;

import O1.C1038i;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class q implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11238a;

    /* renamed from: b, reason: collision with root package name */
    private final List f11239b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11240c;

    public q(String str, List list, boolean z10) {
        this.f11238a = str;
        this.f11239b = list;
        this.f11240c = z10;
    }

    @Override // W1.c
    public Q1.c a(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar) {
        return new Q1.d(oVar, bVar, this, c1038i);
    }

    public List b() {
        return this.f11239b;
    }

    public String c() {
        return this.f11238a;
    }

    public boolean d() {
        return this.f11240c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f11238a + "' Shapes: " + Arrays.toString(this.f11239b.toArray()) + '}';
    }
}
