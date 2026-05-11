package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4901l extends AbstractC4905p {

    /* renamed from: v.l$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f43792a;

        /* renamed from: b, reason: collision with root package name */
        String f43793b;

        /* renamed from: c, reason: collision with root package name */
        boolean f43794c;

        /* renamed from: d, reason: collision with root package name */
        long f43795d = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f43792a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f43792a, aVar.f43792a) && this.f43794c == aVar.f43794c && this.f43795d == aVar.f43795d && Objects.equals(this.f43793b, aVar.f43793b);
        }

        public int hashCode() {
            int hashCode = this.f43792a.hashCode() ^ 31;
            int i10 = (this.f43794c ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i11 = (i10 << 5) - i10;
            String str = this.f43793b;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i11;
            return Long.hashCode(this.f43795d) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    C4901l(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    static C4901l k(OutputConfiguration outputConfiguration) {
        return new C4901l(new a(outputConfiguration));
    }

    @Override // v.AbstractC4905p, v.C4900k.a
    public Surface a() {
        return ((OutputConfiguration) i()).getSurface();
    }

    @Override // v.C4900k.a
    public void d(long j10) {
        ((a) this.f43801a).f43795d = j10;
    }

    @Override // v.C4900k.a
    public String e() {
        return ((a) this.f43801a).f43793b;
    }

    @Override // v.C4900k.a
    public void f() {
        ((a) this.f43801a).f43794c = true;
    }

    @Override // v.C4900k.a
    public void g(String str) {
        ((a) this.f43801a).f43793b = str;
    }

    @Override // v.C4900k.a
    public Object i() {
        y0.f.a(this.f43801a instanceof a);
        return ((a) this.f43801a).f43792a;
    }

    @Override // v.AbstractC4905p
    boolean j() {
        return ((a) this.f43801a).f43794c;
    }

    C4901l(Object obj) {
        super(obj);
    }
}
