package co.hyperverge.hypersnapsdk.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.C1410l;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.model.UIConfig;
import co.hyperverge.hypersnapsdk.model.UIFont;
import co.hyperverge.hypersnapsdk.model.UIFontWeight;
import co.hyperverge.hypersnapsdk.model.UIIcons;
import co.hyperverge.hypersnapsdk.model.UILogos;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.utils.PicassoManager;
import com.appsflyer.attribution.RequestError;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import h.AbstractC3220a;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class HyperSnapUIConfigUtil {
    private static final String TAG = "co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil";
    private static HyperSnapUIConfigUtil hyperSnapUIConfigUtil;
    private Context appContext;
    private Map<TextKey, String> defaultFontMap;
    private final Set<String> fontFilePaths = new HashSet();
    private final HashMap<TextKey, Typeface> typefaceMap = new HashMap<>();
    private boolean isDefaultIconsUsed = true;

    /* renamed from: co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey;

        static {
            int[] iArr = new int[TextKey.values().length];
            $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey = iArr;
            try {
                iArr[TextKey.TITLE_TEXT_KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.DESCRIPTION_TEXT_KEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.STATUS_TEXT_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.DOCUMENT_SIDE_HINT_TEXT_KEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.RETAKE_MESSAGE_TEXT_KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.PRIMARY_BUTTON_TEXT_KEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.SECONDARY_BUTTON_TEXT_KEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.ALERT_TEXT_BOX_TEXT_KEY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.PICKER_BUTTON_TEXT_KEY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.COUNTRY_LIST_ITEM_TEXT_KEY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.COUNTRY_LIST_ITEM_SELECTED_TEXT_KEY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.COUNTRY_SEARCH_HINT_TEXT_KEY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.STATEMENT_HELPER_TEXT_KEY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.STATEMENT_TEXT_KEY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.LOADER_TEXT_KEY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.NFC_STATUS_TEXT_KEY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.NFC_PROGRESS_TEXT_KEY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.API_LOADING_TITLE_TEXT_KEY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[TextKey.API_LOADING_HINT_TEXT_KEY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    enum TextKey {
        TITLE_TEXT_KEY("titleText"),
        DESCRIPTION_TEXT_KEY("descriptionText"),
        STATUS_TEXT_KEY("statusText"),
        DOCUMENT_SIDE_HINT_TEXT_KEY("documentSideHintText"),
        RETAKE_MESSAGE_TEXT_KEY("retakeMessageText"),
        PRIMARY_BUTTON_TEXT_KEY("primaryButtonText"),
        SECONDARY_BUTTON_TEXT_KEY("secondaryButtonText"),
        ALERT_TEXT_BOX_TEXT_KEY("alertTextBoxText"),
        PICKER_BUTTON_TEXT_KEY("pickerButtonText"),
        COUNTRY_LIST_ITEM_TEXT_KEY("countryListItemText"),
        COUNTRY_LIST_ITEM_SELECTED_TEXT_KEY("countryListItemSelectedText"),
        COUNTRY_SEARCH_HINT_TEXT_KEY("countrySearchHintText"),
        STATEMENT_HELPER_TEXT_KEY("statementHelperText"),
        STATEMENT_TEXT_KEY("statementText"),
        LOADER_TEXT_KEY("loaderText"),
        NFC_STATUS_TEXT_KEY("nfcStatusText"),
        BRANDING_COLOUR_KEY("brandingColor"),
        NFC_PROGRESS_TEXT_KEY("nfcProgressText"),
        API_LOADING_TITLE_TEXT_KEY("apiLoadingTitleText"),
        API_LOADING_HINT_TEXT_KEY("apiLoadingHintText");

        private final String keyValue;

        TextKey(String str) {
            this.keyValue = str;
        }

        String getKeyValue() {
            return this.keyValue;
        }
    }

    private HyperSnapUIConfigUtil() {
    }

    private void createFontPaths(String str) {
        String str2 = TAG;
        HVLogUtils.d(str2, "createFontPaths() called with: path = [" + str + "]");
        Context appContext = getAppContext();
        if (appContext == null) {
            Log.d(str2, "createFontPaths: context is null");
            return;
        }
        try {
            String[] list = appContext.getAssets().list(str);
            if (list == null || list.length <= 0) {
                return;
            }
            for (String str3 : list) {
                if (str3.contains(".")) {
                    String substring = str3.substring(str3.lastIndexOf("."));
                    if (substring.equalsIgnoreCase(".ttf") || substring.equalsIgnoreCase(".otf")) {
                        if (str.isEmpty()) {
                            this.fontFilePaths.add(str3);
                        } else {
                            this.fontFilePaths.add(str + "/" + str3);
                        }
                    }
                } else if (str.equals(BuildConfig.FLAVOR)) {
                    createFontPaths(str3);
                } else {
                    createFontPaths(str + "/" + str3);
                }
            }
        } catch (IOException e10) {
            String str4 = TAG;
            HVLogUtils.e(str4, "createFontPaths() with: path = [" + str + "]: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str4, Utils.getErrorMessage(e10));
        }
    }

    private void createTypefaceMap() {
        String titleTextFont;
        String titleTextWeight;
        HVLogUtils.d(TAG, "createTypefaceMap() called");
        UIFont font = getConfig().getFont();
        UIFontWeight fontWeight = getConfig().getFontWeight();
        for (TextKey textKey : TextKey.values()) {
            switch (AnonymousClass5.$SwitchMap$co$hyperverge$hypersnapsdk$utils$HyperSnapUIConfigUtil$TextKey[textKey.ordinal()]) {
                case 1:
                    titleTextFont = font.getTitleTextFont();
                    titleTextWeight = fontWeight.getTitleTextWeight();
                    break;
                case 2:
                    titleTextFont = font.getDescriptionTextFont();
                    titleTextWeight = fontWeight.getDescriptionTextWeight();
                    break;
                case 3:
                    titleTextFont = font.getStatusTextFont();
                    titleTextWeight = fontWeight.getStatusTextWeight();
                    break;
                case 4:
                    titleTextFont = font.getDocumentSideHintTextFont();
                    titleTextWeight = fontWeight.getDocumentSideHintTextWeight();
                    break;
                case 5:
                    titleTextFont = font.getRetakeMessageFont();
                    titleTextWeight = fontWeight.getRetakeMessageWeight();
                    break;
                case 6:
                    titleTextFont = font.getPrimaryButtonTextFont();
                    titleTextWeight = fontWeight.getPrimaryButtonTextWeight();
                    break;
                case 7:
                    titleTextFont = font.getSecondaryButtonTextFont();
                    titleTextWeight = fontWeight.getSecondaryButtonTextWeight();
                    break;
                case 8:
                    titleTextFont = font.getAlertTextBoxTextFont();
                    titleTextWeight = fontWeight.getAlertTextBoxTextWeight();
                    break;
                case 9:
                    titleTextFont = font.getPickerTextFont();
                    titleTextWeight = fontWeight.getPickerTextWeight();
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    titleTextFont = font.getCountryListItemTextFont();
                    titleTextWeight = fontWeight.getCountryListItemTextFontWeight();
                    break;
                case 11:
                    titleTextFont = font.getCountryListItemSelectedTextFont();
                    titleTextWeight = fontWeight.getCountryListItemSelectedTextFontWeight();
                    break;
                case 12:
                    titleTextFont = font.getCountrySearchTextFont();
                    titleTextWeight = fontWeight.getCountrySearchTextFontWeight();
                    break;
                case 13:
                    titleTextFont = font.getStatementHelperTextFont();
                    titleTextWeight = fontWeight.getStatementHelperTextWeight();
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    titleTextFont = font.getStatementTextFont();
                    titleTextWeight = fontWeight.getStatementTextWeight();
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    titleTextFont = font.getLoaderTextFont();
                    titleTextWeight = fontWeight.getLoaderTextWeight();
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    titleTextFont = font.getNfcStatusTextFont();
                    titleTextWeight = fontWeight.getNfcStatusTextWeight();
                    break;
                case 18:
                    titleTextFont = font.getApiLoadingTitleTextFont();
                    titleTextWeight = fontWeight.getApiLoadingTitleTextWeight();
                    break;
                case 19:
                    titleTextFont = font.getApiLoadingHintTextFont();
                    titleTextWeight = fontWeight.getApiLoadingHintTextWeight();
                    break;
                default:
                    titleTextFont = BuildConfig.FLAVOR;
                    titleTextWeight = BuildConfig.FLAVOR;
                    break;
            }
            Typeface font2 = getFont(titleTextFont, titleTextWeight);
            if (font2 == null) {
                logFontError(textKey.getKeyValue(), titleTextFont, titleTextWeight);
                font2 = getDefaultTypeface(this.defaultFontMap.get(textKey));
            }
            this.typefaceMap.put(textKey, font2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getAppContext() {
        Context context = this.appContext;
        if (context != null) {
            return context;
        }
        return null;
    }

    private Typeface getDefaultTypeface(String str) {
        String str2 = TAG;
        HVLogUtils.d(str2, "getDefaultTypeface() called with: fontResourceName = [" + str + "]");
        if (getAppContext() == null) {
            Log.d(str2, "getFontResourceIdentifier: context is null");
        }
        try {
            return androidx.core.content.res.f.h(getAppContext(), getFontResourceIdentifier(str, getAppContext()));
        } catch (Resources.NotFoundException e10) {
            String str3 = TAG;
            HVLogUtils.e(str3, "getDefaultTypeface(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str3, Utils.getErrorMessage(e10));
            return null;
        }
    }

    private Typeface getFontFromResources(String str, String str2) {
        String str3 = TAG;
        HVLogUtils.d(str3, "getFontFromResources() called with: fontFamily = [" + str + "], fontWeight = [" + str2 + "]");
        if (getAppContext() == null) {
            Log.d(str3, "getFontFromResources: context is null");
            return null;
        }
        try {
            return androidx.core.content.res.f.h(getAppContext(), getFontResourceIdentifier(str.toLowerCase() + "_" + str2.toLowerCase(), getAppContext()));
        } catch (Resources.NotFoundException e10) {
            String str4 = TAG;
            HVLogUtils.e(str4, "getFontFromResources(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str4, Utils.getErrorMessage(e10));
            return null;
        }
    }

    private int getFontResourceIdentifier(String str, Context context) {
        String str2 = TAG;
        HVLogUtils.d(str2, "getFontResourceIdentifier() called with: resourceName = [" + str + "], context = [" + context + "]");
        if (getAppContext() == null) {
            Log.d(str2, "getFontResourceIdentifier: context is null");
        }
        return context.getResources().getIdentifier(str, "font", context.getPackageName());
    }

    public static HyperSnapUIConfigUtil getInstance() {
        if (hyperSnapUIConfigUtil == null) {
            hyperSnapUIConfigUtil = new HyperSnapUIConfigUtil();
        }
        return hyperSnapUIConfigUtil;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preloadFonts$0() {
        createDefaultFontMap();
        if (shouldCreateFontPaths(getConfig().getFont(), getConfig().getFontWeight())) {
            createFontPaths(BuildConfig.FLAVOR);
        }
        createTypefaceMap();
    }

    private void logFontError(String str, String str2, String str3) {
        String str4 = "Could not find fonts with FontFamily : " + str2 + " and FontWeight : " + str3 + " for " + str;
        HVLogUtils.d(TAG, str4);
        Log.e("Fonts", str4);
    }

    private void prefetchImage(String str) {
        String str2 = TAG;
        HVLogUtils.d(str2, "prefetchImage() called with: httpUrl = [" + str + "]");
        if (getAppContext() == null) {
            Log.d(str2, "prefetchImage: context is null");
        } else {
            PicassoManager.getInstance(getAppContext()).prefetchImage(str);
        }
    }

    private void preloadAnimation() {
        String str = TAG;
        HVLogUtils.d(str, "preloadAnimation() called");
        if (getAppContext() == null) {
            Log.d(str, "preloadAnimation: context is null");
        } else if (getConfig().getAnimation() != null) {
            getConfig().getAnimation().preloadAnimation(getAppContext());
        }
    }

    private void preloadBackgroundImage() {
        HVLogUtils.d(TAG, "preloadBackgroundImage() called");
        if (!StringUtils.isEmptyOrNull(getConfig().getBackgroundImage())) {
            prefetchImage(getConfig().getBackgroundImage());
        }
        if (!StringUtils.isEmptyOrNull(getConfig().getGradient().getPrimaryButtonEnabledGradient().getImageUrl())) {
            prefetchImage(getConfig().getGradient().getPrimaryButtonEnabledGradient().getImageUrl());
        }
        if (!StringUtils.isEmptyOrNull(getConfig().getGradient().getPrimaryButtonDisabledGradient().getImageUrl())) {
            prefetchImage(getConfig().getGradient().getPrimaryButtonDisabledGradient().getImageUrl());
        }
        if (!StringUtils.isEmptyOrNull(getConfig().getGradient().getSecondaryButtonEnabledGradient().getImageUrl())) {
            prefetchImage(getConfig().getGradient().getSecondaryButtonEnabledGradient().getImageUrl());
        }
        if (!StringUtils.isEmptyOrNull(getConfig().getGradient().getSecondaryButtonDisabledGradient().getImageUrl())) {
            prefetchImage(getConfig().getGradient().getSecondaryButtonDisabledGradient().getImageUrl());
        }
        if (!StringUtils.isEmptyOrNull(getConfig().getGradient().getCaptureScreenEnabledButtonGradient().getImageUrl())) {
            prefetchImage(getConfig().getGradient().getCaptureScreenEnabledButtonGradient().getImageUrl());
        }
        if (StringUtils.isEmptyOrNull(getConfig().getGradient().getCaptureScreenDisabledButtonGradient().getImageUrl())) {
            return;
        }
        prefetchImage(getConfig().getGradient().getCaptureScreenDisabledButtonGradient().getImageUrl());
    }

    private void preloadIcons() {
        HVLogUtils.d(TAG, "preloadIcons() called");
        UIIcons.UIIconProperties primaryButtonIcon = getConfig().getIcons().getPrimaryButtonIcon();
        String url = primaryButtonIcon.getUrl();
        if (!StringUtils.isEmptyOrNull(url) && primaryButtonIcon.isShouldShow()) {
            prefetchImage(url);
        }
        String url2 = getConfig().getIcons().getBackButtonIcon().getUrl();
        if (!StringUtils.isEmptyOrNull(url2)) {
            prefetchImage(url2);
        }
        String url3 = getConfig().getIcons().getCaptureScreenBackButtonIcon().getUrl();
        if (!StringUtils.isEmptyOrNull(url3)) {
            prefetchImage(url3);
        }
        String url4 = getConfig().getIcons().getCloseButtonIcon().getUrl();
        if (StringUtils.isEmptyOrNull(url4)) {
            return;
        }
        prefetchImage(url4);
    }

    private void preloadLogos() {
        HVLogUtils.d(TAG, "preloadLogos() called");
        UILogos logos = getConfig().getLogos();
        if (!StringUtils.isEmptyOrNull(logos.getClientLogo())) {
            prefetchImage(logos.getClientLogo());
        }
        if (StringUtils.isEmptyOrNull(logos.getCaptureScreenClientLogo())) {
            return;
        }
        prefetchImage(logos.getCaptureScreenClientLogo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap resizeAndRoundBitmap(Bitmap bitmap, Button button, float f10, String str, int i10) {
        HVLogUtils.d(TAG, "resizeAndRoundBitmap() called with: bitmap = [" + bitmap + "]");
        int width = button.getWidth();
        int height = button.getHeight();
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Button dimensions must be greater than 0.");
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = width;
        float f12 = height;
        Matrix matrix = new Matrix();
        matrix.postScale(f11 / bitmap.getWidth(), f12 / bitmap.getHeight());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f13 = i10;
        canvas.drawRoundRect(new RectF(f13, f13, width - i10, height - i10), f10, f10, paint);
        if (i10 > 0) {
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setColor(Color.parseColor(str));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(f13);
            float f14 = f13 / 2.0f;
            canvas.drawRoundRect(new RectF(f14, f14, f11 - f14, f12 - f14), f10, f10, paint2);
        }
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap scaleBitmap(Bitmap bitmap) {
        HVLogUtils.d(TAG, "scaleBitmap() called with: bitmap = [" + bitmap + "]");
        float primaryButtonTextSize = getConfig().getFontSize().getPrimaryButtonTextSize();
        float width = ((float) bitmap.getWidth()) * (primaryButtonTextSize / ((float) bitmap.getHeight()));
        Matrix matrix = new Matrix();
        matrix.postScale(width / ((float) bitmap.getWidth()), primaryButtonTextSize / ((float) bitmap.getHeight()));
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private boolean shouldCreateFontPaths(UIFont uIFont, UIFontWeight uIFontWeight) {
        return ((uIFont == null || uIFont.isDefaultUIFont()) && (uIFontWeight == null || uIFontWeight.isDefaultUIFontWeight())) ? false : true;
    }

    public void createDefaultFontMap() {
        HVLogUtils.d(TAG, "createDefaultFontMap() called");
        HashMap hashMap = new HashMap();
        this.defaultFontMap = hashMap;
        hashMap.put(TextKey.TITLE_TEXT_KEY, "mulish_bold");
        this.defaultFontMap.put(TextKey.DESCRIPTION_TEXT_KEY, "mulish_regular");
        this.defaultFontMap.put(TextKey.NFC_STATUS_TEXT_KEY, "mulish_regular");
        this.defaultFontMap.put(TextKey.NFC_PROGRESS_TEXT_KEY, "mulish_regular");
        this.defaultFontMap.put(TextKey.API_LOADING_TITLE_TEXT_KEY, "mulish_regular");
        this.defaultFontMap.put(TextKey.API_LOADING_HINT_TEXT_KEY, "mulish_regular");
        this.defaultFontMap.put(TextKey.STATUS_TEXT_KEY, "mulish_bold");
        this.defaultFontMap.put(TextKey.DOCUMENT_SIDE_HINT_TEXT_KEY, "mulish_regular");
        this.defaultFontMap.put(TextKey.RETAKE_MESSAGE_TEXT_KEY, "mulish_regular");
        this.defaultFontMap.put(TextKey.PRIMARY_BUTTON_TEXT_KEY, "mulish_semibold");
        this.defaultFontMap.put(TextKey.SECONDARY_BUTTON_TEXT_KEY, "mulish_semibold");
        this.defaultFontMap.put(TextKey.ALERT_TEXT_BOX_TEXT_KEY, "mulish_regular");
        this.defaultFontMap.put(TextKey.PICKER_BUTTON_TEXT_KEY, "mulish_semibold");
        this.defaultFontMap.put(TextKey.COUNTRY_LIST_ITEM_TEXT_KEY, "mulish_regular");
        this.defaultFontMap.put(TextKey.COUNTRY_LIST_ITEM_SELECTED_TEXT_KEY, "mulish_bold");
        this.defaultFontMap.put(TextKey.COUNTRY_SEARCH_HINT_TEXT_KEY, "mulish_semibold");
    }

    public void customiseAlertBoxTextView(TextView textView) {
        HVLogUtils.d(TAG, "customiseAlertBoxTextView() called with: textView = [" + textView + "]");
        setTextColor(textView, getConfig().getColors().getAlertTextBoxTextColor());
        setBorderColor(getConfig().getColors().getAlertTextBoxBorderColor(), textView);
        setBackgroundColor(textView, getConfig().getColors().getAlertTextBoxBackgroundColor());
        setTextSize(getConfig().getFontSize().getAlertTextBoxTextSize(), textView);
        setFont(textView, TextKey.ALERT_TEXT_BOX_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getAlertTextBoxTextLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getAlertTextBoxTextCharSpacing());
    }

    public void customiseApiLoadingHintText(TextView textView) {
        HVLogUtils.d(TAG, "customiseApiLoadingHintText() called with: apiLoadingHintText = [" + textView + "]");
        setTextColor(textView, getConfig().getColors().getApiLoadingHintTextColor());
        setTextSize(getConfig().getFontSize().getApiLoadingHintTextSize(), textView);
        setGravity(getConfig().getAlignment().getApiLoadingHintTextAlignment(), textView);
        setFont(textView, TextKey.API_LOADING_HINT_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getApiLoadingHintTextLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getApiLoadingHintTextCharSpacing());
    }

    public void customiseApiLoadingTitleText(TextView textView) {
        HVLogUtils.d(TAG, "customiseApiLoadingTitleText() called with: apiLoadingTitleText = [" + textView + "]");
        setTextColor(textView, getConfig().getColors().getApiLoadingTitleTextColor());
        setTextSize(getConfig().getFontSize().getApiLoadingTitleTextSize(), textView);
        setGravity(getConfig().getAlignment().getApiLoadingTitleTextAlignment(), textView);
        setFont(textView, TextKey.API_LOADING_TITLE_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getApiLoadingTitleTextLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getApiLoadingTitleTextCharSpacing());
    }

    public void customiseBackButtonIcon(ImageView imageView) {
        customiseBackButtonIcon(imageView, false);
    }

    public void customiseBackgroundImage(final View view) {
        String str = TAG;
        HVLogUtils.d(str, "customiseBackgroundImage() called with: view = [" + view + "]");
        if (getAppContext() == null) {
            Log.d(str, "customiseBackgroundImage: context is null");
            return;
        }
        String backgroundImage = getConfig().getBackgroundImage();
        if (StringUtils.isEmptyOrNull(backgroundImage)) {
            return;
        }
        PicassoManager.getInstance(getAppContext()).getBitmap(backgroundImage, new PicassoManager.ImageDownloaderCallback() { // from class: co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil.4
            @Override // co.hyperverge.hypersnapsdk.utils.PicassoManager.ImageDownloaderCallback
            public void onError(String str2) {
            }

            @Override // co.hyperverge.hypersnapsdk.utils.PicassoManager.ImageDownloaderCallback
            public void onSuccess(Bitmap bitmap) {
                view.setBackground(new BitmapDrawable(HyperSnapUIConfigUtil.this.getAppContext().getResources(), bitmap));
            }
        });
    }

    public void customiseBrandingColor(TextView textView) {
        HVLogUtils.d(TAG, "customiseBrandingTextColor() called with: textView = [" + textView + "]");
        String brandingColor = getConfig().getColors().getBrandingColor();
        if (Objects.equals(brandingColor, "#050552")) {
            setTextColor(textView, "#050552");
            androidx.core.widget.k.h(textView, ColorStateList.valueOf(Color.parseColor("#27ae60")));
        } else {
            setTextColor(textView, brandingColor);
            androidx.core.widget.k.h(textView, ColorStateList.valueOf(Color.parseColor(brandingColor)));
        }
    }

    public void customiseCaptureButton(final ImageView imageView) {
        HVLogUtils.d(TAG, "customiseCaptureButton() called with: imageView = [" + imageView + "]");
        String imageUrl = (imageView.isEnabled() ? getConfig().getGradient().getCaptureScreenEnabledButtonGradient() : getConfig().getGradient().getCaptureScreenDisabledButtonGradient()).getImageUrl();
        if (imageUrl != null && !imageUrl.isEmpty()) {
            PicassoManager.getInstance(getAppContext()).getBitmap(imageUrl, new PicassoManager.ImageDownloaderCallback() { // from class: co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil.1
                @Override // co.hyperverge.hypersnapsdk.utils.PicassoManager.ImageDownloaderCallback
                public void onError(String str) {
                    Log.e(HyperSnapUIConfigUtil.TAG, "Failed to load capture button background image: " + str);
                }

                @Override // co.hyperverge.hypersnapsdk.utils.PicassoManager.ImageDownloaderCallback
                public void onSuccess(Bitmap bitmap) {
                    if (bitmap == null) {
                        Log.e(HyperSnapUIConfigUtil.TAG, "Failed to set capture button background: bitmap is null.");
                    } else {
                        imageView.setImageBitmap(bitmap);
                        HVLogUtils.d(HyperSnapUIConfigUtil.TAG, "Capture button background image set successfully.");
                    }
                }
            });
        } else if (isValidHexColor(getConfig().getColors().getCaptureButtonColor())) {
            androidx.core.widget.g.c(imageView, ColorStateList.valueOf(Color.parseColor(getConfig().getColors().getCaptureButtonColor())));
        }
    }

    public void customiseClientLogo(ImageView imageView) {
        customiseClientLogo(imageView, false);
    }

    public void customiseCloseButtonIcon(ImageView imageView) {
        String str = TAG;
        HVLogUtils.d(str, "customiseCloseButtonIcon() called with: imageView = [" + imageView + "]");
        if (getAppContext() == null) {
            HVLogUtils.d(str, "customiseCloseButtonIcon: context is null");
            return;
        }
        String url = getConfig().getIcons().getCloseButtonIcon().getUrl();
        if (StringUtils.isEmptyOrNull(url)) {
            return;
        }
        PicassoManager.getInstance(getAppContext()).loadInto(url, AbstractC3220a.b(getAppContext(), R.drawable.ic_sdk_close), AbstractC3220a.b(getAppContext(), R.drawable.ic_sdk_close), imageView);
    }

    public void customiseCountryListItem(TextView textView, boolean z10) {
        HVLogUtils.d(TAG, "customiseCountryListItem() called with: textView = [" + textView + "], isSelected = [" + z10 + "]");
        setTextColor(textView, getConfig().getColors().getCountryListItemTextColor());
        setTextSize(getConfig().getFontSize().getCountryListItemTextSize(), textView);
        if (z10) {
            setFont(textView, TextKey.COUNTRY_LIST_ITEM_SELECTED_TEXT_KEY);
            setLineHeight(textView, getConfig().getLineHeight().getCountryListItemSelectedTextLineHeight());
            setCharacterSpacing(textView, getConfig().getCharSpacing().getCountryListItemSelectedTextCharSpacing());
        } else {
            setFont(textView, TextKey.COUNTRY_LIST_ITEM_TEXT_KEY);
            setLineHeight(textView, getConfig().getLineHeight().getCountryListItemTextLineHeight());
            setCharacterSpacing(textView, getConfig().getCharSpacing().getCountryListItemTextCharSpacing());
        }
    }

    public void customiseCountrySearchText(C1410l c1410l) {
        HVLogUtils.d(TAG, "customiseCountrySearchText() called with: editText = [" + c1410l + "]");
        setTextColor(c1410l, getConfig().getColors().getCountrySearchTextColor());
        setTextSize(getConfig().getFontSize().getCountrySearchTextSize(), c1410l);
        setFont(c1410l, TextKey.COUNTRY_SEARCH_HINT_TEXT_KEY);
        setLineHeight((EditText) c1410l, getConfig().getLineHeight().getCountrySearchTextLineHeight());
        setCharacterSpacing((EditText) c1410l, getConfig().getCharSpacing().getAlertTextBoxTextCharSpacing());
    }

    public void customiseDescriptionTextView(TextView textView, boolean z10) {
        HVLogUtils.d(TAG, "customiseDescriptionTextView() called with: textView = [" + textView + "], isCaptureScreen = [" + z10 + "]");
        String captureScreenDescriptionTextColor = z10 ? getConfig().getColors().getCaptureScreenDescriptionTextColor() : getConfig().getColors().getDescriptionTextColor();
        if (captureScreenDescriptionTextColor.isEmpty()) {
            captureScreenDescriptionTextColor = getConfig().getColors().getDescriptionTextColor();
        }
        setTextColor(textView, captureScreenDescriptionTextColor);
        setTextSize(getConfig().getFontSize().getDescriptionTextSize(), textView);
        setGravity(getConfig().getAlignment().getDescriptionTextAlignment(), textView);
        setFont(textView, TextKey.DESCRIPTION_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getDescriptionTextLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getDescriptionTextCharSpacing());
    }

    public void customiseDocumentSideTextView(TextView textView) {
        HVLogUtils.d(TAG, "customiseDocumentSideTextView() called with: textView = [" + textView + "]");
        setTextColor(textView, getConfig().getColors().getDocumentSideHintTextColor());
        setTextSize(getConfig().getFontSize().getDocumentSideHintTextSize(), textView);
        setFont(textView, TextKey.DOCUMENT_SIDE_HINT_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getDocumentSideHintTextLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getDocumentSideHintTextCharSpacing());
    }

    public void customiseEditText(EditText editText) {
        HVLogUtils.d(TAG, "customiseEditText() called with: editText = [" + editText + "]");
        setFont(editText, TextKey.TITLE_TEXT_KEY);
        setLineHeight(editText, getConfig().getLineHeight().getTitleTextLineHeight());
        setCharacterSpacing(editText, getConfig().getCharSpacing().getTitleTextCharSpacing());
    }

    public void customiseLoaderTextView(TextView textView) {
        HVLogUtils.d(TAG, "customiseLoaderTextView() called with: textView = [" + textView + "]");
        setTextColor(textView, getConfig().getColors().getLoaderTextColor());
        setTextSize(getConfig().getFontSize().getLoaderTextSize(), textView);
        setFont(textView, TextKey.LOADER_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getLoaderTextLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getLoaderTextCharSpacing());
    }

    public void customiseNfcProgressTextView(Paint paint) {
        setFont(paint);
    }

    public void customiseNfcStatusTextView(TextView textView, String str) {
        float f10;
        HVLogUtils.d(TAG, "customiseNfcStatusTextView() called with: textView = [" + textView + "], status = [" + str + "]");
        setTextColor(textView, str.equalsIgnoreCase("failure") ? getConfig().getColors().getNfcStatusErrorTextColor() : getConfig().getColors().getNfcStatusTextColor());
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "success":
                f10 = 0.6f;
                break;
            case "disabled":
                f10 = 0.2f;
                break;
            case "processing":
                f10 = 0.8f;
                break;
            default:
                f10 = 1.0f;
                break;
        }
        setTextSize(getConfig().getFontSize().getNfcStatusTextSize(), textView);
        setGravity(getConfig().getAlignment().getNfcStatusTextAlignment(), textView);
        setFont(textView, TextKey.NFC_STATUS_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getNfcStatusTextLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getNfcStatusTextCharSpacing());
        textView.setAlpha(f10);
    }

    public void customisePickerButton(Button button) {
        HVLogUtils.d(TAG, "customisePickerButton() called with: button = [" + button + "]");
        setButtonBackgroundColor(getConfig().getColors().getPickerBackgroundColor(), button);
        setTextColor(button, getConfig().getColors().getPickerTextColor(), false);
        setBorderColor(getConfig().getColors().getPickerBorderColor(), button);
        setTextSize(getConfig().getFontSize().getPickerTextSize(), button);
        setBorderRadius(getConfig().getBorderRadius().getPickerBorderRadius(), button);
        setFont(button, TextKey.PICKER_BUTTON_TEXT_KEY);
        setLineHeight(button, getConfig().getLineHeight().getPickerTextLineHeight());
        setCharacterSpacing(button, getConfig().getCharSpacing().getPickerTextCharSpacing());
    }

    public void customisePrimaryButton(Button button) {
        HVLogUtils.d(TAG, "customisePrimaryButton() called with: button = [" + button + "]");
        UIIcons.UIIconProperties primaryButtonIcon = getConfig().getIcons().getPrimaryButtonIcon();
        setPrimaryButtonIcon(button, primaryButtonIcon.getUrl(), primaryButtonIcon.isShouldShow());
        String imageUrl = (button.isEnabled() ? getConfig().getGradient().getPrimaryButtonEnabledGradient() : getConfig().getGradient().getPrimaryButtonDisabledGradient()).getImageUrl();
        String primaryButtonBorderColor = button.isEnabled() ? getConfig().getColors().getPrimaryButtonBorderColor() : getConfig().getColors().getPrimaryButtonDisabledBorderColor();
        if (imageUrl == null || imageUrl.isEmpty()) {
            setButtonBackgroundColor(button.isEnabled() ? getConfig().getColors().getPrimaryButtonBackgroundColor() : getConfig().getColors().getPrimaryButtonDisabledBackgroundColor(), button);
        } else {
            setButtonBackgroundImage(imageUrl, button, getConfig().getBorderRadius().getPrimaryButtonRadius(), primaryButtonBorderColor);
        }
        setTextColor(button, getConfig().getColors().getPrimaryButtonTextColor(), true);
        setBorderColor(primaryButtonBorderColor, button);
        setTextSize(getConfig().getFontSize().getPrimaryButtonTextSize(), button);
        setBorderRadius(getConfig().getBorderRadius().getPrimaryButtonRadius(), button);
        setFont(button, TextKey.PRIMARY_BUTTON_TEXT_KEY);
        setLineHeight(button, getConfig().getLineHeight().getPrimaryButtonTextLineHeight());
        setCharacterSpacing(button, getConfig().getCharSpacing().getPrimaryButtonTextCharSpacing());
    }

    public void customiseRetakeMessageTextView(TextView textView) {
        HVLogUtils.d(TAG, "customiseRetakeMessageTextView() called with: textView = [" + textView + "]");
        setTextColor(textView, getConfig().getColors().getRetakeMessageColor());
        setTextSize(getConfig().getFontSize().getRetakeMessageTextSize(), textView);
        setFont(textView, TextKey.RETAKE_MESSAGE_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getRetakeMessageLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getRetakeMessageCharSpacing());
    }

    public void customiseSecondaryButton(Button button) {
        HVLogUtils.d(TAG, "customiseSecondaryButton() called with: button = [" + button + "]");
        String imageUrl = (button.isEnabled() ? getConfig().getGradient().getSecondaryButtonEnabledGradient() : getConfig().getGradient().getSecondaryButtonDisabledGradient()).getImageUrl();
        String secondaryButtonBorderColor = getConfig().getColors().getSecondaryButtonBorderColor();
        if (imageUrl == null || imageUrl.isEmpty()) {
            setButtonBackgroundColor(getConfig().getColors().getSecondaryButtonBackgroundColor(), button);
        } else {
            setButtonBackgroundImage(imageUrl, button, getConfig().getBorderRadius().getSecondaryButtonRadius(), secondaryButtonBorderColor);
        }
        setTextColor(button, getConfig().getColors().getSecondaryButtonTextColor(), false);
        setBorderColor(getConfig().getColors().getSecondaryButtonBorderColor(), button);
        setTextSize(getConfig().getFontSize().getSecondaryButtonTextSize(), button);
        setBorderRadius(getConfig().getBorderRadius().getSecondaryButtonRadius(), button);
        setFont(button, TextKey.SECONDARY_BUTTON_TEXT_KEY);
        setLineHeight(button, getConfig().getLineHeight().getSecondaryButtonTextLineHeight());
        setCharacterSpacing(button, getConfig().getCharSpacing().getSecondaryButtonTextCharSpacing());
    }

    public void customiseStatementHelperTextView(TextView textView) {
        HVLogUtils.d(TAG, "customiseStatementHelperTextView() called with: textView = [" + textView + "]");
        setTextColor(textView, getConfig().getColors().getStatementHelperTextColor());
        setTextSize(getConfig().getFontSize().getStatementHelperTextSize(), textView);
        setGravity(getConfig().getAlignment().getStatementHelperTextAlignment(), textView);
        setFont(textView, TextKey.STATEMENT_HELPER_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getTitleTextLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getTitleTextCharSpacing());
    }

    public void customiseStatementTextView(TextView textView) {
        HVLogUtils.d(TAG, "customiseStatementTextView() called with: textView = [" + textView + "]");
        setTextColor(textView, getConfig().getColors().getStatementTextColor());
        setTextSize(getConfig().getFontSize().getStatementTextSize(), textView);
        setGravity(getConfig().getAlignment().getStatementTextAlignment(), textView);
        setFont(textView, TextKey.STATEMENT_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getStatementHelperTextLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getStatementHelperTextCharSpacing());
    }

    public void customiseStatusTextView(TextView textView) {
        customiseStatusTextView(textView, false);
    }

    public void customiseTitleTextView(TextView textView) {
        customiseTitleTextView(textView, false);
    }

    public UIConfig getConfig() {
        UIConfig uiConfig = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getUiConfig();
        if (uiConfig == null) {
            return new UIConfig();
        }
        HVLogUtils.d(TAG, "getConfig() returned: " + uiConfig);
        return uiConfig;
    }

    public String getDocInstructionFrontSideAnimation() {
        HVLogUtils.d(TAG, "getDocInstructionFrontSideAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getDocumentInstructionFrontSideLottie() : BuildConfig.FLAVOR;
    }

    public String getDocProcessingAnimation() {
        HVLogUtils.d(TAG, "getDocProcessingAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getDocumentProcessingLottie() : BuildConfig.FLAVOR;
    }

    public String getDocumentFailureAnimation() {
        HVLogUtils.d(TAG, "getDocumentFailureAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getDocumentFailureLottie() : BuildConfig.FLAVOR;
    }

    public String getDocumentInstructionBackSideAnimation() {
        HVLogUtils.d(TAG, "getDocumentInstructionBackSideAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getDocumentInstructionBackSideLottie() : BuildConfig.FLAVOR;
    }

    @Deprecated
    public String getDocumentInstructionLottie() {
        HVLogUtils.d(TAG, "getDocumentInstructionLottie() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getDocumentInstructionLottie() : BuildConfig.FLAVOR;
    }

    public String getDocumentSuccessAnimation() {
        HVLogUtils.d(TAG, "getDocumentSuccessAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getDocumentSuccessLottie() : BuildConfig.FLAVOR;
    }

    public String getEndStateFailureAnimation() {
        HVLogUtils.d(TAG, "getEndStateFailureAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getEndStateFailure() : BuildConfig.FLAVOR;
    }

    public String getEndStateProcessingAnimation() {
        HVLogUtils.d(TAG, "getEndStateProcessingAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getEndStateProcessing() : BuildConfig.FLAVOR;
    }

    public String getEndStateSuccessAnimation() {
        HVLogUtils.d(TAG, "getEndStateSuccessAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getEndStateSuccess() : BuildConfig.FLAVOR;
    }

    public String getFaceFailureAnimation() {
        HVLogUtils.d(TAG, "getFaceFailureAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getFaceFailureLottie() : BuildConfig.FLAVOR;
    }

    public String getFaceInstructionAnimation() {
        HVLogUtils.d(TAG, "getFaceInstructionAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getFaceInstructionLottie() : BuildConfig.FLAVOR;
    }

    public String getFaceProcessingAnimation() {
        HVLogUtils.d(TAG, "getFaceProcessingAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getFaceProcessingLottie() : BuildConfig.FLAVOR;
    }

    public String getFaceSuccessAnimation() {
        HVLogUtils.d(TAG, "getFaceSuccessAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getFaceSuccessLottie() : BuildConfig.FLAVOR;
    }

    public Typeface getFont(String str, String str2) {
        Typeface fontFromAssets;
        HVLogUtils.d(TAG, "getFont() called with: fontFamily = [" + str + "], fontWeight = [" + str2 + "]");
        for (String str3 : this.fontFilePaths) {
            if (str3.contains(str) && str3.contains(str2) && (fontFromAssets = getFontFromAssets(str3)) != null) {
                return fontFromAssets;
            }
        }
        return getFontFromResources(str, str2);
    }

    public Typeface getFontFromAssets(String str) {
        String str2 = TAG;
        HVLogUtils.d(str2, "getFontFromAssets() called with: fontPath = [" + str + "]");
        if (getAppContext() == null) {
            Log.d(str2, "getFontFromAssets: context is null");
            return null;
        }
        try {
            return Typeface.createFromAsset(getAppContext().getAssets(), str);
        } catch (RuntimeException e10) {
            String str3 = TAG;
            HVLogUtils.e(str3, "getFontFromAssets() with: fontPath = [" + str + "]: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.d(str3, Utils.getErrorMessage(e10));
            return null;
        }
    }

    public String getLoaderAnimation() {
        HVLogUtils.d(TAG, "getLoaderAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getLoaderLottie() : BuildConfig.FLAVOR;
    }

    public String getNfcAnimation() {
        HVLogUtils.d(TAG, "getNfcAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getNfcLottie() : BuildConfig.FLAVOR;
    }

    public String getNfcInstructionAnimation() {
        HVLogUtils.d(TAG, "getNfcInstructionAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getNfcInstructionAndroid() : BuildConfig.FLAVOR;
    }

    public String getQrInstructionAnimation() {
        HVLogUtils.d(TAG, "getQrInstructionAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getQrInstruction() : BuildConfig.FLAVOR;
    }

    public String getUploadFailureAnimation() {
        HVLogUtils.d(TAG, "getUploadFailureAnimation() called");
        return getConfig().getAnimation() != null ? getConfig().getAnimation().getUploadFailure() : BuildConfig.FLAVOR;
    }

    public void init(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            this.appContext = applicationContext;
            PicassoManager.getInstance(applicationContext);
            getConfig().init(this.appContext.getResources().getDisplayMetrics());
        }
        preloadIcons();
        preloadLogos();
        preloadFonts();
        preloadAnimation();
        preloadBackgroundImage();
    }

    public boolean isNonEmptyFontFamilyInput(String str, String str2) {
        HVLogUtils.d(TAG, "isNonEmptyFontFamilyInput() called with: font = [" + str + "], fontWeight = [" + str2 + "]");
        return (StringUtils.isEmptyOrNull(str) || StringUtils.isEmptyOrNull(str2)) ? false : true;
    }

    public boolean isValidFontSize(float f10) {
        HVLogUtils.d(TAG, "isValidFontSize() called with: fontSize = [" + f10 + "]");
        return f10 >= 6.0f && f10 <= 40.0f;
    }

    public boolean isValidHexColor(String str) {
        HVLogUtils.d(TAG, "isValidHexColor() called with: hexColor = [" + str + "]");
        if (StringUtils.isEmptyOrNull(str)) {
            return false;
        }
        return Pattern.compile("^#(?:(?:[\\da-fA-F]{6})|(?:[\\da-fA-F]{8}))$").matcher(str).matches();
    }

    public void preloadFonts() {
        Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: co.hyperverge.hypersnapsdk.utils.o
            @Override // java.lang.Runnable
            public final void run() {
                HyperSnapUIConfigUtil.this.lambda$preloadFonts$0();
            }
        });
    }

    public void setBackgroundColor(TextView textView, String str) {
        HVLogUtils.d(TAG, "setBackgroundColor() called with: textView = [" + textView + "], color = [" + str + "]");
        if (isValidHexColor(str)) {
            int parseColor = Color.parseColor(str);
            Drawable background = textView.getBackground();
            if (background instanceof ShapeDrawable) {
                ((ShapeDrawable) background).getPaint().setColor(parseColor);
            } else if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(parseColor);
            } else if (background instanceof ColorDrawable) {
                ((ColorDrawable) background).setColor(parseColor);
            }
        }
    }

    public void setBorderColor(String str, TextView textView) {
        HVLogUtils.d(TAG, "setBorderColor() called with: borderColor = [" + str + "], textView = [" + textView + "]");
        if (isValidHexColor(str)) {
            int parseColor = Color.parseColor(str);
            Drawable background = textView.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setStroke(UIUtils.dpToPx(textView.getContext(), 1.0f), parseColor);
            }
        }
    }

    public void setBorderRadius(float f10, Button button) {
        HVLogUtils.d(TAG, "setBorderRadius() called with: radius = [" + f10 + "], button = [" + button + "]");
        if (f10 > 0.0f) {
            Drawable background = button.getBackground();
            if (button instanceof MaterialButton) {
                ((MaterialButton) button).setCornerRadius((int) f10);
            } else if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(f10);
            }
        }
    }

    public void setBoxStrokeColorStateList(TextInputLayout textInputLayout, int[][] iArr, String str, int i10) {
        HVLogUtils.d(TAG, "setBoxStrokeColorStateList() called with: textInputLayout = [" + textInputLayout + "], states = [" + iArr + "], color = [" + str + "], colorOnSurface = [" + i10 + "]");
        if (isValidHexColor(str)) {
            int parseColor = Color.parseColor(str);
            textInputLayout.setBoxStrokeColorStateList(new ColorStateList(iArr, new int[]{androidx.core.graphics.d.p(parseColor, 25), i10, parseColor}));
        }
    }

    public void setButtonBackgroundColor(String str, Button button) {
        HVLogUtils.d(TAG, "setButtonBackgroundColor() called with: color = [" + str + "], button = [" + button + "]");
        if (isValidHexColor(str)) {
            int parseColor = Color.parseColor(str);
            if (button instanceof MaterialButton) {
                button.setBackgroundTintList(ColorStateList.valueOf(parseColor));
                return;
            }
            Drawable background = button.getBackground();
            if (background instanceof ShapeDrawable) {
                ((ShapeDrawable) background).getPaint().setColor(parseColor);
            } else if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(parseColor);
            } else if (background instanceof ColorDrawable) {
                ((ColorDrawable) background).setColor(parseColor);
            }
        }
    }

    public void setButtonBackgroundImage(final String str, final Button button, final float f10, final String str2) {
        String str3 = TAG;
        HVLogUtils.d(str3, "setButtonBackgroundImage() called with: imageUrl = [" + str + "], button = [" + button + "]");
        if (getAppContext() == null) {
            HVLogUtils.d(str3, "setButtonBackgroundImage: context is null");
        } else if (StringUtils.isEmptyOrNull(str)) {
            HVLogUtils.d(str3, "No image URL provided for button background.");
        } else {
            button.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    new ImageView(HyperSnapUIConfigUtil.this.getAppContext());
                    button.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    PicassoManager.getInstance(HyperSnapUIConfigUtil.this.getAppContext()).getBitmap(str, new PicassoManager.ImageDownloaderCallback() { // from class: co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil.3.1
                        @Override // co.hyperverge.hypersnapsdk.utils.PicassoManager.ImageDownloaderCallback
                        public void onError(String str4) {
                            HVLogUtils.e(HyperSnapUIConfigUtil.TAG, "Failed to load button background image: " + str4);
                        }

                        @Override // co.hyperverge.hypersnapsdk.utils.PicassoManager.ImageDownloaderCallback
                        public void onSuccess(Bitmap bitmap) {
                            if (bitmap == null || button.getWidth() <= 0 || button.getHeight() <= 0) {
                                HVLogUtils.e(HyperSnapUIConfigUtil.TAG, "Failed to set button background: bitmap is null.");
                                return;
                            }
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            HyperSnapUIConfigUtil hyperSnapUIConfigUtil2 = HyperSnapUIConfigUtil.this;
                            Button button2 = button;
                            Bitmap resizeAndRoundBitmap = hyperSnapUIConfigUtil2.resizeAndRoundBitmap(bitmap, button2, f10, str2, UIUtils.dpToPx(button2.getContext(), 1.0f));
                            button.setBackgroundTintMode(PorterDuff.Mode.SRC_OVER);
                            button.setBackgroundTintList(ColorStateList.valueOf(0));
                            button.setBackground(new BitmapDrawable(HyperSnapUIConfigUtil.this.getAppContext().getResources(), resizeAndRoundBitmap));
                            HVLogUtils.d(HyperSnapUIConfigUtil.TAG, "Button background image set successfully.");
                        }
                    });
                }
            });
        }
    }

    public void setCharacterSpacing(TextView textView, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setCharacterSpacing() called with: textView = [" + textView + "], characterSpacing = [" + f10 + "]");
        if (f10 > 0.0f) {
            textView.setLetterSpacing(f10);
            return;
        }
        HVLogUtils.d(str, "Setting default character spacing = [" + textView.getLetterSpacing() + "]");
    }

    public void setEditTextColor(EditText editText, String str) {
        HVLogUtils.d(TAG, "setEditTextColor() called with: editText = [" + editText + "], color = [" + str + "]");
        if (isValidHexColor(str)) {
            editText.setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
        }
    }

    public void setEditTextHintColor(EditText editText, String str) {
        HVLogUtils.d(TAG, "setEditTextHintColor() called with: editText = [" + editText + "], color = [" + str + "]");
        if (isValidHexColor(str)) {
            editText.setHintTextColor(ColorStateList.valueOf(Color.parseColor(str)));
        }
    }

    public void setFont(TextView textView, TextKey textKey) {
        HVLogUtils.d(TAG, "setFont() called with: textView = [" + textView + "], key = [" + textKey + "]");
        textView.setTypeface(this.typefaceMap.get(textKey));
    }

    public void setGravity(String str, AutoCompleteTextView autoCompleteTextView) {
        HVLogUtils.d(TAG, "setGravity() called with: gravity = [" + str + "], textView = [" + autoCompleteTextView + "]");
        autoCompleteTextView.setGravity(str.equalsIgnoreCase("center") ? 17 : str.equalsIgnoreCase("right") ? 5 : 3);
    }

    public void setHintColor(TextInputLayout textInputLayout, String str) {
        HVLogUtils.d(TAG, "setHintColor() called with: textInputLayout = [" + textInputLayout + "], color = [" + str + "]");
        if (isValidHexColor(str)) {
            textInputLayout.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(str)));
        }
    }

    public void setLineHeight(TextView textView, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setLineHeight() called with: textView = [" + textView + "], lineHeight = [" + f10 + "]");
        if (f10 > 0.0f) {
            if (Build.VERSION.SDK_INT >= 28) {
                textView.setLineHeight((int) f10);
                return;
            } else {
                textView.setLineSpacing(f10, 1.0f);
                return;
            }
        }
        HVLogUtils.d(str, "Setting default textView line height = [" + textView.getLineHeight() + "]");
    }

    public void setLinearLayoutGravity(String str, LinearLayout linearLayout) {
        HVLogUtils.d(TAG, "setLinearLayoutGravity() called with: gravity = [" + str + "], linearLayout = [" + linearLayout + "]");
        linearLayout.setGravity(str.equalsIgnoreCase("center") ? 17 : str.equalsIgnoreCase("right") ? 5 : 3);
    }

    public void setPrimaryButtonIcon(Button button, String str, boolean z10) {
        String str2 = TAG;
        HVLogUtils.d(str2, "setPrimaryButtonIcon() called with: button = [" + button + "], url = [" + str + "], shouldShow = [" + z10 + "]");
        if (getAppContext() == null) {
            Log.d(str2, "setPrimaryButtonIcon: context is null");
            return;
        }
        if (button instanceof MaterialButton) {
            final MaterialButton materialButton = (MaterialButton) button;
            if (!z10) {
                HVLogUtils.d(str2, "setPrimaryButtonIcon: icons are not shown");
                materialButton.setIcon(null);
                materialButton.setIconTint(null);
            } else if (!StringUtils.isEmptyOrNull(str)) {
                this.isDefaultIconsUsed = false;
                PicassoManager.getInstance(getAppContext()).getBitmap(str, new PicassoManager.ImageDownloaderCallback() { // from class: co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil.2
                    @Override // co.hyperverge.hypersnapsdk.utils.PicassoManager.ImageDownloaderCallback
                    public void onError(String str3) {
                        HVLogUtils.d(HyperSnapUIConfigUtil.TAG, "setPrimaryButtonIcon() ImageDownloaderCallback onError() called with: errorMessage = [" + str3 + "]");
                        Log.d(HyperSnapUIConfigUtil.TAG, str3);
                    }

                    @Override // co.hyperverge.hypersnapsdk.utils.PicassoManager.ImageDownloaderCallback
                    public void onSuccess(Bitmap bitmap) {
                        HVLogUtils.d(HyperSnapUIConfigUtil.TAG, "setPrimaryButtonIcon() ImageDownloaderCallback onSuccess() called with: bitmap = [" + bitmap + "]");
                        if (HyperSnapUIConfigUtil.this.getAppContext() == null) {
                            Log.d(HyperSnapUIConfigUtil.TAG, "PicassoManager.ImageDownloaderCallback#onSuccess: context is null");
                            return;
                        }
                        materialButton.setIcon(new BitmapDrawable(HyperSnapUIConfigUtil.this.getAppContext().getResources(), HyperSnapUIConfigUtil.this.scaleBitmap(bitmap)));
                        materialButton.setIconGravity(4);
                        materialButton.setIconTint(null);
                    }
                });
            } else {
                HVLogUtils.d(str2, "setPrimaryButtonIcon: showing default icon");
                this.isDefaultIconsUsed = true;
                materialButton.setIcon(AbstractC3220a.b(getAppContext(), R.drawable.hv_ic_baseline_arrow_forward_18));
                materialButton.setIconGravity(4);
            }
        }
    }

    public void setTextBackgroundColor(String str, TextView textView) {
        HVLogUtils.d(TAG, "setTextBackgroundColor() called with: color = [" + str + "], textView = [" + textView + "]");
        if (isValidHexColor(str)) {
            textView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str)));
        }
    }

    public void setTextColor(CheckBox checkBox, String str) {
        HVLogUtils.d(TAG, "setTextColor() called with: checkBox = [" + checkBox + "], color = [" + str + "]");
        if (isValidHexColor(str)) {
            checkBox.setTextColor(Color.parseColor(str));
        }
    }

    public void setTextSize(float f10, Button button) {
        HVLogUtils.d(TAG, "setTextSize() called with: size = [" + f10 + "], button = [" + button + "]");
        if (isValidFontSize(f10)) {
            button.setTextSize(f10);
        }
    }

    public void customiseBackButtonIcon(ImageView imageView, boolean z10) {
        String str = TAG;
        HVLogUtils.d(str, "customiseBackButtonIcon() called with: imageView = [" + imageView + "]");
        if (getAppContext() == null) {
            HVLogUtils.d(str, "customiseBackButtonIcon: context is null");
        }
        String url = (z10 ? getConfig().getIcons().getCaptureScreenBackButtonIcon() : getConfig().getIcons().getBackButtonIcon()).getUrl();
        if (StringUtils.isEmptyOrNull(url)) {
            url = getConfig().getIcons().getBackButtonIcon().getUrl();
        }
        if (StringUtils.isEmptyOrNull(url)) {
            return;
        }
        PicassoManager.getInstance(getAppContext()).loadInto(url, AbstractC3220a.b(getAppContext(), R.drawable.ic_back_button_32), AbstractC3220a.b(getAppContext(), R.drawable.ic_back_button_32), imageView);
    }

    public void customiseClientLogo(ImageView imageView, boolean z10) {
        String str = TAG;
        HVLogUtils.d(str, "customiseClientLogo() called with: imageView = [" + imageView + "]");
        if (getAppContext() == null) {
            Log.d(str, "customiseClientLogo: context is null");
            return;
        }
        String captureScreenClientLogo = z10 ? getConfig().getLogos().getCaptureScreenClientLogo() : getConfig().getLogos().getClientLogo();
        if (StringUtils.isEmptyOrNull(captureScreenClientLogo)) {
            captureScreenClientLogo = getConfig().getLogos().getClientLogo();
        }
        if (StringUtils.isEmptyOrNull(captureScreenClientLogo)) {
            return;
        }
        PicassoManager.getInstance(getAppContext()).loadInto(captureScreenClientLogo, null, null, imageView);
    }

    public void customiseStatusTextView(TextView textView, boolean z10) {
        HVLogUtils.d(TAG, "customiseStatusTextView() called with: called with: textView = [" + textView + "], isCaptureScreen = [" + z10 + "]");
        String captureScreenStatusTextColor = z10 ? getConfig().getColors().getCaptureScreenStatusTextColor() : getConfig().getColors().getStatusTextColor();
        if (captureScreenStatusTextColor.isEmpty()) {
            captureScreenStatusTextColor = getConfig().getColors().getStatusTextColor();
        }
        setTextColor(textView, captureScreenStatusTextColor);
        setTextSize(getConfig().getFontSize().getStatusTextSize(), textView);
        setGravity(getConfig().getAlignment().getStatusTextAlignment(), textView);
        setFont(textView, TextKey.STATUS_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getTitleTextLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getTitleTextCharSpacing());
    }

    public void customiseTitleTextView(TextView textView, boolean z10) {
        HVLogUtils.d(TAG, "customiseTitleTextView() called with: textView = [" + textView + "], isCaptureScreen = [" + z10 + "]");
        String captureScreenTitleTextColor = z10 ? getConfig().getColors().getCaptureScreenTitleTextColor() : getConfig().getColors().getTitleTextColor();
        if (captureScreenTitleTextColor.isEmpty()) {
            captureScreenTitleTextColor = getConfig().getColors().getTitleTextColor();
        }
        setTextColor(textView, captureScreenTitleTextColor);
        setTextSize(getConfig().getFontSize().getTitleTextSize(), textView);
        setGravity(getConfig().getAlignment().getTitleTextAlignment(), textView);
        setFont(textView, TextKey.TITLE_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getTitleTextLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getTitleTextCharSpacing());
    }

    public void setFont(Paint paint) {
        paint.setTypeface(this.typefaceMap.get(TextKey.NFC_PROGRESS_TEXT_KEY));
    }

    public void setCharacterSpacing(TextInputLayout textInputLayout, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setCharacterSpacing() called with: textInputLayout = [" + textInputLayout + "], characterSpacing = [" + f10 + "]");
        if (textInputLayout.getEditText() != null) {
            setCharacterSpacing(textInputLayout.getEditText(), f10);
        } else {
            HVLogUtils.d(str, "TextInputLayout EditText is null");
        }
    }

    public void setFont(AutoCompleteTextView autoCompleteTextView, String str, String str2) {
        HVLogUtils.d(TAG, "setFont() called with: autoCompleteTextView = [" + autoCompleteTextView + "], font = [" + str + "], fontWeight = [" + str2 + "]");
        if (isNonEmptyFontFamilyInput(str, str2)) {
            autoCompleteTextView.setTypeface(getFont(str, str2));
        }
    }

    public void setTextColor(RadioButton radioButton, String str) {
        HVLogUtils.d(TAG, "setTextColor() called with: radioButton = [" + radioButton + "], color = [" + str + "]");
        if (isValidHexColor(str)) {
            radioButton.setTextColor(Color.parseColor(str));
        }
    }

    public void setTextSize(float f10, TextView textView) {
        HVLogUtils.d(TAG, "setTextSize() called with: size = [" + f10 + "], textView = [" + textView + "]");
        if (isValidFontSize(f10)) {
            textView.setTextSize(f10);
        }
    }

    public void setGravity(String str, TextView textView) {
        int i10;
        HVLogUtils.d(TAG, "setGravity() called with: gravity = [" + str + "], textView = [" + textView + "]");
        if (str.equalsIgnoreCase("center")) {
            i10 = 17;
        } else {
            i10 = str.equalsIgnoreCase("right") ? 5 : 3;
        }
        textView.setGravity(i10);
    }

    public void setLineHeight(TextInputLayout textInputLayout, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setLineHeight() called with: textInputLayout = [" + textInputLayout + "], lineHeight = [" + f10 + "]");
        if (textInputLayout.getEditText() != null) {
            setLineHeight(textInputLayout.getEditText(), f10);
        } else {
            HVLogUtils.d(str, "TextInputLayout EditText is null");
        }
    }

    public void setBorderColor(String str, Button button) {
        HVLogUtils.d(TAG, "setBorderColor() called with: borderColor = [" + str + "], button = [" + button + "]");
        if (isValidHexColor(str)) {
            Drawable background = button.getBackground();
            ColorStateList valueOf = ColorStateList.valueOf(Color.parseColor(str));
            int dpToPx = UIUtils.dpToPx(button.getContext(), 1.0f);
            if (button instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) button;
                materialButton.setStrokeColor(valueOf);
                materialButton.setStrokeWidth(dpToPx);
            } else if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setStroke(dpToPx, valueOf);
            }
        }
    }

    public void setBorderRadius(float f10, TextInputLayout textInputLayout) {
        HVLogUtils.d(TAG, "setBorderRadius() called with: radius = [" + f10 + "], textInputLayout = [" + textInputLayout + "]");
        if (f10 > 0.0f) {
            textInputLayout.Y(f10, f10, f10, f10);
        }
    }

    public void setFont(TextInputLayout textInputLayout, String str, String str2) {
        HVLogUtils.d(TAG, "setFont() called with: textInputLayout = [" + textInputLayout + "], font = [" + str + "], fontWeight = [" + str2 + "]");
        if (isNonEmptyFontFamilyInput(str, str2)) {
            textInputLayout.getSuffixTextView().setTypeface(getFont(str, str2));
            textInputLayout.getPrefixTextView().setTypeface(getFont(str, str2));
            textInputLayout.setTypeface(getFont(str, str2));
        }
    }

    public void setTextColor(TextView textView, String str) {
        HVLogUtils.d(TAG, "setTextColor() called with: textView = [" + textView + "], color = [" + str + "]");
        if (isValidHexColor(str)) {
            textView.setTextColor(Color.parseColor(str));
        }
    }

    public void setTextSize(float f10, CheckBox checkBox) {
        HVLogUtils.d(TAG, "setTextSize() called with: size = [" + f10 + "], checkBox = [" + checkBox + "]");
        if (isValidFontSize(f10)) {
            checkBox.setTextSize(f10);
        }
    }

    public void setCharacterSpacing(EditText editText, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setCharacterSpacing() called with: editText = [" + editText + "], characterSpacing = [" + f10 + "]");
        if (f10 > 0.0f) {
            editText.setLetterSpacing(f10);
            return;
        }
        HVLogUtils.d(str, "Setting default character spacing = [" + editText.getLetterSpacing() + "]");
    }

    public void setGravity(String str, CheckBox checkBox) {
        int i10;
        HVLogUtils.d(TAG, "setGravity() called with: gravity = [" + str + "], checkBox = [" + checkBox + "]");
        if (str.equalsIgnoreCase("center")) {
            i10 = 17;
        } else {
            i10 = str.equalsIgnoreCase("right") ? 5 : 3;
        }
        checkBox.setGravity(i10);
    }

    public void setLineHeight(EditText editText, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setLineHeight() called with: editText = [" + editText + "], lineHeight = [" + f10 + "]");
        if (f10 > 0.0f) {
            if (Build.VERSION.SDK_INT >= 28) {
                editText.setLineHeight((int) f10);
                return;
            } else {
                editText.setLineSpacing(f10, 1.0f);
                return;
            }
        }
        HVLogUtils.d(str, "Setting default textView line height = [" + editText.getLineHeight() + "]");
    }

    public void setTextColor(Button button, String str, boolean z10) {
        HVLogUtils.d(TAG, "setTextColor() called with: button = [" + button + "], textColor = [" + str + "], shouldShowButtonIcon = [" + z10 + "]");
        if (isValidHexColor(str)) {
            button.setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
            if (this.isDefaultIconsUsed && z10 && (button instanceof MaterialButton)) {
                ((MaterialButton) button).setIconTint(ColorStateList.valueOf(Color.parseColor(str)));
            }
        }
    }

    public void setTextSize(float f10, RadioButton radioButton) {
        HVLogUtils.d(TAG, "setTextSize() called with: size = [" + f10 + "], radioButton = [" + radioButton + "]");
        if (isValidFontSize(f10)) {
            radioButton.setTextSize(f10);
        }
    }

    public void customiseDescriptionTextView(TextView textView) {
        customiseDescriptionTextView(textView, false);
    }

    public void setCharacterSpacing(CheckBox checkBox, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setCharacterSpacing() called with: checkBox = [" + checkBox + "], characterSpacing = [" + f10 + "]");
        if (f10 > 0.0f) {
            checkBox.setLetterSpacing(f10);
            return;
        }
        HVLogUtils.d(str, "Setting default character spacing = [" + checkBox.getLetterSpacing() + "]");
    }

    public void setFont(CheckBox checkBox, String str, String str2) {
        HVLogUtils.d(TAG, "setFont() called with: checkBox = [" + checkBox + "], font = [" + str + "], fontWeight = [" + str2 + "]");
        if (isNonEmptyFontFamilyInput(str, str2)) {
            checkBox.setTypeface(getFont(str, str2));
        }
    }

    public void setGravity(String str, RadioButton radioButton) {
        int i10;
        HVLogUtils.d(TAG, "setGravity() called with: gravity = [" + str + "], radioButton = [" + radioButton + "]");
        if (str.equalsIgnoreCase("center")) {
            i10 = 17;
        } else {
            i10 = str.equalsIgnoreCase("right") ? 5 : 3;
        }
        radioButton.setGravity(i10);
    }

    public void setTextSize(float f10, Chip chip) {
        HVLogUtils.d(TAG, "setTextSize() called with: size = [" + f10 + "], chip = [" + chip + "]");
        if (isValidFontSize(f10)) {
            chip.setTextSize(f10);
        }
    }

    public void customiseSecondaryButton(TextView textView) {
        HVLogUtils.d(TAG, "customiseSecondaryButton() called with: textView = [" + textView + "]");
        setFont(textView, TextKey.SECONDARY_BUTTON_TEXT_KEY);
        setLineHeight(textView, getConfig().getLineHeight().getSecondaryButtonTextLineHeight());
        setCharacterSpacing(textView, getConfig().getCharSpacing().getSecondaryButtonTextCharSpacing());
    }

    public void setCharacterSpacing(RadioButton radioButton, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setCharacterSpacing() called with: radioButton = [" + radioButton + "], characterSpacing = [" + f10 + "]");
        if (f10 > 0.0f) {
            radioButton.setLetterSpacing(f10);
            return;
        }
        HVLogUtils.d(str, "Setting default character spacing = [" + radioButton.getLetterSpacing() + "]");
    }

    public void setFont(RadioButton radioButton, String str, String str2) {
        HVLogUtils.d(TAG, "setFont() called with: radioButton = [" + radioButton + "], font = [" + str + "], fontWeight = [" + str2 + "]");
        if (isNonEmptyFontFamilyInput(str, str2)) {
            radioButton.setTypeface(getFont(str, str2));
        }
    }

    public void setLineHeight(CheckBox checkBox, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setLineHeight() called with: checkBox = [" + checkBox + "], lineHeight = [" + f10 + "]");
        if (f10 > 0.0f) {
            if (Build.VERSION.SDK_INT >= 28) {
                checkBox.setLineHeight((int) f10);
                return;
            } else {
                checkBox.setLineSpacing(f10, 1.0f);
                return;
            }
        }
        HVLogUtils.d(str, "Setting default textView line height = [" + checkBox.getLineHeight() + "]");
    }

    public void setTextSize(float f10, TextInputLayout textInputLayout) {
        HVLogUtils.d(TAG, "setTextSize() called with: size = [" + f10 + "], inputLayout = [" + textInputLayout + "]");
        if (isValidFontSize(f10)) {
            textInputLayout.getSuffixTextView().setTextSize(f10);
            textInputLayout.getPrefixTextView().setTextSize(f10);
        }
    }

    public void setBorderColor(String str, CheckBox checkBox) {
        HVLogUtils.d(TAG, "setBorderColor() called with: borderColor = [" + str + "], checkBox = [" + checkBox + "]");
        if (isValidHexColor(str)) {
            checkBox.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str)));
        }
    }

    public void setCharacterSpacing(Chip chip, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setCharacterSpacing() called with: chip = [" + chip + "], characterSpacing = [" + f10 + "]");
        if (f10 > 0.0f) {
            chip.setLetterSpacing(f10);
            return;
        }
        HVLogUtils.d(str, "Setting default character spacing = [" + chip.getLetterSpacing() + "]");
    }

    public void setGravity(String str, Chip chip) {
        int i10;
        HVLogUtils.d(TAG, "setGravity() called with: gravity = [" + str + "], chip = [" + chip + "]");
        if (str.equalsIgnoreCase("center")) {
            i10 = 17;
        } else {
            i10 = str.equalsIgnoreCase("right") ? 5 : 3;
        }
        chip.setGravity(i10);
    }

    public void setFont(Chip chip, String str, String str2) {
        HVLogUtils.d(TAG, "setFont() called with: chip = [" + chip + "], font = [" + str + "], fontWeight = [" + str2 + "]");
        if (isNonEmptyFontFamilyInput(str, str2)) {
            chip.setTypeface(getFont(str, str2));
        }
    }

    public void setBorderColor(String str, TextInputLayout textInputLayout) {
        HVLogUtils.d(TAG, "setBorderColor() called with: borderColor = [" + str + "], textInputLayout = [" + textInputLayout + "]");
        if (isValidHexColor(str)) {
            textInputLayout.setBoxStrokeColorStateList(ColorStateList.valueOf(Color.parseColor(str)));
        }
    }

    public void setCharacterSpacing(AutoCompleteTextView autoCompleteTextView, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setCheckBoxCharacterSpacing() called with: checkBox = [" + autoCompleteTextView + "], characterSpacing = [" + f10 + "]");
        if (f10 > 0.0f) {
            autoCompleteTextView.setLetterSpacing(f10);
            return;
        }
        HVLogUtils.d(str, "Setting default character spacing = [" + autoCompleteTextView.getLetterSpacing() + "]");
    }

    public void setLineHeight(RadioButton radioButton, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setLineHeight() called with: radioButton = [" + radioButton + "], lineHeight = [" + f10 + "]");
        if (f10 > 0.0f) {
            if (Build.VERSION.SDK_INT >= 28) {
                radioButton.setLineHeight((int) f10);
                return;
            } else {
                radioButton.setLineSpacing(f10, 1.0f);
                return;
            }
        }
        HVLogUtils.d(str, "Setting default textView line height = [" + radioButton.getLineHeight() + "]");
    }

    public void setFont(TextView textView, String str, String str2) {
        HVLogUtils.d(TAG, "setFont() called with: textView = [" + textView + "], font = [" + str + "], fontWeight = [" + str2 + "]");
        if (isNonEmptyFontFamilyInput(str, str2)) {
            textView.setTypeface(getFont(str, str2));
        }
    }

    public void setGravity(String str, EditText editText) {
        int i10;
        HVLogUtils.d(TAG, "setGravity() called with: gravity = [" + str + "], editText = [" + editText + "]");
        if (str.equalsIgnoreCase("center")) {
            i10 = 17;
        } else {
            i10 = str.equalsIgnoreCase("right") ? 5 : 3;
        }
        editText.setGravity(i10);
    }

    public void setCharacterSpacing(Button button, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setCharacterSpacing() called with: button = [" + button + "], characterSpacing = [" + f10 + "]");
        if (f10 > 0.0f) {
            button.setLetterSpacing(f10);
            return;
        }
        HVLogUtils.d(str, "Setting default character spacing = [" + button.getLetterSpacing() + "]");
    }

    public void setFont(EditText editText, String str, String str2) {
        HVLogUtils.d(TAG, "setFont() called with: editText = [" + editText + "], font = [" + str + "], fontWeight = [" + str2 + "]");
        if (isNonEmptyFontFamilyInput(str, str2)) {
            editText.setTypeface(getFont(str, str2));
        }
    }

    public void setLineHeight(Chip chip, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setLineHeight() called with: chip = [" + chip + "], lineHeight = [" + f10 + "]");
        if (f10 > 0.0f) {
            if (Build.VERSION.SDK_INT >= 28) {
                chip.setLineHeight((int) f10);
                return;
            } else {
                chip.setLineSpacing(f10, 1.0f);
                return;
            }
        }
        HVLogUtils.d(str, "Setting default textView line height = [" + chip.getLineHeight() + "]");
    }

    public void setFont(Button button, String str, String str2) {
        HVLogUtils.d(TAG, "setFont() called with: button = [" + button + "], font = [" + str + "], fontWeight = [" + str2 + "]");
        if (isNonEmptyFontFamilyInput(str, str2)) {
            button.setTypeface(getFont(str, str2));
        }
    }

    public void setLineHeight(AutoCompleteTextView autoCompleteTextView, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setLineHeight() called with: autoCompleteTextView = [" + autoCompleteTextView + "], lineHeight = [" + f10 + "]");
        if (f10 > 0.0f) {
            if (Build.VERSION.SDK_INT >= 28) {
                autoCompleteTextView.setLineHeight((int) f10);
                return;
            } else {
                autoCompleteTextView.setLineSpacing(f10, 1.0f);
                return;
            }
        }
        HVLogUtils.d(str, "Setting default textView line height = [" + autoCompleteTextView.getLineHeight() + "]");
    }

    public void setLineHeight(Button button, float f10) {
        String str = TAG;
        HVLogUtils.d(str, "setLineHeight() called with: button = [" + button + "], lineHeight = [" + f10 + "]");
        if (f10 > 0.0f) {
            if (Build.VERSION.SDK_INT >= 28) {
                button.setLineHeight((int) f10);
                return;
            } else {
                button.setLineSpacing(f10, 1.0f);
                return;
            }
        }
        HVLogUtils.d(str, "Setting default button line height = [" + button.getLineHeight() + "]");
    }
}
