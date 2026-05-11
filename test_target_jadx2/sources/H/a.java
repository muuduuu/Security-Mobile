package H;

import H.f;
import androidx.camera.core.impl.AbstractC1449m0;

/* loaded from: classes.dex */
final class a extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f3030a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1449m0 f3031b;

    a(String str, AbstractC1449m0 abstractC1449m0) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f3030a = str;
        if (abstractC1449m0 == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.f3031b = abstractC1449m0;
    }

    @Override // H.f.b
    public AbstractC1449m0 b() {
        return this.f3031b;
    }

    @Override // H.f.b
    public String c() {
        return this.f3030a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f3030a.equals(bVar.c()) && this.f3031b.equals(bVar.b());
    }

    public int hashCode() {
        return ((this.f3030a.hashCode() ^ 1000003) * 1000003) ^ this.f3031b.hashCode();
    }

    public String toString() {
        return "CameraId{cameraIdString=" + this.f3030a + ", cameraConfigId=" + this.f3031b + "}";
    }
}
