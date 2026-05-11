package W1;

import java.util.Arrays;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f11173a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f11174b;

    public d(float[] fArr, int[] iArr) {
        this.f11173a = fArr;
        this.f11174b = iArr;
    }

    private void a(d dVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = dVar.f11174b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f11173a[i10] = dVar.f11173a[i10];
            this.f11174b[i10] = iArr[i10];
            i10++;
        }
    }

    private int c(float f10) {
        int binarySearch = Arrays.binarySearch(this.f11173a, f10);
        if (binarySearch >= 0) {
            return this.f11174b[binarySearch];
        }
        int i10 = -(binarySearch + 1);
        if (i10 == 0) {
            return this.f11174b[0];
        }
        int[] iArr = this.f11174b;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f11173a;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return b2.d.c((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = c(fArr[i10]);
        }
        return new d(fArr, iArr);
    }

    public int[] d() {
        return this.f11174b;
    }

    public float[] e() {
        return this.f11173a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return Arrays.equals(this.f11173a, dVar.f11173a) && Arrays.equals(this.f11174b, dVar.f11174b);
    }

    public int f() {
        return this.f11174b.length;
    }

    public void g(d dVar, d dVar2, float f10) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f10 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f10 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.f11174b.length != dVar2.f11174b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f11174b.length + " vs " + dVar2.f11174b.length + ")");
        }
        int i10 = 0;
        while (true) {
            iArr = dVar.f11174b;
            if (i10 >= iArr.length) {
                break;
            }
            this.f11173a[i10] = b2.k.i(dVar.f11173a[i10], dVar2.f11173a[i10], f10);
            this.f11174b[i10] = b2.d.c(f10, dVar.f11174b[i10], dVar2.f11174b[i10]);
            i10++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f11173a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = dVar.f11174b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f11174b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f11173a) * 31) + Arrays.hashCode(this.f11174b);
    }
}
