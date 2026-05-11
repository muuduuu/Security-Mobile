package O1;

import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class J {

    /* renamed from: b, reason: collision with root package name */
    private final LottieAnimationView f6928b;

    /* renamed from: a, reason: collision with root package name */
    private final Map f6927a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private boolean f6930d = true;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.o f6929c = null;

    public J(LottieAnimationView lottieAnimationView) {
        this.f6928b = lottieAnimationView;
    }

    private void d() {
        LottieAnimationView lottieAnimationView = this.f6928b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        com.airbnb.lottie.o oVar = this.f6929c;
        if (oVar != null) {
            oVar.invalidateSelf();
        }
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    public final String c(String str, String str2) {
        if (this.f6930d && this.f6927a.containsKey(str2)) {
            return (String) this.f6927a.get(str2);
        }
        String b10 = b(str, str2);
        if (this.f6930d) {
            this.f6927a.put(str2, b10);
        }
        return b10;
    }

    public void e(String str, String str2) {
        this.f6927a.put(str, str2);
        d();
    }

    public String a(String str) {
        return str;
    }
}
