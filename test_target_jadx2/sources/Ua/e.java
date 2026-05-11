package Ua;

import android.net.Uri;
import i2.h;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o2.n;
import xc.m;

/* loaded from: classes2.dex */
public final class e implements n {

    static final class a extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10399a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    private final Object d(Uri uri, int i10, Object obj, Function1 function1) {
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) CollectionsKt.f0(pathSegments, i10);
        return str == null ? obj : function1.invoke(str);
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(d model, int i10, int i11, h options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        return new n.a(new C2.c(model), new Ua.a((String) d(model.b(), 0, null, a.f10399a), model.c(), model.a(), 1.0f));
    }

    @Override // o2.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }
}
