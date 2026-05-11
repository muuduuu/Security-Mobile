package com.facebook.react.defaults;

import com.facebook.jni.HybridData;
import com.facebook.react.W;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;", "Lcom/facebook/react/W;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", BuildConfig.FLAVOR, "Lcom/facebook/react/P;", "packages", BuildConfig.FLAVOR, "cxxReactPackages", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Ljava/util/List;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "d", C4870a.f43493a, "b", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultTurboModuleManagerDelegate extends W {

    /* renamed from: d, reason: collision with root package name */
    private static final b f21439d = new b(null);

    public static final class a extends W.a {

        /* renamed from: c, reason: collision with root package name */
        private List f21440c = new ArrayList();

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.W.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public DefaultTurboModuleManagerDelegate b(ReactApplicationContext context, List packages) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(packages, "packages");
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f21440c.iterator();
            while (it.hasNext()) {
                arrayList.add(((Function1) it.next()).invoke(context));
            }
            return new DefaultTurboModuleManagerDelegate(context, packages, arrayList, null);
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HybridData initHybrid(List<Object> list) {
            return DefaultTurboModuleManagerDelegate.initHybrid(list);
        }

        private b() {
        }
    }

    static {
        c.f21448a.a();
    }

    public /* synthetic */ DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, list, list2);
    }

    public static final native HybridData initHybrid(List<Object> list);

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    protected HybridData initHybrid() {
        throw new UnsupportedOperationException("DefaultTurboModuleManagerDelegate.initHybrid() must never be called!");
    }

    private DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List list, List list2) {
        super(reactApplicationContext, list, f21439d.initHybrid(list2));
    }
}
