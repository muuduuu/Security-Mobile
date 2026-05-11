package Z1;

import a2.AbstractC1346c;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final H f12289a = new H();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1346c.a f12290b = AbstractC1346c.a.a("c", "v", "i", "o");

    private H() {
    }

    @Override // Z1.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W1.o a(AbstractC1346c abstractC1346c, float f10) {
        if (abstractC1346c.p() == AbstractC1346c.b.BEGIN_ARRAY) {
            abstractC1346c.b();
        }
        abstractC1346c.c();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z10 = false;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12290b);
            if (r10 == 0) {
                z10 = abstractC1346c.g();
            } else if (r10 == 1) {
                list = s.f(abstractC1346c, f10);
            } else if (r10 == 2) {
                list2 = s.f(abstractC1346c, f10);
            } else if (r10 != 3) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                list3 = s.f(abstractC1346c, f10);
            }
        }
        abstractC1346c.e();
        if (abstractC1346c.p() == AbstractC1346c.b.END_ARRAY) {
            abstractC1346c.d();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new W1.o(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = (PointF) list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = (PointF) list.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new U1.a(b2.k.a((PointF) list.get(i11), (PointF) list3.get(i11)), b2.k.a(pointF2, (PointF) list2.get(i10)), pointF2));
        }
        if (z10) {
            PointF pointF3 = (PointF) list.get(0);
            int i12 = size - 1;
            arrayList.add(new U1.a(b2.k.a((PointF) list.get(i12), (PointF) list3.get(i12)), b2.k.a(pointF3, (PointF) list2.get(0)), pointF3));
        }
        return new W1.o(pointF, z10, arrayList);
    }
}
