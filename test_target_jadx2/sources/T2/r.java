package T2;

import Jd.AbstractC0887i;
import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.N;
import Q2.AbstractC1123b;
import T2.s;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.lifecycle.AbstractC1600q;
import androidx.lifecycle.InterfaceC1608z;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.RecyclerView;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import e.AbstractC3061c;
import e.InterfaceC3060b;
import f.C3127b;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import u5.C4870a;
import xc.C5142C;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u00018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020*H\u0017¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000201H\u0016¢\u0006\u0004\b6\u00104R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010@\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010?R\"\u0010E\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u000101010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, d2 = {"LT2/r;", "Landroidx/fragment/app/o;", "Landroidx/appcompat/widget/SearchView$m;", "<init>", "()V", BuildConfig.FLAVOR, "a0", "b0", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", BuildConfig.FLAVOR, "Y", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Z", "Z", "P", "LT2/a;", "type", "formatRequestBody", BuildConfig.FLAVOR, "LT2/s;", "V", "(LT2/a;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "W", "(LT2/a;Landroid/net/Uri;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "query", "i", "(Ljava/lang/String;)Z", "newText", "g", "LT2/u;", C4870a.f43493a, "Lkotlin/Lazy;", "R", "()LT2/u;", "viewModel", "b", "Q", "()LT2/a;", "payloadType", "Le/c;", "kotlin.jvm.PlatformType", "c", "Le/c;", "saveToFile", "LM2/g;", "d", "LM2/g;", "payloadBinding", "LT2/g;", "e", "LT2/g;", "payloadAdapter", BuildConfig.FLAVOR, "f", "I", "backgroundSpanColor", "foregroundSpanColor", "h", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class r extends ComponentCallbacksC1573o implements SearchView.m {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy payloadType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3061c saveToFile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private M2.g payloadBinding;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final T2.g payloadAdapter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int backgroundSpanColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int foregroundSpanColor;

    /* renamed from: T2.r$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a(a type) {
            Intrinsics.checkNotNullParameter(type, "type");
            r rVar = new r();
            Bundle bundle = new Bundle();
            bundle.putSerializable("type", type);
            Unit unit = Unit.f36324a;
            rVar.setArguments(bundle);
            return rVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9198a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.REQUEST.ordinal()] = 1;
            iArr[a.RESPONSE.ordinal()] = 2;
            f9198a = iArr;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f9199a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ HttpTransaction f9201c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9202d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(HttpTransaction httpTransaction, boolean z10, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f9201c = httpTransaction;
            this.f9202d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return r.this.new c(this.f9201c, this.f9202d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f9199a;
            if (i10 == 0) {
                lc.p.b(obj);
                M2.g gVar = r.this.payloadBinding;
                if (gVar == null) {
                    Intrinsics.v("payloadBinding");
                    throw null;
                }
                gVar.f6046e.setVisibility(0);
                r rVar = r.this;
                a Q10 = rVar.Q();
                HttpTransaction httpTransaction = this.f9201c;
                boolean z10 = this.f9202d;
                this.f9199a = 1;
                obj = rVar.V(Q10, httpTransaction, z10, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                r.this.a0();
            } else {
                r.this.payloadAdapter.E(list);
                r.this.b0();
            }
            r.this.requireActivity().invalidateOptionsMenu();
            M2.g gVar2 = r.this.payloadBinding;
            if (gVar2 != null) {
                gVar2.f6046e.setVisibility(8);
                return Unit.f36324a;
            }
            Intrinsics.v("payloadBinding");
            throw null;
        }
    }

    static final class d extends xc.m implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            Bundle arguments = r.this.getArguments();
            Serializable serializable = arguments == null ? null : arguments.getSerializable("type");
            if (serializable != null) {
                return (a) serializable;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.chuckerteam.chucker.internal.ui.transaction.PayloadType");
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f9204a;

        /* renamed from: b, reason: collision with root package name */
        Object f9205b;

        /* renamed from: c, reason: collision with root package name */
        int f9206c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f9207d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ HttpTransaction f9208e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9209f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f9210g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a aVar, HttpTransaction httpTransaction, boolean z10, r rVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f9207d = aVar;
            this.f9208e = httpTransaction;
            this.f9209f = z10;
            this.f9210g = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new e(this.f9207d, this.f9208e, this.f9209f, this.f9210g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((e) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List arrayList;
            String responseHeadersString;
            boolean isResponseBodyPlainText;
            String formattedResponseBody;
            Bitmap bitmap;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f9206c;
            if (i10 == 0) {
                lc.p.b(obj);
                arrayList = new ArrayList();
                if (this.f9207d == a.REQUEST) {
                    responseHeadersString = this.f9208e.getRequestHeadersString(true);
                    isResponseBodyPlainText = this.f9208e.getIsRequestBodyPlainText();
                    if (this.f9209f) {
                        formattedResponseBody = this.f9208e.getFormattedRequestBody();
                    } else {
                        formattedResponseBody = this.f9208e.getRequestBody();
                        if (formattedResponseBody == null) {
                            formattedResponseBody = BuildConfig.FLAVOR;
                        }
                    }
                } else {
                    responseHeadersString = this.f9208e.getResponseHeadersString(true);
                    isResponseBodyPlainText = this.f9208e.getIsResponseBodyPlainText();
                    formattedResponseBody = this.f9208e.getFormattedResponseBody();
                }
                if (!StringsKt.Z(responseHeadersString)) {
                    Spanned a10 = androidx.core.text.b.a(responseHeadersString, 0);
                    Intrinsics.checkNotNullExpressionValue(a10, "fromHtml(\n                            headersString,\n                            HtmlCompat.FROM_HTML_MODE_LEGACY\n                        )");
                    arrayList.add(new s.b(a10));
                }
                Bitmap responseImageBitmap = this.f9208e.getResponseImageBitmap();
                if (this.f9207d != a.RESPONSE || responseImageBitmap == null) {
                    if (!isResponseBodyPlainText) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(this.f9210g.requireContext().getString(K2.g.f5224c));
                        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(it)");
                        kotlin.coroutines.jvm.internal.b.a(arrayList.add(new s.a(valueOf)));
                    } else if (!StringsKt.Z(formattedResponseBody)) {
                        Iterator it = StringsKt.g0(formattedResponseBody).iterator();
                        while (it.hasNext()) {
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf((String) it.next());
                            Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(it)");
                            arrayList.add(new s.a(valueOf2));
                        }
                    }
                    return arrayList;
                }
                this.f9204a = arrayList;
                this.f9205b = responseImageBitmap;
                this.f9206c = 1;
                Object d10 = AbstractC1123b.d(responseImageBitmap, this);
                if (d10 == e10) {
                    return e10;
                }
                bitmap = responseImageBitmap;
                obj = d10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bitmap = (Bitmap) this.f9205b;
                arrayList = (List) this.f9204a;
                lc.p.b(obj);
            }
            arrayList.add(new s.c(bitmap, (Double) obj));
            return arrayList;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f9211a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f9213c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ HttpTransaction f9214d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Uri uri, HttpTransaction httpTransaction, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f9213c = uri;
            this.f9214d = httpTransaction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return r.this.new f(this.f9213c, this.f9214d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((f) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f9211a;
            if (i10 == 0) {
                lc.p.b(obj);
                r rVar = r.this;
                a Q10 = rVar.Q();
                Uri uri = this.f9213c;
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                HttpTransaction httpTransaction = this.f9214d;
                this.f9211a = 1;
                obj = rVar.W(Q10, uri, httpTransaction, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            Toast.makeText(r.this.getContext(), ((Boolean) obj).booleanValue() ? K2.g.f5239r : K2.g.f5238q, 0).show();
            return Unit.f36324a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f9215a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f9217c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T2.a f9218d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ HttpTransaction f9219e;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9220a;

            static {
                int[] iArr = new int[T2.a.values().length];
                iArr[T2.a.REQUEST.ordinal()] = 1;
                iArr[T2.a.RESPONSE.ordinal()] = 2;
                f9220a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Uri uri, T2.a aVar, HttpTransaction httpTransaction, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f9217c = uri;
            this.f9218d = aVar;
            this.f9219e = httpTransaction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return r.this.new g(this.f9217c, this.f9218d, this.f9219e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((g) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Long c10;
            long longValue;
            Long c11;
            AbstractC3868b.e();
            if (this.f9215a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            try {
                ParcelFileDescriptor openFileDescriptor = r.this.requireContext().getContentResolver().openFileDescriptor(this.f9217c, "w");
                if (openFileDescriptor != null) {
                    T2.a aVar = this.f9218d;
                    HttpTransaction httpTransaction = this.f9219e;
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(openFileDescriptor.getFileDescriptor());
                        try {
                            int i10 = a.f9220a[aVar.ordinal()];
                            if (i10 == 1) {
                                String requestBody = httpTransaction.getRequestBody();
                                if (requestBody == null) {
                                    c10 = null;
                                } else {
                                    byte[] bytes = requestBody.getBytes(Charsets.UTF_8);
                                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                                    c10 = kotlin.coroutines.jvm.internal.b.c(kotlin.io.b.b(new ByteArrayInputStream(bytes), fileOutputStream, 0, 2, null));
                                }
                                if (c10 == null) {
                                    throw new IOException("Transaction not ready");
                                }
                                longValue = c10.longValue();
                            } else {
                                if (i10 != 2) {
                                    throw new lc.m();
                                }
                                String responseBody = httpTransaction.getResponseBody();
                                if (responseBody == null) {
                                    c11 = null;
                                } else {
                                    byte[] bytes2 = responseBody.getBytes(Charsets.UTF_8);
                                    Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                                    c11 = kotlin.coroutines.jvm.internal.b.c(kotlin.io.b.b(new ByteArrayInputStream(bytes2), fileOutputStream, 0, 2, null));
                                }
                                if (c11 == null) {
                                    throw new IOException("Transaction not ready");
                                }
                                longValue = c11.longValue();
                            }
                            Long c12 = kotlin.coroutines.jvm.internal.b.c(longValue);
                            kotlin.io.c.a(fileOutputStream, null);
                            kotlin.coroutines.jvm.internal.b.c(c12.longValue());
                            kotlin.io.c.a(openFileDescriptor, null);
                        } finally {
                        }
                    } finally {
                    }
                }
                return kotlin.coroutines.jvm.internal.b.a(true);
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
                return kotlin.coroutines.jvm.internal.b.a(false);
            } catch (IOException e11) {
                e11.printStackTrace();
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
        }
    }

    public static final class h extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC1573o f9221a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacksC1573o componentCallbacksC1573o) {
            super(0);
            this.f9221a = componentCallbacksC1573o;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            AbstractActivityC1577t requireActivity = this.f9221a.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            W viewModelStore = requireActivity.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    public static final class i extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC1573o f9222a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacksC1573o componentCallbacksC1573o) {
            super(0);
            this.f9222a = componentCallbacksC1573o;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.c invoke() {
            AbstractActivityC1577t requireActivity = this.f9222a.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            return requireActivity.getDefaultViewModelProviderFactory();
        }
    }

    static final class j extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f9223a = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.c invoke() {
            return new v(0L, 1, null);
        }
    }

    public r() {
        Function0 function0 = j.f9223a;
        this.viewModel = androidx.fragment.app.V.a(this, C5142C.b(u.class), new h(this), function0 == null ? new i(this) : function0);
        this.payloadType = lc.i.b(lc.l.NONE, new d());
        AbstractC3061c registerForActivityResult = registerForActivityResult(new C3127b(), new InterfaceC3060b() { // from class: T2.q
            @Override // e.InterfaceC3060b
            public final void a(Object obj) {
                r.X(r.this, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.CreateDocument()) { uri ->\n        val transaction = viewModel.transaction.value\n        if (uri != null && transaction != null) {\n            lifecycleScope.launch {\n                val result = saveToFile(payloadType, uri, transaction)\n                val toastMessageId = if (result) {\n                    R.string.chucker_file_saved\n                } else {\n                    R.string.chucker_file_not_saved\n                }\n                Toast.makeText(context, toastMessageId, Toast.LENGTH_SHORT).show()\n            }\n        } else {\n            Toast.makeText(\n                requireContext(),\n                R.string.chucker_save_failed_to_open_document,\n                Toast.LENGTH_SHORT\n            ).show()\n        }\n    }");
        this.saveToFile = registerForActivityResult;
        this.payloadAdapter = new T2.g();
        this.backgroundSpanColor = -256;
        this.foregroundSpanColor = -65536;
    }

    private final void P() {
        this.saveToFile.a(Intrinsics.m("chucker-export-", Long.valueOf(System.currentTimeMillis())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a Q() {
        return (a) this.payloadType.getValue();
    }

    private final u R() {
        return (u) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(r this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(Menu menu, Boolean it) {
        Intrinsics.checkNotNullParameter(menu, "$menu");
        MenuItem findItem = menu.findItem(K2.d.f5173q);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        findItem.setVisible(it.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(r this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HttpTransaction httpTransaction = (HttpTransaction) pair.getFirst();
        boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
        if (httpTransaction == null) {
            return;
        }
        AbstractC0891k.d(AbstractC1600q.a(this$0), null, null, this$0.new c(httpTransaction, booleanValue, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object V(a aVar, HttpTransaction httpTransaction, boolean z10, kotlin.coroutines.d dVar) {
        return AbstractC0887i.g(C0874b0.a(), new e(aVar, httpTransaction, z10, this, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object W(a aVar, Uri uri, HttpTransaction httpTransaction, kotlin.coroutines.d dVar) {
        return AbstractC0887i.g(C0874b0.b(), new g(uri, aVar, httpTransaction, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(r this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HttpTransaction httpTransaction = (HttpTransaction) this$0.R().j().f();
        if (uri == null || httpTransaction == null) {
            Toast.makeText(this$0.requireContext(), K2.g.f5206H, 0).show();
        } else {
            AbstractC0891k.d(AbstractC1600q.a(this$0), null, null, this$0.new f(uri, httpTransaction, null), 3, null);
        }
    }

    private final boolean Y(HttpTransaction transaction) {
        if (Q() == a.REQUEST) {
            if (!(transaction == null ? false : Intrinsics.b(0L, transaction.getRequestPayloadSize()))) {
                return true;
            }
        } else {
            if (Q() != a.RESPONSE) {
                return true;
            }
            if (!(transaction == null ? false : Intrinsics.b(0L, transaction.getResponsePayloadSize()))) {
                return true;
            }
        }
        return false;
    }

    private final boolean Z(HttpTransaction transaction) {
        int i10 = b.f9198a[Q().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new lc.m();
            }
            if (transaction == null || true != transaction.getIsResponseBodyPlainText()) {
                return false;
            }
            Long responsePayloadSize = transaction.getResponsePayloadSize();
            if (responsePayloadSize != null && 0 == responsePayloadSize.longValue()) {
                return false;
            }
        } else {
            if (transaction == null || true != transaction.getIsRequestBodyPlainText()) {
                return false;
            }
            Long requestPayloadSize = transaction.getRequestPayloadSize();
            if (requestPayloadSize != null && 0 == requestPayloadSize.longValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        M2.g gVar = this.payloadBinding;
        if (gVar == null) {
            Intrinsics.v("payloadBinding");
            throw null;
        }
        gVar.f6044c.setText(Q() == a.RESPONSE ? getString(K2.g.f5203E) : getString(K2.g.f5247z));
        gVar.f6045d.setVisibility(0);
        gVar.f6047f.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        M2.g gVar = this.payloadBinding;
        if (gVar == null) {
            Intrinsics.v("payloadBinding");
            throw null;
        }
        gVar.f6045d.setVisibility(8);
        gVar.f6047f.setVisibility(0);
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public boolean g(String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        if (StringsKt.Z(newText) || newText.length() <= 1) {
            this.payloadAdapter.D();
        } else {
            this.payloadAdapter.A(newText, this.backgroundSpanColor, this.foregroundSpanColor);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public boolean i(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.backgroundSpanColor = androidx.core.content.a.c(context, K2.a.f5099a);
        this.foregroundSpanColor = androidx.core.content.a.c(context, K2.a.f5106h);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onCreateOptionsMenu(final Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        HttpTransaction httpTransaction = (HttpTransaction) R().j().f();
        if (Z(httpTransaction)) {
            MenuItem findItem = menu.findItem(K2.d.f5132M);
            findItem.setVisible(true);
            View actionView = findItem.getActionView();
            if (actionView == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
            }
            SearchView searchView = (SearchView) actionView;
            searchView.setOnQueryTextListener(this);
            searchView.setIconifiedByDefault(true);
        }
        if (Y(httpTransaction)) {
            MenuItem findItem2 = menu.findItem(K2.d.f5131L);
            findItem2.setVisible(true);
            findItem2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: T2.o
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean S10;
                    S10 = r.S(r.this, menuItem);
                    return S10;
                }
            });
        }
        if (Q() == a.REQUEST) {
            R().f().i(getViewLifecycleOwner(), new InterfaceC1608z() { // from class: T2.p
                @Override // androidx.lifecycle.InterfaceC1608z
                public final void b(Object obj) {
                    r.T(menu, (Boolean) obj);
                }
            });
        } else {
            menu.findItem(K2.d.f5173q).setVisible(false);
        }
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        M2.g c10 = M2.g.c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(\n            inflater,\n            container,\n            false\n        )");
        this.payloadBinding = c10;
        if (c10 != null) {
            return c10.b();
        }
        Intrinsics.v("payloadBinding");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        M2.g gVar = this.payloadBinding;
        if (gVar == null) {
            Intrinsics.v("payloadBinding");
            throw null;
        }
        RecyclerView recyclerView = gVar.f6047f;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.payloadAdapter);
        Q2.r.e(R().j(), R().i()).i(getViewLifecycleOwner(), new InterfaceC1608z() { // from class: T2.n
            @Override // androidx.lifecycle.InterfaceC1608z
            public final void b(Object obj) {
                r.U(r.this, (Pair) obj);
            }
        });
    }
}
