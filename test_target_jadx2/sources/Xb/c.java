package xb;

import expo.modules.kotlin.views.o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pb.C3863b;
import vb.f;
import yb.C5185c;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f44949a;

    /* renamed from: b, reason: collision with root package name */
    private final C5185c f44950b;

    /* renamed from: c, reason: collision with root package name */
    private final o f44951c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f44952d;

    /* renamed from: e, reason: collision with root package name */
    private final Function2 f44953e;

    /* renamed from: f, reason: collision with root package name */
    private final List f44954f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f44955g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f44956h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f44957i;

    /* renamed from: j, reason: collision with root package name */
    private final f f44958j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f44959k;

    /* renamed from: l, reason: collision with root package name */
    private final C3863b f44960l;

    public c(String name, C5185c objectDefinition, o oVar, Map eventListeners, Function2 function2, List classData) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(objectDefinition, "objectDefinition");
        Intrinsics.checkNotNullParameter(eventListeners, "eventListeners");
        Intrinsics.checkNotNullParameter(classData, "classData");
        this.f44949a = name;
        this.f44950b = objectDefinition;
        this.f44951c = oVar;
        this.f44952d = eventListeners;
        this.f44953e = function2;
        this.f44954f = classData;
        this.f44955g = objectDefinition.b();
        this.f44956h = objectDefinition.f();
        this.f44957i = objectDefinition.a();
        this.f44958j = objectDefinition.c();
        this.f44959k = objectDefinition.e();
        this.f44960l = objectDefinition.d();
    }

    public final Map a() {
        return this.f44957i;
    }

    public final List b() {
        return this.f44954f;
    }

    public final Map c() {
        return this.f44952d;
    }

    public final f d() {
        return this.f44958j;
    }

    public final String e() {
        return this.f44949a;
    }

    public final C5185c f() {
        return this.f44950b;
    }

    public final Function2 g() {
        return this.f44953e;
    }

    public final o h() {
        return this.f44951c;
    }
}
