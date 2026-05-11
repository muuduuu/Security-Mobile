package o0;

import java.util.ArrayList;
import java.util.Arrays;
import p0.o;

/* loaded from: classes.dex */
public abstract class i extends e implements h {

    /* renamed from: K0, reason: collision with root package name */
    public e[] f37801K0 = new e[4];

    /* renamed from: L0, reason: collision with root package name */
    public int f37802L0 = 0;

    @Override // o0.h
    public void a() {
        this.f37802L0 = 0;
        Arrays.fill(this.f37801K0, (Object) null);
    }

    @Override // o0.h
    public void b(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i10 = this.f37802L0 + 1;
        e[] eVarArr = this.f37801K0;
        if (i10 > eVarArr.length) {
            this.f37801K0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f37801K0;
        int i11 = this.f37802L0;
        eVarArr2[i11] = eVar;
        this.f37802L0 = i11 + 1;
    }

    public void n1(ArrayList arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.f37802L0; i11++) {
            oVar.a(this.f37801K0[i11]);
        }
        for (int i12 = 0; i12 < this.f37802L0; i12++) {
            p0.i.a(this.f37801K0[i12], i10, arrayList, oVar);
        }
    }

    public int o1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f37802L0; i13++) {
            e eVar = this.f37801K0[i13];
            if (i10 == 0 && (i12 = eVar.f37688H0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = eVar.f37690I0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    @Override // o0.h
    public void c(f fVar) {
    }
}
