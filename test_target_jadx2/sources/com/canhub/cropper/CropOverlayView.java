package com.canhub.cropper;

import F2.l;
import F2.o;
import F2.p;
import G2.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.canhub.cropper.CropImageView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 Ï\u00012\u00020\u0001:\u0003j(+B\u001f\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ7\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\nJ\u001f\u0010&\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020'H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\b¢\u0006\u0004\b1\u0010\nJ'\u00107\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\b¢\u0006\u0004\b9\u0010\nJ\u0015\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\b2\u0006\u0010B\u001a\u00020'¢\u0006\u0004\bC\u0010,J\u0017\u0010F\u001a\u00020\b2\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020\b2\u0006\u0010H\u001a\u00020\u0017¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u000204¢\u0006\u0004\bL\u0010MJ\u0015\u0010P\u001a\u00020\b2\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QJ\u0015\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020'¢\u0006\u0004\bS\u0010,J\u0015\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u0017¢\u0006\u0004\bU\u0010JJ\u0015\u0010W\u001a\u00020\b2\u0006\u0010V\u001a\u00020\u0017¢\u0006\u0004\bW\u0010JJ\u0015\u0010\"\u001a\u00020'2\u0006\u0010X\u001a\u00020'¢\u0006\u0004\b\"\u0010YJ\u0015\u0010[\u001a\u00020'2\u0006\u0010Z\u001a\u00020'¢\u0006\u0004\b[\u0010YJ-\u0010!\u001a\u00020\b2\u0006\u0010\\\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\u00172\u0006\u0010^\u001a\u00020\u00172\u0006\u0010_\u001a\u00020\u0017¢\u0006\u0004\b!\u0010`J\u0015\u0010c\u001a\u00020\b2\u0006\u0010b\u001a\u00020a¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\be\u0010\u0012J\u0017\u0010h\u001a\u00020'2\u0006\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bh\u0010iR\u0016\u0010l\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010n\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010mR\u0018\u0010p\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010oR\u0018\u0010s\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010rR\u0016\u0010u\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010tR\u0016\u0010v\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010tR\u0014\u0010y\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010xR\u0018\u0010{\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010zR\u0014\u0010}\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010|R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u007fR\u0019\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u007fR\u0019\u0010\u0082\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u007fR\u0019\u0010\u0083\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u007fR\u0019\u0010\u0084\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u007fR\u0017\u0010\u0087\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0086\u0001R\u0017\u0010\u008a\u0001\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u008c\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010|R\u0018\u0010\u008e\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u008d\u0001R\u0017\u0010\u0090\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010kR\u0017\u0010\u0091\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010kR\u0017\u0010\u0092\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010kR\u0017\u0010\u0093\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010kR\u0017\u0010\u0094\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010kR\u001b\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u0096\u0001R)\u0010\u009b\u0001\u001a\u00020'2\u0007\u0010\u0098\u0001\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0099\u0001\u0010t\u001a\u0006\b\u0088\u0001\u0010\u009a\u0001R\u0019\u0010\u009d\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u008d\u0001R\u0019\u0010\u009f\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u008d\u0001R\u0018\u0010¡\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010kR-\u0010O\u001a\u0004\u0018\u00010N2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010N8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R-\u0010;\u001a\u0004\u0018\u00010:2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010:8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R-\u0010\u00ad\u0001\u001a\u0004\u0018\u00010>2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010>8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bk\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010¯\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010tR\u0019\u0010²\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0018\u0010³\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010kR\u0019\u0010µ\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010\u008d\u0001R\u0018\u0010¹\u0001\u001a\u00030¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0018\u0010»\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010tR\u001a\u0010½\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u0010mR\u0017\u0010¾\u0001\u001a\u00020'8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u009a\u0001R(\u0010Â\u0001\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0005\bÁ\u0001\u0010\u000eR)\u0010Ã\u0001\u001a\u0002042\u0007\u0010Ã\u0001\u001a\u0002048F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0005\bÆ\u0001\u0010MR)\u0010Ç\u0001\u001a\u0002042\u0007\u0010Ç\u0001\u001a\u0002048F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÈ\u0001\u0010Å\u0001\"\u0005\bÉ\u0001\u0010MR/\u0010Î\u0001\u001a\u0005\u0018\u00010¶\u00012\t\u0010\f\u001a\u0005\u0018\u00010¶\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001¨\u0006Ð\u0001"}, d2 = {"Lcom/canhub/cropper/CropOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", BuildConfig.FLAVOR, "o", "()V", "Landroid/graphics/RectF;", "rect", "m", "(Landroid/graphics/RectF;)V", "Landroid/graphics/Canvas;", "canvas", "j", "(Landroid/graphics/Canvas;)V", "d", "k", "e", "i", BuildConfig.FLAVOR, "cornerOffset", "cornerExtension", "g", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FF)V", "l", HVRetakeActivity.RADIUS_TAG, "h", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FFF)V", "f", "x", "y", "r", "(FF)V", "t", "s", BuildConfig.FLAVOR, "b", "(Landroid/graphics/RectF;)Z", "inProgress", "c", "(Z)V", "Lcom/canhub/cropper/CropOverlayView$b;", "listener", "setCropWindowChangeListener", "(Lcom/canhub/cropper/CropOverlayView$b;)V", "n", BuildConfig.FLAVOR, "boundsPoints", BuildConfig.FLAVOR, "viewWidth", "viewHeight", "v", "([FII)V", "u", "Lcom/canhub/cropper/CropImageView$d;", "cropShape", "setCropShape", "(Lcom/canhub/cropper/CropImageView$d;)V", "Lcom/canhub/cropper/CropImageView$b;", "cropCornerShape", "setCropCornerShape", "(Lcom/canhub/cropper/CropImageView$b;)V", "isEnabled", "setCropperTextLabelVisibility", BuildConfig.FLAVOR, "textLabel", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "setCropLabelTextSize", "(F)V", "textColor", "setCropLabelTextColor", "(I)V", "Lcom/canhub/cropper/CropImageView$e;", "guidelines", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$e;)V", "fixAspectRatio", "setFixedAspectRatio", "snapRadius", "setSnapRadius", "cornerRadius", "setCropCornerRadius", "multiTouchEnabled", "(Z)Z", "centerMoveEnabled", "w", "maxWidth", "maxHeight", "scaleFactorWidth", "scaleFactorHeight", "(FFFF)V", "LF2/l;", "options", "setInitialAttributeValues", "(LF2/l;)V", "onDraw", "Landroid/view/MotionEvent;", Keys.EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", C4870a.f43493a, "F", "mCropCornerRadius", "Ljava/lang/Integer;", "mCircleCornerFillColor", "LF2/l;", "mOptions", "Landroid/view/ScaleGestureDetector;", "Landroid/view/ScaleGestureDetector;", "mScaleDetector", "Z", "mMultiTouchEnabled", "mCenterMoveEnabled", "LF2/o;", "LF2/o;", "mCropWindowHandler", "Lcom/canhub/cropper/CropOverlayView$b;", "mCropWindowChangeListener", "Landroid/graphics/RectF;", "mDrawRect", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mBorderPaint", "mBorderCornerPaint", "mGuidelinePaint", "mBackgroundPaint", "textLabelPaint", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "mPath", "p", "[F", "mBoundsPoints", "q", "mCalcBounds", "I", "mViewWidth", "mViewHeight", "mBorderCornerOffset", "mBorderCornerLength", "mInitialCropWindowPaddingRatio", "mTouchRadius", "mSnapRadius", "LF2/p;", "LF2/p;", "mMoveHandler", "<set-?>", "z", "()Z", "isFixAspectRatio", "A", "mAspectRatioX", "B", "mAspectRatioY", "C", "mTargetAspectRatio", "D", "Lcom/canhub/cropper/CropImageView$e;", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$e;", "E", "Lcom/canhub/cropper/CropImageView$d;", "getCropShape", "()Lcom/canhub/cropper/CropImageView$d;", "Lcom/canhub/cropper/CropImageView$b;", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$b;", "cornerShape", "G", "isCropLabelEnabled", "H", "Ljava/lang/String;", "cropLabelText", "cropLabelTextSize", "J", "cropLabelTextColor", "Landroid/graphics/Rect;", "K", "Landroid/graphics/Rect;", "mInitialCropWindowRect", "h0", "initializedCropWindow", "i0", "mOriginalLayerType", "isNonStraightAngleRotated", "getCropWindowRect", "()Landroid/graphics/RectF;", "setCropWindowRect", "cropWindowRect", "aspectRatioX", "getAspectRatioX", "()I", "setAspectRatioX", "aspectRatioY", "getAspectRatioY", "setAspectRatioY", "getInitialCropWindowRect", "()Landroid/graphics/Rect;", "setInitialCropWindowRect", "(Landroid/graphics/Rect;)V", "initialCropWindowRect", "j0", "cropper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CropOverlayView extends View {

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private int mAspectRatioX;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int mAspectRatioY;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private float mTargetAspectRatio;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private CropImageView.e guidelines;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private CropImageView.d cropShape;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private CropImageView.b cornerShape;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean isCropLabelEnabled;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private String cropLabelText;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private float cropLabelTextSize;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private int cropLabelTextColor;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Rect mInitialCropWindowRect;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float mCropCornerRadius;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer mCircleCornerFillColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private l mOptions;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ScaleGestureDetector mScaleDetector;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean mMultiTouchEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean mCenterMoveEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final o mCropWindowHandler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private b mCropWindowChangeListener;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private boolean initializedCropWindow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final RectF mDrawRect;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private Integer mOriginalLayerType;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Paint mBorderPaint;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Paint mBorderCornerPaint;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Paint mGuidelinePaint;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Paint mBackgroundPaint;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Paint textLabelPaint;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Path mPath;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final float[] mBoundsPoints;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final RectF mCalcBounds;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int mViewWidth;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int mViewHeight;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float mBorderCornerOffset;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float mBorderCornerLength;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float mInitialCropWindowPaddingRatio;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float mTouchRadius;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float mSnapRadius;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private p mMoveHandler;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean isFixAspectRatio;

    /* renamed from: com.canhub.cropper.CropOverlayView$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Paint e(int i10) {
            Paint paint = new Paint();
            paint.setColor(i10);
            return paint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Paint f(float f10, int i10) {
            if (f10 <= 0.0f) {
                return null;
            }
            Paint paint = new Paint();
            paint.setColor(i10);
            paint.setStrokeWidth(f10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Paint g(int i10) {
            Paint paint = new Paint();
            paint.setColor(i10);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            return paint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Paint h(l lVar) {
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setTextSize(lVar.f2301B0);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(lVar.f2303C0);
            return paint;
        }

        private Companion() {
        }
    }

    public interface b {
        void a(boolean z10);
    }

    private final class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            RectF i10 = CropOverlayView.this.mCropWindowHandler.i();
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            float f10 = 2;
            float currentSpanY = detector.getCurrentSpanY() / f10;
            float currentSpanX = detector.getCurrentSpanX() / f10;
            float f11 = focusY - currentSpanY;
            float f12 = focusX - currentSpanX;
            float f13 = focusX + currentSpanX;
            float f14 = focusY + currentSpanY;
            if (f12 >= f13 || f11 > f14 || f12 < 0.0f || f13 > CropOverlayView.this.mCropWindowHandler.d() || f11 < 0.0f || f14 > CropOverlayView.this.mCropWindowHandler.c()) {
                return true;
            }
            i10.set(f12, f11, f13, f14);
            CropOverlayView.this.mCropWindowHandler.u(i10);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20517a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f20518b;

        static {
            int[] iArr = new int[CropImageView.d.values().length];
            iArr[CropImageView.d.RECTANGLE.ordinal()] = 1;
            iArr[CropImageView.d.RECTANGLE_VERTICAL_ONLY.ordinal()] = 2;
            iArr[CropImageView.d.RECTANGLE_HORIZONTAL_ONLY.ordinal()] = 3;
            iArr[CropImageView.d.OVAL.ordinal()] = 4;
            f20517a = iArr;
            int[] iArr2 = new int[CropImageView.b.values().length];
            iArr2[CropImageView.b.OVAL.ordinal()] = 1;
            iArr2[CropImageView.b.RECTANGLE.ordinal()] = 2;
            f20518b = iArr2;
        }
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCenterMoveEnabled = true;
        this.mCropWindowHandler = new o();
        this.mDrawRect = new RectF();
        this.mPath = new Path();
        this.mBoundsPoints = new float[8];
        this.mCalcBounds = new RectF();
        this.mTargetAspectRatio = this.mAspectRatioX / this.mAspectRatioY;
        this.cropLabelText = BuildConfig.FLAVOR;
        this.cropLabelTextSize = 20.0f;
        this.cropLabelTextColor = -1;
        this.mInitialCropWindowRect = new Rect();
    }

    private final boolean b(RectF rect) {
        float f10;
        float f11;
        F2.c cVar = F2.c.f2261a;
        float B10 = cVar.B(this.mBoundsPoints);
        float D10 = cVar.D(this.mBoundsPoints);
        float C10 = cVar.C(this.mBoundsPoints);
        float w10 = cVar.w(this.mBoundsPoints);
        if (!q()) {
            this.mCalcBounds.set(B10, D10, C10, w10);
            return false;
        }
        float[] fArr = this.mBoundsPoints;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        if (f17 < f13) {
            float f18 = fArr[3];
            if (f13 < f18) {
                float f19 = fArr[2];
                f13 = f15;
                f11 = f16;
                f15 = f18;
                f10 = f17;
                f14 = f19;
                f12 = f14;
            } else {
                f12 = fArr[2];
                f11 = f14;
                f14 = f12;
                f15 = f13;
                f13 = f18;
                f10 = f15;
            }
        } else {
            f10 = fArr[3];
            if (f13 > f10) {
                f11 = fArr[2];
                f14 = f16;
                f15 = f17;
            } else {
                f11 = f12;
                f10 = f13;
                f12 = f16;
                f13 = f17;
            }
        }
        float f20 = (f13 - f10) / (f12 - f11);
        float f21 = (-1.0f) / f20;
        float f22 = f10 - (f20 * f11);
        float f23 = f10 - (f11 * f21);
        float f24 = f15 - (f20 * f14);
        float f25 = f15 - (f14 * f21);
        float centerY = rect.centerY() - rect.top;
        float centerX = rect.centerX();
        float f26 = rect.left;
        float f27 = centerY / (centerX - f26);
        float f28 = -f27;
        float f29 = rect.top;
        float f30 = f29 - (f26 * f27);
        float f31 = rect.right;
        float f32 = f29 - (f28 * f31);
        float f33 = f20 - f27;
        float f34 = (f30 - f22) / f33;
        float max = Math.max(B10, f34 < f31 ? f34 : B10);
        float f35 = (f30 - f23) / (f21 - f27);
        if (f35 >= rect.right) {
            f35 = max;
        }
        float max2 = Math.max(max, f35);
        float f36 = f21 - f28;
        float f37 = (f32 - f25) / f36;
        if (f37 >= rect.right) {
            f37 = max2;
        }
        float max3 = Math.max(max2, f37);
        float f38 = (f32 - f23) / f36;
        if (f38 <= rect.left) {
            f38 = C10;
        }
        float min = Math.min(C10, f38);
        float f39 = (f32 - f24) / (f20 - f28);
        if (f39 <= rect.left) {
            f39 = min;
        }
        float min2 = Math.min(min, f39);
        float f40 = (f30 - f24) / f33;
        if (f40 <= rect.left) {
            f40 = min2;
        }
        float min3 = Math.min(min2, f40);
        float max4 = Math.max(D10, Math.max((f20 * max3) + f22, (f21 * min3) + f23));
        float min4 = Math.min(w10, Math.min((f21 * max3) + f25, (f20 * min3) + f24));
        RectF rectF = this.mCalcBounds;
        rectF.left = max3;
        rectF.top = max4;
        rectF.right = min3;
        rectF.bottom = min4;
        return true;
    }

    private final void c(boolean inProgress) {
        try {
            b bVar = this.mCropWindowChangeListener;
            if (bVar != null) {
                bVar.a(inProgress);
            }
        } catch (Exception e10) {
            Log.e("AIC", "Exception in crop window changed", e10);
        }
    }

    private final void d(Canvas canvas) {
        RectF i10 = this.mCropWindowHandler.i();
        F2.c cVar = F2.c.f2261a;
        float max = Math.max(cVar.B(this.mBoundsPoints), 0.0f);
        float max2 = Math.max(cVar.D(this.mBoundsPoints), 0.0f);
        float min = Math.min(cVar.C(this.mBoundsPoints), getWidth());
        float min2 = Math.min(cVar.w(this.mBoundsPoints), getHeight());
        CropImageView.d dVar = this.cropShape;
        int i11 = dVar == null ? -1 : d.f20517a[dVar.ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            this.mPath.reset();
            a aVar = a.f2841a;
            if (aVar.a()) {
                this.mDrawRect.set(i10.left, i10.top, i10.right, i10.bottom);
            } else {
                float f10 = 2;
                this.mDrawRect.set(i10.left + f10, i10.top + f10, i10.right - f10, i10.bottom - f10);
            }
            this.mPath.addOval(this.mDrawRect, Path.Direction.CW);
            canvas.save();
            if (aVar.b()) {
                canvas.clipOutPath(this.mPath);
            } else {
                canvas.clipPath(this.mPath, Region.Op.XOR);
            }
            Paint paint = this.mBackgroundPaint;
            Intrinsics.d(paint);
            canvas.drawRect(max, max2, min, min2, paint);
            canvas.restore();
            return;
        }
        if (q()) {
            a aVar2 = a.f2841a;
            if (aVar2.a()) {
                this.mPath.reset();
                Path path = this.mPath;
                float[] fArr = this.mBoundsPoints;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.mPath;
                float[] fArr2 = this.mBoundsPoints;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.mPath;
                float[] fArr3 = this.mBoundsPoints;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.mPath;
                float[] fArr4 = this.mBoundsPoints;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.mPath.close();
                canvas.save();
                if (aVar2.b()) {
                    canvas.clipOutPath(this.mPath);
                } else {
                    canvas.clipPath(this.mPath, Region.Op.INTERSECT);
                }
                canvas.clipRect(i10, Region.Op.XOR);
                Paint paint2 = this.mBackgroundPaint;
                Intrinsics.d(paint2);
                canvas.drawRect(max, max2, min, min2, paint2);
                canvas.restore();
                return;
            }
        }
        float f11 = i10.top;
        Paint paint3 = this.mBackgroundPaint;
        Intrinsics.d(paint3);
        canvas.drawRect(max, max2, min, f11, paint3);
        float f12 = i10.bottom;
        Paint paint4 = this.mBackgroundPaint;
        Intrinsics.d(paint4);
        canvas.drawRect(max, f12, min, min2, paint4);
        float f13 = i10.top;
        float f14 = i10.left;
        float f15 = i10.bottom;
        Paint paint5 = this.mBackgroundPaint;
        Intrinsics.d(paint5);
        canvas.drawRect(max, f13, f14, f15, paint5);
        float f16 = i10.right;
        float f17 = i10.top;
        float f18 = i10.bottom;
        Paint paint6 = this.mBackgroundPaint;
        Intrinsics.d(paint6);
        canvas.drawRect(f16, f17, min, f18, paint6);
    }

    private final void e(Canvas canvas) {
        Paint paint = this.mBorderPaint;
        if (paint != null) {
            Intrinsics.d(paint);
            float strokeWidth = paint.getStrokeWidth();
            RectF i10 = this.mCropWindowHandler.i();
            float f10 = strokeWidth / 2;
            i10.inset(f10, f10);
            CropImageView.d dVar = this.cropShape;
            int i11 = dVar == null ? -1 : d.f20517a[dVar.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                Paint paint2 = this.mBorderPaint;
                Intrinsics.d(paint2);
                canvas.drawRect(i10, paint2);
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("Unrecognized crop shape");
                }
                Paint paint3 = this.mBorderPaint;
                Intrinsics.d(paint3);
                canvas.drawOval(i10, paint3);
            }
        }
    }

    private final void f(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension, float radius) {
        float f10 = rect.left - cornerExtension;
        float f11 = rect.top - cornerExtension;
        Paint paint = this.mBorderCornerPaint;
        Intrinsics.d(paint);
        canvas.drawCircle(f10, f11, radius, paint);
        float f12 = rect.right + cornerExtension;
        float f13 = rect.top - cornerExtension;
        Paint paint2 = this.mBorderCornerPaint;
        Intrinsics.d(paint2);
        canvas.drawCircle(f12, f13, radius, paint2);
        float f14 = rect.left - cornerExtension;
        float f15 = rect.bottom + cornerExtension;
        Paint paint3 = this.mBorderCornerPaint;
        Intrinsics.d(paint3);
        canvas.drawCircle(f14, f15, radius, paint3);
        float f16 = rect.right + cornerExtension;
        float f17 = rect.bottom + cornerExtension;
        Paint paint4 = this.mBorderCornerPaint;
        Intrinsics.d(paint4);
        canvas.drawCircle(f16, f17, radius, paint4);
    }

    private final void g(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension) {
        CropImageView.d dVar = this.cropShape;
        int i10 = dVar == null ? -1 : d.f20517a[dVar.ordinal()];
        if (i10 == 1) {
            h(canvas, rect, cornerOffset, cornerExtension, this.mCropCornerRadius);
            return;
        }
        if (i10 == 2) {
            float centerX = rect.centerX() - this.mBorderCornerLength;
            float f10 = rect.top - cornerOffset;
            float centerX2 = rect.centerX() + this.mBorderCornerLength;
            float f11 = rect.top - cornerOffset;
            Paint paint = this.mBorderCornerPaint;
            Intrinsics.d(paint);
            canvas.drawLine(centerX, f10, centerX2, f11, paint);
            float centerX3 = rect.centerX() - this.mBorderCornerLength;
            float f12 = rect.bottom + cornerOffset;
            float centerX4 = rect.centerX() + this.mBorderCornerLength;
            float f13 = rect.bottom + cornerOffset;
            Paint paint2 = this.mBorderCornerPaint;
            Intrinsics.d(paint2);
            canvas.drawLine(centerX3, f12, centerX4, f13, paint2);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            l(canvas, rect, cornerOffset, cornerExtension);
            return;
        }
        float f14 = rect.left - cornerOffset;
        float centerY = rect.centerY() - this.mBorderCornerLength;
        float f15 = rect.left - cornerOffset;
        float centerY2 = rect.centerY() + this.mBorderCornerLength;
        Paint paint3 = this.mBorderCornerPaint;
        Intrinsics.d(paint3);
        canvas.drawLine(f14, centerY, f15, centerY2, paint3);
        float f16 = rect.right + cornerOffset;
        float centerY3 = rect.centerY() - this.mBorderCornerLength;
        float f17 = rect.right + cornerOffset;
        float centerY4 = rect.centerY() + this.mBorderCornerLength;
        Paint paint4 = this.mBorderCornerPaint;
        Intrinsics.d(paint4);
        canvas.drawLine(f16, centerY3, f17, centerY4, paint4);
    }

    private final void h(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension, float radius) {
        CropImageView.b bVar = this.cornerShape;
        int i10 = bVar == null ? -1 : d.f20518b[bVar.ordinal()];
        if (i10 == 1) {
            f(canvas, rect, cornerOffset, cornerExtension, radius);
        } else {
            if (i10 != 2) {
                return;
            }
            l(canvas, rect, cornerOffset, cornerExtension);
        }
    }

    private final void i(Canvas canvas) {
        float f10;
        if (this.mBorderCornerPaint != null) {
            Paint paint = this.mBorderPaint;
            if (paint != null) {
                Intrinsics.d(paint);
                f10 = paint.getStrokeWidth();
            } else {
                f10 = 0.0f;
            }
            Paint paint2 = this.mBorderCornerPaint;
            Intrinsics.d(paint2);
            float strokeWidth = paint2.getStrokeWidth();
            float f11 = 2;
            float f12 = (strokeWidth - f10) / f11;
            float f13 = strokeWidth / f11;
            float f14 = f13 + f12;
            CropImageView.d dVar = this.cropShape;
            int i10 = dVar == null ? -1 : d.f20517a[dVar.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                f13 += this.mBorderCornerOffset;
            } else if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            RectF i11 = this.mCropWindowHandler.i();
            i11.inset(f13, f13);
            g(canvas, i11, f12, f14);
            if (this.cornerShape == CropImageView.b.OVAL) {
                Integer num = this.mCircleCornerFillColor;
                this.mBorderCornerPaint = num != null ? INSTANCE.g(num.intValue()) : null;
                g(canvas, i11, f12, f14);
            }
        }
    }

    private final void j(Canvas canvas) {
        if (this.isCropLabelEnabled) {
            RectF i10 = this.mCropWindowHandler.i();
            float f10 = (i10.left + i10.right) / 2;
            float f11 = i10.top - 50;
            Paint paint = this.textLabelPaint;
            if (paint != null) {
                paint.setTextSize(this.cropLabelTextSize);
                paint.setColor(this.cropLabelTextColor);
            }
            String str = this.cropLabelText;
            Paint paint2 = this.textLabelPaint;
            Intrinsics.d(paint2);
            canvas.drawText(str, f10, f11, paint2);
            canvas.save();
        }
    }

    private final void k(Canvas canvas) {
        float f10;
        if (this.mGuidelinePaint != null) {
            Paint paint = this.mBorderPaint;
            if (paint != null) {
                Intrinsics.d(paint);
                f10 = paint.getStrokeWidth();
            } else {
                f10 = 0.0f;
            }
            RectF i10 = this.mCropWindowHandler.i();
            i10.inset(f10, f10);
            float f11 = 3;
            float width = i10.width() / f11;
            float height = i10.height() / f11;
            CropImageView.d dVar = this.cropShape;
            int i11 = dVar == null ? -1 : d.f20517a[dVar.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                float f12 = i10.left + width;
                float f13 = i10.right - width;
                float f14 = i10.top;
                float f15 = i10.bottom;
                Paint paint2 = this.mGuidelinePaint;
                Intrinsics.d(paint2);
                canvas.drawLine(f12, f14, f12, f15, paint2);
                float f16 = i10.top;
                float f17 = i10.bottom;
                Paint paint3 = this.mGuidelinePaint;
                Intrinsics.d(paint3);
                canvas.drawLine(f13, f16, f13, f17, paint3);
                float f18 = i10.top + height;
                float f19 = i10.bottom - height;
                float f20 = i10.left;
                float f21 = i10.right;
                Paint paint4 = this.mGuidelinePaint;
                Intrinsics.d(paint4);
                canvas.drawLine(f20, f18, f21, f18, paint4);
                float f22 = i10.left;
                float f23 = i10.right;
                Paint paint5 = this.mGuidelinePaint;
                Intrinsics.d(paint5);
                canvas.drawLine(f22, f19, f23, f19, paint5);
                return;
            }
            if (i11 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            float f24 = 2;
            float width2 = (i10.width() / f24) - f10;
            float height2 = (i10.height() / f24) - f10;
            float f25 = i10.left + width;
            float f26 = i10.right - width;
            float sin = (float) (height2 * Math.sin(Math.acos((width2 - width) / width2)));
            float f27 = (i10.top + height2) - sin;
            float f28 = (i10.bottom - height2) + sin;
            Paint paint6 = this.mGuidelinePaint;
            Intrinsics.d(paint6);
            canvas.drawLine(f25, f27, f25, f28, paint6);
            float f29 = (i10.top + height2) - sin;
            float f30 = (i10.bottom - height2) + sin;
            Paint paint7 = this.mGuidelinePaint;
            Intrinsics.d(paint7);
            canvas.drawLine(f26, f29, f26, f30, paint7);
            float f31 = i10.top + height;
            float f32 = i10.bottom - height;
            float cos = (float) (width2 * Math.cos(Math.asin((height2 - height) / height2)));
            float f33 = (i10.left + width2) - cos;
            float f34 = (i10.right - width2) + cos;
            Paint paint8 = this.mGuidelinePaint;
            Intrinsics.d(paint8);
            canvas.drawLine(f33, f31, f34, f31, paint8);
            float f35 = (i10.left + width2) - cos;
            float f36 = (i10.right - width2) + cos;
            Paint paint9 = this.mGuidelinePaint;
            Intrinsics.d(paint9);
            canvas.drawLine(f35, f32, f36, f32, paint9);
        }
    }

    private final void l(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension) {
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = f11 + this.mBorderCornerLength;
        Paint paint = this.mBorderCornerPaint;
        Intrinsics.d(paint);
        canvas.drawLine(f10 - cornerOffset, f11 - cornerExtension, f10 - cornerOffset, f12, paint);
        float f13 = rect.left;
        float f14 = rect.top;
        Paint paint2 = this.mBorderCornerPaint;
        Intrinsics.d(paint2);
        canvas.drawLine(f13 - cornerExtension, f14 - cornerOffset, this.mBorderCornerLength + f13, f14 - cornerOffset, paint2);
        float f15 = rect.right;
        float f16 = rect.top;
        float f17 = f16 + this.mBorderCornerLength;
        Paint paint3 = this.mBorderCornerPaint;
        Intrinsics.d(paint3);
        canvas.drawLine(f15 + cornerOffset, f16 - cornerExtension, f15 + cornerOffset, f17, paint3);
        float f18 = rect.right;
        float f19 = rect.top;
        Paint paint4 = this.mBorderCornerPaint;
        Intrinsics.d(paint4);
        canvas.drawLine(f18 + cornerExtension, f19 - cornerOffset, f18 - this.mBorderCornerLength, f19 - cornerOffset, paint4);
        float f20 = rect.left;
        float f21 = rect.bottom;
        float f22 = f21 - this.mBorderCornerLength;
        Paint paint5 = this.mBorderCornerPaint;
        Intrinsics.d(paint5);
        canvas.drawLine(f20 - cornerOffset, f21 + cornerExtension, f20 - cornerOffset, f22, paint5);
        float f23 = rect.left;
        float f24 = rect.bottom;
        Paint paint6 = this.mBorderCornerPaint;
        Intrinsics.d(paint6);
        canvas.drawLine(f23 - cornerExtension, f24 + cornerOffset, this.mBorderCornerLength + f23, f24 + cornerOffset, paint6);
        float f25 = rect.right;
        float f26 = rect.bottom;
        float f27 = f26 - this.mBorderCornerLength;
        Paint paint7 = this.mBorderCornerPaint;
        Intrinsics.d(paint7);
        canvas.drawLine(f25 + cornerOffset, f26 + cornerExtension, f25 + cornerOffset, f27, paint7);
        float f28 = rect.right;
        float f29 = rect.bottom;
        Paint paint8 = this.mBorderCornerPaint;
        Intrinsics.d(paint8);
        canvas.drawLine(f28 + cornerExtension, f29 + cornerOffset, f28 - this.mBorderCornerLength, f29 + cornerOffset, paint8);
    }

    private final void m(RectF rect) {
        if (rect.width() < this.mCropWindowHandler.f()) {
            float f10 = (this.mCropWindowHandler.f() - rect.width()) / 2;
            rect.left -= f10;
            rect.right += f10;
        }
        if (rect.height() < this.mCropWindowHandler.e()) {
            float e10 = (this.mCropWindowHandler.e() - rect.height()) / 2;
            rect.top -= e10;
            rect.bottom += e10;
        }
        if (rect.width() > this.mCropWindowHandler.d()) {
            float width = (rect.width() - this.mCropWindowHandler.d()) / 2;
            rect.left += width;
            rect.right -= width;
        }
        if (rect.height() > this.mCropWindowHandler.c()) {
            float height = (rect.height() - this.mCropWindowHandler.c()) / 2;
            rect.top += height;
            rect.bottom -= height;
        }
        b(rect);
        if (this.mCalcBounds.width() > 0.0f && this.mCalcBounds.height() > 0.0f) {
            float max = Math.max(this.mCalcBounds.left, 0.0f);
            float max2 = Math.max(this.mCalcBounds.top, 0.0f);
            float min = Math.min(this.mCalcBounds.right, getWidth());
            float min2 = Math.min(this.mCalcBounds.bottom, getHeight());
            if (rect.left < max) {
                rect.left = max;
            }
            if (rect.top < max2) {
                rect.top = max2;
            }
            if (rect.right > min) {
                rect.right = min;
            }
            if (rect.bottom > min2) {
                rect.bottom = min2;
            }
        }
        if (!this.isFixAspectRatio || Math.abs(rect.width() - (rect.height() * this.mTargetAspectRatio)) <= 0.1d) {
            return;
        }
        if (rect.width() > rect.height() * this.mTargetAspectRatio) {
            float abs = Math.abs((rect.height() * this.mTargetAspectRatio) - rect.width()) / 2;
            rect.left += abs;
            rect.right -= abs;
        } else {
            float abs2 = Math.abs((rect.width() / this.mTargetAspectRatio) - rect.height()) / 2;
            rect.top += abs2;
            rect.bottom -= abs2;
        }
    }

    private final void o() {
        F2.c cVar = F2.c.f2261a;
        float max = Math.max(cVar.B(this.mBoundsPoints), 0.0f);
        float max2 = Math.max(cVar.D(this.mBoundsPoints), 0.0f);
        float min = Math.min(cVar.C(this.mBoundsPoints), getWidth());
        float min2 = Math.min(cVar.w(this.mBoundsPoints), getHeight());
        if (min <= max || min2 <= max2) {
            return;
        }
        RectF rectF = new RectF();
        this.initializedCropWindow = true;
        float f10 = this.mInitialCropWindowPaddingRatio;
        float f11 = min - max;
        float f12 = f10 * f11;
        float f13 = min2 - max2;
        float f14 = f10 * f13;
        if (this.mInitialCropWindowRect.width() > 0 && this.mInitialCropWindowRect.height() > 0) {
            rectF.left = (this.mInitialCropWindowRect.left / this.mCropWindowHandler.n()) + max;
            rectF.top = (this.mInitialCropWindowRect.top / this.mCropWindowHandler.m()) + max2;
            rectF.right = rectF.left + (this.mInitialCropWindowRect.width() / this.mCropWindowHandler.n());
            rectF.bottom = rectF.top + (this.mInitialCropWindowRect.height() / this.mCropWindowHandler.m());
            rectF.left = Math.max(max, rectF.left);
            rectF.top = Math.max(max2, rectF.top);
            rectF.right = Math.min(min, rectF.right);
            rectF.bottom = Math.min(min2, rectF.bottom);
        } else if (!this.isFixAspectRatio || min <= max || min2 <= max2) {
            rectF.left = max + f12;
            rectF.top = max2 + f14;
            rectF.right = min - f12;
            rectF.bottom = min2 - f14;
        } else if (f11 / f13 > this.mTargetAspectRatio) {
            rectF.top = max2 + f14;
            rectF.bottom = min2 - f14;
            float width = getWidth() / 2.0f;
            this.mTargetAspectRatio = this.mAspectRatioX / this.mAspectRatioY;
            float max3 = Math.max(this.mCropWindowHandler.f(), rectF.height() * this.mTargetAspectRatio) / 2.0f;
            rectF.left = width - max3;
            rectF.right = width + max3;
        } else {
            rectF.left = max + f12;
            rectF.right = min - f12;
            float height = getHeight() / 2.0f;
            float max4 = Math.max(this.mCropWindowHandler.e(), rectF.width() / this.mTargetAspectRatio) / 2.0f;
            rectF.top = height - max4;
            rectF.bottom = height + max4;
        }
        m(rectF);
        this.mCropWindowHandler.u(rectF);
    }

    private final boolean q() {
        float[] fArr = this.mBoundsPoints;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    private final void r(float x10, float y10) {
        o oVar = this.mCropWindowHandler;
        float f10 = this.mTouchRadius;
        CropImageView.d dVar = this.cropShape;
        Intrinsics.d(dVar);
        p g10 = oVar.g(x10, y10, f10, dVar, this.mCenterMoveEnabled);
        this.mMoveHandler = g10;
        if (g10 != null) {
            invalidate();
        }
    }

    private final void s(float x10, float y10) {
        if (this.mMoveHandler != null) {
            float f10 = this.mSnapRadius;
            RectF i10 = this.mCropWindowHandler.i();
            if (b(i10)) {
                f10 = 0.0f;
            }
            p pVar = this.mMoveHandler;
            Intrinsics.d(pVar);
            pVar.l(i10, x10, y10, this.mCalcBounds, this.mViewWidth, this.mViewHeight, f10, this.isFixAspectRatio, this.mTargetAspectRatio);
            this.mCropWindowHandler.u(i10);
            c(true);
            invalidate();
        }
    }

    private final void t() {
        if (this.mMoveHandler != null) {
            this.mMoveHandler = null;
            c(false);
            invalidate();
        }
    }

    /* renamed from: getAspectRatioX, reason: from getter */
    public final int getMAspectRatioX() {
        return this.mAspectRatioX;
    }

    /* renamed from: getAspectRatioY, reason: from getter */
    public final int getMAspectRatioY() {
        return this.mAspectRatioY;
    }

    public final CropImageView.b getCornerShape() {
        return this.cornerShape;
    }

    public final CropImageView.d getCropShape() {
        return this.cropShape;
    }

    public final RectF getCropWindowRect() {
        return this.mCropWindowHandler.i();
    }

    public final CropImageView.e getGuidelines() {
        return this.guidelines;
    }

    /* renamed from: getInitialCropWindowRect, reason: from getter */
    public final Rect getMInitialCropWindowRect() {
        return this.mInitialCropWindowRect;
    }

    public final void n() {
        RectF cropWindowRect = getCropWindowRect();
        m(cropWindowRect);
        this.mCropWindowHandler.u(cropWindowRect);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        d(canvas);
        if (this.mCropWindowHandler.v()) {
            CropImageView.e eVar = this.guidelines;
            if (eVar == CropImageView.e.ON) {
                k(canvas);
            } else if (eVar == CropImageView.e.ON_TOUCH && this.mMoveHandler != null) {
                k(canvas);
            }
        }
        Companion companion = INSTANCE;
        l lVar = this.mOptions;
        this.mBorderCornerPaint = companion.f(lVar != null ? lVar.f2355x : 0.0f, lVar != null ? lVar.f2298A : -1);
        j(canvas);
        e(canvas);
        i(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        ScaleGestureDetector scaleGestureDetector;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled()) {
            return false;
        }
        if (this.mMultiTouchEnabled && (scaleGestureDetector = this.mScaleDetector) != null) {
            scaleGestureDetector.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    s(event.getX(), event.getY());
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (action != 3) {
                    return false;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            t();
        } else {
            r(event.getX(), event.getY());
        }
        return true;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsFixAspectRatio() {
        return this.isFixAspectRatio;
    }

    public final void setAspectRatioX(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.mAspectRatioX != i10) {
            this.mAspectRatioX = i10;
            this.mTargetAspectRatio = i10 / this.mAspectRatioY;
            if (this.initializedCropWindow) {
                o();
                invalidate();
            }
        }
    }

    public final void setAspectRatioY(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.mAspectRatioY != i10) {
            this.mAspectRatioY = i10;
            this.mTargetAspectRatio = this.mAspectRatioX / i10;
            if (this.initializedCropWindow) {
                o();
                invalidate();
            }
        }
    }

    public final void setCropCornerRadius(float cornerRadius) {
        this.mCropCornerRadius = cornerRadius;
    }

    public final void setCropCornerShape(CropImageView.b cropCornerShape) {
        Intrinsics.checkNotNullParameter(cropCornerShape, "cropCornerShape");
        if (this.cornerShape != cropCornerShape) {
            this.cornerShape = cropCornerShape;
            invalidate();
        }
    }

    public final void setCropLabelText(String textLabel) {
        if (textLabel != null) {
            this.cropLabelText = textLabel;
        }
    }

    public final void setCropLabelTextColor(int textColor) {
        this.cropLabelTextColor = textColor;
        invalidate();
    }

    public final void setCropLabelTextSize(float textSize) {
        this.cropLabelTextSize = textSize;
        invalidate();
    }

    public final void setCropShape(CropImageView.d cropShape) {
        Intrinsics.checkNotNullParameter(cropShape, "cropShape");
        if (this.cropShape != cropShape) {
            this.cropShape = cropShape;
            if (!a.f2841a.a()) {
                if (this.cropShape == CropImageView.d.OVAL) {
                    Integer valueOf = Integer.valueOf(getLayerType());
                    this.mOriginalLayerType = valueOf;
                    if (valueOf.intValue() != 1) {
                        setLayerType(1, null);
                    } else {
                        this.mOriginalLayerType = null;
                    }
                } else {
                    Integer num = this.mOriginalLayerType;
                    if (num != null) {
                        Intrinsics.d(num);
                        setLayerType(num.intValue(), null);
                        this.mOriginalLayerType = null;
                    }
                }
            }
            invalidate();
        }
    }

    public final void setCropWindowChangeListener(b listener) {
        this.mCropWindowChangeListener = listener;
    }

    public final void setCropWindowRect(RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.mCropWindowHandler.u(rect);
    }

    public final void setCropperTextLabelVisibility(boolean isEnabled) {
        this.isCropLabelEnabled = isEnabled;
        invalidate();
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        if (this.isFixAspectRatio != fixAspectRatio) {
            this.isFixAspectRatio = fixAspectRatio;
            if (this.initializedCropWindow) {
                o();
                invalidate();
            }
        }
    }

    public final void setGuidelines(CropImageView.e guidelines) {
        Intrinsics.checkNotNullParameter(guidelines, "guidelines");
        if (this.guidelines != guidelines) {
            this.guidelines = guidelines;
            if (this.initializedCropWindow) {
                invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(l options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.mOptions = options;
        this.mCropWindowHandler.t(options);
        setCropLabelTextColor(options.f2303C0);
        setCropLabelTextSize(options.f2301B0);
        setCropLabelText(options.f2305D0);
        setCropperTextLabelVisibility(options.f2329k);
        setCropCornerRadius(options.f2320e);
        setCropCornerShape(options.f2319d);
        setCropShape(options.f2318c);
        setSnapRadius(options.f2321f);
        setGuidelines(options.f2323h);
        setFixedAspectRatio(options.f2345s);
        setAspectRatioX(options.f2347t);
        setAspectRatioY(options.f2349u);
        y(options.f2337o);
        w(options.f2339p);
        this.mTouchRadius = options.f2322g;
        this.mInitialCropWindowPaddingRatio = options.f2343r;
        Companion companion = INSTANCE;
        this.mBorderPaint = companion.f(options.f2351v, options.f2353w);
        this.mBorderCornerOffset = options.f2357y;
        this.mBorderCornerLength = options.f2359z;
        this.mCircleCornerFillColor = Integer.valueOf(options.f2300B);
        this.mBorderCornerPaint = companion.f(options.f2355x, options.f2298A);
        this.mGuidelinePaint = companion.f(options.f2302C, options.f2304D);
        this.mBackgroundPaint = companion.e(options.f2306E);
        this.textLabelPaint = companion.h(options);
    }

    public final void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.mInitialCropWindowRect;
        if (rect == null) {
            rect = F2.c.f2261a.p();
        }
        rect2.set(rect);
        if (this.initializedCropWindow) {
            o();
            invalidate();
            c(false);
        }
    }

    public final void setSnapRadius(float snapRadius) {
        this.mSnapRadius = snapRadius;
    }

    public final void u() {
        if (this.initializedCropWindow) {
            setCropWindowRect(F2.c.f2261a.q());
            o();
            invalidate();
        }
    }

    public final void v(float[] boundsPoints, int viewWidth, int viewHeight) {
        if (boundsPoints == null || !Arrays.equals(this.mBoundsPoints, boundsPoints)) {
            if (boundsPoints == null) {
                Arrays.fill(this.mBoundsPoints, 0.0f);
            } else {
                System.arraycopy(boundsPoints, 0, this.mBoundsPoints, 0, boundsPoints.length);
            }
            this.mViewWidth = viewWidth;
            this.mViewHeight = viewHeight;
            RectF i10 = this.mCropWindowHandler.i();
            if (i10.width() == 0.0f || i10.height() == 0.0f) {
                o();
            }
        }
    }

    public final boolean w(boolean centerMoveEnabled) {
        if (this.mCenterMoveEnabled == centerMoveEnabled) {
            return false;
        }
        this.mCenterMoveEnabled = centerMoveEnabled;
        return true;
    }

    public final void x(float maxWidth, float maxHeight, float scaleFactorWidth, float scaleFactorHeight) {
        this.mCropWindowHandler.s(maxWidth, maxHeight, scaleFactorWidth, scaleFactorHeight);
    }

    public final boolean y(boolean multiTouchEnabled) {
        if (this.mMultiTouchEnabled == multiTouchEnabled) {
            return false;
        }
        this.mMultiTouchEnabled = multiTouchEnabled;
        if (!multiTouchEnabled || this.mScaleDetector != null) {
            return true;
        }
        this.mScaleDetector = new ScaleGestureDetector(getContext(), new c());
        return true;
    }
}
