package com.google.common.collect;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class o {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class a implements g8.c {
        public static final a KEY = new C0411a("KEY", 0);
        public static final a VALUE = new b("VALUE", 1);
        private static final /* synthetic */ a[] $VALUES = $values();

        /* renamed from: com.google.common.collect.o$a$a, reason: collision with other inner class name */
        enum C0411a extends a {
            C0411a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.collect.o.a, g8.c
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        enum b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.collect.o.a, g8.c
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private static /* synthetic */ a[] $values() {
            return new a[]{KEY, VALUE};
        }

        private a(String str, int i10) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // g8.c
        public abstract /* synthetic */ Object apply(Object obj);

        /* synthetic */ a(String str, int i10, n nVar) {
            this(str, i10);
        }
    }

    static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static String b(Map map) {
        StringBuilder a10 = e.a(map.size());
        a10.append('{');
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                a10.append(", ");
            }
            a10.append(entry.getKey());
            a10.append('=');
            a10.append(entry.getValue());
            z10 = false;
        }
        a10.append('}');
        return a10.toString();
    }

    static g8.c c() {
        return a.VALUE;
    }
}
