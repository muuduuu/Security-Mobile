package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C1409k;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.s0;
import androidx.core.app.AbstractC1480b;
import androidx.core.content.res.f;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1508m0;
import androidx.core.view.AbstractC1520t;
import androidx.core.view.AbstractC1522u;
import androidx.core.view.C1504k0;
import androidx.core.view.K0;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1599p;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import g.AbstractC3170a;
import g.AbstractC3172c;
import g.AbstractC3175f;
import g.AbstractC3176g;
import g.AbstractC3178i;
import g.AbstractC3179j;
import h.AbstractC3220a;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class i extends androidx.appcompat.app.g implements e.a, LayoutInflater.Factory2 {

    /* renamed from: C0, reason: collision with root package name */
    private static final j0.i f13170C0 = new j0.i();

    /* renamed from: D0, reason: collision with root package name */
    private static final boolean f13171D0 = false;

    /* renamed from: E0, reason: collision with root package name */
    private static final int[] f13172E0 = {R.attr.windowBackground};

    /* renamed from: F0, reason: collision with root package name */
    private static final boolean f13173F0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    private boolean f13174A;

    /* renamed from: A0, reason: collision with root package name */
    private OnBackInvokedDispatcher f13175A0;

    /* renamed from: B, reason: collision with root package name */
    ViewGroup f13176B;

    /* renamed from: B0, reason: collision with root package name */
    private OnBackInvokedCallback f13177B0;

    /* renamed from: C, reason: collision with root package name */
    private TextView f13178C;

    /* renamed from: D, reason: collision with root package name */
    private View f13179D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f13180E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f13181F;

    /* renamed from: G, reason: collision with root package name */
    boolean f13182G;

    /* renamed from: H, reason: collision with root package name */
    boolean f13183H;

    /* renamed from: I, reason: collision with root package name */
    boolean f13184I;

    /* renamed from: J, reason: collision with root package name */
    boolean f13185J;

    /* renamed from: K, reason: collision with root package name */
    boolean f13186K;

    /* renamed from: X, reason: collision with root package name */
    private boolean f13187X;

    /* renamed from: Y, reason: collision with root package name */
    private s[] f13188Y;

    /* renamed from: Z, reason: collision with root package name */
    private s f13189Z;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f13190h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f13191i0;

    /* renamed from: j, reason: collision with root package name */
    final Object f13192j;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f13193j0;

    /* renamed from: k, reason: collision with root package name */
    final Context f13194k;

    /* renamed from: k0, reason: collision with root package name */
    boolean f13195k0;

    /* renamed from: l, reason: collision with root package name */
    Window f13196l;

    /* renamed from: l0, reason: collision with root package name */
    private Configuration f13197l0;

    /* renamed from: m, reason: collision with root package name */
    private n f13198m;

    /* renamed from: m0, reason: collision with root package name */
    private int f13199m0;

    /* renamed from: n, reason: collision with root package name */
    final androidx.appcompat.app.e f13200n;

    /* renamed from: n0, reason: collision with root package name */
    private int f13201n0;

    /* renamed from: o, reason: collision with root package name */
    AbstractC1397a f13202o;

    /* renamed from: o0, reason: collision with root package name */
    private int f13203o0;

    /* renamed from: p, reason: collision with root package name */
    MenuInflater f13204p;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f13205p0;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f13206q;

    /* renamed from: q0, reason: collision with root package name */
    private p f13207q0;

    /* renamed from: r, reason: collision with root package name */
    private I f13208r;

    /* renamed from: r0, reason: collision with root package name */
    private p f13209r0;

    /* renamed from: s, reason: collision with root package name */
    private h f13210s;

    /* renamed from: s0, reason: collision with root package name */
    boolean f13211s0;

    /* renamed from: t, reason: collision with root package name */
    private t f13212t;

    /* renamed from: t0, reason: collision with root package name */
    int f13213t0;

    /* renamed from: u, reason: collision with root package name */
    androidx.appcompat.view.b f13214u;

    /* renamed from: u0, reason: collision with root package name */
    private final Runnable f13215u0;

    /* renamed from: v, reason: collision with root package name */
    ActionBarContextView f13216v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f13217v0;

    /* renamed from: w, reason: collision with root package name */
    PopupWindow f13218w;

    /* renamed from: w0, reason: collision with root package name */
    private Rect f13219w0;

    /* renamed from: x, reason: collision with root package name */
    Runnable f13220x;

    /* renamed from: x0, reason: collision with root package name */
    private Rect f13221x0;

    /* renamed from: y, reason: collision with root package name */
    C1504k0 f13222y;

    /* renamed from: y0, reason: collision with root package name */
    private androidx.appcompat.app.t f13223y0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f13224z;

    /* renamed from: z0, reason: collision with root package name */
    private v f13225z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = i.this;
            if ((iVar.f13213t0 & 1) != 0) {
                iVar.l0(0);
            }
            i iVar2 = i.this;
            if ((iVar2.f13213t0 & 4096) != 0) {
                iVar2.l0(108);
            }
            i iVar3 = i.this;
            iVar3.f13211s0 = false;
            iVar3.f13213t0 = 0;
        }
    }

    class b implements androidx.core.view.I {
        b() {
        }

        @Override // androidx.core.view.I
        public K0 p(View view, K0 k02) {
            int l10 = k02.l();
            int h12 = i.this.h1(k02, null);
            if (l10 != h12) {
                k02 = k02.q(k02.j(), h12, k02.k(), k02.i());
            }
            return AbstractC1484a0.c0(view, k02);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            i.this.j0();
        }
    }

    class d implements Runnable {

        class a extends AbstractC1508m0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC1506l0
            public void b(View view) {
                i.this.f13216v.setAlpha(1.0f);
                i.this.f13222y.h(null);
                i.this.f13222y = null;
            }

            @Override // androidx.core.view.AbstractC1508m0, androidx.core.view.InterfaceC1506l0
            public void c(View view) {
                i.this.f13216v.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = i.this;
            iVar.f13218w.showAtLocation(iVar.f13216v, 55, 0, 0);
            i.this.m0();
            if (!i.this.X0()) {
                i.this.f13216v.setAlpha(1.0f);
                i.this.f13216v.setVisibility(0);
            } else {
                i.this.f13216v.setAlpha(0.0f);
                i iVar2 = i.this;
                iVar2.f13222y = AbstractC1484a0.e(iVar2.f13216v).b(1.0f);
                i.this.f13222y.h(new a());
            }
        }
    }

    class e extends AbstractC1508m0 {
        e() {
        }

        @Override // androidx.core.view.InterfaceC1506l0
        public void b(View view) {
            i.this.f13216v.setAlpha(1.0f);
            i.this.f13222y.h(null);
            i.this.f13222y = null;
        }

        @Override // androidx.core.view.AbstractC1508m0, androidx.core.view.InterfaceC1506l0
        public void c(View view) {
            i.this.f13216v.setVisibility(0);
            if (i.this.f13216v.getParent() instanceof View) {
                AbstractC1484a0.n0((View) i.this.f13216v.getParent());
            }
        }
    }

    private class f implements InterfaceC1398b {
        f() {
        }
    }

    interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    private final class h implements j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
            i.this.c0(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback y02 = i.this.y0();
            if (y02 == null) {
                return true;
            }
            y02.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.i$i, reason: collision with other inner class name */
    class C0244i implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f13234a;

        /* renamed from: androidx.appcompat.app.i$i$a */
        class a extends AbstractC1508m0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC1506l0
            public void b(View view) {
                i.this.f13216v.setVisibility(8);
                i iVar = i.this;
                PopupWindow popupWindow = iVar.f13218w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (iVar.f13216v.getParent() instanceof View) {
                    AbstractC1484a0.n0((View) i.this.f13216v.getParent());
                }
                i.this.f13216v.k();
                i.this.f13222y.h(null);
                i iVar2 = i.this;
                iVar2.f13222y = null;
                AbstractC1484a0.n0(iVar2.f13176B);
            }
        }

        public C0244i(b.a aVar) {
            this.f13234a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f13234a.a(bVar);
            i iVar = i.this;
            if (iVar.f13218w != null) {
                iVar.f13196l.getDecorView().removeCallbacks(i.this.f13220x);
            }
            i iVar2 = i.this;
            if (iVar2.f13216v != null) {
                iVar2.m0();
                i iVar3 = i.this;
                iVar3.f13222y = AbstractC1484a0.e(iVar3.f13216v).b(0.0f);
                i.this.f13222y.h(new a());
            }
            i iVar4 = i.this;
            androidx.appcompat.app.e eVar = iVar4.f13200n;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(iVar4.f13214u);
            }
            i iVar5 = i.this;
            iVar5.f13214u = null;
            AbstractC1484a0.n0(iVar5.f13176B);
            i.this.f1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f13234a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            AbstractC1484a0.n0(i.this.f13176B);
            return this.f13234a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f13234a.d(bVar, menuItem);
        }
    }

    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static androidx.core.os.i b(Configuration configuration) {
            return androidx.core.os.i.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(androidx.core.os.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.g()));
        }

        static void d(Configuration configuration, androidx.core.os.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.g()));
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            i10 = configuration.colorMode;
            int i18 = i10 & 3;
            i11 = configuration2.colorMode;
            if (i18 != (i11 & 3)) {
                i16 = configuration3.colorMode;
                i17 = configuration2.colorMode;
                configuration3.colorMode = i16 | (i17 & 3);
            }
            i12 = configuration.colorMode;
            int i19 = i12 & 12;
            i13 = configuration2.colorMode;
            if (i19 != (i13 & 12)) {
                i14 = configuration3.colorMode;
                i15 = configuration2.colorMode;
                configuration3.colorMode = i14 | (i15 & 12);
            }
        }
    }

    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        static OnBackInvokedCallback b(Object obj, final i iVar) {
            Objects.requireNonNull(iVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.q
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    i.this.G0();
                }
            };
            androidx.appcompat.app.m.a(obj).registerOnBackInvokedCallback(HVFrameRecorder.BITRATE, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.m.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.l.a(obj2));
        }
    }

    class n extends androidx.appcompat.view.i {

        /* renamed from: b, reason: collision with root package name */
        private g f13237b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f13238c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f13239d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f13240e;

        n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f13239d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f13239d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f13238c = true;
                callback.onContentChanged();
            } finally {
                this.f13238c = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f13240e = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f13240e = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f13239d ? a().dispatchKeyEvent(keyEvent) : i.this.k0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || i.this.J0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.f13237b = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(i.this.f13194k, callback);
            androidx.appcompat.view.b S10 = i.this.S(aVar);
            if (S10 != null) {
                return aVar.e(S10);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f13238c) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            g gVar = this.f13237b;
            return (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : onCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            i.this.M0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f13240e) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                i.this.N0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.b0(true);
            }
            g gVar = this.f13237b;
            boolean z10 = gVar != null && gVar.a(i10);
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.b0(false);
            }
            return z10;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            s w02 = i.this.w0(0, true);
            if (w02 == null || (eVar = w02.f13259j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (i.this.E0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    private class o extends p {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f13242c;

        o(Context context) {
            super();
            this.f13242c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.i.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.i.p
        public int c() {
            return j.a(this.f13242c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.i.p
        public void d() {
            i.this.f();
        }
    }

    abstract class p {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f13244a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f13244a;
            if (broadcastReceiver != null) {
                try {
                    i.this.f13194k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f13244a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f13244a == null) {
                this.f13244a = new a();
            }
            i.this.f13194k.registerReceiver(this.f13244a, b10);
        }
    }

    private class q extends p {

        /* renamed from: c, reason: collision with root package name */
        private final A f13247c;

        q(A a10) {
            super();
            this.f13247c = a10;
        }

        @Override // androidx.appcompat.app.i.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.i.p
        public int c() {
            return this.f13247c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.i.p
        public void d() {
            i.this.f();
        }
    }

    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return i.this.k0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            i.this.e0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(AbstractC3220a.b(getContext(), i10));
        }
    }

    protected static final class s {

        /* renamed from: a, reason: collision with root package name */
        int f13250a;

        /* renamed from: b, reason: collision with root package name */
        int f13251b;

        /* renamed from: c, reason: collision with root package name */
        int f13252c;

        /* renamed from: d, reason: collision with root package name */
        int f13253d;

        /* renamed from: e, reason: collision with root package name */
        int f13254e;

        /* renamed from: f, reason: collision with root package name */
        int f13255f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f13256g;

        /* renamed from: h, reason: collision with root package name */
        View f13257h;

        /* renamed from: i, reason: collision with root package name */
        View f13258i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f13259j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f13260k;

        /* renamed from: l, reason: collision with root package name */
        Context f13261l;

        /* renamed from: m, reason: collision with root package name */
        boolean f13262m;

        /* renamed from: n, reason: collision with root package name */
        boolean f13263n;

        /* renamed from: o, reason: collision with root package name */
        boolean f13264o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f13265p;

        /* renamed from: q, reason: collision with root package name */
        boolean f13266q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f13267r;

        /* renamed from: s, reason: collision with root package name */
        Bundle f13268s;

        s(int i10) {
            this.f13250a = i10;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f13259j == null) {
                return null;
            }
            if (this.f13260k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f13261l, AbstractC3176g.f33211j);
                this.f13260k = cVar;
                cVar.h(aVar);
                this.f13259j.b(this.f13260k);
            }
            return this.f13260k.b(this.f13256g);
        }

        public boolean b() {
            if (this.f13257h == null) {
                return false;
            }
            return this.f13258i != null || this.f13260k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f13259j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.P(this.f13260k);
            }
            this.f13259j = eVar;
            if (eVar == null || (cVar = this.f13260k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(AbstractC3170a.f33066a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(AbstractC3170a.f33056D, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(AbstractC3178i.f33237b, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f13261l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(AbstractC3179j.f33483y0);
            this.f13251b = obtainStyledAttributes.getResourceId(AbstractC3179j.f33246B0, 0);
            this.f13255f = obtainStyledAttributes.getResourceId(AbstractC3179j.f33241A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private final class t implements j.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e D10 = eVar.D();
            boolean z11 = D10 != eVar;
            i iVar = i.this;
            if (z11) {
                eVar = D10;
            }
            s p02 = iVar.p0(eVar);
            if (p02 != null) {
                if (!z11) {
                    i.this.f0(p02, z10);
                } else {
                    i.this.b0(p02.f13250a, p02, D10);
                    i.this.f0(p02, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback y02;
            if (eVar != eVar.D()) {
                return true;
            }
            i iVar = i.this;
            if (!iVar.f13182G || (y02 = iVar.y0()) == null || i.this.f13195k0) {
                return true;
            }
            y02.onMenuOpened(108, eVar);
            return true;
        }
    }

    i(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    private boolean A0(s sVar) {
        View view = sVar.f13258i;
        if (view != null) {
            sVar.f13257h = view;
            return true;
        }
        if (sVar.f13259j == null) {
            return false;
        }
        if (this.f13212t == null) {
            this.f13212t = new t();
        }
        View view2 = (View) sVar.a(this.f13212t);
        sVar.f13257h = view2;
        return view2 != null;
    }

    private boolean B0(s sVar) {
        sVar.d(r0());
        sVar.f13256g = new r(sVar.f13261l);
        sVar.f13252c = 81;
        return true;
    }

    private boolean C0(s sVar) {
        Resources.Theme theme;
        Context context = this.f13194k;
        int i10 = sVar.f13250a;
        if ((i10 == 0 || i10 == 108) && this.f13208r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(AbstractC3170a.f33069d, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(AbstractC3170a.f33070e, typedValue, true);
            } else {
                theme2.resolveAttribute(AbstractC3170a.f33070e, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.S(this);
        sVar.c(eVar);
        return true;
    }

    private void D0(int i10) {
        this.f13213t0 = (1 << i10) | this.f13213t0;
        if (this.f13211s0) {
            return;
        }
        AbstractC1484a0.i0(this.f13196l.getDecorView(), this.f13215u0);
        this.f13211s0 = true;
    }

    private boolean I0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s w02 = w0(i10, true);
        if (w02.f13264o) {
            return false;
        }
        return S0(w02, keyEvent);
    }

    private boolean L0(int i10, KeyEvent keyEvent) {
        boolean z10;
        I i11;
        if (this.f13214u != null) {
            return false;
        }
        boolean z11 = true;
        s w02 = w0(i10, true);
        if (i10 != 0 || (i11 = this.f13208r) == null || !i11.d() || ViewConfiguration.get(this.f13194k).hasPermanentMenuKey()) {
            boolean z12 = w02.f13264o;
            if (z12 || w02.f13263n) {
                f0(w02, true);
                z11 = z12;
            } else {
                if (w02.f13262m) {
                    if (w02.f13267r) {
                        w02.f13262m = false;
                        z10 = S0(w02, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        P0(w02, keyEvent);
                    }
                }
                z11 = false;
            }
        } else if (this.f13208r.b()) {
            z11 = this.f13208r.f();
        } else {
            if (!this.f13195k0 && S0(w02, keyEvent)) {
                z11 = this.f13208r.g();
            }
            z11 = false;
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f13194k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void P0(s sVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (sVar.f13264o || this.f13195k0) {
            return;
        }
        if (sVar.f13250a == 0 && (this.f13194k.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback y02 = y0();
        if (y02 != null && !y02.onMenuOpened(sVar.f13250a, sVar.f13259j)) {
            f0(sVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f13194k.getSystemService("window");
        if (windowManager == null || !S0(sVar, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = sVar.f13256g;
        if (viewGroup == null || sVar.f13266q) {
            if (viewGroup == null) {
                if (!B0(sVar) || sVar.f13256g == null) {
                    return;
                }
            } else if (sVar.f13266q && viewGroup.getChildCount() > 0) {
                sVar.f13256g.removeAllViews();
            }
            if (!A0(sVar) || !sVar.b()) {
                sVar.f13266q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = sVar.f13257h.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            }
            sVar.f13256g.setBackgroundResource(sVar.f13251b);
            ViewParent parent = sVar.f13257h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(sVar.f13257h);
            }
            sVar.f13256g.addView(sVar.f13257h, layoutParams2);
            if (!sVar.f13257h.hasFocus()) {
                sVar.f13257h.requestFocus();
            }
        } else {
            View view = sVar.f13258i;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i10 = -1;
                sVar.f13263n = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, sVar.f13253d, sVar.f13254e, 1002, 8519680, -3);
                layoutParams3.gravity = sVar.f13252c;
                layoutParams3.windowAnimations = sVar.f13255f;
                windowManager.addView(sVar.f13256g, layoutParams3);
                sVar.f13264o = true;
                if (sVar.f13250a != 0) {
                    f1();
                    return;
                }
                return;
            }
        }
        i10 = -2;
        sVar.f13263n = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, sVar.f13253d, sVar.f13254e, 1002, 8519680, -3);
        layoutParams32.gravity = sVar.f13252c;
        layoutParams32.windowAnimations = sVar.f13255f;
        windowManager.addView(sVar.f13256g, layoutParams32);
        sVar.f13264o = true;
        if (sVar.f13250a != 0) {
        }
    }

    private boolean R0(s sVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f13262m || S0(sVar, keyEvent)) && (eVar = sVar.f13259j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f13208r == null) {
            f0(sVar, true);
        }
        return z10;
    }

    private boolean S0(s sVar, KeyEvent keyEvent) {
        I i10;
        I i11;
        I i12;
        if (this.f13195k0) {
            return false;
        }
        if (sVar.f13262m) {
            return true;
        }
        s sVar2 = this.f13189Z;
        if (sVar2 != null && sVar2 != sVar) {
            f0(sVar2, false);
        }
        Window.Callback y02 = y0();
        if (y02 != null) {
            sVar.f13258i = y02.onCreatePanelView(sVar.f13250a);
        }
        int i13 = sVar.f13250a;
        boolean z10 = i13 == 0 || i13 == 108;
        if (z10 && (i12 = this.f13208r) != null) {
            i12.c();
        }
        if (sVar.f13258i == null && (!z10 || !(Q0() instanceof y))) {
            androidx.appcompat.view.menu.e eVar = sVar.f13259j;
            if (eVar == null || sVar.f13267r) {
                if (eVar == null && (!C0(sVar) || sVar.f13259j == null)) {
                    return false;
                }
                if (z10 && this.f13208r != null) {
                    if (this.f13210s == null) {
                        this.f13210s = new h();
                    }
                    this.f13208r.a(sVar.f13259j, this.f13210s);
                }
                sVar.f13259j.e0();
                if (!y02.onCreatePanelMenu(sVar.f13250a, sVar.f13259j)) {
                    sVar.c(null);
                    if (z10 && (i10 = this.f13208r) != null) {
                        i10.a(null, this.f13210s);
                    }
                    return false;
                }
                sVar.f13267r = false;
            }
            sVar.f13259j.e0();
            Bundle bundle = sVar.f13268s;
            if (bundle != null) {
                sVar.f13259j.Q(bundle);
                sVar.f13268s = null;
            }
            if (!y02.onPreparePanel(0, sVar.f13258i, sVar.f13259j)) {
                if (z10 && (i11 = this.f13208r) != null) {
                    i11.a(null, this.f13210s);
                }
                sVar.f13259j.d0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f13265p = z11;
            sVar.f13259j.setQwertyMode(z11);
            sVar.f13259j.d0();
        }
        sVar.f13262m = true;
        sVar.f13263n = false;
        this.f13189Z = sVar;
        return true;
    }

    private void T0(boolean z10) {
        I i10 = this.f13208r;
        if (i10 == null || !i10.d() || (ViewConfiguration.get(this.f13194k).hasPermanentMenuKey() && !this.f13208r.e())) {
            s w02 = w0(0, true);
            w02.f13266q = true;
            f0(w02, false);
            P0(w02, null);
            return;
        }
        Window.Callback y02 = y0();
        if (this.f13208r.b() && z10) {
            this.f13208r.f();
            if (this.f13195k0) {
                return;
            }
            y02.onPanelClosed(108, w0(0, true).f13259j);
            return;
        }
        if (y02 == null || this.f13195k0) {
            return;
        }
        if (this.f13211s0 && (this.f13213t0 & 1) != 0) {
            this.f13196l.getDecorView().removeCallbacks(this.f13215u0);
            this.f13215u0.run();
        }
        s w03 = w0(0, true);
        androidx.appcompat.view.menu.e eVar = w03.f13259j;
        if (eVar == null || w03.f13267r || !y02.onPreparePanel(0, w03.f13258i, eVar)) {
            return;
        }
        y02.onMenuOpened(108, w03.f13259j);
        this.f13208r.g();
    }

    private int U0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean V(boolean z10) {
        return W(z10, true);
    }

    private boolean W(boolean z10, boolean z11) {
        if (this.f13195k0) {
            return false;
        }
        int a02 = a0();
        int F02 = F0(this.f13194k, a02);
        androidx.core.os.i Z10 = Build.VERSION.SDK_INT < 33 ? Z(this.f13194k) : null;
        if (!z11 && Z10 != null) {
            Z10 = v0(this.f13194k.getResources().getConfiguration());
        }
        boolean e12 = e1(F02, Z10, z10);
        if (a02 == 0) {
            u0(this.f13194k).e();
        } else {
            p pVar = this.f13207q0;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (a02 == 3) {
            t0(this.f13194k).e();
        } else {
            p pVar2 = this.f13209r0;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return e12;
    }

    private void X() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f13176B.findViewById(R.id.content);
        View decorView = this.f13196l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f13194k.obtainStyledAttributes(AbstractC3179j.f33483y0);
        obtainStyledAttributes.getValue(AbstractC3179j.f33291K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(AbstractC3179j.f33296L0, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(AbstractC3179j.f33281I0)) {
            obtainStyledAttributes.getValue(AbstractC3179j.f33281I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(AbstractC3179j.f33286J0)) {
            obtainStyledAttributes.getValue(AbstractC3179j.f33286J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(AbstractC3179j.f33271G0)) {
            obtainStyledAttributes.getValue(AbstractC3179j.f33271G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(AbstractC3179j.f33276H0)) {
            obtainStyledAttributes.getValue(AbstractC3179j.f33276H0, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void Y(Window window) {
        if (this.f13196l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f13198m = nVar;
        window.setCallback(nVar);
        h0 u10 = h0.u(this.f13194k, null, f13172E0);
        Drawable h10 = u10.h(0);
        if (h10 != null) {
            window.setBackgroundDrawable(h10);
        }
        u10.x();
        this.f13196l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f13175A0 != null) {
            return;
        }
        O(null);
    }

    private boolean Y0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f13196l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int a0() {
        int i10 = this.f13199m0;
        return i10 != -100 ? i10 : androidx.appcompat.app.g.o();
    }

    private void b1() {
        if (this.f13174A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private androidx.appcompat.app.d c1() {
        for (Context context = this.f13194k; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void d0() {
        p pVar = this.f13207q0;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.f13209r0;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d1(Configuration configuration) {
        Activity activity = (Activity) this.f13192j;
        if (activity instanceof InterfaceC1599p) {
            if (((InterfaceC1599p) activity).getLifecycle().b().isAtLeast(AbstractC1592i.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f13193j0 || this.f13195k0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean e1(int i10, androidx.core.os.i iVar, boolean z10) {
        boolean z11;
        Configuration g02 = g0(this.f13194k, i10, iVar, null, false);
        int s02 = s0(this.f13194k);
        Configuration configuration = this.f13197l0;
        if (configuration == null) {
            configuration = this.f13194k.getResources().getConfiguration();
        }
        int i11 = configuration.uiMode & 48;
        int i12 = g02.uiMode & 48;
        androidx.core.os.i v02 = v0(configuration);
        androidx.core.os.i v03 = iVar == null ? null : v0(g02);
        int i13 = i11 != i12 ? 512 : 0;
        if (v03 != null && !v02.equals(v03)) {
            i13 |= 8196;
        }
        boolean z12 = true;
        if (((~s02) & i13) != 0 && z10 && this.f13191i0 && (f13173F0 || this.f13193j0)) {
            Object obj = this.f13192j;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                if (Build.VERSION.SDK_INT >= 31 && (i13 & 8192) != 0) {
                    ((Activity) this.f13192j).getWindow().getDecorView().setLayoutDirection(g02.getLayoutDirection());
                }
                AbstractC1480b.u((Activity) this.f13192j);
                z11 = true;
                if (!z11 || i13 == 0) {
                    z12 = z11;
                } else {
                    g1(i12, v03, (i13 & s02) == i13, null);
                }
                if (z12) {
                    Object obj2 = this.f13192j;
                    if (obj2 instanceof androidx.appcompat.app.d) {
                        if ((i13 & 512) != 0) {
                            ((androidx.appcompat.app.d) obj2).onNightModeChanged(i10);
                        }
                        if ((i13 & 4) != 0) {
                            ((androidx.appcompat.app.d) this.f13192j).onLocalesChanged(iVar);
                        }
                    }
                }
                if (v03 != null) {
                    W0(v0(this.f13194k.getResources().getConfiguration()));
                }
                return z12;
            }
        }
        z11 = false;
        if (z11) {
        }
        z12 = z11;
        if (z12) {
        }
        if (v03 != null) {
        }
        return z12;
    }

    private Configuration g0(Context context, int i10, androidx.core.os.i iVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            V0(configuration2, iVar);
        }
        return configuration2;
    }

    private void g1(int i10, androidx.core.os.i iVar, boolean z10, Configuration configuration) {
        Resources resources = this.f13194k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            V0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            x.a(resources);
        }
        int i11 = this.f13201n0;
        if (i11 != 0) {
            this.f13194k.setTheme(i11);
            this.f13194k.getTheme().applyStyle(this.f13201n0, true);
        }
        if (z10 && (this.f13192j instanceof Activity)) {
            d1(configuration2);
        }
    }

    private ViewGroup h0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f13194k.obtainStyledAttributes(AbstractC3179j.f33483y0);
        if (!obtainStyledAttributes.hasValue(AbstractC3179j.f33256D0)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(AbstractC3179j.f33301M0, false)) {
            J(1);
        } else if (obtainStyledAttributes.getBoolean(AbstractC3179j.f33256D0, false)) {
            J(108);
        }
        if (obtainStyledAttributes.getBoolean(AbstractC3179j.f33261E0, false)) {
            J(109);
        }
        if (obtainStyledAttributes.getBoolean(AbstractC3179j.f33266F0, false)) {
            J(10);
        }
        this.f13185J = obtainStyledAttributes.getBoolean(AbstractC3179j.f33488z0, false);
        obtainStyledAttributes.recycle();
        o0();
        this.f13196l.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f13194k);
        if (this.f13186K) {
            viewGroup = this.f13184I ? (ViewGroup) from.inflate(AbstractC3176g.f33216o, (ViewGroup) null) : (ViewGroup) from.inflate(AbstractC3176g.f33215n, (ViewGroup) null);
        } else if (this.f13185J) {
            viewGroup = (ViewGroup) from.inflate(AbstractC3176g.f33207f, (ViewGroup) null);
            this.f13183H = false;
            this.f13182G = false;
        } else if (this.f13182G) {
            TypedValue typedValue = new TypedValue();
            this.f13194k.getTheme().resolveAttribute(AbstractC3170a.f33069d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f13194k, typedValue.resourceId) : this.f13194k).inflate(AbstractC3176g.f33217p, (ViewGroup) null);
            I i10 = (I) viewGroup.findViewById(AbstractC3175f.f33192q);
            this.f13208r = i10;
            i10.setWindowCallback(y0());
            if (this.f13183H) {
                this.f13208r.h(109);
            }
            if (this.f13180E) {
                this.f13208r.h(2);
            }
            if (this.f13181F) {
                this.f13208r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f13182G + ", windowActionBarOverlay: " + this.f13183H + ", android:windowIsFloating: " + this.f13185J + ", windowActionModeOverlay: " + this.f13184I + ", windowNoTitle: " + this.f13186K + " }");
        }
        AbstractC1484a0.F0(viewGroup, new b());
        if (this.f13208r == null) {
            this.f13178C = (TextView) viewGroup.findViewById(AbstractC3175f.f33172N);
        }
        s0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(AbstractC3175f.f33177b);
        ViewGroup viewGroup2 = (ViewGroup) this.f13196l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f13196l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void i1(View view) {
        view.setBackgroundColor((AbstractC1484a0.M(view) & 8192) != 0 ? androidx.core.content.a.c(this.f13194k, AbstractC3172c.f33094b) : androidx.core.content.a.c(this.f13194k, AbstractC3172c.f33093a));
    }

    private void n0() {
        if (this.f13174A) {
            return;
        }
        this.f13176B = h0();
        CharSequence x02 = x0();
        if (!TextUtils.isEmpty(x02)) {
            I i10 = this.f13208r;
            if (i10 != null) {
                i10.setWindowTitle(x02);
            } else if (Q0() != null) {
                Q0().w(x02);
            } else {
                TextView textView = this.f13178C;
                if (textView != null) {
                    textView.setText(x02);
                }
            }
        }
        X();
        O0(this.f13176B);
        this.f13174A = true;
        s w02 = w0(0, false);
        if (this.f13195k0) {
            return;
        }
        if (w02 == null || w02.f13259j == null) {
            D0(108);
        }
    }

    private void o0() {
        if (this.f13196l == null) {
            Object obj = this.f13192j;
            if (obj instanceof Activity) {
                Y(((Activity) obj).getWindow());
            }
        }
        if (this.f13196l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration q0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            k.a(configuration, configuration2, configuration3);
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            int i45 = configuration.densityDpi;
            int i46 = configuration2.densityDpi;
            if (i45 != i46) {
                configuration3.densityDpi = i46;
            }
        }
        return configuration3;
    }

    private int s0(Context context) {
        if (!this.f13205p0 && (this.f13192j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f13192j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f13203o0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f13203o0 = 0;
            }
        }
        this.f13205p0 = true;
        return this.f13203o0;
    }

    private p t0(Context context) {
        if (this.f13209r0 == null) {
            this.f13209r0 = new o(context);
        }
        return this.f13209r0;
    }

    private p u0(Context context) {
        if (this.f13207q0 == null) {
            this.f13207q0 = new q(A.a(context));
        }
        return this.f13207q0;
    }

    private void z0() {
        n0();
        if (this.f13182G && this.f13202o == null) {
            Object obj = this.f13192j;
            if (obj instanceof Activity) {
                this.f13202o = new B((Activity) this.f13192j, this.f13183H);
            } else if (obj instanceof Dialog) {
                this.f13202o = new B((Dialog) this.f13192j);
            }
            AbstractC1397a abstractC1397a = this.f13202o;
            if (abstractC1397a != null) {
                abstractC1397a.r(this.f13217v0);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void A(Bundle bundle) {
        String str;
        this.f13191i0 = true;
        V(false);
        o0();
        Object obj = this.f13192j;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.q.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC1397a Q02 = Q0();
                if (Q02 == null) {
                    this.f13217v0 = true;
                } else {
                    Q02.r(true);
                }
            }
            androidx.appcompat.app.g.d(this);
        }
        this.f13197l0 = new Configuration(this.f13194k.getResources().getConfiguration());
        this.f13193j0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B() {
        AbstractC1397a abstractC1397a;
        if (this.f13192j instanceof Activity) {
            androidx.appcompat.app.g.H(this);
        }
        if (this.f13211s0) {
            this.f13196l.getDecorView().removeCallbacks(this.f13215u0);
        }
        this.f13195k0 = true;
        if (this.f13199m0 != -100) {
            Object obj = this.f13192j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f13170C0.put(this.f13192j.getClass().getName(), Integer.valueOf(this.f13199m0));
                abstractC1397a = this.f13202o;
                if (abstractC1397a != null) {
                    abstractC1397a.n();
                }
                d0();
            }
        }
        f13170C0.remove(this.f13192j.getClass().getName());
        abstractC1397a = this.f13202o;
        if (abstractC1397a != null) {
        }
        d0();
    }

    @Override // androidx.appcompat.app.g
    public void C(Bundle bundle) {
        n0();
    }

    @Override // androidx.appcompat.app.g
    public void D() {
        AbstractC1397a u10 = u();
        if (u10 != null) {
            u10.u(true);
        }
    }

    @Override // androidx.appcompat.app.g
    public void E(Bundle bundle) {
    }

    public boolean E0() {
        return this.f13224z;
    }

    @Override // androidx.appcompat.app.g
    public void F() {
        W(true, false);
    }

    int F0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return u0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return t0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    @Override // androidx.appcompat.app.g
    public void G() {
        AbstractC1397a u10 = u();
        if (u10 != null) {
            u10.u(false);
        }
    }

    boolean G0() {
        boolean z10 = this.f13190h0;
        this.f13190h0 = false;
        s w02 = w0(0, false);
        if (w02 != null && w02.f13264o) {
            if (!z10) {
                f0(w02, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f13214u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        AbstractC1397a u10 = u();
        return u10 != null && u10.h();
    }

    boolean H0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f13190h0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            I0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public boolean J(int i10) {
        int U02 = U0(i10);
        if (this.f13186K && U02 == 108) {
            return false;
        }
        if (this.f13182G && U02 == 1) {
            this.f13182G = false;
        }
        if (U02 == 1) {
            b1();
            this.f13186K = true;
            return true;
        }
        if (U02 == 2) {
            b1();
            this.f13180E = true;
            return true;
        }
        if (U02 == 5) {
            b1();
            this.f13181F = true;
            return true;
        }
        if (U02 == 10) {
            b1();
            this.f13184I = true;
            return true;
        }
        if (U02 == 108) {
            b1();
            this.f13182G = true;
            return true;
        }
        if (U02 != 109) {
            return this.f13196l.requestFeature(U02);
        }
        b1();
        this.f13183H = true;
        return true;
    }

    boolean J0(int i10, KeyEvent keyEvent) {
        AbstractC1397a u10 = u();
        if (u10 != null && u10.o(i10, keyEvent)) {
            return true;
        }
        s sVar = this.f13189Z;
        if (sVar != null && R0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            s sVar2 = this.f13189Z;
            if (sVar2 != null) {
                sVar2.f13263n = true;
            }
            return true;
        }
        if (this.f13189Z == null) {
            s w02 = w0(0, true);
            S0(w02, keyEvent);
            boolean R02 = R0(w02, keyEvent.getKeyCode(), keyEvent, 1);
            w02.f13262m = false;
            if (R02) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void K(int i10) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.f13176B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f13194k).inflate(i10, viewGroup);
        this.f13198m.c(this.f13196l.getCallback());
    }

    boolean K0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                L0(0, keyEvent);
                return true;
            }
        } else if (G0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void L(View view) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.f13176B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f13198m.c(this.f13196l.getCallback());
    }

    @Override // androidx.appcompat.app.g
    public void M(View view, ViewGroup.LayoutParams layoutParams) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.f13176B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f13198m.c(this.f13196l.getCallback());
    }

    void M0(int i10) {
        AbstractC1397a u10;
        if (i10 != 108 || (u10 = u()) == null) {
            return;
        }
        u10.i(true);
    }

    void N0(int i10) {
        if (i10 == 108) {
            AbstractC1397a u10 = u();
            if (u10 != null) {
                u10.i(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            s w02 = w0(i10, true);
            if (w02.f13264o) {
                f0(w02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.O(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f13175A0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f13177B0) != null) {
            m.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f13177B0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f13192j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f13175A0 = m.a((Activity) this.f13192j);
                f1();
            }
        }
        this.f13175A0 = onBackInvokedDispatcher;
        f1();
    }

    void O0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.g
    public void P(Toolbar toolbar) {
        if (this.f13192j instanceof Activity) {
            AbstractC1397a u10 = u();
            if (u10 instanceof B) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f13204p = null;
            if (u10 != null) {
                u10.n();
            }
            this.f13202o = null;
            if (toolbar != null) {
                y yVar = new y(toolbar, x0(), this.f13198m);
                this.f13202o = yVar;
                this.f13198m.e(yVar.f13297c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f13198m.e(null);
            }
            w();
        }
    }

    @Override // androidx.appcompat.app.g
    public void Q(int i10) {
        this.f13201n0 = i10;
    }

    final AbstractC1397a Q0() {
        return this.f13202o;
    }

    @Override // androidx.appcompat.app.g
    public final void R(CharSequence charSequence) {
        this.f13206q = charSequence;
        I i10 = this.f13208r;
        if (i10 != null) {
            i10.setWindowTitle(charSequence);
            return;
        }
        if (Q0() != null) {
            Q0().w(charSequence);
            return;
        }
        TextView textView = this.f13178C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.view.b S(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f13214u;
        if (bVar != null) {
            bVar.c();
        }
        C0244i c0244i = new C0244i(aVar);
        AbstractC1397a u10 = u();
        if (u10 != null) {
            androidx.appcompat.view.b x10 = u10.x(c0244i);
            this.f13214u = x10;
            if (x10 != null && (eVar = this.f13200n) != null) {
                eVar.onSupportActionModeStarted(x10);
            }
        }
        if (this.f13214u == null) {
            this.f13214u = a1(c0244i);
        }
        f1();
        return this.f13214u;
    }

    void V0(Configuration configuration, androidx.core.os.i iVar) {
        k.d(configuration, iVar);
    }

    void W0(androidx.core.os.i iVar) {
        k.c(iVar);
    }

    final boolean X0() {
        ViewGroup viewGroup;
        return this.f13174A && (viewGroup = this.f13176B) != null && viewGroup.isLaidOut();
    }

    androidx.core.os.i Z(Context context) {
        androidx.core.os.i t10;
        if (Build.VERSION.SDK_INT >= 33 || (t10 = androidx.appcompat.app.g.t()) == null) {
            return null;
        }
        androidx.core.os.i v02 = v0(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.i b10 = w.b(t10, v02);
        return b10.e() ? v02 : b10;
    }

    boolean Z0() {
        if (this.f13175A0 == null) {
            return false;
        }
        s w02 = w0(0, false);
        return (w02 != null && w02.f13264o) || this.f13214u != null;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s p02;
        Window.Callback y02 = y0();
        if (y02 == null || this.f13195k0 || (p02 = p0(eVar.D())) == null) {
            return false;
        }
        return y02.onMenuItemSelected(p02.f13250a, menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    androidx.appcompat.view.b a1(b.a aVar) {
        androidx.appcompat.view.b bVar;
        Context context;
        androidx.appcompat.view.b bVar2;
        androidx.appcompat.app.e eVar;
        m0();
        androidx.appcompat.view.b bVar3 = this.f13214u;
        if (bVar3 != null) {
            bVar3.c();
        }
        if (!(aVar instanceof C0244i)) {
            aVar = new C0244i(aVar);
        }
        androidx.appcompat.app.e eVar2 = this.f13200n;
        if (eVar2 != null && !this.f13195k0) {
            try {
                bVar = eVar2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
            }
            if (bVar == null) {
                this.f13214u = bVar;
            } else {
                if (this.f13216v == null) {
                    if (this.f13185J) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.f13194k.getTheme();
                        theme.resolveAttribute(AbstractC3170a.f33069d, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.f13194k.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new androidx.appcompat.view.d(this.f13194k, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = this.f13194k;
                        }
                        this.f13216v = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, AbstractC3170a.f33071f);
                        this.f13218w = popupWindow;
                        androidx.core.widget.j.b(popupWindow, 2);
                        this.f13218w.setContentView(this.f13216v);
                        this.f13218w.setWidth(-1);
                        context.getTheme().resolveAttribute(AbstractC3170a.f33067b, typedValue, true);
                        this.f13216v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f13218w.setHeight(-2);
                        this.f13220x = new d();
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f13176B.findViewById(AbstractC3175f.f33184i);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(r0()));
                            this.f13216v = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.f13216v != null) {
                    m0();
                    this.f13216v.k();
                    androidx.appcompat.view.e eVar3 = new androidx.appcompat.view.e(this.f13216v.getContext(), this.f13216v, aVar, this.f13218w == null);
                    if (aVar.b(eVar3, eVar3.e())) {
                        eVar3.k();
                        this.f13216v.h(eVar3);
                        this.f13214u = eVar3;
                        if (X0()) {
                            this.f13216v.setAlpha(0.0f);
                            C1504k0 b10 = AbstractC1484a0.e(this.f13216v).b(1.0f);
                            this.f13222y = b10;
                            b10.h(new e());
                        } else {
                            this.f13216v.setAlpha(1.0f);
                            this.f13216v.setVisibility(0);
                            if (this.f13216v.getParent() instanceof View) {
                                AbstractC1484a0.n0((View) this.f13216v.getParent());
                            }
                        }
                        if (this.f13218w != null) {
                            this.f13196l.getDecorView().post(this.f13220x);
                        }
                    } else {
                        this.f13214u = null;
                    }
                }
            }
            bVar2 = this.f13214u;
            if (bVar2 != null && (eVar = this.f13200n) != null) {
                eVar.onSupportActionModeStarted(bVar2);
            }
            f1();
            return this.f13214u;
        }
        bVar = null;
        if (bVar == null) {
        }
        bVar2 = this.f13214u;
        if (bVar2 != null) {
            eVar.onSupportActionModeStarted(bVar2);
        }
        f1();
        return this.f13214u;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        T0(true);
    }

    void b0(int i10, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i10 >= 0) {
                s[] sVarArr = this.f13188Y;
                if (i10 < sVarArr.length) {
                    sVar = sVarArr[i10];
                }
            }
            if (sVar != null) {
                menu = sVar.f13259j;
            }
        }
        if ((sVar == null || sVar.f13264o) && !this.f13195k0) {
            this.f13198m.d(this.f13196l.getCallback(), i10, menu);
        }
    }

    void c0(androidx.appcompat.view.menu.e eVar) {
        if (this.f13187X) {
            return;
        }
        this.f13187X = true;
        this.f13208r.i();
        Window.Callback y02 = y0();
        if (y02 != null && !this.f13195k0) {
            y02.onPanelClosed(108, eVar);
        }
        this.f13187X = false;
    }

    @Override // androidx.appcompat.app.g
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        n0();
        ((ViewGroup) this.f13176B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f13198m.c(this.f13196l.getCallback());
    }

    void e0(int i10) {
        f0(w0(i10, true), true);
    }

    @Override // androidx.appcompat.app.g
    public boolean f() {
        return V(true);
    }

    void f0(s sVar, boolean z10) {
        ViewGroup viewGroup;
        I i10;
        if (z10 && sVar.f13250a == 0 && (i10 = this.f13208r) != null && i10.b()) {
            c0(sVar.f13259j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f13194k.getSystemService("window");
        if (windowManager != null && sVar.f13264o && (viewGroup = sVar.f13256g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                b0(sVar.f13250a, sVar, null);
            }
        }
        sVar.f13262m = false;
        sVar.f13263n = false;
        sVar.f13264o = false;
        sVar.f13257h = null;
        sVar.f13266q = true;
        if (this.f13189Z == sVar) {
            this.f13189Z = null;
        }
        if (sVar.f13250a == 0) {
            f1();
        }
    }

    void f1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean Z02 = Z0();
            if (Z02 && this.f13177B0 == null) {
                this.f13177B0 = m.b(this.f13175A0, this);
            } else {
                if (Z02 || (onBackInvokedCallback = this.f13177B0) == null) {
                    return;
                }
                m.c(this.f13175A0, onBackInvokedCallback);
                this.f13177B0 = null;
            }
        }
    }

    final int h1(K0 k02, Rect rect) {
        boolean z10;
        boolean z11;
        int l10 = k02 != null ? k02.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f13216v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13216v.getLayoutParams();
            if (this.f13216v.isShown()) {
                if (this.f13219w0 == null) {
                    this.f13219w0 = new Rect();
                    this.f13221x0 = new Rect();
                }
                Rect rect2 = this.f13219w0;
                Rect rect3 = this.f13221x0;
                if (k02 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(k02.j(), k02.l(), k02.k(), k02.i());
                }
                s0.a(this.f13176B, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                K0 H10 = AbstractC1484a0.H(this.f13176B);
                int j10 = H10 == null ? 0 : H10.j();
                int k10 = H10 == null ? 0 : H10.k();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.f13179D != null) {
                    View view = this.f13179D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != j10 || marginLayoutParams2.rightMargin != k10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = j10;
                            marginLayoutParams2.rightMargin = k10;
                            this.f13179D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f13194k);
                    this.f13179D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = j10;
                    layoutParams.rightMargin = k10;
                    this.f13176B.addView(this.f13179D, -1, layoutParams);
                }
                View view3 = this.f13179D;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    i1(this.f13179D);
                }
                if (!this.f13184I && r5) {
                    l10 = 0;
                }
                z10 = r5;
                r5 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r5 = false;
            }
            if (r5) {
                this.f13216v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f13179D;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return l10;
    }

    @Override // androidx.appcompat.app.g
    public Context i(Context context) {
        this.f13191i0 = true;
        int F02 = F0(context, a0());
        if (androidx.appcompat.app.g.x(context)) {
            androidx.appcompat.app.g.U(context);
        }
        androidx.core.os.i Z10 = Z(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(g0(context, F02, Z10, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(g0(context, F02, Z10, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f13173F0) {
            return super.i(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration g02 = g0(context, F02, Z10, !configuration2.equals(configuration3) ? q0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, AbstractC3178i.f33238c);
        dVar.a(g02);
        try {
            if (context.getTheme() != null) {
                f.C0265f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View i0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f13223y0 == null) {
            TypedArray obtainStyledAttributes = this.f13194k.obtainStyledAttributes(AbstractC3179j.f33483y0);
            String string = obtainStyledAttributes.getString(AbstractC3179j.f33251C0);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f13223y0 = new androidx.appcompat.app.t();
            } else {
                try {
                    this.f13223y0 = (androidx.appcompat.app.t) this.f13194k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f13223y0 = new androidx.appcompat.app.t();
                }
            }
        }
        boolean z11 = f13171D0;
        boolean z12 = false;
        if (z11) {
            if (this.f13225z0 == null) {
                this.f13225z0 = new v();
            }
            if (this.f13225z0.a(attributeSet)) {
                z10 = true;
                return this.f13223y0.r(view, str, context, attributeSet, z10, z11, true, r0.c());
            }
            if (!(attributeSet instanceof XmlPullParser)) {
                z12 = Y0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z12 = true;
            }
        }
        z10 = z12;
        return this.f13223y0.r(view, str, context, attributeSet, z10, z11, true, r0.c());
    }

    void j0() {
        androidx.appcompat.view.menu.e eVar;
        I i10 = this.f13208r;
        if (i10 != null) {
            i10.i();
        }
        if (this.f13218w != null) {
            this.f13196l.getDecorView().removeCallbacks(this.f13220x);
            if (this.f13218w.isShowing()) {
                try {
                    this.f13218w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f13218w = null;
        }
        m0();
        s w02 = w0(0, false);
        if (w02 == null || (eVar = w02.f13259j) == null) {
            return;
        }
        eVar.close();
    }

    boolean k0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f13192j;
        if (((obj instanceof AbstractC1520t.a) || (obj instanceof androidx.appcompat.app.s)) && (decorView = this.f13196l.getDecorView()) != null && AbstractC1520t.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f13198m.b(this.f13196l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? H0(keyCode, keyEvent) : K0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.g
    public View l(int i10) {
        n0();
        return this.f13196l.findViewById(i10);
    }

    void l0(int i10) {
        s w02;
        s w03 = w0(i10, true);
        if (w03.f13259j != null) {
            Bundle bundle = new Bundle();
            w03.f13259j.R(bundle);
            if (bundle.size() > 0) {
                w03.f13268s = bundle;
            }
            w03.f13259j.e0();
            w03.f13259j.clear();
        }
        w03.f13267r = true;
        w03.f13266q = true;
        if ((i10 != 108 && i10 != 0) || this.f13208r == null || (w02 = w0(0, false)) == null) {
            return;
        }
        w02.f13262m = false;
        S0(w02, null);
    }

    void m0() {
        C1504k0 c1504k0 = this.f13222y;
        if (c1504k0 != null) {
            c1504k0.c();
        }
    }

    @Override // androidx.appcompat.app.g
    public Context n() {
        return this.f13194k;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return i0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.g
    public final InterfaceC1398b p() {
        return new f();
    }

    s p0(Menu menu) {
        s[] sVarArr = this.f13188Y;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            s sVar = sVarArr[i10];
            if (sVar != null && sVar.f13259j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.g
    public int q() {
        return this.f13199m0;
    }

    final Context r0() {
        AbstractC1397a u10 = u();
        Context k10 = u10 != null ? u10.k() : null;
        return k10 == null ? this.f13194k : k10;
    }

    @Override // androidx.appcompat.app.g
    public MenuInflater s() {
        if (this.f13204p == null) {
            z0();
            AbstractC1397a abstractC1397a = this.f13202o;
            this.f13204p = new androidx.appcompat.view.g(abstractC1397a != null ? abstractC1397a.k() : this.f13194k);
        }
        return this.f13204p;
    }

    @Override // androidx.appcompat.app.g
    public AbstractC1397a u() {
        z0();
        return this.f13202o;
    }

    @Override // androidx.appcompat.app.g
    public void v() {
        LayoutInflater from = LayoutInflater.from(this.f13194k);
        if (from.getFactory() == null) {
            AbstractC1522u.a(from, this);
        } else {
            if (from.getFactory2() instanceof i) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    androidx.core.os.i v0(Configuration configuration) {
        return k.b(configuration);
    }

    @Override // androidx.appcompat.app.g
    public void w() {
        if (Q0() == null || u().l()) {
            return;
        }
        D0(0);
    }

    protected s w0(int i10, boolean z10) {
        s[] sVarArr = this.f13188Y;
        if (sVarArr == null || sVarArr.length <= i10) {
            s[] sVarArr2 = new s[i10 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.f13188Y = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i10];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i10);
        sVarArr[i10] = sVar2;
        return sVar2;
    }

    final CharSequence x0() {
        Object obj = this.f13192j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f13206q;
    }

    final Window.Callback y0() {
        return this.f13196l.getCallback();
    }

    @Override // androidx.appcompat.app.g
    public void z(Configuration configuration) {
        AbstractC1397a u10;
        if (this.f13182G && this.f13174A && (u10 = u()) != null) {
            u10.m(configuration);
        }
        C1409k.b().g(this.f13194k);
        this.f13197l0 = new Configuration(this.f13194k.getResources().getConfiguration());
        W(false, false);
    }

    i(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private i(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        androidx.appcompat.app.d c12;
        this.f13222y = null;
        this.f13224z = true;
        this.f13199m0 = -100;
        this.f13215u0 = new a();
        this.f13194k = context;
        this.f13200n = eVar;
        this.f13192j = obj;
        if (this.f13199m0 == -100 && (obj instanceof Dialog) && (c12 = c1()) != null) {
            this.f13199m0 = c12.getDelegate().q();
        }
        if (this.f13199m0 == -100) {
            j0.i iVar = f13170C0;
            Integer num = (Integer) iVar.get(obj.getClass().getName());
            if (num != null) {
                this.f13199m0 = num.intValue();
                iVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            Y(window);
        }
        C1409k.h();
    }
}
