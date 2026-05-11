package com.facebook.react.uimanager;

import a5.C1351a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.AbstractC1484a0;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.facebook.react.AbstractC1899n;
import com.facebook.react.AbstractC1902q;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import f5.AbstractC3147a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.conscrypt.BuildConfig;
import z0.C5228A;
import z0.C5229B;

/* renamed from: com.facebook.react.uimanager.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1948i0 extends G0.a {

    /* renamed from: v, reason: collision with root package name */
    private static int f22422v = 1056964608;

    /* renamed from: w, reason: collision with root package name */
    private static final int f22423w = 2;

    /* renamed from: x, reason: collision with root package name */
    public static final HashMap f22424x;

    /* renamed from: q, reason: collision with root package name */
    private final View f22425q;

    /* renamed from: r, reason: collision with root package name */
    private final d f22426r;

    /* renamed from: s, reason: collision with root package name */
    private Handler f22427s;

    /* renamed from: t, reason: collision with root package name */
    private final HashMap f22428t;

    /* renamed from: u, reason: collision with root package name */
    View f22429u;

    /* renamed from: com.facebook.react.uimanager.i0$a */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    /* renamed from: com.facebook.react.uimanager.i0$b */
    class b extends com.facebook.react.uimanager.events.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WritableMap f22431a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, WritableMap writableMap) {
            super(i10, i11);
            this.f22431a = writableMap;
        }

        @Override // com.facebook.react.uimanager.events.d
        protected WritableMap getEventData() {
            return this.f22431a;
        }

        @Override // com.facebook.react.uimanager.events.d
        public String getEventName() {
            return "topAccessibilityAction";
        }
    }

    /* renamed from: com.facebook.react.uimanager.i0$c */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22433a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f22434b;

        static {
            int[] iArr = new int[f.values().length];
            f22434b = iArr;
            try {
                iArr[f.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22434b[f.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22434b[f.CHECKBOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22434b[f.COMBOBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22434b[f.GRID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22434b[f.HEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22434b[f.IMG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22434b[f.LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22434b[f.LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22434b[f.MENU.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22434b[f.MENUBAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22434b[f.MENUITEM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22434b[f.NONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22434b[f.PROGRESSBAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22434b[f.RADIO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22434b[f.RADIOGROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22434b[f.SCROLLBAR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22434b[f.SEARCHBOX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f22434b[f.SLIDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f22434b[f.SPINBUTTON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f22434b[f.SUMMARY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f22434b[f.SWITCH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f22434b[f.TAB.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f22434b[f.TABLIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f22434b[f.TIMER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f22434b[f.TOOLBAR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr2 = new int[e.values().length];
            f22433a = iArr2;
            try {
                iArr2[e.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f22433a[e.DROPDOWNLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f22433a[e.TOGGLEBUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f22433a[e.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f22433a[e.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f22433a[e.IMAGEBUTTON.ordinal()] = 6;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f22433a[e.KEYBOARDKEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f22433a[e.TEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f22433a[e.ADJUSTABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f22433a[e.CHECKBOX.ordinal()] = 10;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f22433a[e.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f22433a[e.SPINBUTTON.ordinal()] = 12;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f22433a[e.SWITCH.ordinal()] = 13;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f22433a[e.LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f22433a[e.GRID.ordinal()] = 15;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f22433a[e.SCROLLVIEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f22433a[e.HORIZONTALSCROLLVIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f22433a[e.PAGER.ordinal()] = 18;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f22433a[e.DRAWERLAYOUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f22433a[e.SLIDINGDRAWER.ordinal()] = 20;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f22433a[e.ICONMENU.ordinal()] = 21;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f22433a[e.VIEWGROUP.ordinal()] = 22;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f22433a[e.WEBVIEW.ordinal()] = 23;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f22433a[e.NONE.ordinal()] = 24;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f22433a[e.LINK.ordinal()] = 25;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f22433a[e.SUMMARY.ordinal()] = 26;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f22433a[e.HEADER.ordinal()] = 27;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f22433a[e.ALERT.ordinal()] = 28;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f22433a[e.COMBOBOX.ordinal()] = 29;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f22433a[e.MENU.ordinal()] = 30;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f22433a[e.MENUBAR.ordinal()] = 31;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f22433a[e.MENUITEM.ordinal()] = 32;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f22433a[e.PROGRESSBAR.ordinal()] = 33;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f22433a[e.RADIOGROUP.ordinal()] = 34;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f22433a[e.SCROLLBAR.ordinal()] = 35;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f22433a[e.TAB.ordinal()] = 36;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f22433a[e.TABLIST.ordinal()] = 37;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f22433a[e.TIMER.ordinal()] = 38;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f22433a[e.TOOLBAR.ordinal()] = 39;
            } catch (NoSuchFieldError unused65) {
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.i0$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final List f22435a;

        /* renamed from: com.facebook.react.uimanager.i0$d$a */
        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public String f22436a;

            /* renamed from: b, reason: collision with root package name */
            public int f22437b;

            /* renamed from: c, reason: collision with root package name */
            public int f22438c;

            /* renamed from: d, reason: collision with root package name */
            public int f22439d;

            private a() {
            }
        }

        public d(ClickableSpan[] clickableSpanArr, Spannable spannable) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < clickableSpanArr.length; i10++) {
                ClickableSpan clickableSpan = clickableSpanArr[i10];
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spannable.length() && spanEnd <= spannable.length()) {
                    a aVar = new a();
                    aVar.f22436a = spannable.subSequence(spanStart, spanEnd).toString();
                    aVar.f22437b = spanStart;
                    aVar.f22438c = spanEnd;
                    aVar.f22439d = (clickableSpanArr.length - 1) - i10;
                    arrayList.add(aVar);
                }
            }
            this.f22435a = arrayList;
        }

        public a a(int i10) {
            for (a aVar : this.f22435a) {
                if (aVar.f22439d == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public a b(int i10, int i11) {
            for (a aVar : this.f22435a) {
                if (aVar.f22437b == i10 && aVar.f22438c == i11) {
                    return aVar;
                }
            }
            return null;
        }

        public int c() {
            return this.f22435a.size();
        }
    }

    /* renamed from: com.facebook.react.uimanager.i0$e */
    public enum e {
        NONE,
        BUTTON,
        DROPDOWNLIST,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        GRID,
        PAGER,
        SCROLLVIEW,
        HORIZONTALSCROLLVIEW,
        VIEWGROUP,
        WEBVIEW,
        DRAWERLAYOUT,
        SLIDINGDRAWER,
        ICONMENU,
        TOOLBAR;

        public static e fromRole(f fVar) {
            switch (c.f22434b[fVar.ordinal()]) {
                case 1:
                    return ALERT;
                case 2:
                    return BUTTON;
                case 3:
                    return CHECKBOX;
                case 4:
                    return COMBOBOX;
                case 5:
                    return GRID;
                case 6:
                    return HEADER;
                case 7:
                    return IMAGE;
                case 8:
                    return LINK;
                case 9:
                    return LIST;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    return MENU;
                case 11:
                    return MENUBAR;
                case 12:
                    return MENUITEM;
                case 13:
                    return NONE;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    return PROGRESSBAR;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    return RADIO;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    return RADIOGROUP;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    return SCROLLBAR;
                case 18:
                    return SEARCH;
                case 19:
                    return ADJUSTABLE;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    return SPINBUTTON;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    return SUMMARY;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    return SWITCH;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    return TAB;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    return TABLIST;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    return TIMER;
                case 26:
                    return TOOLBAR;
                default:
                    return null;
            }
        }

        public static e fromValue(String str) {
            if (str == null) {
                return NONE;
            }
            for (e eVar : values()) {
                if (eVar.name().equalsIgnoreCase(str)) {
                    return eVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static e fromViewTag(View view) {
            f fVar = (f) view.getTag(AbstractC1899n.f21906y);
            return fVar != null ? fromRole(fVar) : (e) view.getTag(AbstractC1899n.f21888g);
        }

        public static String getValue(e eVar) {
            switch (c.f22433a[eVar.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.Spinner";
                case 3:
                    return "android.widget.ToggleButton";
                case 4:
                    return "android.widget.EditText";
                case 5:
                    return "android.widget.ImageView";
                case 6:
                    return "android.widget.ImageButton";
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return "android.widget.TextView";
                case 9:
                    return "android.widget.SeekBar";
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    return "android.widget.CheckBox";
                case 11:
                    return "android.widget.RadioButton";
                case 12:
                    return "android.widget.SpinButton";
                case 13:
                    return "android.widget.Switch";
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    return "android.widget.AbsListView";
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    return "android.widget.GridView";
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    return "android.widget.ScrollView";
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    return "android.widget.HorizontalScrollView";
                case 18:
                    return "androidx.viewpager.widget.ViewPager";
                case 19:
                    return "androidx.drawerlayout.widget.DrawerLayout";
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    return "android.widget.SlidingDrawer";
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    return "com.android.internal.view.menu.IconMenuView";
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    return "android.view.ViewGroup";
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    return "android.webkit.WebView";
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case HVError.INSTRUCTION_ERROR /* 31 */:
                case 32:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                case 34:
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                case HVError.INVALID_FILE_ERROR /* 37 */:
                case 38:
                case 39:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + eVar);
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.i0$f */
    public enum f {
        ALERT,
        ALERTDIALOG,
        APPLICATION,
        ARTICLE,
        BANNER,
        BUTTON,
        CELL,
        CHECKBOX,
        COLUMNHEADER,
        COMBOBOX,
        COMPLEMENTARY,
        CONTENTINFO,
        DEFINITION,
        DIALOG,
        DIRECTORY,
        DOCUMENT,
        FEED,
        FIGURE,
        FORM,
        GRID,
        GROUP,
        HEADING,
        IMG,
        LINK,
        LIST,
        LISTITEM,
        LOG,
        MAIN,
        MARQUEE,
        MATH,
        MENU,
        MENUBAR,
        MENUITEM,
        METER,
        NAVIGATION,
        NONE,
        NOTE,
        OPTION,
        PRESENTATION,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        REGION,
        ROW,
        ROWGROUP,
        ROWHEADER,
        SCROLLBAR,
        SEARCHBOX,
        SEPARATOR,
        SLIDER,
        SPINBUTTON,
        STATUS,
        SUMMARY,
        SWITCH,
        TAB,
        TABLE,
        TABLIST,
        TABPANEL,
        TERM,
        TIMER,
        TOOLBAR,
        TOOLTIP,
        TREE,
        TREEGRID,
        TREEITEM;

        public static f fromValue(String str) {
            for (f fVar : values()) {
                if (fVar.name().equalsIgnoreCase(str)) {
                    return fVar;
                }
            }
            return null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f22424x = hashMap;
        hashMap.put("activate", Integer.valueOf(C5228A.a.f45627i.b()));
        hashMap.put("longpress", Integer.valueOf(C5228A.a.f45628j.b()));
        hashMap.put("increment", Integer.valueOf(C5228A.a.f45635q.b()));
        hashMap.put("decrement", Integer.valueOf(C5228A.a.f45636r.b()));
        hashMap.put("expand", Integer.valueOf(C5228A.a.f45641w.b()));
        hashMap.put("collapse", Integer.valueOf(C5228A.a.f45642x.b()));
    }

    public C1948i0(View view, boolean z10, int i10) {
        super(view);
        this.f22425q = view;
        this.f22428t = new HashMap();
        this.f22427s = new a();
        view.setFocusable(z10);
        AbstractC1484a0.B0(view, i10);
        this.f22426r = (d) view.getTag(AbstractC1899n.f21887f);
    }

    public static C5228A W(View view) {
        if (view == null) {
            return null;
        }
        C5228A d02 = C5228A.d0();
        try {
            AbstractC1484a0.d0(view, d02);
            return d02;
        } catch (NullPointerException unused) {
            if (d02 != null) {
                d02.h0();
            }
            return null;
        }
    }

    private Rect X(d.a aVar) {
        View view = this.f22425q;
        if (!(view instanceof TextView)) {
            return new Rect(0, 0, this.f22425q.getWidth(), this.f22425q.getHeight());
        }
        TextView textView = (TextView) view;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return new Rect(0, 0, textView.getWidth(), textView.getHeight());
        }
        double d10 = aVar.f22437b;
        double d11 = aVar.f22438c;
        int i10 = (int) d10;
        int lineForOffset = layout.getLineForOffset(i10);
        if (d10 > layout.getLineEnd(lineForOffset)) {
            return null;
        }
        Rect rect = new Rect();
        double primaryHorizontal = layout.getPrimaryHorizontal(i10);
        new Paint().setTextSize(((AbsoluteSizeSpan) Y(aVar.f22437b, aVar.f22438c, AbsoluteSizeSpan.class)) != null ? r7.getSize() : textView.getTextSize());
        int ceil = (int) Math.ceil(r4.measureText(aVar.f22436a));
        boolean z10 = lineForOffset != layout.getLineForOffset((int) d11);
        layout.getLineBounds(lineForOffset, rect);
        int scrollY = textView.getScrollY() + textView.getTotalPaddingTop();
        rect.top += scrollY;
        rect.bottom += scrollY;
        rect.left = (int) (rect.left + ((primaryHorizontal + textView.getTotalPaddingLeft()) - textView.getScrollX()));
        if (z10) {
            return new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int i11 = rect.left;
        return new Rect(i11, rect.top, ceil + i11, rect.bottom);
    }

    public static CharSequence Z(View view, C5228A c5228a) {
        C5228A W10 = c5228a == null ? W(view) : C5228A.f0(c5228a);
        if (W10 == null) {
            return null;
        }
        try {
            CharSequence u10 = W10.u();
            CharSequence E10 = W10.E();
            boolean isEmpty = TextUtils.isEmpty(E10);
            boolean z10 = view instanceof EditText;
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(u10) && (!z10 || isEmpty)) {
                sb2.append(u10);
                return sb2;
            }
            if (!isEmpty) {
                sb2.append(E10);
                return sb2;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                C5228A d02 = C5228A.d0();
                AbstractC1484a0.d0(childAt, d02);
                if (g0(d02, childAt) && !e0(d02, childAt)) {
                    CharSequence Z10 = Z(childAt, null);
                    if (!TextUtils.isEmpty(Z10)) {
                        sb3.append(((Object) Z10) + ", ");
                    }
                }
                d02.h0();
            }
            return h0(sb3);
        } finally {
            W10.h0();
        }
    }

    public static boolean a0(C5228A c5228a, View view) {
        if (c5228a != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    C5228A d02 = C5228A.d0();
                    try {
                        AbstractC1484a0.d0(childAt, d02);
                        if (d02.c0() && !e0(d02, childAt) && g0(d02, childAt)) {
                            d02.h0();
                            return true;
                        }
                        d02.h0();
                    } catch (Throwable th) {
                        if (d02 != null) {
                            d02.h0();
                        }
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    private static boolean b0(C5228A c5228a) {
        return c5228a != null && (!TextUtils.isEmpty(c5228a.D()) || c5228a.M() || d0(c5228a));
    }

    public static boolean c0(C5228A c5228a) {
        return (c5228a == null || c5228a.s() != null || (TextUtils.isEmpty(c5228a.E()) && TextUtils.isEmpty(c5228a.u()) && TextUtils.isEmpty(c5228a.x()))) ? false : true;
    }

    public static boolean d0(C5228A c5228a) {
        C5228A.g B10;
        if (c5228a == null || (B10 = c5228a.B()) == null) {
            return false;
        }
        float b10 = B10.b();
        float c10 = B10.c();
        float a10 = B10.a();
        return b10 - c10 > 0.0f && a10 >= c10 && a10 <= b10;
    }

    public static boolean e0(C5228A c5228a, View view) {
        if (c5228a == null || view == null || !c5228a.c0()) {
            return false;
        }
        return c5228a.X() || f0(c5228a);
    }

    public static boolean f0(C5228A c5228a) {
        if (c5228a == null) {
            return false;
        }
        if (c5228a.O() || c5228a.V() || c5228a.R()) {
            return true;
        }
        List i10 = c5228a.i();
        return i10.contains(16) || i10.contains(32) || i10.contains(1);
    }

    public static boolean g0(C5228A c5228a, View view) {
        int y10;
        if (c5228a == null || view == null || (y10 = AbstractC1484a0.y(view)) == 4) {
            return false;
        }
        if (y10 != 2 || c5228a.p() > 0) {
            return c0(c5228a) || b0(c5228a) || c5228a.M() || a0(c5228a, view);
        }
        return false;
    }

    private static String h0(StringBuilder sb2) {
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - f22423w, length);
        }
        return sb2.toString();
    }

    public static void i0(View view, boolean z10, int i10) {
        AbstractC1484a0.q0(view, new C1948i0(view, z10, i10));
    }

    private void j0(View view) {
        if (this.f22427s.hasMessages(1, view)) {
            this.f22427s.removeMessages(1, view);
        }
        this.f22427s.sendMessageDelayed(this.f22427s.obtainMessage(1, view), 200L);
    }

    public static void k0(View view, boolean z10, int i10) {
        if (AbstractC1484a0.O(view)) {
            return;
        }
        if (view.getTag(AbstractC1899n.f21888g) == null && view.getTag(AbstractC1899n.f21889h) == null && view.getTag(AbstractC1899n.f21882a) == null && view.getTag(AbstractC1899n.f21900s) == null && view.getTag(AbstractC1899n.f21884c) == null && view.getTag(AbstractC1899n.f21887f) == null && view.getTag(AbstractC1899n.f21906y) == null) {
            return;
        }
        AbstractC1484a0.q0(view, new C1948i0(view, z10, i10));
    }

    public static void l0(C5228A c5228a, e eVar, Context context) {
        if (eVar == null) {
            eVar = e.NONE;
        }
        c5228a.q0(e.getValue(eVar));
        if (eVar.equals(e.LINK)) {
            c5228a.K0(context.getString(AbstractC1902q.f21947v));
            return;
        }
        if (eVar.equals(e.IMAGE)) {
            c5228a.K0(context.getString(AbstractC1902q.f21945t));
            return;
        }
        if (eVar.equals(e.IMAGEBUTTON)) {
            c5228a.K0(context.getString(AbstractC1902q.f21946u));
            c5228a.r0(true);
            return;
        }
        if (eVar.equals(e.BUTTON)) {
            c5228a.r0(true);
            return;
        }
        if (eVar.equals(e.TOGGLEBUTTON)) {
            c5228a.r0(true);
            c5228a.o0(true);
            return;
        }
        if (eVar.equals(e.SUMMARY)) {
            c5228a.K0(context.getString(AbstractC1902q.f21922H));
            return;
        }
        if (eVar.equals(e.HEADER)) {
            c5228a.A0(true);
            return;
        }
        if (eVar.equals(e.ALERT)) {
            c5228a.K0(context.getString(AbstractC1902q.f21926a));
            return;
        }
        if (eVar.equals(e.COMBOBOX)) {
            c5228a.K0(context.getString(AbstractC1902q.f21944s));
            return;
        }
        if (eVar.equals(e.MENU)) {
            c5228a.K0(context.getString(AbstractC1902q.f21948w));
            return;
        }
        if (eVar.equals(e.MENUBAR)) {
            c5228a.K0(context.getString(AbstractC1902q.f21949x));
            return;
        }
        if (eVar.equals(e.MENUITEM)) {
            c5228a.K0(context.getString(AbstractC1902q.f21950y));
            return;
        }
        if (eVar.equals(e.PROGRESSBAR)) {
            c5228a.K0(context.getString(AbstractC1902q.f21951z));
            return;
        }
        if (eVar.equals(e.RADIOGROUP)) {
            c5228a.K0(context.getString(AbstractC1902q.f21915A));
            return;
        }
        if (eVar.equals(e.SCROLLBAR)) {
            c5228a.K0(context.getString(AbstractC1902q.f21917C));
            return;
        }
        if (eVar.equals(e.SPINBUTTON)) {
            c5228a.K0(context.getString(AbstractC1902q.f21918D));
            return;
        }
        if (eVar.equals(e.TAB)) {
            c5228a.K0(context.getString(AbstractC1902q.f21916B));
            return;
        }
        if (eVar.equals(e.TABLIST)) {
            c5228a.K0(context.getString(AbstractC1902q.f21923I));
        } else if (eVar.equals(e.TIMER)) {
            c5228a.K0(context.getString(AbstractC1902q.f21924J));
        } else if (eVar.equals(e.TOOLBAR)) {
            c5228a.K0(context.getString(AbstractC1902q.f21925K));
        }
    }

    private static void m0(C5228A c5228a, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (nextKey.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
                c5228a.N0(dynamic.asBoolean());
            } else if (nextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                c5228a.w0(!dynamic.asBoolean());
            } else if (nextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                boolean asBoolean = dynamic.asBoolean();
                c5228a.o0(true);
                c5228a.p0(asBoolean);
            }
        }
    }

    @Override // G0.a
    protected int B(float f10, float f11) {
        Layout layout;
        d dVar = this.f22426r;
        if (dVar == null || dVar.c() == 0) {
            return Integer.MIN_VALUE;
        }
        View view = this.f22425q;
        if (!(view instanceof TextView)) {
            return Integer.MIN_VALUE;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned) || (layout = textView.getLayout()) == null) {
            return Integer.MIN_VALUE;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((f11 - textView.getTotalPaddingTop()) + textView.getScrollY())), (f10 - textView.getTotalPaddingLeft()) + textView.getScrollX());
        ClickableSpan clickableSpan = (ClickableSpan) Y(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpan == null) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) textView.getText();
        d.a b10 = this.f22426r.b(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
        if (b10 != null) {
            return b10.f22439d;
        }
        return Integer.MIN_VALUE;
    }

    @Override // G0.a
    protected void C(List list) {
        if (this.f22426r == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f22426r.c(); i10++) {
            list.add(Integer.valueOf(i10));
        }
    }

    @Override // G0.a
    protected boolean J(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // G0.a
    protected void N(int i10, C5228A c5228a) {
        d dVar = this.f22426r;
        if (dVar == null) {
            c5228a.u0(BuildConfig.FLAVOR);
            c5228a.m0(new Rect(0, 0, 1, 1));
            return;
        }
        d.a a10 = dVar.a(i10);
        if (a10 == null) {
            c5228a.u0(BuildConfig.FLAVOR);
            c5228a.m0(new Rect(0, 0, 1, 1));
            return;
        }
        Rect X10 = X(a10);
        if (X10 == null) {
            c5228a.u0(BuildConfig.FLAVOR);
            c5228a.m0(new Rect(0, 0, 1, 1));
            return;
        }
        c5228a.u0(a10.f22436a);
        c5228a.a(16);
        c5228a.m0(X10);
        c5228a.K0(this.f22425q.getResources().getString(AbstractC1902q.f21947v));
        c5228a.q0(e.getValue(e.BUTTON));
    }

    protected Object Y(int i10, int i11, Class cls) {
        View view = this.f22425q;
        if (!(view instanceof TextView) || !(((TextView) view).getText() instanceof Spanned)) {
            return null;
        }
        Object[] spans = ((Spanned) ((TextView) this.f22425q).getText()).getSpans(i10, i11, cls);
        if (spans.length > 0) {
            return spans[0];
        }
        return null;
    }

    @Override // G0.a, androidx.core.view.C1483a
    public C5229B b(View view) {
        if (this.f22426r != null) {
            return super.b(view);
        }
        return null;
    }

    @Override // G0.a, androidx.core.view.C1483a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC1899n.f21891j);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int asInt = dynamic.asInt();
                    int asInt2 = dynamic2.asInt();
                    int asInt3 = dynamic3.asInt();
                    if (asInt3 <= asInt || asInt2 < asInt || asInt3 < asInt2) {
                        return;
                    }
                    accessibilityEvent.setItemCount(asInt3 - asInt);
                    accessibilityEvent.setCurrentItemIndex(asInt2);
                }
            }
        }
    }

    @Override // G0.a, androidx.core.view.C1483a
    public void g(View view, C5228A c5228a) {
        super.g(view, c5228a);
        if (view.getTag(AbstractC1899n.f21890i) != null) {
            c5228a.a(((Boolean) view.getTag(AbstractC1899n.f21890i)).booleanValue() ? 524288 : 262144);
        }
        e fromViewTag = e.fromViewTag(view);
        String str = (String) view.getTag(AbstractC1899n.f21885d);
        if (fromViewTag != null) {
            l0(c5228a, fromViewTag, view.getContext());
        }
        if (str != null) {
            c5228a.T0(str);
        }
        Object tag = view.getTag(AbstractC1899n.f21897p);
        if (tag != null) {
            View a10 = AbstractC3147a.a(view.getRootView(), (String) tag);
            this.f22429u = a10;
            if (a10 != null) {
                c5228a.D0(a10);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC1899n.f21889h);
        if (readableMap != null) {
            m0(c5228a, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(AbstractC1899n.f21882a);
        ReadableMap readableMap2 = (ReadableMap) view.getTag(AbstractC1899n.f21884c);
        if (readableMap2 != null) {
            c5228a.t0(C5228A.f.a(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        boolean z10 = true;
        if (readableArray != null) {
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                ReadableMap map = readableArray.getMap(i10);
                if (!map.hasKey("name")) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                int i11 = f22422v;
                String string = map.hasKey("label") ? map.getString("label") : null;
                HashMap hashMap = f22424x;
                if (hashMap.containsKey(map.getString("name"))) {
                    i11 = ((Integer) hashMap.get(map.getString("name"))).intValue();
                } else {
                    f22422v++;
                }
                this.f22428t.put(Integer.valueOf(i11), map.getString("name"));
                c5228a.b(new C5228A.a(i11, string));
            }
        }
        ReadableMap readableMap3 = (ReadableMap) view.getTag(AbstractC1899n.f21891j);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int asInt = dynamic.asInt();
                    int asInt2 = dynamic2.asInt();
                    int asInt3 = dynamic3.asInt();
                    if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                        c5228a.J0(C5228A.g.d(0, asInt, asInt3, asInt2));
                    }
                }
            }
        }
        String str2 = (String) view.getTag(AbstractC1899n.f21900s);
        if (str2 != null) {
            c5228a.V0(str2);
        }
        boolean z11 = TextUtils.isEmpty(c5228a.u()) && TextUtils.isEmpty(c5228a.E());
        if (readableArray == null && readableMap == null && tag == null && fromViewTag == null) {
            z10 = false;
        }
        if (z11 && z10) {
            c5228a.u0(Z(view, c5228a));
        }
    }

    @Override // androidx.core.view.C1483a
    public boolean j(View view, int i10, Bundle bundle) {
        if (i10 == 524288) {
            view.setTag(AbstractC1899n.f21890i, Boolean.FALSE);
        }
        if (i10 == 262144) {
            view.setTag(AbstractC1899n.f21890i, Boolean.TRUE);
        }
        if (!this.f22428t.containsKey(Integer.valueOf(i10))) {
            return super.j(view, i10, bundle);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("actionName", (String) this.f22428t.get(Integer.valueOf(i10)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id2 = view.getId();
            int e10 = L0.e(reactContext);
            UIManager g10 = L0.g(reactContext, C1351a.a(id2));
            if (g10 != null) {
                g10.getEventDispatcher().c(new b(e10, id2, createMap));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        e eVar = (e) view.getTag(AbstractC1899n.f21888g);
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC1899n.f21891j);
        if (eVar != e.ADJUSTABLE) {
            return true;
        }
        if (i10 != C5228A.a.f45635q.b() && i10 != C5228A.a.f45636r.b()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            j0(view);
        }
        return super.j(view, i10, bundle);
    }
}
