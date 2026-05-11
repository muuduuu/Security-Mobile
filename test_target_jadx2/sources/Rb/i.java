package rb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.app.AbstractC1480b;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1596m;
import androidx.lifecycle.InterfaceC1599p;
import e.C3059a;
import e.C3064f;
import e.InterfaceC3060b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zb.InterfaceC5271b;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5271b f40571a;

    /* renamed from: b, reason: collision with root package name */
    private Random f40572b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f40573c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f40574d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f40575e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f40576f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f40577g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f40578h;

    /* renamed from: i, reason: collision with root package name */
    private final Bundle f40579i;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4296d f40580a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3060b f40581b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC4295c f40582c;

        public a(InterfaceC4296d fallbackCallback, InterfaceC3060b interfaceC3060b, InterfaceC4295c contract) {
            Intrinsics.checkNotNullParameter(fallbackCallback, "fallbackCallback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.f40580a = fallbackCallback;
            this.f40581b = interfaceC3060b;
            this.f40582c = contract;
        }

        public final InterfaceC4295c a() {
            return this.f40582c;
        }

        public final InterfaceC4296d b() {
            return this.f40580a;
        }

        public final InterfaceC3060b c() {
            return this.f40581b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f40580a, aVar.f40580a) && Intrinsics.b(this.f40581b, aVar.f40581b) && Intrinsics.b(this.f40582c, aVar.f40582c);
        }

        public int hashCode() {
            int hashCode = this.f40580a.hashCode() * 31;
            InterfaceC3060b interfaceC3060b = this.f40581b;
            return ((hashCode + (interfaceC3060b == null ? 0 : interfaceC3060b.hashCode())) * 31) + this.f40582c.hashCode();
        }

        public String toString() {
            return "CallbacksAndContract(fallbackCallback=" + this.f40580a + ", mainCallback=" + this.f40581b + ", contract=" + this.f40582c + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1592i f40583a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f40584b;

        public b(AbstractC1592i lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.f40583a = lifecycle;
            this.f40584b = new ArrayList();
        }

        public final void a(InterfaceC1596m observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.f40583a.a(observer);
            this.f40584b.add(observer);
        }

        public final void b() {
            Iterator it = this.f40584b.iterator();
            while (it.hasNext()) {
                this.f40583a.d((InterfaceC1596m) it.next());
            }
            this.f40584b.clear();
        }

        public final AbstractC1592i c() {
            return this.f40583a;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40585a;

        static {
            int[] iArr = new int[AbstractC1592i.a.values().length];
            try {
                iArr[AbstractC1592i.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1592i.a.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f40585a = iArr;
        }
    }

    public static final class d extends e {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4295c f40586a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4295c f40587b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f40588c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f40589d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC4296d f40590e;

        d(InterfaceC4295c interfaceC4295c, i iVar, String str, InterfaceC4296d interfaceC4296d) {
            this.f40587b = interfaceC4295c;
            this.f40588c = iVar;
            this.f40589d = str;
            this.f40590e = interfaceC4296d;
            this.f40586a = interfaceC4295c;
        }

        @Override // rb.e
        public void b(Serializable input, InterfaceC3060b callback) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Integer num = (Integer) this.f40588c.f40574d.get(this.f40589d);
            if (num == null) {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f40587b + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch()");
            }
            int intValue = num.intValue();
            this.f40588c.f40577g.put(this.f40589d, new a(this.f40590e, callback, this.f40587b));
            this.f40588c.f40578h.put(this.f40589d, input);
            this.f40588c.f40576f.add(this.f40589d);
            try {
                this.f40588c.k(intValue, this.f40587b, input);
            } catch (Exception e10) {
                this.f40588c.f40576f.remove(this.f40589d);
                throw e10;
            }
        }
    }

    public i(InterfaceC5271b currentActivityProvider) {
        Intrinsics.checkNotNullParameter(currentActivityProvider, "currentActivityProvider");
        this.f40571a = currentActivityProvider;
        this.f40572b = new Random();
        this.f40573c = new HashMap();
        this.f40574d = new HashMap();
        this.f40575e = new HashMap();
        this.f40576f = new ArrayList();
        this.f40577g = new HashMap();
        this.f40578h = new HashMap();
        this.f40579i = new Bundle();
    }

    private final void h(String str, int i10, Intent intent, a aVar) {
        AbstractC1592i c10;
        b bVar = (b) this.f40575e.get(str);
        AbstractC1592i.b b10 = (bVar == null || (c10 = bVar.c()) == null) ? null : c10.b();
        if ((aVar != null ? aVar.c() : null) != null && this.f40576f.contains(str)) {
            Object obj = this.f40578h.get(str);
            Intrinsics.e(obj, "null cannot be cast to non-null type I of expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.doDispatch");
            aVar.c().a(aVar.a().a((Serializable) obj, i10, intent));
            this.f40576f.remove(str);
            return;
        }
        if (b10 == null || !b10.isAtLeast(AbstractC1592i.b.STARTED) || aVar == null || !this.f40576f.contains(str)) {
            this.f40579i.putParcelable(str, new C3059a(i10, intent));
            return;
        }
        Object obj2 = this.f40578h.get(str);
        Intrinsics.e(obj2, "null cannot be cast to non-null type I of expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.doDispatch");
        Serializable serializable = (Serializable) obj2;
        aVar.b().a(serializable, aVar.a().a(serializable, i10, intent));
        this.f40576f.remove(str);
    }

    private final int i() {
        int nextInt = this.f40572b.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (!this.f40573c.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f40572b.nextInt(2147418112);
        }
    }

    private final androidx.appcompat.app.d j() {
        Activity a10 = this.f40571a.a();
        androidx.appcompat.app.d dVar = a10 instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) a10 : null;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Current Activity is not available at the moment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(i this$0, int i10, IntentSender.SendIntentException e10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e10, "$e");
        this$0.g(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(i this$0, String key, InterfaceC1599p interfaceC1599p, AbstractC1592i.a event) {
        Parcelable parcelable;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(interfaceC1599p, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = c.f40585a[event.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            this$0.q(key);
            return;
        }
        a aVar = (a) this$0.f40577g.get(key);
        if (aVar == null) {
            return;
        }
        Bundle bundle = this$0.f40579i;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable(key, C3059a.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            parcelable = bundle.getParcelable(key);
        }
        C3059a c3059a = (C3059a) parcelable;
        if (c3059a != null) {
            this$0.f40579i.remove(key);
            Object obj = this$0.f40578h.get(key);
            Intrinsics.e(obj, "null cannot be cast to non-null type I of expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.register$lambda$4$lambda$3");
            Serializable serializable = (Serializable) obj;
            Object a10 = aVar.a().a(serializable, c3059a.b(), c3059a.a());
            if (aVar.c() != null) {
                aVar.c().a(a10);
            } else {
                aVar.b().a(serializable, a10);
            }
        }
    }

    public final boolean g(int i10, int i11, Intent intent) {
        String str = (String) this.f40573c.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        h(str, i11, intent, (a) this.f40577g.get(str));
        return true;
    }

    public final void k(final int i10, InterfaceC4295c contract, Serializable input) {
        Bundle bundle;
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent b10 = contract.b(j(), input);
        if (b10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = b10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            b10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String action = b10.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1837081951) {
                if (hashCode == -591152331 && action.equals("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra2 = b10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", C3064f.class);
                        parcelableExtra = (Parcelable) parcelableExtra2;
                    } else {
                        parcelableExtra = b10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    }
                    Intrinsics.d(parcelableExtra);
                    C3064f c3064f = (C3064f) parcelableExtra;
                    try {
                        AbstractC1480b.A(j(), c3064f.d(), i10, c3064f.a(), c3064f.b(), c3064f.c(), 0, bundle2);
                        return;
                    } catch (IntentSender.SendIntentException e10) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: rb.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                i.l(i.this, i10, e10);
                            }
                        });
                        return;
                    }
                }
            } else if (action.equals("androidx.activity.result.contract.action.REQUEST_PERMISSIONS")) {
                String[] stringArrayExtra = b10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC1480b.v(j(), stringArrayExtra, i10);
                return;
            }
        }
        AbstractC1480b.z(j(), b10, i10, bundle2);
    }

    public final void m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        k e10 = new k(context).d("launchedKeys", this.f40576f).e("keyToRequestCode", this.f40574d);
        Map map = this.f40578h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (this.f40576f.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        e10.f("keyToParamsForFallbackCallback", linkedHashMap).b("pendingResult", this.f40579i).c("random", this.f40572b).h();
    }

    public final e n(final String key, InterfaceC1599p lifecycleOwner, InterfaceC4295c contract, InterfaceC4296d fallbackCallback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(fallbackCallback, "fallbackCallback");
        AbstractC1592i lifecycle = lifecycleOwner.getLifecycle();
        this.f40577g.put(key, new a(fallbackCallback, null, contract));
        if (this.f40574d.get(key) == null) {
            int i10 = i();
            this.f40573c.put(Integer.valueOf(i10), key);
            this.f40574d.put(key, Integer.valueOf(i10));
            Unit unit = Unit.f36324a;
        }
        InterfaceC1596m interfaceC1596m = new InterfaceC1596m() { // from class: rb.g
            @Override // androidx.lifecycle.InterfaceC1596m
            public final void d(InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar) {
                i.o(i.this, key, interfaceC1599p, aVar);
            }
        };
        b bVar = (b) this.f40575e.get(key);
        if (bVar == null) {
            bVar = new b(lifecycle);
        }
        bVar.a(interfaceC1596m);
        this.f40575e.put(key, bVar);
        return new d(contract, this, key, fallbackCallback);
    }

    public final void p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        k kVar = new k(context);
        ArrayList l10 = kVar.l("launchedKeys");
        if (l10 != null) {
            this.f40576f = l10;
        }
        Map n10 = kVar.n("keyToParamsForFallbackCallback");
        if (n10 != null) {
            this.f40578h.putAll(n10);
        }
        Bundle i10 = kVar.i("pendingResult");
        if (i10 != null) {
            this.f40579i.putAll(i10);
        }
        Serializable k10 = kVar.k("random");
        if (k10 != null) {
            this.f40572b = (Random) k10;
        }
        Map m10 = kVar.m("keyToRequestCode");
        if (m10 != null) {
            for (Map.Entry entry : m10.entrySet()) {
                String str = (String) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                this.f40574d.put(str, Integer.valueOf(intValue));
                this.f40573c.put(Integer.valueOf(intValue), str);
            }
        }
    }

    public final void q(String key) {
        Parcelable parcelable;
        Object parcelable2;
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f40576f.contains(key) && (num = (Integer) this.f40574d.remove(key)) != null) {
        }
        this.f40577g.remove(key);
        if (this.f40579i.containsKey(key)) {
            Bundle bundle = this.f40579i;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable(key, C3059a.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = bundle.getParcelable(key);
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + " : " + parcelable);
            this.f40579i.remove(key);
        }
        b bVar = (b) this.f40575e.get(key);
        if (bVar != null) {
            bVar.b();
        }
    }
}
