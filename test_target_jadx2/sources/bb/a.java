package Bb;

import expo.modules.kotlin.jni.JavaScriptObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Map f556a = new LinkedHashMap();

    /* renamed from: Bb.a$a, reason: collision with other inner class name */
    static final class C0012a extends m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f558b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0012a(Class cls) {
            super(0);
            this.f558b = cls;
        }

        public final void a() {
            a.this.c(this.f558b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Class cls) {
        this.f556a.remove(cls);
    }

    public final void b(Class cls, JavaScriptObject js) {
        Intrinsics.checkNotNullParameter(cls, "native");
        Intrinsics.checkNotNullParameter(js, "js");
        js.c(new C0012a(cls));
        this.f556a.put(cls, js);
    }

    public final JavaScriptObject d(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "native");
        return (JavaScriptObject) this.f556a.get(cls);
    }
}
