package com.facebook.react.common.mapbuffer;

import kotlin.enums.EnumEntries;
import kotlin.ranges.IntRange;
import qc.AbstractC3958a;
import yc.InterfaceC5191a;

/* loaded from: classes.dex */
public interface a extends Iterable, InterfaceC5191a {

    /* renamed from: R, reason: collision with root package name */
    public static final C0373a f21422R = C0373a.f21423a;

    /* renamed from: com.facebook.react.common.mapbuffer.a$a, reason: collision with other inner class name */
    public static final class C0373a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0373a f21423a = new C0373a();

        /* renamed from: b, reason: collision with root package name */
        private static final IntRange f21424b = new IntRange(0, 65535);

        private C0373a() {
        }

        public final IntRange a() {
            return f21424b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b BOOL = new b("BOOL", 0);
        public static final b INT = new b("INT", 1);
        public static final b DOUBLE = new b("DOUBLE", 2);
        public static final b STRING = new b("STRING", 3);
        public static final b MAP = new b("MAP", 4);
        public static final b LONG = new b("LONG", 5);

        private static final /* synthetic */ b[] $values() {
            return new b[]{BOOL, INT, DOUBLE, STRING, MAP, LONG};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private b(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public interface c {
        long a();

        double b();

        String c();

        int d();

        a e();

        boolean f();

        int getKey();

        b getType();
    }

    boolean C(int i10);

    boolean getBoolean(int i10);

    int getCount();

    double getDouble(int i10);

    int getInt(int i10);

    String getString(int i10);

    a x1(int i10);
}
