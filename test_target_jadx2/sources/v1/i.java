package V1;

import java.util.List;

/* loaded from: classes.dex */
public class i implements o {

    /* renamed from: a, reason: collision with root package name */
    private final b f10763a;

    /* renamed from: b, reason: collision with root package name */
    private final b f10764b;

    public i(b bVar, b bVar2) {
        this.f10763a = bVar;
        this.f10764b = bVar2;
    }

    @Override // V1.o
    public boolean o() {
        return this.f10763a.o() && this.f10764b.o();
    }

    @Override // V1.o
    public R1.a p() {
        return new R1.n(this.f10763a.p(), this.f10764b.p());
    }

    @Override // V1.o
    public List q() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
