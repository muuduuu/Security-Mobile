package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.AbstractC1980z;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1931a;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.C1973v0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.V;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.Y;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import e5.EnumC3081c;
import e5.EnumC3083e;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import r4.AbstractC4012a;
import v4.AbstractC4929e;

@K4.a(name = ReactTextInputManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class ReactTextInputManager extends BaseViewManager<C1992j, V> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    public static final String TAG = "ReactTextInputManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;
    protected com.facebook.react.views.text.n mReactTextViewManagerCallback;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP = new a();
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final String[] DRAWABLE_HANDLE_RESOURCES = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
    private static final String[] DRAWABLE_HANDLE_FIELDS = {"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};

    class a extends HashMap {
        a() {
            put("birthdate-day", "birthDateDay");
            put("birthdate-full", "birthDateFull");
            put("birthdate-month", "birthDateMonth");
            put("birthdate-year", "birthDateYear");
            put("cc-csc", "creditCardSecurityCode");
            put("cc-exp", "creditCardExpirationDate");
            put("cc-exp-day", "creditCardExpirationDay");
            put("cc-exp-month", "creditCardExpirationMonth");
            put("cc-exp-year", "creditCardExpirationYear");
            put("cc-number", "creditCardNumber");
            put("email", "emailAddress");
            put("gender", "gender");
            put("name", "personName");
            put("name-family", "personFamilyName");
            put("name-given", "personGivenName");
            put("name-middle", "personMiddleName");
            put("name-middle-initial", "personMiddleInitial");
            put("name-prefix", "personNamePrefix");
            put("name-suffix", "personNameSuffix");
            put("password", "password");
            put("password-new", "newPassword");
            put("postal-address", "postalAddress");
            put("postal-address-country", "addressCountry");
            put("postal-address-extended", "extendedAddress");
            put("postal-address-extended-postal-code", "extendedPostalCode");
            put("postal-address-locality", "addressLocality");
            put("postal-address-region", "addressRegion");
            put("postal-code", "postalCode");
            put("street-address", "streetAddress");
            put("sms-otp", "smsOTPCode");
            put("tel", "phoneNumber");
            put("tel-country-code", "phoneCountryCode");
            put("tel-national", "phoneNational");
            put("tel-device", "phoneNumberDevice");
            put("username", "username");
            put("username-new", "newUsername");
        }
    }

    private static class b implements InterfaceC1983a {

        /* renamed from: a, reason: collision with root package name */
        private final C1992j f22895a;

        /* renamed from: b, reason: collision with root package name */
        private final EventDispatcher f22896b;

        /* renamed from: c, reason: collision with root package name */
        private final int f22897c;

        /* renamed from: d, reason: collision with root package name */
        private int f22898d = 0;

        /* renamed from: e, reason: collision with root package name */
        private int f22899e = 0;

        public b(C1992j c1992j) {
            this.f22895a = c1992j;
            ReactContext d10 = L0.d(c1992j);
            this.f22896b = ReactTextInputManager.getEventDispatcher(d10, c1992j);
            this.f22897c = L0.e(d10);
        }

        @Override // com.facebook.react.views.textinput.InterfaceC1983a
        public void a() {
            if (this.f22896b == null) {
                return;
            }
            int width = this.f22895a.getWidth();
            int height = this.f22895a.getHeight();
            if (this.f22895a.getLayout() != null) {
                width = this.f22895a.getCompoundPaddingLeft() + this.f22895a.getLayout().getWidth() + this.f22895a.getCompoundPaddingRight();
                height = this.f22895a.getCompoundPaddingTop() + this.f22895a.getLayout().getHeight() + this.f22895a.getCompoundPaddingBottom();
            }
            if (width == this.f22898d && height == this.f22899e) {
                return;
            }
            this.f22899e = height;
            this.f22898d = width;
            this.f22896b.c(new C1984b(this.f22897c, this.f22895a.getId(), C1944g0.e(width), C1944g0.e(height)));
        }
    }

    private static class c implements J {

        /* renamed from: a, reason: collision with root package name */
        private final C1992j f22900a;

        /* renamed from: b, reason: collision with root package name */
        private final EventDispatcher f22901b;

        /* renamed from: c, reason: collision with root package name */
        private final int f22902c;

        /* renamed from: d, reason: collision with root package name */
        private int f22903d;

        /* renamed from: e, reason: collision with root package name */
        private int f22904e;

        public c(C1992j c1992j) {
            this.f22900a = c1992j;
            ReactContext d10 = L0.d(c1992j);
            this.f22901b = ReactTextInputManager.getEventDispatcher(d10, c1992j);
            this.f22902c = L0.e(d10);
        }

        @Override // com.facebook.react.views.textinput.J
        public void a(int i10, int i11, int i12, int i13) {
            if (this.f22903d == i10 && this.f22904e == i11) {
                return;
            }
            this.f22901b.c(com.facebook.react.views.scroll.g.d(this.f22902c, this.f22900a.getId(), com.facebook.react.views.scroll.h.SCROLL, i10, i11, 0.0f, 0.0f, 0, 0, this.f22900a.getWidth(), this.f22900a.getHeight(), false));
            this.f22903d = i10;
            this.f22904e = i11;
        }
    }

    private static class d implements K {

        /* renamed from: a, reason: collision with root package name */
        private final C1992j f22905a;

        /* renamed from: b, reason: collision with root package name */
        private final EventDispatcher f22906b;

        /* renamed from: c, reason: collision with root package name */
        private final int f22907c;

        /* renamed from: d, reason: collision with root package name */
        private int f22908d;

        /* renamed from: e, reason: collision with root package name */
        private int f22909e;

        public d(C1992j c1992j) {
            this.f22905a = c1992j;
            ReactContext d10 = L0.d(c1992j);
            this.f22906b = ReactTextInputManager.getEventDispatcher(d10, c1992j);
            this.f22907c = L0.e(d10);
        }

        @Override // com.facebook.react.views.textinput.K
        public void a(int i10, int i11) {
            int min = Math.min(i10, i11);
            int max = Math.max(i10, i11);
            if (this.f22908d == min && this.f22909e == max) {
                return;
            }
            this.f22906b.c(new G(this.f22907c, this.f22905a.getId(), min, max));
            this.f22908d = min;
            this.f22909e = max;
        }
    }

    private final class e implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        private final C1992j f22910a;

        /* renamed from: b, reason: collision with root package name */
        private final EventDispatcher f22911b;

        /* renamed from: c, reason: collision with root package name */
        private final int f22912c;

        /* renamed from: d, reason: collision with root package name */
        private String f22913d = null;

        public e(ReactContext reactContext, C1992j c1992j) {
            this.f22911b = ReactTextInputManager.getEventDispatcher(reactContext, c1992j);
            this.f22910a = c1992j;
            this.f22912c = L0.e(reactContext);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f22913d = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (this.f22910a.f22941i0) {
                return;
            }
            if (i12 == 0 && i11 == 0) {
                return;
            }
            AbstractC4012a.c(this.f22913d);
            String substring = charSequence.toString().substring(i10, i10 + i12);
            String substring2 = this.f22913d.substring(i10, i10 + i11);
            if (i12 == i11 && substring.equals(substring2)) {
                return;
            }
            E0 stateWrapper = this.f22910a.getStateWrapper();
            if (stateWrapper != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("mostRecentEventCount", this.f22910a.z());
                writableNativeMap.putInt("opaqueCacheId", this.f22910a.getId());
                stateWrapper.updateState(writableNativeMap);
            }
            this.f22911b.c(new m(this.f22912c, this.f22910a.getId(), charSequence.toString(), this.f22910a.z()));
        }
    }

    private static void checkPasswordType(C1992j c1992j) {
        if ((c1992j.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (c1992j.getStagedInputType() & 128) == 0) {
            return;
        }
        updateStagedInputTypeFlag(c1992j, 128, 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EventDispatcher getEventDispatcher(ReactContext reactContext, C1992j c1992j) {
        return L0.c(reactContext, c1992j.getId());
    }

    private com.facebook.react.views.text.i getReactTextUpdate(String str, int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) com.facebook.react.views.text.t.apply(str, com.facebook.react.views.text.t.UNSET));
        return new com.facebook.react.views.text.i(spannableStringBuilder, i10, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addEventEmitters$0(F0 f02, C1992j c1992j, View view, boolean z10) {
        int c10 = f02.c();
        EventDispatcher eventDispatcher = getEventDispatcher(f02, c1992j);
        if (z10) {
            eventDispatcher.c(new p(c10, c1992j.getId()));
        } else {
            eventDispatcher.c(new n(c10, c1992j.getId()));
            eventDispatcher.c(new o(c10, c1992j.getId(), c1992j.getText().toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addEventEmitters$1(C1992j c1992j, F0 f02, TextView textView, int i10, KeyEvent keyEvent) {
        if ((i10 & 255) == 0 && i10 != 0) {
            return true;
        }
        boolean A10 = c1992j.A();
        boolean Y10 = c1992j.Y();
        boolean X10 = c1992j.X();
        if (Y10) {
            getEventDispatcher(f02, c1992j).c(new I(f02.c(), c1992j.getId(), c1992j.getText().toString()));
        }
        if (X10) {
            c1992j.clearFocus();
        }
        return X10 || Y10 || !A10 || i10 == 5 || i10 == 7;
    }

    private void setAutofillHints(C1992j c1992j, String... strArr) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        c1992j.setAutofillHints(strArr);
    }

    private static boolean shouldHideCursorForEmailTextInput() {
        return Build.VERSION.SDK_INT == 29 && Build.MANUFACTURER.toLowerCase(Locale.ROOT).contains("xiaomi");
    }

    private static void updateStagedInputTypeFlag(C1992j c1992j, int i10, int i11) {
        c1992j.setStagedInputType(((~i10) & c1992j.getStagedInputType()) | i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return AbstractC4929e.e("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(AbstractC4929e.a().b("topSubmitEditing", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).b("topEndEditing", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).b("topFocus", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onFocus", "captured", "onFocusCapture"))).b("topBlur", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onBlur", "captured", "onBlurCapture"))).b("topKeyPress", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).a());
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(AbstractC4929e.a().b(com.facebook.react.views.scroll.h.getJSEventName(com.facebook.react.views.scroll.h.SCROLL), AbstractC4929e.d("registrationName", "onScroll")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return AbstractC4929e.d("AutoCapitalizationType", AbstractC4929e.g("none", 0, "characters", 4096, "words", 8192, "sentences", 16384));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends V> getShadowNodeClass() {
        return H.class;
    }

    @Z4.a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(C1992j c1992j, boolean z10) {
        c1992j.setAllowFontScaling(z10);
    }

    @Z4.a(name = "autoCapitalize")
    public void setAutoCapitalize(C1992j c1992j, Dynamic dynamic) {
        int i10 = 0;
        if (dynamic.getType() == ReadableType.Number) {
            i10 = dynamic.asInt();
        } else {
            if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                asString.hashCode();
                switch (asString) {
                    case "words":
                        i10 = 8192;
                        break;
                    case "characters":
                        i10 = 4096;
                        break;
                }
            }
            i10 = 16384;
        }
        updateStagedInputTypeFlag(c1992j, AUTOCAPITALIZE_FLAGS, i10);
    }

    @Z4.a(name = "autoCorrect")
    public void setAutoCorrect(C1992j c1992j, Boolean bool) {
        updateStagedInputTypeFlag(c1992j, 557056, bool != null ? bool.booleanValue() ? 32768 : 524288 : 0);
    }

    @Z4.a(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(C1992j c1992j, boolean z10) {
        c1992j.setAutoFocus(z10);
    }

    @Z4.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C1992j c1992j, int i10, Integer num) {
        if (G4.a.c()) {
            C1931a.k(c1992j, e5.j.ALL, num);
        } else {
            c1992j.T(SPACING_TYPES[i10], num);
        }
    }

    @Z4.b(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(C1992j c1992j, int i10, float f10) {
        if (G4.a.c()) {
            C1931a.l(c1992j, EnumC3081c.values()[i10], Float.isNaN(f10) ? null : new X(f10, Y.POINT));
            return;
        }
        if (!Float.isNaN(f10)) {
            f10 = C1944g0.g(f10);
        }
        if (i10 == 0) {
            c1992j.setBorderRadius(f10);
        } else {
            c1992j.U(f10, i10 - 1);
        }
    }

    @Z4.a(name = "borderStyle")
    public void setBorderStyle(C1992j c1992j, String str) {
        if (G4.a.c()) {
            C1931a.m(c1992j, str == null ? null : EnumC3083e.fromString(str));
        } else {
            c1992j.setBorderStyle(str);
        }
    }

    @Z4.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C1992j c1992j, int i10, float f10) {
        if (G4.a.c()) {
            C1931a.n(c1992j, e5.j.values()[i10], Float.valueOf(f10));
            return;
        }
        if (!Float.isNaN(f10)) {
            f10 = C1944g0.g(f10);
        }
        c1992j.V(SPACING_TYPES[i10], f10);
    }

    @Z4.a(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(C1992j c1992j, ReadableArray readableArray) {
        if (G4.a.c()) {
            C1931a.o(c1992j, readableArray);
        }
    }

    @Z4.a(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(C1992j c1992j, boolean z10) {
        if (c1992j.getStagedInputType() == 32 && shouldHideCursorForEmailTextInput()) {
            return;
        }
        c1992j.setCursorVisible(!z10);
    }

    @Z4.a(customType = "Color", name = "color")
    public void setColor(C1992j c1992j, Integer num) {
        if (num != null) {
            c1992j.setTextColor(num.intValue());
            return;
        }
        ColorStateList b10 = com.facebook.react.views.text.a.b(c1992j.getContext());
        if (b10 != null) {
            c1992j.setTextColor(b10);
            return;
        }
        Context context = c1992j.getContext();
        String str = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Could not get default text color from View Context: ");
        sb2.append(context != null ? context.getClass().getCanonicalName() : "null");
        ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sb2.toString()));
    }

    @Z4.a(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(C1992j c1992j, boolean z10) {
        c1992j.setContextMenuHidden(z10);
    }

    @Z4.a(customType = "Color", name = "cursorColor")
    public void setCursorColor(C1992j c1992j, Integer num) {
        Drawable textCursorDrawable;
        BlendMode blendMode;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            textCursorDrawable = c1992j.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                if (num != null) {
                    com.facebook.react.uimanager.C.a();
                    int intValue = num.intValue();
                    blendMode = BlendMode.SRC_IN;
                    textCursorDrawable.setColorFilter(AbstractC1980z.a(intValue, blendMode));
                } else {
                    textCursorDrawable.clearColorFilter();
                }
                c1992j.setTextCursorDrawable(textCursorDrawable);
                return;
            }
            return;
        }
        if (i10 == 28) {
            return;
        }
        try {
            Field declaredField = c1992j.getClass().getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(c1992j);
            if (i11 == 0) {
                return;
            }
            Drawable mutate = androidx.core.content.a.e(c1992j.getContext(), i11).mutate();
            if (num != null) {
                mutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                mutate.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(c1992j);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{mutate, mutate});
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @Z4.a(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(C1992j c1992j, boolean z10) {
        c1992j.setDisableFullscreenUI(z10);
    }

    @Z4.a(defaultBoolean = true, name = "editable")
    public void setEditable(C1992j c1992j, boolean z10) {
        c1992j.setEnabled(z10);
    }

    @Z4.a(name = "fontFamily")
    public void setFontFamily(C1992j c1992j, String str) {
        c1992j.setFontFamily(str);
    }

    @Z4.a(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(C1992j c1992j, float f10) {
        c1992j.setFontSize(f10);
    }

    @Z4.a(name = "fontStyle")
    public void setFontStyle(C1992j c1992j, String str) {
        c1992j.setFontStyle(str);
    }

    @Z4.a(name = "fontVariant")
    public void setFontVariant(C1992j c1992j, ReadableArray readableArray) {
        c1992j.setFontFeatureSettings(com.facebook.react.views.text.o.c(readableArray));
    }

    @Z4.a(name = "fontWeight")
    public void setFontWeight(C1992j c1992j, String str) {
        c1992j.setFontWeight(str);
    }

    @Z4.a(name = "importantForAutofill")
    public void setImportantForAutofill(C1992j c1992j, String str) {
        setImportantForAutofill(c1992j, "no".equals(str) ? 2 : "noExcludeDescendants".equals(str) ? 8 : "yes".equals(str) ? 1 : "yesExcludeDescendants".equals(str) ? 4 : 0);
    }

    @Z4.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C1992j c1992j, boolean z10) {
        c1992j.setIncludeFontPadding(z10);
    }

    @Z4.a(name = "inlineImageLeft")
    public void setInlineImageLeft(C1992j c1992j, String str) {
        c1992j.setCompoundDrawablesWithIntrinsicBounds(l5.c.d().g(c1992j.getContext(), str), 0, 0, 0);
    }

    @Z4.a(name = "inlineImagePadding")
    public void setInlineImagePadding(C1992j c1992j, int i10) {
        c1992j.setCompoundDrawablePadding(i10);
    }

    @Z4.a(name = "keyboardType")
    public void setKeyboardType(C1992j c1992j, String str) {
        int i10;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i10 = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i10 = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i10 = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            if (shouldHideCursorForEmailTextInput()) {
                c1992j.setCursorVisible(false);
            }
            i10 = 33;
        } else {
            i10 = KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str) ? 3 : KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str) ? 144 : KEYBOARD_TYPE_URI.equalsIgnoreCase(str) ? 16 : 1;
        }
        updateStagedInputTypeFlag(c1992j, 15, i10);
        checkPasswordType(c1992j);
    }

    @Z4.a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(C1992j c1992j, float f10) {
        c1992j.setLetterSpacingPt(f10);
    }

    @Z4.a(defaultFloat = 0.0f, name = "lineHeight")
    public void setLineHeight(C1992j c1992j, int i10) {
        c1992j.setLineHeight(i10);
    }

    @Z4.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(C1992j c1992j, float f10) {
        c1992j.setMaxFontSizeMultiplier(f10);
    }

    @Z4.a(name = "maxLength")
    public void setMaxLength(C1992j c1992j, Integer num) {
        InputFilter[] filters = c1992j.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (InputFilter inputFilter : filters) {
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z10 = false;
            for (int i10 = 0; i10 < filters.length; i10++) {
                if (filters[i10] instanceof InputFilter.LengthFilter) {
                    filters[i10] = new InputFilter.LengthFilter(num.intValue());
                    z10 = true;
                }
            }
            if (!z10) {
                InputFilter[] inputFilterArr2 = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        c1992j.setFilters(inputFilterArr);
    }

    @Z4.a(defaultBoolean = false, name = "multiline")
    public void setMultiline(C1992j c1992j, boolean z10) {
        updateStagedInputTypeFlag(c1992j, z10 ? 0 : 131072, z10 ? 131072 : 0);
    }

    @Z4.a(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(C1992j c1992j, int i10) {
        c1992j.setLines(i10);
    }

    @Z4.a(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(C1992j c1992j, boolean z10) {
        if (z10) {
            c1992j.setContentSizeWatcher(new b(c1992j));
        } else {
            c1992j.setContentSizeWatcher(null);
        }
    }

    @Z4.a(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(C1992j c1992j, boolean z10) {
        c1992j.setOnKeyPress(z10);
    }

    @Z4.a(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(C1992j c1992j, boolean z10) {
        if (z10) {
            c1992j.setScrollWatcher(new c(c1992j));
        } else {
            c1992j.setScrollWatcher(null);
        }
    }

    @Z4.a(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(C1992j c1992j, boolean z10) {
        if (z10) {
            c1992j.setSelectionWatcher(new d(c1992j));
        } else {
            c1992j.setSelectionWatcher(null);
        }
    }

    @Z4.a(name = "overflow")
    public void setOverflow(C1992j c1992j, String str) {
        c1992j.setOverflow(str);
    }

    @Z4.a(name = "placeholder")
    public void setPlaceholder(C1992j c1992j, String str) {
        c1992j.setPlaceholder(str);
    }

    @Z4.a(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(C1992j c1992j, Integer num) {
        if (num == null) {
            c1992j.setHintTextColor(com.facebook.react.views.text.a.d(c1992j.getContext()));
        } else {
            c1992j.setHintTextColor(num.intValue());
        }
    }

    @Z4.a(name = "returnKeyLabel")
    public void setReturnKeyLabel(C1992j c1992j, String str) {
        c1992j.setImeActionLabel(str, IME_ACTION_ID);
    }

    @Z4.a(name = "returnKeyType")
    public void setReturnKeyType(C1992j c1992j, String str) {
        c1992j.setReturnKeyType(str);
    }

    @Z4.a(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(C1992j c1992j, boolean z10) {
        updateStagedInputTypeFlag(c1992j, 144, z10 ? 128 : 0);
        checkPasswordType(c1992j);
    }

    @Z4.a(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(C1992j c1992j, boolean z10) {
        c1992j.setSelectTextOnFocus(z10);
    }

    @Z4.a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C1992j c1992j, Integer num) {
        if (num == null) {
            c1992j.setHighlightColor(com.facebook.react.views.text.a.c(c1992j.getContext()));
        } else {
            c1992j.setHighlightColor(num.intValue());
        }
    }

    @Z4.a(customType = "Color", name = "selectionHandleColor")
    public void setSelectionHandleColor(C1992j c1992j, Integer num) {
        int i10;
        Drawable textSelectHandle;
        Drawable textSelectHandleLeft;
        Drawable textSelectHandleRight;
        BlendMode blendMode;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            textSelectHandle = c1992j.getTextSelectHandle();
            Drawable mutate = textSelectHandle.mutate();
            textSelectHandleLeft = c1992j.getTextSelectHandleLeft();
            Drawable mutate2 = textSelectHandleLeft.mutate();
            textSelectHandleRight = c1992j.getTextSelectHandleRight();
            Drawable mutate3 = textSelectHandleRight.mutate();
            if (num != null) {
                com.facebook.react.uimanager.C.a();
                int intValue = num.intValue();
                blendMode = BlendMode.SRC_IN;
                BlendModeColorFilter a10 = AbstractC1980z.a(intValue, blendMode);
                mutate.setColorFilter(a10);
                mutate2.setColorFilter(a10);
                mutate3.setColorFilter(a10);
            } else {
                mutate.clearColorFilter();
                mutate2.clearColorFilter();
                mutate3.clearColorFilter();
            }
            c1992j.setTextSelectHandle(mutate);
            c1992j.setTextSelectHandleLeft(mutate2);
            c1992j.setTextSelectHandleRight(mutate3);
            return;
        }
        if (i11 == 28) {
            return;
        }
        int i12 = 0;
        while (true) {
            String[] strArr = DRAWABLE_HANDLE_RESOURCES;
            if (i12 >= strArr.length) {
                return;
            }
            try {
                Field declaredField = c1992j.getClass().getDeclaredField(strArr[i12]);
                declaredField.setAccessible(true);
                i10 = declaredField.getInt(c1992j);
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            if (i10 == 0) {
                return;
            }
            Drawable mutate4 = androidx.core.content.a.e(c1992j.getContext(), i10).mutate();
            if (num != null) {
                mutate4.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                mutate4.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(c1992j);
            Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_HANDLE_FIELDS[i12]);
            declaredField3.setAccessible(true);
            declaredField3.set(obj, mutate4);
            i12++;
        }
    }

    @Z4.a(name = "submitBehavior")
    public void setSubmitBehavior(C1992j c1992j, String str) {
        c1992j.setSubmitBehavior(str);
    }

    @Z4.a(name = "textAlign")
    public void setTextAlign(C1992j c1992j, String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                c1992j.setJustificationMode(1);
            }
            c1992j.setGravityHorizontal(3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c1992j.setJustificationMode(0);
        }
        if (str == null || "auto".equals(str)) {
            c1992j.setGravityHorizontal(0);
            return;
        }
        if ("left".equals(str)) {
            c1992j.setGravityHorizontal(3);
            return;
        }
        if ("right".equals(str)) {
            c1992j.setGravityHorizontal(5);
            return;
        }
        if ("center".equals(str)) {
            c1992j.setGravityHorizontal(1);
            return;
        }
        AbstractC1721a.J("ReactNative", "Invalid textAlign: " + str);
        c1992j.setGravityHorizontal(0);
    }

    @Z4.a(name = "textAlignVertical")
    public void setTextAlignVertical(C1992j c1992j, String str) {
        if (str == null || "auto".equals(str)) {
            c1992j.setGravityVertical(0);
            return;
        }
        if ("top".equals(str)) {
            c1992j.setGravityVertical(48);
            return;
        }
        if ("bottom".equals(str)) {
            c1992j.setGravityVertical(80);
            return;
        }
        if ("center".equals(str)) {
            c1992j.setGravityVertical(16);
            return;
        }
        AbstractC1721a.J("ReactNative", "Invalid textAlignVertical: " + str);
        c1992j.setGravityVertical(0);
    }

    @Z4.a(name = "autoComplete")
    public void setTextContentType(C1992j c1992j, String str) {
        if (str == null) {
            setImportantForAutofill(c1992j, 2);
            return;
        }
        if ("off".equals(str)) {
            setImportantForAutofill(c1992j, 2);
            return;
        }
        Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
        if (map.containsKey(str)) {
            setAutofillHints(c1992j, map.get(str));
            return;
        }
        AbstractC1721a.J("ReactNative", "Invalid autoComplete: " + str);
        setImportantForAutofill(c1992j, 2);
    }

    @Z4.a(name = "textDecorationLine")
    public void setTextDecorationLine(C1992j c1992j, String str) {
        c1992j.setPaintFlags(c1992j.getPaintFlags() & (-25));
        for (String str2 : str.split(" ")) {
            if (str2.equals("underline")) {
                c1992j.setPaintFlags(c1992j.getPaintFlags() | 8);
            } else if (str2.equals("line-through")) {
                c1992j.setPaintFlags(c1992j.getPaintFlags() | 16);
            }
        }
    }

    @Z4.a(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(C1992j c1992j, Integer num) {
        Drawable background = c1992j.getBackground();
        if (background == null) {
            return;
        }
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e10) {
                AbstractC1721a.n(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e10);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Z4.a(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(C1992j c1992j, boolean z10) {
        c1992j.setShowSoftInputOnFocus(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final F0 f02, final C1992j c1992j) {
        c1992j.setEventDispatcher(getEventDispatcher(f02, c1992j));
        c1992j.addTextChangedListener(new e(f02, c1992j));
        c1992j.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.facebook.react.views.textinput.E
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ReactTextInputManager.lambda$addEventEmitters$0(F0.this, c1992j, view, z10);
            }
        });
        c1992j.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facebook.react.views.textinput.F
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean lambda$addEventEmitters$1;
                lambda$addEventEmitters$1 = ReactTextInputManager.lambda$addEventEmitters$1(C1992j.this, f02, textView, i10, keyEvent);
                return lambda$addEventEmitters$1;
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.text.c createShadowNodeInstance() {
        return new H();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1992j createViewInstance(F0 f02) {
        C1992j c1992j = new C1992j(f02);
        c1992j.setInputType(c1992j.getInputType() & (-131073));
        c1992j.setReturnKeyType("done");
        c1992j.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return c1992j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C1992j c1992j) {
        super.onAfterUpdateTransaction((ReactTextInputManager) c1992j);
        c1992j.O();
        c1992j.x();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    public void setBackgroundColor(C1992j c1992j, int i10) {
        if (G4.a.c()) {
            C1931a.i(c1992j, Integer.valueOf(i10));
        } else {
            super.setBackgroundColor((ReactTextInputManager) c1992j, i10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(C1992j c1992j, int i10, int i11, int i12, int i13) {
        c1992j.setPadding(i10, i11, i12, i13);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(C1992j c1992j, Object obj) {
        if (obj instanceof com.facebook.react.views.text.i) {
            com.facebook.react.views.text.i iVar = (com.facebook.react.views.text.i) obj;
            int f10 = (int) iVar.f();
            int h10 = (int) iVar.h();
            int g10 = (int) iVar.g();
            int e10 = (int) iVar.e();
            int i10 = -1;
            if (f10 != -1 || h10 != -1 || g10 != -1 || e10 != -1) {
                if (f10 == -1) {
                    f10 = c1992j.getPaddingLeft();
                }
                if (h10 == -1) {
                    h10 = c1992j.getPaddingTop();
                }
                if (g10 == -1) {
                    g10 = c1992j.getPaddingRight();
                }
                if (e10 == -1) {
                    e10 = c1992j.getPaddingBottom();
                }
                c1992j.setPadding(f10, h10, g10, e10);
            }
            if (iVar.b()) {
                o5.o.g(iVar.i(), c1992j);
            }
            if (c1992j.getSelectionStart() == c1992j.getSelectionEnd()) {
                i10 = iVar.i().length() - ((c1992j.getText() != null ? c1992j.getText().length() : 0) - c1992j.getSelectionStart());
            }
            c1992j.N(iVar);
            c1992j.K(iVar.c(), i10, i10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C1992j c1992j, C1973v0 c1973v0, E0 e02) {
        if (C1992j.f22924l0) {
            AbstractC1721a.m(TAG, "updateState: [" + c1992j.getId() + "]");
        }
        if (c1992j.getStateWrapper() == null) {
            c1992j.setPadding(0, 0, 0, 0);
        }
        c1992j.setStateWrapper(e02);
        ReadableMapBuffer stateDataMapBuffer = e02.getStateDataMapBuffer();
        if (stateDataMapBuffer != null) {
            return getReactTextUpdate(c1992j, c1973v0, stateDataMapBuffer);
        }
        return null;
    }

    public com.facebook.react.views.text.c createShadowNodeInstance(com.facebook.react.views.text.n nVar) {
        return new H(nVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C1992j c1992j, int i10, ReadableArray readableArray) {
        if (i10 == 1) {
            receiveCommand(c1992j, "focus", readableArray);
        } else if (i10 == 2) {
            receiveCommand(c1992j, "blur", readableArray);
        } else {
            if (i10 != 4) {
                return;
            }
            receiveCommand(c1992j, "setTextAndSelection", readableArray);
        }
    }

    public Object getReactTextUpdate(C1992j c1992j, C1973v0 c1973v0, com.facebook.react.common.mapbuffer.a aVar) {
        if (aVar.getCount() == 0) {
            return null;
        }
        com.facebook.react.common.mapbuffer.a x12 = aVar.x1(0);
        return com.facebook.react.views.text.i.a(com.facebook.react.views.text.s.g(c1992j.getContext(), x12, null), aVar.getInt(3), com.facebook.react.views.text.q.h(c1973v0, com.facebook.react.views.text.s.j(x12), c1992j.getGravityHorizontal()), com.facebook.react.views.text.q.i(aVar.x1(1).getString(2)), com.facebook.react.views.text.q.d(c1973v0, Build.VERSION.SDK_INT >= 26 ? c1992j.getJustificationMode() : 0));
    }

    private void setImportantForAutofill(C1992j c1992j, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        c1992j.setImportantForAutofill(i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C1992j c1992j, String str, ReadableArray readableArray) {
        char c10;
        str.hashCode();
        switch (str.hashCode()) {
            case -1699362314:
                if (str.equals("blurTextInput")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3027047:
                if (str.equals("blur")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1427010500:
                if (str.equals("setTextAndSelection")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1690703013:
                if (str.equals("focusTextInput")) {
                    c10 = 4;
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
            case 1:
                c1992j.w();
                break;
            case 2:
            case 4:
                c1992j.Q();
                break;
            case 3:
                int i10 = readableArray.getInt(0);
                if (i10 != -1) {
                    int i11 = readableArray.getInt(2);
                    int i12 = readableArray.getInt(3);
                    if (i12 == -1) {
                        i12 = i11;
                    }
                    if (!readableArray.isNull(1)) {
                        c1992j.M(getReactTextUpdate(readableArray.getString(1), i10));
                    }
                    c1992j.K(i10, i11, i12);
                    break;
                }
                break;
        }
    }
}
