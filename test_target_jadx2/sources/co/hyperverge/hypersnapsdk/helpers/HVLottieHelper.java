package co.hyperverge.hypersnapsdk.helpers;

import O1.B;
import U1.e;
import android.animation.Animator;
import android.graphics.Color;
import android.text.TextUtils;
import c2.C1719b;
import co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import co.hyperverge.hypersnapsdk.utils.UIUtils;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes.dex */
public class HVLottieHelper {
    public static final String DOC_FAILURE = "doc_failure.lottie";
    public static final String DOC_INSTRUCTION = "hv_doc_instruction_front.lottie";
    public static final String DOC_INSTRUCTION_BACK = "hv_doc_instruction_back.lottie";
    public static final String DOC_INSTRUCTION_FRONT = "hv_doc_instruction_front.lottie";
    public static final String DOC_PROCESSING = "doc_processing.lottie";
    public static final String DOC_SUCCESS = "doc_success.lottie";
    public static final String END_STATE_FAILURE = "end_state_failure.lottie";
    public static final String END_STATE_PROCESSING = "end_state_processing.lottie";
    public static final String END_STATE_SUCCESS = "end_state_success.lottie";
    public static final String FACE_FAILURE = "face_failure.lottie";
    public static final String FACE_INSTRUCTION = "hv_face_instruction.lottie";
    public static final String FACE_PROCESSING = "face_processing.lottie";
    public static final String FACE_SUCCESS = "face_success.lottie";
    public static final String LOADER_LOTTIE = "hv_processing.lottie";
    public static final String NFC_LOTTIE = "hv_nfc.lottie";
    public static final String QR_INSTRUCTION = "hv_qr_instruction.lottie";
    private static final String TAG = "co.hyperverge.hypersnapsdk.helpers.HVLottieHelper";
    public static final String UPLOAD_FAILURE = "upload_failure.lottie";

    public interface Listener {
        void onEnd();
    }

    public enum State {
        START(1.5f, 0.0f, -1),
        TRANSITION(2.0f, 0.0f, 0),
        END(2.0f, 0.5f, 0);

        final float progress;
        final int repeatCount;
        final float speed;

        State(float f10, float f11, int i10) {
            this.speed = f10;
            this.progress = f11;
            this.repeatCount = i10;
        }

        @Override // java.lang.Enum
        public String toString() {
            return name() + " {speed=" + this.speed + ", progress=" + this.progress + ", repeatCount=" + this.repeatCount + '}';
        }
    }

