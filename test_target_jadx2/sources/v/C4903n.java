package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* renamed from: v.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4903n extends C4902m {

    /* renamed from: v.n$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f43799a;

        /* renamed from: b, reason: collision with root package name */
        long f43800b = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f43799a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f43799a, aVar.f43799a) && this.f43800b == aVar.f43800b;
        }

        public int hashCode() {
            int hashCode = this.f43799a.hashCode() ^ 31;
            return Long.hashCode(this.f43800b) ^ ((hashCode << 5) - hashCode);
        }
    }

    C4903n(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    static C4903n m(OutputConfiguration outputConfiguration) {
        return new C4903n(new a(outputConfiguration));
    }

    @Override // v.C4902m, v.C4901l, v.C4900k.a
    public void d(long j10) {
        ((a) this.f43801a).f43800b = j10;
    }

    @Override // v.C4902m, v.C4901l, v.C4900k.a
    public String e() {
        return null;
    }

    @Override // v.C4902m, v.C4901l, v.C4900k.a
    public void g(String str) {
        ((OutputConfiguration) i()).setPhysicalCameraId(str);
    }

    @Override // v.C4902m, v.C4901l, v.C4900k.a
    public Object i() {
        y0.f.a(this.f43801a instanceof a);
        return ((a) this.f43801a).f43799a;
    }

    C4903n(Object obj) {
        super(obj);
    }
}
