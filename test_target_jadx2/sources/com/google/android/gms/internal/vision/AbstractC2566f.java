package com.google.android.gms.internal.vision;

import java.io.PrintStream;

/* renamed from: com.google.android.gms.internal.vision.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2566f {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2562e f25126a;

    /* renamed from: b, reason: collision with root package name */
    private static final int f25127b;

    /* renamed from: com.google.android.gms.internal.vision.f$a */
    static final class a extends AbstractC2562e {
        a() {
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2562e
        public final void a(Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    static {
        Integer num;
        AbstractC2562e aVar;
        try {
            num = a();
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        if (num != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                PrintStream printStream = System.err;
                String name = a.class.getName();
                StringBuilder sb2 = new StringBuilder(name.length() + 133);
                sb2.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                sb2.append(name);
                sb2.append("will be used. The error is: ");
                printStream.println(sb2.toString());
                th.printStackTrace(printStream);
                aVar = new a();
                f25126a = aVar;
                f25127b = num == null ? 1 : num.intValue();
            }
            if (num.intValue() >= 19) {
                aVar = new C2622y();
                f25126a = aVar;
                f25127b = num == null ? 1 : num.intValue();
            }
        }
        aVar = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new C2575i() : new a();
        f25126a = aVar;
        f25127b = num == null ? 1 : num.intValue();
    }

    private static Integer a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e10) {
            PrintStream printStream = System.err;
            printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e10.printStackTrace(printStream);
            return null;
        }
    }

    public static void b(Throwable th) {
        f25126a.a(th);
    }
}
