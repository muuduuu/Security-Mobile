package K5;

/* loaded from: classes2.dex */
public abstract class n extends AbstractC0928i {

    /* renamed from: c, reason: collision with root package name */
    protected final p[] f5408c;

    protected n(G g10, p pVar, p[] pVarArr) {
        super(g10, pVar);
        this.f5408c = pVarArr;
    }

    public final m o(int i10) {
        return new m(this, q(i10), this.f5395a, p(i10), i10);
    }

    public final p p(int i10) {
        p[] pVarArr = this.f5408c;
        if (pVarArr == null || i10 < 0 || i10 >= pVarArr.length) {
            return null;
        }
        return pVarArr[i10];
    }

    public abstract D5.j q(int i10);

    protected m r(int i10, p pVar) {
        this.f5408c[i10] = pVar;
        return o(i10);
    }
}
