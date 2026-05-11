package com.facebook.react.views.image;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes2.dex */
public final class b extends com.facebook.react.uimanager.events.d {

    /* renamed from: h, reason: collision with root package name */
    public static final a f22515h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f22516a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22517b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22518c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22519d;

    /* renamed from: e, reason: collision with root package name */
    private final int f22520e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22521f;

    /* renamed from: g, reason: collision with root package name */
    private final int f22522g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int i10, int i11, Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new b(i10, i11, 1, throwable.getMessage(), null, 0, 0, 0, 0, null);
        }

        public final b b(int i10, int i11) {
            return new b(i10, i11, 3, null, null, 0, 0, 0, 0, 504, null);
        }

        public final b c(int i10, int i11, String str, int i12, int i13) {
            return new b(i10, i11, 2, null, str, i12, i13, 0, 0, null);
        }

        public final b d(int i10, int i11) {
            return new b(i10, i11, 4, null, null, 0, 0, 0, 0, 504, null);
        }

        public final b e(int i10, int i11, String str, int i12, int i13) {
            return new b(i10, i11, 5, null, str, 0, 0, i12, i13, null);
        }

        public final String f(int i10) {
            if (i10 == 1) {
                return "topError";
            }
            if (i10 == 2) {
                return SvgLoadEvent.EVENT_NAME;
            }
            if (i10 == 3) {
                return "topLoadEnd";
            }
            if (i10 == 4) {
                return "topLoadStart";
            }
            if (i10 == 5) {
                return "topProgress";
            }
            throw new IllegalStateException(("Invalid image event: " + i10).toString());
        }

        private a() {
        }
    }

    public /* synthetic */ b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str, str2, i13, i14, i15, i16);
    }

    private final WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", this.f22518c);
        createMap.putDouble("width", this.f22519d);
        createMap.putDouble("height", this.f22520e);
        Intrinsics.checkNotNullExpressionValue(createMap, "apply(...)");
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) this.f22516a;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        int i10 = this.f22516a;
        if (i10 == 1) {
            createMap.putString(AppConstants.VIDEO_RECORDING_ERROR, this.f22517b);
        } else if (i10 == 2) {
            createMap.putMap("source", a());
        } else if (i10 == 5) {
            createMap.putInt("loaded", this.f22521f);
            createMap.putInt("total", this.f22522g);
            createMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.f22521f / this.f22522g);
        }
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return f22515h.f(this.f22516a);
    }

    /* synthetic */ b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, (i17 & 8) != 0 ? null : str, (i17 & 16) != 0 ? null : str2, (i17 & 32) != 0 ? 0 : i13, (i17 & 64) != 0 ? 0 : i14, (i17 & 128) != 0 ? 0 : i15, (i17 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0 : i16);
    }

    private b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16) {
        super(i10, i11);
        this.f22516a = i12;
        this.f22517b = str;
        this.f22518c = str2;
        this.f22519d = i13;
        this.f22520e = i14;
        this.f22521f = i15;
        this.f22522g = i16;
    }
}
