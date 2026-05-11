package io.sentry.android.core.internal.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    private static final f f34913b = new f();

    /* renamed from: a, reason: collision with root package name */
    private final List f34914a = new ArrayList();

    private f() {
    }

    public static f a() {
        return f34913b;
    }

    String b() {
        return "/sys/devices/system/cpu";
    }

    public synchronized List c() {
        if (!this.f34914a.isEmpty()) {
            return this.f34914a;
        }
        File[] listFiles = new File(b()).listFiles();
        if (listFiles == null) {
            return new ArrayList();
        }
        for (File file : listFiles) {
            if (file.getName().matches("cpu[0-9]+")) {
                File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                if (file2.exists() && file2.canRead()) {
                    try {
                        String b10 = io.sentry.util.e.b(file2);
                        if (b10 != null) {
                            this.f34914a.add(Integer.valueOf((int) (Long.parseLong(b10.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
        }
        return this.f34914a;
    }
}
