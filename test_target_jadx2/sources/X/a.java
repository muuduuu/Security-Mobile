package X;

import androidx.camera.core.impl.InterfaceC1441i0;
import java.util.List;

/* loaded from: classes.dex */
final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final int f11603a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11604b;

    /* renamed from: c, reason: collision with root package name */
    private final List f11605c;

    /* renamed from: d, reason: collision with root package name */
    private final List f11606d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1441i0.a f11607e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1441i0.c f11608f;

    a(int i10, int i11, List list, List list2, InterfaceC1441i0.a aVar, InterfaceC1441i0.c cVar) {
        this.f11603a = i10;
        this.f11604b = i11;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f11605c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f11606d = list2;
        this.f11607e = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f11608f = cVar;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0
    public int a() {
        return this.f11603a;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0
    public int b() {
        return this.f11604b;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0
    public List c() {
        return this.f11605c;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0
    public List d() {
        return this.f11606d;
    }

    public boolean equals(Object obj) {
        InterfaceC1441i0.a aVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f11603a == gVar.a() && this.f11604b == gVar.b() && this.f11605c.equals(gVar.c()) && this.f11606d.equals(gVar.d()) && ((aVar = this.f11607e) != null ? aVar.equals(gVar.j()) : gVar.j() == null) && this.f11608f.equals(gVar.k());
    }

    public int hashCode() {
        int hashCode = (((((((this.f11603a ^ 1000003) * 1000003) ^ this.f11604b) * 1000003) ^ this.f11605c.hashCode()) * 1000003) ^ this.f11606d.hashCode()) * 1000003;
        InterfaceC1441i0.a aVar = this.f11607e;
        return ((hashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f11608f.hashCode();
    }

    @Override // X.g
    public InterfaceC1441i0.a j() {
        return this.f11607e;
    }

    @Override // X.g
    public InterfaceC1441i0.c k() {
        return this.f11608f;
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f11603a + ", recommendedFileFormat=" + this.f11604b + ", audioProfiles=" + this.f11605c + ", videoProfiles=" + this.f11606d + ", defaultAudioProfile=" + this.f11607e + ", defaultVideoProfile=" + this.f11608f + "}";
    }
}
