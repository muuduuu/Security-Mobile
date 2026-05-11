package c1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import j0.C3476a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1716b {

    /* renamed from: f, reason: collision with root package name */
    static final c f19302f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List f19303a;

    /* renamed from: b, reason: collision with root package name */
    private final List f19304b;

    /* renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f19306d = new SparseBooleanArray();

    /* renamed from: c, reason: collision with root package name */
    private final Map f19305c = new C3476a();

    /* renamed from: e, reason: collision with root package name */
    private final d f19307e = a();

    /* renamed from: c1.b$a */
    static class a implements c {
        a() {
        }

        private boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        private boolean c(float[] fArr) {
            float f10 = fArr[0];
            return f10 >= 10.0f && f10 <= 37.0f && fArr[1] <= 0.82f;
        }

        private boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        @Override // c1.C1716b.c
        public boolean a(int i10, float[] fArr) {
            return (d(fArr) || b(fArr) || c(fArr)) ? false : true;
        }
    }

    /* renamed from: c1.b$b, reason: collision with other inner class name */
    public static final class C0344b {

        /* renamed from: a, reason: collision with root package name */
        private final List f19308a;

        /* renamed from: b, reason: collision with root package name */
        private final Bitmap f19309b;

        /* renamed from: c, reason: collision with root package name */
        private final List f19310c;

        /* renamed from: d, reason: collision with root package name */
        private int f19311d;

        /* renamed from: e, reason: collision with root package name */
        private int f19312e;

        /* renamed from: f, reason: collision with root package name */
        private int f19313f;

        /* renamed from: g, reason: collision with root package name */
        private final List f19314g;

        /* renamed from: h, reason: collision with root package name */
        private Rect f19315h;

        public C0344b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f19310c = arrayList;
            this.f19311d = 16;
            this.f19312e = 12544;
            this.f19313f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f19314g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C1716b.f19302f);
            this.f19309b = bitmap;
            this.f19308a = null;
            arrayList.add(C1717c.f19325e);
            arrayList.add(C1717c.f19326f);
            arrayList.add(C1717c.f19327g);
            arrayList.add(C1717c.f19328h);
            arrayList.add(C1717c.f19329i);
            arrayList.add(C1717c.f19330j);
        }

        private int[] d(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f19315h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f19315h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i10 = 0; i10 < height2; i10++) {
                Rect rect2 = this.f19315h;
                System.arraycopy(iArr, ((rect2.top + i10) * width) + rect2.left, iArr2, i10 * width2, width2);
            }
            return iArr2;
        }

        private Bitmap e(Bitmap bitmap) {
            int max;
            int i10;
            double d10 = -1.0d;
            if (this.f19312e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i11 = this.f19312e;
                if (width > i11) {
                    d10 = Math.sqrt(i11 / width);
                }
            } else if (this.f19313f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i10 = this.f19313f)) {
                d10 = i10 / max;
            }
            return d10 <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d10), (int) Math.ceil(bitmap.getHeight() * d10), false);
        }

        public C0344b a(c cVar) {
            if (cVar != null) {
                this.f19314g.add(cVar);
            }
            return this;
        }

        public C0344b b() {
            this.f19314g.clear();
            return this;
        }

        public C1716b c() {
            List list;
            c[] cVarArr;
            Bitmap bitmap = this.f19309b;
            if (bitmap != null) {
                Bitmap e10 = e(bitmap);
                Rect rect = this.f19315h;
                if (e10 != this.f19309b && rect != null) {
                    double width = e10.getWidth() / this.f19309b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), e10.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), e10.getHeight());
                }
                int[] d10 = d(e10);
                int i10 = this.f19311d;
                if (this.f19314g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List list2 = this.f19314g;
                    cVarArr = (c[]) list2.toArray(new c[list2.size()]);
                }
                C1715a c1715a = new C1715a(d10, i10, cVarArr);
                if (e10 != this.f19309b) {
                    e10.recycle();
                }
                list = c1715a.d();
            } else {
                list = this.f19308a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C1716b c1716b = new C1716b(list, this.f19310c);
            c1716b.c();
            return c1716b;
        }
    }

    /* renamed from: c1.b$c */
    public interface c {
        boolean a(int i10, float[] fArr);
    }

    /* renamed from: c1.b$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f19316a;

        /* renamed from: b, reason: collision with root package name */
        private final int f19317b;

        /* renamed from: c, reason: collision with root package name */
        private final int f19318c;

        /* renamed from: d, reason: collision with root package name */
        private final int f19319d;

        /* renamed from: e, reason: collision with root package name */
        private final int f19320e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f19321f;

        /* renamed from: g, reason: collision with root package name */
        private int f19322g;

        /* renamed from: h, reason: collision with root package name */
        private int f19323h;

        /* renamed from: i, reason: collision with root package name */
        private float[] f19324i;

        public d(int i10, int i11) {
            this.f19316a = Color.red(i10);
            this.f19317b = Color.green(i10);
            this.f19318c = Color.blue(i10);
            this.f19319d = i10;
            this.f19320e = i11;
        }

        private void a() {
            if (this.f19321f) {
                return;
            }
            int g10 = androidx.core.graphics.d.g(-1, this.f19319d, 4.5f);
            int g11 = androidx.core.graphics.d.g(-1, this.f19319d, 3.0f);
            if (g10 != -1 && g11 != -1) {
                this.f19323h = androidx.core.graphics.d.p(-1, g10);
                this.f19322g = androidx.core.graphics.d.p(-1, g11);
                this.f19321f = true;
                return;
            }
            int g12 = androidx.core.graphics.d.g(-16777216, this.f19319d, 4.5f);
            int g13 = androidx.core.graphics.d.g(-16777216, this.f19319d, 3.0f);
            if (g12 == -1 || g13 == -1) {
                this.f19323h = g10 != -1 ? androidx.core.graphics.d.p(-1, g10) : androidx.core.graphics.d.p(-16777216, g12);
                this.f19322g = g11 != -1 ? androidx.core.graphics.d.p(-1, g11) : androidx.core.graphics.d.p(-16777216, g13);
                this.f19321f = true;
            } else {
                this.f19323h = androidx.core.graphics.d.p(-16777216, g12);
                this.f19322g = androidx.core.graphics.d.p(-16777216, g13);
                this.f19321f = true;
            }
        }

        public int b() {
            a();
            return this.f19323h;
        }

        public float[] c() {
            if (this.f19324i == null) {
                this.f19324i = new float[3];
            }
            androidx.core.graphics.d.a(this.f19316a, this.f19317b, this.f19318c, this.f19324i);
            return this.f19324i;
        }

        public int d() {
            return this.f19320e;
        }

        public int e() {
            return this.f19319d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f19320e == dVar.f19320e && this.f19319d == dVar.f19319d;
        }

        public int f() {
            a();
            return this.f19322g;
        }

        public int hashCode() {
            return (this.f19319d * 31) + this.f19320e;
        }

        public String toString() {
            return d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + "] [HSL: " + Arrays.toString(c()) + "] [Population: " + this.f19320e + "] [Title Text: #" + Integer.toHexString(f()) + "] [Body Text: #" + Integer.toHexString(b()) + ']';
        }
    }

    C1716b(List list, List list2) {
        this.f19303a = list;
        this.f19304b = list2;
    }

    private d a() {
        int size = this.f19303a.size();
        int i10 = Integer.MIN_VALUE;
        d dVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar2 = (d) this.f19303a.get(i11);
            if (dVar2.d() > i10) {
                i10 = dVar2.d();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    public static C0344b b(Bitmap bitmap) {
        return new C0344b(bitmap);
    }

    private float d(d dVar, C1717c c1717c) {
        float[] c10 = dVar.c();
        d dVar2 = this.f19307e;
        return (c1717c.g() > 0.0f ? c1717c.g() * (1.0f - Math.abs(c10[1] - c1717c.i())) : 0.0f) + (c1717c.a() > 0.0f ? c1717c.a() * (1.0f - Math.abs(c10[2] - c1717c.h())) : 0.0f) + (c1717c.f() > 0.0f ? c1717c.f() * (dVar.d() / (dVar2 != null ? dVar2.d() : 1)) : 0.0f);
    }

    private d e(C1717c c1717c) {
        d g10 = g(c1717c);
        if (g10 != null && c1717c.j()) {
            this.f19306d.append(g10.e(), true);
        }
        return g10;
    }

    private d g(C1717c c1717c) {
        int size = this.f19303a.size();
        float f10 = 0.0f;
        d dVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar2 = (d) this.f19303a.get(i10);
            if (h(dVar2, c1717c)) {
                float d10 = d(dVar2, c1717c);
                if (dVar == null || d10 > f10) {
                    dVar = dVar2;
                    f10 = d10;
                }
            }
        }
        return dVar;
    }

    private boolean h(d dVar, C1717c c1717c) {
        float[] c10 = dVar.c();
        return c10[1] >= c1717c.e() && c10[1] <= c1717c.c() && c10[2] >= c1717c.d() && c10[2] <= c1717c.b() && !this.f19306d.get(dVar.e());
    }

    void c() {
        int size = this.f19304b.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1717c c1717c = (C1717c) this.f19304b.get(i10);
            c1717c.k();
            this.f19305c.put(c1717c, e(c1717c));
        }
        this.f19306d.clear();
    }

    public d f() {
        return this.f19307e;
    }
}
