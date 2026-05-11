package z0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import co.hyperverge.hypersnapsdk.objects.HVError;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;
import s0.AbstractC4304c;
import z0.InterfaceC5231D;

/* renamed from: z0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5228A {

    /* renamed from: d, reason: collision with root package name */
    private static int f45597d;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f45598a;

    /* renamed from: b, reason: collision with root package name */
    public int f45599b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f45600c = -1;

    /* renamed from: z0.A$a */
    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f45601A;

        /* renamed from: B, reason: collision with root package name */
        public static final a f45602B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f45603C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f45604D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f45605E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f45606F;

        /* renamed from: G, reason: collision with root package name */
        public static final a f45607G;

        /* renamed from: H, reason: collision with root package name */
        public static final a f45608H;

        /* renamed from: I, reason: collision with root package name */
        public static final a f45609I;

        /* renamed from: J, reason: collision with root package name */
        public static final a f45610J;

        /* renamed from: K, reason: collision with root package name */
        public static final a f45611K;

        /* renamed from: L, reason: collision with root package name */
        public static final a f45612L;

        /* renamed from: M, reason: collision with root package name */
        public static final a f45613M;

        /* renamed from: N, reason: collision with root package name */
        public static final a f45614N;

        /* renamed from: O, reason: collision with root package name */
        public static final a f45615O;

        /* renamed from: P, reason: collision with root package name */
        public static final a f45616P;

        /* renamed from: Q, reason: collision with root package name */
        public static final a f45617Q;

        /* renamed from: R, reason: collision with root package name */
        public static final a f45618R;

        /* renamed from: S, reason: collision with root package name */
        public static final a f45619S;

        /* renamed from: T, reason: collision with root package name */
        public static final a f45620T;

        /* renamed from: U, reason: collision with root package name */
        public static final a f45621U;

        /* renamed from: V, reason: collision with root package name */
        public static final a f45622V;

        /* renamed from: e, reason: collision with root package name */
        public static final a f45623e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f45624f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f45625g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f45626h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f45627i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f45628j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f45629k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f45630l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f45631m = new a(PSKKeyManager.MAX_KEY_LENGTH_BYTES, (CharSequence) null, InterfaceC5231D.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f45632n = new a(512, (CharSequence) null, InterfaceC5231D.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f45633o = new a(1024, (CharSequence) null, InterfaceC5231D.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f45634p = new a(2048, (CharSequence) null, InterfaceC5231D.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f45635q = new a(4096, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f45636r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f45637s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f45638t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f45639u = new a(65536, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f45640v = new a(131072, (CharSequence) null, InterfaceC5231D.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f45641w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f45642x = new a(524288, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f45643y = new a(1048576, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f45644z = new a(2097152, (CharSequence) null, InterfaceC5231D.h.class);

        /* renamed from: a, reason: collision with root package name */
        final Object f45645a;

        /* renamed from: b, reason: collision with root package name */
        private final int f45646b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f45647c;

        /* renamed from: d, reason: collision with root package name */
        protected final InterfaceC5231D f45648d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            int i10 = Build.VERSION.SDK_INT;
            f45601A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f45602B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC5231D.e.class);
            f45603C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f45604D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f45605E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f45606F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            if (i10 >= 29) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction26;
            } else {
                accessibilityAction = null;
            }
            f45607G = new a(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
            if (i10 >= 29) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction25;
            } else {
                accessibilityAction2 = null;
            }
            f45608H = new a(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
            if (i10 >= 29) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction24;
            } else {
                accessibilityAction3 = null;
            }
            f45609I = new a(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
            if (i10 >= 29) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction23;
            } else {
                accessibilityAction4 = null;
            }
            f45610J = new a(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
            f45611K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f45612L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC5231D.f.class);
            if (i10 >= 26) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction5 = accessibilityAction22;
            } else {
                accessibilityAction5 = null;
            }
            f45613M = new a(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, null, InterfaceC5231D.d.class);
            if (i10 >= 28) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction6 = accessibilityAction21;
            } else {
                accessibilityAction6 = null;
            }
            f45614N = new a(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i10 >= 28) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction7 = accessibilityAction20;
            } else {
                accessibilityAction7 = null;
            }
            f45615O = new a(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i10 >= 30) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction8 = accessibilityAction19;
            } else {
                accessibilityAction8 = null;
            }
            f45616P = new a(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i10 >= 30) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction9 = accessibilityAction18;
            } else {
                accessibilityAction9 = null;
            }
            f45617Q = new a(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null, null);
            if (i10 >= 32) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction10 = accessibilityAction17;
            } else {
                accessibilityAction10 = null;
            }
            f45618R = new a(accessibilityAction10, R.id.accessibilityActionDragStart, null, null, null);
            if (i10 >= 32) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction11 = accessibilityAction16;
            } else {
                accessibilityAction11 = null;
            }
            f45619S = new a(accessibilityAction11, R.id.accessibilityActionDragDrop, null, null, null);
            if (i10 >= 32) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction12 = accessibilityAction15;
            } else {
                accessibilityAction12 = null;
            }
            f45620T = new a(accessibilityAction12, R.id.accessibilityActionDragCancel, null, null, null);
            if (i10 >= 33) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction13 = accessibilityAction14;
            } else {
                accessibilityAction13 = null;
            }
            f45621U = new a(accessibilityAction13, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f45622V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, InterfaceC5231D interfaceC5231D) {
            return new a(null, this.f45646b, charSequence, interfaceC5231D, this.f45647c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f45645a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f45645a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f45648d == null) {
                return false;
            }
            Class cls = this.f45647c;
            if (cls != null) {
                try {
                    android.support.v4.media.session.b.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f45647c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e10);
                }
            }
            return this.f45648d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f45645a;
            return obj2 == null ? aVar.f45645a == null : obj2.equals(aVar.f45645a);
        }

        public int hashCode() {
            Object obj = this.f45645a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String j10 = C5228A.j(this.f45646b);
            if (j10.equals("ACTION_UNKNOWN") && c() != null) {
                j10 = c().toString();
            }
            sb2.append(j10);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, InterfaceC5231D interfaceC5231D) {
            this(null, i10, charSequence, interfaceC5231D, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, InterfaceC5231D interfaceC5231D, Class cls) {
            this.f45646b = i10;
            this.f45648d = interfaceC5231D;
            if (obj == null) {
                this.f45645a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f45645a = obj;
            }
            this.f45647c = cls;
        }
    }

    /* renamed from: z0.A$b */
    private static class b {
        public static Object a(int i10, float f10, float f11, float f12) {
            return new AccessibilityNodeInfo.RangeInfo(i10, f10, f11, f12);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* renamed from: z0.A$c */
    private static class c {
        public static f a(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z10).setColumnIndex(i10).setRowIndex(i11).setColumnSpan(i12).setRowSpan(i13).setSelected(z11).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static C5228A b(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
            return C5228A.Z0(accessibilityNodeInfo.getChild(i10, i11));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static C5228A f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            return C5228A.Z0(accessibilityNodeInfo.getParent(i10));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setTextSelectable(z10);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* renamed from: z0.A$d */
    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j10) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j10));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z10) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z10);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z10);
        }
    }

    /* renamed from: z0.A$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        final Object f45649a;

        e(Object obj) {
            this.f45649a = obj;
        }

        public static e a(int i10, int i11, boolean z10) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static e b(int i10, int i11, boolean z10, int i12) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* renamed from: z0.A$f */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        final Object f45650a;

        f(Object obj) {
            this.f45650a = obj;
        }

        public static f a(int i10, int i11, int i12, int i13, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static f b(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    /* renamed from: z0.A$g */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        final Object f45651a;

        g(Object obj) {
            this.f45651a = obj;
        }

        public static g d(int i10, float f10, float f11, float f12) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f45651a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f45651a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f45651a).getMin();
        }
    }

    public C5228A(Object obj) {
        this.f45598a = (AccessibilityNodeInfo) obj;
    }

    private SparseArray C(View view) {
        return (SparseArray) view.getTag(AbstractC4304c.f40695I);
    }

    private boolean I() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int J(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f45597d;
        f45597d = i11 + 1;
        return i11;
    }

    public static C5228A Y0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C5228A(accessibilityNodeInfo);
    }

    static C5228A Z0(Object obj) {
        if (obj != null) {
            return new C5228A(obj);
        }
        return null;
    }

    public static C5228A d0() {
        return Y0(AccessibilityNodeInfo.obtain());
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    public static C5228A e0(View view) {
        return Y0(AccessibilityNodeInfo.obtain(view));
    }

    public static C5228A f0(C5228A c5228a) {
        return Y0(AccessibilityNodeInfo.obtain(c5228a.f45598a));
    }

    private void g() {
        this.f45598a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f45598a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f45598a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f45598a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List h(String str) {
        ArrayList<Integer> integerArrayList = this.f45598a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f45598a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String j(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private void j0(View view) {
        SparseArray C10 = C(view);
        if (C10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < C10.size(); i10++) {
                if (((WeakReference) C10.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                C10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private boolean l(int i10) {
        Bundle w10 = w();
        return w10 != null && (w10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    private void l0(int i10, boolean z10) {
        Bundle w10 = w();
        if (w10 != null) {
            int i11 = w10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            w10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray z(View view) {
        SparseArray C10 = C(view);
        if (C10 != null) {
            return C10;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(AbstractC4304c.f40695I, sparseArray);
        return sparseArray;
    }

    public CharSequence A() {
        return this.f45598a.getPackageName();
    }

    public void A0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f45598a.setHeading(z10);
        } else {
            l0(2, z10);
        }
    }

    public g B() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f45598a.getRangeInfo();
        if (rangeInfo != null) {
            return new g(rangeInfo);
        }
        return null;
    }

    public void B0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f45598a.setHintText(charSequence);
        } else {
            this.f45598a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void C0(View view) {
        this.f45598a.setLabelFor(view);
    }

    public CharSequence D() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.f45598a) : this.f45598a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void D0(View view) {
        this.f45598a.setLabeledBy(view);
    }

    public CharSequence E() {
        if (!I()) {
            return this.f45598a.getText();
        }
        List h10 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List h11 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List h12 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List h13 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f45598a.getText(), 0, this.f45598a.getText().length()));
        for (int i10 = 0; i10 < h10.size(); i10++) {
            spannableString.setSpan(new C5232a(((Integer) h13.get(i10)).intValue(), this, w().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) h10.get(i10)).intValue(), ((Integer) h11.get(i10)).intValue(), ((Integer) h12.get(i10)).intValue());
        }
        return spannableString;
    }

    public void E0(int i10) {
        this.f45598a.setMaxTextLength(i10);
    }

    public CharSequence F() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT < 28) {
            return this.f45598a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        tooltipText = this.f45598a.getTooltipText();
        return tooltipText;
    }

    public void F0(CharSequence charSequence) {
        this.f45598a.setPackageName(charSequence);
    }

    public String G() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.f45598a) : this.f45598a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void G0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f45598a.setPaneTitle(charSequence);
        } else {
            this.f45598a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public String H() {
        return this.f45598a.getViewIdResourceName();
    }

    public void H0(View view) {
        this.f45599b = -1;
        this.f45598a.setParent(view);
    }

    public void I0(View view, int i10) {
        this.f45599b = i10;
        this.f45598a.setParent(view, i10);
    }

    public void J0(g gVar) {
        this.f45598a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f45651a);
    }

    public boolean K() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.f45598a) : l(64);
    }

    public void K0(CharSequence charSequence) {
        this.f45598a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean L() {
        return this.f45598a.isAccessibilityFocused();
    }

    public void L0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f45598a.setScreenReaderFocusable(z10);
        } else {
            l0(1, z10);
        }
    }

    public boolean M() {
        return this.f45598a.isCheckable();
    }

    public void M0(boolean z10) {
        this.f45598a.setScrollable(z10);
    }

    public boolean N() {
        return this.f45598a.isChecked();
    }

    public void N0(boolean z10) {
        this.f45598a.setSelected(z10);
    }

    public boolean O() {
        return this.f45598a.isClickable();
    }

    public void O0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f45598a.setShowingHintText(z10);
        } else {
            l0(4, z10);
        }
    }

    public boolean P() {
        return this.f45598a.isContextClickable();
    }

    public void P0(View view) {
        this.f45600c = -1;
        this.f45598a.setSource(view);
    }

    public boolean Q() {
        return this.f45598a.isEnabled();
    }

    public void Q0(View view, int i10) {
        this.f45600c = i10;
        this.f45598a.setSource(view, i10);
    }

    public boolean R() {
        return this.f45598a.isFocusable();
    }

    public void R0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.f45598a, charSequence);
        } else {
            this.f45598a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean S() {
        return this.f45598a.isFocused();
    }

    public void S0(CharSequence charSequence) {
        this.f45598a.setText(charSequence);
    }

    public boolean T() {
        return l(67108864);
    }

    public void T0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f45598a.setTooltipText(charSequence);
        } else {
            this.f45598a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public boolean U() {
        return this.f45598a.isImportantForAccessibility();
    }

    public void U0(View view) {
        this.f45598a.setTraversalAfter(view);
    }

    public boolean V() {
        return this.f45598a.isLongClickable();
    }

    public void V0(String str) {
        this.f45598a.setViewIdResourceName(str);
    }

    public boolean W() {
        return this.f45598a.isPassword();
    }

    public void W0(boolean z10) {
        this.f45598a.setVisibleToUser(z10);
    }

    public boolean X() {
        boolean isScreenReaderFocusable;
        if (Build.VERSION.SDK_INT < 28) {
            return l(1);
        }
        isScreenReaderFocusable = this.f45598a.isScreenReaderFocusable();
        return isScreenReaderFocusable;
    }

    public AccessibilityNodeInfo X0() {
        return this.f45598a;
    }

    public boolean Y() {
        return this.f45598a.isScrollable();
    }

    public boolean Z() {
        return this.f45598a.isSelected();
    }

    public void a(int i10) {
        this.f45598a.addAction(i10);
    }

    public boolean a0() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT < 26) {
            return l(4);
        }
        isShowingHintText = this.f45598a.isShowingHintText();
        return isShowingHintText;
    }

    public void b(a aVar) {
        this.f45598a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f45645a);
    }

    public boolean b0() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.f45598a) : l(8388608);
    }

    public void c(View view) {
        this.f45598a.addChild(view);
    }

    public boolean c0() {
        return this.f45598a.isVisibleToUser();
    }

    public void d(View view, int i10) {
        this.f45598a.addChild(view, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5228A)) {
            return false;
        }
        C5228A c5228a = (C5228A) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f45598a;
        if (accessibilityNodeInfo == null) {
            if (c5228a.f45598a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c5228a.f45598a)) {
            return false;
        }
        return this.f45600c == c5228a.f45600c && this.f45599b == c5228a.f45599b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            j0(view);
            ClickableSpan[] r10 = r(charSequence);
            if (r10 == null || r10.length <= 0) {
                return;
            }
            w().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", AbstractC4304c.f40706a);
            SparseArray z10 = z(view);
            for (int i10 = 0; i10 < r10.length; i10++) {
                int J10 = J(r10[i10], z10);
                z10.put(J10, new WeakReference(r10[i10]));
                e(r10[i10], (Spanned) charSequence, J10);
            }
        }
    }

    public boolean g0(int i10, Bundle bundle) {
        return this.f45598a.performAction(i10, bundle);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f45598a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f45598a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public boolean i0(a aVar) {
        return this.f45598a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f45645a);
    }

    public int k() {
        return this.f45598a.getActions();
    }

    public void k0(boolean z10) {
        this.f45598a.setAccessibilityFocused(z10);
    }

    public void m(Rect rect) {
        this.f45598a.getBoundsInParent(rect);
    }

    public void m0(Rect rect) {
        this.f45598a.setBoundsInParent(rect);
    }

    public void n(Rect rect) {
        this.f45598a.getBoundsInScreen(rect);
    }

    public void n0(Rect rect) {
        this.f45598a.setBoundsInScreen(rect);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f45598a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f45598a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void o0(boolean z10) {
        this.f45598a.setCheckable(z10);
    }

    public int p() {
        return this.f45598a.getChildCount();
    }

    public void p0(boolean z10) {
        this.f45598a.setChecked(z10);
    }

    public CharSequence q() {
        return this.f45598a.getClassName();
    }

    public void q0(CharSequence charSequence) {
        this.f45598a.setClassName(charSequence);
    }

    public void r0(boolean z10) {
        this.f45598a.setClickable(z10);
    }

    public e s() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f45598a.getCollectionInfo();
        if (collectionInfo != null) {
            return new e(collectionInfo);
        }
        return null;
    }

    public void s0(Object obj) {
        this.f45598a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f45649a);
    }

    public CharSequence t() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f45598a) : this.f45598a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void t0(Object obj) {
        this.f45598a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f45650a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        o(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(A());
        sb2.append("; className: ");
        sb2.append(q());
        sb2.append("; text: ");
        sb2.append(E());
        sb2.append("; error: ");
        sb2.append(v());
        sb2.append("; maxTextLength: ");
        sb2.append(y());
        sb2.append("; stateDescription: ");
        sb2.append(D());
        sb2.append("; contentDescription: ");
        sb2.append(u());
        sb2.append("; tooltipText: ");
        sb2.append(F());
        sb2.append("; viewIdResName: ");
        sb2.append(H());
        sb2.append("; uniqueId: ");
        sb2.append(G());
        sb2.append("; checkable: ");
        sb2.append(M());
        sb2.append("; checked: ");
        sb2.append(N());
        sb2.append("; focusable: ");
        sb2.append(R());
        sb2.append("; focused: ");
        sb2.append(S());
        sb2.append("; selected: ");
        sb2.append(Z());
        sb2.append("; clickable: ");
        sb2.append(O());
        sb2.append("; longClickable: ");
        sb2.append(V());
        sb2.append("; contextClickable: ");
        sb2.append(P());
        sb2.append("; enabled: ");
        sb2.append(Q());
        sb2.append("; password: ");
        sb2.append(W());
        sb2.append("; scrollable: " + Y());
        sb2.append("; containerTitle: ");
        sb2.append(t());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(T());
        sb2.append("; importantForAccessibility: ");
        sb2.append(U());
        sb2.append("; visible: ");
        sb2.append(c0());
        sb2.append("; isTextSelectable: ");
        sb2.append(b0());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(K());
        sb2.append("; [");
        List i10 = i();
        for (int i11 = 0; i11 < i10.size(); i11++) {
            a aVar = (a) i10.get(i11);
            String j10 = j(aVar.b());
            if (j10.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                j10 = aVar.c().toString();
            }
            sb2.append(j10);
            if (i11 != i10.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public CharSequence u() {
        return this.f45598a.getContentDescription();
    }

    public void u0(CharSequence charSequence) {
        this.f45598a.setContentDescription(charSequence);
    }

    public CharSequence v() {
        return this.f45598a.getError();
    }

    public void v0(boolean z10) {
        this.f45598a.setDismissable(z10);
    }

    public Bundle w() {
        return this.f45598a.getExtras();
    }

    public void w0(boolean z10) {
        this.f45598a.setEnabled(z10);
    }

    public CharSequence x() {
        CharSequence hintText;
        if (Build.VERSION.SDK_INT < 26) {
            return this.f45598a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
        }
        hintText = this.f45598a.getHintText();
        return hintText;
    }

    public void x0(CharSequence charSequence) {
        this.f45598a.setError(charSequence);
    }

    public int y() {
        return this.f45598a.getMaxTextLength();
    }

    public void y0(boolean z10) {
        this.f45598a.setFocusable(z10);
    }

    public void z0(boolean z10) {
        this.f45598a.setFocused(z10);
    }

    private C5228A(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f45598a = accessibilityNodeInfo;
    }

    public void h0() {
    }
}
