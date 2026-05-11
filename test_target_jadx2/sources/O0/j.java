package o0;

import l0.C3592d;
import o0.e;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f37803a = new boolean[3];

    static void a(f fVar, C3592d c3592d, e eVar) {
        eVar.f37746t = -1;
        eVar.f37748u = -1;
        e.b bVar = fVar.f37707Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f37707Z[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.f37696O.f37668g;
            int U10 = fVar.U() - eVar.f37698Q.f37668g;
            d dVar = eVar.f37696O;
            dVar.f37670i = c3592d.q(dVar);
            d dVar2 = eVar.f37698Q;
            dVar2.f37670i = c3592d.q(dVar2);
            c3592d.f(eVar.f37696O.f37670i, i10);
            c3592d.f(eVar.f37698Q.f37670i, U10);
            eVar.f37746t = 2;
            eVar.L0(i10, U10);
        }
        if (fVar.f37707Z[1] == bVar2 || eVar.f37707Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.f37697P.f37668g;
        int v10 = fVar.v() - eVar.f37699R.f37668g;
        d dVar3 = eVar.f37697P;
        dVar3.f37670i = c3592d.q(dVar3);
        d dVar4 = eVar.f37699R;
        dVar4.f37670i = c3592d.q(dVar4);
        c3592d.f(eVar.f37697P.f37670i, i11);
        c3592d.f(eVar.f37699R.f37670i, v10);
        if (eVar.f37731l0 > 0 || eVar.T() == 8) {
            d dVar5 = eVar.f37700S;
            dVar5.f37670i = c3592d.q(dVar5);
            c3592d.f(eVar.f37700S.f37670i, eVar.f37731l0 + i11);
        }
        eVar.f37748u = 2;
        eVar.b1(i11, v10);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
