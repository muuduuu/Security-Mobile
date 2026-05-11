package com.webengage.sdk.android.actions.render;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.webengage.sdk.android.C2963k;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.NotificationClickHandlerService;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.actions.exception.WebViewException;
import com.webengage.sdk.android.actions.render.InAppNotificationData;
import com.webengage.sdk.android.actions.render.n;
import com.webengage.sdk.android.l1;
import com.webengage.sdk.android.n0;
import com.webengage.sdk.android.o4;
import com.webengage.sdk.android.u2;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.v1;
import com.webengage.sdk.android.y3;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class n extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private f f30400a = null;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f30401b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30402c = false;

    /* renamed from: d, reason: collision with root package name */
    private String f30403d = BuildConfig.FLAVOR;

    /* renamed from: e, reason: collision with root package name */
    private InAppNotificationData f30404e = null;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f30405f = null;

    /* renamed from: g, reason: collision with root package name */
    private Animation f30406g = null;

    /* renamed from: h, reason: collision with root package name */
    private Animation f30407h = null;

    /* renamed from: i, reason: collision with root package name */
    private Handler f30408i = null;

    /* renamed from: j, reason: collision with root package name */
    private int f30409j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f30410k = 1;

    /* renamed from: l, reason: collision with root package name */
    private int f30411l = 2;

    /* renamed from: m, reason: collision with root package name */
    private int f30412m = 3;

    /* renamed from: n, reason: collision with root package name */
    private int f30413n = -1;

    /* renamed from: o, reason: collision with root package name */
    private String f30414o = BuildConfig.FLAVOR;

    /* renamed from: p, reason: collision with root package name */
    private String f30415p = BuildConfig.FLAVOR;

    /* renamed from: q, reason: collision with root package name */
    private boolean f30416q = false;

    /* renamed from: r, reason: collision with root package name */
    private String f30417r = BuildConfig.FLAVOR;

    /* renamed from: s, reason: collision with root package name */
    private Context f30418s = null;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                n.this.f30400a.getWindow().getDecorView().setVisibility(0);
                n.this.f30400a.getWindow().getDecorView().setEnabled(false);
                if (n.this.f30406g == null) {
                    n.this.e();
                } else if (!n.this.f30406g.hasStarted()) {
                    n.this.f30405f.startAnimation(n.this.f30406g);
                }
            } catch (Exception unused) {
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (n.this.f30400a != null && n.this.f30400a.getWindow() != null && n.this.f30400a.getWindow().getDecorView() != null) {
                    if (n.this.f30400a.getWindow().getDecorView().getVisibility() == 8) {
                        n.this.a();
                    } else if (n.this.f30407h == null) {
                        n.this.dismissAllowingStateLoss();
                        n.this.e();
                    } else if (!n.this.f30407h.hasStarted()) {
                        n.this.f30405f.startAnimation(n.this.f30407h);
                    }
                }
            } catch (Exception e10) {
                Logger.e("Render", e10.toString());
            }
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30421a;

        static {
            int[] iArr = new int[InAppNotificationData.InAppType.values().length];
            f30421a = iArr;
            try {
                iArr[InAppNotificationData.InAppType.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30421a[InAppNotificationData.InAppType.FOOTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private final class d implements Animation.AnimationListener {
        private d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            try {
                n.this.e();
            } catch (Exception unused) {
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        /* synthetic */ d(n nVar, a aVar) {
            this();
        }
    }

    private final class e implements Animation.AnimationListener {
        private e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            try {
                n.this.dismissAllowingStateLoss();
                n.this.e();
            } catch (Exception unused) {
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        /* synthetic */ e(n nVar, a aVar) {
            this();
        }
    }

    final class f extends Dialog {

        /* renamed from: a, reason: collision with root package name */
        private com.webengage.sdk.android.actions.render.f f30424a;

        public f(Context context, int i10) {
            super(context, i10);
            this.f30424a = null;
            try {
                requestWindowFeature(1);
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
                if (n.this.f30402c) {
                    getWindow().setFlags(1024, 1024);
                }
                n.this.f30405f = new RelativeLayout(getContext());
                n.this.f30405f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f30424a = new com.webengage.sdk.android.actions.render.f(n.this.f30404e, n.this);
                n.this.a(getWindow(), n.this.getActivity().getResources().getConfiguration().orientation);
                if (n.this.f30406g != null) {
                    getWindow().getDecorView().setVisibility(8);
                }
                WebView a10 = new q(n.this.f30403d, "text/html", "UTF-8", this.f30424a, n.this.getActivity(), n.this.f30401b).a();
                a10.setTag("TAG_WE_WEB_VIEW");
                n.this.f30405f.addView(a10);
                a10.setOnTouchListener(new View.OnTouchListener() { // from class: com.webengage.sdk.android.actions.render.A
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean a11;
                        a11 = n.f.a(view, motionEvent);
                        return a11;
                    }
                });
                setContentView(n.this.f30405f);
            } catch (Exception e10) {
                Logger.e("ExceptionDialog", e10.toString());
                WebEngage.startService(l1.a(y3.f31163h, new WebViewException(e10.getMessage()), n.this.getActivity().getApplicationContext()), n.this.getActivity().getApplicationContext());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
            return true;
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            n.this.c();
        }
    }

    void d() {
        this.f30413n = this.f30412m;
        if (this.f30404e.isTestInApp() || g()) {
            h();
        } else {
            a();
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Logger.d("WebEngage", "Attach RenderDialogFragment");
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Logger.d("RenderDialogFragment", "Configuration Changed");
        a(this.f30400a.getWindow(), configuration.orientation);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        Logger.d("WebEngage", "Create");
        super.onCreate(bundle);
        try {
            this.f30418s = getActivity().getApplicationContext();
            Bundle arguments = getArguments();
            this.f30408i = new Handler(Looper.myLooper());
            arguments.setClassLoader(InAppNotificationData.class.getClassLoader());
            InAppNotificationData inAppNotificationData = (InAppNotificationData) arguments.getParcelable("notificationData");
            this.f30404e = inAppNotificationData;
            this.f30401b = inAppNotificationData.getData().optJSONObject("layoutAttributes");
            this.f30403d = arguments.getString("baseUrl");
            this.f30402c = arguments.getBoolean("fullscreen", false);
            a aVar = null;
            this.f30406g = C2963k.a(this.f30401b.optString("entryAnimation", "FADE_IN"), new d(this, aVar), this.f30401b.optInt("animDuration", 1000));
            this.f30407h = C2963k.a(this.f30401b.optString("exitAnimation", "FADE_OUT"), new e(this, aVar), this.f30401b.optInt("animDuration", 1000));
            this.f30400a = new f(getActivity(), R.style.Theme);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Logger.d("WebEngage", "CreateDialog");
        return this.f30400a;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Logger.d("WebEngage", "CreateView");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Logger.d("WebEngage", "Destroy");
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        Logger.d("RenderDialogFragment", "DestroyView");
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
        Logger.d("WebEngage", "Detach");
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        DataHolder.get().c(false);
        Logger.d("WebEngage", "Pause");
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        Logger.d("WebEngage", "Resume");
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        Logger.d("WebEngage", "Start");
        DataHolder.get().c(true);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStop() {
        super.onStop();
        Logger.d("WebEngage", "Stop");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            dismissAllowingStateLoss();
        } catch (Exception unused) {
        }
        DataHolder.get().c(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        VibrationEffect createOneShot;
        int i10 = this.f30413n;
        if (i10 == 0) {
            DataHolder.get().c(false);
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f30404e.getVariationId());
            hashMap.put("call_to_action", this.f30414o);
            hashMap.put("experiment_id", this.f30404e.getExperimentId());
            WebEngage.startService(l1.a(y3.f31158c, n0.b("notification_click", hashMap, null, null, this.f30418s), this.f30418s), this.f30418s);
            boolean onInAppNotificationClicked = com.webengage.sdk.android.x.a(this.f30418s).onInAppNotificationClicked(this.f30418s, this.f30404e, this.f30414o);
            String str = this.f30415p;
            if (str == null || str.isEmpty() || "null".equals(this.f30415p) || onInAppNotificationClicked) {
                return;
            }
            Intent intent = new Intent(this.f30418s, (Class<?>) NotificationClickHandlerService.class);
            intent.setAction("com.webengage.sdk.android.intent.ACTION");
            Bundle bundle = new Bundle();
            bundle.putString("action", "WebEngageDeeplink");
            bundle.putString("deeplink_uri", this.f30415p);
            intent.putExtras(bundle);
            this.f30418s.startService(intent);
            return;
        }
        if (i10 == 1) {
            DataHolder.get().c(false);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("id", this.f30404e.getVariationId());
            hashMap2.put("experiment_id", this.f30404e.getExperimentId());
            WebEngage.startService(l1.a(y3.f31158c, n0.b("notification_close", hashMap2, null, null, this.f30418s), this.f30418s), this.f30418s);
            com.webengage.sdk.android.x.a(this.f30418s).onInAppNotificationDismissed(this.f30418s, this.f30404e);
            return;
        }
        if (i10 == 2) {
            DataHolder.get().c(false);
            WebEngage.startService(l1.a(y3.f31163h, new WebViewException(this.f30417r), this.f30418s), this.f30418s);
            return;
        }
        if (i10 != 3) {
            return;
        }
        WebView webView = (WebView) this.f30405f.findViewWithTag("TAG_WE_WEB_VIEW");
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.webengage.sdk.android.actions.render.z
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean a10;
                    a10 = n.a(view, motionEvent);
                    return a10;
                }
            });
        }
        if (v1.a("android.permission.VIBRATE", this.f30418s)) {
            Vibrator vibrator = (Vibrator) this.f30418s.getSystemService("vibrator");
            if (Build.VERSION.SDK_INT >= 26) {
                createOneShot = VibrationEffect.createOneShot(20L, -1);
                vibrator.vibrate(createOneShot);
            } else {
                vibrator.vibrate(20L);
            }
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("experiment_id", this.f30404e.getExperimentId());
        hashMap3.put("id", this.f30404e.getVariationId());
        WebEngage.startService(l1.a(y3.f31158c, n0.b("notification_view", hashMap3, null, null, this.f30418s), this.f30418s), this.f30418s);
        com.webengage.sdk.android.x.a(this.f30418s).onInAppNotificationShown(this.f30418s, this.f30404e);
    }

    private boolean f() {
        try {
            String experimentId = this.f30404e.getExperimentId();
            com.webengage.sdk.android.actions.rules.a aVar = new com.webengage.sdk.android.actions.rules.a(this.f30418s);
            WebEngageConstant.a aVar2 = WebEngageConstant.a.NOTIFICATION;
            Map<String, Object> a10 = aVar.a(experimentId, aVar2);
            return o4.b().a(aVar2, a10, aVar.a(this.f30404e.getVariationId(), a10));
        } catch (Exception e10) {
            Logger.e("WebEngage", "Exception while performing in-app base checks", e10);
            return true;
        }
    }

    private boolean g() {
        return f() && u2.b().evaluateRule(this.f30404e.getExperimentId(), WebEngageConstant.d.PAGE_RULE);
    }

    public InAppNotificationData b() {
        return this.f30404e;
    }

    void c() {
        this.f30413n = this.f30410k;
        i();
    }

    void h() {
        this.f30408i.post(new a());
    }

    void i() {
        this.f30408i.post(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0133, code lost:
    
        if (r8 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0157, code lost:
    
        r11 = (int) ((r8 * r2.density) + (r16.f30401b.optInt("logoHeight", 0) * r2.density));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0155, code lost:
    
        if (r8 != 0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Window window, int i10) {
        DisplayMetrics displayMetrics;
        int i11;
        int optInt;
        int i12;
        int identifier;
        StringBuilder sb2;
        String str;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int statusBars;
        Insets insets;
        int i13;
        WindowMetrics currentWindowMetrics2;
        WindowInsets windowInsets2;
        int navigationBars;
        Insets insets2;
        int i14;
        WindowMetrics currentWindowMetrics3;
        Rect bounds;
        boolean optBoolean = this.f30401b.optBoolean("allowLandscape", false);
        boolean optBoolean2 = this.f30401b.optBoolean("allowPortrait", false);
        if (this.f30401b.isNull("allowPortrait")) {
            if (!optBoolean) {
                if (i10 == 2) {
                    window.getDecorView().setVisibility(8);
                    return;
                }
                window.getDecorView().setVisibility(0);
            }
            displayMetrics = new DisplayMetrics();
            getActivity().getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            Rect rect = new Rect();
            getActivity().getWindow().peekDecorView().getWindowVisibleDisplayFrame(rect);
            float f10 = rect.top;
            float measuredHeight = getActivity().getWindow().peekDecorView().getMeasuredHeight() - rect.bottom;
            float f11 = displayMetrics.widthPixels;
            float f12 = displayMetrics.heightPixels;
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                currentWindowMetrics = getActivity().getWindowManager().getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                statusBars = WindowInsets.Type.statusBars();
                insets = windowInsets.getInsets(statusBars);
                i13 = insets.top;
                f10 = i13;
                currentWindowMetrics2 = getActivity().getWindowManager().getCurrentWindowMetrics();
                windowInsets2 = currentWindowMetrics2.getWindowInsets();
                navigationBars = WindowInsets.Type.navigationBars();
                insets2 = windowInsets2.getInsets(navigationBars);
                i14 = insets2.bottom;
                measuredHeight = i14;
                currentWindowMetrics3 = getActivity().getWindowManager().getCurrentWindowMetrics();
                bounds = currentWindowMetrics3.getBounds();
                f12 = (bounds.height() - f10) - measuredHeight;
            }
            if (displayMetrics.widthPixels / displayMetrics.density >= this.f30401b.optInt("responsiveThreshold", 500)) {
                Logger.d("RenderDialogFragment", "Portrait");
                JSONObject optJSONObject = this.f30401b.optJSONObject("portrait");
                if (optJSONObject != null) {
                    int optInt2 = optJSONObject.optInt("width", 0);
                    if (optInt2 != 0) {
                        f11 = (int) (optInt2 * displayMetrics.density);
                    }
                    optInt = optJSONObject.optInt("height", 0);
                }
                InAppNotificationData.InAppType inAppType = this.f30404e.getInAppType();
                if (!this.f30402c && f10 == 0.0f) {
                    Resources resources = getActivity().getApplicationContext().getResources();
                    identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier <= 0) {
                        f10 = resources.getDimensionPixelSize(identifier);
                        sb2 = new StringBuilder();
                        str = "statusBar by resource = ";
                    } else {
                        f10 = (int) Math.ceil(24 * resources.getDisplayMetrics().density);
                        sb2 = new StringBuilder();
                        str = "statusBar by constant = ";
                    }
                    sb2.append(str);
                    sb2.append(f10);
                    Logger.d("RenderDialogFragment", sb2.toString());
                }
                i12 = c.f30421a[inAppType.ordinal()];
                if (i12 != 1 || i12 == 2) {
                    window.setFlags(8, 8);
                }
                if (i11 < 30) {
                    measuredHeight = 0.0f;
                }
                double centerY = (!inAppType.equals(InAppNotificationData.InAppType.FOOTER) ? (rect.centerY() - (f10 / 2.0f)) - (f12 / 2.0f) : (((-rect.centerY()) + (f10 / 2.0f)) + f10) + (f12 / 2.0f)) - (measuredHeight / 2.0f);
                window.setLayout((int) f11, (int) f12);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.x = (int) Math.ceil(0.0d);
                attributes.y = (int) Math.ceil(centerY);
                window.setAttributes(attributes);
                return;
            }
            Logger.d("RenderDialogFragment", "Landscape");
            JSONObject optJSONObject2 = this.f30401b.optJSONObject("landscape");
            if (optJSONObject2 != null) {
                int optInt3 = optJSONObject2.optInt("width", 0);
                if (optInt3 != 0) {
                    f11 = (int) (optInt3 * displayMetrics.density);
                }
                optInt = optJSONObject2.optInt("height", 0);
            }
            InAppNotificationData.InAppType inAppType2 = this.f30404e.getInAppType();
            if (!this.f30402c) {
                Resources resources2 = getActivity().getApplicationContext().getResources();
                identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier <= 0) {
                }
                sb2.append(str);
                sb2.append(f10);
                Logger.d("RenderDialogFragment", sb2.toString());
            }
            i12 = c.f30421a[inAppType2.ordinal()];
            if (i12 != 1) {
            }
            window.setFlags(8, 8);
            if (i11 < 30) {
            }
            double centerY2 = (!inAppType2.equals(InAppNotificationData.InAppType.FOOTER) ? (rect.centerY() - (f10 / 2.0f)) - (f12 / 2.0f) : (((-rect.centerY()) + (f10 / 2.0f)) + f10) + (f12 / 2.0f)) - (measuredHeight / 2.0f);
            window.setLayout((int) f11, (int) f12);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            attributes2.x = (int) Math.ceil(0.0d);
            attributes2.y = (int) Math.ceil(centerY2);
            window.setAttributes(attributes2);
            return;
        }
        if (!optBoolean || !optBoolean2) {
            if (optBoolean2) {
                if (i10 == 2) {
                    window.getDecorView().setVisibility(8);
                    return;
                }
                window.getDecorView().setVisibility(0);
            }
            if (optBoolean) {
                if (i10 == 1) {
                    window.getDecorView().setVisibility(8);
                    return;
                }
                window.getDecorView().setVisibility(0);
            }
        }
        displayMetrics = new DisplayMetrics();
        getActivity().getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Rect rect2 = new Rect();
        getActivity().getWindow().peekDecorView().getWindowVisibleDisplayFrame(rect2);
        float f102 = rect2.top;
        float measuredHeight2 = getActivity().getWindow().peekDecorView().getMeasuredHeight() - rect2.bottom;
        float f112 = displayMetrics.widthPixels;
        float f122 = displayMetrics.heightPixels;
        i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
        }
        if (displayMetrics.widthPixels / displayMetrics.density >= this.f30401b.optInt("responsiveThreshold", 500)) {
        }
    }

    void a(String str) {
        this.f30413n = this.f30411l;
        this.f30417r = str;
        i();
    }

    void a(String str, String str2) {
        Map<String, Object> map;
        try {
            map = (Map) DataType.convert(str2, DataType.MAP, false);
        } catch (Exception unused) {
            Logger.e("WebEngage", "Unable to parse event data for the InApp event " + str + ". Tracking event without event data.");
            map = null;
        }
        a(str, map);
    }

    void a(String str, String str2, boolean z10) {
        this.f30413n = this.f30409j;
        this.f30414o = str;
        this.f30415p = str2;
        this.f30416q = z10;
        i();
    }

    void a(String str, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.f30404e.getVariationId());
        hashMap.put("experiment_id", this.f30404e.getExperimentId());
        if (map != null) {
            hashMap.putAll(map);
        }
        WebEngage.get().analytics().track(str, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return false;
    }
}
