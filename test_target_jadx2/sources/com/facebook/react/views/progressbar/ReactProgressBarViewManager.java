package com.facebook.react.views.progressbar;

import android.R;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.c1;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import h5.C3236c;
import h5.InterfaceC3238d;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@K4.a(name = ReactProgressBarViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001JB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0017H\u0017¢\u0006\u0004\b \u0010\u001aJ!\u0010\"\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010\u0012J!\u0010#\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b#\u0010\u0012J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0014¢\u0006\u0004\b1\u00102JY\u0010A\u001a\u00020@2\u0006\u0010\u000b\u001a\u0002032\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020:2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bA\u0010BR,\u0010E\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/progressbar/a;", "Lcom/facebook/react/views/progressbar/b;", "Lh5/d;", "<init>", "()V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/F0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/facebook/react/views/progressbar/a;", "view", "styleName", BuildConfig.FLAVOR, "setStyleAttr", "(Lcom/facebook/react/views/progressbar/a;Ljava/lang/String;)V", BuildConfig.FLAVOR, "color", "setColor", "(Lcom/facebook/react/views/progressbar/a;Ljava/lang/Integer;)V", BuildConfig.FLAVOR, ReactProgressBarViewManager.PROP_INDETERMINATE, "setIndeterminate", "(Lcom/facebook/react/views/progressbar/a;Z)V", BuildConfig.FLAVOR, ReactProgressBarViewManager.PROP_PROGRESS, "setProgress", "(Lcom/facebook/react/views/progressbar/a;D)V", ReactProgressBarViewManager.PROP_ANIMATING, "setAnimating", "value", "setTestID", "setTypeAttr", "createShadowNodeInstance", "()Lcom/facebook/react/views/progressbar/b;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "root", BuildConfig.FLAVOR, "extraData", "updateExtraData", "(Lcom/facebook/react/views/progressbar/a;Ljava/lang/Object;)V", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/progressbar/a;)V", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", "Landroid/content/Context;", "Lcom/facebook/react/bridge/ReadableMap;", "localData", "props", Keys.STATE, BuildConfig.FLAVOR, "width", "Lcom/facebook/yoga/p;", "widthMode", "height", "heightMode", BuildConfig.FLAVOR, "attachmentsPositions", BuildConfig.FLAVOR, "measure", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;[F)J", "Ljava/util/WeakHashMap;", "Landroid/util/Pair;", "measuredStyles", "Ljava/util/WeakHashMap;", "delegate", "Lcom/facebook/react/uimanager/c1;", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReactProgressBarViewManager extends BaseViewManager<a, b> implements InterfaceC3238d {
    public static final String DEFAULT_STYLE = "Normal";
    public static final String PROP_ANIMATING = "animating";
    public static final String PROP_ATTR = "typeAttr";
    public static final String PROP_INDETERMINATE = "indeterminate";
    public static final String PROP_PROGRESS = "progress";
    public static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Object progressBarCtorLock = new Object();
    private final WeakHashMap<Integer, Pair<Integer, Integer>> measuredStyles = new WeakHashMap<>();
    private final c1 delegate = new C3236c(this);

    /* renamed from: com.facebook.react.views.progressbar.ReactProgressBarViewManager$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProgressBar a(Context context, int i10) {
            ProgressBar progressBar;
            synchronized (ReactProgressBarViewManager.progressBarCtorLock) {
                progressBar = new ProgressBar(context, null, i10);
            }
            return progressBar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        
            if (r5.equals(com.facebook.react.views.progressbar.ReactProgressBarViewManager.DEFAULT_STYLE) == false) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int b(String str) {
            if (str == null) {
                AbstractC1721a.J("ReactNative", "ProgressBar needs to have a style, null received");
                return R.attr.progressBarStyle;
            }
            switch (str.hashCode()) {
                case -1955878649:
                    break;
                case -1414214583:
                    if (str.equals("SmallInverse")) {
                    }
                    AbstractC1721a.J("ReactNative", "Unknown ProgressBar style: " + str);
                    break;
                case -913872828:
                    if (str.equals("Horizontal")) {
                    }
                    AbstractC1721a.J("ReactNative", "Unknown ProgressBar style: " + str);
                    break;
                case -670403824:
                    if (str.equals("Inverse")) {
                    }
                    AbstractC1721a.J("ReactNative", "Unknown ProgressBar style: " + str);
                    break;
                case -142408811:
                    if (str.equals("LargeInverse")) {
                    }
                    AbstractC1721a.J("ReactNative", "Unknown ProgressBar style: " + str);
                    break;
                case 73190171:
                    if (str.equals("Large")) {
                    }
                    AbstractC1721a.J("ReactNative", "Unknown ProgressBar style: " + str);
                    break;
                case 79996135:
                    if (str.equals("Small")) {
                    }
                    AbstractC1721a.J("ReactNative", "Unknown ProgressBar style: " + str);
                    break;
                default:
                    AbstractC1721a.J("ReactNative", "Unknown ProgressBar style: " + str);
                    break;
            }
            return R.attr.progressBarStyle;
        }

        private Companion() {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected c1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<b> getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap localData, ReadableMap props, ReadableMap state, float width, p widthMode, float height, p heightMode, float[] attachmentsPositions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localData, "localData");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Companion companion = INSTANCE;
        int b10 = companion.b(props.getString(PROP_STYLE));
        WeakHashMap<Integer, Pair<Integer, Integer>> weakHashMap = this.measuredStyles;
        Integer valueOf = Integer.valueOf(b10);
        Pair<Integer, Integer> pair = weakHashMap.get(valueOf);
        if (pair == null) {
            ProgressBar a10 = companion.a(context, b10);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            a10.measure(makeMeasureSpec, makeMeasureSpec);
            pair = Pair.create(Integer.valueOf(a10.getMeasuredWidth()), Integer.valueOf(a10.getMeasuredHeight()));
            weakHashMap.put(valueOf, pair);
        }
        Pair<Integer, Integer> pair2 = pair;
        return q.a(C1944g0.e(((Number) pair2.first).intValue()), C1944g0.e(((Number) pair2.second).intValue()));
    }

    @Override // h5.InterfaceC3238d
    @Z4.a(name = PROP_ATTR)
    public void setTypeAttr(a view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(a root, Object extraData) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createShadowNodeInstance() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.a();
    }

    @Override // h5.InterfaceC3238d
    @Z4.a(name = PROP_ANIMATING)
    public void setAnimating(a view, boolean animating) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAnimating$ReactAndroid_release(animating);
    }

    @Override // h5.InterfaceC3238d
    @Z4.a(customType = "Color", name = "color")
    public void setColor(a view, Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setColor$ReactAndroid_release(color);
    }

    @Override // h5.InterfaceC3238d
    @Z4.a(name = PROP_INDETERMINATE)
    public void setIndeterminate(a view, boolean indeterminate) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setIndeterminate$ReactAndroid_release(indeterminate);
    }

    @Override // h5.InterfaceC3238d
    @Z4.a(name = PROP_PROGRESS)
    public void setProgress(a view, double progress) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgress$ReactAndroid_release(progress);
    }

    @Override // h5.InterfaceC3238d
    @Z4.a(name = PROP_STYLE)
    public void setStyleAttr(a view, String styleName) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStyle$ReactAndroid_release(styleName);
    }

    @Override // h5.InterfaceC3238d
    public void setTestID(a view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setTestId(view, value);
    }
}
