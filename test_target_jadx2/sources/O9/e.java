package O9;

import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wc.q;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final View f7114a;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.react.views.view.j f7115b;

    /* renamed from: c, reason: collision with root package name */
    private final F0 f7116c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7117d;

    /* renamed from: e, reason: collision with root package name */
    private EditText f7118e;

    /* renamed from: f, reason: collision with root package name */
    private K9.b f7119f;

    /* renamed from: g, reason: collision with root package name */
    private TextWatcher f7120g;

    /* renamed from: h, reason: collision with root package name */
    private Function0 f7121h;

    /* renamed from: i, reason: collision with root package name */
    private final View.OnLayoutChangeListener f7122i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1 f7123j;

    /* renamed from: k, reason: collision with root package name */
    private final q f7124k;

    /* renamed from: l, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalFocusChangeListener f7125l;

    static final class a extends xc.m implements q {
        a() {
            super(6);
        }

        public final void a(int i10, int i11, double d10, double d11, double d12, double d13) {
            EditText editText = e.this.f7118e;
            if (editText == null) {
                return;
            }
            e.this.m();
            L9.i.a(e.this.f7116c, e.this.f7115b.getId(), new K9.c(e.this.f7117d, e.this.f7115b.getId(), new K9.d(editText.getId(), d10, d11, d12, d13, i10, i11)));
        }

        @Override // wc.q
        public /* bridge */ /* synthetic */ Object w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).doubleValue(), ((Number) obj4).doubleValue(), ((Number) obj5).doubleValue(), ((Number) obj6).doubleValue());
            return Unit.f36324a;
        }
    }

    static final class b extends xc.m implements Function1 {
        b() {
            super(1);
        }

        public final void a(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            e.this.m();
            L9.i.a(e.this.f7116c, e.this.f7115b.getId(), new K9.e(e.this.f7117d, e.this.f7115b.getId(), text));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f36324a;
        }
    }

    public e(View view, com.facebook.react.views.view.j eventPropagationView, F0 f02) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventPropagationView, "eventPropagationView");
        this.f7114a = view;
        this.f7115b = eventPropagationView;
        this.f7116c = f02;
        this.f7117d = L0.f(view);
        this.f7119f = f.a();
        this.f7122i = new View.OnLayoutChangeListener() { // from class: O9.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                e.l(e.this, view2, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        this.f7123j = new b();
        this.f7124k = new a();
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: O9.c
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view2, View view3) {
                e.j(e.this, view2, view3);
            }
        };
        this.f7125l = onGlobalFocusChangeListener;
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    private final void i(K9.b bVar) {
        if (Intrinsics.b(bVar, this.f7119f)) {
            return;
        }
        this.f7119f = bVar;
        L9.i.a(this.f7116c, this.f7115b.getId(), new K9.a(this.f7117d, this.f7115b.getId(), bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(e this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view2 == null || view != null) {
            EditText editText = this$0.f7118e;
            if (editText != null) {
                editText.removeOnLayoutChangeListener(this$0.f7122i);
            }
            final EditText editText2 = this$0.f7118e;
            if (editText2 != null) {
                final TextWatcher textWatcher = this$0.f7120g;
                editText2.post(new Runnable() { // from class: O9.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.k(editText2, textWatcher);
                    }
                });
            }
            Function0 function0 = this$0.f7121h;
            if (function0 != null) {
                function0.invoke();
            }
            this$0.f7118e = null;
        }
        if (view2 instanceof EditText) {
            EditText editText3 = (EditText) view2;
            this$0.f7118e = editText3;
            view2.addOnLayoutChangeListener(this$0.f7122i);
            this$0.m();
            this$0.f7120g = L9.d.b(editText3, this$0.f7123j);
            this$0.f7121h = L9.d.a(editText3, this$0.f7124k);
            T9.a.f9501a.c(editText3);
            T9.c cVar = T9.c.f9504a;
            F0 f02 = this$0.f7116c;
            List g10 = cVar.g(f02 != null ? L9.h.b(f02) : null);
            int indexOf = g10.indexOf(view2);
            F0 f03 = this$0.f7116c;
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("current", indexOf);
            createMap.putInt("count", g10.size());
            Unit unit = Unit.f36324a;
            Intrinsics.checkNotNullExpressionValue(createMap, "apply(...)");
            L9.i.b(f03, "KeyboardController::focusDidSet", createMap);
        }
        if (view2 == null) {
            this$0.i(f.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(EditText input, TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(input, "$input");
        input.removeTextChangedListener(textWatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(e this$0, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m();
    }

    public final void h() {
        this.f7114a.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f7125l);
    }

    public final void m() {
        EditText editText = this.f7118e;
        if (editText == null) {
            return;
        }
        int[] b10 = L9.k.b(editText);
        i(new K9.b(L9.e.a(editText.getX()), L9.e.a(editText.getY()), L9.e.a(editText.getWidth()), L9.e.a(editText.getHeight()), L9.e.a(b10[0]), L9.e.a(b10[1]), editText.getId(), L9.d.e(editText)));
    }
}
