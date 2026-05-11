package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import kotlin.Metadata;
import kotlin.reflect.o;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R*\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0016\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptFunction;", "ReturnType", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "thisValue", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "args", "Lexpo/modules/kotlin/jni/ExpectedType;", "expectedReturnType", "invoke", "(Lexpo/modules/kotlin/jni/JavaScriptObject;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/ExpectedType;)Ljava/lang/Object;", BuildConfig.FLAVOR, "finalize", "()V", C4870a.f43493a, "Lcom/facebook/jni/HybridData;", "Lkotlin/reflect/o;", "Lkotlin/reflect/o;", "getReturnType", "()Lkotlin/reflect/o;", "b", "(Lkotlin/reflect/o;)V", "getReturnType$annotations", "returnType", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JavaScriptFunction<ReturnType> implements Destructible {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private o returnType;
    private final HybridData mHybridData;

    private JavaScriptFunction(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private final native Object invoke(JavaScriptObject thisValue, Object[] args, ExpectedType expectedReturnType);

    @Override // expo.modules.kotlin.jni.Destructible
    public void a() {
        this.mHybridData.resetNative();
    }

    public final void b(o oVar) {
        this.returnType = oVar;
    }

    protected final void finalize() {
        a();
    }
}
