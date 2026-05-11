package co.hyperverge.hypersnapsdk.activities;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.activities.HVConsentActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.helpers.HVLottieHelper;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.objects.Consent;
import co.hyperverge.hypersnapsdk.objects.ConsentConfig;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.providers.CallbackProvider;
import co.hyperverge.hypersnapsdk.service.consent.ConsentService;
import co.hyperverge.hypersnapsdk.service.consent.ConsentServiceImpl;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.DeviceExtensionsKt;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001RB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002J\b\u0010%\u001a\u00020 H\u0002J(\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0002J\u001c\u0010)\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020 H\u0002J\u0010\u0010/\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020\u0014H\u0002J\u0018\u00102\u001a\u00020 2\u0006\u00101\u001a\u00020\u00142\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000206H\u0014J\r\u00107\u001a\u00020\rH\u0014¢\u0006\u0002\u00108J\b\u00109\u001a\u00020:H\u0014J\b\u0010;\u001a\u00020 H\u0002J\u0010\u0010<\u001a\u00020 2\u0006\u00101\u001a\u00020\u0014H\u0002J\b\u0010=\u001a\u00020 H\u0002J\"\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020\r2\b\u0010A\u001a\u0004\u0018\u00010BH\u0014J\b\u0010C\u001a\u00020 H\u0014J\u0012\u0010D\u001a\u00020 2\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\b\u0010G\u001a\u00020 H\u0016J\u0010\u0010H\u001a\u00020 2\u0006\u0010I\u001a\u00020\u0014H\u0002J\b\u0010J\u001a\u00020 H\u0002J\b\u0010K\u001a\u00020 H\u0002J\u0010\u0010L\u001a\u00020 2\u0006\u00103\u001a\u000204H\u0002J\b\u0010M\u001a\u00020 H\u0002J\b\u0010N\u001a\u00020\u0014H\u0014J\b\u0010O\u001a\u00020\u0014H\u0014J\u0010\u0010P\u001a\u00020 2\u0006\u0010Q\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity;", "Lco/hyperverge/hypersnapsdk/activities/HVBaseActivity;", "()V", "TAG", BuildConfig.FLAVOR, "acceptButton", "Lcom/google/android/material/button/MaterialButton;", "btnCancel", "btnRetry", "consentCheckBox", "Landroid/widget/CheckBox;", "consentLink", "consentRequestCode", BuildConfig.FLAVOR, "consentService", "Lco/hyperverge/hypersnapsdk/service/consent/ConsentServiceImpl;", "denyButton", "faceConfig", "Lco/hyperverge/hypersnapsdk/objects/HVFaceConfig;", "isConsentAcceptedByUser", BuildConfig.FLAVOR, "ivBack", "Landroid/widget/ImageView;", "lavConsentLoader", "Lcom/airbnb/lottie/LottieAnimationView;", "retryAttemptCount", "retryLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "tvSubtitle", "Landroid/widget/TextView;", "tvTitle", "applyBoldStyle", BuildConfig.FLAVOR, "spannableString", "Landroid/text/SpannableString;", "fullText", "textToBold", "applyCheckBoxContent", "applyHyperlink", "linkText", "url", "callCompletionHandler", "hvError", "Lco/hyperverge/hypersnapsdk/objects/HVError;", "hvResponse", "Lco/hyperverge/hypersnapsdk/objects/HVResponse;", "checkIfConsentScreenIsEnabled", "closeWithError", "consentVisibility", "shouldShow", "errorRetryVisibility", "consentState", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState;", "getBaseConfig", "Lco/hyperverge/hypersnapsdk/objects/HVBaseConfig;", "getInsetContentId", "()Ljava/lang/Integer;", "getInsetView", "Landroid/view/View;", "initViews", "loaderVisibility", "logEvent", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCloseActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRemoteConfigFetchDone", "proceedToSelfie", "shouldShowConsentOnBackPress", "saveConsent", "sendOperationCancelled", "setState", "setupBranding", "shouldAllowActivityClose", "shouldShowCloseAlert", "updateAcceptButtonState", "shouldEnable", "ConsentState", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HVConsentActivity extends HVBaseActivity {
    private MaterialButton acceptButton;
    private MaterialButton btnCancel;
    private MaterialButton btnRetry;
    private CheckBox consentCheckBox;
    private MaterialButton denyButton;
    private HVFaceConfig faceConfig;
    private boolean isConsentAcceptedByUser;
    private ImageView ivBack;
    private LottieAnimationView lavConsentLoader;
    private int retryAttemptCount;
    private ConstraintLayout retryLayout;
    private TextView tvSubtitle;
    private TextView tvTitle;
    private final String TAG = "ConsentScreen";
    private final int consentRequestCode = 193;
    private String consentLink = BuildConfig.FLAVOR;
    private final ConsentServiceImpl consentService = new ConsentServiceImpl();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState;", BuildConfig.FLAVOR, "()V", "GetConsent", "GetConsentError", "GetConsentSuccess", "SaveConsent", "SaveConsentError", "SaveConsentSuccess", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsent;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentError;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentSuccess;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsent;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentError;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentSuccess;", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class ConsentState {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsent;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState;", "()V", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class GetConsent extends ConsentState {
            public static final GetConsent INSTANCE = new GetConsent();

            private GetConsent() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentError;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState;", "()V", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class GetConsentError extends ConsentState {
            public static final GetConsentError INSTANCE = new GetConsentError();

            private GetConsentError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentSuccess;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState;", "action", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentSuccess$Action;", "(Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentSuccess$Action;)V", "getAction", "()Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentSuccess$Action;", "Action", "ShowConsentScreen", "ShowFaceCaptureScreen", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentSuccess$ShowConsentScreen;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentSuccess$ShowFaceCaptureScreen;", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class GetConsentSuccess extends ConsentState {
            private final Action action;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentSuccess$Action;", BuildConfig.FLAVOR, "(Ljava/lang/String;I)V", "ShowConsent", "ShowFaceCapture", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public enum Action {
                ShowConsent,
                ShowFaceCapture
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentSuccess$ShowConsentScreen;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentSuccess;", "()V", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class ShowConsentScreen extends GetConsentSuccess {
                public static final ShowConsentScreen INSTANCE = new ShowConsentScreen();

                private ShowConsentScreen() {
                    super(Action.ShowConsent, null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentSuccess$ShowFaceCaptureScreen;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$GetConsentSuccess;", "()V", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class ShowFaceCaptureScreen extends GetConsentSuccess {
                public static final ShowFaceCaptureScreen INSTANCE = new ShowFaceCaptureScreen();

                private ShowFaceCaptureScreen() {
                    super(Action.ShowFaceCapture, null);
                }
            }

            public /* synthetic */ GetConsentSuccess(Action action, DefaultConstructorMarker defaultConstructorMarker) {
                this(action);
            }

            public final Action getAction() {
                return this.action;
            }

            private GetConsentSuccess(Action action) {
                super(null);
                this.action = action;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsent;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState;", "()V", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class SaveConsent extends ConsentState {
            public static final SaveConsent INSTANCE = new SaveConsent();

            private SaveConsent() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentError;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState;", "()V", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class SaveConsentError extends ConsentState {
            public static final SaveConsentError INSTANCE = new SaveConsentError();

            private SaveConsentError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentSuccess;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState;", "decision", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentSuccess$Decision;", "(Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentSuccess$Decision;)V", "getDecision", "()Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentSuccess$Decision;", "AcceptConsent", "Decision", "DenyConsent", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentSuccess$AcceptConsent;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentSuccess$DenyConsent;", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class SaveConsentSuccess extends ConsentState {
            private final Decision decision;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentSuccess$AcceptConsent;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentSuccess;", "()V", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class AcceptConsent extends SaveConsentSuccess {
                public static final AcceptConsent INSTANCE = new AcceptConsent();

                private AcceptConsent() {
                    super(Decision.Accept, null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentSuccess$Decision;", BuildConfig.FLAVOR, "(Ljava/lang/String;I)V", "Accept", "Deny", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public enum Decision {
                Accept,
                Deny
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentSuccess$DenyConsent;", "Lco/hyperverge/hypersnapsdk/activities/HVConsentActivity$ConsentState$SaveConsentSuccess;", "()V", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class DenyConsent extends SaveConsentSuccess {
                public static final DenyConsent INSTANCE = new DenyConsent();

                private DenyConsent() {
                    super(Decision.Deny, null);
                }
            }

            public /* synthetic */ SaveConsentSuccess(Decision decision, DefaultConstructorMarker defaultConstructorMarker) {
                this(decision);
            }

            public final Decision getDecision() {
                return this.decision;
            }

            private SaveConsentSuccess(Decision decision) {
                super(null);
                this.decision = decision;
            }
        }

        public /* synthetic */ ConsentState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ConsentState() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ConsentState.GetConsentSuccess.Action.values().length];
            try {
                iArr[ConsentState.GetConsentSuccess.Action.ShowConsent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsentState.GetConsentSuccess.Action.ShowFaceCapture.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConsentState.SaveConsentSuccess.Decision.values().length];
            try {
                iArr2[ConsentState.SaveConsentSuccess.Decision.Accept.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ConsentState.SaveConsentSuccess.Decision.Deny.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final void applyBoldStyle(SpannableString spannableString, String fullText, String textToBold) {
        int X10 = StringsKt.X(fullText, textToBold, 0, false, 6, null);
        int length = textToBold.length() + X10;
        if (X10 >= 0) {
            spannableString.setSpan(new StyleSpan(1), X10, length, 33);
        }
    }

    private final void applyCheckBoxContent() {
        SpannableString spannableString = new SpannableString("HyperVerge will collect, use, and store (\"Process\") your facial scan biometric data (\"Biometric Data\") for the entity you are interacting with (\"Client\"). By clicking Accept, you confirm that you:\n\n1. Have read and agreed to the HyperVerge Facial Scan Biometric Policy (\"Policy\"); and\n\n2. Consent to HyperVerge to Process your Biometric Data and disclose it to its service provider and the Client as per the Policy.");
        applyHyperlink(spannableString, "HyperVerge will collect, use, and store (\"Process\") your facial scan biometric data (\"Biometric Data\") for the entity you are interacting with (\"Client\"). By clicking Accept, you confirm that you:\n\n1. Have read and agreed to the HyperVerge Facial Scan Biometric Policy (\"Policy\"); and\n\n2. Consent to HyperVerge to Process your Biometric Data and disclose it to its service provider and the Client as per the Policy.", "HyperVerge Facial Scan Biometric Policy", this.consentLink);
        Iterator it = CollectionsKt.m("\"Process\"", "\"Biometric Data\"", "\"Client\"", "\"Policy\"").iterator();
        while (it.hasNext()) {
            applyBoldStyle(spannableString, "HyperVerge will collect, use, and store (\"Process\") your facial scan biometric data (\"Biometric Data\") for the entity you are interacting with (\"Client\"). By clicking Accept, you confirm that you:\n\n1. Have read and agreed to the HyperVerge Facial Scan Biometric Policy (\"Policy\"); and\n\n2. Consent to HyperVerge to Process your Biometric Data and disclose it to its service provider and the Client as per the Policy.", (String) it.next());
        }
        CheckBox checkBox = this.consentCheckBox;
        CheckBox checkBox2 = null;
        if (checkBox == null) {
            Intrinsics.v("consentCheckBox");
            checkBox = null;
        }
        checkBox.setText(spannableString);
        CheckBox checkBox3 = this.consentCheckBox;
        if (checkBox3 == null) {
            Intrinsics.v("consentCheckBox");
        } else {
            checkBox2 = checkBox3;
        }
        checkBox2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void applyHyperlink(SpannableString spannableString, String fullText, String linkText, final String url) {
        int X10 = StringsKt.X(fullText, linkText, 0, false, 6, null);
        spannableString.setSpan(new ClickableSpan() { // from class: co.hyperverge.hypersnapsdk.activities.HVConsentActivity$applyHyperlink$clickableSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.getResources().getColor(R.color.holo_blue_dark));
                ds.setUnderlineText(true);
            }
        }, X10, linkText.length() + X10, 33);
    }

    private final void checkIfConsentScreenIsEnabled() {
        this.consentService.getIsConsentToBeShown(new ConsentService.ConsentCallback() { // from class: co.hyperverge.hypersnapsdk.activities.HVConsentActivity$checkIfConsentScreenIsEnabled$1
            @Override // co.hyperverge.hypersnapsdk.service.consent.ConsentService.ConsentCallback
            public void onError() {
                HVConsentActivity.this.setState(HVConsentActivity.ConsentState.GetConsentError.INSTANCE);
            }

            @Override // co.hyperverge.hypersnapsdk.service.consent.ConsentService.ConsentCallback
            public void onSuccess(ConsentConfig consentConfig) {
                if (consentConfig == null) {
                    HVConsentActivity.this.setState(HVConsentActivity.ConsentState.GetConsentError.INSTANCE);
                    return;
                }
                HVConsentActivity hVConsentActivity = HVConsentActivity.this;
                if (!Intrinsics.b(consentConfig.isEnabled(), Boolean.TRUE)) {
                    hVConsentActivity.setState(HVConsentActivity.ConsentState.GetConsentSuccess.ShowFaceCaptureScreen.INSTANCE);
                } else {
                    hVConsentActivity.consentLink = String.valueOf(consentConfig.getPrivacyPolicy());
                    hVConsentActivity.setState(HVConsentActivity.ConsentState.GetConsentSuccess.ShowConsentScreen.INSTANCE);
                }
            }
        });
    }

    private final void closeWithError(HVError hvError) {
        callCompletionHandler(hvError, null);
        setResult(-1, new Intent());
        finish();
    }

    private final void consentVisibility(boolean shouldShow) {
        int i10 = shouldShow ? 0 : 4;
        TextView textView = this.tvTitle;
        MaterialButton materialButton = null;
        if (textView == null) {
            Intrinsics.v("tvTitle");
            textView = null;
        }
        textView.setVisibility(i10);
        TextView textView2 = this.tvSubtitle;
        if (textView2 == null) {
            Intrinsics.v("tvSubtitle");
            textView2 = null;
        }
        textView2.setVisibility(i10);
        CheckBox checkBox = this.consentCheckBox;
        if (checkBox == null) {
            Intrinsics.v("consentCheckBox");
            checkBox = null;
        }
        checkBox.setVisibility(i10);
        MaterialButton materialButton2 = this.acceptButton;
        if (materialButton2 == null) {
            Intrinsics.v("acceptButton");
            materialButton2 = null;
        }
        materialButton2.setVisibility(i10);
        MaterialButton materialButton3 = this.denyButton;
        if (materialButton3 == null) {
            Intrinsics.v("denyButton");
        } else {
            materialButton = materialButton3;
        }
        materialButton.setVisibility(i10);
    }

    private final void errorRetryVisibility(boolean shouldShow, final ConsentState consentState) {
        int i10 = 4;
        int i11 = shouldShow ? 0 : 4;
        if (shouldShow && this.retryAttemptCount >= 3) {
            i10 = 0;
        }
        ConstraintLayout constraintLayout = this.retryLayout;
        MaterialButton materialButton = null;
        if (constraintLayout == null) {
            Intrinsics.v("retryLayout");
            constraintLayout = null;
        }
        constraintLayout.setVisibility(i11);
        MaterialButton materialButton2 = this.btnRetry;
        if (materialButton2 == null) {
            Intrinsics.v("btnRetry");
            materialButton2 = null;
        }
        materialButton2.setVisibility(i11);
        MaterialButton materialButton3 = this.btnCancel;
        if (materialButton3 == null) {
            Intrinsics.v("btnCancel");
            materialButton3 = null;
        }
        materialButton3.setVisibility(i10);
        if (shouldShow) {
            MaterialButton materialButton4 = this.btnRetry;
            if (materialButton4 == null) {
                Intrinsics.v("btnRetry");
            } else {
                materialButton = materialButton4;
            }
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HVConsentActivity.errorRetryVisibility$lambda$8(HVConsentActivity.ConsentState.this, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void errorRetryVisibility$lambda$8(ConsentState consentState, HVConsentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(consentState, "$consentState");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.b(consentState, ConsentState.GetConsentError.INSTANCE)) {
            this$0.retryAttemptCount++;
            this$0.setState(ConsentState.GetConsent.INSTANCE);
        } else if (!Intrinsics.b(consentState, ConsentState.SaveConsentError.INSTANCE)) {
            Log.e(this$0.TAG, "invalid state to retry");
        } else {
            this$0.retryAttemptCount++;
            this$0.setState(ConsentState.SaveConsent.INSTANCE);
        }
    }

    private final void initViews() {
        setupBranding();
        View findViewById = findViewById(co.hyperverge.hypersnapsdk.R.id.ivBack);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.ivBack)");
        this.ivBack = (ImageView) findViewById;
        View findViewById2 = findViewById(co.hyperverge.hypersnapsdk.R.id.lavConsentLoader);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.lavConsentLoader)");
        this.lavConsentLoader = (LottieAnimationView) findViewById2;
        View findViewById3 = findViewById(co.hyperverge.hypersnapsdk.R.id.tvTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.tvTitle)");
        this.tvTitle = (TextView) findViewById3;
        View findViewById4 = findViewById(co.hyperverge.hypersnapsdk.R.id.tvSubtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.tvSubtitle)");
        this.tvSubtitle = (TextView) findViewById4;
        View findViewById5 = findViewById(co.hyperverge.hypersnapsdk.R.id.consentCheckBox);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.consentCheckBox)");
        this.consentCheckBox = (CheckBox) findViewById5;
        View findViewById6 = findViewById(co.hyperverge.hypersnapsdk.R.id.btnConsentAccept);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(R.id.btnConsentAccept)");
        this.acceptButton = (MaterialButton) findViewById6;
        View findViewById7 = findViewById(co.hyperverge.hypersnapsdk.R.id.btnConsentDeny);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(R.id.btnConsentDeny)");
        this.denyButton = (MaterialButton) findViewById7;
        View findViewById8 = findViewById(co.hyperverge.hypersnapsdk.R.id.btnRetry);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(R.id.btnRetry)");
        this.btnRetry = (MaterialButton) findViewById8;
        View findViewById9 = findViewById(co.hyperverge.hypersnapsdk.R.id.btnCancel);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(R.id.btnCancel)");
        this.btnCancel = (MaterialButton) findViewById9;
        View findViewById10 = findViewById(co.hyperverge.hypersnapsdk.R.id.retryLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(R.id.retryLayout)");
        this.retryLayout = (ConstraintLayout) findViewById10;
        ImageView imageView = this.ivBack;
        if (imageView == null) {
            Intrinsics.v("ivBack");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVConsentActivity.initViews$lambda$1(HVConsentActivity.this, view);
            }
        });
        MaterialButton materialButton = this.acceptButton;
        if (materialButton == null) {
            Intrinsics.v("acceptButton");
            materialButton = null;
        }
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVConsentActivity.initViews$lambda$2(HVConsentActivity.this, view);
            }
        });
        MaterialButton materialButton2 = this.denyButton;
        if (materialButton2 == null) {
            Intrinsics.v("denyButton");
            materialButton2 = null;
        }
        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVConsentActivity.initViews$lambda$3(HVConsentActivity.this, view);
            }
        });
        CheckBox checkBox = this.consentCheckBox;
        if (checkBox == null) {
            Intrinsics.v("consentCheckBox");
            checkBox = null;
        }
        checkBox.setOnTouchListener(new View.OnTouchListener() { // from class: co.hyperverge.hypersnapsdk.activities.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean initViews$lambda$4;
                initViews$lambda$4 = HVConsentActivity.initViews$lambda$4(view, motionEvent);
                return initViews$lambda$4;
            }
        });
        CheckBox checkBox2 = this.consentCheckBox;
        if (checkBox2 == null) {
            Intrinsics.v("consentCheckBox");
            checkBox2 = null;
        }
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: co.hyperverge.hypersnapsdk.activities.o
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                HVConsentActivity.initViews$lambda$5(HVConsentActivity.this, compoundButton, z10);
            }
        });
        MaterialButton materialButton3 = this.btnCancel;
        if (materialButton3 == null) {
            Intrinsics.v("btnCancel");
            materialButton3 = null;
        }
        materialButton3.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVConsentActivity.initViews$lambda$6(HVConsentActivity.this, view);
            }
        });
        updateAcceptButtonState(false);
        LottieAnimationView lottieAnimationView = this.lavConsentLoader;
        if (lottieAnimationView == null) {
            Intrinsics.v("lavConsentLoader");
            lottieAnimationView = null;
        }
        HVLottieHelper.load(lottieAnimationView, HVLottieHelper.LOADER_LOTTIE, HVLottieHelper.State.START, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(HVConsentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(false);
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(HVConsentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        this$0.isConsentAcceptedByUser = true;
        this$0.setState(ConsentState.SaveConsent.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(HVConsentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        this$0.isConsentAcceptedByUser = false;
        this$0.setState(ConsentState.SaveConsent.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initViews$lambda$4(View view, MotionEvent motionEvent) {
        if (!(view instanceof TextView)) {
            return false;
        }
        view.onTouchEvent(motionEvent);
        return ((TextView) view).getMovementMethod() instanceof LinkMovementMethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$5(HVConsentActivity this$0, CompoundButton compoundButton, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z10) {
            this$0.updateAcceptButtonState(true);
        } else {
            this$0.updateAcceptButtonState(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$6(HVConsentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setResult(120, new Intent());
        this$0.closeWithError(new HVError(12, this$0.getResources().getString(co.hyperverge.hypersnapsdk.R.string.network_error)));
    }

    private final void loaderVisibility(boolean shouldShow) {
        ImageView imageView = this.ivBack;
        LottieAnimationView lottieAnimationView = null;
        if (imageView == null) {
            Intrinsics.v("ivBack");
            imageView = null;
        }
        imageView.setVisibility(shouldShow ? 4 : 0);
        LottieAnimationView lottieAnimationView2 = this.lavConsentLoader;
        if (lottieAnimationView2 == null) {
            Intrinsics.v("lavConsentLoader");
        } else {
            lottieAnimationView = lottieAnimationView2;
        }
        lottieAnimationView.setVisibility(shouldShow ? 0 : 8);
    }

    private final void logEvent() {
        HVFaceConfig hVFaceConfig = this.faceConfig;
        if (hVFaceConfig == null) {
            Intrinsics.v("faceConfig");
            hVFaceConfig = null;
        }
        HyperSnapSDK.getInstance().logEvent("Consent Screen Shown", kotlin.collections.G.j(lc.t.a(Keys.EVENT, kotlin.collections.G.j(lc.t.a("moduleId", hVFaceConfig.getModuleId())))));
    }

    private final void proceedToSelfie(boolean shouldShowConsentOnBackPress) {
        HVLogUtils.d(this.TAG, "proceedToSelfie() called");
        Intent intent = new Intent(this, (Class<?>) HVFaceActivity.class);
        HVFaceConfig hVFaceConfig = this.faceConfig;
        if (hVFaceConfig == null) {
            Intrinsics.v("faceConfig");
            hVFaceConfig = null;
        }
        intent.putExtra("hvFaceConfig", hVFaceConfig);
        intent.putExtra("shouldShowConsentOnBackPress", shouldShowConsentOnBackPress);
        startActivityForResult(intent, this.consentRequestCode);
    }

    private final void saveConsent() {
        Map<String, Object> deviceProperties = DeviceExtensionsKt.getDeviceProperties(this);
        Map<String, Object> osProperties = DeviceExtensionsKt.getOsProperties(this);
        Object obj = osProperties.get("name");
        Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = osProperties.get("version");
        Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        Object obj3 = deviceProperties.get("model");
        Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.String");
        Object obj4 = deviceProperties.get("manufacturer");
        Intrinsics.e(obj4, "null cannot be cast to non-null type kotlin.String");
        this.consentService.saveConsent(this.isConsentAcceptedByUser, new Consent.DeviceDetails((String) obj, str, "Mobile", (String) obj3, (String) obj4), new ConsentService.SaveConsentCallback() { // from class: co.hyperverge.hypersnapsdk.activities.HVConsentActivity$saveConsent$1
            @Override // co.hyperverge.hypersnapsdk.service.consent.ConsentService.SaveConsentCallback
            public void onError() {
                HVConsentActivity.this.setState(HVConsentActivity.ConsentState.SaveConsentError.INSTANCE);
            }

            @Override // co.hyperverge.hypersnapsdk.service.consent.ConsentService.SaveConsentCallback
            public void onSuccess(String consentIdResult, String consentTokenResult) {
                HVFaceConfig hVFaceConfig;
                HVFaceConfig hVFaceConfig2;
                Intrinsics.checkNotNullParameter(consentIdResult, "consentIdResult");
                Intrinsics.checkNotNullParameter(consentTokenResult, "consentTokenResult");
                if (consentIdResult.length() == 0 || consentTokenResult.length() == 0) {
                    HVConsentActivity.this.setState(HVConsentActivity.ConsentState.SaveConsentSuccess.DenyConsent.INSTANCE);
                    return;
                }
                hVFaceConfig = HVConsentActivity.this.faceConfig;
                HVFaceConfig hVFaceConfig3 = null;
                if (hVFaceConfig == null) {
                    Intrinsics.v("faceConfig");
                    hVFaceConfig = null;
                }
                JSONObject livenessParams = hVFaceConfig.getLivenessParams();
                livenessParams.put("consentId", consentIdResult);
                livenessParams.put("consentToken", consentTokenResult);
                hVFaceConfig2 = HVConsentActivity.this.faceConfig;
                if (hVFaceConfig2 == null) {
                    Intrinsics.v("faceConfig");
                } else {
                    hVFaceConfig3 = hVFaceConfig2;
                }
                hVFaceConfig3.setLivenessAPIParameters(livenessParams);
                HVConsentActivity.this.setState(HVConsentActivity.ConsentState.SaveConsentSuccess.AcceptConsent.INSTANCE);
            }
        });
    }

    private final void sendOperationCancelled() {
        HVLogUtils.d(this.TAG, "sendOperationCancelled() called");
        try {
            callCompletionHandler(new HVError(3, getResources().getString(co.hyperverge.hypersnapsdk.R.string.operation_cancelled)), null);
        } catch (Exception e10) {
            HVLogUtils.e(this.TAG, "sendOperationCancelled(): exception = [" + Utils.getErrorMessage(e10) + ']', e10);
            Log.e(this.TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ConsentState consentState) {
        if (consentState instanceof ConsentState.GetConsent) {
            errorRetryVisibility(false, ConsentState.GetConsent.INSTANCE);
            consentVisibility(false);
            loaderVisibility(true);
            checkIfConsentScreenIsEnabled();
            return;
        }
        if (consentState instanceof ConsentState.GetConsentSuccess) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[((ConsentState.GetConsentSuccess) consentState).getAction().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                proceedToSelfie(false);
                this.retryAttemptCount = 0;
                return;
            }
            loaderVisibility(false);
            consentVisibility(true);
            applyCheckBoxContent();
            logEvent();
            this.retryAttemptCount = 0;
            return;
        }
        if (consentState instanceof ConsentState.GetConsentError) {
            loaderVisibility(false);
            consentVisibility(false);
            errorRetryVisibility(true, ConsentState.GetConsentError.INSTANCE);
            return;
        }
        if (consentState instanceof ConsentState.SaveConsent) {
            errorRetryVisibility(false, ConsentState.SaveConsent.INSTANCE);
            consentVisibility(false);
            loaderVisibility(true);
            saveConsent();
            return;
        }
        if (!(consentState instanceof ConsentState.SaveConsentSuccess)) {
            if (consentState instanceof ConsentState.SaveConsentError) {
                loaderVisibility(false);
                consentVisibility(false);
                errorRetryVisibility(true, ConsentState.SaveConsentError.INSTANCE);
                return;
            }
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$1[((ConsentState.SaveConsentSuccess) consentState).getDecision().ordinal()];
        if (i11 == 1) {
            this.retryAttemptCount = 0;
            proceedToSelfie(true);
        } else {
            if (i11 != 2) {
                return;
            }
            loaderVisibility(false);
            this.retryAttemptCount = 0;
            closeWithError(new HVError(42, getResources().getString(co.hyperverge.hypersnapsdk.R.string.consent_denied)));
        }
    }

    private final void setupBranding() {
        HVLogUtils.d(this.TAG, "setupBranding() called");
        View findViewById = findViewById(co.hyperverge.hypersnapsdk.R.id.inludeBranding);
        TextView tvBranding = (TextView) findViewById.findViewById(co.hyperverge.hypersnapsdk.R.id.tvBranding);
        TextView tvBrandingHyphen = (TextView) findViewById.findViewById(co.hyperverge.hypersnapsdk.R.id.tvBrandingHyphen);
        TextView sdkVersionNumber = (TextView) findViewById.findViewById(co.hyperverge.hypersnapsdk.R.id.sdkVersionNumber);
        sdkVersionNumber.setText("v7.0.1");
        Intrinsics.checkNotNullExpressionValue(tvBranding, "tvBranding");
        tvBranding.setVisibility(!SDKInternalConfig.getInstance().isShouldUseBranding() ? 8 : 0);
        Intrinsics.checkNotNullExpressionValue(tvBrandingHyphen, "tvBrandingHyphen");
        tvBrandingHyphen.setVisibility(!SDKInternalConfig.getInstance().isShouldShowSDKVersion() ? 8 : 0);
        Intrinsics.checkNotNullExpressionValue(sdkVersionNumber, "sdkVersionNumber");
        sdkVersionNumber.setVisibility(SDKInternalConfig.getInstance().isShouldShowSDKVersion() ? 0 : 8);
    }

    private final void updateAcceptButtonState(boolean shouldEnable) {
        MaterialButton materialButton = null;
        if (shouldEnable) {
            MaterialButton materialButton2 = this.acceptButton;
            if (materialButton2 == null) {
                Intrinsics.v("acceptButton");
                materialButton2 = null;
            }
            materialButton2.setEnabled(true);
            HyperSnapUIConfigUtil hyperSnapUIConfigUtil = HyperSnapUIConfigUtil.getInstance();
            MaterialButton materialButton3 = this.acceptButton;
            if (materialButton3 == null) {
                Intrinsics.v("acceptButton");
            } else {
                materialButton = materialButton3;
            }
            hyperSnapUIConfigUtil.setButtonBackgroundColor("#554EF1", materialButton);
            return;
        }
        MaterialButton materialButton4 = this.acceptButton;
        if (materialButton4 == null) {
            Intrinsics.v("acceptButton");
            materialButton4 = null;
        }
        materialButton4.setEnabled(false);
        HyperSnapUIConfigUtil hyperSnapUIConfigUtil2 = HyperSnapUIConfigUtil.getInstance();
        MaterialButton materialButton5 = this.acceptButton;
        if (materialButton5 == null) {
            Intrinsics.v("acceptButton");
        } else {
            materialButton = materialButton5;
        }
        hyperSnapUIConfigUtil2.setButtonBackgroundColor("#CFDDFF", materialButton);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    protected void callCompletionHandler(HVError hvError, HVResponse hvResponse) {
        HVFaceConfig hVFaceConfig = this.faceConfig;
        if (hVFaceConfig == null) {
            Intrinsics.v("faceConfig");
            hVFaceConfig = null;
        }
        HVBaseActivity.callCompletionHandler(hVFaceConfig.getModuleId(), getAppFilesDir(), CallbackProvider.get().injectFaceCaptureCallback(), hvError, hvResponse);
        if (hvError == null || hvError.getErrorCode() != 44) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("hvError", hvError);
        setResult(AppConstants.SDK_EXIT_ERROR, intent);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    protected HVBaseConfig getBaseConfig() {
        HVFaceConfig hVFaceConfig = this.faceConfig;
        if (hVFaceConfig != null) {
            return hVFaceConfig;
        }
        Intrinsics.v("faceConfig");
        return null;
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    protected Integer getInsetContentId() {
        return Integer.valueOf(co.hyperverge.hypersnapsdk.R.id.hv_consent);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    protected View getInsetView() {
        View findViewById = findViewById(co.hyperverge.hypersnapsdk.R.id.hv_consent_screen_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.hv_consent_screen_layout)");
        return findViewById;
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        HVLogUtils.d(this.TAG, "onActivityResult() called with: requestCode = [" + requestCode + "], resultCode = [" + resultCode + "], data = [" + data + ']');
        if (requestCode == this.consentRequestCode) {
            Intent intent = new Intent();
            if (resultCode == -1) {
                setResult(-1, intent);
                finish();
                return;
            }
            if (resultCode == 200) {
                setState(ConsentState.GetConsent.INSTANCE);
                return;
            }
            if (resultCode == 300) {
                setResult(0, intent);
                finish();
                return;
            }
            HVFaceConfig hVFaceConfig = null;
            if (resultCode == 1003) {
                Serializable serializableExtra = data != null ? data.getSerializableExtra("hvError") : null;
                HVError hVError = serializableExtra instanceof HVError ? (HVError) serializableExtra : null;
                HVFaceConfig hVFaceConfig2 = this.faceConfig;
                if (hVFaceConfig2 == null) {
                    Intrinsics.v("faceConfig");
                } else {
                    hVFaceConfig = hVFaceConfig2;
                }
                if (hVFaceConfig.isShouldShowInstructionPage()) {
                    intent.putExtra("hvError", hVError);
                    setResult(AppConstants.PERMISSION_CANCELLED, intent);
                } else if (hVError != null) {
                    closeWithError(hVError);
                }
                finish();
                return;
            }
            if (resultCode != 1004) {
                return;
            }
            Serializable serializableExtra2 = data != null ? data.getSerializableExtra("hvError") : null;
            HVError hVError2 = serializableExtra2 instanceof HVError ? (HVError) serializableExtra2 : null;
            HVFaceConfig hVFaceConfig3 = this.faceConfig;
            if (hVFaceConfig3 == null) {
                Intrinsics.v("faceConfig");
            } else {
                hVFaceConfig = hVFaceConfig3;
            }
            if (hVFaceConfig.isShouldShowInstructionPage()) {
                intent.putExtra("hvError", hVError2);
                setResult(AppConstants.FACE_DETECTOR_ERROR, intent);
            } else if (hVError2 != null) {
                closeWithError(hVError2);
            }
            finish();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    protected void onCloseActivity() {
        HVLogUtils.d(this.TAG, "onCloseActivity() called");
        HVFaceConfig hVFaceConfig = this.faceConfig;
        if (hVFaceConfig == null) {
            Intrinsics.v("faceConfig");
            hVFaceConfig = null;
        }
        if (!hVFaceConfig.isShouldShowInstructionPage()) {
            sendOperationCancelled();
        }
        finish();
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            HVLogUtils.d(this.TAG, "onCreate() savedInstance is not null, finishing activity");
            finish();
            return;
        }
        setContentView(co.hyperverge.hypersnapsdk.R.layout.hv_activity_consent_screen);
        HVFaceConfig hVFaceConfig = (HVFaceConfig) getIntent().getSerializableExtra("hvFaceConfig");
        Intrinsics.d(hVFaceConfig);
        this.faceConfig = hVFaceConfig;
        initViews();
        setState(ConsentState.GetConsent.INSTANCE);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public void onRemoteConfigFetchDone() {
        HVLogUtils.d(this.TAG, "onRemoteConfigFetchDone() called");
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    protected boolean shouldAllowActivityClose() {
        return true;
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    protected boolean shouldShowCloseAlert() {
        HVFaceConfig hVFaceConfig = this.faceConfig;
        if (hVFaceConfig == null) {
            Intrinsics.v("faceConfig");
            hVFaceConfig = null;
        }
        return hVFaceConfig.shouldShowCloseAlert();
    }
}
