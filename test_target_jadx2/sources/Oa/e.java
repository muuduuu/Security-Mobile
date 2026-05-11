package Oa;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kb.InterfaceC3558b;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public class e implements InterfaceC3558b, Ea.d {
    private final EnumSet d(String str, Context context) {
        Object obj;
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            Iterator it = f(context).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str2 = (String) obj;
                Intrinsics.d(canonicalPath);
                if (StringsKt.F(canonicalPath, str2 + "/", false, 2, null) || Intrinsics.b(str2, canonicalPath)) {
                    break;
                }
            }
            if (((String) obj) != null) {
                return EnumSet.of(kb.c.READ, kb.c.WRITE);
            }
            return null;
        } catch (IOException unused) {
            return EnumSet.noneOf(kb.c.class);
        }
    }

    private final List f(Context context) {
        return CollectionsKt.m(context.getFilesDir().getCanonicalPath(), context.getCacheDir().getCanonicalPath());
    }

    @Override // kb.InterfaceC3558b
    public EnumSet a(Context context, String path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        EnumSet d10 = d(path, context);
        return d10 == null ? b(path) : d10;
    }

    protected EnumSet b(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        EnumSet noneOf = EnumSet.noneOf(kb.c.class);
        if (file.canRead()) {
            noneOf.add(kb.c.READ);
        }
        if (file.canWrite()) {
            noneOf.add(kb.c.WRITE);
        }
        Intrinsics.checkNotNullExpressionValue(noneOf, "apply(...)");
        return noneOf;
    }

    @Override // Ea.d
    public List e() {
        return CollectionsKt.e(InterfaceC3558b.class);
    }
}