    private static boolean isValidAnimUrl(String str) {
        return !TextUtils.isEmpty(str) && StringUtils.isURL(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setAnimation$0(int i10, C1719b c1719b) {
        return Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setAnimation$1(int i10, C1719b c1719b) {
        return Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setAnimation$2(int i10, C1719b c1719b) {
        return Integer.valueOf(UIUtils.alphaOf(i10));
    }

    public static void load(final LottieAnimationView lottieAnimationView, String str, State state, final Listener listener) {
        lottieAnimationView.setApplyingOpacityToLayersEnabled(true);
        lottieAnimationView.invalidate();
        lottieAnimationView.setImageAssetsFolder("images");
        loadAnimations(str, lottieAnimationView);
        lottieAnimationView.setSpeed(state.speed);
        lottieAnimationView.setRepeatCount(state.repeatCount);
        float f10 = state.progress;
        if (f10 != 0.0f) {
            lottieAnimationView.J(f10, 1.0f);
        }
        lottieAnimationView.invalidate();
        if (listener != null) {
            lottieAnimationView.i(new Animator.AnimatorListener() { // from class: co.hyperverge.hypersnapsdk.helpers.HVLottieHelper.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    LottieAnimationView.this.A(this);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    LottieAnimationView.this.A(this);
                    listener.onEnd();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
        if (lottieAnimationView.t()) {
            return;
        }
        lottieAnimationView.y();
    }

    private static void loadAnimations(String str, LottieAnimationView lottieAnimationView) {
        if (str != null) {
            String documentInstructionLottie = HyperSnapUIConfigUtil.getInstance().getDocumentInstructionLottie();
            if (str.equalsIgnoreCase("hv_doc_instruction_front.lottie")) {
                String docInstructionFrontSideAnimation = HyperSnapUIConfigUtil.getInstance().getDocInstructionFrontSideAnimation();
                if (StringUtils.isEmptyOrNull(docInstructionFrontSideAnimation)) {
                    docInstructionFrontSideAnimation = documentInstructionLottie;
                }
                setAnimation(docInstructionFrontSideAnimation, lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(DOC_INSTRUCTION_BACK)) {
                String documentInstructionBackSideAnimation = HyperSnapUIConfigUtil.getInstance().getDocumentInstructionBackSideAnimation();
                if (!StringUtils.isEmptyOrNull(documentInstructionBackSideAnimation)) {
                    documentInstructionLottie = documentInstructionBackSideAnimation;
                }
                setAnimation(documentInstructionLottie, lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(DOC_PROCESSING)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getDocProcessingAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(DOC_SUCCESS)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getDocumentSuccessAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(DOC_FAILURE)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getDocumentFailureAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(FACE_INSTRUCTION)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getFaceInstructionAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(FACE_PROCESSING)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getFaceProcessingAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(FACE_SUCCESS)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getFaceSuccessAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(FACE_FAILURE)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getFaceFailureAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(END_STATE_PROCESSING)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getEndStateProcessingAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(END_STATE_SUCCESS)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getEndStateSuccessAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(END_STATE_FAILURE)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getEndStateFailureAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(UPLOAD_FAILURE)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getUploadFailureAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(QR_INSTRUCTION)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getQrInstructionAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(LOADER_LOTTIE)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getLoaderAnimation(), lottieAnimationView, str);
            }
            if (str.equalsIgnoreCase(NFC_LOTTIE)) {
                setAnimation(HyperSnapUIConfigUtil.getInstance().getNfcAnimation(), lottieAnimationView, str);
            }
        }
    }

    public static void reset(LottieAnimationView lottieAnimationView) {
        lottieAnimationView.invalidate();
        lottieAnimationView.z();
    }

    private static void setAnimation(String str, LottieAnimationView lottieAnimationView, String str2) {
        if (isValidAnimUrl(str)) {
            lottieAnimationView.setAnimationFromUrl(str);
        } else {
            lottieAnimationView.setAnimation(str2);
        }
        String animationPrimaryColor = HyperSnapUIConfigUtil.getInstance().getConfig().getColors().getAnimationPrimaryColor();
        if (HyperSnapUIConfigUtil.getInstance().isValidHexColor(animationPrimaryColor)) {
            final int parseColor = Color.parseColor(animationPrimaryColor);
            lottieAnimationView.l(new e("**", "hvLottiePrimaryColor"), B.f6869a, new c2.e() { // from class: co.hyperverge.hypersnapsdk.helpers.a
                @Override // c2.e
                public final Object a(C1719b c1719b) {
                    Integer lambda$setAnimation$0;
                    lambda$setAnimation$0 = HVLottieHelper.lambda$setAnimation$0(parseColor, c1719b);
                    return lambda$setAnimation$0;
                }
            });
            lottieAnimationView.l(new e("**", "hvLottiePrimaryColor"), B.f6870b, new c2.e() { // from class: co.hyperverge.hypersnapsdk.helpers.b
                @Override // c2.e
                public final Object a(C1719b c1719b) {
                    Integer lambda$setAnimation$1;
                    lambda$setAnimation$1 = HVLottieHelper.lambda$setAnimation$1(parseColor, c1719b);
                    return lambda$setAnimation$1;
                }
            });
            if (UIUtils.hasAlpha(parseColor)) {
                lottieAnimationView.l(new e("**", "hvLottiePrimaryColor"), B.f6872d, new c2.e() { // from class: co.hyperverge.hypersnapsdk.helpers.c
                    @Override // c2.e
                    public final Object a(C1719b c1719b) {
                        Integer lambda$setAnimation$2;
                        lambda$setAnimation$2 = HVLottieHelper.lambda$setAnimation$2(parseColor, c1719b);
                        return lambda$setAnimation$2;
                    }
                });
            }
        }
    }
}
