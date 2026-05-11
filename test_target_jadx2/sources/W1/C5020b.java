package w1;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5020b implements InterfaceC5025g {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f44273a = new String[0];

    @Override // w1.InterfaceC5025g
    public String[] a() {
        return f44273a;
    }

    @Override // w1.InterfaceC5025g
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
