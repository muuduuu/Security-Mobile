package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.AbstractC3126a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3128c extends AbstractC3126a {
    @Override // f.AbstractC3126a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
        Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_GET…          .setType(input)");
        return type;
    }

    @Override // f.AbstractC3126a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC3126a.C0476a b(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // f.AbstractC3126a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Uri c(int i10, Intent intent) {
        if (i10 != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
