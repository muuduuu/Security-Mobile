package com.facebook.react.modules.appearance;

import K4.a;
import android.content.Context;
import androidx.appcompat.app.g;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@a(name = "Appearance")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/facebook/react/modules/appearance/AppearanceModule;", "Lcom/facebook/fbreact/specs/NativeAppearanceSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/modules/appearance/AppearanceModule$b;", "overrideColorScheme", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/modules/appearance/AppearanceModule$b;)V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "colorSchemeForCurrentConfiguration", "(Landroid/content/Context;)Ljava/lang/String;", "getColorScheme", "()Ljava/lang/String;", "style", BuildConfig.FLAVOR, "setColorScheme", "(Ljava/lang/String;)V", "eventName", "addListener", BuildConfig.FLAVOR, "count", "removeListeners", "(D)V", "currentContext", "onConfigurationChanged", "(Landroid/content/Context;)V", "colorScheme", "emitAppearanceChanged", "Lcom/facebook/react/modules/appearance/AppearanceModule$b;", "lastEmittedColorScheme", "Ljava/lang/String;", "Companion", C4870a.f43493a, "b", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppearanceModule extends NativeAppearanceSpec {
    private static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
    public static final String NAME = "Appearance";
    private String lastEmittedColorScheme;
    private final b overrideColorScheme;

    public interface b {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppearanceModule(ReactApplicationContext reactContext) {
        this(reactContext, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    private final String colorSchemeForCurrentConfiguration(Context context) {
        int i10 = context.getResources().getConfiguration().uiMode & 48;
        return (i10 == 16 || i10 != 32) ? "light" : "dark";
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void addListener(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    public final void emitAppearanceChanged(String colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        WritableMap createMap = Arguments.createMap();
        createMap.putString("colorScheme", colorScheme);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent(APPEARANCE_CHANGED_EVENT_NAME, createMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public String getColorScheme() {
        Context currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = getReactApplicationContext();
        }
        Intrinsics.d(currentActivity);
        return colorSchemeForCurrentConfiguration(currentActivity);
    }

    public final void onConfigurationChanged(Context currentContext) {
        Intrinsics.checkNotNullParameter(currentContext, "currentContext");
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(currentContext);
        if (Intrinsics.b(this.lastEmittedColorScheme, colorSchemeForCurrentConfiguration)) {
            return;
        }
        this.lastEmittedColorScheme = colorSchemeForCurrentConfiguration;
        emitAppearanceChanged(colorSchemeForCurrentConfiguration);
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void setColorScheme(String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int hashCode = style.hashCode();
        if (hashCode == -1626174665) {
            if (style.equals("unspecified")) {
                g.N(-1);
            }
        } else if (hashCode == 3075958) {
            if (style.equals("dark")) {
                g.N(2);
            }
        } else if (hashCode == 102970646 && style.equals("light")) {
            g.N(1);
        }
    }

    public /* synthetic */ AppearanceModule(ReactApplicationContext reactApplicationContext, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i10 & 2) != 0 ? null : bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppearanceModule(ReactApplicationContext reactContext, b bVar) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }
}
