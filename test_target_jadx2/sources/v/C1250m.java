package V;

import A.I0;
import V.AbstractC1237a0;

/* renamed from: V.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1250m extends AbstractC1237a0 {

    /* renamed from: d, reason: collision with root package name */
    private final int f10657d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC1237a0.a f10658e;

    /* renamed from: f, reason: collision with root package name */
    private final I0.h f10659f;

    C1250m(int i10, AbstractC1237a0.a aVar, I0.h hVar) {
        this.f10657d = i10;
        if (aVar == null) {
            throw new NullPointerException("Null streamState");
        }
        this.f10658e = aVar;
        this.f10659f = hVar;
    }

    @Override // V.AbstractC1237a0
    public int a() {
        return this.f10657d;
    }

    @Override // V.AbstractC1237a0
    public I0.h b() {
        return this.f10659f;
    }

    @Override // V.AbstractC1237a0
    public AbstractC1237a0.a c() {
        return this.f10658e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1237a0)) {
            return false;
        }
        AbstractC1237a0 abstractC1237a0 = (AbstractC1237a0) obj;
        if (this.f10657d == abstractC1237a0.a() && this.f10658e.equals(abstractC1237a0.c())) {
            I0.h hVar = this.f10659f;
            if (hVar == null) {
                if (abstractC1237a0.b() == null) {
                    return true;
                }
            } else if (hVar.equals(abstractC1237a0.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f10657d ^ 1000003) * 1000003) ^ this.f10658e.hashCode()) * 1000003;
        I0.h hVar = this.f10659f;
        return hashCode ^ (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "StreamInfo{id=" + this.f10657d + ", streamState=" + this.f10658e + ", inProgressTransformationInfo=" + this.f10659f + "}";
    }
}
