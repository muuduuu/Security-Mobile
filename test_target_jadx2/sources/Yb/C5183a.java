package yb;

import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.m;
import qc.AbstractC3958a;

/* renamed from: yb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5183a {

    /* renamed from: a, reason: collision with root package name */
    private final d f45385a;

    /* renamed from: b, reason: collision with root package name */
    private final b f45386b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f45387c;

    /* renamed from: yb.a$a, reason: collision with other inner class name */
    public static final class C0664a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0664a f45388a = new C0664a();

        private C0664a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0664a);
        }

        public int hashCode() {
            return 728698842;
        }

        public String toString() {
            return "AllEventsFilter";
        }
    }

    /* renamed from: yb.a$b */
    public static abstract class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: yb.a$c */
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final String f45389a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.f45389a = event;
        }

        public final String a() {
            return this.f45389a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: yb.a$d */
    public static final class d {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d StartObserving = new d("StartObserving", 0, "startObserving");
        public static final d StopObserving = new d("StopObserving", 1, "stopObserving");
        private final String value;

        private static final /* synthetic */ d[] $values() {
            return new d[]{StartObserving, StopObserving};
        }

        static {
            d[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private d(String str, int i10, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    public C5183a(d type, b filer, Function0 body) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(filer, "filer");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f45385a = type;
        this.f45386b = filer;
        this.f45387c = body;
    }

    public final void a(d eventType, String eventName) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (eventType == this.f45385a && b(eventName)) {
            this.f45387c.invoke();
        }
    }

    public final boolean b(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        b bVar = this.f45386b;
        if (bVar instanceof C0664a) {
            return true;
        }
        if (bVar instanceof c) {
            return Intrinsics.b(((c) bVar).a(), eventName);
        }
        throw new m();
    }
}
