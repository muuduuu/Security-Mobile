package w1;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5021c {

    /* renamed from: a, reason: collision with root package name */
    private WebSettingsBoundaryInterface f44274a;

    public C5021c(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f44274a = webSettingsBoundaryInterface;
    }

    public void a(int i10) {
        this.f44274a.setForceDark(i10);
    }

    public void b(int i10) {
        this.f44274a.setForceDarkBehavior(i10);
    }
}
