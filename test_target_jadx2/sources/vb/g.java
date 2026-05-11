package vb;

import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class g implements InterfaceC5007b, Fa.a {

    /* renamed from: a, reason: collision with root package name */
    private final Fa.a f44211a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f44212b;

    private static final class a extends com.facebook.react.uimanager.events.d {

        /* renamed from: a, reason: collision with root package name */
        private final String f44213a;

        /* renamed from: b, reason: collision with root package name */
        private final WritableMap f44214b;

        /* renamed from: c, reason: collision with root package name */
        private final Short f44215c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, String eventName, WritableMap writableMap, Short sh) {
            super(i10, i11);
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            this.f44213a = eventName;
            this.f44214b = writableMap;
            this.f44215c = sh;
        }

        @Override // com.facebook.react.uimanager.events.d
        public boolean canCoalesce() {
            return this.f44215c != null;
        }

        @Override // com.facebook.react.uimanager.events.d
        public short getCoalescingKey() {
            Short sh = this.f44215c;
            if (sh != null) {
                return sh.shortValue();
            }
            return (short) 0;
        }

        @Override // com.facebook.react.uimanager.events.d
        protected WritableMap getEventData() {
            WritableMap writableMap = this.f44214b;
            if (writableMap != null) {
                return writableMap;
            }
            WritableMap createMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(createMap, "createMap(...)");
            return createMap;
        }

        @Override // com.facebook.react.uimanager.events.d
        public String getEventName() {
            return i.a(this.f44213a);
        }
    }

    public g(Fa.a legacyEventEmitter, WeakReference reactContextHolder) {
        Intrinsics.checkNotNullParameter(legacyEventEmitter, "legacyEventEmitter");
        Intrinsics.checkNotNullParameter(reactContextHolder, "reactContextHolder");
        this.f44211a = legacyEventEmitter;
        this.f44212b = reactContextHolder;
    }

    @Override // vb.InterfaceC5007b
    public void a(View view, String eventName, WritableMap writableMap, Short sh) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f44212b.get();
        if (reactApplicationContext == null) {
            return;
        }
        int f10 = L0.f(view);
        int id2 = view.getId();
        EventDispatcher c10 = L0.c(reactApplicationContext, view.getId());
        if (c10 != null) {
            c10.c(new a(f10, id2, eventName, writableMap, sh));
        }
    }

    @Override // Fa.a
    public void b(String str, Bundle bundle) {
        this.f44211a.b(str, bundle);
    }
}
