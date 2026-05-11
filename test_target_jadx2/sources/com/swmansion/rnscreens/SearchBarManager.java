package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c1;
import com.swmansion.rnscreens.T;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import v4.AbstractC4929e;

@K4.a(name = SearchBarManager.REACT_CLASS)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001DB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001aH\u0017¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b&\u0010\u0019J!\u0010(\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b(\u0010\u0019J!\u0010)\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b)\u0010!J!\u0010*\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b*\u0010!J!\u0010+\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b+\u0010!J\u001f\u0010-\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u001aH\u0017¢\u0006\u0004\b-\u0010$J\u001d\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b2\u0010\u0016J\u0019\u00103\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b3\u0010\u0016J\u0019\u00104\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b4\u0010\u0016J!\u00106\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u00105\u001a\u00020\u001aH\u0016¢\u0006\u0004\b6\u0010$J#\u00108\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u00107\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b8\u0010\u0019J\u0019\u00109\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b9\u0010\u0016J!\u0010:\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b:\u0010\u0019J!\u0010<\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010;\u001a\u00020\u001aH\u0016¢\u0006\u0004\b<\u0010$J!\u0010=\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010;\u001a\u00020\u001aH\u0016¢\u0006\u0004\b=\u0010$J!\u0010>\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010;\u001a\u00020\u001aH\u0016¢\u0006\u0004\b>\u0010$J#\u0010?\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010;\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b?\u0010\u0019J#\u0010@\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010;\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b@\u0010!R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/swmansion/rnscreens/SearchBarManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/T;", "Lh5/U;", "<init>", "()V", BuildConfig.FLAVOR, "propName", BuildConfig.FLAVOR, "logNotAvailable", "(Ljava/lang/String;)V", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/F0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/swmansion/rnscreens/T;", "view", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/T;)V", "autoCapitalize", "setAutoCapitalize", "(Lcom/swmansion/rnscreens/T;Ljava/lang/String;)V", BuildConfig.FLAVOR, "autoFocus", "setAutoFocus", "(Lcom/swmansion/rnscreens/T;Ljava/lang/Boolean;)V", BuildConfig.FLAVOR, "color", "setBarTintColor", "(Lcom/swmansion/rnscreens/T;Ljava/lang/Integer;)V", "disableBackButtonOverride", "setDisableBackButtonOverride", "(Lcom/swmansion/rnscreens/T;Z)V", "inputType", "setInputType", "placeholder", "setPlaceholder", "setTextColor", "setHeaderIconColor", "setHintTextColor", "shouldShowHintSearchIcon", "setShouldShowHintSearchIcon", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "blur", "focus", "clearText", "flag", "toggleCancelButton", "text", "setText", "cancelSearch", "setPlacement", "value", "setHideWhenScrolling", "setObscureBackground", "setHideNavigationBar", "setCancelButtonText", "setTintColor", "delegate", "Lcom/facebook/react/uimanager/c1;", "Companion", C4870a.f43493a, "react-native-screens_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SearchBarManager extends ViewGroupManager<T> implements h5.U {
    public static final String REACT_CLASS = "RNSSearchBar";
    private final c1 delegate = new h5.T(this);

    private final void logNotAvailable(String propName) {
        Log.w("[RNScreens]", propName + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected c1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return AbstractC4929e.i("topSearchBlur", AbstractC4929e.d("registrationName", "onSearchBlur"), "topChangeText", AbstractC4929e.d("registrationName", "onChangeText"), "topClose", AbstractC4929e.d("registrationName", "onClose"), "topSearchFocus", AbstractC4929e.d("registrationName", "onSearchFocus"), "topOpen", AbstractC4929e.d("registrationName", "onOpen"), "topSearchButtonPress", AbstractC4929e.d("registrationName", "onSearchButtonPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Z4.a(name = "autoFocus")
    public final void setAutoFocus(T view, Boolean autoFocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAutoFocus(autoFocus != null ? autoFocus.booleanValue() : false);
    }

    @Override // h5.U
    public void blur(T view) {
        if (view != null) {
            view.A();
        }
    }

    @Override // h5.U
    public void cancelSearch(T view) {
        if (view != null) {
            view.E();
        }
    }

    @Override // h5.U
    public void clearText(T view) {
        if (view != null) {
            view.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public T createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new T(context);
    }

    @Override // h5.U
    public void focus(T view) {
        if (view != null) {
            view.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((SearchBarManager) view);
        view.K();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r3.equals("none") != false) goto L21;
     */
    @Override // h5.U
    @Z4.a(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAutoCapitalize(T view, String autoCapitalize) {
        T.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (autoCapitalize != null) {
            switch (autoCapitalize.hashCode()) {
                case 3387192:
                    break;
                case 113318569:
                    if (autoCapitalize.equals("words")) {
                        aVar = T.a.WORDS;
                        view.setAutoCapitalize(aVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
                case 490141296:
                    if (autoCapitalize.equals("sentences")) {
                        aVar = T.a.SENTENCES;
                        view.setAutoCapitalize(aVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
                case 1245424234:
                    if (autoCapitalize.equals("characters")) {
                        aVar = T.a.CHARACTERS;
                        view.setAutoCapitalize(aVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
                default:
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
            }
        }
        aVar = T.a.NONE;
        view.setAutoCapitalize(aVar);
    }

    @Override // h5.U
    @Z4.a(customType = "Color", name = "barTintColor")
    public void setBarTintColor(T view, Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTintColor(color);
    }

    @Override // h5.U
    public void setCancelButtonText(T view, String value) {
        logNotAvailable("cancelButtonText");
    }

    @Override // h5.U
    @Z4.a(name = "disableBackButtonOverride")
    public void setDisableBackButtonOverride(T view, boolean disableBackButtonOverride) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldOverrideBackButton(!disableBackButtonOverride);
    }

    @Override // h5.U
    @Z4.a(customType = "Color", name = "headerIconColor")
    public void setHeaderIconColor(T view, Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHeaderIconColor(color);
    }

    @Override // h5.U
    public void setHideNavigationBar(T view, boolean value) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // h5.U
    public void setHideWhenScrolling(T view, boolean value) {
        logNotAvailable("hideWhenScrolling");
    }

    @Override // h5.U
    @Z4.a(customType = "Color", name = "hintTextColor")
    public void setHintTextColor(T view, Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHintTextColor(color);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r3.equals("text") != false) goto L21;
     */
    @Override // h5.U
    @Z4.a(name = "inputType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setInputType(T view, String inputType) {
        T.b bVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (inputType != null) {
            switch (inputType.hashCode()) {
                case -1034364087:
                    if (inputType.equals("number")) {
                        bVar = T.b.NUMBER;
                        view.setInputType(bVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
                case 3556653:
                    break;
                case 96619420:
                    if (inputType.equals("email")) {
                        bVar = T.b.EMAIL;
                        view.setInputType(bVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
                case 106642798:
                    if (inputType.equals("phone")) {
                        bVar = T.b.PHONE;
                        view.setInputType(bVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
                default:
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
            }
        }
        bVar = T.b.TEXT;
        view.setInputType(bVar);
    }

    @Override // h5.U
    public void setObscureBackground(T view, boolean value) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // h5.U
    @Z4.a(name = "placeholder")
    public void setPlaceholder(T view, String placeholder) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (placeholder != null) {
            view.setPlaceholder(placeholder);
        }
    }

    @Override // h5.U
    public void setPlacement(T view, String placeholder) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("setPlacement");
    }

    @Override // h5.U
    @Z4.a(name = "shouldShowHintSearchIcon")
    public void setShouldShowHintSearchIcon(T view, boolean shouldShowHintSearchIcon) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldShowHintSearchIcon(shouldShowHintSearchIcon);
    }

    @Override // h5.U
    public void setText(T view, String text) {
        if (view != null) {
            view.G(text);
        }
    }

    @Override // h5.U
    @Z4.a(customType = "Color", name = "textColor")
    public void setTextColor(T view, Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTextColor(color);
    }

    @Override // h5.U
    public void setTintColor(T view, Integer value) {
        logNotAvailable("tintColor");
    }

    @Override // h5.U
    public void toggleCancelButton(T view, boolean flag) {
        if (view != null) {
            view.J(flag);
        }
    }
}
