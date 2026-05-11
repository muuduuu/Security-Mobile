package p0;

import java.util.ArrayList;
import java.util.Iterator;
import o0.e;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k, reason: collision with root package name */
    ArrayList f38224k;

    /* renamed from: l, reason: collision with root package name */
    private int f38225l;

    public c(o0.e eVar, int i10) {
        super(eVar);
        this.f38224k = new ArrayList();
        this.f38284f = i10;
        q();
    }

    private void q() {
        o0.e eVar;
        o0.e eVar2 = this.f38280b;
        o0.e J10 = eVar2.J(this.f38284f);
        while (true) {
            o0.e eVar3 = J10;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                J10 = eVar2.J(this.f38284f);
            }
        }
        this.f38280b = eVar;
        this.f38224k.add(eVar.L(this.f38284f));
        o0.e H10 = eVar.H(this.f38284f);
        while (H10 != null) {
            this.f38224k.add(H10.L(this.f38284f));
            H10 = H10.H(this.f38284f);
        }
        Iterator it = this.f38224k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            int i10 = this.f38284f;
            if (i10 == 0) {
                pVar.f38280b.f37712c = this;
            } else if (i10 == 1) {
                pVar.f38280b.f37714d = this;
            }
        }
        if (this.f38284f == 0 && ((o0.f) this.f38280b.I()).L1() && this.f38224k.size() > 1) {
            ArrayList arrayList = this.f38224k;
            this.f38280b = ((p) arrayList.get(arrayList.size() - 1)).f38280b;
        }
        this.f38225l = this.f38284f == 0 ? this.f38280b.x() : this.f38280b.Q();
    }

    private o0.e r() {
        for (int i10 = 0; i10 < this.f38224k.size(); i10++) {
            p pVar = (p) this.f38224k.get(i10);
            if (pVar.f38280b.T() != 8) {
                return pVar.f38280b;
            }
        }
        return null;
    }

    private o0.e s() {
        for (int size = this.f38224k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f38224k.get(size);
            if (pVar.f38280b.T() != 8) {
                return pVar.f38280b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x03fe, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    @Override // p0.p, p0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(d dVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f11;
        boolean z11;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        if (this.f38286h.f38244j && this.f38287i.f38244j) {
            o0.e I10 = this.f38280b.I();
            boolean L12 = I10 instanceof o0.f ? ((o0.f) I10).L1() : false;
            int i26 = this.f38287i.f38241g - this.f38286h.f38241g;
            int size = this.f38224k.size();
            int i27 = 0;
            while (true) {
                i10 = -1;
                i11 = 8;
                if (i27 >= size) {
                    i27 = -1;
                    break;
                } else if (((p) this.f38224k.get(i27)).f38280b.T() != 8) {
                    break;
                } else {
                    i27++;
                }
            }
            int i28 = size - 1;
            int i29 = i28;
            while (true) {
                if (i29 < 0) {
                    break;
                }
                if (((p) this.f38224k.get(i29)).f38280b.T() != 8) {
                    i10 = i29;
                    break;
                }
                i29--;
            }
            int i30 = 0;
            while (i30 < 2) {
                int i31 = 0;
                i13 = 0;
                i14 = 0;
                int i32 = 0;
                f10 = 0.0f;
                while (i31 < size) {
                    p pVar = (p) this.f38224k.get(i31);
                    if (pVar.f38280b.T() != i11) {
                        i32++;
                        if (i31 > 0 && i31 >= i27) {
                            i13 += pVar.f38286h.f38240f;
                        }
                        g gVar = pVar.f38283e;
                        int i33 = gVar.f38241g;
                        boolean z12 = pVar.f38282d != e.b.MATCH_CONSTRAINT;
                        if (z12) {
                            int i34 = this.f38284f;
                            if (i34 == 0 && !pVar.f38280b.f37716e.f38283e.f38244j) {
                                return;
                            }
                            if (i34 == 1 && !pVar.f38280b.f37718f.f38283e.f38244j) {
                                return;
                            } else {
                                i24 = i33;
                            }
                        } else {
                            i24 = i33;
                            if (pVar.f38279a == 1 && i30 == 0) {
                                i25 = gVar.f38247m;
                                i14++;
                            } else if (gVar.f38244j) {
                                i25 = i24;
                            }
                            z12 = true;
                            if (z12) {
                                i14++;
                                float f12 = pVar.f38280b.f37678C0[this.f38284f];
                                if (f12 >= 0.0f) {
                                    f10 += f12;
                                }
                            } else {
                                i13 += i25;
                            }
                            if (i31 < i28 && i31 < i10) {
                                i13 += -pVar.f38287i.f38240f;
                            }
                        }
                        i25 = i24;
                        if (z12) {
                        }
                        if (i31 < i28) {
                            i13 += -pVar.f38287i.f38240f;
                        }
                    }
                    i31++;
                    i11 = 8;
                }
                if (i13 < i26 || i14 == 0) {
                    i12 = i32;
                    break;
                } else {
                    i30++;
                    i11 = 8;
                }
            }
            i12 = 0;
            i13 = 0;
            i14 = 0;
            f10 = 0.0f;
            int i35 = this.f38286h.f38241g;
            if (L12) {
                i35 = this.f38287i.f38241g;
            }
            if (i13 > i26) {
                i35 = L12 ? i35 + ((int) (((i13 - i26) / 2.0f) + 0.5f)) : i35 - ((int) (((i13 - i26) / 2.0f) + 0.5f));
            }
            if (i14 > 0) {
                float f13 = i26 - i13;
                int i36 = (int) ((f13 / i14) + 0.5f);
                int i37 = 0;
                int i38 = 0;
                while (i37 < size) {
                    p pVar2 = (p) this.f38224k.get(i37);
                    int i39 = i36;
                    int i40 = i13;
                    if (pVar2.f38280b.T() != 8 && pVar2.f38282d == e.b.MATCH_CONSTRAINT) {
                        g gVar2 = pVar2.f38283e;
                        if (!gVar2.f38244j) {
                            if (f10 > 0.0f) {
                                i19 = i35;
                                i20 = (int) (((pVar2.f38280b.f37678C0[this.f38284f] * f13) / f10) + 0.5f);
                            } else {
                                i19 = i35;
                                i20 = i39;
                            }
                            if (this.f38284f == 0) {
                                o0.e eVar = pVar2.f38280b;
                                f11 = f13;
                                i22 = eVar.f37673A;
                                i21 = eVar.f37758z;
                                z11 = L12;
                            } else {
                                f11 = f13;
                                o0.e eVar2 = pVar2.f38280b;
                                int i41 = eVar2.f37679D;
                                z11 = L12;
                                i21 = eVar2.f37677C;
                                i22 = i41;
                            }
                            i23 = i12;
                            int max = Math.max(i21, pVar2.f38279a == 1 ? Math.min(i20, gVar2.f38247m) : i20);
                            if (i22 > 0) {
                                max = Math.min(i22, max);
                            }
                            if (max != i20) {
                                i38++;
                                i20 = max;
                            }
                            pVar2.f38283e.d(i20);
                            i37++;
                            i36 = i39;
                            i13 = i40;
                            i35 = i19;
                            f13 = f11;
                            L12 = z11;
                            i12 = i23;
                        }
                    }
                    z11 = L12;
                    i23 = i12;
                    i19 = i35;
                    f11 = f13;
                    i37++;
                    i36 = i39;
                    i13 = i40;
                    i35 = i19;
                    f13 = f11;
                    L12 = z11;
                    i12 = i23;
                }
                z10 = L12;
                i15 = i12;
                i16 = i35;
                int i42 = i13;
                if (i38 > 0) {
                    i14 -= i38;
                    i13 = 0;
                    for (int i43 = 0; i43 < size; i43++) {
                        p pVar3 = (p) this.f38224k.get(i43);
                        if (pVar3.f38280b.T() != 8) {
                            if (i43 > 0 && i43 >= i27) {
                                i13 += pVar3.f38286h.f38240f;
                            }
                            i13 += pVar3.f38283e.f38241g;
                            if (i43 < i28 && i43 < i10) {
                                i13 += -pVar3.f38287i.f38240f;
                            }
                        }
                    }
                } else {
                    i13 = i42;
                }
                i18 = 2;
                if (this.f38225l == 2 && i38 == 0) {
                    i17 = 0;
                    this.f38225l = 0;
                } else {
                    i17 = 0;
                }
            } else {
                z10 = L12;
                i15 = i12;
                i16 = i35;
                i17 = 0;
                i18 = 2;
            }
            if (i13 > i26) {
                this.f38225l = i18;
            }
            if (i15 > 0 && i14 == 0 && i27 == i10) {
                this.f38225l = i18;
            }
            int i44 = this.f38225l;
            if (i44 == 1) {
                int i45 = i15;
                int i46 = i45 > 1 ? (i26 - i13) / (i45 - 1) : i45 == 1 ? (i26 - i13) / 2 : i17;
                if (i14 > 0) {
                    i46 = i17;
                }
                int i47 = i16;
                for (int i48 = i17; i48 < size; i48++) {
                    p pVar4 = (p) this.f38224k.get(z10 ? size - (i48 + 1) : i48);
                    if (pVar4.f38280b.T() == 8) {
                        pVar4.f38286h.d(i47);
                        pVar4.f38287i.d(i47);
                    } else {
                        if (i48 > 0) {
                            i47 = z10 ? i47 - i46 : i47 + i46;
                        }
                        if (i48 > 0 && i48 >= i27) {
                            i47 = z10 ? i47 - pVar4.f38286h.f38240f : i47 + pVar4.f38286h.f38240f;
                        }
                        if (z10) {
                            pVar4.f38287i.d(i47);
                        } else {
                            pVar4.f38286h.d(i47);
                        }
                        g gVar3 = pVar4.f38283e;
                        int i49 = gVar3.f38241g;
                        if (pVar4.f38282d == e.b.MATCH_CONSTRAINT && pVar4.f38279a == 1) {
                            i49 = gVar3.f38247m;
                        }
                        i47 = z10 ? i47 - i49 : i47 + i49;
                        if (z10) {
                            pVar4.f38286h.d(i47);
                        } else {
                            pVar4.f38287i.d(i47);
                        }
                        pVar4.f38285g = true;
                        if (i48 < i28 && i48 < i10) {
                            i47 = z10 ? i47 - (-pVar4.f38287i.f38240f) : i47 + (-pVar4.f38287i.f38240f);
                        }
                    }
                }
                return;
            }
            int i50 = i15;
            if (i44 == 0) {
                int i51 = (i26 - i13) / (i50 + 1);
                if (i14 > 0) {
                    i51 = i17;
                }
                int i52 = i16;
                for (int i53 = i17; i53 < size; i53++) {
                    p pVar5 = (p) this.f38224k.get(z10 ? size - (i53 + 1) : i53);
                    if (pVar5.f38280b.T() == 8) {
                        pVar5.f38286h.d(i52);
                        pVar5.f38287i.d(i52);
                    } else {
                        int i54 = z10 ? i52 - i51 : i52 + i51;
                        if (i53 > 0 && i53 >= i27) {
                            i54 = z10 ? i54 - pVar5.f38286h.f38240f : i54 + pVar5.f38286h.f38240f;
                        }
                        if (z10) {
                            pVar5.f38287i.d(i54);
                        } else {
                            pVar5.f38286h.d(i54);
                        }
                        g gVar4 = pVar5.f38283e;
                        int i55 = gVar4.f38241g;
                        if (pVar5.f38282d == e.b.MATCH_CONSTRAINT && pVar5.f38279a == 1) {
                            i55 = Math.min(i55, gVar4.f38247m);
                        }
                        i52 = z10 ? i54 - i55 : i54 + i55;
                        if (z10) {
                            pVar5.f38286h.d(i52);
                        } else {
                            pVar5.f38287i.d(i52);
                        }
                        if (i53 < i28 && i53 < i10) {
                            i52 = z10 ? i52 - (-pVar5.f38287i.f38240f) : i52 + (-pVar5.f38287i.f38240f);
                        }
                    }
                }
                return;
            }
            if (i44 == 2) {
                float w10 = this.f38284f == 0 ? this.f38280b.w() : this.f38280b.P();
                if (z10) {
                    w10 = 1.0f - w10;
                }
                int i56 = (int) (((i26 - i13) * w10) + 0.5f);
                if (i56 < 0 || i14 > 0) {
                    i56 = i17;
                }
                int i57 = z10 ? i16 - i56 : i16 + i56;
                for (int i58 = i17; i58 < size; i58++) {
                    p pVar6 = (p) this.f38224k.get(z10 ? size - (i58 + 1) : i58);
                    if (pVar6.f38280b.T() == 8) {
                        pVar6.f38286h.d(i57);
                        pVar6.f38287i.d(i57);
                    } else {
                        if (i58 > 0 && i58 >= i27) {
                            i57 = z10 ? i57 - pVar6.f38286h.f38240f : i57 + pVar6.f38286h.f38240f;
                        }
                        if (z10) {
                            pVar6.f38287i.d(i57);
                        } else {
                            pVar6.f38286h.d(i57);
                        }
                        g gVar5 = pVar6.f38283e;
                        int i59 = gVar5.f38241g;
                        if (pVar6.f38282d == e.b.MATCH_CONSTRAINT && pVar6.f38279a == 1) {
                            i59 = gVar5.f38247m;
                        }
                        i57 += i59;
                        if (z10) {
                            pVar6.f38286h.d(i57);
                        } else {
                            pVar6.f38287i.d(i57);
                        }
                        if (i58 < i28 && i58 < i10) {
                            i57 = z10 ? i57 - (-pVar6.f38287i.f38240f) : i57 + (-pVar6.f38287i.f38240f);
                        }
                    }
                }
            }
        }
    }

    @Override // p0.p
    void d() {
        Iterator it = this.f38224k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
        int size = this.f38224k.size();
        if (size < 1) {
            return;
        }
        o0.e eVar = ((p) this.f38224k.get(0)).f38280b;
        o0.e eVar2 = ((p) this.f38224k.get(size - 1)).f38280b;
        if (this.f38284f == 0) {
            o0.d dVar = eVar.f37696O;
            o0.d dVar2 = eVar2.f37698Q;
            f i10 = i(dVar, 0);
            int e10 = dVar.e();
            o0.e r10 = r();
            if (r10 != null) {
                e10 = r10.f37696O.e();
            }
            if (i10 != null) {
                b(this.f38286h, i10, e10);
            }
            f i11 = i(dVar2, 0);
            int e11 = dVar2.e();
            o0.e s10 = s();
            if (s10 != null) {
                e11 = s10.f37698Q.e();
            }
            if (i11 != null) {
                b(this.f38287i, i11, -e11);
            }
        } else {
            o0.d dVar3 = eVar.f37697P;
            o0.d dVar4 = eVar2.f37699R;
            f i12 = i(dVar3, 1);
            int e12 = dVar3.e();
            o0.e r11 = r();
            if (r11 != null) {
                e12 = r11.f37697P.e();
            }
            if (i12 != null) {
                b(this.f38286h, i12, e12);
            }
            f i13 = i(dVar4, 1);
            int e13 = dVar4.e();
            o0.e s11 = s();
            if (s11 != null) {
                e13 = s11.f37699R.e();
            }
            if (i13 != null) {
                b(this.f38287i, i13, -e13);
            }
        }
        this.f38286h.f38235a = this;
        this.f38287i.f38235a = this;
    }

    @Override // p0.p
    public void e() {
        for (int i10 = 0; i10 < this.f38224k.size(); i10++) {
            ((p) this.f38224k.get(i10)).e();
        }
    }

    @Override // p0.p
    void f() {
        this.f38281c = null;
        Iterator it = this.f38224k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // p0.p
    public long j() {
        int size = this.f38224k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f38286h.f38240f + ((p) this.f38224k.get(i10)).j() + r4.f38287i.f38240f;
        }
        return j10;
    }

    @Override // p0.p
    boolean m() {
        int size = this.f38224k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((p) this.f38224k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f38284f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f38224k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            sb2.append("<");
            sb2.append(pVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
