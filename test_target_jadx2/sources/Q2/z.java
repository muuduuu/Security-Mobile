package Q2;

import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class z {
    private static final SpannableStringBuilder a(String str, List list, int i10, int i11, int i12) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            int i13 = intValue + i10;
            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, i13, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), intValue, i13, 33);
            spannableStringBuilder.setSpan(new BackgroundColorSpan(i11), intValue, i13, 33);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder b(String str, String search, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(search, "search");
        return a(str, c(str, search), search.length(), i10, i11);
    }

    private static final List c(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int T10 = StringsKt.T(str, str2, 0, true);
        while (T10 >= 0) {
            arrayList.add(Integer.valueOf(T10));
            T10 = StringsKt.T(str, str2, T10 + 1, true);
        }
        return arrayList;
    }
}
