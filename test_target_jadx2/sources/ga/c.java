package Ga;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.m;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    private final String type;
    public static final c Trace = new c("Trace", 0, "trace");
    public static final c Timer = new c("Timer", 1, "timer");
    public static final c Stacktrace = new c("Stacktrace", 2, "stacktrace");
    public static final c Debug = new c("Debug", 3, "debug");
    public static final c Info = new c("Info", 4, "info");
    public static final c Warn = new c("Warn", 5, "warn");
    public static final c Error = new c("Error", 6, AppConstants.VIDEO_RECORDING_ERROR);
    public static final c Fatal = new c("Fatal", 7, "fatal");

    public static final class a {

        /* renamed from: Ga.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0071a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2987a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.Trace.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.Timer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.Stacktrace.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.Debug.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[c.Info.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[c.Warn.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[c.Error.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[c.Fatal.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f2987a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(c type) {
            Intrinsics.checkNotNullParameter(type, "type");
            switch (C0071a.f2987a[type.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return 3;
                case 5:
                    return 4;
                case 6:
                    return 5;
                case 7:
                    return 6;
                case 8:
                    return 7;
                default:
                    throw new m();
            }
        }

        private a() {
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{Trace, Timer, Stacktrace, Debug, Info, Warn, Error, Fatal};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private c(String str, int i10, String str2) {
        this.type = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}
