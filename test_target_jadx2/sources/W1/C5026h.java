package w1;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: w1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5026h implements InterfaceC5025g {

    /* renamed from: a, reason: collision with root package name */
    WebViewProviderFactoryBoundaryInterface f44278a;

    public C5026h(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f44278a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // w1.InterfaceC5025g
    public String[] a() {
        return this.f44278a.getSupportedFeatures();
    }

    @Override // w1.InterfaceC5025g
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) ye.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f44278a.getWebkitToCompatConverter());
    }
}
