package com.canhub.cropper;

import F2.a;
import F2.b;
import F2.q;
import F2.r;
import F2.u;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.canhub.cropper.CropOverlayView;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 ¤\u00022\u00020\u00012\u00020\u0002:\fs\u001f\u0014:TU4\u0019![XRB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0012\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u0015J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010&J\u0015\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0016¢\u0006\u0004\b*\u0010&J\u0015\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0016¢\u0006\u0004\b,\u0010&J\u0015\u0010.\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u001b¢\u0006\u0004\b.\u0010/J'\u00104\u001a\u0004\u0018\u00010\t2\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105JK\u0010:\u001a\u00020\u00112\b\b\u0002\u00107\u001a\u0002062\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00109\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00112\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00112\b\u0010=\u001a\u0004\u0018\u00010@¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00112\b\u0010=\u001a\u0004\u0018\u00010C¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00112\b\u0010=\u001a\u0004\u0018\u00010F¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00112\b\u0010=\u001a\u0004\u0018\u00010I¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u00112\b\u0010N\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020\u000b¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u0011¢\u0006\u0004\bT\u0010\u0015J\r\u0010U\u001a\u00020\u0011¢\u0006\u0004\bU\u0010\u0015J\u0015\u0010X\u001a\u00020\u00112\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u0015\u0010[\u001a\u00020\u00112\u0006\u0010W\u001a\u00020Z¢\u0006\u0004\b[\u0010\\J?\u0010]\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u00103\u001a\u0002022\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b]\u0010^J\u0011\u0010`\u001a\u0004\u0018\u00010_H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u00112\u0006\u0010b\u001a\u00020_H\u0016¢\u0006\u0004\bc\u0010dJ\u001f\u0010g\u001a\u00020\u00112\u0006\u0010e\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020\u000bH\u0014¢\u0006\u0004\bg\u0010hJ7\u0010l\u001a\u00020\u00112\u0006\u0010i\u001a\u00020\u00162\u0006\u0010R\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u000b2\u0006\u0010k\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\bl\u0010mJ/\u0010q\u001a\u00020\u00112\u0006\u0010n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u000b2\u0006\u0010p\u001a\u00020\u000bH\u0014¢\u0006\u0004\bq\u0010rJ\u0017\u0010s\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\bs\u0010&R\u0014\u0010v\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010uR\u0016\u0010y\u001a\u0004\u0018\u00010w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010xR\u0014\u0010|\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010{R\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010\u007fR\u0017\u0010\u0083\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bU\u0010\u0082\u0001R\u0017\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010\u0082\u0001R\u001b\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u0086\u0001R\u001a\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010\u0088\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b[\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bX\u0010\u008a\u0001R\u0018\u0010\u008e\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bR\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u008d\u0001R\u0018\u0010\u0090\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u008a\u0001R\u0018\u0010\u0091\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u008a\u0001R\u0018\u0010\u0092\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b]\u0010\u008a\u0001R\u0019\u0010\u0095\u0001\u001a\u00030\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010\u0094\u0001R'\u0010\u0096\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bk\u0010\u008d\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0005\b\u0098\u0001\u0010&R\u0019\u0010\u009a\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u008d\u0001R\u0018\u0010\u009b\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010\u008d\u0001R\u001a\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010¢\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010£\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bn\u0010\u008a\u0001R\u0019\u0010¥\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u008d\u0001R\u0019\u0010§\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u008d\u0001R\u0019\u0010©\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u008a\u0001R\u001b\u0010¬\u0001\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001b\u0010¯\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R-\u0010\u000e\u001a\u0004\u0018\u00010\r2\t\u0010°\u0001\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0019\u0010¶\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u008a\u0001R\u0019\u0010¸\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¡\u0001R\u0019\u0010¹\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¡\u0001R\u0019\u0010»\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010¡\u0001R\u001c\u0010¿\u0001\u001a\u0005\u0018\u00010¼\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0019\u0010À\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008a\u0001R\u0019\u0010Â\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010\u008d\u0001R#\u0010Ç\u0001\u001a\f\u0012\u0005\u0012\u00030Ä\u0001\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R#\u0010Ê\u0001\u001a\f\u0012\u0005\u0012\u00030È\u0001\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Æ\u0001R)\u00109\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bË\u0001\u0010²\u0001\u001a\u0006\bÌ\u0001\u0010´\u0001\"\u0005\bÍ\u0001\u0010PR,\u0010Î\u0001\u001a\u00030\u0093\u00012\b\u0010Î\u0001\u001a\u00030\u0093\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R0\u0010Ô\u0001\u001a\u0005\u0018\u00010Ó\u00012\n\u0010Ô\u0001\u001a\u0005\u0018\u00010Ó\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R0\u0010Ú\u0001\u001a\u0005\u0018\u00010Ù\u00012\n\u0010Ú\u0001\u001a\u0005\u0018\u00010Ù\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R)\u0010à\u0001\u001a\u00020\u00162\u0007\u0010ß\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bà\u0001\u0010\u0097\u0001\"\u0005\bá\u0001\u0010&R)\u0010â\u0001\u001a\u00020\u000b2\u0007\u0010â\u0001\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0005\bå\u0001\u0010SR(\u0010è\u0001\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bæ\u0001\u0010ä\u0001\"\u0005\bç\u0001\u0010SR)\u0010ê\u0001\u001a\u00020\u00162\u0007\u0010é\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bê\u0001\u0010\u0097\u0001\"\u0005\bë\u0001\u0010&R)\u0010í\u0001\u001a\u00020\u00162\u0007\u0010ì\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bí\u0001\u0010\u0097\u0001\"\u0005\bî\u0001\u0010&R0\u0010ð\u0001\u001a\u0005\u0018\u00010ï\u00012\n\u0010ð\u0001\u001a\u0005\u0018\u00010ï\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R!\u0010ø\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0õ\u00018F¢\u0006\b\u001a\u0006\bö\u0001\u0010÷\u0001R)\u0010ú\u0001\u001a\u00020\u00162\u0007\u0010ù\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bú\u0001\u0010\u0097\u0001\"\u0005\bû\u0001\u0010&R)\u0010ý\u0001\u001a\u00020\u00162\u0007\u0010ü\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bý\u0001\u0010\u0097\u0001\"\u0005\bþ\u0001\u0010&R)\u0010\u0080\u0002\u001a\u00020\u00162\u0007\u0010ÿ\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0080\u0002\u0010\u0097\u0001\"\u0005\b\u0081\u0002\u0010&R,\u0010\u0082\u0002\u001a\u00030\u009c\u00012\b\u0010\u0082\u0002\u001a\u00030\u009c\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002\"\u0006\b\u0085\u0002\u0010\u0086\u0002R)\u0010\u008b\u0002\u001a\u00020\u001b2\u0007\u0010\u0087\u0002\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002\"\u0005\b\u008a\u0002\u0010/R)\u0010\u008c\u0002\u001a\u00020\u000b2\u0007\u0010\u008c\u0002\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u008d\u0002\u0010ä\u0001\"\u0005\b\u008e\u0002\u0010SR(\u0010\f\u001a\u00020\u000b2\u0007\u0010\u008f\u0002\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0090\u0002\u0010ä\u0001\"\u0005\b\u0091\u0002\u0010SR\u0017\u0010\u0095\u0002\u001a\u0005\u0018\u00010\u0092\u00028F¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R0\u0010\u009a\u0002\u001a\u0005\u0018\u00010\u0092\u00022\n\u0010\u0096\u0002\u001a\u0005\u0018\u00010\u0092\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0097\u0002\u0010\u0094\u0002\"\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0017\u0010\u009d\u0002\u001a\u0005\u0018\u00010¼\u00018F¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0015\u0010 \u0002\u001a\u00030\u0081\u00018F¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0016\u0010£\u0002\u001a\u0004\u0018\u00010\t8F¢\u0006\b\u001a\u0006\b¡\u0002\u0010¢\u0002¨\u0006¥\u0002"}, d2 = {"Lcom/canhub/cropper/CropImageView;", "Landroid/widget/FrameLayout;", "Lcom/canhub/cropper/CropOverlayView$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Bitmap;", "bitmap", BuildConfig.FLAVOR, "imageResource", "Landroid/net/Uri;", HVRetakeActivity.IMAGE_URI_TAG, "loadSampleSize", "degreesRotated", BuildConfig.FLAVOR, "m", "(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V", "c", "()V", BuildConfig.FLAVOR, "inProgress", "animate", "h", "(ZZ)V", BuildConfig.FLAVOR, "width", "height", "center", "b", "(FFZZ)V", "i", "n", "o", "clear", "q", "(Z)V", "multiTouchEnabled", "setMultiTouchEnabled", "centerMoveEnabled", "setCenterMoveEnabled", "fixAspectRatio", "setFixedAspectRatio", "snapRadius", "setSnapRadius", "(F)V", "reqWidth", "reqHeight", "Lcom/canhub/cropper/CropImageView$k;", "options", "g", "(IILcom/canhub/cropper/CropImageView$k;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$CompressFormat;", "saveCompressFormat", "saveCompressQuality", "customOutputUri", "d", "(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$k;Landroid/net/Uri;)V", "Lcom/canhub/cropper/CropImageView$h;", "listener", "setOnSetCropOverlayReleasedListener", "(Lcom/canhub/cropper/CropImageView$h;)V", "Lcom/canhub/cropper/CropImageView$g;", "setOnSetCropOverlayMovedListener", "(Lcom/canhub/cropper/CropImageView$g;)V", "Lcom/canhub/cropper/CropImageView$i;", "setOnCropWindowChangedListener", "(Lcom/canhub/cropper/CropImageView$i;)V", "Lcom/canhub/cropper/CropImageView$j;", "setOnSetImageUriCompleteListener", "(Lcom/canhub/cropper/CropImageView$j;)V", "Lcom/canhub/cropper/CropImageView$f;", "setOnCropImageCompleteListener", "(Lcom/canhub/cropper/CropImageView$f;)V", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "uri", "setImageUriAsync", "(Landroid/net/Uri;)V", "degrees", "l", "(I)V", "e", "f", "LF2/b$b;", "result", "k", "(LF2/b$b;)V", "LF2/a$a;", "j", "(LF2/a$a;)V", "p", "(IILcom/canhub/cropper/CropImageView$k;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", Keys.STATE, "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "t", "r", "onLayout", "(ZIIII)V", "w", "oldw", "oldh", "onSizeChanged", "(IIII)V", C4870a.f43493a, "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "imageView", "Lcom/canhub/cropper/CropOverlayView;", "Lcom/canhub/cropper/CropOverlayView;", "mCropOverlayView", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mImageMatrix", "mImageInverseMatrix", "Landroid/widget/ProgressBar;", "Landroid/widget/ProgressBar;", "mProgressBar", BuildConfig.FLAVOR, "[F", "mImagePoints", "mScaleImagePoints", "LF2/i;", "LF2/i;", "mAnimation", "Landroid/graphics/Bitmap;", "originalBitmap", "I", "mInitialDegreesRotated", "mDegreesRotated", "Z", "mFlipHorizontally", "mFlipVertically", "mLayoutWidth", "mLayoutHeight", "mImageResource", "Lcom/canhub/cropper/CropImageView$l;", "Lcom/canhub/cropper/CropImageView$l;", "mScaleType", "isSaveBitmapToInstanceState", "()Z", "setSaveBitmapToInstanceState", "s", "mShowCropOverlay", "mShowCropLabel", BuildConfig.FLAVOR, "u", "Ljava/lang/String;", "mCropTextLabel", "v", "F", "mCropLabelTextSize", "mCropLabelTextColor", "x", "mShowProgressBar", "y", "mAutoZoomEnabled", "z", "mMaxZoom", "A", "Lcom/canhub/cropper/CropImageView$j;", "mOnSetImageUriCompleteListener", "B", "Lcom/canhub/cropper/CropImageView$f;", "mOnCropImageCompleteListener", "<set-?>", "C", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "D", "loadedSampleSize", "E", "mZoom", "mZoomOffsetX", "G", "mZoomOffsetY", "Landroid/graphics/RectF;", "H", "Landroid/graphics/RectF;", "mRestoreCropWindowRect", "mRestoreDegreesRotated", "J", "mSizeChanged", "Ljava/lang/ref/WeakReference;", "LF2/b;", "K", "Ljava/lang/ref/WeakReference;", "bitmapLoadingWorkerJob", "LF2/a;", "h0", "bitmapCroppingWorkerJob", "i0", "getCustomOutputUri", "setCustomOutputUri", "scaleType", "getScaleType", "()Lcom/canhub/cropper/CropImageView$l;", "setScaleType", "(Lcom/canhub/cropper/CropImageView$l;)V", "Lcom/canhub/cropper/CropImageView$d;", "cropShape", "getCropShape", "()Lcom/canhub/cropper/CropImageView$d;", "setCropShape", "(Lcom/canhub/cropper/CropImageView$d;)V", "Lcom/canhub/cropper/CropImageView$b;", "cornerShape", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$b;", "setCornerShape", "(Lcom/canhub/cropper/CropImageView$b;)V", "autoZoomEnabled", "isAutoZoomEnabled", "setAutoZoomEnabled", "maxZoom", "getMaxZoom", "()I", "setMaxZoom", "getRotatedDegrees", "setRotatedDegrees", "rotatedDegrees", "flipHorizontally", "isFlippedHorizontally", "setFlippedHorizontally", "flipVertically", "isFlippedVertically", "setFlippedVertically", "Lcom/canhub/cropper/CropImageView$e;", "guidelines", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$e;", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$e;)V", "Landroid/util/Pair;", "getAspectRatio", "()Landroid/util/Pair;", HVRetakeActivity.ASPECT_RATIO_TAG, "showProgressBar", "isShowProgressBar", "setShowProgressBar", "showCropOverlay", "isShowCropOverlay", "setShowCropOverlay", "showCropLabel", "isShowCropLabel", "setShowCropLabel", "cropLabelText", "getCropLabelText", "()Ljava/lang/String;", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "getCropLabelTextSize", "()F", "setCropLabelTextSize", "cropLabelTextSize", "cropLabelTextColor", "getCropLabelTextColor", "setCropLabelTextColor", "resId", "getImageResource", "setImageResource", "Landroid/graphics/Rect;", "getWholeImageRect", "()Landroid/graphics/Rect;", "wholeImageRect", "rect", "getCropRect", "setCropRect", "(Landroid/graphics/Rect;)V", "cropRect", "getCropWindowRect", "()Landroid/graphics/RectF;", "cropWindowRect", "getCropPoints", "()[F", "cropPoints", "getCroppedImage", "()Landroid/graphics/Bitmap;", "croppedImage", "j0", "cropper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CropImageView extends FrameLayout implements CropOverlayView.b {

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private j mOnSetImageUriCompleteListener;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private f mOnCropImageCompleteListener;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Uri imageUri;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int loadedSampleSize;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private float mZoom;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private float mZoomOffsetX;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private float mZoomOffsetY;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private RectF mRestoreCropWindowRect;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private int mRestoreDegreesRotated;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean mSizeChanged;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private WeakReference bitmapLoadingWorkerJob;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageView imageView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CropOverlayView mCropOverlayView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Matrix mImageMatrix;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Matrix mImageInverseMatrix;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ProgressBar mProgressBar;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float[] mImagePoints;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float[] mScaleImagePoints;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private F2.i mAnimation;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private WeakReference bitmapCroppingWorkerJob;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Bitmap originalBitmap;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private Uri customOutputUri;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int mInitialDegreesRotated;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int mDegreesRotated;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean mFlipHorizontally;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean mFlipVertically;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int mLayoutWidth;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int mLayoutHeight;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int mImageResource;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private l mScaleType;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isSaveBitmapToInstanceState;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean mShowCropOverlay;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean mShowCropLabel;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private String mCropTextLabel;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float mCropLabelTextSize;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int mCropLabelTextColor;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean mShowProgressBar;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean mAutoZoomEnabled;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private int mMaxZoom;

    /* renamed from: com.canhub.cropper.CropImageView$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i10, int i11, int i12) {
            return i10 != Integer.MIN_VALUE ? i10 != 1073741824 ? i12 : i11 : Math.min(i12, i11);
        }

        private Companion() {
        }
    }

    public enum b {
        RECTANGLE,
        OVAL
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Bitmap f20466a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f20467b;

        /* renamed from: c, reason: collision with root package name */
        private final Bitmap f20468c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f20469d;

        /* renamed from: e, reason: collision with root package name */
        private final Exception f20470e;

        /* renamed from: f, reason: collision with root package name */
        private final float[] f20471f;

        /* renamed from: g, reason: collision with root package name */
        private final Rect f20472g;

        /* renamed from: h, reason: collision with root package name */
        private final Rect f20473h;

        /* renamed from: i, reason: collision with root package name */
        private final int f20474i;

        /* renamed from: j, reason: collision with root package name */
        private final int f20475j;

        public c(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] cropPoints, Rect rect, Rect rect2, int i10, int i11) {
            Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
            this.f20466a = bitmap;
            this.f20467b = uri;
            this.f20468c = bitmap2;
            this.f20469d = uri2;
            this.f20470e = exc;
            this.f20471f = cropPoints;
            this.f20472g = rect;
            this.f20473h = rect2;
            this.f20474i = i10;
            this.f20475j = i11;
        }

        public final float[] a() {
            return this.f20471f;
        }

        public final Rect b() {
            return this.f20472g;
        }

        public final Exception c() {
            return this.f20470e;
        }

        public final Uri d() {
            return this.f20467b;
        }

        public final int e() {
            return this.f20474i;
        }

        public final int f() {
            return this.f20475j;
        }

        public final Uri g() {
            return this.f20469d;
        }

        public final Rect h() {
            return this.f20473h;
        }
    }

    public enum d {
        RECTANGLE,
        OVAL,
        RECTANGLE_VERTICAL_ONLY,
        RECTANGLE_HORIZONTAL_ONLY
    }

    public enum e {
        OFF,
        ON_TOUCH,
        ON
    }

    public interface f {
        void e(CropImageView cropImageView, c cVar);
    }

    public interface g {
    }

    public interface h {
    }

    public interface i {
    }

    public interface j {
        void d(CropImageView cropImageView, Uri uri, Exception exc);
    }

    public enum k {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    public enum l {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Bundle bundleExtra;
        Intrinsics.checkNotNullParameter(context, "context");
        this.mImageMatrix = new Matrix();
        this.mImageInverseMatrix = new Matrix();
        this.mImagePoints = new float[8];
        this.mScaleImagePoints = new float[8];
        this.mShowCropOverlay = true;
        this.mCropTextLabel = BuildConfig.FLAVOR;
        this.mCropLabelTextSize = 20.0f;
        this.mCropLabelTextColor = -1;
        this.mShowProgressBar = true;
        this.mAutoZoomEnabled = true;
        this.loadedSampleSize = 1;
        this.mZoom = 1.0f;
        F2.l lVar = null;
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent != null && (bundleExtra = intent.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE")) != null) {
            lVar = (F2.l) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        }
        if (lVar == null) {
            lVar = new F2.l();
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f2476v, 0, 0);
                Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…able.CropImageView, 0, 0)");
                try {
                    lVar.f2345s = obtainStyledAttributes.getBoolean(u.f2418K, lVar.f2345s);
                    lVar.f2347t = obtainStyledAttributes.getInteger(u.f2480x, lVar.f2347t);
                    lVar.f2349u = obtainStyledAttributes.getInteger(u.f2482y, lVar.f2349u);
                    lVar.f2325i = l.values()[obtainStyledAttributes.getInt(u.f2433Z, lVar.f2325i.ordinal())];
                    lVar.f2335n = obtainStyledAttributes.getBoolean(u.f2484z, lVar.f2335n);
                    lVar.f2337o = obtainStyledAttributes.getBoolean(u.f2431X, lVar.f2337o);
                    lVar.f2339p = obtainStyledAttributes.getBoolean(u.f2413H, lVar.f2339p);
                    lVar.f2341q = obtainStyledAttributes.getInteger(u.f2426S, lVar.f2341q);
                    lVar.f2318c = d.values()[obtainStyledAttributes.getInt(u.f2435a0, lVar.f2318c.ordinal())];
                    lVar.f2319d = b.values()[obtainStyledAttributes.getInt(u.f2478w, lVar.f2319d.ordinal())];
                    lVar.f2320e = obtainStyledAttributes.getDimension(u.f2417J, lVar.f2320e);
                    lVar.f2323h = e.values()[obtainStyledAttributes.getInt(u.f2420M, lVar.f2323h.ordinal())];
                    lVar.f2321f = obtainStyledAttributes.getDimension(u.f2443e0, lVar.f2321f);
                    lVar.f2322g = obtainStyledAttributes.getDimension(u.f2445f0, lVar.f2322g);
                    lVar.f2343r = obtainStyledAttributes.getFloat(u.f2423P, lVar.f2343r);
                    lVar.f2300B = obtainStyledAttributes.getInteger(u.f2415I, lVar.f2300B);
                    lVar.f2351v = obtainStyledAttributes.getDimension(u.f2411G, lVar.f2351v);
                    lVar.f2353w = obtainStyledAttributes.getInteger(u.f2409F, lVar.f2353w);
                    lVar.f2355x = obtainStyledAttributes.getDimension(u.f2407E, lVar.f2355x);
                    lVar.f2357y = obtainStyledAttributes.getDimension(u.f2405D, lVar.f2357y);
                    lVar.f2359z = obtainStyledAttributes.getDimension(u.f2403C, lVar.f2359z);
                    lVar.f2298A = obtainStyledAttributes.getInteger(u.f2401B, lVar.f2298A);
                    lVar.f2302C = obtainStyledAttributes.getDimension(u.f2422O, lVar.f2302C);
                    lVar.f2304D = obtainStyledAttributes.getInteger(u.f2421N, lVar.f2304D);
                    lVar.f2306E = obtainStyledAttributes.getInteger(u.f2399A, lVar.f2306E);
                    lVar.f2327j = obtainStyledAttributes.getBoolean(u.f2437b0, this.mShowCropOverlay);
                    lVar.f2331l = obtainStyledAttributes.getBoolean(u.f2441d0, this.mShowProgressBar);
                    lVar.f2355x = obtainStyledAttributes.getDimension(u.f2407E, lVar.f2355x);
                    lVar.f2307F = (int) obtainStyledAttributes.getDimension(u.f2430W, lVar.f2307F);
                    lVar.f2308G = (int) obtainStyledAttributes.getDimension(u.f2429V, lVar.f2308G);
                    lVar.f2309H = (int) obtainStyledAttributes.getFloat(u.f2428U, lVar.f2309H);
                    lVar.f2310I = (int) obtainStyledAttributes.getFloat(u.f2427T, lVar.f2310I);
                    lVar.f2311J = (int) obtainStyledAttributes.getFloat(u.f2425R, lVar.f2311J);
                    lVar.f2312K = (int) obtainStyledAttributes.getFloat(u.f2424Q, lVar.f2312K);
                    lVar.f2348t0 = obtainStyledAttributes.getBoolean(u.f2419L, lVar.f2348t0);
                    lVar.f2350u0 = obtainStyledAttributes.getBoolean(u.f2419L, lVar.f2350u0);
                    lVar.f2301B0 = obtainStyledAttributes.getDimension(u.f2451i0, lVar.f2301B0);
                    lVar.f2303C0 = obtainStyledAttributes.getInteger(u.f2449h0, lVar.f2303C0);
                    lVar.f2305D0 = obtainStyledAttributes.getString(u.f2447g0);
                    lVar.f2329k = obtainStyledAttributes.getBoolean(u.f2439c0, lVar.f2329k);
                    this.isSaveBitmapToInstanceState = obtainStyledAttributes.getBoolean(u.f2432Y, this.isSaveBitmapToInstanceState);
                    if (obtainStyledAttributes.hasValue(u.f2480x) && obtainStyledAttributes.hasValue(u.f2480x) && !obtainStyledAttributes.hasValue(u.f2418K)) {
                        lVar.f2345s = true;
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        lVar.a();
        this.mScaleType = lVar.f2325i;
        this.mAutoZoomEnabled = lVar.f2335n;
        this.mMaxZoom = lVar.f2341q;
        this.mCropLabelTextSize = lVar.f2301B0;
        this.mShowCropLabel = lVar.f2329k;
        this.mShowCropOverlay = lVar.f2327j;
        this.mShowProgressBar = lVar.f2331l;
        this.mFlipHorizontally = lVar.f2348t0;
        this.mFlipVertically = lVar.f2350u0;
        View inflate = LayoutInflater.from(context).inflate(r.f2393b, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(q.f2385c);
        Intrinsics.checkNotNullExpressionValue(findViewById, "v.findViewById(R.id.ImageView_image)");
        ImageView imageView = (ImageView) findViewById;
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) inflate.findViewById(q.f2383a);
        this.mCropOverlayView = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(this);
        cropOverlayView.setInitialAttributeValues(lVar);
        View findViewById2 = inflate.findViewById(q.f2384b);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "v.findViewById(R.id.CropProgressBar)");
        ProgressBar progressBar = (ProgressBar) findViewById2;
        this.mProgressBar = progressBar;
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(lVar.f2333m));
        o();
    }

    private final void b(float width, float height, boolean center, boolean animate) {
        if (this.originalBitmap != null) {
            if (width <= 0.0f || height <= 0.0f) {
                return;
            }
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.d(cropOverlayView);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            this.mImageInverseMatrix.mapRect(cropWindowRect);
            this.mImageMatrix.reset();
            float f10 = 2;
            this.mImageMatrix.postTranslate((width - r0.getWidth()) / f10, (height - r0.getHeight()) / f10);
            i();
            int i10 = this.mDegreesRotated;
            if (i10 > 0) {
                F2.c cVar = F2.c.f2261a;
                this.mImageMatrix.postRotate(i10, cVar.x(this.mImagePoints), cVar.y(this.mImagePoints));
                i();
            }
            F2.c cVar2 = F2.c.f2261a;
            float min = Math.min(width / cVar2.E(this.mImagePoints), height / cVar2.A(this.mImagePoints));
            l lVar = this.mScaleType;
            if (lVar == l.FIT_CENTER || ((lVar == l.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.mAutoZoomEnabled))) {
                this.mImageMatrix.postScale(min, min, cVar2.x(this.mImagePoints), cVar2.y(this.mImagePoints));
                i();
            } else if (lVar == l.CENTER_CROP) {
                this.mZoom = Math.max(getWidth() / cVar2.E(this.mImagePoints), getHeight() / cVar2.A(this.mImagePoints));
            }
            float f11 = this.mFlipHorizontally ? -this.mZoom : this.mZoom;
            float f12 = this.mFlipVertically ? -this.mZoom : this.mZoom;
            this.mImageMatrix.postScale(f11, f12, cVar2.x(this.mImagePoints), cVar2.y(this.mImagePoints));
            i();
            this.mImageMatrix.mapRect(cropWindowRect);
            if (this.mScaleType == l.CENTER_CROP && center && !animate) {
                this.mZoomOffsetX = 0.0f;
                this.mZoomOffsetY = 0.0f;
            } else if (center) {
                this.mZoomOffsetX = width > cVar2.E(this.mImagePoints) ? 0.0f : Math.max(Math.min((width / f10) - cropWindowRect.centerX(), -cVar2.B(this.mImagePoints)), getWidth() - cVar2.C(this.mImagePoints)) / f11;
                this.mZoomOffsetY = height <= cVar2.A(this.mImagePoints) ? Math.max(Math.min((height / f10) - cropWindowRect.centerY(), -cVar2.D(this.mImagePoints)), getHeight() - cVar2.w(this.mImagePoints)) / f12 : 0.0f;
            } else {
                this.mZoomOffsetX = Math.min(Math.max(this.mZoomOffsetX * f11, -cropWindowRect.left), (-cropWindowRect.right) + width) / f11;
                this.mZoomOffsetY = Math.min(Math.max(this.mZoomOffsetY * f12, -cropWindowRect.top), (-cropWindowRect.bottom) + height) / f12;
            }
            this.mImageMatrix.postTranslate(this.mZoomOffsetX * f11, this.mZoomOffsetY * f12);
            cropWindowRect.offset(this.mZoomOffsetX * f11, this.mZoomOffsetY * f12);
            this.mCropOverlayView.setCropWindowRect(cropWindowRect);
            i();
            this.mCropOverlayView.invalidate();
            if (animate) {
                F2.i iVar = this.mAnimation;
                Intrinsics.d(iVar);
                iVar.a(this.mImagePoints, this.mImageMatrix);
                this.imageView.startAnimation(this.mAnimation);
            } else {
                this.imageView.setImageMatrix(this.mImageMatrix);
            }
            q(false);
        }
    }

    private final void c() {
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null && (this.mImageResource > 0 || this.imageUri != null)) {
            Intrinsics.d(bitmap);
            bitmap.recycle();
        }
        this.originalBitmap = null;
        this.mImageResource = 0;
        this.imageUri = null;
        this.loadedSampleSize = 1;
        this.mDegreesRotated = 0;
        this.mZoom = 1.0f;
        this.mZoomOffsetX = 0.0f;
        this.mZoomOffsetY = 0.0f;
        this.mImageMatrix.reset();
        this.mRestoreCropWindowRect = null;
        this.mRestoreDegreesRotated = 0;
        this.imageView.setImageBitmap(null);
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void h(boolean inProgress, boolean animate) {
        float f10;
        float f11;
        int width = getWidth();
        int height = getHeight();
        if (this.originalBitmap == null || width <= 0 || height <= 0) {
            return;
        }
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        if (inProgress) {
            if (cropWindowRect.left < 0.0f || cropWindowRect.top < 0.0f || cropWindowRect.right > width || cropWindowRect.bottom > height) {
                b(width, height, false, false);
                return;
            }
            return;
        }
        if (this.mAutoZoomEnabled || this.mZoom > 1.0f) {
            if (this.mZoom < this.mMaxZoom) {
                float f12 = width;
                if (cropWindowRect.width() < f12 * 0.5f) {
                    float f13 = height;
                    if (cropWindowRect.height() < 0.5f * f13) {
                        f10 = Math.min(this.mMaxZoom, Math.min(f12 / ((cropWindowRect.width() / this.mZoom) / 0.64f), f13 / ((cropWindowRect.height() / this.mZoom) / 0.64f)));
                        if (this.mZoom > 1.0f) {
                            float f14 = width;
                            if (cropWindowRect.width() > f14 * 0.65f || cropWindowRect.height() > height * 0.65f) {
                                f10 = Math.max(1.0f, Math.min(f14 / ((cropWindowRect.width() / this.mZoom) / 0.51f), height / ((cropWindowRect.height() / this.mZoom) / 0.51f)));
                            }
                        }
                        f11 = this.mAutoZoomEnabled ? f10 : 1.0f;
                        if (f11 > 0.0f || f11 == this.mZoom) {
                        }
                        if (animate) {
                            if (this.mAnimation == null) {
                                this.mAnimation = new F2.i(this.imageView, this.mCropOverlayView);
                            }
                            F2.i iVar = this.mAnimation;
                            Intrinsics.d(iVar);
                            iVar.b(this.mImagePoints, this.mImageMatrix);
                        }
                        this.mZoom = f11;
                        b(width, height, true, animate);
                        return;
                    }
                }
            }
            f10 = 0.0f;
            if (this.mZoom > 1.0f) {
            }
            if (this.mAutoZoomEnabled) {
            }
            if (f11 > 0.0f) {
            }
        }
    }

    private final void i() {
        float[] fArr = this.mImagePoints;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Intrinsics.d(this.originalBitmap);
        fArr[2] = r4.getWidth();
        float[] fArr2 = this.mImagePoints;
        fArr2[3] = 0.0f;
        Intrinsics.d(this.originalBitmap);
        fArr2[4] = r6.getWidth();
        float[] fArr3 = this.mImagePoints;
        Intrinsics.d(this.originalBitmap);
        fArr3[5] = r6.getHeight();
        float[] fArr4 = this.mImagePoints;
        fArr4[6] = 0.0f;
        Intrinsics.d(this.originalBitmap);
        fArr4[7] = r9.getHeight();
        this.mImageMatrix.mapPoints(this.mImagePoints);
        float[] fArr5 = this.mScaleImagePoints;
        fArr5[0] = 0.0f;
        fArr5[1] = 0.0f;
        fArr5[2] = 100.0f;
        fArr5[3] = 0.0f;
        fArr5[4] = 100.0f;
        fArr5[5] = 100.0f;
        fArr5[6] = 0.0f;
        fArr5[7] = 100.0f;
        this.mImageMatrix.mapPoints(fArr5);
    }

    private final void m(Bitmap bitmap, int imageResource, Uri imageUri, int loadSampleSize, int degreesRotated) {
        Bitmap bitmap2 = this.originalBitmap;
        if (bitmap2 == null || !Intrinsics.b(bitmap2, bitmap)) {
            c();
            this.originalBitmap = bitmap;
            this.imageView.setImageBitmap(bitmap);
            this.imageUri = imageUri;
            this.mImageResource = imageResource;
            this.loadedSampleSize = loadSampleSize;
            this.mDegreesRotated = degreesRotated;
            b(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.u();
                n();
            }
        }
    }

    private final void n() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.mShowCropOverlay || this.originalBitmap == null) ? 4 : 0);
        }
    }

    private final void o() {
        this.mProgressBar.setVisibility(this.mShowProgressBar && ((this.originalBitmap == null && this.bitmapLoadingWorkerJob != null) || this.bitmapCroppingWorkerJob != null) ? 0 : 4);
    }

    private final void q(boolean clear) {
        if (this.originalBitmap != null && !clear) {
            F2.c cVar = F2.c.f2261a;
            float E10 = (this.loadedSampleSize * 100.0f) / cVar.E(this.mScaleImagePoints);
            float A10 = (this.loadedSampleSize * 100.0f) / cVar.A(this.mScaleImagePoints);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.d(cropOverlayView);
            cropOverlayView.x(getWidth(), getHeight(), E10, A10);
        }
        CropOverlayView cropOverlayView2 = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView2);
        cropOverlayView2.v(clear ? null : this.mImagePoints, getWidth(), getHeight());
    }

    @Override // com.canhub.cropper.CropOverlayView.b
    public void a(boolean inProgress) {
        h(inProgress, true);
    }

    public final void d(Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality, int reqWidth, int reqHeight, k options, Uri customOutputUri) {
        Intrinsics.checkNotNullParameter(saveCompressFormat, "saveCompressFormat");
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.mOnCropImageCompleteListener == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        p(reqWidth, reqHeight, options, saveCompressFormat, saveCompressQuality, customOutputUri);
    }

    public final void e() {
        this.mFlipHorizontally = !this.mFlipHorizontally;
        b(getWidth(), getHeight(), true, false);
    }

    public final void f() {
        this.mFlipVertically = !this.mFlipVertically;
        b(getWidth(), getHeight(), true, false);
    }

    public final Bitmap g(int reqWidth, int reqHeight, k options) {
        int i10;
        Bitmap a10;
        Intrinsics.checkNotNullParameter(options, "options");
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        k kVar = k.NONE;
        int i11 = options != kVar ? reqWidth : 0;
        int i12 = options != kVar ? reqHeight : 0;
        if (this.imageUri == null || (this.loadedSampleSize <= 1 && options != k.SAMPLING)) {
            i10 = i11;
            F2.c cVar = F2.c.f2261a;
            float[] cropPoints = getCropPoints();
            int i13 = this.mDegreesRotated;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.d(cropOverlayView);
            a10 = cVar.h(bitmap, cropPoints, i13, cropOverlayView.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY(), this.mFlipHorizontally, this.mFlipVertically).a();
        } else {
            Intrinsics.d(bitmap);
            int width = bitmap.getWidth() * this.loadedSampleSize;
            Bitmap bitmap2 = this.originalBitmap;
            Intrinsics.d(bitmap2);
            int height = bitmap2.getHeight() * this.loadedSampleSize;
            F2.c cVar2 = F2.c.f2261a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Uri uri = this.imageUri;
            float[] cropPoints2 = getCropPoints();
            int i14 = this.mDegreesRotated;
            CropOverlayView cropOverlayView2 = this.mCropOverlayView;
            Intrinsics.d(cropOverlayView2);
            i10 = i11;
            a10 = cVar2.e(context, uri, cropPoints2, i14, width, height, cropOverlayView2.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY(), i10, i12, this.mFlipHorizontally, this.mFlipVertically).a();
        }
        return F2.c.f2261a.H(a10, i10, i12, options);
    }

    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        return new Pair<>(Integer.valueOf(cropOverlayView.getMAspectRatioX()), Integer.valueOf(this.mCropOverlayView.getMAspectRatioY()));
    }

    public final b getCornerShape() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        return cropOverlayView.getCornerShape();
    }

    /* renamed from: getCropLabelText, reason: from getter */
    public final String getMCropTextLabel() {
        return this.mCropTextLabel;
    }

    /* renamed from: getCropLabelTextColor, reason: from getter */
    public final int getMCropLabelTextColor() {
        return this.mCropLabelTextColor;
    }

    /* renamed from: getCropLabelTextSize, reason: from getter */
    public final float getMCropLabelTextSize() {
        return this.mCropLabelTextSize;
    }

    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float f10 = cropWindowRect.left;
        float f11 = cropWindowRect.top;
        float f12 = cropWindowRect.right;
        float f13 = cropWindowRect.bottom;
        float[] fArr = {f10, f11, f12, f11, f12, f13, f10, f13};
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr2[i10] = fArr[i10] * this.loadedSampleSize;
        }
        return fArr2;
    }

    public final Rect getCropRect() {
        int i10 = this.loadedSampleSize;
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i10;
        int height = bitmap.getHeight() * i10;
        F2.c cVar = F2.c.f2261a;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        return cVar.z(cropPoints, width, height, cropOverlayView.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY());
    }

    public final d getCropShape() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        return cropOverlayView.getCropShape();
    }

    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    public final Bitmap getCroppedImage() {
        return g(0, 0, k.NONE);
    }

    public final Uri getCustomOutputUri() {
        return this.customOutputUri;
    }

    public final e getGuidelines() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        return cropOverlayView.getGuidelines();
    }

    /* renamed from: getImageResource, reason: from getter */
    public final int getMImageResource() {
        return this.mImageResource;
    }

    public final Uri getImageUri() {
        return this.imageUri;
    }

    /* renamed from: getMaxZoom, reason: from getter */
    public final int getMMaxZoom() {
        return this.mMaxZoom;
    }

    /* renamed from: getRotatedDegrees, reason: from getter */
    public final int getMDegreesRotated() {
        return this.mDegreesRotated;
    }

    /* renamed from: getScaleType, reason: from getter */
    public final l getMScaleType() {
        return this.mScaleType;
    }

    public final Rect getWholeImageRect() {
        int i10 = this.loadedSampleSize;
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i10, bitmap.getHeight() * i10);
    }

    public final void j(a.C0051a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.bitmapCroppingWorkerJob = null;
        o();
        f fVar = this.mOnCropImageCompleteListener;
        if (fVar != null) {
            fVar.e(this, new c(this.originalBitmap, this.imageUri, result.a(), result.d(), result.b(), getCropPoints(), getCropRect(), getWholeImageRect(), getMDegreesRotated(), result.c()));
        }
    }

    public final void k(b.C0053b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.bitmapLoadingWorkerJob = null;
        o();
        if (result.c() == null) {
            this.mInitialDegreesRotated = result.b();
            this.mFlipHorizontally = result.d();
            this.mFlipVertically = result.e();
            m(result.a(), 0, result.g(), result.f(), result.b());
        }
        j jVar = this.mOnSetImageUriCompleteListener;
        if (jVar != null) {
            jVar.d(this, result.g(), result.c());
        }
    }

    public final void l(int degrees) {
        if (this.originalBitmap != null) {
            int i10 = degrees < 0 ? (degrees % 360) + 360 : degrees % 360;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.d(cropOverlayView);
            boolean z10 = !cropOverlayView.getIsFixAspectRatio() && ((46 <= i10 && i10 < 135) || (216 <= i10 && i10 < 305));
            F2.c cVar = F2.c.f2261a;
            cVar.v().set(this.mCropOverlayView.getCropWindowRect());
            RectF v10 = cVar.v();
            float height = (z10 ? v10.height() : v10.width()) / 2.0f;
            RectF v11 = cVar.v();
            float width = (z10 ? v11.width() : v11.height()) / 2.0f;
            if (z10) {
                boolean z11 = this.mFlipHorizontally;
                this.mFlipHorizontally = this.mFlipVertically;
                this.mFlipVertically = z11;
            }
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            cVar.t()[0] = cVar.v().centerX();
            cVar.t()[1] = cVar.v().centerY();
            cVar.t()[2] = 0.0f;
            cVar.t()[3] = 0.0f;
            cVar.t()[4] = 1.0f;
            cVar.t()[5] = 0.0f;
            this.mImageInverseMatrix.mapPoints(cVar.t());
            this.mDegreesRotated = (this.mDegreesRotated + i10) % 360;
            b(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(cVar.u(), cVar.t());
            float sqrt = this.mZoom / ((float) Math.sqrt(Math.pow(cVar.u()[4] - cVar.u()[2], 2.0d) + Math.pow(cVar.u()[5] - cVar.u()[3], 2.0d)));
            this.mZoom = sqrt;
            this.mZoom = Math.max(sqrt, 1.0f);
            b(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(cVar.u(), cVar.t());
            float sqrt2 = (float) Math.sqrt(Math.pow(cVar.u()[4] - cVar.u()[2], 2.0d) + Math.pow(cVar.u()[5] - cVar.u()[3], 2.0d));
            float f10 = height * sqrt2;
            float f11 = width * sqrt2;
            cVar.v().set(cVar.u()[0] - f10, cVar.u()[1] - f11, cVar.u()[0] + f10, cVar.u()[1] + f11);
            this.mCropOverlayView.u();
            this.mCropOverlayView.setCropWindowRect(cVar.v());
            b(getWidth(), getHeight(), true, false);
            h(false, false);
            this.mCropOverlayView.n();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        super.onLayout(changed, l10, t10, r10, b10);
        if (this.mLayoutWidth <= 0 || this.mLayoutHeight <= 0) {
            q(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.mLayoutWidth;
        layoutParams.height = this.mLayoutHeight;
        setLayoutParams(layoutParams);
        if (this.originalBitmap == null) {
            q(true);
            return;
        }
        float f10 = r10 - l10;
        float f11 = b10 - t10;
        b(f10, f11, true, false);
        RectF rectF = this.mRestoreCropWindowRect;
        if (rectF == null) {
            if (this.mSizeChanged) {
                this.mSizeChanged = false;
                h(false, false);
                return;
            }
            return;
        }
        int i10 = this.mRestoreDegreesRotated;
        if (i10 != this.mInitialDegreesRotated) {
            this.mDegreesRotated = i10;
            b(f10, f11, true, false);
            this.mRestoreDegreesRotated = 0;
        }
        this.mImageMatrix.mapRect(this.mRestoreCropWindowRect);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropWindowRect(rectF);
        }
        h(false, false);
        CropOverlayView cropOverlayView2 = this.mCropOverlayView;
        if (cropOverlayView2 != null) {
            cropOverlayView2.n();
        }
        this.mRestoreCropWindowRect = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width;
        int i10;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size2 == 0) {
            size2 = bitmap.getHeight();
        }
        double width2 = size < bitmap.getWidth() ? size / bitmap.getWidth() : Double.POSITIVE_INFINITY;
        double height = size2 < bitmap.getHeight() ? size2 / bitmap.getHeight() : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height == Double.POSITIVE_INFINITY) {
            width = bitmap.getWidth();
            i10 = bitmap.getHeight();
        } else if (width2 <= height) {
            i10 = (int) (bitmap.getHeight() * width2);
            width = size;
        } else {
            width = (int) (bitmap.getWidth() * height);
            i10 = size2;
        }
        Companion companion = INSTANCE;
        int b10 = companion.b(mode, size, width);
        int b11 = companion.b(mode2, size2, i10);
        this.mLayoutWidth = b10;
        this.mLayoutHeight = b11;
        setMeasuredDimension(b10, b11);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        if (this.bitmapLoadingWorkerJob == null && this.imageUri == null && this.originalBitmap == null && this.mImageResource == 0) {
            Bundle bundle = (Bundle) state;
            Parcelable parcelable = bundle.getParcelable("LOADED_IMAGE_URI");
            if (parcelable != null) {
                String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                if (string != null) {
                    F2.c cVar = F2.c.f2261a;
                    Pair r10 = cVar.r();
                    if (r10 != null) {
                        bitmap = Intrinsics.b(r10.first, string) ? (Bitmap) ((WeakReference) r10.second).get() : null;
                    } else {
                        bitmap = null;
                    }
                    cVar.J(null);
                    if (bitmap != null && !bitmap.isRecycled()) {
                        m(bitmap, 0, (Uri) parcelable, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                    }
                }
                if (this.imageUri == null) {
                    setImageUriAsync((Uri) parcelable);
                    Unit unit = Unit.f36324a;
                }
            } else {
                int i10 = bundle.getInt("LOADED_IMAGE_RESOURCE");
                if (i10 > 0) {
                    setImageResource(i10);
                } else {
                    Uri uri = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                    if (uri != null) {
                        setImageUriAsync(uri);
                    }
                }
            }
            int i11 = bundle.getInt("DEGREES_ROTATED");
            this.mRestoreDegreesRotated = i11;
            this.mDegreesRotated = i11;
            Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
            if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                CropOverlayView cropOverlayView = this.mCropOverlayView;
                Intrinsics.d(cropOverlayView);
                cropOverlayView.setInitialCropWindowRect(rect);
            }
            RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
            if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                this.mRestoreCropWindowRect = rectF;
            }
            CropOverlayView cropOverlayView2 = this.mCropOverlayView;
            Intrinsics.d(cropOverlayView2);
            String string2 = bundle.getString("CROP_SHAPE");
            Intrinsics.d(string2);
            cropOverlayView2.setCropShape(d.valueOf(string2));
            this.mAutoZoomEnabled = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
            this.mMaxZoom = bundle.getInt("CROP_MAX_ZOOM");
            this.mFlipHorizontally = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
            this.mFlipVertically = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            boolean z10 = bundle.getBoolean("SHOW_CROP_LABEL");
            this.mShowCropLabel = z10;
            this.mCropOverlayView.setCropperTextLabelVisibility(z10);
        }
        super.onRestoreInstanceState(((Bundle) state).getParcelable("instanceState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Uri uri;
        if (this.imageUri == null && this.originalBitmap == null && this.mImageResource < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.isSaveBitmapToInstanceState && this.imageUri == null && this.mImageResource < 1) {
            F2.c cVar = F2.c.f2261a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            uri = cVar.L(context, this.originalBitmap, this.customOutputUri);
        } else {
            uri = this.imageUri;
        }
        if (uri != null && this.originalBitmap != null) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            F2.c.f2261a.J(new Pair(uuid, new WeakReference(this.originalBitmap)));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference weakReference = this.bitmapLoadingWorkerJob;
        if (weakReference != null) {
            Intrinsics.d(weakReference);
            F2.b bVar = (F2.b) weakReference.get();
            if (bVar != null) {
                bundle.putParcelable("LOADING_IMAGE_URI", bVar.g());
            }
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.mImageResource);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.loadedSampleSize);
        bundle.putInt("DEGREES_ROTATED", this.mDegreesRotated);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getMInitialCropWindowRect());
        F2.c cVar2 = F2.c.f2261a;
        cVar2.v().set(this.mCropOverlayView.getCropWindowRect());
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapRect(cVar2.v());
        bundle.putParcelable("CROP_WINDOW_RECT", cVar2.v());
        d cropShape = this.mCropOverlayView.getCropShape();
        Intrinsics.d(cropShape);
        bundle.putString("CROP_SHAPE", cropShape.name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.mAutoZoomEnabled);
        bundle.putInt("CROP_MAX_ZOOM", this.mMaxZoom);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.mFlipHorizontally);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.mFlipVertically);
        bundle.putBoolean("SHOW_CROP_LABEL", this.mShowCropLabel);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        this.mSizeChanged = oldw > 0 && oldh > 0;
    }

    public final void p(int reqWidth, int reqHeight, k options, Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality, Uri customOutputUri) {
        a aVar;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(saveCompressFormat, "saveCompressFormat");
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null) {
            WeakReference weakReference = this.bitmapCroppingWorkerJob;
            if (weakReference != null) {
                Intrinsics.d(weakReference);
                aVar = (a) weakReference.get();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.u();
            }
            Pair pair = (this.loadedSampleSize > 1 || options == k.SAMPLING) ? new Pair(Integer.valueOf(bitmap.getWidth() * this.loadedSampleSize), Integer.valueOf(bitmap.getHeight() * this.loadedSampleSize)) : new Pair(0, 0);
            Integer orgWidth = (Integer) pair.first;
            Integer orgHeight = (Integer) pair.second;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            WeakReference weakReference2 = new WeakReference(this);
            Uri uri = this.imageUri;
            float[] cropPoints = getCropPoints();
            int i10 = this.mDegreesRotated;
            Intrinsics.checkNotNullExpressionValue(orgWidth, "orgWidth");
            int intValue = orgWidth.intValue();
            Intrinsics.checkNotNullExpressionValue(orgHeight, "orgHeight");
            int intValue2 = orgHeight.intValue();
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.d(cropOverlayView);
            boolean isFixAspectRatio = cropOverlayView.getIsFixAspectRatio();
            int mAspectRatioX = this.mCropOverlayView.getMAspectRatioX();
            int mAspectRatioY = this.mCropOverlayView.getMAspectRatioY();
            k kVar = k.NONE;
            WeakReference weakReference3 = new WeakReference(new a(context, weakReference2, uri, bitmap, cropPoints, i10, intValue, intValue2, isFixAspectRatio, mAspectRatioX, mAspectRatioY, options != kVar ? reqWidth : 0, options != kVar ? reqHeight : 0, this.mFlipHorizontally, this.mFlipVertically, options, saveCompressFormat, saveCompressQuality, customOutputUri == null ? this.customOutputUri : customOutputUri));
            this.bitmapCroppingWorkerJob = weakReference3;
            Intrinsics.d(weakReference3);
            Object obj = weakReference3.get();
            Intrinsics.d(obj);
            ((a) obj).x();
            o();
        }
    }

    public final void setAutoZoomEnabled(boolean z10) {
        if (this.mAutoZoomEnabled != z10) {
            this.mAutoZoomEnabled = z10;
            h(false, false);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.d(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean centerMoveEnabled) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        if (cropOverlayView.w(centerMoveEnabled)) {
            h(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    public final void setCornerShape(b bVar) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        Intrinsics.d(bVar);
        cropOverlayView.setCropCornerShape(bVar);
    }

    public final void setCropLabelText(String cropLabelText) {
        Intrinsics.checkNotNullParameter(cropLabelText, "cropLabelText");
        this.mCropTextLabel = cropLabelText;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(cropLabelText);
        }
    }

    public final void setCropLabelTextColor(int i10) {
        this.mCropLabelTextColor = i10;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i10);
        }
    }

    public final void setCropLabelTextSize(float f10) {
        this.mCropLabelTextSize = getMCropLabelTextSize();
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f10);
        }
    }

    public final void setCropRect(Rect rect) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final void setCropShape(d dVar) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        Intrinsics.d(dVar);
        cropOverlayView.setCropShape(dVar);
    }

    public final void setCustomOutputUri(Uri uri) {
        this.customOutputUri = uri;
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        cropOverlayView.setFixedAspectRatio(fixAspectRatio);
    }

    public final void setFlippedHorizontally(boolean z10) {
        if (this.mFlipHorizontally != z10) {
            this.mFlipHorizontally = z10;
            b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z10) {
        if (this.mFlipVertically != z10) {
            this.mFlipVertically = z10;
            b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setGuidelines(e eVar) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        Intrinsics.d(eVar);
        cropOverlayView.setGuidelines(eVar);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        m(bitmap, 0, null, 1, 0);
    }

    public final void setImageResource(int i10) {
        if (i10 != 0) {
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.d(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            m(BitmapFactory.decodeResource(getResources(), i10), i10, null, 1, 0);
        }
    }

    public final void setImageUriAsync(Uri uri) {
        F2.b bVar;
        if (uri != null) {
            WeakReference weakReference = this.bitmapLoadingWorkerJob;
            if (weakReference != null) {
                Intrinsics.d(weakReference);
                bVar = (F2.b) weakReference.get();
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.f();
            }
            c();
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.d(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            WeakReference weakReference2 = new WeakReference(new F2.b(context, this, uri));
            this.bitmapLoadingWorkerJob = weakReference2;
            Intrinsics.d(weakReference2);
            Object obj = weakReference2.get();
            Intrinsics.d(obj);
            ((F2.b) obj).i();
            o();
        }
    }

    public final void setMaxZoom(int i10) {
        if (this.mMaxZoom == i10 || i10 <= 0) {
            return;
        }
        this.mMaxZoom = i10;
        h(false, false);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        cropOverlayView.invalidate();
    }

    public final void setMultiTouchEnabled(boolean multiTouchEnabled) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.d(cropOverlayView);
        if (cropOverlayView.y(multiTouchEnabled)) {
            h(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(f listener) {
        this.mOnCropImageCompleteListener = listener;
    }

    public final void setOnCropWindowChangedListener(i listener) {
    }

    public final void setOnSetCropOverlayMovedListener(g listener) {
    }

    public final void setOnSetCropOverlayReleasedListener(h listener) {
    }

    public final void setOnSetImageUriCompleteListener(j listener) {
        this.mOnSetImageUriCompleteListener = listener;
    }

    public final void setRotatedDegrees(int i10) {
        int i11 = this.mDegreesRotated;
        if (i11 != i10) {
            l(i10 - i11);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z10) {
        this.isSaveBitmapToInstanceState = z10;
    }

    public final void setScaleType(l scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (scaleType != this.mScaleType) {
            this.mScaleType = scaleType;
            this.mZoom = 1.0f;
            this.mZoomOffsetY = 0.0f;
            this.mZoomOffsetX = 0.0f;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.u();
            }
            requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z10) {
        if (this.mShowCropLabel != z10) {
            this.mShowCropLabel = z10;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z10);
            }
        }
    }

    public final void setShowCropOverlay(boolean z10) {
        if (this.mShowCropOverlay != z10) {
            this.mShowCropOverlay = z10;
            n();
        }
    }

    public final void setShowProgressBar(boolean z10) {
        if (this.mShowProgressBar != z10) {
            this.mShowProgressBar = z10;
            o();
        }
    }

    public final void setSnapRadius(float snapRadius) {
        if (snapRadius >= 0.0f) {
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.d(cropOverlayView);
            cropOverlayView.setSnapRadius(snapRadius);
        }
    }
}
