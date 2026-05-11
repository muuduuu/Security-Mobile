package Lb;

import Ea.i;
import Lb.a;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class b implements i {
    private final void g(Uri uri) {
        if (uri == null) {
            return;
        }
        a.Companion companion = a.INSTANCE;
        companion.b(uri);
        Iterator it = companion.a().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(uri);
        }
    }

    @Override // Ea.i
    public void b(Activity activity, Bundle bundle) {
        Intent intent;
        g((activity == null || (intent = activity.getIntent()) == null) ? null : intent.getData());
    }

    @Override // Ea.i
    public boolean onNewIntent(Intent intent) {
        g(intent != null ? intent.getData() : null);
        return true;
    }
}
