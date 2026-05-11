package e0;

import A.AbstractC0700h0;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import c0.r0;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class e implements r0 {

    /* renamed from: a, reason: collision with root package name */
    private final r0 f32127a;

    /* renamed from: b, reason: collision with root package name */
    private final Range f32128b;

    /* renamed from: c, reason: collision with root package name */
    private final Range f32129c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f32130d;

    private e(r0 r0Var) {
        HashSet hashSet = new HashSet();
        this.f32130d = hashSet;
        this.f32127a = r0Var;
        int b10 = r0Var.b();
        this.f32128b = Range.create(Integer.valueOf(b10), Integer.valueOf(((int) Math.ceil(4096.0d / b10)) * b10));
        int g10 = r0Var.g();
        this.f32129c = Range.create(Integer.valueOf(g10), Integer.valueOf(((int) Math.ceil(2160.0d / g10)) * g10));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.f());
    }

    private void k(Size size) {
        this.f32130d.add(size);
    }

    public static r0 l(r0 r0Var, Size size) {
        if (!(r0Var instanceof e)) {
            if (androidx.camera.video.internal.compat.quirk.a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !r0Var.a(size.getWidth(), size.getHeight())) {
                    AbstractC0700h0.l("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, r0Var.h(), r0Var.j()));
                }
            }
            r0Var = new e(r0Var);
        }
        if (size != null && (r0Var instanceof e)) {
            ((e) r0Var).k(size);
        }
        return r0Var;
    }

    @Override // c0.r0
    public int b() {
        return this.f32127a.b();
    }

    @Override // c0.r0
    public Range c() {
        return this.f32127a.c();
    }

    @Override // c0.r0
    public boolean d() {
        return this.f32127a.d();
    }

    @Override // c0.r0
    public Range e(int i10) {
        y0.f.b(this.f32129c.contains((Range) Integer.valueOf(i10)) && i10 % this.f32127a.g() == 0, "Not supported height: " + i10 + " which is not in " + this.f32129c + " or can not be divided by alignment " + this.f32127a.g());
        return this.f32128b;
    }

    @Override // c0.r0
    public Range f(int i10) {
        y0.f.b(this.f32128b.contains((Range) Integer.valueOf(i10)) && i10 % this.f32127a.b() == 0, "Not supported width: " + i10 + " which is not in " + this.f32128b + " or can not be divided by alignment " + this.f32127a.b());
        return this.f32129c;
    }

    @Override // c0.r0
    public int g() {
        return this.f32127a.g();
    }

    @Override // c0.r0
    public Range h() {
        return this.f32128b;
    }

    @Override // c0.r0
    public boolean i(int i10, int i11) {
        if (this.f32127a.i(i10, i11)) {
            return true;
        }
        for (Size size : this.f32130d) {
            if (size.getWidth() == i10 && size.getHeight() == i11) {
                return true;
            }
        }
        return this.f32128b.contains((Range) Integer.valueOf(i10)) && this.f32129c.contains((Range) Integer.valueOf(i11)) && i10 % this.f32127a.b() == 0 && i11 % this.f32127a.g() == 0;
    }

    @Override // c0.r0
    public Range j() {
        return this.f32129c;
    }
}
