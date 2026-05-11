package T2;

import Q2.C1125d;
import T2.s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class t extends RecyclerView.F {

    public static final class a extends t {

        /* renamed from: u, reason: collision with root package name */
        private final M2.j f9228u;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(M2.j bodyBinding) {
            super(r0, null);
            Intrinsics.checkNotNullParameter(bodyBinding, "bodyBinding");
            TextView b10 = bodyBinding.b();
            Intrinsics.checkNotNullExpressionValue(b10, "bodyBinding.root");
            this.f9228u = bodyBinding;
        }

        @Override // T2.t
        public void O(s item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof s.a) {
                this.f9228u.f6063b.setText(((s.a) item).a());
            }
        }
    }

    public static final class b extends t {

        /* renamed from: u, reason: collision with root package name */
        private final M2.k f9229u;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(M2.k headerBinding) {
            super(r0, null);
            Intrinsics.checkNotNullParameter(headerBinding, "headerBinding");
            TextView b10 = headerBinding.b();
            Intrinsics.checkNotNullExpressionValue(b10, "headerBinding.root");
            this.f9229u = headerBinding;
        }

        @Override // T2.t
        public void O(s item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof s.b) {
                this.f9229u.f6065b.setText(((s.b) item).a());
            }
        }
    }

    public static final class c extends t {

        /* renamed from: v, reason: collision with root package name */
        private static final a f9230v = new a(null);

        /* renamed from: u, reason: collision with root package name */
        private final M2.l f9231u;

        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(M2.l imageBinding) {
            super(r0, null);
            Intrinsics.checkNotNullParameter(imageBinding, "imageBinding");
            FrameLayout b10 = imageBinding.b();
            Intrinsics.checkNotNullExpressionValue(b10, "imageBinding.root");
            this.f9231u = imageBinding;
        }

        private final Drawable P(Double d10) {
            if (d10 == null) {
                return null;
            }
            if (d10.doubleValue() < 0.25d) {
                C1125d.a aVar = C1125d.f8085b;
                Context context = this.f17450a.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                return aVar.a(context, K2.a.f5101c, K2.a.f5103e, K2.b.f5113a);
            }
            C1125d.a aVar2 = C1125d.f8085b;
            Context context2 = this.f17450a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
            return aVar2.a(context2, K2.a.f5100b, K2.a.f5102d, K2.b.f5113a);
        }

        @Override // T2.t
        public void O(s item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof s.c) {
                s.c cVar = (s.c) item;
                this.f9231u.f6067b.setImageBitmap(cVar.a());
                this.f9231u.b().setBackground(P(cVar.b()));
            }
        }
    }

    public /* synthetic */ t(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    public abstract void O(s sVar);

    private t(View view) {
        super(view);
    }
}
