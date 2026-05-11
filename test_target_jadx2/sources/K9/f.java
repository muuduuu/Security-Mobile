package K9;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* loaded from: classes2.dex */
public final class f extends com.facebook.react.uimanager.events.d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f5492f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final a.EnumC0104a f5493g = a.EnumC0104a.Move;

    /* renamed from: h, reason: collision with root package name */
    private static final a.EnumC0104a f5494h = a.EnumC0104a.Start;

    /* renamed from: i, reason: collision with root package name */
    private static final a.EnumC0104a f5495i = a.EnumC0104a.End;

    /* renamed from: j, reason: collision with root package name */
    private static final a.EnumC0104a f5496j = a.EnumC0104a.Interactive;

    /* renamed from: a, reason: collision with root package name */
    private final a.EnumC0104a f5497a;

    /* renamed from: b, reason: collision with root package name */
    private final double f5498b;

    /* renamed from: c, reason: collision with root package name */
    private final double f5499c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5500d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5501e;

    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: K9.f$a$a, reason: collision with other inner class name */
        public static final class EnumC0104a {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ EnumC0104a[] $VALUES;
            private final String value;
            public static final EnumC0104a Move = new EnumC0104a("Move", 0, "topKeyboardMove");
            public static final EnumC0104a Start = new EnumC0104a("Start", 1, "topKeyboardMoveStart");
            public static final EnumC0104a End = new EnumC0104a("End", 2, "topKeyboardMoveEnd");
            public static final EnumC0104a Interactive = new EnumC0104a("Interactive", 3, "topKeyboardMoveInteractive");

            private static final /* synthetic */ EnumC0104a[] $values() {
                return new EnumC0104a[]{Move, Start, End, Interactive};
            }

            static {
                EnumC0104a[] $values = $values();
                $VALUES = $values;
                $ENTRIES = AbstractC3958a.a($values);
            }

            private EnumC0104a(String str, int i10, String str2) {
                this.value = str2;
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static EnumC0104a valueOf(String str) {
                return (EnumC0104a) Enum.valueOf(EnumC0104a.class, str);
            }

            public static EnumC0104a[] values() {
                return (EnumC0104a[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0104a a() {
            return f.f5495i;
        }

        public final EnumC0104a b() {
            return f.f5496j;
        }

        public final EnumC0104a c() {
            return f.f5493g;
        }

        public final EnumC0104a d() {
            return f.f5494h;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, int i11, a.EnumC0104a event, double d10, double d11, int i12, int i13) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5497a = event;
        this.f5498b = d10;
        this.f5499c = d11;
        this.f5500d = i12;
        this.f5501e = i13;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.f5499c);
        createMap.putDouble("height", this.f5498b);
        createMap.putInt("duration", this.f5500d);
        createMap.putInt("target", this.f5501e);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.f5497a.getValue();
    }
}
