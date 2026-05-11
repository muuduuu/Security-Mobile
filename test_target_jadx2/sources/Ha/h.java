package ha;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class h extends com.facebook.react.uimanager.events.d {

    /* renamed from: e, reason: collision with root package name */
    public static final a f34032e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final float f34033a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34034b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34035c;

    /* renamed from: d, reason: collision with root package name */
    private final short f34036d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(int i10, int i11, float f10, boolean z10, boolean z11, short s10) {
        super(i10, i11);
        this.f34033a = f10;
        this.f34034b = z10;
        this.f34035c = z11;
        this.f34036d = s10;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f34036d;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.f34033a);
        createMap.putInt("closing", this.f34034b ? 1 : 0);
        createMap.putInt("goingForward", this.f34035c ? 1 : 0);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topTransitionProgress";
    }
}
