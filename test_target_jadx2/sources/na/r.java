package na;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final float f37621a;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final int f37622a;

        /* renamed from: b, reason: collision with root package name */
        final int f37623b;

        /* renamed from: c, reason: collision with root package name */
        final float f37624c;

        a(int i10, int i11, float f10) {
            this.f37622a = i10;
            this.f37623b = i11;
            this.f37624c = f10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f37622a == aVar.f37622a && this.f37623b == aVar.f37623b && Float.compare(aVar.f37624c, this.f37624c) == 0;
        }

        public int hashCode() {
            int i10 = ((this.f37622a * 31) + this.f37623b) * 31;
            float f10 = this.f37624c;
            return i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
        }

        public String toString() {
            return "Size{width=" + this.f37622a + ", height=" + this.f37623b + ", scaleFactor=" + this.f37624c + '}';
        }
    }

    public r(float f10) {
        this.f37621a = f10;
    }

    private int a(float f10) {
        return (int) Math.ceil(f10 / this.f37621a);
    }

    private int c(int i10) {
        int i11 = i10 % 64;
        return i11 == 0 ? i10 : (i10 - i11) + 64;
    }

    boolean b(int i10, int i11) {
        return a((float) i11) == 0 || a((float) i10) == 0;
    }

    a d(int i10, int i11) {
        float f10 = i10;
        int c10 = c(a(f10));
        return new a(c10, (int) Math.ceil(i11 / r4), f10 / c10);
    }
}
