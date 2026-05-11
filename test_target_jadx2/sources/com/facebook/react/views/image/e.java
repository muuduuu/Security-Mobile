package com.facebook.react.views.image;

import android.graphics.Bitmap;
import f3.AbstractC3142a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements m4.d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f22524b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final List f22525a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m4.d a(List postprocessors) {
            Intrinsics.checkNotNullParameter(postprocessors, "postprocessors");
            int size = postprocessors.size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (size != 0) {
                return size != 1 ? new e(postprocessors, defaultConstructorMarker) : (m4.d) postprocessors.get(0);
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ e(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Override // m4.d
    public AbstractC3142a a(Bitmap sourceBitmap, Y3.d bitmapFactory) {
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
        AbstractC3142a abstractC3142a = null;
        try {
            AbstractC3142a abstractC3142a2 = null;
            for (m4.d dVar : this.f22525a) {
                if (abstractC3142a2 != null && (r4 = (Bitmap) abstractC3142a2.p()) != null) {
                    abstractC3142a = dVar.a(r4, bitmapFactory);
                    AbstractC3142a.n(abstractC3142a2);
                    abstractC3142a2 = abstractC3142a.clone();
                }
                Bitmap bitmap = sourceBitmap;
                abstractC3142a = dVar.a(bitmap, bitmapFactory);
                AbstractC3142a.n(abstractC3142a2);
                abstractC3142a2 = abstractC3142a.clone();
            }
            if (abstractC3142a != null) {
                AbstractC3142a clone = abstractC3142a.clone();
                Intrinsics.checkNotNullExpressionValue(clone, "clone(...)");
                AbstractC3142a.n(abstractC3142a);
                return clone;
            }
            throw new IllegalStateException(("MultiPostprocessor returned null bitmap - Number of Postprocessors: " + this.f22525a.size()).toString());
        } catch (Throwable th) {
            AbstractC3142a.n(null);
            throw th;
        }
    }

    @Override // m4.d
    public V2.d b() {
        List list = this.f22525a;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((m4.d) it.next()).b());
        }
        return new V2.f(arrayList);
    }

    @Override // m4.d
    public String getName() {
        return "MultiPostProcessor (" + CollectionsKt.l0(this.f22525a, ",", null, null, 0, null, null, 62, null) + ")";
    }

    private e(List list) {
        this.f22525a = new LinkedList(list);
    }
}
