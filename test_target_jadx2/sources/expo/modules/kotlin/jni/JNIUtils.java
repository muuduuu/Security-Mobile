package expo.modules.kotlin.jni;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lexpo/modules/kotlin/jni/JNIUtils;", BuildConfig.FLAVOR, C4870a.f43493a, "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class JNIUtils {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: expo.modules.kotlin.jni.JNIUtils$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(JavaScriptModuleObject_ javaScriptModuleObject_, JSIContext jSIContext, String str, Map map) {
            JNIUtils.emitEvent(javaScriptModuleObject_, jSIContext, str, (Map<String, ? extends Object>) map);
        }

        public final void b(JavaScriptWeakObject javaScriptWeakObject, JSIContext jSIContext, String str, Object[] objArr) {
            JNIUtils.emitEvent(javaScriptWeakObject, jSIContext, str, objArr);
        }

        private Companion() {
        }
    }

    public static final native void emitEvent(JavaScriptModuleObject_ javaScriptModuleObject_, JSIContext jSIContext, String str, Map<String, ? extends Object> map);

    public static final native void emitEvent(JavaScriptObject javaScriptObject, JSIContext jSIContext, String str, Object[] objArr);

    public static final native void emitEvent(JavaScriptWeakObject javaScriptWeakObject, JSIContext jSIContext, String str, Object[] objArr);
}
