package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.AbstractC3126a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class k extends AbstractC3126a {
    @Override // f.AbstractC3126a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Uri input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
        return putExtra;
    }

    @Override // f.AbstractC3126a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC3126a.C0476a b(Context context, Uri input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // f.AbstractC3126a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Boolean c(int i10, Intent intent) {
        return Boolean.valueOf(i10 == -1);
    }
}
