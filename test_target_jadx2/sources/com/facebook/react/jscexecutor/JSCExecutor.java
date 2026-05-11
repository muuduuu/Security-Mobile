package com.facebook.react.jscexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/jscexecutor/JSCExecutor;", "Lcom/facebook/react/bridge/JavaScriptExecutor;", "Lcom/facebook/react/bridge/ReadableNativeMap;", "jscConfig", "<init>", "(Lcom/facebook/react/bridge/ReadableNativeMap;)V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JSCExecutor extends JavaScriptExecutor {

    /* renamed from: a, reason: collision with root package name */
    private static final a f21708a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HybridData b(ReadableNativeMap readableNativeMap) {
            return JSCExecutor.initHybrid(readableNativeMap);
        }

        public final void c() {
            SoLoader.t("jscexecutor");
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f21708a = aVar;
        aVar.c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSCExecutor(ReadableNativeMap jscConfig) {
        super(f21708a.b(jscConfig));
        Intrinsics.checkNotNullParameter(jscConfig, "jscConfig");
    }

    public static final void b() {
        f21708a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "JSCExecutor";
    }
}
