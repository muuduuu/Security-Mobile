package h5;

import android.view.View;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class L extends AbstractC1943g {
    public L(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        char c10;
        str.hashCode();
        switch (str.hashCode()) {
            case -1937389126:
                if (str.equals("homeIndicatorHidden")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1853558344:
                if (str.equals("gestureEnabled")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1734097646:
                if (str.equals("hideKeyboardOnSwipe")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1349152186:
                if (str.equals("sheetCornerRadius")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1322084375:
                if (str.equals("navigationBarHidden")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1150711358:
                if (str.equals("stackPresentation")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -1047235902:
                if (str.equals("activityState")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -973702878:
                if (str.equals("statusBarColor")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -958765200:
                if (str.equals("statusBarStyle")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -952227806:
                if (str.equals("fullScreenSwipeShadowEnabled")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case -577711652:
                if (str.equals("stackAnimation")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case -462720700:
                if (str.equals("navigationBarColor")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case -381571779:
                if (str.equals("sheetInitialDetent")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case -274098190:
                if (str.equals("sheetAllowedDetents")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case -257141968:
                if (str.equals("replaceAnimation")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case -166356101:
                if (str.equals("preventNativeDismiss")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 17337291:
                if (str.equals("statusBarHidden")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 129956386:
                if (str.equals("fullScreenSwipeEnabled")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 187703999:
                if (str.equals("gestureResponseDistance")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 227582404:
                if (str.equals("screenOrientation")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 241896530:
                if (str.equals("sheetLargestUndimmedDetent")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 425064969:
                if (str.equals("transitionDuration")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 1082157413:
                if (str.equals("swipeDirection")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case 1110843912:
                if (str.equals("customAnimationOnSwipe")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 1116050554:
                if (str.equals("navigationBarTranslucent")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case 1269009342:
                if (str.equals("sheetElevation")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 1357942638:
                if (str.equals("sheetGrabberVisible")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 1387359683:
                if (str.equals("statusBarAnimation")) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case 1729091548:
                if (str.equals("nativeBackButtonDismissalEnabled")) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case 2097450072:
                if (str.equals("sheetExpandsWhenScrolledToEdge")) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                ((M) this.f22417a).setHomeIndicatorHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((M) this.f22417a).setGestureEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 2:
                ((M) this.f22417a).setHideKeyboardOnSwipe(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((M) this.f22417a).setSheetCornerRadius(view, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 4:
                ((M) this.f22417a).setNavigationBarHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 5:
                ((M) this.f22417a).setStatusBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((M) this.f22417a).setStackPresentation(view, (String) obj);
                break;
            case 7:
                ((M) this.f22417a).setActivityState(view, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case '\b':
                ((M) this.f22417a).setStatusBarColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case '\t':
                ((M) this.f22417a).setStatusBarStyle(view, obj != null ? (String) obj : null);
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                ((M) this.f22417a).setFullScreenSwipeShadowEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 11:
                ((M) this.f22417a).setStackAnimation(view, (String) obj);
                break;
            case '\f':
                ((M) this.f22417a).setNavigationBarColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case '\r':
                ((M) this.f22417a).setSheetInitialDetent(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                ((M) this.f22417a).setSheetAllowedDetents(view, (ReadableArray) obj);
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                ((M) this.f22417a).setReplaceAnimation(view, (String) obj);
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                ((M) this.f22417a).setPreventNativeDismiss(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                ((M) this.f22417a).setStatusBarHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 18:
                ((M) this.f22417a).setFullScreenSwipeEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 19:
                ((M) this.f22417a).setGestureResponseDistance(view, (ReadableMap) obj);
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                ((M) this.f22417a).setScreenOrientation(view, obj != null ? (String) obj : null);
                break;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                ((M) this.f22417a).setSheetLargestUndimmedDetent(view, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                ((M) this.f22417a).setTransitionDuration(view, obj == null ? 500 : ((Double) obj).intValue());
                break;
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                ((M) this.f22417a).setSwipeDirection(view, (String) obj);
                break;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                ((M) this.f22417a).setCustomAnimationOnSwipe(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                ((M) this.f22417a).setNavigationBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 26:
                ((M) this.f22417a).setSheetElevation(view, obj != null ? ((Double) obj).intValue() : 24);
                break;
            case 27:
                ((M) this.f22417a).setSheetGrabberVisible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 28:
                ((M) this.f22417a).setStatusBarAnimation(view, obj != null ? (String) obj : null);
                break;
            case 29:
                ((M) this.f22417a).setNativeBackButtonDismissalEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 30:
                ((M) this.f22417a).setSheetExpandsWhenScrolledToEdge(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
