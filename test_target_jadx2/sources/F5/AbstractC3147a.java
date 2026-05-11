package f5;

import android.support.v4.media.session.b;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.AbstractC1899n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3147a {

    /* renamed from: a, reason: collision with root package name */
    private static final List f32878a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f32879b = new HashMap();

    public static View a(View view, String str) {
        String b10 = b(view);
        if (b10 != null && b10.equals(str)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View a10 = a(viewGroup.getChildAt(i10), str);
            if (a10 != null) {
                return a10;
            }
        }
        return null;
    }

    private static String b(View view) {
        Object tag = view.getTag(AbstractC1899n.f21881D);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static void c(View view) {
        String b10 = b(view);
        if (b10 == null) {
            return;
        }
        Iterator it = f32878a.iterator();
        if (it.hasNext()) {
            b.a(it.next());
            throw null;
        }
        for (Map.Entry entry : f32879b.entrySet()) {
            Set set = (Set) entry.getValue();
            if (set != null && set.contains(b10)) {
                b.a(entry.getKey());
                throw null;
            }
        }
    }
}
