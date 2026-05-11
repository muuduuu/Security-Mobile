package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v3.InterfaceC4924d;

/* loaded from: classes2.dex */
public abstract class g extends y3.g implements InterfaceC4924d {

    /* renamed from: e, reason: collision with root package name */
    public static final a f22526e = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public g() {
        super(new b());
    }

    @Override // v3.InterfaceC4924d
    public void a(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // v3.InterfaceC4924d
    public void k(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        x(i10, ModuleDescriptor.MODULE_VERSION);
        return super.onLevelChange(i10);
    }

    @Override // v3.InterfaceC4924d
    public void p(String id2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    public abstract void x(int i10, int i11);
}
