package o0;

import java.util.ArrayList;
import l0.C3590b;
import l0.C3592d;
import l0.C3597i;
import o0.e;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3737b {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r7 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0035, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x004b, code lost:
    
        if (r7 == 2) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0518 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /* JADX WARN: Type inference failed for: r1v40, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o0.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(f fVar, C3592d c3592d, int i10, int i11, C3738c c3738c) {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        e eVar;
        d dVar;
        d dVar2;
        d dVar3;
        e eVar2;
        int i12;
        e eVar3;
        d dVar4;
        C3597i c3597i;
        C3597i c3597i2;
        e eVar4;
        d dVar5;
        e eVar5;
        C3597i c3597i3;
        e eVar6;
        e eVar7;
        C3597i c3597i4;
        int size;
        int i13;
        ArrayList arrayList2;
        int i14;
        boolean z13;
        boolean z14;
        e eVar8;
        e eVar9;
        int i15;
        int i16 = i10;
        e eVar10 = c3738c.f37640a;
        e eVar11 = c3738c.f37642c;
        e eVar12 = c3738c.f37641b;
        e eVar13 = c3738c.f37643d;
        e eVar14 = c3738c.f37644e;
        float f10 = c3738c.f37650k;
        boolean z15 = fVar.f37707Z[i16] == e.b.WRAP_CONTENT;
        if (i16 == 0) {
            int i17 = eVar14.f37757y0;
            z10 = i17 == 0;
            z11 = i17 == 1;
        } else {
            int i18 = eVar14.f37759z0;
            z10 = i18 == 0;
            z11 = i18 == 1;
        }
        boolean z16 = z11;
        boolean z17 = false;
        boolean z18 = z10;
        ?? r82 = eVar10;
        while (true) {
            if (z17) {
                break;
            }
            d dVar6 = r82.f37704W[i11];
            int i19 = z12 ? 1 : 4;
            int e10 = dVar6.e();
            e.b bVar = r82.f37707Z[i16];
            float f11 = f10;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && r82.f37756y[i16] == 0) {
                z13 = z17;
                z14 = true;
            } else {
                z13 = z17;
                z14 = false;
            }
            d dVar7 = dVar6.f37667f;
            if (dVar7 != null && r82 != eVar10) {
                e10 += dVar7.e();
            }
            int i20 = e10;
            if (!z12 || r82 == eVar10 || r82 == eVar12) {
                eVar8 = eVar14;
            } else {
                eVar8 = eVar14;
                i19 = 8;
            }
            d dVar8 = dVar6.f37667f;
            if (dVar8 != null) {
                if (r82 == eVar12) {
                    eVar9 = eVar10;
                    c3592d.h(dVar6.f37670i, dVar8.f37670i, i20, 6);
                } else {
                    eVar9 = eVar10;
                    c3592d.h(dVar6.f37670i, dVar8.f37670i, i20, 8);
                }
                if (z14 && !z12) {
                    i19 = 5;
                }
                c3592d.e(dVar6.f37670i, dVar6.f37667f.f37670i, i20, (r82 == eVar12 && z12 && r82.f0(i16)) ? 5 : i19);
            } else {
                eVar9 = eVar10;
            }
            if (z15) {
                if (r82.T() == 8 || r82.f37707Z[i16] != bVar2) {
                    i15 = 0;
                } else {
                    d[] dVarArr = r82.f37704W;
                    i15 = 0;
                    c3592d.h(dVarArr[i11 + 1].f37670i, dVarArr[i11].f37670i, 0, 5);
                }
                c3592d.h(r82.f37704W[i11].f37670i, fVar.f37704W[i11].f37670i, i15, 8);
            }
            d dVar9 = r82.f37704W[i11 + 1].f37667f;
            if (dVar9 != null) {
                ?? r12 = dVar9.f37665d;
                d dVar10 = r12.f37704W[i11].f37667f;
                if (dVar10 != null && dVar10.f37665d == r82) {
                    r21 = r12;
                }
            }
            if (r21 != null) {
                r82 = r21;
                z17 = z13;
            } else {
                z17 = true;
            }
            eVar14 = eVar8;
            f10 = f11;
            eVar10 = eVar9;
            r82 = r82;
        }
        e eVar15 = eVar14;
        float f12 = f10;
        e eVar16 = eVar10;
        if (eVar13 != null) {
            int i21 = i11 + 1;
            if (eVar11.f37704W[i21].f37667f != null) {
                d dVar11 = eVar13.f37704W[i21];
                if (eVar13.f37707Z[i16] == e.b.MATCH_CONSTRAINT && eVar13.f37756y[i16] == 0 && !z12) {
                    d dVar12 = dVar11.f37667f;
                    if (dVar12.f37665d == fVar) {
                        c3592d.e(dVar11.f37670i, dVar12.f37670i, -dVar11.e(), 5);
                        c3592d.j(dVar11.f37670i, eVar11.f37704W[i21].f37667f.f37670i, -dVar11.e(), 6);
                        if (z15) {
                            int i22 = i11 + 1;
                            C3597i c3597i5 = fVar.f37704W[i22].f37670i;
                            d dVar13 = eVar11.f37704W[i22];
                            c3592d.h(c3597i5, dVar13.f37670i, dVar13.e(), 8);
                        }
                        arrayList = c3738c.f37647h;
                        if (arrayList != null && (size = arrayList.size()) > 1) {
                            float f13 = (c3738c.f37657r || c3738c.f37659t) ? f12 : c3738c.f37649j;
                            float f14 = 0.0f;
                            float f15 = 0.0f;
                            e eVar17 = null;
                            i13 = 0;
                            while (i13 < size) {
                                e eVar18 = (e) arrayList.get(i13);
                                float f16 = eVar18.f37678C0[i16];
                                if (f16 < f14) {
                                    if (c3738c.f37659t) {
                                        d[] dVarArr2 = eVar18.f37704W;
                                        c3592d.e(dVarArr2[i11 + 1].f37670i, dVarArr2[i11].f37670i, 0, 4);
                                        arrayList2 = arrayList;
                                        i14 = size;
                                        i13++;
                                        size = i14;
                                        arrayList = arrayList2;
                                        f14 = 0.0f;
                                    } else {
                                        f16 = 1.0f;
                                    }
                                }
                                if (f16 == 0.0f) {
                                    d[] dVarArr3 = eVar18.f37704W;
                                    c3592d.e(dVarArr3[i11 + 1].f37670i, dVarArr3[i11].f37670i, 0, 8);
                                    arrayList2 = arrayList;
                                    i14 = size;
                                    i13++;
                                    size = i14;
                                    arrayList = arrayList2;
                                    f14 = 0.0f;
                                } else {
                                    if (eVar17 != null) {
                                        d[] dVarArr4 = eVar17.f37704W;
                                        C3597i c3597i6 = dVarArr4[i11].f37670i;
                                        int i23 = i11 + 1;
                                        C3597i c3597i7 = dVarArr4[i23].f37670i;
                                        d[] dVarArr5 = eVar18.f37704W;
                                        arrayList2 = arrayList;
                                        C3597i c3597i8 = dVarArr5[i11].f37670i;
                                        C3597i c3597i9 = dVarArr5[i23].f37670i;
                                        i14 = size;
                                        C3590b r10 = c3592d.r();
                                        r10.l(f15, f13, f16, c3597i6, c3597i7, c3597i8, c3597i9);
                                        c3592d.d(r10);
                                    } else {
                                        arrayList2 = arrayList;
                                        i14 = size;
                                    }
                                    eVar17 = eVar18;
                                    f15 = f16;
                                    i13++;
                                    size = i14;
                                    arrayList = arrayList2;
                                    f14 = 0.0f;
                                }
                            }
                        }
                        if (eVar12 == null && (eVar12 == eVar13 || z12)) {
                            d dVar14 = eVar16.f37704W[i11];
                            int i24 = i11 + 1;
                            d dVar15 = eVar11.f37704W[i24];
                            d dVar16 = dVar14.f37667f;
                            C3597i c3597i10 = dVar16 != null ? dVar16.f37670i : null;
                            d dVar17 = dVar15.f37667f;
                            C3597i c3597i11 = dVar17 != null ? dVar17.f37670i : null;
                            d dVar18 = eVar12.f37704W[i11];
                            if (eVar13 != null) {
                                dVar15 = eVar13.f37704W[i24];
                            }
                            if (c3597i10 != null && c3597i11 != null) {
                                c3592d.c(dVar18.f37670i, c3597i10, dVar18.e(), i16 == 0 ? eVar15.f37737o0 : eVar15.f37739p0, c3597i11, dVar15.f37670i, dVar15.e(), 7);
                            }
                        } else if (z18 || eVar12 == null) {
                            int i25 = 8;
                            if (z16 && eVar12 != null) {
                                int i26 = c3738c.f37649j;
                                boolean z19 = i26 <= 0 && c3738c.f37648i == i26;
                                e eVar19 = eVar12;
                                eVar = eVar19;
                                while (eVar != null) {
                                    e eVar20 = eVar.f37682E0[i16];
                                    while (eVar20 != null && eVar20.T() == i25) {
                                        eVar20 = eVar20.f37682E0[i16];
                                    }
                                    if (eVar == eVar12 || eVar == eVar13 || eVar20 == null) {
                                        eVar2 = eVar19;
                                        i12 = i25;
                                    } else {
                                        e eVar21 = eVar20 == eVar13 ? null : eVar20;
                                        d dVar19 = eVar.f37704W[i11];
                                        C3597i c3597i12 = dVar19.f37670i;
                                        d dVar20 = dVar19.f37667f;
                                        if (dVar20 != null) {
                                            C3597i c3597i13 = dVar20.f37670i;
                                        }
                                        int i27 = i11 + 1;
                                        C3597i c3597i14 = eVar19.f37704W[i27].f37670i;
                                        int e11 = dVar19.e();
                                        int e12 = eVar.f37704W[i27].e();
                                        if (eVar21 != null) {
                                            dVar4 = eVar21.f37704W[i11];
                                            C3597i c3597i15 = dVar4.f37670i;
                                            eVar3 = eVar21;
                                            d dVar21 = dVar4.f37667f;
                                            c3597i2 = dVar21 != null ? dVar21.f37670i : null;
                                            c3597i = c3597i15;
                                        } else {
                                            eVar3 = eVar21;
                                            dVar4 = eVar13.f37704W[i11];
                                            c3597i = dVar4 != null ? dVar4.f37670i : null;
                                            c3597i2 = eVar.f37704W[i27].f37670i;
                                        }
                                        if (dVar4 != null) {
                                            e12 += dVar4.e();
                                        }
                                        int i28 = e12;
                                        int e13 = eVar19.f37704W[i27].e() + e11;
                                        int i29 = z19 ? 8 : 4;
                                        if (c3597i12 == null || c3597i14 == null || c3597i == null || c3597i2 == null) {
                                            eVar4 = eVar3;
                                            eVar2 = eVar19;
                                            i12 = 8;
                                        } else {
                                            eVar4 = eVar3;
                                            eVar2 = eVar19;
                                            i12 = 8;
                                            c3592d.c(c3597i12, c3597i14, e13, 0.5f, c3597i, c3597i2, i28, i29);
                                        }
                                        eVar20 = eVar4;
                                    }
                                    eVar19 = eVar.T() != i12 ? eVar : eVar2;
                                    eVar = eVar20;
                                    i25 = i12;
                                    i16 = i10;
                                }
                                d dVar22 = eVar12.f37704W[i11];
                                dVar = eVar16.f37704W[i11].f37667f;
                                int i30 = i11 + 1;
                                dVar2 = eVar13.f37704W[i30];
                                dVar3 = eVar11.f37704W[i30].f37667f;
                                if (dVar != null) {
                                    if (eVar12 != eVar13) {
                                        c3592d.e(dVar22.f37670i, dVar.f37670i, dVar22.e(), 5);
                                    } else if (dVar3 != null) {
                                        c3592d.c(dVar22.f37670i, dVar.f37670i, dVar22.e(), 0.5f, dVar2.f37670i, dVar3.f37670i, dVar2.e(), 5);
                                    }
                                }
                                if (dVar3 != null && eVar12 != eVar13) {
                                    c3592d.e(dVar2.f37670i, dVar3.f37670i, -dVar2.e(), 5);
                                }
                            }
                        } else {
                            int i31 = c3738c.f37649j;
                            boolean z20 = i31 > 0 && c3738c.f37648i == i31;
                            e eVar22 = eVar12;
                            e eVar23 = eVar22;
                            while (eVar23 != null) {
                                e eVar24 = eVar23.f37682E0[i16];
                                while (eVar24 != null && eVar24.T() == 8) {
                                    eVar24 = eVar24.f37682E0[i16];
                                }
                                if (eVar24 != null || eVar23 == eVar13) {
                                    d dVar23 = eVar23.f37704W[i11];
                                    C3597i c3597i16 = dVar23.f37670i;
                                    d dVar24 = dVar23.f37667f;
                                    C3597i c3597i17 = dVar24 != null ? dVar24.f37670i : null;
                                    if (eVar22 != eVar23) {
                                        c3597i17 = eVar22.f37704W[i11 + 1].f37670i;
                                    } else if (eVar23 == eVar12) {
                                        d dVar25 = eVar16.f37704W[i11].f37667f;
                                        c3597i17 = dVar25 != null ? dVar25.f37670i : null;
                                    }
                                    int e14 = dVar23.e();
                                    int i32 = i11 + 1;
                                    int e15 = eVar23.f37704W[i32].e();
                                    if (eVar24 != null) {
                                        dVar5 = eVar24.f37704W[i11];
                                        c3597i3 = dVar5.f37670i;
                                    } else {
                                        dVar5 = eVar11.f37704W[i32].f37667f;
                                        if (dVar5 != null) {
                                            c3597i3 = dVar5.f37670i;
                                        } else {
                                            eVar5 = eVar24;
                                            c3597i3 = null;
                                            C3597i c3597i18 = eVar23.f37704W[i32].f37670i;
                                            if (dVar5 != null) {
                                                e15 += dVar5.e();
                                            }
                                            int e16 = e14 + eVar22.f37704W[i32].e();
                                            if (c3597i16 != null || c3597i17 == null || c3597i3 == null || c3597i18 == null) {
                                                eVar6 = eVar5;
                                            } else {
                                                if (eVar23 == eVar12) {
                                                    e16 = eVar12.f37704W[i11].e();
                                                }
                                                int i33 = e16;
                                                eVar6 = eVar5;
                                                eVar7 = eVar22;
                                                c3592d.c(c3597i16, c3597i17, i33, 0.5f, c3597i3, c3597i18, eVar23 == eVar13 ? eVar13.f37704W[i32].e() : e15, z20 ? 8 : 5);
                                                if (eVar23.T() != 8) {
                                                    eVar23 = eVar7;
                                                }
                                                eVar22 = eVar23;
                                                eVar23 = eVar6;
                                            }
                                        }
                                    }
                                    eVar5 = eVar24;
                                    C3597i c3597i182 = eVar23.f37704W[i32].f37670i;
                                    if (dVar5 != null) {
                                    }
                                    int e162 = e14 + eVar22.f37704W[i32].e();
                                    if (c3597i16 != null) {
                                    }
                                    eVar6 = eVar5;
                                } else {
                                    eVar6 = eVar24;
                                }
                                eVar7 = eVar22;
                                if (eVar23.T() != 8) {
                                }
                                eVar22 = eVar23;
                                eVar23 = eVar6;
                            }
                        }
                        if ((z18 && !z16) || eVar12 == null || eVar12 == eVar13) {
                            return;
                        }
                        d[] dVarArr6 = eVar12.f37704W;
                        d dVar26 = dVarArr6[i11];
                        if (eVar13 == null) {
                            eVar13 = eVar12;
                        }
                        int i34 = i11 + 1;
                        d dVar27 = eVar13.f37704W[i34];
                        d dVar28 = dVar26.f37667f;
                        c3597i4 = dVar28 != null ? dVar28.f37670i : null;
                        d dVar29 = dVar27.f37667f;
                        C3597i c3597i19 = dVar29 != null ? dVar29.f37670i : null;
                        if (eVar11 != eVar13) {
                            d dVar30 = eVar11.f37704W[i34].f37667f;
                            c3597i19 = dVar30 != null ? dVar30.f37670i : null;
                        }
                        if (eVar12 == eVar13) {
                            dVar27 = dVarArr6[i34];
                        }
                        if (c3597i4 == null || c3597i19 == null) {
                            return;
                        }
                        c3592d.c(dVar26.f37670i, c3597i4, dVar26.e(), 0.5f, c3597i19, dVar27.f37670i, eVar13.f37704W[i34].e(), 5);
                        return;
                    }
                }
                if (z12) {
                    d dVar31 = dVar11.f37667f;
                    if (dVar31.f37665d == fVar) {
                        c3592d.e(dVar11.f37670i, dVar31.f37670i, -dVar11.e(), 4);
                    }
                }
                c3592d.j(dVar11.f37670i, eVar11.f37704W[i21].f37667f.f37670i, -dVar11.e(), 6);
                if (z15) {
                }
                arrayList = c3738c.f37647h;
                if (arrayList != null) {
                    if (c3738c.f37657r) {
                    }
                    float f142 = 0.0f;
                    float f152 = 0.0f;
                    e eVar172 = null;
                    i13 = 0;
                    while (i13 < size) {
                    }
                }
                if (eVar12 == null) {
                }
                if (z18) {
                }
                int i252 = 8;
                if (z16) {
                    int i262 = c3738c.f37649j;
                    if (i262 <= 0) {
                    }
                    e eVar192 = eVar12;
                    eVar = eVar192;
                    while (eVar != null) {
                    }
                    d dVar222 = eVar12.f37704W[i11];
                    dVar = eVar16.f37704W[i11].f37667f;
                    int i302 = i11 + 1;
                    dVar2 = eVar13.f37704W[i302];
                    dVar3 = eVar11.f37704W[i302].f37667f;
                    if (dVar != null) {
                    }
                    if (dVar3 != null) {
                        c3592d.e(dVar2.f37670i, dVar3.f37670i, -dVar2.e(), 5);
                    }
                }
                if (z18) {
                }
                d[] dVarArr62 = eVar12.f37704W;
                d dVar262 = dVarArr62[i11];
                if (eVar13 == null) {
                }
                int i342 = i11 + 1;
                d dVar272 = eVar13.f37704W[i342];
                d dVar282 = dVar262.f37667f;
                if (dVar282 != null) {
                }
                d dVar292 = dVar272.f37667f;
                if (dVar292 != null) {
                }
                if (eVar11 != eVar13) {
                }
                if (eVar12 == eVar13) {
                }
                if (c3597i4 == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        if (z15) {
        }
        arrayList = c3738c.f37647h;
        if (arrayList != null) {
        }
        if (eVar12 == null) {
        }
        if (z18) {
        }
        int i2522 = 8;
        if (z16) {
        }
        if (z18) {
        }
        d[] dVarArr622 = eVar12.f37704W;
        d dVar2622 = dVarArr622[i11];
        if (eVar13 == null) {
        }
        int i3422 = i11 + 1;
        d dVar2722 = eVar13.f37704W[i3422];
        d dVar2822 = dVar2622.f37667f;
        if (dVar2822 != null) {
        }
        d dVar2922 = dVar2722.f37667f;
        if (dVar2922 != null) {
        }
        if (eVar11 != eVar13) {
        }
        if (eVar12 == eVar13) {
        }
        if (c3597i4 == null) {
        }
    }

    public static void b(f fVar, C3592d c3592d, ArrayList arrayList, int i10) {
        int i11;
        C3738c[] c3738cArr;
        int i12;
        if (i10 == 0) {
            i11 = fVar.f37772V0;
            c3738cArr = fVar.f37775Y0;
            i12 = 0;
        } else {
            i11 = fVar.f37773W0;
            c3738cArr = fVar.f37774X0;
            i12 = 2;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            C3738c c3738c = c3738cArr[i13];
            c3738c.a();
            if (arrayList == null || arrayList.contains(c3738c.f37640a)) {
                a(fVar, c3592d, i10, i12, c3738c);
            }
        }
    }
}
