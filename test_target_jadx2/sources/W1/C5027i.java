package w1;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: w1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5027i {

    /* renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f44279a;

    public C5027i(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f44279a = webkitToCompatConverterBoundaryInterface;
    }

    public C5021c a(WebSettings webSettings) {
        return new C5021c((WebSettingsBoundaryInterface) ye.a.a(WebSettingsBoundaryInterface.class, this.f44279a.convertSettings(webSettings)));
    }
}
