package androidx.work.impl;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f18167a = new F();

    private F() {
    }

    private final File c(Context context) {
        return new File(C1615a.f18250a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(context, "context");
        F f10 = f18167a;
        if (f10.b(context).exists()) {
            x1.n e10 = x1.n.e();
            str = G.f18168a;
            e10.a(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : f10.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        x1.n e11 = x1.n.e();
                        str3 = G.f18168a;
                        e11.k(str3, "Over-writing contents of " + file2);
                    }
                    String str4 = file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed";
                    x1.n e12 = x1.n.e();
                    str2 = G.f18168a;
                    e12.a(str2, str4);
                }
            }
        }
    }

    public final File a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map e(Context context) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        File b10 = b(context);
        File a10 = a(context);
        strArr = G.f18169b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(kotlin.collections.G.d(strArr.length), 16));
        for (String str : strArr) {
            Pair a11 = lc.t.a(new File(b10.getPath() + str), new File(a10.getPath() + str));
            linkedHashMap.put(a11.c(), a11.d());
        }
        return kotlin.collections.G.o(linkedHashMap, lc.t.a(b10, a10));
    }
}
