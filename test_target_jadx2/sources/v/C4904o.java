package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* renamed from: v.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4904o extends C4903n {
    C4904o(int i10, Surface surface) {
        this(new OutputConfiguration(i10, surface));
    }

    static C4904o n(OutputConfiguration outputConfiguration) {
        return new C4904o(outputConfiguration);
    }

    @Override // v.C4901l, v.AbstractC4905p, v.C4900k.a
    public /* bridge */ /* synthetic */ Surface a() {
        return super.a();
    }

    @Override // v.AbstractC4905p, v.C4900k.a
    public void b(long j10) {
        if (j10 == -1) {
            return;
        }
        ((OutputConfiguration) i()).setStreamUseCase(j10);
    }

    @Override // v.C4902m, v.AbstractC4905p, v.C4900k.a
    public /* bridge */ /* synthetic */ void c(Surface surface) {
        super.c(surface);
    }

    @Override // v.C4903n, v.C4902m, v.C4901l, v.C4900k.a
    public void d(long j10) {
        ((OutputConfiguration) i()).setDynamicRangeProfile(j10);
    }

    @Override // v.C4903n, v.C4902m, v.C4901l, v.C4900k.a
    public /* bridge */ /* synthetic */ String e() {
        return super.e();
    }

    @Override // v.AbstractC4905p
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // v.C4902m, v.C4901l, v.C4900k.a
    public /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    @Override // v.C4903n, v.C4902m, v.C4901l, v.C4900k.a
    public /* bridge */ /* synthetic */ void g(String str) {
        super.g(str);
    }

    @Override // v.AbstractC4905p, v.C4900k.a
    public void h(int i10) {
        ((OutputConfiguration) i()).setMirrorMode(i10);
    }

    @Override // v.AbstractC4905p
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // v.C4903n, v.C4902m, v.C4901l, v.C4900k.a
    public Object i() {
        y0.f.a(this.f43801a instanceof OutputConfiguration);
        return this.f43801a;
    }

    C4904o(Object obj) {
        super(obj);
    }
}
