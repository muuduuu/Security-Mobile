package Q1;

import R1.a;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class q implements s, a.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.airbnb.lottie.o f8027a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8028b;

    /* renamed from: c, reason: collision with root package name */
    private final R1.a f8029c;

    /* renamed from: d, reason: collision with root package name */
    private W1.o f8030d;

    public q(com.airbnb.lottie.o oVar, X1.b bVar, W1.n nVar) {
        this.f8027a = oVar;
        this.f8028b = nVar.c();
        R1.a p10 = nVar.b().p();
        this.f8029c = p10;
        bVar.i(p10);
        p10.a(this);
    }

    private static int d(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int e(int i10, int i11) {
        return i10 - (d(i10, i11) * i11);
    }

    private W1.o i(W1.o oVar) {
        List a10 = oVar.a();
        boolean d10 = oVar.d();
        int size = a10.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            U1.a aVar = (U1.a) a10.get(size);
            U1.a aVar2 = (U1.a) a10.get(e(size - 1, a10.size()));
            PointF c10 = (size != 0 || d10) ? aVar2.c() : oVar.b();
            i10 = (((size != 0 || d10) ? aVar2.b() : c10).equals(c10) && aVar.a().equals(c10) && !(!oVar.d() && (size == 0 || size == a10.size() - 1))) ? i10 + 2 : i10 + 1;
            size--;
        }
        W1.o oVar2 = this.f8030d;
        if (oVar2 == null || oVar2.a().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new U1.a());
            }
            this.f8030d = new W1.o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f8030d.e(d10);
        return this.f8030d;
    }

    @Override // R1.a.b
    public void a() {
        this.f8027a.invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if (r7 != (r0.size() - 1)) goto L27;
     */
    @Override // Q1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public W1.o g(W1.o oVar) {
        boolean z10;
        List list;
        List a10 = oVar.a();
        if (a10.size() <= 2) {
            return oVar;
        }
        float floatValue = ((Float) this.f8029c.h()).floatValue();
        if (floatValue == 0.0f) {
            return oVar;
        }
        W1.o i10 = i(oVar);
        i10.f(oVar.b().x, oVar.b().y);
        List a11 = i10.a();
        boolean d10 = oVar.d();
        int i11 = 0;
        int i12 = 0;
        while (i11 < a10.size()) {
            U1.a aVar = (U1.a) a10.get(i11);
            U1.a aVar2 = (U1.a) a10.get(e(i11 - 1, a10.size()));
            U1.a aVar3 = (U1.a) a10.get(e(i11 - 2, a10.size()));
            PointF c10 = (i11 != 0 || d10) ? aVar2.c() : oVar.b();
            PointF b10 = (i11 != 0 || d10) ? aVar2.b() : c10;
            PointF a12 = aVar.a();
            PointF c11 = aVar3.c();
            PointF c12 = aVar.c();
            if (!oVar.d()) {
                z10 = true;
                if (i11 != 0) {
                }
                if (b10.equals(c10) || !a12.equals(c10) || z10) {
                    list = a10;
                    U1.a aVar4 = (U1.a) a11.get(e(i12 - 1, a11.size()));
                    U1.a aVar5 = (U1.a) a11.get(i12);
                    aVar4.e(aVar2.b().x, aVar2.b().y);
                    aVar4.f(aVar2.c().x, aVar2.c().y);
                    aVar5.d(aVar.a().x, aVar.a().y);
                    i12++;
                } else {
                    float f10 = c10.x;
                    float f11 = f10 - c11.x;
                    float f12 = c10.y;
                    float f13 = f12 - c11.y;
                    float f14 = c12.x - f10;
                    float f15 = c12.y - f12;
                    list = a10;
                    float hypot = (float) Math.hypot(f11, f13);
                    float hypot2 = (float) Math.hypot(f14, f15);
                    float min = Math.min(floatValue / hypot, 0.5f);
                    float min2 = Math.min(floatValue / hypot2, 0.5f);
                    float f16 = c10.x;
                    float f17 = ((c11.x - f16) * min) + f16;
                    float f18 = c10.y;
                    float f19 = ((c11.y - f18) * min) + f18;
                    float f20 = ((c12.x - f16) * min2) + f16;
                    float f21 = ((c12.y - f18) * min2) + f18;
                    float f22 = f17 - ((f17 - f16) * 0.5519f);
                    float f23 = f19 - ((f19 - f18) * 0.5519f);
                    float f24 = f20 - ((f20 - f16) * 0.5519f);
                    float f25 = f21 - ((f21 - f18) * 0.5519f);
                    U1.a aVar6 = (U1.a) a11.get(e(i12 - 1, a11.size()));
                    U1.a aVar7 = (U1.a) a11.get(i12);
                    aVar6.e(f17, f19);
                    aVar6.f(f17, f19);
                    if (i11 == 0) {
                        i10.f(f17, f19);
                    }
                    aVar7.d(f22, f23);
                    U1.a aVar8 = (U1.a) a11.get(i12 + 1);
                    aVar7.e(f24, f25);
                    aVar7.f(f20, f21);
                    aVar8.d(f20, f21);
                    i12 += 2;
                }
                i11++;
                a10 = list;
            }
            z10 = false;
            if (b10.equals(c10)) {
            }
            list = a10;
            U1.a aVar42 = (U1.a) a11.get(e(i12 - 1, a11.size()));
            U1.a aVar52 = (U1.a) a11.get(i12);
            aVar42.e(aVar2.b().x, aVar2.b().y);
            aVar42.f(aVar2.c().x, aVar2.c().y);
            aVar52.d(aVar.a().x, aVar.a().y);
            i12++;
            i11++;
            a10 = list;
        }
        return i10;
    }

    public R1.a h() {
        return this.f8029c;
    }

    @Override // Q1.c
    public void b(List list, List list2) {
    }
}
