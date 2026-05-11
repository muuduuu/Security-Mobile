package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.AbstractC3126a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3127b extends AbstractC3126a {

    /* renamed from: a, reason: collision with root package name */
    private final String f32773a;

    public C3127b(String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f32773a = mimeType;
    }

    @Override // f.AbstractC3126a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f32773a).putExtra("android.intent.extra.TITLE", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
        return putExtra;
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

    public C3127b() {
        this("*/*");
    }
}
