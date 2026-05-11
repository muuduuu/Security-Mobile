package m2;

import k2.v;
import m2.InterfaceC3646h;

/* renamed from: m2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3645g extends D2.h implements InterfaceC3646h {

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3646h.a f37308e;

    public C3645g(long j10) {
        super(j10);
    }

    @Override // m2.InterfaceC3646h
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // m2.InterfaceC3646h
    public /* bridge */ /* synthetic */ v c(i2.f fVar) {
        return (v) super.l(fVar);
    }

    @Override // m2.InterfaceC3646h
    public /* bridge */ /* synthetic */ v d(i2.f fVar, v vVar) {
        return (v) super.k(fVar, vVar);
    }

    @Override // m2.InterfaceC3646h
    public void e(InterfaceC3646h.a aVar) {
        this.f37308e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // D2.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(v vVar) {
        return vVar == null ? super.i(null) : vVar.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // D2.h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(i2.f fVar, v vVar) {
        InterfaceC3646h.a aVar = this.f37308e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.d(vVar);
    }
}
