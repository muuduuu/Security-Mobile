package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* renamed from: v.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4902m extends C4901l {

    /* renamed from: v.m$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f43796a;

        /* renamed from: b, reason: collision with root package name */
        String f43797b;

        /* renamed from: c, reason: collision with root package name */
        long f43798c = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f43796a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f43796a, aVar.f43796a) && this.f43798c == aVar.f43798c && Objects.equals(this.f43797b, aVar.f43797b);
        }

        public int hashCode() {
            int hashCode = this.f43796a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            String str = this.f43797b;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
            return Long.hashCode(this.f43798c) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    C4902m(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    static C4902m l(OutputConfiguration outputConfiguration) {
        return new C4902m(new a(outputConfiguration));
    }

    @Override // v.AbstractC4905p, v.C4900k.a
    public void c(Surface surface) {
        ((OutputConfiguration) i()).addSurface(surface);
    }

    @Override // v.C4901l, v.C4900k.a
    public void d(long j10) {
        ((a) this.f43801a).f43798c = j10;
    }

    @Override // v.C4901l, v.C4900k.a
    public String e() {
        return ((a) this.f43801a).f43797b;
    }

    @Override // v.C4901l, v.C4900k.a
    public void f() {
        ((OutputConfiguration) i()).enableSurfaceSharing();
    }

    @Override // v.C4901l, v.C4900k.a
    public void g(String str) {
        ((a) this.f43801a).f43797b = str;
    }

    @Override // v.C4901l, v.C4900k.a
    public Object i() {
        y0.f.a(this.f43801a instanceof a);
        return ((a) this.f43801a).f43796a;
    }

    @Override // v.C4901l, v.AbstractC4905p
    final boolean j() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    C4902m(Object obj) {
        super(obj);
    }
}
