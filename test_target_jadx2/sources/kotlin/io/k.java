package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
class k {
    private static final int a(String str) {
        int W10;
        char c10 = File.separatorChar;
        int W11 = StringsKt.W(str, c10, 0, false, 4, null);
        if (W11 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (W10 = StringsKt.W(str, c10, 2, false, 4, null)) < 0) {
                return 1;
            }
            int W12 = StringsKt.W(str, c10, W10 + 1, false, 4, null);
            return W12 >= 0 ? W12 + 1 : str.length();
        }
        if (W11 > 0 && str.charAt(W11 - 1) == ':') {
            return W11 + 1;
        }
        if (W11 == -1 && StringsKt.N(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final g b(File file) {
        List list;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.d(path);
        int a10 = a(path);
        String substring = path.substring(0, a10);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = path.substring(a10);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        if (substring2.length() == 0) {
            list = CollectionsKt.j();
        } else {
            List x02 = StringsKt.x0(substring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(CollectionsKt.u(x02, 10));
            Iterator it = x02.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new g(new File(substring), list);
    }
}
