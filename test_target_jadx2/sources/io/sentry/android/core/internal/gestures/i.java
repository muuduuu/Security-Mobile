package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.b;
import io.sentry.util.n;
import java.util.Iterator;
import java.util.LinkedList;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public abstract class i {
    static io.sentry.internal.gestures.b a(SentryAndroidOptions sentryAndroidOptions, View view, float f10, float f11, b.a aVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.b bVar = null;
        while (linkedList.size() > 0) {
            View view2 = (View) n.c((View) linkedList.poll(), "view is required");
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    linkedList.add(viewGroup.getChildAt(i10));
                }
            }
            Iterator<io.sentry.internal.gestures.a> it = sentryAndroidOptions.getGestureTargetLocators().iterator();
            while (it.hasNext()) {
                io.sentry.internal.gestures.b a10 = it.next().a(view2, f10, f11, aVar);
                if (a10 != null) {
                    if (aVar != b.a.CLICKABLE) {
                        return a10;
                    }
                    bVar = a10;
                }
            }
        }
        return bVar;
    }

    public static String b(View view) {
        int id2 = view.getId();
        if (id2 == -1 || c(id2)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id2) : BuildConfig.FLAVOR;
    }

    private static boolean c(int i10) {
        return ((-16777216) & i10) == 0 && (i10 & 16777215) != 0;
    }
}
