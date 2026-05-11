package w1;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: w1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5024f {

    /* renamed from: w1.f$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final C5027i f44276a = new C5027i(AbstractC5024f.d().getWebkitToCompatConverter());
    }

    /* renamed from: w1.f$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final InterfaceC5025g f44277a = AbstractC5024f.a();
    }

    static InterfaceC5025g a() {
        try {
            return new C5026h((WebViewProviderFactoryBoundaryInterface) ye.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new C5020b();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static C5027i c() {
        return a.f44276a;
    }

    public static InterfaceC5025g d() {
        return b.f44277a;
    }

    public static ClassLoader e() {
        ClassLoader webViewClassLoader;
        if (Build.VERSION.SDK_INT < 28) {
            return f().getClass().getClassLoader();
        }
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }
}
