package V1;

import c2.C1718a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class c extends p {
    public c(List list) {
        super(b(list));
    }

    private static C1718a a(C1718a c1718a) {
        W1.d dVar = (W1.d) c1718a.f19336b;
        W1.d dVar2 = (W1.d) c1718a.f19337c;
        if (dVar == null || dVar2 == null || dVar.e().length == dVar2.e().length) {
            return c1718a;
        }
        float[] c10 = c(dVar.e(), dVar2.e());
        return c1718a.b(dVar.b(c10), dVar2.b(c10));
    }

    private static List b(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, a((C1718a) list.get(i10)));
        }
        return list;
    }

    static float[] c(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // V1.p, V1.o
    public /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    @Override // V1.o
    public R1.a p() {
        return new R1.e(this.f10786a);
    }

    @Override // V1.p, V1.o
    public /* bridge */ /* synthetic */ List q() {
        return super.q();
    }

    @Override // V1.p
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
