package com.facebook.react;

import c3.AbstractC1721a;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class S {

    class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        int f21150a = 0;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f21151b;

        a(List list) {
            this.f21151b = list;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            List list = this.f21151b;
            int i10 = this.f21150a;
            this.f21150a = i10 + 1;
            return new ModuleHolder((NativeModule) list.get(i10));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21150a < this.f21151b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove methods ");
        }
    }

    static Iterable b(P p10, ReactApplicationContext reactApplicationContext) {
        AbstractC1721a.b("ReactNative", p10.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        final List createNativeModules = p10.createNativeModules(reactApplicationContext);
        return new Iterable() { // from class: com.facebook.react.Q
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                Iterator c10;
                c10 = S.c(createNativeModules);
                return c10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator c(List list) {
        return new a(list);
    }
}
