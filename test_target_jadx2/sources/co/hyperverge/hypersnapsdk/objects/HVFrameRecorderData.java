package co.hyperverge.hypersnapsdk.objects;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData;", "Ljava/io/Serializable;", "errorEvents", "Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents;", "recorderData", "Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$RecorderData;", "(Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents;Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$RecorderData;)V", "getErrorEvents", "()Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents;", "getRecorderData", "()Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$RecorderData;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "ErrorEvents", "RecorderData", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HVFrameRecorderData implements Serializable {
    private final ErrorEvents errorEvents;
    private final RecorderData recorderData;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u00016B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019¨\u00067"}, d2 = {"Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents;", "Ljava/io/Serializable;", "initFailure", "Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents$ErrorEvent;", "createDirectoriesFailure", "prepareEncoderFailure", "pushFrameFailure", "createVideoFailure", "encoderFailure", BuildConfig.FLAVOR, "renderBitmapFailure", "drainEncoderFailure", "closeRecorderFailure", "(Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents$ErrorEvent;Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents$ErrorEvent;Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents$ErrorEvent;Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents$ErrorEvent;Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents$ErrorEvent;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents$ErrorEvent;)V", "getCloseRecorderFailure", "()Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents$ErrorEvent;", "setCloseRecorderFailure", "(Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents$ErrorEvent;)V", "getCreateDirectoriesFailure", "setCreateDirectoriesFailure", "getCreateVideoFailure", "setCreateVideoFailure", "getDrainEncoderFailure", "()Ljava/util/List;", "setDrainEncoderFailure", "(Ljava/util/List;)V", "getEncoderFailure", "setEncoderFailure", "getInitFailure", "setInitFailure", "getPrepareEncoderFailure", "setPrepareEncoderFailure", "getPushFrameFailure", "setPushFrameFailure", "getRenderBitmapFailure", "setRenderBitmapFailure", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "ErrorEvent", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ErrorEvents implements Serializable {
        private ErrorEvent closeRecorderFailure;
        private ErrorEvent createDirectoriesFailure;
        private ErrorEvent createVideoFailure;
        private List<ErrorEvent> drainEncoderFailure;
        private List<ErrorEvent> encoderFailure;
        private ErrorEvent initFailure;
        private ErrorEvent prepareEncoderFailure;
        private ErrorEvent pushFrameFailure;
        private List<ErrorEvent> renderBitmapFailure;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$ErrorEvents$ErrorEvent;", "Ljava/io/Serializable;", "frameIndex", BuildConfig.FLAVOR, Keys.ERROR_MESSAGE, "timestamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getFrameIndex", "getTimestamp", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ErrorEvent implements Serializable {
            private final String errorMessage;
            private final String frameIndex;
            private final String timestamp;

            public ErrorEvent() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ ErrorEvent copy$default(ErrorEvent errorEvent, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = errorEvent.frameIndex;
                }
                if ((i10 & 2) != 0) {
                    str2 = errorEvent.errorMessage;
                }
                if ((i10 & 4) != 0) {
                    str3 = errorEvent.timestamp;
                }
                return errorEvent.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getFrameIndex() {
                return this.frameIndex;
            }

            /* renamed from: component2, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTimestamp() {
                return this.timestamp;
            }

            public final ErrorEvent copy(String frameIndex, String errorMessage, String timestamp) {
                return new ErrorEvent(frameIndex, errorMessage, timestamp);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ErrorEvent)) {
                    return false;
                }
                ErrorEvent errorEvent = (ErrorEvent) other;
                return Intrinsics.b(this.frameIndex, errorEvent.frameIndex) && Intrinsics.b(this.errorMessage, errorEvent.errorMessage) && Intrinsics.b(this.timestamp, errorEvent.timestamp);
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final String getFrameIndex() {
                return this.frameIndex;
            }

            public final String getTimestamp() {
                return this.timestamp;
            }

            public int hashCode() {
                String str = this.frameIndex;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorMessage;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.timestamp;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "ErrorEvent(frameIndex=" + this.frameIndex + ", errorMessage=" + this.errorMessage + ", timestamp=" + this.timestamp + ')';
            }

            public ErrorEvent(String str, String str2, String str3) {
                this.frameIndex = str;
                this.errorMessage = str2;
                this.timestamp = str3;
            }

            public /* synthetic */ ErrorEvent(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
            }
        }

        public ErrorEvents() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        /* renamed from: component1, reason: from getter */
        public final ErrorEvent getInitFailure() {
            return this.initFailure;
        }

        /* renamed from: component2, reason: from getter */
        public final ErrorEvent getCreateDirectoriesFailure() {
            return this.createDirectoriesFailure;
        }

        /* renamed from: component3, reason: from getter */
        public final ErrorEvent getPrepareEncoderFailure() {
            return this.prepareEncoderFailure;
        }

        /* renamed from: component4, reason: from getter */
        public final ErrorEvent getPushFrameFailure() {
            return this.pushFrameFailure;
        }

        /* renamed from: component5, reason: from getter */
        public final ErrorEvent getCreateVideoFailure() {
            return this.createVideoFailure;
        }

        public final List<ErrorEvent> component6() {
            return this.encoderFailure;
        }

        public final List<ErrorEvent> component7() {
            return this.renderBitmapFailure;
        }

        public final List<ErrorEvent> component8() {
            return this.drainEncoderFailure;
        }

        /* renamed from: component9, reason: from getter */
        public final ErrorEvent getCloseRecorderFailure() {
            return this.closeRecorderFailure;
        }

        public final ErrorEvents copy(ErrorEvent initFailure, ErrorEvent createDirectoriesFailure, ErrorEvent prepareEncoderFailure, ErrorEvent pushFrameFailure, ErrorEvent createVideoFailure, List<ErrorEvent> encoderFailure, List<ErrorEvent> renderBitmapFailure, List<ErrorEvent> drainEncoderFailure, ErrorEvent closeRecorderFailure) {
            Intrinsics.checkNotNullParameter(encoderFailure, "encoderFailure");
            Intrinsics.checkNotNullParameter(renderBitmapFailure, "renderBitmapFailure");
            Intrinsics.checkNotNullParameter(drainEncoderFailure, "drainEncoderFailure");
            return new ErrorEvents(initFailure, createDirectoriesFailure, prepareEncoderFailure, pushFrameFailure, createVideoFailure, encoderFailure, renderBitmapFailure, drainEncoderFailure, closeRecorderFailure);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorEvents)) {
                return false;
            }
            ErrorEvents errorEvents = (ErrorEvents) other;
            return Intrinsics.b(this.initFailure, errorEvents.initFailure) && Intrinsics.b(this.createDirectoriesFailure, errorEvents.createDirectoriesFailure) && Intrinsics.b(this.prepareEncoderFailure, errorEvents.prepareEncoderFailure) && Intrinsics.b(this.pushFrameFailure, errorEvents.pushFrameFailure) && Intrinsics.b(this.createVideoFailure, errorEvents.createVideoFailure) && Intrinsics.b(this.encoderFailure, errorEvents.encoderFailure) && Intrinsics.b(this.renderBitmapFailure, errorEvents.renderBitmapFailure) && Intrinsics.b(this.drainEncoderFailure, errorEvents.drainEncoderFailure) && Intrinsics.b(this.closeRecorderFailure, errorEvents.closeRecorderFailure);
        }

        public final ErrorEvent getCloseRecorderFailure() {
            return this.closeRecorderFailure;
        }

        public final ErrorEvent getCreateDirectoriesFailure() {
            return this.createDirectoriesFailure;
        }

        public final ErrorEvent getCreateVideoFailure() {
            return this.createVideoFailure;
        }

        public final List<ErrorEvent> getDrainEncoderFailure() {
            return this.drainEncoderFailure;
        }

        public final List<ErrorEvent> getEncoderFailure() {
            return this.encoderFailure;
        }

        public final ErrorEvent getInitFailure() {
            return this.initFailure;
        }

        public final ErrorEvent getPrepareEncoderFailure() {
            return this.prepareEncoderFailure;
        }

        public final ErrorEvent getPushFrameFailure() {
            return this.pushFrameFailure;
        }

        public final List<ErrorEvent> getRenderBitmapFailure() {
            return this.renderBitmapFailure;
        }

        public int hashCode() {
            ErrorEvent errorEvent = this.initFailure;
            int hashCode = (errorEvent == null ? 0 : errorEvent.hashCode()) * 31;
            ErrorEvent errorEvent2 = this.createDirectoriesFailure;
            int hashCode2 = (hashCode + (errorEvent2 == null ? 0 : errorEvent2.hashCode())) * 31;
            ErrorEvent errorEvent3 = this.prepareEncoderFailure;
            int hashCode3 = (hashCode2 + (errorEvent3 == null ? 0 : errorEvent3.hashCode())) * 31;
            ErrorEvent errorEvent4 = this.pushFrameFailure;
            int hashCode4 = (hashCode3 + (errorEvent4 == null ? 0 : errorEvent4.hashCode())) * 31;
            ErrorEvent errorEvent5 = this.createVideoFailure;
            int hashCode5 = (((((((hashCode4 + (errorEvent5 == null ? 0 : errorEvent5.hashCode())) * 31) + this.encoderFailure.hashCode()) * 31) + this.renderBitmapFailure.hashCode()) * 31) + this.drainEncoderFailure.hashCode()) * 31;
            ErrorEvent errorEvent6 = this.closeRecorderFailure;
            return hashCode5 + (errorEvent6 != null ? errorEvent6.hashCode() : 0);
        }

        public final void setCloseRecorderFailure(ErrorEvent errorEvent) {
            this.closeRecorderFailure = errorEvent;
        }

        public final void setCreateDirectoriesFailure(ErrorEvent errorEvent) {
            this.createDirectoriesFailure = errorEvent;
        }

        public final void setCreateVideoFailure(ErrorEvent errorEvent) {
            this.createVideoFailure = errorEvent;
        }

        public final void setDrainEncoderFailure(List<ErrorEvent> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.drainEncoderFailure = list;
        }

        public final void setEncoderFailure(List<ErrorEvent> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.encoderFailure = list;
        }

        public final void setInitFailure(ErrorEvent errorEvent) {
            this.initFailure = errorEvent;
        }

        public final void setPrepareEncoderFailure(ErrorEvent errorEvent) {
            this.prepareEncoderFailure = errorEvent;
        }

        public final void setPushFrameFailure(ErrorEvent errorEvent) {
            this.pushFrameFailure = errorEvent;
        }

        public final void setRenderBitmapFailure(List<ErrorEvent> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.renderBitmapFailure = list;
        }

        public String toString() {
            return "ErrorEvents(initFailure=" + this.initFailure + ", createDirectoriesFailure=" + this.createDirectoriesFailure + ", prepareEncoderFailure=" + this.prepareEncoderFailure + ", pushFrameFailure=" + this.pushFrameFailure + ", createVideoFailure=" + this.createVideoFailure + ", encoderFailure=" + this.encoderFailure + ", renderBitmapFailure=" + this.renderBitmapFailure + ", drainEncoderFailure=" + this.drainEncoderFailure + ", closeRecorderFailure=" + this.closeRecorderFailure + ')';
        }

        public ErrorEvents(ErrorEvent errorEvent, ErrorEvent errorEvent2, ErrorEvent errorEvent3, ErrorEvent errorEvent4, ErrorEvent errorEvent5, List<ErrorEvent> encoderFailure, List<ErrorEvent> renderBitmapFailure, List<ErrorEvent> drainEncoderFailure, ErrorEvent errorEvent6) {
            Intrinsics.checkNotNullParameter(encoderFailure, "encoderFailure");
            Intrinsics.checkNotNullParameter(renderBitmapFailure, "renderBitmapFailure");
            Intrinsics.checkNotNullParameter(drainEncoderFailure, "drainEncoderFailure");
            this.initFailure = errorEvent;
            this.createDirectoriesFailure = errorEvent2;
            this.prepareEncoderFailure = errorEvent3;
            this.pushFrameFailure = errorEvent4;
            this.createVideoFailure = errorEvent5;
            this.encoderFailure = encoderFailure;
            this.renderBitmapFailure = renderBitmapFailure;
            this.drainEncoderFailure = drainEncoderFailure;
            this.closeRecorderFailure = errorEvent6;
        }

        public /* synthetic */ ErrorEvents(ErrorEvent errorEvent, ErrorEvent errorEvent2, ErrorEvent errorEvent3, ErrorEvent errorEvent4, ErrorEvent errorEvent5, List list, List list2, List list3, ErrorEvent errorEvent6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : errorEvent, (i10 & 2) != 0 ? null : errorEvent2, (i10 & 4) != 0 ? null : errorEvent3, (i10 & 8) != 0 ? null : errorEvent4, (i10 & 16) != 0 ? null : errorEvent5, (i10 & 32) != 0 ? new ArrayList() : list, (i10 & 64) != 0 ? new ArrayList() : list2, (i10 & 128) != 0 ? new ArrayList() : list3, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? errorEvent6 : null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0086\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\u0005HÖ\u0001J\t\u0010=\u001a\u00020>HÖ\u0001R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018¨\u0006?"}, d2 = {"Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$RecorderData;", "Ljava/io/Serializable;", "timeTakenToRecordMS", BuildConfig.FLAVOR, "originalBitmapWidth", BuildConfig.FLAVOR, "originalBitmapHeight", "imageProxyRotation", "numberOfFramesToRecord", "numberOfFramesRecorded", "videoSizeInBytes", "frameZipSizeInBytes", "videoDuration", AppConstants.VIDEO_RECORDING_ENABLED, BuildConfig.FLAVOR, "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getFrameZipSizeInBytes", "()Ljava/lang/Long;", "setFrameZipSizeInBytes", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getImageProxyRotation", "()Ljava/lang/Integer;", "setImageProxyRotation", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getNumberOfFramesRecorded", "setNumberOfFramesRecorded", "getNumberOfFramesToRecord", "setNumberOfFramesToRecord", "getOriginalBitmapHeight", "setOriginalBitmapHeight", "getOriginalBitmapWidth", "setOriginalBitmapWidth", "getTimeTakenToRecordMS", "setTimeTakenToRecordMS", "getVideoDuration", "setVideoDuration", "getVideoSizeInBytes", "setVideoSizeInBytes", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lco/hyperverge/hypersnapsdk/objects/HVFrameRecorderData$RecorderData;", "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RecorderData implements Serializable {
        private Boolean enabled;
        private Long frameZipSizeInBytes;
        private Integer imageProxyRotation;
        private Integer numberOfFramesRecorded;
        private Integer numberOfFramesToRecord;
        private Integer originalBitmapHeight;
        private Integer originalBitmapWidth;
        private Long timeTakenToRecordMS;
        private Long videoDuration;
        private Long videoSizeInBytes;

        public RecorderData() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getTimeTakenToRecordMS() {
            return this.timeTakenToRecordMS;
        }

        /* renamed from: component10, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getOriginalBitmapWidth() {
            return this.originalBitmapWidth;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getOriginalBitmapHeight() {
            return this.originalBitmapHeight;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getImageProxyRotation() {
            return this.imageProxyRotation;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getNumberOfFramesToRecord() {
            return this.numberOfFramesToRecord;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getNumberOfFramesRecorded() {
            return this.numberOfFramesRecorded;
        }

        /* renamed from: component7, reason: from getter */
        public final Long getVideoSizeInBytes() {
            return this.videoSizeInBytes;
        }

        /* renamed from: component8, reason: from getter */
        public final Long getFrameZipSizeInBytes() {
            return this.frameZipSizeInBytes;
        }

        /* renamed from: component9, reason: from getter */
        public final Long getVideoDuration() {
            return this.videoDuration;
        }

        public final RecorderData copy(Long timeTakenToRecordMS, Integer originalBitmapWidth, Integer originalBitmapHeight, Integer imageProxyRotation, Integer numberOfFramesToRecord, Integer numberOfFramesRecorded, Long videoSizeInBytes, Long frameZipSizeInBytes, Long videoDuration, Boolean enabled) {
            return new RecorderData(timeTakenToRecordMS, originalBitmapWidth, originalBitmapHeight, imageProxyRotation, numberOfFramesToRecord, numberOfFramesRecorded, videoSizeInBytes, frameZipSizeInBytes, videoDuration, enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecorderData)) {
                return false;
            }
            RecorderData recorderData = (RecorderData) other;
            return Intrinsics.b(this.timeTakenToRecordMS, recorderData.timeTakenToRecordMS) && Intrinsics.b(this.originalBitmapWidth, recorderData.originalBitmapWidth) && Intrinsics.b(this.originalBitmapHeight, recorderData.originalBitmapHeight) && Intrinsics.b(this.imageProxyRotation, recorderData.imageProxyRotation) && Intrinsics.b(this.numberOfFramesToRecord, recorderData.numberOfFramesToRecord) && Intrinsics.b(this.numberOfFramesRecorded, recorderData.numberOfFramesRecorded) && Intrinsics.b(this.videoSizeInBytes, recorderData.videoSizeInBytes) && Intrinsics.b(this.frameZipSizeInBytes, recorderData.frameZipSizeInBytes) && Intrinsics.b(this.videoDuration, recorderData.videoDuration) && Intrinsics.b(this.enabled, recorderData.enabled);
        }

        public final Boolean getEnabled() {
            return this.enabled;
        }

        public final Long getFrameZipSizeInBytes() {
            return this.frameZipSizeInBytes;
        }

        public final Integer getImageProxyRotation() {
            return this.imageProxyRotation;
        }

        public final Integer getNumberOfFramesRecorded() {
            return this.numberOfFramesRecorded;
        }

        public final Integer getNumberOfFramesToRecord() {
            return this.numberOfFramesToRecord;
        }

        public final Integer getOriginalBitmapHeight() {
            return this.originalBitmapHeight;
        }

        public final Integer getOriginalBitmapWidth() {
            return this.originalBitmapWidth;
        }

        public final Long getTimeTakenToRecordMS() {
            return this.timeTakenToRecordMS;
        }

        public final Long getVideoDuration() {
            return this.videoDuration;
        }

        public final Long getVideoSizeInBytes() {
            return this.videoSizeInBytes;
        }

        public int hashCode() {
            Long l10 = this.timeTakenToRecordMS;
            int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
            Integer num = this.originalBitmapWidth;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.originalBitmapHeight;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.imageProxyRotation;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.numberOfFramesToRecord;
            int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.numberOfFramesRecorded;
            int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Long l11 = this.videoSizeInBytes;
            int hashCode7 = (hashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.frameZipSizeInBytes;
            int hashCode8 = (hashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.videoDuration;
            int hashCode9 = (hashCode8 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Boolean bool = this.enabled;
            return hashCode9 + (bool != null ? bool.hashCode() : 0);
        }

        public final void setEnabled(Boolean bool) {
            this.enabled = bool;
        }

        public final void setFrameZipSizeInBytes(Long l10) {
            this.frameZipSizeInBytes = l10;
        }

        public final void setImageProxyRotation(Integer num) {
            this.imageProxyRotation = num;
        }

        public final void setNumberOfFramesRecorded(Integer num) {
            this.numberOfFramesRecorded = num;
        }

        public final void setNumberOfFramesToRecord(Integer num) {
            this.numberOfFramesToRecord = num;
        }

        public final void setOriginalBitmapHeight(Integer num) {
            this.originalBitmapHeight = num;
        }

        public final void setOriginalBitmapWidth(Integer num) {
            this.originalBitmapWidth = num;
        }

        public final void setTimeTakenToRecordMS(Long l10) {
            this.timeTakenToRecordMS = l10;
        }

        public final void setVideoDuration(Long l10) {
            this.videoDuration = l10;
        }

        public final void setVideoSizeInBytes(Long l10) {
            this.videoSizeInBytes = l10;
        }

        public String toString() {
            return "RecorderData(timeTakenToRecordMS=" + this.timeTakenToRecordMS + ", originalBitmapWidth=" + this.originalBitmapWidth + ", originalBitmapHeight=" + this.originalBitmapHeight + ", imageProxyRotation=" + this.imageProxyRotation + ", numberOfFramesToRecord=" + this.numberOfFramesToRecord + ", numberOfFramesRecorded=" + this.numberOfFramesRecorded + ", videoSizeInBytes=" + this.videoSizeInBytes + ", frameZipSizeInBytes=" + this.frameZipSizeInBytes + ", videoDuration=" + this.videoDuration + ", enabled=" + this.enabled + ')';
        }

        public RecorderData(Long l10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l11, Long l12, Long l13, Boolean bool) {
            this.timeTakenToRecordMS = l10;
            this.originalBitmapWidth = num;
            this.originalBitmapHeight = num2;
            this.imageProxyRotation = num3;
            this.numberOfFramesToRecord = num4;
            this.numberOfFramesRecorded = num5;
            this.videoSizeInBytes = l11;
            this.frameZipSizeInBytes = l12;
            this.videoDuration = l13;
            this.enabled = bool;
        }

        public /* synthetic */ RecorderData(Long l10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l11, Long l12, Long l13, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : num3, (i10 & 16) != 0 ? null : num4, (i10 & 32) != 0 ? null : num5, (i10 & 64) != 0 ? null : l11, (i10 & 128) != 0 ? null : l12, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : l13, (i10 & 512) == 0 ? bool : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HVFrameRecorderData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HVFrameRecorderData copy$default(HVFrameRecorderData hVFrameRecorderData, ErrorEvents errorEvents, RecorderData recorderData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            errorEvents = hVFrameRecorderData.errorEvents;
        }
        if ((i10 & 2) != 0) {
            recorderData = hVFrameRecorderData.recorderData;
        }
        return hVFrameRecorderData.copy(errorEvents, recorderData);
    }

    /* renamed from: component1, reason: from getter */
    public final ErrorEvents getErrorEvents() {
        return this.errorEvents;
    }

    /* renamed from: component2, reason: from getter */
    public final RecorderData getRecorderData() {
        return this.recorderData;
    }

    public final HVFrameRecorderData copy(ErrorEvents errorEvents, RecorderData recorderData) {
        Intrinsics.checkNotNullParameter(errorEvents, "errorEvents");
        Intrinsics.checkNotNullParameter(recorderData, "recorderData");
        return new HVFrameRecorderData(errorEvents, recorderData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HVFrameRecorderData)) {
            return false;
        }
        HVFrameRecorderData hVFrameRecorderData = (HVFrameRecorderData) other;
        return Intrinsics.b(this.errorEvents, hVFrameRecorderData.errorEvents) && Intrinsics.b(this.recorderData, hVFrameRecorderData.recorderData);
    }

    public final ErrorEvents getErrorEvents() {
        return this.errorEvents;
    }

    public final RecorderData getRecorderData() {
        return this.recorderData;
    }

    public int hashCode() {
        return (this.errorEvents.hashCode() * 31) + this.recorderData.hashCode();
    }

    public String toString() {
        return "HVFrameRecorderData(errorEvents=" + this.errorEvents + ", recorderData=" + this.recorderData + ')';
    }

    public HVFrameRecorderData(ErrorEvents errorEvents, RecorderData recorderData) {
        Intrinsics.checkNotNullParameter(errorEvents, "errorEvents");
        Intrinsics.checkNotNullParameter(recorderData, "recorderData");
        this.errorEvents = errorEvents;
        this.recorderData = recorderData;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HVFrameRecorderData(ErrorEvents errorEvents, RecorderData recorderData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0, r1);
        ErrorEvents errorEvents2;
        RecorderData recorderData2;
        if ((i10 & 1) != 0) {
            errorEvents2 = new ErrorEvents(null, null, null, null, null, null, null, null, null, 511, null);
        } else {
            errorEvents2 = errorEvents;
        }
        if ((i10 & 2) != 0) {
            recorderData2 = new RecorderData(null, null, null, null, null, null, null, null, null, null, 1023, null);
        } else {
            recorderData2 = recorderData;
        }
    }
}
