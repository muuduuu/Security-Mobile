package U;

import H.f;
import U.c;
import androidx.lifecycle.InterfaceC1599p;

/* loaded from: classes.dex */
final class a extends c.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1599p f10244a;

    /* renamed from: b, reason: collision with root package name */
    private final f.b f10245b;

    a(InterfaceC1599p interfaceC1599p, f.b bVar) {
        if (interfaceC1599p == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f10244a = interfaceC1599p;
        if (bVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f10245b = bVar;
    }

    @Override // U.c.a
    public f.b b() {
        return this.f10245b;
    }

    @Override // U.c.a
    public InterfaceC1599p c() {
        return this.f10244a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c.a)) {
            return false;
        }
        c.a aVar = (c.a) obj;
        return this.f10244a.equals(aVar.c()) && this.f10245b.equals(aVar.b());
    }

    public int hashCode() {
        return ((this.f10244a.hashCode() ^ 1000003) * 1000003) ^ this.f10245b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f10244a + ", cameraId=" + this.f10245b + "}";
    }
}
