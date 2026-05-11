package f;

import android.content.Context;
import android.content.Intent;
import f.AbstractC3126a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.t;

/* renamed from: f.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3134i extends AbstractC3126a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32781a = new a(null);

    /* renamed from: f.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String[] input) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        private a() {
        }
    }

    @Override // f.AbstractC3126a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return f32781a.a(input);
    }

    @Override // f.AbstractC3126a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC3126a.C0476a b(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return new AbstractC3126a.C0476a(G.h());
        }
        for (String str : input) {
            if (androidx.core.content.a.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(G.d(input.length), 16));
        for (String str2 : input) {
            Pair a10 = t.a(str2, Boolean.TRUE);
            linkedHashMap.put(a10.c(), a10.d());
        }
        return new AbstractC3126a.C0476a(linkedHashMap);
    }

    @Override // f.AbstractC3126a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i10, Intent intent) {
        if (i10 != -1) {
            return G.h();
        }
        if (intent == null) {
            return G.h();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return G.h();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        return G.r(CollectionsKt.V0(AbstractC3574i.x(stringArrayExtra), arrayList));
    }
}
