package com.facebook.react.modules.toast;

import K4.a;
import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.toast.ToastModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@a(name = "ToastAndroid")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0016\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/modules/toast/ToastModule;", "Lcom/facebook/fbreact/specs/NativeToastAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getTypedExportedConstants", "()Ljava/util/Map;", "message", BuildConfig.FLAVOR, "durationDouble", BuildConfig.FLAVOR, "show", "(Ljava/lang/String;D)V", "gravityDouble", "showWithGravity", "(Ljava/lang/String;DD)V", "xOffsetDouble", "yOffsetDouble", "showWithGravityAndOffset", "(Ljava/lang/String;DDDD)V", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ToastModule extends NativeToastAndroidSpec {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(ToastModule this$0, String str, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.getReactApplicationContext(), str, i10).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithGravity$lambda$1(ToastModule this$0, String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast makeText = Toast.makeText(this$0.getReactApplicationContext(), str, i10);
        makeText.setGravity(i11, 0, 0);
        makeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithGravityAndOffset$lambda$2(ToastModule this$0, String str, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast makeText = Toast.makeText(this$0.getReactApplicationContext(), str, i10);
        makeText.setGravity(i11, i12, i13);
        makeText.show();
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        return G.l(t.a(DURATION_SHORT_KEY, 0), t.a(DURATION_LONG_KEY, 1), t.a(GRAVITY_TOP_KEY, 49), t.a(GRAVITY_BOTTOM_KEY, 81), t.a(GRAVITY_CENTER, 17));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void show(final String message, double durationDouble) {
        final int i10 = (int) durationDouble;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: T4.c
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.show$lambda$0(ToastModule.this, message, i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravity(final String message, double durationDouble, double gravityDouble) {
        final int i10 = (int) durationDouble;
        final int i11 = (int) gravityDouble;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: T4.b
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.showWithGravity$lambda$1(ToastModule.this, message, i10, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravityAndOffset(final String message, double durationDouble, double gravityDouble, double xOffsetDouble, double yOffsetDouble) {
        final int i10 = (int) durationDouble;
        final int i11 = (int) gravityDouble;
        final int i12 = (int) xOffsetDouble;
        final int i13 = (int) yOffsetDouble;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: T4.a
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.showWithGravityAndOffset$lambda$2(ToastModule.this, message, i10, i11, i12, i13);
            }
        });
    }
}
