package R9;

import O9.i;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.AbstractC1484a0;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.events.h;
import com.facebook.react.views.view.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final a f8633h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final j f8634a;

    /* renamed from: b, reason: collision with root package name */
    private final F0 f8635b;

    /* renamed from: c, reason: collision with root package name */
    private final O9.j f8636c;

    /* renamed from: d, reason: collision with root package name */
    private Function0 f8637d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8638e;

    /* renamed from: f, reason: collision with root package name */
    private final UIManager f8639f;

    /* renamed from: g, reason: collision with root package name */
    private final EventDispatcher f8640g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(j view, F0 reactContext, O9.j config, Function0 callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f8634a = view;
        this.f8635b = reactContext;
        this.f8636c = config;
        this.f8637d = callback;
        this.f8638e = 2;
        this.f8639f = L0.g(reactContext.b(), 2);
        this.f8640g = L0.b(reactContext.b(), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(i callback, j eventView, b this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(eventView, "$eventView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        i.o(callback, null, null, 3, null);
        callback.d();
        L9.j.a(eventView);
        i iVar = (i) this$0.f8637d.invoke();
        if (iVar != null) {
            iVar.m(false);
        }
    }

    public final void b() {
        EventDispatcher eventDispatcher = this.f8640g;
        if (eventDispatcher != null) {
            eventDispatcher.j(this);
        }
    }

    public final void c() {
        EventDispatcher eventDispatcher = this.f8640g;
        if (eventDispatcher != null) {
            eventDispatcher.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    @Override // com.facebook.react.uimanager.events.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onEventDispatch(d event) {
        String str;
        com.facebook.react.views.modal.c cVar;
        boolean z10;
        View decorView;
        View resolveView;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!Intrinsics.b(event.getEventName(), "topShow")) {
            return;
        }
        View view = null;
        try {
            UIManager uIManager = this.f8639f;
            resolveView = uIManager != null ? uIManager.resolveView(event.getViewTag()) : null;
        } catch (Exception e10) {
            P9.a aVar = P9.a.f7630a;
            str = c.f8641a;
            aVar.c(str, "Can not resolve view for Modal#" + event.getViewTag(), e10);
        }
        if (resolveView instanceof com.facebook.react.views.modal.c) {
            cVar = (com.facebook.react.views.modal.c) resolveView;
            if (cVar != null) {
                return;
            }
            Dialog dialog = cVar.getDialog();
            Window window = dialog != null ? dialog.getWindow() : null;
            if (window != null && (decorView = window.getDecorView()) != null) {
                view = decorView.getRootView();
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup != null) {
                final j jVar = new j(this.f8635b);
                jVar.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                final i iVar = new i(this.f8634a, viewGroup, this.f8635b, this.f8636c);
                viewGroup.addView(jVar);
                z10 = c.f8642b;
                if (z10) {
                    i iVar2 = (i) this.f8637d.invoke();
                    if (iVar2 != null) {
                        iVar2.m(true);
                    }
                    AbstractC1484a0.N0(viewGroup, iVar);
                    AbstractC1484a0.F0(jVar, iVar);
                    iVar.n(Double.valueOf(0.0d), Boolean.FALSE);
                }
                if (dialog != null) {
                    dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: R9.a
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            b.d(i.this, jVar, this, dialogInterface);
                        }
                    });
                }
                if (window != null) {
                    window.setSoftInputMode(48);
                    return;
                }
                return;
            }
            return;
        }
        cVar = null;
        if (cVar != null) {
        }
    }
}
